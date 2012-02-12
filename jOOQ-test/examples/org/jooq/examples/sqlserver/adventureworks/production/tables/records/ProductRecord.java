/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Product", schema = "Production")
public class ProductRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> {

	private static final long serialVersionUID = -570936821;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductID", unique = true)
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setProductnumber(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTNUMBER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductNumber")
	public java.lang.String getProductnumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTNUMBER);
	}

	/**
	 * An uncommented item
	 */
	public void setMakeflag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.MAKEFLAG, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MakeFlag")
	public java.lang.Boolean getMakeflag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.MAKEFLAG);
	}

	/**
	 * An uncommented item
	 */
	public void setFinishedgoodsflag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.FINISHEDGOODSFLAG, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FinishedGoodsFlag")
	public java.lang.Boolean getFinishedgoodsflag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.FINISHEDGOODSFLAG);
	}

	/**
	 * An uncommented item
	 */
	public void setColor(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.COLOR, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Color")
	public java.lang.String getColor() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.COLOR);
	}

	/**
	 * An uncommented item
	 */
	public void setSafetystocklevel(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SAFETYSTOCKLEVEL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SafetyStockLevel")
	public java.lang.Short getSafetystocklevel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SAFETYSTOCKLEVEL);
	}

	/**
	 * An uncommented item
	 */
	public void setReorderpoint(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.REORDERPOINT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReorderPoint")
	public java.lang.Short getReorderpoint() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.REORDERPOINT);
	}

	/**
	 * An uncommented item
	 */
	public void setStandardcost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.STANDARDCOST, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StandardCost")
	public java.math.BigDecimal getStandardcost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.STANDARDCOST);
	}

	/**
	 * An uncommented item
	 */
	public void setListprice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.LISTPRICE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ListPrice")
	public java.math.BigDecimal getListprice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.LISTPRICE);
	}

	/**
	 * An uncommented item
	 */
	public void setSize(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SIZE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Size")
	public java.lang.String getSize() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SIZE);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.SizeUnitMeasureCode]
	 * REFERENCES UnitMeasure [Production.UnitMeasure.UnitMeasureCode]
	 * </pre></code>
	 */
	public void setSizeunitmeasurecode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SIZEUNITMEASURECODE, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.SizeUnitMeasureCode]
	 * REFERENCES UnitMeasure [Production.UnitMeasure.UnitMeasureCode]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SizeUnitMeasureCode")
	public java.lang.String getSizeunitmeasurecode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SIZEUNITMEASURECODE);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.WeightUnitMeasureCode]
	 * REFERENCES UnitMeasure [Production.UnitMeasure.UnitMeasureCode]
	 * </pre></code>
	 */
	public void setWeightunitmeasurecode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.WEIGHTUNITMEASURECODE, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.WeightUnitMeasureCode]
	 * REFERENCES UnitMeasure [Production.UnitMeasure.UnitMeasureCode]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "WeightUnitMeasureCode")
	public java.lang.String getWeightunitmeasurecode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.WEIGHTUNITMEASURECODE);
	}

	/**
	 * An uncommented item
	 */
	public void setWeight(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.WEIGHT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Weight")
	public java.math.BigDecimal getWeight() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.WEIGHT);
	}

	/**
	 * An uncommented item
	 */
	public void setDaystomanufacture(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.DAYSTOMANUFACTURE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DaysToManufacture")
	public java.lang.Integer getDaystomanufacture() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.DAYSTOMANUFACTURE);
	}

	/**
	 * An uncommented item
	 */
	public void setProductline(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTLINE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductLine")
	public java.lang.String getProductline() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTLINE);
	}

	/**
	 * An uncommented item
	 */
	public void setClass_(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.CLASS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Class")
	public java.lang.String getClass_() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.CLASS);
	}

	/**
	 * An uncommented item
	 */
	public void setStyle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.STYLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Style")
	public java.lang.String getStyle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.STYLE);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.ProductSubcategoryID]
	 * REFERENCES ProductSubcategory [Production.ProductSubcategory.ProductSubcategoryID]
	 * </pre></code>
	 */
	public void setProductsubcategoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTSUBCATEGORYID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.ProductSubcategoryID]
	 * REFERENCES ProductSubcategory [Production.ProductSubcategory.ProductSubcategoryID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductSubcategoryID")
	public java.lang.Integer getProductsubcategoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTSUBCATEGORYID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.ProductModelID]
	 * REFERENCES ProductModel [Production.ProductModel.ProductModelID]
	 * </pre></code>
	 */
	public void setProductmodelid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTMODELID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.Product.ProductModelID]
	 * REFERENCES ProductModel [Production.ProductModel.ProductModelID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductModelID")
	public java.lang.Integer getProductmodelid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTMODELID);
	}

	/**
	 * An uncommented item
	 */
	public void setSellstartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SELLSTARTDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SellStartDate")
	public java.sql.Timestamp getSellstartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SELLSTARTDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setSellenddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SELLENDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SellEndDate")
	public java.sql.Timestamp getSellenddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SELLENDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setDiscontinueddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.DISCONTINUEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DiscontinuedDate")
	public java.sql.Timestamp getDiscontinueddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.DISCONTINUEDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductRecord
	 */
	public ProductRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT);
	}
}
