/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductSubcategory", schema = "Production")
public class ProductsubcategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> {

	private static final long serialVersionUID = 456393660;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductsubcategoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTSUBCATEGORYID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductSubcategoryID", unique = true)
	public java.lang.Integer getProductsubcategoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTSUBCATEGORYID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductSubcategory_ProductCategory_ProductCategoryID
	 * FOREIGN KEY (ProductCategoryID)
	 * REFERENCES Production.ProductCategory (ProductCategoryID)
	 * </pre></code>
	 */
	public void setProductcategoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTCATEGORYID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductSubcategory_ProductCategory_ProductCategoryID
	 * FOREIGN KEY (ProductCategoryID)
	 * REFERENCES Production.ProductCategory (ProductCategoryID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductCategoryID")
	public java.lang.Integer getProductcategoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTCATEGORYID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductsubcategoryRecord
	 */
	public ProductsubcategoryRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY);
	}
}
