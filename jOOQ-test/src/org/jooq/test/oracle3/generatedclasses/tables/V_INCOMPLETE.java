/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class V_INCOMPLETE extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> {

	private static final long serialVersionUID = -2020480946;

	/**
	 * The singleton instance of TEST.V_INCOMPLETE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE V_INCOMPLETE = new org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> __RECORD_TYPE = org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> ID = createField("ID", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> DETAILS_ID = createField("DETAILS_ID", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> TITLE = createField("TITLE", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (UNDEFINED) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, java.lang.Object> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"), this);

	/**
	 * No further instances allowed
	 */
	private V_INCOMPLETE() {
		super("V_INCOMPLETE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private V_INCOMPLETE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE(alias);
	}
}
