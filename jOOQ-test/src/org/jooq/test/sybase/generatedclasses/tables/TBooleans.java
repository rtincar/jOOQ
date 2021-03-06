/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = -2062944753;

	/**
	 * The singleton instance of dba.t_booleans
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.sybase.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.Boolean_10.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.BooleanTrueFalseLc> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.BooleanTrueFalseLc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.BooleanTrueFalseUc> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.BooleanTrueFalseUc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.BooleanYesNoLc> YES_NO_LC = createField("yes_no_lc", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.BooleanYesNoLc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.BooleanYesNoUc> YES_NO_UC = createField("yes_no_uc", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.BooleanYesNoUc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.BooleanYnLc> Y_N_LC = createField("y_n_lc", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.BooleanYnLc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.sybase.generatedclasses.enums.BooleanYnUc> Y_N_UC = createField("y_n_uc", org.jooq.util.sybase.SybaseDataType.VARCHAR.asEnumDataType(org.jooq.test.sybase.generatedclasses.enums.BooleanYnUc.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("t_booleans", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * No further instances allowed
	 */
	private TBooleans(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_BOOLEANS__PK_T_BOOLEANS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_BOOLEANS__PK_T_BOOLEANS);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TBooleans as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TBooleans(alias);
	}
}
