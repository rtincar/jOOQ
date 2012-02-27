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

import java.io.Serializable;

class Value<T> implements Serializable {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -9065797545428164533L;
    private T                 value;
    private boolean           isChanged;

    Value(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    T getValue(T defaultValue) {
        return value != null ? value : defaultValue;
    }

    void setValue(T val) {

        // The flag is always set to true:
        // [#945] To avoid bugs resulting from setting the same value twice
        // [#948] To allow for controlling the number of hard-parses
        //        To allow for explicitly overriding default values
        setValue(val, false);
    }

    void setValue(T val, boolean primaryKey) {

        // [#948] Force setting of val in most cases, to allow for controlling
        // the number of necessary hard-parses, and to allow for explicitly
        // overriding default values with null
        if (!primaryKey) {
            isChanged = true;
        }

        // [#979] Avoid modifying isChanged on unchanged primary key values
        else {

            // [#945] Be sure that isChanged is never reset to false
            if (value == null) {
                isChanged |= val != null;
            }
            else {
                isChanged |= !value.equals(val);
            }
        }

        value = val;
    }

    boolean isChanged() {
        return isChanged;
    }

    void setChanged(boolean isChanged) {
        this.isChanged = isChanged;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value<?>) {
            Value<?> other = (Value<?>) obj;

            if (value == null) {
                return other.getValue() == null;
            }

            return value.equals(other.getValue());
        }

        return false;
    }

    @Override
    public int hashCode() {
        if (value == null) {
            return 0;
        }

        return value.hashCode();
    }

    @Override
    public String toString() {
        if (isChanged) {
            return "*" + value;
        }
        else {
            return "" + value;
        }
    }
}
