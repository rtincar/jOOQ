/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class Ufngetproductlistprice extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 1727048693;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> PRODUCTID = createParameter("ProductID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> ORDERDATE = createParameter("OrderDate", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public Ufngetproductlistprice() {
		super(org.jooq.SQLDialect.SQLSERVER, "ufnGetProductListPrice", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(PRODUCTID);
		addInParameter(ORDERDATE);
	}

	/**
	 * Set the <code>ProductID</code> parameter to the routine
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(PRODUCTID, value);
	}

	/**
	 * Set the <code>ProductID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setProductid(org.jooq.Field<java.lang.Integer> field) {
		setField(PRODUCTID, field);
	}

	/**
	 * Set the <code>OrderDate</code> parameter to the routine
	 */
	public void setOrderdate(java.sql.Timestamp value) {
		setValue(ORDERDATE, value);
	}

	/**
	 * Set the <code>OrderDate</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setOrderdate(org.jooq.Field<java.sql.Timestamp> field) {
		setField(ORDERDATE, field);
	}
}
