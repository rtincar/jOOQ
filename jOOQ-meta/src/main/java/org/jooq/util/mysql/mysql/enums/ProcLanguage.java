/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public enum ProcLanguage implements org.jooq.EnumType {
	SQL("SQL"),

	;

	private final java.lang.String literal;

	private ProcLanguage(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "proc_language";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
