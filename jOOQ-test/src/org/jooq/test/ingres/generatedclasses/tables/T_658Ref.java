/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = -1308303099;

	/**
	 * The singleton instance of t_658_ref
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.ingres.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord> __RECORD_TYPE = org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_658_ref.ref_11]
	 * REFERENCES t_658_11 [test.t_658_11.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.ingres.generatedclasses.enums.T_658_11> REF_11 = createField("ref_11", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.T_658_11.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_658_ref.ref_21]
	 * REFERENCES t_658_21 [test.t_658_21.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.ingres.generatedclasses.enums.T_658_21> REF_21 = createField("ref_21", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.T_658_21.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_658_ref.ref_31]
	 * REFERENCES t_658_31 [test.t_658_31.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.ingres.generatedclasses.enums.T_658_31> REF_31 = createField("ref_31", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.T_658_31.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_658_ref.ref_12]
	 * REFERENCES t_658_12 [test.t_658_12.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.ingres.generatedclasses.enums.T_658_12> REF_12 = createField("ref_12", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.T_658_12.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_658_ref.ref_22]
	 * REFERENCES t_658_22 [test.t_658_22.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.ingres.generatedclasses.enums.T_658_22> REF_22 = createField("ref_22", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.T_658_22.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_658_ref.ref_32]
	 * REFERENCES t_658_32 [test.t_658_32.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.ingres.generatedclasses.enums.T_658_32> REF_32 = createField("ref_32", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.T_658_32.class), T_658_REF);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("t_658_ref", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.T_658RefRecord, ?>>asList();
	}
}
