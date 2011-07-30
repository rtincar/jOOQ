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

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Attachable;
import org.jooq.BindContext;
import org.jooq.RenderContext;
import org.jooq.SQLDialect;
import org.jooq.Schema;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;

/**
 * @author Lukas Eder
 */
public class SchemaImpl extends AbstractNamedQueryPart implements Schema {

    private static final long           serialVersionUID = -8101463810207566546L;

    private final Map<String, Class<?>> typeMapping;

    /**
     * @deprecated - 1.6.1 [#453] - Regenerate your schema
     */
    @SuppressWarnings("unused")
    @Deprecated
    public SchemaImpl(SQLDialect dialect, String name) {
        this(name);
    }

    public SchemaImpl(String name) {
        super(name);

        this.typeMapping = new HashMap<String, Class<?>>();
    }

    @Override
    public final List<Attachable> getAttachables() {
        return Collections.emptyList();
    }

    @Override
    public final void bind(BindContext context) throws SQLException {}

    @Override
    public final void toSQL(RenderContext context) {
        context.literal(getName());
    }

    @Override
    public final Map<String, Class<?>> getTypeMapping() throws SQLException {
        return Collections.unmodifiableMap(typeMapping);
    }

    protected final void addMapping(String name, Class<?> type) {
        typeMapping.put(name, type);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Subclasses should override this method
     */
    @Override
    public List<Table<?>> getTables() {
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Subclasses should override this method
     */
    @Override
    public List<UDT<?>> getUDTs() {
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Subclasses should override this method
     */
    @Override
    public List<Sequence> getSequences() {
        return Collections.emptyList();
    }
}