/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class UnitmeasureRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitmeasureRecord> {

	private static final long serialVersionUID = -1318264830;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setUnitmeasurecode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.String getUnitmeasurecode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord> fetchBillofmaterialsList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS.UNITMEASURECODE.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> fetchProductListBySizeunitmeasurecode() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SIZEUNITMEASURECODE.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> fetchProductListByWeightunitmeasurecode() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.WEIGHTUNITMEASURECODE.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord> fetchProductvendorList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor.PRODUCTVENDOR)
			.where(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor.PRODUCTVENDOR.UNITMEASURECODE.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.MODIFIEDDATE);
	}

	/**
	 * Create a detached UnitmeasureRecord
	 */
	public UnitmeasureRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE);
	}
}
