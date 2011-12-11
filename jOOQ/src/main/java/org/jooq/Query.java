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

package org.jooq;

import java.util.List;
import java.util.Map;

import org.jooq.exception.DataAccessException;
import org.jooq.impl.Factory;

/**
 * Any query
 * 
 * @author Lukas Eder
 */
public interface Query extends QueryPart {

    /**
     * Execute the query, if it has been created with a properly configured
     * factory
     * 
     * @return A result value, depending on the concrete implementation of
     *         {@link Query}:
     *         <ul>
     *         <li> {@link Delete} : the number of deleted records</li>
     *         <li> {@link Insert} : the number of inserted records</li>
     *         <li> {@link Merge} : the result may have no meaning</li>
     *         <li> {@link Select} : the number of resulting records</li>
     *         <li> {@link Truncate} : the result may have no meaning</li>
     *         <li> {@link Update} : the number of updated records</li>
     *         </ul>
     * @throws DataAccessException If anything goes wrong in the database
     */
    int execute() throws DataAccessException;

    /**
     * Retrieve the SQL code rendered by this Query
     * <p>
     * This method can be expected to work correctly for any SQL dialect, as a
     * query is usually "attached" when created from a {@link Factory}.
     * <p>
     * Use this method, when you want to use jOOQ for object oriented query
     * creation, but execute the query with some other technology, such as
     * <ul>
     * <li>JDBC</li>
     * <li>Spring Templates</li>
     * <li>JPA native queries</li>
     * <li>etc...</li>
     * </ul>
     */
    String getSQL();

    /**
     * Retrieve the bind values that will be bound by this Query. This
     * <code>List</code> cannot be modified. To modify bind values, use
     * {@link #getParams()} instead.
     */
    List<Object> getBindValues();

    /**
     * Get a <code>Map</code> of named parameters. The <code>Map</code> itself
     * cannot be modified, but the {@link Param} elements allow for modifying
     * bind values on an existing {@link Query}.
     * <p>
     * Bind values created with {@link Factory#val(Object)} will have their bind
     * index as name.
     * 
     * @see Param
     * @see Factory#param(String, Object)
     */
    Map<String, Param<?>> getParams();

    /**
     * Get a named parameter from the {@link Query}, provided its name.
     * <p>
     * Bind values created with {@link Factory#val(Object)} will have their bind
     * index as name.
     * 
     * @see Param
     * @see Factory#param(String, Object)
     */
    Param<?> getParam(String name);

}
