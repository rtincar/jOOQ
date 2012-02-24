/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
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

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.jooq.Configuration;
import org.jooq.Delete;
import org.jooq.ExecuteContext;
import org.jooq.ExecuteType;
import org.jooq.Insert;
import org.jooq.Merge;
import org.jooq.Query;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.ResultQuery;
import org.jooq.Routine;
import org.jooq.Truncate;
import org.jooq.Update;

/**
 * A default iplementation for the {@link ExecuteContext}
 *
 * @author Lukas Eder
 */
class DefaultExecuteContext extends AbstractConfiguration implements ExecuteContext {

    /**
     * Generated UID
     */
    private static final long           serialVersionUID = -6653474082935089963L;

    // Persistent attributes
    private final Query                 query;
    private final Routine<?>            routine;
    private String                      sql;

    private final Query[]               batchQueries;
    private final String[]              batchSQL;

    // Transient attributes
    private transient PreparedStatement statement;
    private transient ResultSet         resultSet;
    private transient Record            record;
    private transient Result<?>         result;

    DefaultExecuteContext(Configuration configuration) {
        this(configuration, null, null, null);
    }

    DefaultExecuteContext(Configuration configuration, Query[] batchQueries) {
        this(configuration, null, batchQueries, null);
    }

    DefaultExecuteContext(Configuration configuration, Query query) {
        this(configuration, query, new Query[] { query }, null);
    }

    DefaultExecuteContext(Configuration configuration, Routine<?> routine) {
        this(configuration, null, null, routine);
    }

    private DefaultExecuteContext(Configuration configuration, Query query, Query[] batchQueries, Routine<?> routine) {
        super(configuration);

        this.query = query;
        this.batchQueries = batchQueries;
        this.routine = routine;

        if (batchQueries != null) {
            this.batchSQL = new String[batchQueries.length];
        }
        else if (routine != null) {
            this.batchSQL = new String[1];
        }
        else {
            this.batchSQL = new String[0];
        }
    }

    @Override
    public final ExecuteType type() {
        if (routine != null) {
            return ExecuteType.ROUTINE;
        }
        else if (query != null) {
            if (query instanceof ResultQuery) {
                return ExecuteType.READ;
            }
            else if (query instanceof Insert
                || query instanceof Update
                || query instanceof Delete
                || query instanceof Merge) {

                return ExecuteType.WRITE;
            }
            else if (query instanceof Truncate) {
                return ExecuteType.DDL;
            }
        }

        return ExecuteType.OTHER;
    }

    @Override
    public final Query query() {
        return query;
    }

    @Override
    public final Query[] batchQueries() {
        return batchQueries;
    }

    @Override
    public final Routine<?> routine() {
        return routine;
    }

    @Override
    public final void sql(String s) {
        this.sql = s;
    }

    @Override
    public final String sql() {
        return sql;
    }

    @Override
    public final String[] batchSQL() {
        return batchSQL;
    }

    @Override
    public final void statement(PreparedStatement s) {
        this.statement = s;
    }

    @Override
    public final PreparedStatement statement() {
        return statement;
    }

    @Override
    public final void resultSet(ResultSet rs) {
        this.resultSet = rs;
    }

    @Override
    public final ResultSet resultSet() {
        return resultSet;
    }

    @Override
    public final Configuration configuration() {
        return configuration;
    }

    @Override
    public final void record(Record r) {
        this.record = r;
    }

    @Override
    public final Record record() {
        return record;
    }

    @Override
    public final void result(Result<?> r) {
        this.result = r;
    }

    @Override
    public final Result<?> result() {
        return result;
    }
}
