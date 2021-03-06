/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Illustration extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord> {

	private static final long serialVersionUID = 1136344217;

	/**
	 * The singleton instance of Production.Illustration
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration ILLUSTRATION = new org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord, java.lang.Integer> ILLUSTRATIONID = createField("IllustrationID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord, java.lang.Object> DIAGRAM = createField("Diagram", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Illustration() {
		super("Illustration", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Illustration(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration.ILLUSTRATION);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_ILLUSTRATION;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ILLUSTRATION_ILLUSTRATIONID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ILLUSTRATION_ILLUSTRATIONID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration(alias);
	}
}
