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

import static org.jooq.impl.Factory.condition;
import static org.jooq.impl.Factory.exists;
import static org.jooq.impl.Factory.notExists;
import static org.jooq.impl.Factory.table;

import java.util.Arrays;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JoinType;
import org.jooq.Operator;
import org.jooq.Param;
import org.jooq.Record;
import org.jooq.Select;
import org.jooq.SelectConditionStep;
import org.jooq.SelectConnectByConditionStep;
import org.jooq.SelectForUpdateOfStep;
import org.jooq.SelectHavingConditionStep;
import org.jooq.SelectJoinStep;
import org.jooq.SelectOffsetStep;
import org.jooq.SelectOnConditionStep;
import org.jooq.SelectOnStep;
import org.jooq.SelectQuery;
import org.jooq.SelectSelectStep;
import org.jooq.SortField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableLike;
import org.jooq.exception.DataAccessException;

/**
 * A wrapper for a {@link SelectQuery}
 *
 * @author Lukas Eder
 */
class SelectImpl extends AbstractDelegatingSelect<Record> implements

    // Cascading interface implementations for Select behaviour
    SelectSelectStep,
    SelectOnStep,
    SelectOnConditionStep,
    SelectConditionStep,
    SelectConnectByConditionStep,
    SelectHavingConditionStep,
    SelectOffsetStep,
    SelectForUpdateOfStep {

    /**
     * Generated UID
     */
    private static final long               serialVersionUID = -5425308887382166448L;

    /**
     * A temporary member holding a join table
     */
    private transient TableLike<?>          joinTable;

    /**
     * A temporary member holding a join type
     */
    private transient JoinType              joinType;

    /**
     * A temporary member holding a join condition
     */
    private transient ConditionProviderImpl joinConditions;

    /**
     * The step that is currently receiving new conditions
     */
    private transient ConditionStep         conditionStep;

    /**
     * The limit that has been added in a limit(int).offset(int) construct
     */
    private transient Integer               limit;
    private transient Param<Integer>        limitParam;

    SelectImpl(Configuration configuration) {
        this(configuration, false);
    }

    SelectImpl(Configuration configuration, boolean distinct) {
        this(new SelectQueryImpl(configuration, distinct));
    }

    SelectImpl(Select<Record> query) {
        super(query);
    }

    @Override
    public final SelectQuery getQuery() {
        return (SelectQuery) getDelegate();
    }

    @Override
    public final SelectImpl select(Field<?>... fields) {
        getQuery().addSelect(fields);
        return this;
    }

    @Override
    public final SelectImpl select(Collection<? extends Field<?>> fields) {
        getQuery().addSelect(fields);
        return this;
    }

    @Override
    public final SelectImpl hint(String hint) {
        getQuery().addHint(hint);
        return this;
    }

    @Override
    public final SelectImpl from(TableLike<?>... tables) {
        getQuery().addFrom(tables);
        return this;
    }

    @Override
    public final SelectImpl from(Collection<? extends TableLike<?>> tables) {
        getQuery().addFrom(tables);
        return this;
    }

    @Override
    public final SelectImpl from(String sql) {
        return from(table(sql));
    }

    @Override
    public final SelectImpl from(String sql, Object... bindings) {
        return from(table(sql, bindings));
    }

    @Override
    public final SelectImpl where(Condition... conditions) {
        conditionStep = ConditionStep.WHERE;
        getQuery().addConditions(conditions);
        return this;
    }

    @Override
    public final SelectImpl where(Collection<Condition> conditions) {
        conditionStep = ConditionStep.WHERE;
        getQuery().addConditions(conditions);
        return this;
    }

    @Override
    public final SelectImpl where(String sql) {
        return where(condition(sql));
    }

    @Override
    public final SelectImpl where(String sql, Object... bindings) {
        return where(condition(sql, bindings));
    }

    @Override
    public final SelectImpl whereExists(Select<?> select) {
        conditionStep = ConditionStep.WHERE;
        return andExists(select);
    }

    @Override
    public final SelectImpl whereNotExists(Select<?> select) {
        conditionStep = ConditionStep.WHERE;
        return andNotExists(select);
    }

    @Override
    public final SelectImpl and(Condition condition) {
        switch (conditionStep) {
            case WHERE:
                getQuery().addConditions(condition);
                break;
            case CONNECT_BY:
                getQuery().addConnectBy(condition);
                break;
            case HAVING:
                getQuery().addHaving(condition);
                break;
            case ON:
                joinConditions.addConditions(condition);
                break;
        }

        return this;
    }

    @Override
    public final SelectImpl and(String sql) {
        return and(condition(sql));
    }

    @Override
    public final SelectImpl and(String sql, Object... bindings) {
        return and(condition(sql, bindings));
    }

    @Override
    public final SelectImpl andNot(Condition condition) {
        return and(condition.not());
    }

    @Override
    public final SelectImpl andExists(Select<?> select) {
        return and(exists(select));
    }

    @Override
    public final SelectImpl andNotExists(Select<?> select) {
        return and(notExists(select));
    }

    @Override
    public final SelectImpl or(Condition condition) {
        switch (conditionStep) {
            case WHERE:
                getQuery().addConditions(Operator.OR, condition);
                break;
            case CONNECT_BY:
                throw new IllegalStateException("Cannot connect conditions for the CONNECT BY clause using the OR operator");
            case HAVING:
                getQuery().addHaving(Operator.OR, condition);
                break;
            case ON:
                joinConditions.addConditions(Operator.OR, condition);
                break;
        }

        return this;
    }

    @Override
    public final SelectImpl or(String sql) {
        return or(condition(sql));
    }

    @Override
    public final SelectImpl or(String sql, Object... bindings) {
        return or(condition(sql, bindings));
    }

    @Override
    public final SelectImpl orNot(Condition condition) {
        return or(condition.not());
    }

    @Override
    public final SelectImpl orExists(Select<?> select) {
        return or(exists(select));
    }

    @Override
    public final SelectImpl orNotExists(Select<?> select) {
        return or(notExists(select));
    }

    @Override
    public final SelectImpl connectBy(Condition condition) {
        conditionStep = ConditionStep.CONNECT_BY;
        getQuery().addConnectBy(condition);
        return this;
    }

    @Override
    public final SelectImpl connectBy(String sql) {
        return connectBy(condition(sql));
    }

    @Override
    public final SelectImpl connectBy(String sql, Object... bindings) {
        return connectBy(condition(sql, bindings));
    }

    @Override
    public final SelectImpl connectByNoCycle(Condition condition) {
        conditionStep = ConditionStep.CONNECT_BY;
        getQuery().addConnectByNoCycle(condition);
        return this;
    }

    @Override
    public final SelectImpl connectByNoCycle(String sql) {
        return connectByNoCycle(condition(sql));
    }

    @Override
    public final SelectImpl connectByNoCycle(String sql, Object... bindings) {
        return connectByNoCycle(condition(sql, bindings));
    }

    @Override
    public final SelectImpl startWith(Condition condition) {
        getQuery().setConnectByStartWith(condition);
        return this;
    }

    @Override
    public final SelectImpl startWith(String sql) {
        return startWith(condition(sql));
    }

    @Override
    public final SelectImpl startWith(String sql, Object... bindings) {
        return startWith(condition(sql, bindings));
    }

    @Override
    public final SelectImpl groupBy(Field<?>... fields) {
        getQuery().addGroupBy(fields);
        return this;
    }

    @Override
    public final SelectImpl groupBy(Collection<? extends Field<?>> fields) {
        getQuery().addGroupBy(fields);
        return this;
    }

    @Override
    public final SelectImpl orderBy(Field<?>... fields) {
        getQuery().addOrderBy(fields);
        return this;
    }

    @Override
    public final SelectImpl orderBy(SortField<?>... fields) {
        getQuery().addOrderBy(fields);
        return this;
    }

    @Override
    public final SelectImpl orderBy(Collection<SortField<?>> fields) {
        getQuery().addOrderBy(fields);
        return this;
    }

    @Override
    public final SelectImpl orderBy(int... fieldIndexes) {
        getQuery().addOrderBy(fieldIndexes);
        return this;
    }

    @Override
    public final SelectImpl limit(int numberOfRows) {
        this.limit = numberOfRows;
        this.limitParam = null;
        getQuery().addLimit(numberOfRows);
        return this;
    }

    @Override
    public final SelectImpl limit(Param<Integer> numberOfRows) {
        this.limit = null;
        this.limitParam = numberOfRows;
        getQuery().addLimit(numberOfRows);
        return this;
    }

    @Override
    public final SelectImpl limit(int offset, int numberOfRows) {
        getQuery().addLimit(offset, numberOfRows);
        return this;
    }

    @Override
    public final SelectImpl limit(int offset, Param<Integer> numberOfRows) {
        getQuery().addLimit(offset, numberOfRows);
        return this;
    }

    @Override
    public final SelectImpl limit(Param<Integer> offset, int numberOfRows) {
        getQuery().addLimit(offset, numberOfRows);
        return this;
    }

    @Override
    public final SelectImpl limit(Param<Integer> offset, Param<Integer> numberOfRows) {
        getQuery().addLimit(offset, numberOfRows);
        return this;
    }

    @Override
    public final SelectImpl offset(int offset) {
        if (limit != null) {
            getQuery().addLimit(offset, limit);
        }
        else if (limitParam != null) {
            getQuery().addLimit(offset, limitParam);
        }

        return this;
    }

    @Override
    public final SelectImpl offset(Param<Integer> offset) {
        if (limit != null) {
            getQuery().addLimit(offset, limit);
        }
        else if (limitParam != null) {
            getQuery().addLimit(offset, limitParam);
        }

        return this;
    }

    @Override
    public final SelectImpl forUpdate() {
        getQuery().setForUpdate(true);
        return this;
    }

    @Override
    public final SelectImpl of(Field<?>... fields) {
        getQuery().setForUpdateOf(fields);
        return this;
    }

    @Override
    public final SelectImpl of(Collection<Field<?>> fields) {
        getQuery().setForUpdateOf(fields);
        return this;
    }

    @Override
    public final SelectImpl of(Table<?>... tables) {
        getQuery().setForUpdateOf(tables);
        return this;
    }

    @Override
    public final SelectImpl wait(int seconds) {
        getQuery().setForUpdateWait(seconds);
        return this;
    }

    @Override
    public final SelectImpl noWait() {
        getQuery().setForUpdateNoWait();
        return this;
    }

    @Override
    public final SelectImpl skipLocked() {
        getQuery().setForUpdateSkipLocked();
        return this;
    }

    @Override
    public final SelectImpl forShare() {
        getQuery().setForShare(true);
        return this;
    }

    @Override
    public final SelectImpl union(Select<Record> select) {
        return new SelectImpl(getDelegate().union(select));
    }

    @Override
    public final SelectImpl unionAll(Select<Record> select) {
        return new SelectImpl(getDelegate().unionAll(select));
    }

    @Override
    public final SelectImpl except(Select<Record> select) {
        return new SelectImpl(getDelegate().except(select));
    }

    @Override
    public final SelectImpl intersect(Select<Record> select) {
        return new SelectImpl(getDelegate().intersect(select));
    }

    @Override
    public final SelectImpl having(Condition... conditions) {
        conditionStep = ConditionStep.HAVING;
        getQuery().addHaving(conditions);
        return this;
    }

    @Override
    public final SelectImpl having(Collection<Condition> conditions) {
        conditionStep = ConditionStep.HAVING;
        getQuery().addHaving(conditions);
        return this;
    }

    @Override
    public final SelectImpl having(String sql) {
        return having(condition(sql));
    }

    @Override
    public final SelectImpl having(String sql, Object... bindings) {
        return having(condition(sql, bindings));
    }

    @Override
    public final SelectImpl on(Condition... conditions) {
        conditionStep = ConditionStep.ON;
        joinConditions = new ConditionProviderImpl();
        joinConditions.addConditions(conditions);
        getQuery().addJoin(joinTable, joinType, joinConditions);
        joinTable = null;
        joinType = null;
        return this;
    }

    @Override
    public final SelectImpl on(String sql) {
        return on(condition(sql));
    }

    @Override
    public final SelectImpl on(String sql, Object... bindings) {
        return on(condition(sql, bindings));
    }

    @Override
    public final SelectImpl onKey() throws DataAccessException {
        conditionStep = ConditionStep.ON;
        getQuery().addJoinOnKey(joinTable, joinType);
        joinTable = null;
        joinType = null;
        return this;
    }

    @Override
    public final SelectImpl onKey(TableField<?, ?>... keyFields) throws DataAccessException {
        conditionStep = ConditionStep.ON;
        getQuery().addJoinOnKey(joinTable, joinType, keyFields);
        joinTable = null;
        joinType = null;
        return this;
    }

    @Override
    public final SelectImpl onKey(ForeignKey<?, ?> key) {
        conditionStep = ConditionStep.ON;
        getQuery().addJoinOnKey(joinTable, joinType, key);
        joinTable = null;
        joinType = null;
        return this;

    }

    @Override
    public final SelectImpl using(Field<?>... fields) {
        return using(Arrays.asList(fields));
    }

    @Override
    public final SelectImpl using(Collection<? extends Field<?>> fields) {
        getQuery().addJoinUsing(joinTable, joinType, fields);
        joinTable = null;
        joinType = null;
        return this;
    }

    @Override
    public final SelectImpl join(TableLike<?> table) {
        return join0(table, JoinType.JOIN);
    }

    @Override
    public final SelectImpl leftOuterJoin(TableLike<?> table) {
        return join0(table, JoinType.LEFT_OUTER_JOIN);
    }

    @Override
    public final SelectImpl rightOuterJoin(TableLike<?> table) {
        return join0(table, JoinType.RIGHT_OUTER_JOIN);
    }

    @Override
    public final SelectOnStep fullOuterJoin(TableLike<?> table) {
        return join0(table, JoinType.FULL_OUTER_JOIN);
    }

    private final SelectImpl join0(TableLike<?> table, JoinType type) {
        conditionStep = ConditionStep.ON;
        joinTable = table;
        joinType = type;
        joinConditions = null;
        return this;
    }

    @Override
    public final SelectJoinStep crossJoin(TableLike<?> table) {
        return simpleJoin0(table, JoinType.CROSS_JOIN);
    }

    @Override
    public final SelectImpl naturalJoin(TableLike<?> table) {
        return simpleJoin0(table, JoinType.NATURAL_JOIN);
    }

    @Override
    public final SelectImpl naturalLeftOuterJoin(TableLike<?> table) {
        return simpleJoin0(table, JoinType.NATURAL_LEFT_OUTER_JOIN);
    }

    @Override
    public final SelectImpl naturalRightOuterJoin(TableLike<?> table) {
        return simpleJoin0(table, JoinType.NATURAL_RIGHT_OUTER_JOIN);
    }

    private final SelectImpl simpleJoin0(TableLike<?> table, JoinType type) {
        getQuery().addJoin(table, type);
        joinTable = null;
        joinType = null;
        return this;
    }

    @Override
    public final SelectImpl join(String sql) {
        return join(table(sql));
    }

    @Override
    public final SelectImpl join(String sql, Object... bindings) {
        return join(table(sql, bindings));
    }

    @Override
    public final SelectImpl leftOuterJoin(String sql) {
        return leftOuterJoin(table(sql));
    }

    @Override
    public final SelectImpl leftOuterJoin(String sql, Object... bindings) {
        return leftOuterJoin(table(sql, bindings));
    }

    @Override
    public final SelectImpl rightOuterJoin(String sql) {
        return rightOuterJoin(table(sql));
    }

    @Override
    public final SelectImpl rightOuterJoin(String sql, Object... bindings) {
        return rightOuterJoin(table(sql, bindings));
    }

    @Override
    public final SelectOnStep fullOuterJoin(String sql) {
        return fullOuterJoin(table(sql));
    }

    @Override
    public final SelectOnStep fullOuterJoin(String sql, Object... bindings) {
        return fullOuterJoin(table(sql, bindings));
    }

    @Override
    public final SelectJoinStep crossJoin(String sql) {
        return crossJoin(table(sql));
    }

    @Override
    public final SelectJoinStep crossJoin(String sql, Object... bindings) {
        return crossJoin(table(sql, bindings));
    }

    @Override
    public final SelectImpl naturalJoin(String sql) {
        return naturalJoin(table(sql));
    }

    @Override
    public final SelectImpl naturalJoin(String sql, Object... bindings) {
        return naturalJoin(table(sql, bindings));
    }

    @Override
    public final SelectImpl naturalLeftOuterJoin(String sql) {
        return naturalLeftOuterJoin(table(sql));
    }

    @Override
    public final SelectImpl naturalLeftOuterJoin(String sql, Object... bindings) {
        return naturalLeftOuterJoin(table(sql, bindings));
    }

    @Override
    public final SelectImpl naturalRightOuterJoin(String sql) {
        return naturalRightOuterJoin(table(sql));
    }

    @Override
    public final SelectImpl naturalRightOuterJoin(String sql, Object... bindings) {
        return naturalRightOuterJoin(table(sql, bindings));
    }

    /**
     * The {@link SelectImpl} current condition step
     * <p>
     * This enumeration models the step that is currently receiving new
     * conditions via the {@link SelectImpl#and(Condition)},
     * {@link SelectImpl#or(Condition)}, etc methods
     *
     * @author Lukas Eder
     */
    private static enum ConditionStep {

        /**
         * Additional conditions go to the <code>JOIN</code> clause that is
         * currently being added.
         */
        ON,

        /**
         * Additional conditions go to the <code>WHERE</code> clause that is
         * currently being added.
         */
        WHERE,

        /**
         * Additional conditions go to the <code>CONNECT BY</code> clause that
         * is currently being added.
         */
        CONNECT_BY,

        /**
         * Additional conditions go to the <code>HAVING</code> clause that is
         * currently being added.
         */
        HAVING
    }
}
