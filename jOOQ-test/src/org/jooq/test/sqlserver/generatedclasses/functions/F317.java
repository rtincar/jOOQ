/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class F317 extends org.jooq.impl.StoredFunctionImpl<java.lang.Integer> {

	private static final long serialVersionUID = -1498572740;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("p1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("p2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P3 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("p3", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P4 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("p4", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new function call instance
	 */
	public F317() {
		super(org.jooq.SQLDialect.SQLSERVER, "f317", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>p1</code> parameter to the function
	 */
	public void setP1(java.lang.Integer value) {
		setValue(P1, value);
	}

	/**
	 * Set the <code>p1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP1(org.jooq.Field<java.lang.Integer> field) {
		setField(P1, field);
	}

	/**
	 * Set the <code>p2</code> parameter to the function
	 */
	public void setP2(java.lang.Integer value) {
		setValue(P2, value);
	}

	/**
	 * Set the <code>p2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP2(org.jooq.Field<java.lang.Integer> field) {
		setField(P2, field);
	}

	/**
	 * Set the <code>p3</code> parameter to the function
	 */
	public void setP3(java.lang.Integer value) {
		setValue(P3, value);
	}

	/**
	 * Set the <code>p3</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP3(org.jooq.Field<java.lang.Integer> field) {
		setField(P3, field);
	}

	/**
	 * Set the <code>p4</code> parameter to the function
	 */
	public void setP4(java.lang.Integer value) {
		setValue(P4, value);
	}

	/**
	 * Set the <code>p4</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setP4(org.jooq.Field<java.lang.Integer> field) {
		setField(P4, field);
	}
}
