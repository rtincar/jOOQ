/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_986_1 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = 1559256172;

	/**
	 * The singleton instance of public.t_986_1
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_986_1 T_986_1 = new org.jooq.test.postgres.generatedclasses.tables.T_986_1();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (ref, ref)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record, java.lang.Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private T_986_1() {
		super("t_986_1", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private T_986_1(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.T_986_1__FK_986);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_986_1 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_986_1(alias);
	}
}
