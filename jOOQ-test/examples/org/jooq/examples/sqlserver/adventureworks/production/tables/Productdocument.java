/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productdocument extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord> {

	private static final long serialVersionUID = 1163041736;

	/**
	 * The singleton instance of ProductDocument
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument PRODUCTDOCUMENT = new org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.ProductDocument.ProductID]
	 * REFERENCES Product [Production.Product.ProductID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Production.ProductDocument.DocumentID]
	 * REFERENCES Document [Production.Document.DocumentID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, java.lang.Integer> DOCUMENTID = createField("DocumentID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productdocument() {
		super("ProductDocument", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Productdocument(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductDocument_ProductID_DocumentID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductDocument_ProductID_DocumentID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductDocument_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductDocument_Document_DocumentID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument(alias);
	}
}
