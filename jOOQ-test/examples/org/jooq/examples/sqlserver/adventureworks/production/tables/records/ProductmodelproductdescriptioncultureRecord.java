/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductModelProductDescriptionCulture", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductModelID", "ProductDescriptionID", "CultureID"})
})
public class ProductmodelproductdescriptioncultureRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord> {

	private static final long serialVersionUID = -130132566;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	public void setProductmodelid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTMODELID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductModelID")
	public java.lang.Integer getProductmodelid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTMODELID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID
	 * FOREIGN KEY (ProductDescriptionID)
	 * REFERENCES Production.ProductDescription (ProductDescriptionID)
	 * </pre></code>
	 */
	public void setProductdescriptionid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTDESCRIPTIONID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID
	 * FOREIGN KEY (ProductDescriptionID)
	 * REFERENCES Production.ProductDescription (ProductDescriptionID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductDescriptionID")
	public java.lang.Integer getProductdescriptionid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTDESCRIPTIONID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_Culture_CultureID
	 * FOREIGN KEY (CultureID)
	 * REFERENCES Production.Culture (CultureID)
	 * </pre></code>
	 */
	public void setCultureid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.CULTUREID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_Culture_CultureID
	 * FOREIGN KEY (CultureID)
	 * REFERENCES Production.Culture (CultureID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CultureID")
	public java.lang.String getCultureid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.CULTUREID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductmodelproductdescriptioncultureRecord
	 */
	public ProductmodelproductdescriptioncultureRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE);
	}
}
