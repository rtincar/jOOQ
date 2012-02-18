/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 1982914918;

	/**
	 * The singleton instance of t_725_lob_test
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.sybase.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.LONGVARBINARY, this);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * No further instances allowed
	 */
	private T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.T_725LobTest(alias);
	}
}
