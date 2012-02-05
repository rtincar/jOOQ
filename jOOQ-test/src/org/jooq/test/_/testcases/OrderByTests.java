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
import static junit.framework.Assert.assertNull;
import static org.jooq.impl.Factory.count;
import static org.jooq.impl.Factory.table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.Table;
import org.jooq.TableRecord;
import org.jooq.UpdatableRecord;
import org.jooq.test.BaseTest;
import org.jooq.test.jOOQAbstractTest;

import org.junit.Test;

public class OrderByTests<
    A    extends UpdatableRecord<A>,
    B    extends UpdatableRecord<B>,
    S    extends UpdatableRecord<S>,
    B2S  extends UpdatableRecord<B2S>,
    BS   extends UpdatableRecord<BS>,
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
extends BaseTest<A, B, S, B2S, BS, L, X, D, T, U, I, IPK, T658, T725, T639, T785> {

    public OrderByTests(jOOQAbstractTest<A, B, S, B2S, BS, L, X, D, T, U, I, IPK, T658, T725, T639, T785> delegate) {
        super(delegate);
    }

    @Test
    public void testOrderByInSubquery() throws Exception {
        // TODO: [#780] Fix this for Ingres and Sybase ASE
        switch (getDialect()) {
            case ASE:
            case INGRES:
                log.info("SKIPPING", "Ordered subqueries");
                return;
        }

        // Some RDBMS don't accept ORDER BY clauses in subqueries without
        // TOP clause (e.g. SQL Server). jOOQ will synthetically add a
        // TOP 100 PERCENT clause, if necessary

        Select<?> nested =
        create().select(TBook_ID())
                .from(TBook())
                .orderBy(TBook_ID().asc());

        List<Integer> result =
        create().select(nested.getField(TBook_ID()))
                .from(nested)
                .orderBy(nested.getField(TBook_ID()).desc())
                .fetch(nested.getField(TBook_ID()));

        assertEquals(Arrays.asList(4, 3, 2, 1), result);
    }

    @Test
    public void testOrderByNulls() throws Exception {
        jOOQAbstractTest.reset = false;

        // Make data a bit more meaningful, first
        create().insertInto(TAuthor(), TAuthor_ID(), TAuthor_LAST_NAME())
                .values(3, "Döblin")
                .execute();

        Result<A> authors =
        create().selectFrom(TAuthor())
                .orderBy(
                    TAuthor_FIRST_NAME().asc().nullsFirst())
                .fetch();

        assertNull(authors.getValue(0, TAuthor_FIRST_NAME()));
        assertEquals("George", authors.getValue(1, TAuthor_FIRST_NAME()));
        assertEquals("Paulo", authors.getValue(2, TAuthor_FIRST_NAME()));

        authors =
        create().selectFrom(TAuthor())
                .orderBy(
                    TAuthor_FIRST_NAME().asc().nullsLast())
                .fetch();

        assertEquals("George", authors.getValue(0, TAuthor_FIRST_NAME()));
        assertEquals("Paulo", authors.getValue(1, TAuthor_FIRST_NAME()));
        assertNull(authors.getValue(2, TAuthor_FIRST_NAME()));
    }

    @Test
    public void testOrderByIndexes() throws Exception {
        assertEquals(Arrays.asList(1, 2, 3, 4),
            create().selectFrom(TBook())
                    .orderBy(1)
                    .fetch(TBook_ID()));

        assertEquals(Arrays.asList(1, 2, 3, 4),
            create().select(TBook_ID(), TBook_TITLE())
                    .from(TBook())
                    .orderBy(1)
                    .fetch(TBook_ID()));

        assertEquals(Arrays.asList(1, 2, 3, 4),
            create().select(TBook_TITLE(), TBook_ID())
                    .from(TBook())
                    .orderBy(2)
                    .fetch(TBook_ID()));

        assertEquals(Arrays.asList(1, 1, 2, 2),
            create().select(TBook_AUTHOR_ID(), TBook_ID())
                    .from(TBook())
                    .orderBy(2, 1)
                    .fetch(TBook_AUTHOR_ID()));
    }

    @Test
    public void testOrderByIndirection() throws Exception {
        assertEquals(BOOK_IDS,
            create().selectFrom(TBook())
            .orderBy(TBook_ID().sortAsc(), TBook_ID().asc())
            .fetch(TBook_ID()));

        assertEquals(Arrays.asList(3, 2, 4, 1),
            create().selectFrom(TBook())
                    .orderBy(TBook_ID().sortAsc(3, 2, 4, 1))
                    .fetch(TBook_ID()));

        assertEquals(Arrays.asList(1, 4, 2, 3),
            create().selectFrom(TBook())
                    .orderBy(TBook_ID().sortDesc(3, 2, 4, 1))
                    .fetch(TBook_ID()));

//        assertEquals(Arrays.asList(3, 2, 1, 4),
//            create().selectFrom(TBook())
//                    .orderBy(TBook_ID().sortAsc(3, 2).nullsLast(), TBook_ID().asc())
//                    .fetch(TBook_ID()));
//
//        assertEquals(Arrays.asList(1, 4, 3, 2),
//            create().selectFrom(TBook())
//                    .orderBy(TBook_ID().sortAsc(3, 2).nullsFirst(), TBook_ID().asc())
//                    .fetch(TBook_ID()));

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 3);
        map.put(2, 4);
        map.put(3, 1);
        map.put(4, 2);
        assertEquals(Arrays.asList(3, 4, 1, 2),
            create().selectFrom(TBook())
                    .orderBy(TBook_ID().sort(map))
                    .fetch(TBook_ID()));
    }

    @Test
    public void testLimit() throws Exception {
        SQLDialect dialect = getDialect();

        int lower = 0;

        // The following dialects don't support LIMIT 0 / TOP 0
        switch (dialect) {
            case DB2:
            case DERBY:
            case HSQLDB:
            case INGRES:
            case SYBASE:
                lower = 1;
        }

        for (int i = lower; i < 6; i++) {
            assertEquals(Math.min(i, 4),
                create().selectFrom(TBook()).limit(i).fetch().size());
            assertEquals(Math.min(i, 4),
                create().select().from(TBook()).limit(i).fetch().size());
        }

        if (getDialect() == SQLDialect.ASE) {
            log.info("SKIPPING", "LIMIT .. OFFSET tests");
            return;
        }

        for (int i = lower; i < 6; i++) {
            assertEquals(Math.min(i, 3),
                create().selectFrom(TBook()).limit(1, i).fetch().size());
            assertEquals(Math.min(i, 3),
                create().selectFrom(TBook()).limit(i).offset(1).fetch().size());
            assertEquals(Math.min(i, 3),
                create().select().from(TBook()).limit(1, i).fetch().size());
            assertEquals(Math.min(i, 3),
                create().select().from(TBook()).limit(i).offset(1).fetch().size());
        }

        Result<B> result = create()
            .selectFrom(TBook())
            .orderBy(TBook_ID(), TBook_AUTHOR_ID())
            .limit(1, 2)
            .fetch();

        assertEquals(Integer.valueOf(2), result.getValue(0, TBook_ID()));
        assertEquals(Integer.valueOf(3), result.getValue(1, TBook_ID()));
    }

    @Test
    public void testLimitNested() throws Exception {
        // TODO [#780] This is not supported in Ingres
        if (getDialect() == SQLDialect.INGRES ||
            getDialect() == SQLDialect.ASE) {

            log.info("SKIPPING", "LIMIT clauses in nested SELECTs");
            return;
        }

        Table<B> nested = table(create()
            .selectFrom(TBook())
            .orderBy(TBook_ID().desc())
            .limit(2))
            .as("nested");

        Field<Integer> nestedID = nested.getField(TBook_AUTHOR_ID());
        Record record = create().select(nestedID, count())
            .from(nested)
            .groupBy(nestedID)
            .orderBy(nestedID)
            .fetchOne();

        assertEquals(Integer.valueOf(2), record.getValue(nestedID));
        assertEquals(Integer.valueOf(2), record.getValue(1));

        Result<Record> result = create().select(nestedID, count())
            .from(create().selectFrom(TBook())
                          .orderBy(TBook_ID().desc())
                          .limit(1, 2).asTable("nested"))
            .groupBy(nestedID)
            .orderBy(nestedID)
            .fetch();

        assertEquals(2, result.size());
        assertEquals(Integer.valueOf(1), result.getValue(0, nestedID));
        assertEquals(Integer.valueOf(1), result.getValue(0, 1));
        assertEquals(Integer.valueOf(2), result.getValue(1, nestedID));
        assertEquals(Integer.valueOf(1), result.getValue(1, 1));
    }
}
