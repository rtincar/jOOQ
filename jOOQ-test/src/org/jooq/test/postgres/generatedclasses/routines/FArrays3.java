/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class FArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.String[]> {

	private static final long serialVersionUID = 1638128912;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = createParameter("in_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays3() {
		super(org.jooq.SQLDialect.POSTGRES, "f_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
		setOverloaded(true);
	}

	/**
	 * Set the <code>in_array</code> parameter to the routine
	 */
	public void setInArray(java.lang.String[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>in_array</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<java.lang.String[]> field) {
		setField(IN_ARRAY, field);
	}
}
