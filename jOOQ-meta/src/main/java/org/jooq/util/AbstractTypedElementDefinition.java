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
package org.jooq.util;

import org.jooq.DataType;
import org.jooq.exception.SQLDialectNotSupportedException;
import org.jooq.impl.FieldTypeHelper;
import org.jooq.tools.JooqLogger;
import org.jooq.tools.StringUtils;

abstract class AbstractTypedElementDefinition<T extends Definition>
    extends AbstractDefinition
    implements TypedElementDefinition<T> {

    private static final JooqLogger      log = JooqLogger.getLogger(AbstractTypedElementDefinition.class);

    private final T                      container;
    private final DataTypeDefinition     definedType;
    private transient DataTypeDefinition type;

    public AbstractTypedElementDefinition(T container, String name, int position, DataTypeDefinition definedType, String comment) {
        super(container.getDatabase(), protectName(container.getName(), name, position), comment);

        this.container = container;
        this.definedType = definedType;
    }

    private static String protectName(String table, String name, int position) {
        if (name == null) {
            log.warn("Missing name", "Object " + table + " holds a column without a name at position " + position);
            return "_" + position;
        }

        return name;
    }

    @Override
    public final T getContainer() {
        return container;
    }

    @Override
    public DataTypeDefinition getType() {
        if (type == null) {
            Database db = container.getDatabase();

            for (String property : db.getPropertyNames()) {
                if (property.startsWith("generator.database.forced-type.")) {
                    if (getQualifiedName().matches(db.getProperty(property))) {
                        String forcedType = property.replace("generator.database.forced-type.", "");

                        log.debug("Forcing type", this + " into " + forcedType);
                        DataType<?> forcedDataType = null;

                        String t = definedType.getType();
                        int p = definedType.getPrecision();
                        int s = definedType.getScale();

                        try {
                            forcedDataType = FieldTypeHelper.getDialectDataType(db.getDialect(), forcedType, p, s);
                        } catch (SQLDialectNotSupportedException ignore) {}

                        // [#677] SQLDataType matches are actual type-rewrites
                        if (forcedDataType != null) {
                            type = new DefaultDataTypeDefinition(db, forcedType, p, s);
                        }

                        // Other forced types are UDT's, enums, etc.
                        else {
                            type = new DefaultDataTypeDefinition(db, t, p, s, forcedType);
                        }
                    }
                }
            }

            // If not yet set, use the default defined type
            if (type == null) {
                type = definedType;
            }
        }

        return type;
    }

    @Override
    public final String getQualifiedName() {
        if (StringUtils.isBlank(getSchemaName())) {
            return getContainer().getName() + "." + getName();
        }
        else {
            return getSchemaName() + "." + getContainer().getName() + "." + getName();
        }
    }
}
