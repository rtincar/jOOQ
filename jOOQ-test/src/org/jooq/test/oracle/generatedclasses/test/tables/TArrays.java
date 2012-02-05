/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class TArrays extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 938456820;

	/**
	 * The singleton instance of T_ARRAYS
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TArrays T_ARRAYS = new org.jooq.test.oracle.generatedclasses.test.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> NUMBER_LONG_ARRAY = createField("NUMBER_LONG_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.DATE.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord.class), this);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("T_ARRAYS", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TArrays(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_ARRAYS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_ARRAYS);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TArrays as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TArrays(alias);
	}
}
