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
package org.jooq.test._.testcases;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.jooq.impl.Factory.count;

import java.util.Arrays;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SchemaMapping;
import org.jooq.Select;
import org.jooq.TableRecord;
import org.jooq.UpdatableRecord;
import org.jooq.impl.Factory;
import org.jooq.test.BaseTest;
import org.jooq.test.jOOQAbstractTest;
import org.jooq.test.jOOQMySQLTestSchemaRewrite;

import org.junit.Test;

public class SchemaAndMappingTests<
    A    extends UpdatableRecord<A>,
    B    extends UpdatableRecord<B>,
    S    extends UpdatableRecord<S>,
    B2S  extends UpdatableRecord<B2S>,
    L    extends TableRecord<L>,
    X    extends TableRecord<X>,
    D    extends UpdatableRecord<D>,
    T    extends UpdatableRecord<T>,
    U    extends TableRecord<U>,
    I    extends TableRecord<I>,
    IPK  extends UpdatableRecord<IPK>,
    T658 extends TableRecord<T658>,
    T725 extends UpdatableRecord<T725>,
    T639 extends UpdatableRecord<T639>,
    T785 extends TableRecord<T785>>
extends BaseTest<A, B, S, B2S, L, X, D, T, U, I, IPK, T658, T725, T639, T785> {

    public SchemaAndMappingTests(jOOQAbstractTest<A, B, S, B2S, L, X, D, T, U, I, IPK, T658, T725, T639, T785> delegate) {
        super(delegate);
    }

    @Test
    public void testUse() throws Exception {
        switch (getDialect()) {
            case ASE:
            case SQLITE:
            case SQLSERVER:
                log.info("SKIPPING", "USE test");
                return;
        }

        Factory factory = create();
        factory.use(schema().getName());

        Result<?> result =
        factory.select(TBook_AUTHOR_ID(), count())
               .from(TBook())
               .join(TAuthor())
               .on(TBook_AUTHOR_ID().equal(TAuthor_ID()))
               .where(TAuthor_YEAR_OF_BIRTH().greaterOrEqual(TAuthor_ID()))
               .groupBy(TBook_AUTHOR_ID())
               .having(count().greaterOrEqual(1))
               .orderBy(TBook_AUTHOR_ID().desc())
               .fetch();

        assertEquals(Arrays.asList(2, 1), result.getValues(TBook_AUTHOR_ID()));
        assertEquals(Arrays.asList(2, 2), result.getValues(count()));
    }

    @Test
    public void testTableMapping() throws Exception {
        SchemaMapping mapping = new SchemaMapping();
        mapping.add(TAuthor(), VAuthor());
        mapping.add(TBook(), VBook().getName());

        Select<Record> q =
        create(mapping).select(TBook_TITLE())
                       .from(TAuthor())
                       .join(TBook())
                       .on(TAuthor_ID().equal(TBook_AUTHOR_ID()))
                       .orderBy(TBook_ID().asc());

        // Assure T_* is replaced by V_*
        assertTrue(create(mapping).render(q).contains(VAuthor().getName()));
        assertTrue(create(mapping).render(q).contains(VBook().getName()));
        assertFalse(create(mapping).render(q).contains(TAuthor().getName()));
        assertFalse(create(mapping).render(q).contains(TBook().getName()));

        // Assure that results are correct
        Result<Record> result = q.fetch();
        assertEquals("1984", result.getValue(0, TBook_TITLE()));
        assertEquals("Animal Farm", result.getValue(1, TBook_TITLE()));
        assertEquals("O Alquimista", result.getValue(2, TBook_TITLE()));
        assertEquals("Brida", result.getValue(3, TBook_TITLE()));
    }

    @Test
    public void testSchemaMapping() throws Exception {
        switch (getDialect()) {
            case SQLITE:
                log.info("SKIPPING", "SchemaMapping tests");
                return;
        }

        // Map to self. This will work even for single-schema RDBMS
        // ---------------------------------------------------------------------
        SchemaMapping mapping = new SchemaMapping();
        mapping.add(TAuthor(), TAuthor());
        mapping.add(TBook(), TBook().getName());
        mapping.add(TAuthor().getSchema(), TAuthor().getSchema().getName());

        Select<Record> query =
        create(mapping).select(TBook_TITLE())
                       .from(TAuthor())
                       .join(TBook())
                       .on(TAuthor_ID().equal(TBook_AUTHOR_ID()))
                       .orderBy(TBook_ID().asc());

        Result<Record> result = query.fetch();

        assertEquals("1984", result.getValue(0, TBook_TITLE()));
        assertEquals("Animal Farm", result.getValue(1, TBook_TITLE()));
        assertEquals("O Alquimista", result.getValue(2, TBook_TITLE()));
        assertEquals("Brida", result.getValue(3, TBook_TITLE()));

        // Check for consistency when executing SQL manually
        String sql = query.getSQL();
        log.info("Executing", sql);
        assertEquals(result, create().fetch(sql, query.getBindValues().toArray()));

        // Schema mapping is supported in many RDBMS. But maintaining several
        // databases is non-trivial in some of them.
        switch (getDialect()) {
            case ASE:
            case DB2:
            case DERBY:
            case H2:
            case HSQLDB:
            case INGRES:
            case ORACLE:
            case POSTGRES:
            case SQLITE:
            case SQLSERVER:
            case SYBASE:
                log.info("SKIPPING", "Schema mapping test");
                return;

            // Currently, only MySQL is tested with SchemaMapping
            case MYSQL:

                // But not when the schema is already re-written
                if (delegate.getClass() == jOOQMySQLTestSchemaRewrite.class) {
                    log.info("SKIPPING", "Schema mapping test");
                    return;
                }
        }

        // Map to a second schema
        // ---------------------------------------------------------------------
        mapping = new SchemaMapping();
        mapping.add(TAuthor().getSchema(), TAuthor().getSchema().getName() + "2");

        Select<Record> q =
        create(mapping).select(TBook_TITLE())
                       .from(TAuthor())
                       .join(TBook())
                       .on(TAuthor_ID().equal(TBook_AUTHOR_ID()))
                       .orderBy(TBook_ID().asc());

        // Assure that schema is replaced
        assertTrue(create(mapping).render(q).contains(TAuthor().getSchema().getName() + "2"));
        assertTrue(q.getSQL().contains(TAuthor().getSchema().getName() + "2"));
        assertEquals(create(mapping).render(q), q.getSQL());

        // Assure that results are correct
        result = q.fetch();
        assertEquals("1984", result.getValue(0, TBook_TITLE()));
        assertEquals("Animal Farm", result.getValue(1, TBook_TITLE()));
        assertEquals("O Alquimista", result.getValue(2, TBook_TITLE()));
        assertEquals("Brida", result.getValue(3, TBook_TITLE()));

        // [#995] Schema mapping in stored functions
        // -----------------------------------------
        Field<Integer> f1 = FOneField().cast(Integer.class);
        Field<Integer> f2 = FNumberField(42).cast(Integer.class);

        q =
        create(mapping).select(f1, f2);

        // Assure that schema is replaced
        assertTrue(create(mapping).render(q).contains(TAuthor().getSchema().getName() + "2"));
        assertTrue(q.getSQL().contains(TAuthor().getSchema().getName() + "2"));
        assertEquals(create(mapping).render(q), q.getSQL());

        // Assure that results are correct
        Record record = q.fetchOne();
        assertEquals(1, (int) record.getValue(f1));
        assertEquals(42, (int) record.getValue(f2));

        // Map both schema AND tables
        // --------------------------
        mapping = new SchemaMapping();
        mapping.add(TAuthor(), VAuthor());
        mapping.add(TBook(), VBook().getName());
        mapping.add(TAuthor().getSchema(), TAuthor().getSchema().getName() + "2");

        q =
        create(mapping).select(TBook_TITLE())
                       .from(TAuthor())
                       .join(TBook())
                       .on(TAuthor_ID().equal(TBook_AUTHOR_ID()))
                       .orderBy(TBook_ID().asc());

        // Assure T_* is replaced by V_*
        assertTrue(create(mapping).render(q).contains(VAuthor().getName()));
        assertTrue(create(mapping).render(q).contains(VBook().getName()));
        assertTrue(create(mapping).render(q).contains("test2"));
        assertFalse(create(mapping).render(q).contains(TAuthor().getName()));
        assertFalse(create(mapping).render(q).contains(TBook().getName()));

        // Assure that results are correct
        result = q.fetch();
        assertEquals("1984", result.getValue(0, TBook_TITLE()));
        assertEquals("Animal Farm", result.getValue(1, TBook_TITLE()));
        assertEquals("O Alquimista", result.getValue(2, TBook_TITLE()));
        assertEquals("Brida", result.getValue(3, TBook_TITLE()));
    }

}
