/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public enum ProcsPrivRoutineType implements org.jooq.EnumType {
	FUNCTION("FUNCTION"),

	PROCEDURE("PROCEDURE"),

	;

	private final java.lang.String literal;

	private ProcsPrivRoutineType(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "procs_priv_Routine_type";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
