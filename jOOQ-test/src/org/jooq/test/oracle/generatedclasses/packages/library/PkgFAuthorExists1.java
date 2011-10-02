/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.packages.library;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PkgFAuthorExists1 extends org.jooq.impl.StoredFunctionImpl<java.math.BigDecimal> {

	private static final long serialVersionUID = -221372388;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new function call instance
	 */
	public PkgFAuthorExists1() {
		super(org.jooq.SQLDialect.ORACLE, "PKG_F_AUTHOR_EXISTS", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.test.oracle.generatedclasses.packages.Library.LIBRARY, org.jooq.impl.SQLDataType.NUMERIC);

		addInParameter(AUTHOR_NAME);
		setOverloaded(true);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setAuthorName(org.jooq.Field<java.lang.String> field) {
		setField(AUTHOR_NAME, field);
	}
}
