/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class Employeepayhistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord> {

	private static final long serialVersionUID = -1401019921;

	/**
	 * The singleton instance of EmployeePayHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory EMPLOYEEPAYHISTORY = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [HumanResources.EmployeePayHistory.EmployeeID]
	 * REFERENCES Employee [HumanResources.Employee.EmployeeID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, java.lang.Integer> EMPLOYEEID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, java.sql.Timestamp> RATECHANGEDATE = createField("RateChangeDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, java.math.BigDecimal> RATE = createField("Rate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, java.lang.Byte> PAYFREQUENCY = createField("PayFrequency", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Employeepayhistory() {
		super("EmployeePayHistory", org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES);
	}

	/**
	 * No further instances allowed
	 */
	private Employeepayhistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory.EMPLOYEEPAYHISTORY);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeePayHistory_EmployeeID_RateChangeDate;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeePayHistory_EmployeeID_RateChangeDate);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeepayhistoryRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeePayHistory_Employee_EmployeeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Employeepayhistory(alias);
	}
}
