/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Productphoto extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord> {

	private static final long serialVersionUID = 1316786433;

	/**
	 * The singleton instance of Production.ProductPhoto
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto PRODUCTPHOTO = new org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, java.lang.Integer> PRODUCTPHOTOID = createField("ProductPhotoID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, byte[]> THUMBNAILPHOTO = createField("ThumbNailPhoto", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, java.lang.String> THUMBNAILPHOTOFILENAME = createField("ThumbnailPhotoFileName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, byte[]> LARGEPHOTO = createField("LargePhoto", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, java.lang.String> LARGEPHOTOFILENAME = createField("LargePhotoFileName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Productphoto() {
		super("ProductPhoto", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Productphoto(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto.PRODUCTPHOTO);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_PRODUCTPHOTO;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_PRODUCTPHOTO_PRODUCTPHOTOID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_PRODUCTPHOTO_PRODUCTPHOTOID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto(alias);
	}
}
