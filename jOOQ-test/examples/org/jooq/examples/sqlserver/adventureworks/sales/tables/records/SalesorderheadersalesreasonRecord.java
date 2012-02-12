/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesOrderHeaderSalesReason", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesOrderID", "SalesReasonID"})
})
public class SalesorderheadersalesreasonRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord> {

	private static final long serialVersionUID = 218224695;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesOrderHeaderSalesReason.SalesOrderID]
	 * REFERENCES SalesOrderHeader [Sales.SalesOrderHeader.SalesOrderID]
	 * </pre></code>
	 */
	public void setSalesorderid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESORDERID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesOrderHeaderSalesReason.SalesOrderID]
	 * REFERENCES SalesOrderHeader [Sales.SalesOrderHeader.SalesOrderID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesOrderID")
	public java.lang.Integer getSalesorderid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESORDERID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesOrderHeaderSalesReason.SalesReasonID]
	 * REFERENCES SalesReason [Sales.SalesReason.SalesReasonID]
	 * </pre></code>
	 */
	public void setSalesreasonid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESREASONID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesOrderHeaderSalesReason.SalesReasonID]
	 * REFERENCES SalesReason [Sales.SalesReason.SalesReasonID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesReasonID")
	public java.lang.Integer getSalesreasonid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESREASONID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.MODIFIEDDATE);
	}

	/**
	 * Create a detached SalesorderheadersalesreasonRecord
	 */
	public SalesorderheadersalesreasonRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON);
	}
}
