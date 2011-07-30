/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.packages.library;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class PkgPAuthorExists1 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 21678285;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RESULT = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("RESULT", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new procedure call instance
	 */
	public PkgPAuthorExists1() {
		super(org.jooq.SQLDialect.ORACLE, "PKG_P_AUTHOR_EXISTS", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.test.oracle.generatedclasses.packages.Library.LIBRARY);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
		setOverloaded(true);
	}

	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	public java.math.BigDecimal getResult() {
		return getValue(RESULT);
	}
}