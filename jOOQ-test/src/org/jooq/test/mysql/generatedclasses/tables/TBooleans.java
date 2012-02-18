/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 940422448;

	/**
	 * The singleton instance of t_booleans
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.mysql.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> __RECORD_TYPE = org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.Boolean_10.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.BooleanTrueFalseLc> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.BooleanTrueFalseLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.BooleanTrueFalseUc> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.BooleanTrueFalseUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.BooleanYesNoLc> YES_NO_LC = createField("yes_no_lc", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.BooleanYesNoLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.BooleanYesNoUc> YES_NO_UC = createField("yes_no_uc", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.BooleanYesNoUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.BooleanYnLc> Y_N_LC = createField("y_n_lc", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.BooleanYnLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.enums.BooleanYnUc> Y_N_UC = createField("y_n_uc", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.BooleanYnUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.BOOLEAN, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.BOOLEAN, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.BOOLEAN, T_BOOLEANS);

	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("t_booleans", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOLEANS_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOLEANS_PRIMARY);
	}
}
