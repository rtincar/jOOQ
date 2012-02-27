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
package org.jooq;

import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.INGRES;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.ORACLE;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.SQLITE;
import static org.jooq.SQLDialect.SQLSERVER;
import static org.jooq.SQLDialect.SYBASE;

/**
 * This type is used for the {@link Select}'s DSL API when selecting specific
 * {@link Record} types.
 * <p>
 * Example: <code><pre>
 * create.selectFrom(T_AUTHOR)
 *       .where(TBook.LANGUAGE.equal("DE"))
 *       .and(TBook.PUBLISHED.greaterThan(parseDate('2008-01-01')))
 *       .orderBy(TAuthor.LAST_NAME.asc().nullsFirst())
 *       .limit(2)
 *       .offset(1)
 *       .forUpdate()
 *       .of(TAuthor.FIRST_NAME, TAuthor.LAST_NAME)
 *       .noWait();
 * </pre></code> Refer to the manual for more details
 *
 * @param <R> The record type being returned by this query
 * @author Lukas Eder
 */
public interface SimpleSelectLimitStep<R extends Record> extends SimpleSelectForUpdateStep<R> {

    /**
     * Add a <code>LIMIT</code> clause to the query
     * <p>
     * If there is no <code>LIMIT</code> or <code>TOP</code> clause in your
     * RDBMS, this may be simulated with a <code>ROW_NUMBER()</code> window function
     * and nested <code>SELECT</code> statements.
     * <p>
     * This is the same as calling {@link #limit(int, int)} with offset = 0, or
     * calling <code>.limit(numberOfRows).offset(0)</code>
     */
    @Support
    SimpleSelectOffsetStep<R> limit(int numberOfRows);

    /**
     * Add a <code>LIMIT</code> clause to the query using named parameters
     * <p>
     * Note that some dialects do not support bind values at all in
     * <code>LIMIT</code> or <code>TOP</code> clauses!
     * <p>
     * If there is no <code>LIMIT</code> or <code>TOP</code> clause in your
     * RDBMS, or the <code>LIMIT</code> or <code>TOP</code> clause does not
     * support bind values, this may be simulated with a <code>ROW_NUMBER()</code>
     * window function and nested <code>SELECT</code> statements.
     * <p>
     * This is the same as calling {@link #limit(int, int)} with offset = 0, or
     * calling <code>.limit(numberOfRows).offset(0)</code>
     */
    @Support({ DB2, DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    SimpleSelectOffsetStep<R> limit(Param<Integer> numberOfRows);

    /**
     * Add a <code>LIMIT</code> clause to the query
     * <p>
     * Note that some dialects do not support bind values at all in
     * <code>LIMIT</code> or <code>TOP</code> clauses!
     * <p>
     * If there is no <code>LIMIT</code> or <code>TOP</code> clause in your
     * RDBMS, or if your RDBMS does not natively support offsets, this is
     * simulated with a <code>ROW_NUMBER()</code> window function and nested
     * <code>SELECT</code> statements.
     */
    @Support({ DB2, DERBY, H2, HSQLDB, INGRES, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    SimpleSelectFinalStep<R> limit(int offset, int numberOfRows);

    /**
     * Add a <code>LIMIT</code> clause to the query using named parameters
     * <p>
     * Note that some dialects do not support bind values at all in
     * <code>LIMIT</code> or <code>TOP</code> clauses!
     * <p>
     * If there is no <code>LIMIT</code> or <code>TOP</code> clause in your
     * RDBMS, or the <code>LIMIT</code> or <code>TOP</code> clause does not
     * support bind values, or if your RDBMS does not natively support offsets,
     * this may be simulated with a <code>ROW_NUMBER()</code> window function and
     * nested <code>SELECT</code> statements.
     */
    @Support({ DB2, DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    SimpleSelectFinalStep<R> limit(int offset, Param<Integer> numberOfRows);

    /**
     * Add a <code>LIMIT</code> clause to the query using named parameters
     * <p>
     * Note that some dialects do not support bind values at all in
     * <code>LIMIT</code> or <code>TOP</code> clauses!
     * <p>
     * If there is no <code>LIMIT</code> or <code>TOP</code> clause in your
     * RDBMS, or the <code>LIMIT</code> or <code>TOP</code> clause does not
     * support bind values, or if your RDBMS does not natively support offsets,
     * this may be simulated with a <code>ROW_NUMBER()</code> window function and
     * nested <code>SELECT</code> statements.
     */
    @Support({ DB2, DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    SimpleSelectFinalStep<R> limit(Param<Integer> offset, int numberOfRows);

    /**
     * Add a <code>LIMIT</code> clause to the query using named parameters
     * <p>
     * Note that some dialects do not support bind values at all in
     * <code>LIMIT</code> or <code>TOP</code> clauses!
     * <p>
     * If there is no <code>LIMIT</code> or <code>TOP</code> clause in your
     * RDBMS, or the <code>LIMIT</code> or <code>TOP</code> clause does not
     * support bind values, or if your RDBMS does not natively support offsets,
     * this may be simulated with a <code>ROW_NUMBER()</code> window function
     * and nested <code>SELECT</code> statements.
     */
    @Support({ DB2, DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    SimpleSelectFinalStep<R> limit(Param<Integer> offset, Param<Integer> numberOfRows);
}
