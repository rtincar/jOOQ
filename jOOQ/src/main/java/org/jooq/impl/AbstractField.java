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

import static org.jooq.impl.ExpressionOperator.ADD;
import static org.jooq.impl.ExpressionOperator.DIVIDE;
import static org.jooq.impl.ExpressionOperator.MULTIPLY;
import static org.jooq.impl.ExpressionOperator.SUBTRACT;
import static org.jooq.impl.Factory.falseCondition;
import static org.jooq.impl.Factory.nullSafe;
import static org.jooq.impl.Factory.trueCondition;
import static org.jooq.impl.Factory.val;
import static org.jooq.impl.Factory.vals;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jooq.BindContext;
import org.jooq.CaseValueStep;
import org.jooq.CaseWhenStep;
import org.jooq.Comparator;
import org.jooq.Condition;
import org.jooq.DataType;
import org.jooq.DatePart;
import org.jooq.Field;
import org.jooq.RenderContext;
import org.jooq.Select;
import org.jooq.SortField;
import org.jooq.SortOrder;
import org.jooq.WindowIgnoreNullsStep;
import org.jooq.WindowPartitionByStep;
import org.jooq.tools.Convert;

abstract class AbstractField<T> extends AbstractNamedTypeProviderQueryPart<T> implements Field<T> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = 2884811923648354905L;

    AbstractField(String name, DataType<T> type) {
        super(name, type);
    }

    // ------------------------------------------------------------------------
    // API (not implemented)
    // ------------------------------------------------------------------------

    @Override
    public abstract void toSQL(RenderContext context);

    @Override
    public abstract void bind(BindContext context);

    @Override
    public abstract boolean isNullLiteral();

    // ------------------------------------------------------------------------
    // API
    // ------------------------------------------------------------------------

    @Override
    public Field<T> as(String alias) {
        return new FieldAlias<T>(this, alias);
    }

    // ------------------------------------------------------------------------
    // Type casts
    // ------------------------------------------------------------------------

    @Override
    public final <Z> Field<Z> cast(Field<Z> field) {
        return cast(field.getDataType());
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <Z> Field<Z> cast(DataType<Z> type) {

        // [#473] Prevent unnecessary casts
        if (getDataType().equals(type)) {
            return (Field<Z>) this;
        }
        else {
            return new Cast<Z>(this, type);
        }
    }

    @Override
    public final <Z> Field<Z> cast(Class<? extends Z> type) {
        return cast(SQLDataType.getDataType(null, type));
    }

    // ------------------------------------------------------------------------
    // Conversion of field into a sort field
    // ------------------------------------------------------------------------

    @Override
    public final SortField<T> asc() {
        return new SortFieldImpl<T>(this, SortOrder.ASC);
    }

    @Override
    public final SortField<T> desc() {
        return new SortFieldImpl<T>(this, SortOrder.DESC);
    }

    @Override
    public final SortField<Integer> sortAsc(Collection<T> sortList) {
        Map<T, Integer> map = new LinkedHashMap<T, Integer>();

        int i = 0;
        for (T value : sortList) {
            map.put(value, i++);
        }

        return sort(map);
    }

    @Override
    public final SortField<Integer> sortAsc(T... sortList) {
        return sortAsc(Arrays.asList(sortList));
    }

    @Override
    public final SortField<Integer> sortDesc(Collection<T> sortList) {
        Map<T, Integer> map = new LinkedHashMap<T, Integer>();

        int i = 0;
        for (T value : sortList) {
            map.put(value, i--);
        }

        return sort(map);
    }

    @Override
    public final SortField<Integer> sortDesc(T... sortList) {
        return sortDesc(Arrays.asList(sortList));
    }

    @Override
    public final <Z> SortField<Z> sort(Map<T, Z> sortMap) {
        CaseValueStep<T> decode = Factory.decode().value(this);
        CaseWhenStep<T, Z> result = null;

        for (Entry<T, Z> entry : sortMap.entrySet()) {
            if (result == null) {
                result = decode.when(entry.getKey(), entry.getValue());
            }
            else {
                result.when(entry.getKey(), entry.getValue());
            }
        }

        if (result == null) {
            return null;
        }
        else {
            return result.asc();
        }
    }

    // ------------------------------------------------------------------------
    // Arithmetic operations
    // ------------------------------------------------------------------------

    @Override
    public final Field<T> neg() {
        return new Neg<T>(this, ExpressionOperator.SUBTRACT);
    }

    @Override
    public final Field<T> add(Number value) {

        // Date time arithmetic
        if (java.util.Date.class.isAssignableFrom(getType())) {
            return new DateAdd<T>(this, value);
        }

        // Numeric arithmetic
        else {
            return add(val(value));
        }
    }

    /**
     * This default implementation is known to be overridden by
     * {@link Expression} to generate neater expressions
     */
    @Override
    public Field<T> add(Field<? extends Number> value) {
        return new Expression<T>(ADD, this, nullSafe(value));
    }

    @Override
    public final Field<T> sub(Number value) {

        // Date time arithmetic
        if (java.util.Date.class.isAssignableFrom(getType())) {
            return new DateSub<T>(this, value);
        }

        // Numeric arithmetic
        else {
            return sub(val(value));
        }
    }

    @Override
    public final Field<T> sub(Field<? extends Number> value) {
        return new Expression<T>(SUBTRACT, this, nullSafe(value));
    }

    @Override
    public final Field<T> mul(Number value) {
        return mul(val(value));
    }

    /**
     * This default implementation is known to be overridden by
     * {@link Expression} to generate neater expressions
     */
    @Override
    public Field<T> mul(Field<? extends Number> value) {
        return new Expression<T>(MULTIPLY, this, nullSafe(value));
    }

    @Override
    public final Field<T> div(Number value) {
        return div(val(value));
    }

    @Override
    public final Field<T> div(Field<? extends Number> value) {
        return new Expression<T>(DIVIDE, this, nullSafe(value));
    }

    @Override
    public final Field<T> mod(Number value) {
        return mod(val(value));
    }

    @Override
    public final Field<T> mod(Field<? extends Number> value) {
        return new Mod<T>(this, nullSafe(value));
    }

    // ------------------------------------------------------------------------
    // Conditions created from this field
    // ------------------------------------------------------------------------

    @Override
    public final Condition isNull() {
        return equal((T) null);
    }

    @Override
    public final Condition isNotNull() {
        return notEqual((T) null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Condition isTrue() {
        Class<?> type = getType();

        if (type == String.class) {
            return ((Field<String>) this).in(Convert.TRUE_VALUES);
        }
        else if (Number.class.isAssignableFrom(type)) {
            return ((Field<Number>) this).equal((Number) getDataType().convert(1));
        }
        else if (Boolean.class.isAssignableFrom(type)) {
            return ((Field<Boolean>) this).equal(true);
        }
        else {
            return cast(String.class).in(Convert.TRUE_VALUES);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Condition isFalse() {
        Class<?> type = getType();

        if (type == String.class) {
            return ((Field<String>) this).in(Convert.FALSE_VALUES);
        }
        else if (Number.class.isAssignableFrom(type)) {
            return ((Field<Number>) this).equal((Number) getDataType().convert(0));
        }
        else if (Boolean.class.isAssignableFrom(type)) {
            return ((Field<Boolean>) this).equal(false);
        }
        else {
            return cast(String.class).in(Convert.FALSE_VALUES);
        }
    }

    @Override
    public final Condition like(T value) {
        return like(val(value));
    }

    @Override
    public final Condition like(Field<T> value) {
        return new CompareCondition<T>(this, nullSafe(value), Comparator.LIKE);
    }

    @Override
    public final Condition notLike(T value) {
        return notLike(val(value));
    }

    @Override
    public final Condition notLike(Field<T> value) {
        return new CompareCondition<T>(this, nullSafe(value), Comparator.NOT_LIKE);
    }

    @Override
    public final Condition in(T... values) {
        return in(vals(values).toArray(new Field<?>[0]));
    }

    @Override
    public final Condition in(Field<?>... values) {
        if (values == null || values.length == 0) {
            return falseCondition();
        }
        else {
            return new InCondition<T>(this, nullSafe(values), InOperator.IN);
        }
    }

    @Override
    public final Condition in(Collection<T> values) {
        List<Field<?>> fields = new ArrayList<Field<?>>();

        for (T value : values) {
            fields.add(val(value));
        }

        return in(fields.toArray(new Field<?>[0]));
    }

    @Override
    public final Condition in(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.IN);
    }

    @Override
    public final Condition notIn(T... values) {
        if (values == null || values.length == 0) {
            return trueCondition();
        }
        else {
            return notIn(vals(values).toArray(new Field<?>[0]));
        }
    }

    @Override
    public final Condition notIn(Field<?>... values) {
        return new InCondition<T>(this, nullSafe(values), InOperator.NOT_IN);
    }

    @Override
    public final Condition notIn(Collection<T> values) {
        List<Field<?>> fields = new ArrayList<Field<?>>();

        for (T value : values) {
            fields.add(val(value));
        }

        return notIn(fields.toArray(new Field<?>[0]));
    }

    @Override
    public final Condition notIn(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(
            query, this, SubQueryOperator.NOT_IN);
    }

    @Override
    public final Condition between(T minValue, T maxValue) {
        return between(val(minValue), val(maxValue));
    }

    @Override
    public final Condition between(Field<T> minValue, Field<T> maxValue) {
        return new BetweenCondition<T>(this, nullSafe(minValue), nullSafe(maxValue));
    }

    @Override
    public final Condition equal(T value) {
        return equal(val(value));
    }

    @Override
    public final Condition equal(Field<T> field) {
        return new CompareCondition<T>(this, nullSafe(field), Comparator.EQUALS);
    }

    @Override
    public final Condition equal(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.EQUALS);
    }

    @Override
    public final Condition equalAny(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.EQUALS_ANY);
    }

    @Override
    public final Condition equalAny(T... array) {
        return equalAny(val(array));
    }

    @Override
    public final Condition equalAny(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.EQUALS_ANY);
    }

    @Override
    @Deprecated
    public final Condition equalSome(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.EQUALS_SOME);
    }

    @Override
    public final Condition equalAll(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.EQUALS_ALL);
    }

    @Override
    public final Condition equalAll(T... array) {
        return equalAll(val(array));
    }

    @Override
    public final Condition equalAll(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.EQUALS_ALL);
    }

    @Override
    public final Condition notEqual(T value) {
        return notEqual(val(value));
    }

    @Override
    public final Condition notEqual(Field<T> field) {
        return new CompareCondition<T>(this, nullSafe(field), Comparator.NOT_EQUALS);
    }

    @Override
    public final Condition notEqual(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.NOT_EQUALS);
    }

    @Override
    public final Condition notEqualAny(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.NOT_EQUALS_ANY);
    }

    @Override
    public final Condition notEqualAny(T... array) {
        return notEqualAny(val(array));
    }

    @Override
    public final Condition notEqualAny(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.NOT_EQUALS_ANY);
    }

    @Override
    @Deprecated
    public final Condition notEqualSome(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.NOT_EQUALS_SOME);
    }

    @Override
    public final Condition notEqualAll(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.NOT_EQUALS_ALL);
    }

    @Override
    public final Condition notEqualAll(T... array) {
        return notEqualAll(val(array));
    }

    @Override
    public final Condition notEqualAll(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.NOT_EQUALS_ALL);
    }

    @Override
    public final Condition lessThan(T value) {
        return lessThan(val(value));
    }

    @Override
    public final Condition lessThan(Field<T> field) {
        return new CompareCondition<T>(this, nullSafe(field), Comparator.LESS);
    }

    @Override
    public final Condition lessThan(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS);
    }

    @Override
    public final Condition lessThanAny(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_THAN_ANY);
    }

    @Override
    public final Condition lessThanAny(T... array) {
        return lessThanAny(val(array));
    }

    @Override
    public final Condition lessThanAny(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.LESS_THAN_ANY);
    }

    @Override
    @Deprecated
    public final Condition lessThanSome(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_THAN_SOME);
    }

    @Override
    public final Condition lessThanAll(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_THAN_ALL);
    }

    @Override
    public final Condition lessThanAll(T... array) {
        return lessThanAll(val(array));
    }

    @Override
    public final Condition lessThanAll(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.LESS_THAN_ALL);
    }

    @Override
    public final Condition lessOrEqual(T value) {
        return lessOrEqual(val(value));
    }

    @Override
    public final Condition lessOrEqual(Field<T> field) {
        return new CompareCondition<T>(this, nullSafe(field), Comparator.LESS_OR_EQUAL);
    }

    @Override
    public final Condition lessOrEqual(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_OR_EQUAL);
    }

    @Override
    public final Condition lessOrEqualAny(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_OR_EQUAL_ANY);
    }

    @Override
    public final Condition lessOrEqualAny(T... array) {
        return lessOrEqualAny(val(array));
    }

    @Override
    public final Condition lessOrEqualAny(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.LESS_OR_EQUAL_ANY);
    }

    @Override
    @Deprecated
    public final Condition lessOrEqualSome(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_OR_EQUAL_SOME);
    }

    @Override
    public final Condition lessOrEqualAll(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.LESS_OR_EQUAL_ALL);
    }

    @Override
    public final Condition lessOrEqualAll(T... array) {
        return lessOrEqualAll(val(array));
    }

    @Override
    public final Condition lessOrEqualAll(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.LESS_OR_EQUAL_ALL);
    }

    @Override
    public final Condition greaterThan(T value) {
        return greaterThan(val(value));
    }

    @Override
    public final Condition greaterThan(Field<T> field) {
        return new CompareCondition<T>(this, nullSafe(field), Comparator.GREATER);
    }

    @Override
    public final Condition greaterThan(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER);
    }

    @Override
    public final Condition greaterThanAny(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_THAN_ANY);
    }

    @Override
    public final Condition greaterThanAny(T... array) {
        return greaterThanAny(val(array));
    }

    @Override
    public final Condition greaterThanAny(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.GREATER_THAN_ANY);
    }

    @Override
    @Deprecated
    public final Condition greaterThanSome(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_THAN_SOME);
    }

    @Override
    public final Condition greaterThanAll(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_THAN_ALL);
    }

    @Override
    public final Condition greaterThanAll(T... array) {
        return greaterThanAll(val(array));
    }

    @Override
    public final Condition greaterThanAll(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.GREATER_THAN_ALL);
    }

    @Override
    public final Condition greaterOrEqual(T value) {
        return greaterOrEqual(val(value));
    }

    @Override
    public final Condition greaterOrEqual(Field<T> field) {
        return new CompareCondition<T>(this, nullSafe(field), Comparator.GREATER_OR_EQUAL);
    }

    @Override
    public final Condition greaterOrEqual(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_OR_EQUAL);
    }

    @Override
    public final Condition greaterOrEqualAny(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_OR_EQUAL_ANY);
    }

    @Override
    public final Condition greaterOrEqualAny(T... array) {
        return greaterOrEqualAny(val(array));
    }

    @Override
    public final Condition greaterOrEqualAny(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.GREATER_OR_EQUAL_ANY);
    }

    @Override
    @Deprecated
    public final Condition greaterOrEqualSome(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_OR_EQUAL_SOME);
    }

    @Override
    public final Condition greaterOrEqualAll(Select<?> query) {
        return new SelectQueryAsSubQueryCondition(query, this, SubQueryOperator.GREATER_OR_EQUAL_ALL);
    }

    @Override
    public final Condition greaterOrEqualAll(T... array) {
        return greaterOrEqualAll(val(array));
    }

    @Override
    public final Condition greaterOrEqualAll(Field<T[]> array) {
        return new ArrayAsSubqueryCondition<T>(nullSafe(array), this, SubQueryOperator.GREATER_OR_EQUAL_ALL);
    }

    // ------------------------------------------------------------------------
    // Pre-2.0 API. This API is maintained for backwards-compatibility. It will
    // be removed in the future. Consider using equivalent methods from
    // org.jooq.Factory
    // ------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    private final <Z extends Number> Field<Z> numeric() {
        if (getDataType().isNumeric()) {
            return (Field<Z>) this;
        }
        else {
            return (Field<Z>) cast(BigDecimal.class);
        }
    }

    @SuppressWarnings("unchecked")
    private final Field<String> varchar() {
        if (getDataType().isString()) {
            return (Field<String>) this;
        }
        else {
            return cast(String.class);
        }
    }

    @SuppressWarnings("unchecked")
    private final <Z extends java.util.Date> Field<Z> date() {
        if (getDataType().isTemporal()) {
            return (Field<Z>) this;
        }
        else {
            return (Field<Z>) cast(Timestamp.class);
        }
    }

    @Override
    @Deprecated
    public final Field<Integer> sign() {
        return Factory.sign(numeric());
    }

    @SuppressWarnings("unchecked")
    @Override
    @Deprecated
    public final Field<T> abs() {
        return (Field<T>) Factory.abs(numeric());
    }

    @SuppressWarnings("unchecked")
    @Override
    @Deprecated
    public final Field<T> round() {
        return (Field<T>) Factory.round(numeric());
    }

    @SuppressWarnings("unchecked")
    @Override
    @Deprecated
    public final Field<T> round(int decimals) {
        return (Field<T>) Factory.round(numeric(), decimals);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Deprecated
    public final Field<T> floor() {
        return (Field<T>) Factory.floor(numeric());
    }

    @SuppressWarnings("unchecked")
    @Override
    @Deprecated
    public final Field<T> ceil() {
        return (Field<T>) Factory.ceil(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> sqrt() {
        return Factory.sqrt(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> exp() {
        return Factory.exp(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> ln() {
        return Factory.ln(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> log(int base) {
        return Factory.log(numeric(), base);
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> power(Number exponent) {
        return Factory.power(numeric(), exponent);
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> acos() {
        return Factory.acos(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> asin() {
        return Factory.asin(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> atan() {
        return Factory.atan(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> atan2(Number y) {
        return Factory.atan2(numeric(), y);
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> atan2(Field<? extends Number> y) {
        return Factory.atan2(numeric(), y);
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> cos() {
        return Factory.cos(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> sin() {
        return Factory.sin(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> tan() {
        return Factory.tan(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> cot() {
        return Factory.cot(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> sinh() {
        return Factory.sinh(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> cosh() {
        return Factory.cosh(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> tanh() {
        return Factory.tanh(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> coth() {
        return Factory.coth(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> deg() {
        return Factory.deg(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> rad() {
        return Factory.rad(numeric());
    }

    @Override
    @Deprecated
    public final Field<Integer> count() {
        return Factory.count(this);
    }

    @Override
    @Deprecated
    public final Field<Integer> countDistinct() {
        return Factory.countDistinct(this);
    }

    @Override
    @Deprecated
    public final Field<T> max() {
        return Factory.max(this);
    }

    @Override
    @Deprecated
    public final Field<T> min() {
        return Factory.min(this);
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> sum() {
        return Factory.sum(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> avg() {
        return Factory.avg(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> median() {
        return Factory.median(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> stddevPop() {
        return Factory.stddevPop(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> stddevSamp() {
        return Factory.stddevSamp(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> varPop() {
        return Factory.varPop(numeric());
    }

    @Override
    @Deprecated
    public final Field<BigDecimal> varSamp() {
        return Factory.varSamp(numeric());
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<Integer> countOver() {
        return Factory.count(this).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<T> maxOver() {
        return Factory.max(this).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<T> minOver() {
        return Factory.min(this).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<BigDecimal> sumOver() {
        return Factory.sum(numeric()).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<BigDecimal> avgOver() {
        return Factory.avg(numeric()).over();
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> firstValue() {
        return Factory.firstValue(this);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lastValue() {
        return Factory.lastValue(this);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lead() {
        return Factory.lead(this);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lead(int offset) {
        return Factory.lead(this, offset);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lead(int offset, T defaultValue) {
        return Factory.lead(this, offset, defaultValue);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lead(int offset, Field<T> defaultValue) {
        return Factory.lead(this, offset, defaultValue);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lag() {
        return Factory.lag(this);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lag(int offset) {
        return Factory.lag(this, offset);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lag(int offset, T defaultValue) {
        return Factory.lag(this, offset, defaultValue);
    }

    @Override
    @Deprecated
    public final WindowIgnoreNullsStep<T> lag(int offset, Field<T> defaultValue) {
        return Factory.lag(this, offset, defaultValue);
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<BigDecimal> stddevPopOver() {
        return Factory.stddevPop(numeric()).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<BigDecimal> stddevSampOver() {
        return Factory.stddevSamp(numeric()).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<BigDecimal> varPopOver() {
        return Factory.varPop(numeric()).over();
    }

    @Override
    @Deprecated
    public final WindowPartitionByStep<BigDecimal> varSampOver() {
        return Factory.varSamp(numeric()).over();
    }

    @Override
    @Deprecated
    public final Field<String> upper() {
        return Factory.upper(varchar());
    }

    @Override
    @Deprecated
    public final Field<String> lower() {
        return Factory.lower(varchar());
    }

    @Override
    @Deprecated
    public final Field<String> trim() {
        return Factory.trim(varchar());
    }

    @Override
    @Deprecated
    public final Field<String> rtrim() {
        return Factory.rtrim(varchar());
    }

    @Override
    @Deprecated
    public final Field<String> ltrim() {
        return Factory.ltrim(varchar());
    }

    @Override
    @Deprecated
    public final Field<String> rpad(Field<? extends Number> length) {
        return Factory.rpad(varchar(), length);
    }

    @Override
    @Deprecated
    public final Field<String> rpad(int length) {
        return Factory.rpad(varchar(), length);
    }

    @Override
    @Deprecated
    public final Field<String> rpad(Field<? extends Number> length, Field<String> character) {
        return Factory.rpad(varchar(), length, character);
    }

    @Override
    @Deprecated
    public final Field<String> rpad(int length, char character) {
        return Factory.rpad(varchar(), length, character);
    }

    @Override
    @Deprecated
    public final Field<String> lpad(Field<? extends Number> length) {
        return Factory.lpad(varchar(), length);
    }

    @Override
    @Deprecated
    public final Field<String> lpad(int length) {
        return Factory.lpad(varchar(), length);
    }

    @Override
    @Deprecated
    public final Field<String> lpad(Field<? extends Number> length, Field<String> character) {
        return Factory.lpad(varchar(), length, character);
    }

    @Override
    @Deprecated
    public final Field<String> lpad(int length, char character) {
        return Factory.lpad(varchar(), length, character);
    }

    @Override
    @Deprecated
    public final Field<String> repeat(Number count) {
        return Factory.repeat(varchar(), count == null ? 0 : count.intValue());
    }

    @Override
    @Deprecated
    public final Field<String> repeat(Field<? extends Number> count) {
        return Factory.repeat(varchar(), count);
    }

    @Override
    @Deprecated
    public final Field<String> replace(Field<String> search) {
        return Factory.replace(varchar(), search);
    }

    @Override
    @Deprecated
    public final Field<String> replace(String search) {
        return Factory.replace(varchar(), search);
    }

    @Override
    @Deprecated
    public final Field<String> replace(Field<String> search, Field<String> replace) {
        return Factory.replace(varchar(), search, replace);
    }

    @Override
    @Deprecated
    public final Field<String> replace(String search, String replace) {
        return Factory.replace(varchar(), search, replace);
    }

    @Override
    @Deprecated
    public final Field<Integer> position(String search) {
        return Factory.position(varchar(), search);
    }

    @Override
    @Deprecated
    public final Field<Integer> position(Field<String> search) {
        return Factory.position(varchar(), search);
    }

    @Override
    @Deprecated
    public final Field<Integer> ascii() {
        return Factory.ascii(varchar());
    }

    @Override
    @Deprecated
    public final Field<String> concat(Field<?>... fields) {
        return Factory.concat(Util.combine(this, fields));
    }

    @Override
    @Deprecated
    public final Field<String> concat(String... values) {
        return Factory.concat(Util.combine(this, vals((Object[]) values).toArray(new Field[0])));
    }

    @Override
    @Deprecated
    public final Field<String> substring(int startingPosition) {
        return Factory.substring(varchar(), startingPosition);
    }

    @Override
    @Deprecated
    public final Field<String> substring(Field<? extends Number> startingPosition) {
        return Factory.substring(varchar(), startingPosition);
    }

    @Override
    @Deprecated
    public final Field<String> substring(int startingPosition, int length) {
        return Factory.substring(varchar(), startingPosition, length);
    }

    @Override
    @Deprecated
    public final Field<String> substring(Field<? extends Number> startingPosition, Field<? extends Number> length) {
        return Factory.substring(varchar(), startingPosition, length);
    }

    @Override
    @Deprecated
    public final Field<Integer> length() {
        return Factory.length(varchar());
    }

    @Override
    @Deprecated
    public final Field<Integer> charLength() {
        return Factory.charLength(varchar());
    }

    @Override
    @Deprecated
    public final Field<Integer> bitLength() {
        return Factory.bitLength(varchar());
    }

    @Override
    @Deprecated
    public final Field<Integer> octetLength() {
        return Factory.octetLength(varchar());
    }

    @Override
    @Deprecated
    public final Field<Integer> extract(DatePart datePart) {
        return Factory.extract(date(), datePart);
    }

    @Override
    @Deprecated
    public final Field<T> greatest(T... others) {
        return Factory.greatest(this, vals(others).toArray(new Field[0]));
    }

    @Override
    @Deprecated
    public final Field<T> greatest(Field<?>... others) {
        return Factory.greatest(this, others);
    }

    @Override
    @Deprecated
    public final Field<T> least(T... others) {
        return Factory.least(this, vals(others).toArray(new Field[0]));
    }

    @Override
    @Deprecated
    public final Field<T> least(Field<?>... others) {
        return Factory.least(this, others);
    }

    @Override
    @Deprecated
    public final Field<T> nvl(T defaultValue) {
        return Factory.nvl(this, defaultValue);
    }

    @Override
    @Deprecated
    public final Field<T> nvl(Field<T> defaultValue) {
        return Factory.nvl(this, defaultValue);
    }

    @Override
    @Deprecated
    public final <Z> Field<Z> nvl2(Z valueIfNotNull, Z valueIfNull) {
        return Factory.nvl2(this, valueIfNotNull, valueIfNull);
    }

    @Override
    @Deprecated
    public final <Z> Field<Z> nvl2(Field<Z> valueIfNotNull, Field<Z> valueIfNull) {
        return Factory.nvl2(this, valueIfNotNull, valueIfNull);
    }

    @Override
    @Deprecated
    public final Field<T> nullif(T other) {
        return Factory.nullif(this, other);
    }

    @Override
    @Deprecated
    public final Field<T> nullif(Field<T> other) {
        return Factory.nullif(this, other);
    }

    @Override
    @Deprecated
    public final <Z> Field<Z> decode(T search, Z result) {
        return Factory.decode(this, search, result);
    }

    @Override
    @Deprecated
    public final <Z> Field<Z> decode(T search, Z result, Object... more) {
        return Factory.decode(this, search, result, more);
    }

    @Override
    @Deprecated
    public final <Z> Field<Z> decode(Field<T> search, Field<Z> result) {
        return Factory.decode(this, search, result);
    }

    @Override
    @Deprecated
    public final <Z> Field<Z> decode(Field<T> search, Field<Z> result, Field<?>... more) {
        return Factory.decode(this, search, result, more);
    }

    @Override
    @Deprecated
    public final Field<T> coalesce(T option, T... options) {
        return Factory.coalesce(this, Util.combine(val(option), vals(options).toArray(new Field[0])));
    }

    @Override
    @Deprecated
    public final Field<T> coalesce(Field<T> option, Field<?>... options) {
        return Factory.coalesce(this, Util.combine(option, options));
    }
}
