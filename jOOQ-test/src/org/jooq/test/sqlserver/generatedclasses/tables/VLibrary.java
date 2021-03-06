/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 775721301;

	/**
	 * The singleton instance of dbo.v_library
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.sqlserver.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord> __RECORD_TYPE = org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * No further instances allowed
	 */
	private VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.VLibrary(alias);
	}
}
