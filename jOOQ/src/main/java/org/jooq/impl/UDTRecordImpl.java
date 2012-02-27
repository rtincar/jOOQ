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

import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.UDT;
import org.jooq.UDTRecord;

/**
 * A record implementation for a record originating from a single UDT
 * <p>
 * This type is for JOOQ INTERNAL USE only. Do not reference directly
 *
 * @author Lukas Eder
 */
public class UDTRecordImpl<R extends UDTRecord<R>> extends TypeRecord<UDT<R>> implements UDTRecord<R> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = 5671315498175872799L;

    public UDTRecordImpl(UDT<R> udt) {
        super(udt);
    }

    @Override
    public final UDT<R> getUDT() {
        return getType0();
    }

    @Override
    public final String getSQLTypeName() throws SQLException {
        return getUDT().getName();
    }

    @Override
    public final void readSQL(SQLInput stream, String typeName) throws SQLException {
        Factory configuration = Factory.getNewFactory(getUDT().getDataType().getDialect());

        for (Field<?> field : getUDT().getFields()) {
            setValue(configuration, stream, field);
        }
    }

    private final <T> void setValue(Configuration configuration, SQLInput stream, Field<T> field) throws SQLException {
        setValue(field, FieldTypeHelper.getFromSQLInput(configuration, stream, field));
    }

    @Override
    public final void writeSQL(SQLOutput stream) throws SQLException {
        for (Field<?> field : getUDT().getFields()) {
            setValue(stream, field);
        }
    }

    private final <T> void setValue(SQLOutput stream, Field<T> field) throws SQLException {
        FieldTypeHelper.writeToSQLOutput(stream, field, getValue(field));
    }
}
