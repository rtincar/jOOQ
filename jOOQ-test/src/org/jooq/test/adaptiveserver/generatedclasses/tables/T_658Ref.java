/**
 * This class is generated by jOOQ
 */
package org.jooq.test.adaptiveserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = -764901288;

	/**
	 * The singleton instance of t_658_ref
	 */
	public static final org.jooq.test.adaptiveserver.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.adaptiveserver.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord> __RECORD_TYPE = org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.String> REF_11 = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.String>("ref_11", org.jooq.impl.SQLDataType.CHAR, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Integer> REF_21 = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Integer>("ref_21", org.jooq.impl.SQLDataType.INTEGER, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Long> REF_31 = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Long>("ref_31", org.jooq.impl.SQLDataType.BIGINT, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.String> REF_12 = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.String>("ref_12", org.jooq.impl.SQLDataType.CHAR, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Integer> REF_22 = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Integer>("ref_22", org.jooq.impl.SQLDataType.INTEGER, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Long> REF_32 = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.T_658RefRecord, java.lang.Long>("ref_32", org.jooq.impl.SQLDataType.BIGINT, T_658_REF);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("t_658_ref", org.jooq.test.adaptiveserver.generatedclasses.Dbo.DBO);
	}
}
