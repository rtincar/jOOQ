/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import static org.jooq.conf.StatementType.PREPARED_STATEMENT;
import static org.jooq.impl.Util.getStatementType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.jooq.Configuration;
import org.jooq.ConfigurationRegistry;
import org.jooq.Param;
import org.jooq.Query;
import org.jooq.exception.DetachedException;
import org.jooq.tools.JooqLogger;
import org.jooq.tools.StopWatch;

/**
 * @author Lukas Eder
 */
abstract class AbstractQuery extends AbstractQueryPart implements Query {

    private static final long       serialVersionUID = -8046199737354507547L;
    private static final JooqLogger log              = JooqLogger.getLogger(AbstractQuery.class);

    AbstractQuery(Configuration configuration) {
        super(configuration);
    }

    /**
     * Subclasses may override this for covariant result types
     * <p>
     * {@inheritDoc}
     */
    @Override
    public Query bind(String param, Object value) {
        try {
            int index = Integer.valueOf(param);
            return bind(index, value);
        }
        catch (NumberFormatException e) {
            Param<?> p = getParam(param);

            if (p == null) {
                throw new IllegalArgumentException("No such parameter : " + param);
            }

            p.setConverted(value);
            return this;
        }
    }

    /**
     * Subclasses may override this for covariant result types
     * <p>
     * {@inheritDoc}
     */
    @Override
    public Query bind(int index, Object value) {
        Param<?>[] array = getParams().values().toArray(new Param[0]);

        if (index < 1 || index > array.length) {
            throw new IllegalArgumentException("Index out of range for Query parameters : " + index);
        }

        array[index - 1].setConverted(value);
        return this;
    }

    @Override
    public final int execute() {
        if (isExecutable()) {
            StopWatch watch = new StopWatch();

            // Let listeners provide a configuration to this query
            Configuration configuration = ConfigurationRegistry.provideFor(getConfiguration());
            if (configuration == null) {
                configuration = getConfiguration();
            }

            Connection connection = configuration.getConnection();
            if (connection == null) {
                throw new DetachedException("Cannot execute query. No Connection configured");
            }

            // Ensure that all depending Attachables are attached
            attach(configuration);
            watch.splitTrace("Parts attached");

            PreparedStatement statement = null;
            String sql = null;
            int result = 0;
            try {
                sql = getSQL();
                watch.splitTrace("SQL rendered");

                // [#1145] Depending on the configuration, a prepared statement
                // or an "ad-hoc" statement is used
                boolean usePreparedStatement =
                    getStatementType(getConfiguration().getSettings()) == PREPARED_STATEMENT;

                if (log.isDebugEnabled())
                    log.debug("Executing query", getSQL(true));
                if (log.isTraceEnabled() && usePreparedStatement)
                    log.trace("Preparing statement", sql);

                statement = prepare(configuration, sql);

                // [#1145] Bind variables only for true prepared statements
                if (usePreparedStatement) {
                    watch.splitTrace("Statement prepared");

                    create(configuration).bind(this, statement);
                    watch.splitTrace("Variables bound");
                }

                result = execute(configuration, statement);
                watch.splitTrace("Statement executed");

                return result;
            }
            catch (SQLException e) {
                throw Util.translate("AbstractQuery.execute", sql, e);
            }
            finally {
                if (!keepStatementOpen()) {
                    Util.safeClose(statement);
                }

                watch.splitDebug("Statement executed");
            }
        }
        else {
            if (log.isDebugEnabled()) {
                log.debug("Query is not executable", this);
            }

            return 0;
        }
    }

    /**
     * Default implementation to indicate whether this query should close the
     * statement after execution. Subclasses may override this method.
     */
    protected boolean keepStatementOpen() {
        return false;
    }

    /**
     * Default implementation for preparing a statement. Subclasses may override
     * this method.
     *
     * @param configuration The configuration holding a connection
     * @param sql The generated SQL
     * @return The prepared statement
     */
    protected PreparedStatement prepare(Configuration configuration, String sql) throws SQLException {
        return configuration.getConnection().prepareStatement(sql);
    }

    /**
     * Default implementation for query execution using a prepared statement.
     * Subclasses may override this method.
     *
     * @param configuration The configuration that is used for this query's
     *            execution.
     * @param statement The statement to be executed.
     */
    protected int execute(Configuration configuration, PreparedStatement statement) throws SQLException {
        return statement.executeUpdate();
    }

    /**
     * Default implementation for executable check. Subclasses may override this
     * method.
     */
    protected boolean isExecutable() {
        return true;
    }
}
