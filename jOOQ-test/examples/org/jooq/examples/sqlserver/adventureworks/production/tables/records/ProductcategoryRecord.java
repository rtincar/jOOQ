/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductCategory", schema = "Production")
public class ProductcategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductcategoryRecord> {

	private static final long serialVersionUID = 898657575;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductcategoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.PRODUCTCATEGORYID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductCategoryID", unique = true)
	public java.lang.Integer getProductcategoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.PRODUCTCATEGORYID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductcategoryRecord
	 */
	public ProductcategoryRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY);
	}
}
