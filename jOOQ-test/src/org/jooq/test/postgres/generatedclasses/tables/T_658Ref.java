/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = 1661790169;

	/**
	 * The singleton instance of public.t_658_ref
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.postgres.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_658_ref__fk_t_658_11
	 * FOREIGN KEY (ref_11)
	 * REFERENCES public.t_658_11 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.postgres.generatedclasses.enums.T_658_11> REF_11 = createField("ref_11", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.T_658_11.class), this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_658_ref__fk_t_658_21
	 * FOREIGN KEY (ref_21)
	 * REFERENCES public.t_658_21 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.postgres.generatedclasses.enums.T_658_21> REF_21 = createField("ref_21", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.T_658_21.class), this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_658_ref__fk_t_658_31
	 * FOREIGN KEY (ref_31)
	 * REFERENCES public.t_658_31 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.postgres.generatedclasses.enums.T_658_31> REF_31 = createField("ref_31", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.T_658_31.class), this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_658_ref__fk_t_658_12
	 * FOREIGN KEY (ref_12)
	 * REFERENCES public.t_658_12 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.postgres.generatedclasses.enums.T_658_12> REF_12 = createField("ref_12", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.T_658_12.class), this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_658_ref__fk_t_658_22
	 * FOREIGN KEY (ref_22)
	 * REFERENCES public.t_658_22 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.postgres.generatedclasses.enums.T_658_22> REF_22 = createField("ref_22", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.T_658_22.class), this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_658_ref__fk_t_658_32
	 * FOREIGN KEY (ref_32)
	 * REFERENCES public.t_658_32 (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.postgres.generatedclasses.enums.T_658_32> REF_32 = createField("ref_32", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.T_658_32.class), this);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("t_658_ref", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private T_658Ref(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_658Ref.T_658_REF);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.T_658RefRecord, ?>>asList();
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_658Ref as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_658Ref(alias);
	}
}
