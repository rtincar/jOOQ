/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_986_2 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = -1677099432;

	/**
	 * The singleton instance of dbo.t_986_2
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.T_986_2 T_986_2 = new org.jooq.test.ase.generatedclasses.tables.T_986_2();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record, java.lang.Integer> REF = createField("REF", org.jooq.impl.SQLDataType.INTEGER, T_986_2);

	/**
	 * No further instances allowed
	 */
	private T_986_2() {
		super("t_986_2", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_986_2__PK_986;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record>>asList(org.jooq.test.ase.generatedclasses.Keys.T_986_2__PK_986);
	}
}
