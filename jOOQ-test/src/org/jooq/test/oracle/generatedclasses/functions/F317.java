/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class F317 extends org.jooq.impl.StoredFunctionImpl<java.math.BigDecimal> {

	private static final long serialVersionUID = -1972669411;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P1 = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("P1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P2 = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("P2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P3 = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("P3", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P4 = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("P4", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new function call instance
	 */
	public F317() {
		super(org.jooq.SQLDialect.ORACLE, "F317", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 */
	public void setP1(java.lang.Number value) {
		setNumber(P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP1(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P1, field);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 */
	public void setP2(java.lang.Number value) {
		setNumber(P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP2(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P2, field);
	}

	/**
	 * Set the <code>P3</code> parameter to the function
	 */
	public void setP3(java.lang.Number value) {
		setNumber(P3, value);
	}

	/**
	 * Set the <code>P3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP3(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P3, field);
	}

	/**
	 * Set the <code>P4</code> parameter to the function
	 */
	public void setP4(java.lang.Number value) {
		setNumber(P4, value);
	}

	/**
	 * Set the <code>P4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP4(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P4, field);
	}
}
