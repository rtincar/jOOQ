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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;

import org.jooq.AttachableInternal;
import org.jooq.Configuration;
import org.jooq.Store;
import org.jooq.tools.Convert;

/**
 * @author Lukas Eder
 */
abstract class AbstractStore<T> implements Store<T>, AttachableInternal {

    /**
     * Generated UID
     */
    private static final long    serialVersionUID = -2989496800221194411L;

    private final AttachableImpl attachable;

    AbstractStore() {
        this(null);
    }

    AbstractStore(Configuration configuration) {
        this.attachable = new AttachableImpl(this, configuration);
    }

    // -------------------------------------------------------------------------
    // The Attachable API
    // -------------------------------------------------------------------------

    @Override
    public final <I> I internalAPI(Class<I> internalType) throws ClassCastException {
        return internalType.cast(this);
    }

    @Override
    public final void attach(Configuration configuration) {
        attachable.attach(configuration);
    }

    @Override
    public final Configuration getConfiguration() {
        return attachable.getConfiguration();
    }

    /**
     * This method is used in generated code!
     */
    protected final Factory create() {
        return Factory.getNewFactory(getConfiguration());
    }

    // -------------------------------------------------------------------------
    // The Store API
    // -------------------------------------------------------------------------

    @Override
    public final T getValue(int index, T defaultValue) throws IllegalArgumentException {
        final T result = getValue(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final BigDecimal getValueAsBigDecimal(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), BigDecimal.class);
    }

    @Override
    public final BigDecimal getValueAsBigDecimal(int index, BigDecimal defaultValue) throws IllegalArgumentException {
        final BigDecimal result = getValueAsBigDecimal(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Boolean getValueAsBoolean(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Boolean.class);
    }

    @Override
    public final Boolean getValueAsBoolean(int index, Boolean defaultValue) throws IllegalArgumentException {
        final Boolean result = getValueAsBoolean(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final BigInteger getValueAsBigInteger(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), BigInteger.class);
    }

    @Override
    public final BigInteger getValueAsBigInteger(int index, BigInteger defaultValue) throws IllegalArgumentException {
        final BigInteger result = getValueAsBigInteger(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Byte getValueAsByte(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Byte.class);
    }

    @Override
    public final Byte getValueAsByte(int index, Byte defaultValue) throws IllegalArgumentException {
        final Byte result = getValueAsByte(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Date getValueAsDate(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Date.class);
    }

    @Override
    public final Date getValueAsDate(int index, Date defaultValue) throws IllegalArgumentException {
        final Date result = getValueAsDate(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Double getValueAsDouble(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Double.class);
    }

    @Override
    public final Double getValueAsDouble(int index, Double defaultValue) throws IllegalArgumentException {
        final Double result = getValueAsDouble(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Float getValueAsFloat(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Float.class);
    }

    @Override
    public final Float getValueAsFloat(int index, Float defaultValue) throws IllegalArgumentException {
        final Float result = getValueAsFloat(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Integer getValueAsInteger(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Integer.class);
    }

    @Override
    public final Integer getValueAsInteger(int index, Integer defaultValue) throws IllegalArgumentException {
        final Integer result = getValueAsInteger(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Long getValueAsLong(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Long.class);
    }

    @Override
    public final Long getValueAsLong(int index, Long defaultValue) throws IllegalArgumentException {
        final Long result = getValueAsLong(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Short getValueAsShort(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Short.class);
    }

    @Override
    public final Short getValueAsShort(int index, Short defaultValue) throws IllegalArgumentException {
        final Short result = getValueAsShort(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final String getValueAsString(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), String.class);
    }

    @Override
    public final String getValueAsString(int index, String defaultValue) throws IllegalArgumentException {
        final String result = getValueAsString(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Time getValueAsTime(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Time.class);
    }

    @Override
    public final Time getValueAsTime(int index, Time defaultValue) throws IllegalArgumentException {
        final Time result = getValueAsTime(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Timestamp getValueAsTimestamp(int index) throws IllegalArgumentException {
        return Convert.convert(getValue(index), Timestamp.class);
    }

    @Override
    public final Timestamp getValueAsTimestamp(int index, Timestamp defaultValue) throws IllegalArgumentException {
        final Timestamp result = getValueAsTimestamp(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final <Z> Z getValue(int index, Class<? extends Z> type) throws IllegalArgumentException {
        return Convert.convert(getValue(index), type);
    }

    @Override
    public final <Z> Z getValue(int index, Class<? extends Z> type, Z defaultValue) throws IllegalArgumentException {
        final Z result = getValue(index, type);
        return result == null ? defaultValue : result;
    }

    // -------------------------------------------------------------------------
    // equals and hashCode
    // -------------------------------------------------------------------------

    @Override
    public int hashCode() {
        int hashCode = 1;

        for (int i = 0; i < size(); i++) {
            final Object obj = getValue(i);
            hashCode = 31 * hashCode + (obj == null ? 0 : obj.hashCode());
        }

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Store) {
            final Store<?> that = (Store<?>) obj;

            if (size() == that.size()) {
                for (int i = 0; i < size(); i++) {
                    final Object thisValue = getValue(i);
                    final Object thatValue = that.getValue(i);

                    if (thisValue == null || thatValue == null) {
                        return thisValue == thatValue;
                    }

                    // [#985] Compare arrays too.
                    else if (thisValue.getClass().isArray() && thatValue.getClass().isArray()) {

                        // Might be byte[]
                        if (thisValue.getClass() == byte[].class && thatValue.getClass() == byte[].class) {
                            return Arrays.equals((byte[]) thisValue, (byte[]) thatValue);
                        }

                        // Other primitive types are not expected
                        else if (!thisValue.getClass().getComponentType().isPrimitive() &&
                                 !thatValue.getClass().getComponentType().isPrimitive()) {
                            return Arrays.equals((Object[]) thisValue, (Object[]) thatValue);
                        }

                        else {
                            return false;
                        }
                    }
                    else if (!thisValue.equals(thatValue)) {
                        return false;
                    }
                }

                return true;
            }
        }

        return false;
    }
}
