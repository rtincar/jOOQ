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

import static org.jooq.SQLDialect.ORACLE;

import java.util.List;
import java.util.Map;

/**
 * A query storing objects to the database. This is either an insert or an
 * update query.
 *
 * @param <R> The record type of the table being modified
 * @author Lukas Eder
 */
public interface StoreQuery<R extends Record> extends Query {

    /**
     * Add values to the store statement
     *
     * @param record The record holding values that are stored by the query
     */
    @Support
    void setRecord(R record);

    /**
     * Add a value to the store statement
     *
     * @param field The field
     * @param value The value
     */
    @Support
    <T> void addValue(Field<T> field, T value);

    /**
     * Add a value to the store statement
     *
     * @param field The field
     * @param value The value. If value is <code>null</code>, this results in
     *            calling {@link #addValue(Field, Object)} with null as a value.
     */
    @Support
    <T> void addValue(Field<T> field, Field<T> value);

    /**
     * Add multiple values to the store statement.
     * <p>
     * Please assure that key/value pairs have matching <code>&lt;T&gt;</code>
     * types. Values can either be of type <code>&lt;T&gt;</code> or
     * <code>Field&lt;T&gt;</code>
     */
    @Support
    void addValues(Map<? extends Field<?>, ?> map);

    /**
     * Add a value to the store statement
     *
     * @param <A> The field type
     * @param <T> The array type
     * @param field The field
     * @param value The value
     */
    @Support(ORACLE)
    <A extends ArrayRecord<T>, T> void addValueAsArray(Field<A> field, T... value);

    /**
     * Add a value to the store statement
     *
     * @param <A> The field type
     * @param <T> The array type
     * @param field The field
     * @param value The value
     */
    @Support(ORACLE)
    <A extends ArrayRecord<T>, T> void addValueAsArray(Field<A> field, List<T> value);

}
