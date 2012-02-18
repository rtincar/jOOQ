/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductInventory", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "LocationID"})
})
public class ProductinventoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductinventoryRecord> {

	private static final long serialVersionUID = 685148630;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.PRODUCTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	public void setLocationid(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.LOCATIONID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "LocationID")
	public java.lang.Short getLocationid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.LOCATIONID);
	}

	/**
	 * An uncommented item
	 */
	public void setShelf(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.SHELF, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Shelf")
	public java.lang.String getShelf() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.SHELF);
	}

	/**
	 * An uncommented item
	 */
	public void setBin(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.BIN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Bin")
	public java.lang.Byte getBin() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.BIN);
	}

	/**
	 * An uncommented item
	 */
	public void setQuantity(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.QUANTITY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Quantity")
	public java.lang.Short getQuantity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.QUANTITY);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductinventoryRecord
	 */
	public ProductinventoryRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY);
	}
}
