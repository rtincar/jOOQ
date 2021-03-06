/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class Usplogerror extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1205552959;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ERRORLOGID = createParameter("ErrorLogID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public Usplogerror() {
		super(org.jooq.SQLDialect.SQLSERVER, "uspLogError", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO);

		addInOutParameter(ERRORLOGID);
	}

	/**
	 * Set the <code>ErrorLogID</code> parameter to the routine
	 */
	public void setErrorlogid(java.lang.Integer value) {
		setValue(ERRORLOGID, value);
	}

	public java.lang.Integer getErrorlogid() {
		return getValue(ERRORLOGID);
	}
}
