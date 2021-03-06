/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Salesperson extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> {

	private static final long serialVersionUID = 1985010962;

	/**
	 * The singleton instance of Sales.SalesPerson
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson SALESPERSON = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesPerson_Employee_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.lang.Integer> SALESPERSONID = createField("SalesPersonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesPerson_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.lang.Integer> TERRITORYID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.math.BigDecimal> SALESQUOTA = createField("SalesQuota", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.math.BigDecimal> BONUS = createField("Bonus", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.math.BigDecimal> COMMISSIONPCT = createField("CommissionPct", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.math.BigDecimal> SALESYTD = createField("SalesYTD", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.math.BigDecimal> SALESLASTYEAR = createField("SalesLastYear", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Salesperson() {
		super("SalesPerson", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Salesperson(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SALESPERSON_SALESPERSONID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SALESPERSON_SALESPERSONID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SALESPERSON_EMPLOYEE_SALESPERSONID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SALESPERSON_SALESTERRITORY_TERRITORYID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson(alias);
	}
}
