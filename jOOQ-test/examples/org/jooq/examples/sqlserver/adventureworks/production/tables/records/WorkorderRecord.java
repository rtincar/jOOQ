/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "WorkOrder", schema = "Production")
public class WorkorderRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord> {

	private static final long serialVersionUID = 2132074961;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setWorkorderid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.WORKORDERID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "WorkOrderID", unique = true)
	public java.lang.Integer getWorkorderid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.WORKORDERID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrder_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrder_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.PRODUCTID);
	}

	/**
	 * An uncommented item
	 */
	public void setOrderqty(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.ORDERQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "OrderQty")
	public java.lang.Integer getOrderqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.ORDERQTY);
	}

	/**
	 * An uncommented item
	 */
	public void setStockedqty(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.STOCKEDQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StockedQty")
	public java.lang.Integer getStockedqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.STOCKEDQTY);
	}

	/**
	 * An uncommented item
	 */
	public void setScrappedqty(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.SCRAPPEDQTY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ScrappedQty")
	public java.lang.Short getScrappedqty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.SCRAPPEDQTY);
	}

	/**
	 * An uncommented item
	 */
	public void setStartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.STARTDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.STARTDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setEnddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.ENDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEnddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.ENDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setDuedate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.DUEDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DueDate")
	public java.sql.Timestamp getDuedate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.DUEDATE);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrder_ScrapReason_ScrapReasonID
	 * FOREIGN KEY (ScrapReasonID)
	 * REFERENCES Production.ScrapReason (ScrapReasonID)
	 * </pre></code>
	 */
	public void setScrapreasonid(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.SCRAPREASONID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrder_ScrapReason_ScrapReasonID
	 * FOREIGN KEY (ScrapReasonID)
	 * REFERENCES Production.ScrapReason (ScrapReasonID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ScrapReasonID")
	public java.lang.Short getScrapreasonid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.SCRAPREASONID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.MODIFIEDDATE);
	}

	/**
	 * Create a detached WorkorderRecord
	 */
	public WorkorderRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER);
	}
}
