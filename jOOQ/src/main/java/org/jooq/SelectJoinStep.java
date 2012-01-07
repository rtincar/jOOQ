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
package org.jooq;

import static org.jooq.SQLDialect.ASE;
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

import org.jooq.impl.Factory;

/**
 * This type is used for the {@link Select}'s DSL API when selecting generic
 * {@link Record} types.
 * <p>
 * Example: <code><pre>
 * -- get all authors' first and last names, and the number
 * -- of books they've written in German, if they have written
 * -- more than five books in German in the last three years
 * -- (from 2011), and sort those authors by last names
 * -- limiting results to the second and third row
 *
 *   SELECT T_AUTHOR.FIRST_NAME, T_AUTHOR.LAST_NAME, COUNT(*)
 *     FROM T_AUTHOR
 *     JOIN T_BOOK ON T_AUTHOR.ID = T_BOOK.AUTHOR_ID
 *    WHERE T_BOOK.LANGUAGE = 'DE'
 *      AND T_BOOK.PUBLISHED > '2008-01-01'
 * GROUP BY T_AUTHOR.FIRST_NAME, T_AUTHOR.LAST_NAME
 *   HAVING COUNT(*) > 5
 * ORDER BY T_AUTHOR.LAST_NAME ASC NULLS FIRST
 *    LIMIT 2
 *   OFFSET 1
 *      FOR UPDATE
 *       OF FIRST_NAME, LAST_NAME
 *       NO WAIT
 * </pre></code> Its equivalent in jOOQ <code><pre>
 * create.select(TAuthor.FIRST_NAME, TAuthor.LAST_NAME, create.count())
 *       .from(T_AUTHOR)
 *       .join(T_BOOK).on(TBook.AUTHOR_ID.equal(TAuthor.ID))
 *       .where(TBook.LANGUAGE.equal("DE"))
 *       .and(TBook.PUBLISHED.greaterThan(parseDate('2008-01-01')))
 *       .groupBy(TAuthor.FIRST_NAME, TAuthor.LAST_NAME)
 *       .having(create.count().greaterThan(5))
 *       .orderBy(TAuthor.LAST_NAME.asc().nullsFirst())
 *       .limit(2)
 *       .offset(1)
 *       .forUpdate()
 *       .of(TAuthor.FIRST_NAME, TAuthor.LAST_NAME)
 *       .noWait();
 * </pre></code> Refer to the manual for more details
 *
 * @author Lukas Eder
 */
public interface SelectJoinStep extends SelectWhereStep {

    /**
     * <code>INNER JOIN</code> a table
     */
    @Support
    SelectOnStep join(TableLike<?> table);

    /**
     * <code>INNER JOIN</code> a table
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support
    SelectOnStep join(String sql);

    /**
     * <code>INNER JOIN</code> a table
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support
    SelectOnStep join(String sql, Object... bindings);

    /**
     * <code>CROSS JOIN</code> a table
     * <p>
     * If this syntax is unavailable, it is simulated with a regular
     * <code>INNER JOIN</code>. The following two constructs are equivalent:
     * <code><pre>
     * A cross join B
     * A join B on 1 = 1
     * </pre></code>
     */
    @Support
    SelectJoinStep crossJoin(TableLike<?> table);

    /**
     * <code>CROSS JOIN</code> a table
     * <p>
     * If this syntax is unavailable, it is simulated with a regular
     * <code>INNER JOIN</code>. The following two constructs are equivalent:
     * <code><pre>
     * A cross join B
     * A join B on 1 = 1
     * </pre></code>
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support
    SelectJoinStep crossJoin(String sql);

    /**
     * <code>CROSS JOIN</code> a table
     * <p>
     * If this syntax is unavailable, it is simulated with a regular
     * <code>INNER JOIN</code>. The following two constructs are equivalent:
     * <code><pre>
     * A cross join B
     * A join B on 1 = 1
     * </pre></code>
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support
    SelectJoinStep crossJoin(String sql, Object... bindings);

    /**
     * <code>LEFT OUTER JOIN</code> a table
     */
    @Support
    SelectOnStep leftOuterJoin(TableLike<?> table);

    /**
     * <code>LEFT OUTER JOIN</code> a table
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support
    SelectOnStep leftOuterJoin(String sql);

    /**
     * <code>LEFT OUTER JOIN</code> a table
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support
    SelectOnStep leftOuterJoin(String sql, Object... bindings);

    /**
     * <code>RIGHT OUTER JOIN</code> a table
     * <p>
     * This is only possible where the underlying RDBMS supports it
     */
    @Support({ ASE, DB2, DERBY, H2, HSQLDB, INGRES, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    SelectOnStep rightOuterJoin(TableLike<?> table);

    /**
     * <code>RIGHT OUTER JOIN</code> a table
     * <p>
     * This is only possible where the underlying RDBMS supports it
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support({ ASE, DB2, DERBY, H2, HSQLDB, INGRES, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    SelectOnStep rightOuterJoin(String sql);

    /**
     * <code>RIGHT OUTER JOIN</code> a table
     * <p>
     * This is only possible where the underlying RDBMS supports it
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support({ ASE, DB2, DERBY, H2, HSQLDB, INGRES, MYSQL, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    SelectOnStep rightOuterJoin(String sql, Object... bindings);

    /**
     * <code>FULL OUTER JOIN</code> a table
     * <p>
     * This is only possible where the underlying RDBMS supports it
     */
    @Support({ DB2, HSQLDB, INGRES, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    SelectOnStep fullOuterJoin(TableLike<?> table);

    /**
     * <code>FULL OUTER JOIN</code> a table
     * <p>
     * This is only possible where the underlying RDBMS supports it
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support({ DB2, HSQLDB, INGRES, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    SelectOnStep fullOuterJoin(String sql);

    /**
     * <code>FULL OUTER JOIN</code> a table
     * <p>
     * This is only possible where the underlying RDBMS supports it
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support({ DB2, HSQLDB, INGRES, ORACLE, POSTGRES, SQLSERVER, SYBASE })
    SelectOnStep fullOuterJoin(String sql, Object... bindings);

    /**
     * <code>NATURAL JOIN</code> a table
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     */
    @Support({ DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalJoin(TableLike<?> table);

    /**
     * <code>NATURAL JOIN</code> a table
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support({ DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalJoin(String sql);

    /**
     * <code>NATURAL JOIN</code> a table
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support({ DERBY, H2, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalJoin(String sql, Object... bindings);

    /**
     * <code>NATURAL LEFT OUTER JOIN</code> a table
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     */
    @Support({ DERBY, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalLeftOuterJoin(TableLike<?> table);

    /**
     * <code>NATURAL LEFT OUTER JOIN</code> a table
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support({ DERBY, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalLeftOuterJoin(String sql);

    /**
     * <code>NATURAL LEFT OUTER JOIN</code> a table
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support({ DERBY, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalLeftOuterJoin(String sql, Object... bindings);

    /**
     * <code>NATURAL RIGHT OUTER JOIN</code> a table and proceed to the next
     * step
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     */
    @Support({ DERBY, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalRightOuterJoin(TableLike<?> table);

    /**
     * <code>NATURAL RIGHT OUTER JOIN</code> a table and proceed to the next
     * step
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support({ DERBY, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalRightOuterJoin(String sql);

    /**
     * <code>NATURAL RIGHT OUTER JOIN</code> a table and proceed to the next
     * step
     * <p>
     * Natural joins are supported by most RDBMS. If they aren't supported, they
     * are simulated if jOOQ has enough information.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support({ DERBY, HSQLDB, MYSQL, ORACLE, POSTGRES, SQLITE, SYBASE })
    SelectJoinStep naturalRightOuterJoin(String sql, Object... bindings);

}
