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

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.SchemaMapping;
import org.jooq.conf.Settings;

/**
 * The default configuration, if no other configuration is supplied
 *
 * @author Lukas Eder
 */
final class DefaultConfiguration implements Configuration {

    /**
     * Generated UID
     */
    private static final long  serialVersionUID      = -5746537675969065088L;

    static final Configuration DEFAULT_CONFIGURATION = new DefaultConfiguration();

    @SuppressWarnings("deprecation")
    @Override
    public SQLDialect getDialect() {
        return SQLDialect.SQL99;
    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    @Deprecated
    public org.jooq.SchemaMapping getSchemaMapping() {
        return SchemaMapping.NO_MAPPING;
    }

    @Override
    public Settings getSettings() {
        return new Settings();
    }

    @Override
    public Map<String, Object> getData() {
        return new HashMap<String, Object>();
    }

    @Override
    public Object getData(String key) {
        return null;
    }

    @Override
    public Object setData(String key, Object value) {
        return null;
    }

    /**
     * No further instances
     */
    private DefaultConfiguration() {}

    // -------------------------------------------------------------------------
    // XXX The Object API
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        return new Factory(getConnection(), getDialect(), getSettings()).toString();
    }
}
