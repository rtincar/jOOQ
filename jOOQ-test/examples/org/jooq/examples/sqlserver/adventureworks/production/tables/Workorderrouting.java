/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Workorderrouting extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord> {

	private static final long serialVersionUID = -2129937840;

	/**
	 * The singleton instance of Production.WorkOrderRouting
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting WORKORDERROUTING = new org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_WorkOrder_WorkOrderID
	 * FOREIGN KEY (WorkOrderID)
	 * REFERENCES Production.WorkOrder (WorkOrderID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.lang.Integer> WORKORDERID = createField("WorkOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.lang.Short> OPERATIONSEQUENCE = createField("OperationSequence", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.lang.Short> LOCATIONID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.sql.Timestamp> SCHEDULEDSTARTDATE = createField("ScheduledStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.sql.Timestamp> SCHEDULEDENDDATE = createField("ScheduledEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.sql.Timestamp> ACTUALSTARTDATE = createField("ActualStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.sql.Timestamp> ACTUALENDDATE = createField("ActualEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.math.BigDecimal> ACTUALRESOURCEHRS = createField("ActualResourceHrs", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.math.BigDecimal> PLANNEDCOST = createField("PlannedCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.math.BigDecimal> ACTUALCOST = createField("ActualCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Workorderrouting() {
		super("WorkOrderRouting", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Workorderrouting(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WORKORDERROUTING_WORKORDERID_PRODUCTID_OPERATIONSEQUENCE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WORKORDERROUTING_WORKORDERID_PRODUCTID_OPERATIONSEQUENCE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WORKORDERROUTING_WORKORDER_WORKORDERID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WORKORDERROUTING_LOCATION_LOCATIONID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting(alias);
	}
}
