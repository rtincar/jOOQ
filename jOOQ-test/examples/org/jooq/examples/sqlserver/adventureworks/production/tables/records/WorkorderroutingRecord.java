/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "WorkOrderRouting", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"WorkOrderID", "ProductID", "OperationSequence"})
})
public class WorkorderroutingRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord> {

	private static final long serialVersionUID = 2067780240;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.WorkOrderRouting.WorkOrderID]
	 * REFERENCES WorkOrder [Production.WorkOrder.WorkOrderID]
	 * </pre></code>
	 */
	public void setWorkorderid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.WORKORDERID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.WorkOrderRouting.WorkOrderID]
	 * REFERENCES WorkOrder [Production.WorkOrder.WorkOrderID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "WorkOrderID")
	public java.lang.Integer getWorkorderid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.WORKORDERID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.WorkOrderRouting.WorkOrderID]
	 * REFERENCES WorkOrder [Production.WorkOrder.WorkOrderID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord fetchWorkorder() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.WORKORDERID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.WORKORDERID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.PRODUCTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setOperationsequence(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.OPERATIONSEQUENCE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "OperationSequence")
	public java.lang.Short getOperationsequence() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.OPERATIONSEQUENCE);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.WorkOrderRouting.LocationID]
	 * REFERENCES Location [Production.Location.LocationID]
	 * </pre></code>
	 */
	public void setLocationid(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.LOCATIONID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.WorkOrderRouting.LocationID]
	 * REFERENCES Location [Production.Location.LocationID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "LocationID")
	public java.lang.Short getLocationid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.LOCATIONID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.WorkOrderRouting.LocationID]
	 * REFERENCES Location [Production.Location.LocationID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.production.tables.records.LocationRecord fetchLocation() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.LOCATION)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.LOCATION.LOCATIONID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.LOCATIONID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setScheduledstartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.SCHEDULEDSTARTDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ScheduledStartDate")
	public java.sql.Timestamp getScheduledstartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.SCHEDULEDSTARTDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setScheduledenddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.SCHEDULEDENDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ScheduledEndDate")
	public java.sql.Timestamp getScheduledenddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.SCHEDULEDENDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setActualstartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALSTARTDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ActualStartDate")
	public java.sql.Timestamp getActualstartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALSTARTDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setActualenddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALENDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ActualEndDate")
	public java.sql.Timestamp getActualenddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALENDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setActualresourcehrs(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALRESOURCEHRS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ActualResourceHrs")
	public java.math.BigDecimal getActualresourcehrs() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALRESOURCEHRS);
	}

	/**
	 * An uncommented item
	 */
	public void setPlannedcost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.PLANNEDCOST, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PlannedCost")
	public java.math.BigDecimal getPlannedcost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.PLANNEDCOST);
	}

	/**
	 * An uncommented item
	 */
	public void setActualcost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALCOST, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ActualCost")
	public java.math.BigDecimal getActualcost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.ACTUALCOST);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.MODIFIEDDATE);
	}

	/**
	 * Create a detached WorkorderroutingRecord
	 */
	public WorkorderroutingRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING);
	}
}
