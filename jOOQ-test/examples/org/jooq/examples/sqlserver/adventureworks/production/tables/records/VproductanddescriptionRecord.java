/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductAndDescription", schema = "Production")
public class VproductanddescriptionRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductanddescriptionRecord> {

	private static final long serialVersionUID = -1289828663;

	/**
	 * An uncommented item
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.PRODUCTID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setProductmodel(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.PRODUCTMODEL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductModel")
	public java.lang.String getProductmodel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.PRODUCTMODEL);
	}

	/**
	 * An uncommented item
	 */
	public void setCultureid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.CULTUREID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CultureID")
	public java.lang.String getCultureid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.CULTUREID);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Description")
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION.DESCRIPTION);
	}

	/**
	 * Create a detached VproductanddescriptionRecord
	 */
	public VproductanddescriptionRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductanddescription.VPRODUCTANDDESCRIPTION);
	}
}
