/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class Uspgetmanageremployees extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -895001312;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> MANAGERID = createParameter("ManagerID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public Uspgetmanageremployees() {
		super(org.jooq.SQLDialect.SQLSERVER, "uspGetManagerEmployees", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO);

		addInParameter(MANAGERID);
	}

	/**
	 * Set the <code>ManagerID</code> parameter to the routine
	 */
	public void setManagerid(java.lang.Integer value) {
		setValue(MANAGERID, value);
	}
}
