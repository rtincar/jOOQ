/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productvendor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord> {

	private static final long serialVersionUID = -1540282869;

	/**
	 * The singleton instance of ProductVendor
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor PRODUCTVENDOR = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.ProductVendor.ProductID]
	 * REFERENCES Product [Production.Product.ProductID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.ProductVendor.VendorID]
	 * REFERENCES Vendor [Purchasing.Vendor.VendorID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.Integer> VENDORID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.Integer> AVERAGELEADTIME = createField("AverageLeadTime", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.math.BigDecimal> STANDARDPRICE = createField("StandardPrice", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.math.BigDecimal> LASTRECEIPTCOST = createField("LastReceiptCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.sql.Timestamp> LASTRECEIPTDATE = createField("LastReceiptDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.Integer> MINORDERQTY = createField("MinOrderQty", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.Integer> MAXORDERQTY = createField("MaxOrderQty", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.Integer> ONORDERQTY = createField("OnOrderQty", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Purchasing.ProductVendor.UnitMeasureCode]
	 * REFERENCES UnitMeasure [Production.UnitMeasure.UnitMeasureCode]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.lang.String> UNITMEASURECODE = createField("UnitMeasureCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productvendor() {
		super("ProductVendor", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING);
	}

	/**
	 * No further instances allowed
	 */
	private Productvendor(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor.PRODUCTVENDOR);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_ProductVendor_ProductID_VendorID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_ProductVendor_ProductID_VendorID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ProductvendorRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_ProductVendor_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_ProductVendor_Vendor_VendorID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_ProductVendor_UnitMeasure_UnitMeasureCode);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Productvendor(alias);
	}
}
