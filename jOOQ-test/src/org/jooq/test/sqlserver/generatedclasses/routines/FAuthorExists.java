/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class FAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -766201074;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("author_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public FAuthorExists() {
		super(org.jooq.SQLDialect.SQLSERVER, "f_author_exists", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>author_name</code> parameter to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setAuthorName(org.jooq.Field<java.lang.String> field) {
		setField(AUTHOR_NAME, field);
	}
}
