/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class TArrays extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 1485895323;

	/**
	 * The singleton instance of T_ARRAYS
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.TArrays T_ARRAYS = new org.jooq.test.hsqldb.generatedclasses.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord, java.lang.String[]> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord, java.sql.Date[]> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.DATE.getArrayDataType(), this);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("T_ARRAYS", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private TArrays(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord> getMainKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_ARRAYS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_ARRAYS);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.TArrays as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.TArrays(alias);
	}
}
