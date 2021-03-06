/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productsubcategory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> {

	private static final long serialVersionUID = -1113082872;

	/**
	 * The singleton instance of Production.ProductSubcategory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory PRODUCTSUBCATEGORY = new org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.lang.Integer> PRODUCTSUBCATEGORYID = createField("ProductSubcategoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductSubcategory_ProductCategory_ProductCategoryID
	 * FOREIGN KEY (ProductCategoryID)
	 * REFERENCES Production.ProductCategory (ProductCategoryID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.lang.Integer> PRODUCTCATEGORYID = createField("ProductCategoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productsubcategory() {
		super("ProductSubcategory", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Productsubcategory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_PRODUCTSUBCATEGORY;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_PRODUCTSUBCATEGORY_PRODUCTSUBCATEGORYID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_PRODUCTSUBCATEGORY_PRODUCTSUBCATEGORYID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_PRODUCTSUBCATEGORY_PRODUCTCATEGORY_PRODUCTCATEGORYID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory(alias);
	}
}
