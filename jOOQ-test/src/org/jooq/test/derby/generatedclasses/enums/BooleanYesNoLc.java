/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public enum BooleanYesNoLc implements org.jooq.EnumType {
	yes("yes"),

	no("no"),

	;

	private final java.lang.String literal;

	private BooleanYesNoLc(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "BOOLEAN_YES_NO_LC";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
