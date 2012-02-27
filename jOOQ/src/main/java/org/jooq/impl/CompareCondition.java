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

import static java.util.Arrays.asList;
import static org.jooq.Comparator.EQUALS;
import static org.jooq.Comparator.LIKE;
import static org.jooq.Comparator.NOT_EQUALS;
import static org.jooq.Comparator.NOT_LIKE;
import static org.jooq.SQLDialect.ASE;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.POSTGRES;

import java.util.List;

import org.jooq.Attachable;
import org.jooq.BindContext;
import org.jooq.Comparator;
import org.jooq.Field;
import org.jooq.RenderContext;
import org.jooq.SQLDialect;

/**
 * @author Lukas Eder
 */
class CompareCondition extends AbstractCondition {

    private static final long serialVersionUID = -747240442279619486L;

    private final Field<?>    field1;
    private final Field<?>    field2;
    private final Comparator  comparator;
    private final Character   escape;

    CompareCondition(Field<?> field1, Field<?> field2, Comparator comparator) {
        this(field1, field2, comparator, null);
    }

    CompareCondition(Field<?> field1, Field<?> field2, Comparator comparator, Character escape) {
        this.field1 = field1;
        this.field2 = field2;
        this.comparator = comparator;
        this.escape = escape;
    }

    @Override
    public final List<Attachable> getAttachables() {
        return getAttachables(field1, field2);
    }

    @Override
    public final void bind(BindContext context) {
        context.bind(field1);

        // [#1084] Bind field2 only if it is actually rendered
        if (!field2.isNullLiteral() || !asList(EQUALS, NOT_EQUALS).contains(comparator)) {
            context.bind(field2);
        }
    }

    @Override
    public final void toSQL(RenderContext context) {
        SQLDialect dialect = context.getDialect();
        Field<?> lhs = field1;

        // [#1159] Some dialects cannot auto-convert the LHS operand to a
        // VARCHAR when applying a LIKE predicate
        // [#293] TODO: This could apply to other operators, too
        if ((comparator == LIKE || comparator == NOT_LIKE)
                && field1.getType() != String.class
                && asList(ASE, DERBY, POSTGRES).contains(dialect)) {

            lhs = lhs.cast(String.class);
        }

        context.sql(lhs)
               .sql(" ");

        if (field2.isNullLiteral()) {
            switch (comparator) {
                case EQUALS:
                    context.sql("is null");
                    return;

                case NOT_EQUALS:
                    context.sql("is not null");
                    return;
            }
        }

        // [#1131] Some weird DB2 issue stops "LIKE" from working with a
        // concatenated search expression, if the expression is more than 4000
        // characters long
        boolean castRhs = (dialect == DB2 && field2 instanceof Concat);

        context.sql(comparator.toSQL())
               .sql(" ")
               .sql(castRhs ? "cast(" : "")
               .sql(field2)
               .sql(castRhs ? " as varchar(4000))" : "");

        if (escape != null) {
            context.sql(" escape '")
                   .sql(escape)
                   .sql("'");
        }
    }
}
