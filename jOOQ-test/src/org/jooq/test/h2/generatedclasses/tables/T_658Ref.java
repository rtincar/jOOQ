/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = 780919752;

	/**
	 * The singleton instance of T_658_REF
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.h2.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord> __RECORD_TYPE = org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_658_REF.REF_11]
	 * REFERENCES T_658_11 [PUBLIC.T_658_11.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.h2.generatedclasses.enums.T_658_11> REF_11 = createField("REF_11", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.h2.generatedclasses.enums.T_658_11.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_658_REF.REF_21]
	 * REFERENCES T_658_21 [PUBLIC.T_658_21.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.h2.generatedclasses.enums.T_658_21> REF_21 = createField("REF_21", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.h2.generatedclasses.enums.T_658_21.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_658_REF.REF_31]
	 * REFERENCES T_658_31 [PUBLIC.T_658_31.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.h2.generatedclasses.enums.T_658_31> REF_31 = createField("REF_31", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.h2.generatedclasses.enums.T_658_31.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_658_REF.REF_12]
	 * REFERENCES T_658_12 [PUBLIC.T_658_12.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.h2.generatedclasses.enums.T_658_12> REF_12 = createField("REF_12", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.h2.generatedclasses.enums.T_658_12.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_658_REF.REF_22]
	 * REFERENCES T_658_22 [PUBLIC.T_658_22.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.h2.generatedclasses.enums.T_658_22> REF_22 = createField("REF_22", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.h2.generatedclasses.enums.T_658_22.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_658_REF.REF_32]
	 * REFERENCES T_658_32 [PUBLIC.T_658_32.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.h2.generatedclasses.enums.T_658_32> REF_32 = createField("REF_32", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.h2.generatedclasses.enums.T_658_32.class), T_658_REF);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("T_658_REF", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.h2.generatedclasses.tables.records.T_658RefRecord, ?>>asList();
	}
}
