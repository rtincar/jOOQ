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

import static org.jooq.impl.Factory.val;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.jooq.BindContext;
import org.jooq.Field;
import org.jooq.RenderContext;

/**
 * @author Lukas Eder
 */
class FieldMapForInsert extends AbstractQueryPartMap<Field<?>, Field<?>> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -2192833491610583485L;

    FieldMapForInsert() {
    }

    @Override
    public final void toSQL(RenderContext context) {
        toSQLReferenceKeys(context);
        context.sql(" values ");
        toSQLReferenceValues(context);
    }

    final void toSQLReferenceKeys(RenderContext context) {
        context.sql("(");

        String separator = "";
        for (Field<?> field : keySet()) {
            context.sql(separator);
            context.literal(field.getName());

            separator = ", ";
        }

        context.sql(")");
    }

    final void toSQLReferenceValues(RenderContext context) {
        context.sql("(");

        String separator = "";
        for (Field<?> field : values()) {
            context.sql(separator);
            context.sql(field);

            separator = ", ";
        }

        context.sql(")");
    }

    @Override
    public final void bind(BindContext context) {
        context.bind(keySet()).bind(values());
    }

    final void putFields(Collection<? extends Field<?>> fields) {
        for (Field<?> field : fields) {
            put(field, null);
        }
    }

    final void putValues(Collection<? extends Field<?>> values) {
        if (values.size() != size()) {
            throw new IllegalArgumentException("The number of values must match the number of fields: " + this);
        }

        Iterator<? extends Field<?>> it = values.iterator();
        for (Entry<Field<?>, Field<?>> entry : entrySet()) {
            entry.setValue(it.next());
        }
    }

    final void set(Map<? extends Field<?>, ?> map) {
        for (Entry<? extends Field<?>, ?> entry : map.entrySet()) {
            put(entry.getKey(), val(entry.getValue()));
        }
    }
}
