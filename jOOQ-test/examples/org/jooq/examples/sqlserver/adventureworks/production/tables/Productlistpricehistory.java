/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productlistpricehistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord> {

	private static final long serialVersionUID = 797519320;

	/**
	 * The singleton instance of ProductListPriceHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory PRODUCTLISTPRICEHISTORY = new org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductListPriceHistory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, java.sql.Timestamp> STARTDATE = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, java.sql.Timestamp> ENDDATE = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, java.math.BigDecimal> LISTPRICE = createField("ListPrice", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productlistpricehistory() {
		super("ProductListPriceHistory", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Productlistpricehistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory.PRODUCTLISTPRICEHISTORY);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductListPriceHistory_ProductID_StartDate;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductListPriceHistory_ProductID_StartDate);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductListPriceHistory_Product_ProductID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory(alias);
	}
}
