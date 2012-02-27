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

import org.jooq.SQLDialect;

/**
 * The term dictionary enumerates standard expressions and their
 * dialect-specific variants if applicable
 *
 * @author Lukas Eder
 */
enum Term {

    ATAN2,
    BIT_LENGTH,
    CHAR_LENGTH,
    OCTET_LENGTH,
    STDDEV_POP,
    STDDEV_SAMP,
    VAR_POP,
    VAR_SAMP

    ;

    public final String translate(SQLDialect dialect) {
        switch (this) {
            case ATAN2:
                switch (dialect) {
                    case ASE:
                    case SQLSERVER:
                        return "atn2";
                }

                return "atan2";

            case BIT_LENGTH:
                switch (dialect) {
                    case ASE:
                        return "8 * datalength";

                    case DB2:
                    case DERBY:
                    case INGRES:
                    case SQLITE:
                    case SYBASE:
                        return "8 * length";

                    case SQLSERVER:
                        return "8 * len";

                    case ORACLE:
                        return "8 * lengthb";
                }

                return "bit_length";

            case CHAR_LENGTH:
                switch (dialect) {
                    case DB2:
                    case DERBY:
                    case INGRES:
                    case ORACLE:
                    case SQLITE:
                    case SYBASE:
                        return "length";

                    case SQLSERVER:
                        return "len";
                }

                return "char_length";

            case OCTET_LENGTH:
                switch (dialect) {
                    case DB2:
                    case DERBY:
                    case INGRES:
                    case SQLITE:
                    case SYBASE:
                        return "length";

                    case SQLSERVER:
                        return "len";

                    case ORACLE:
                        return "lengthb";
                }

                return "octet_length";

            case STDDEV_POP:
                switch (dialect) {
                    case DB2:
                        return "stddev";

                    case SQLSERVER:
                        return "stdevp";
                }

                return "stddev_pop";

            case STDDEV_SAMP:
                switch (dialect) {
                    case DB2:
                        return "stddev";

                    case SQLSERVER:
                        return "stdev";
                }

                return "stddev_samp";

            case VAR_POP:
                switch (dialect) {
                    case DB2:
                        return "variance";

                    case SQLSERVER:
                        return "varp";
                }

                return "var_pop";

            case VAR_SAMP:
                switch (dialect) {
                    case DB2:
                        return "variance";

                    case SQLSERVER:
                        return "var";
                }

                return "var_samp";
        }

        return null;
    }
}
