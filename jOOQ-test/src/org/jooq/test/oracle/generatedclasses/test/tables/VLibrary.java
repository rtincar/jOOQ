/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1317305186;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.VLibrary V_LIBRARY = new org.jooq.test.oracle.generatedclasses.test.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("V_LIBRARY", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VLibrary(alias);
	}
}
