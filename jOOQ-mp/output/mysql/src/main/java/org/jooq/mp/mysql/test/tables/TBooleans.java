
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test.tables;

import org.jooq.mp.mysql.test.tables.records.TBooleansRecord;
import org.jooq.mp.mysql.test.Test;
import org.jooq.mp.mysql.test.Keys;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.ForeignKey;
import java.util.List;
import java.util.Arrays;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TBooleans extends org.jooq.impl.UpdatableTableImpl <TBooleansRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TBooleans
	 */
	public static final TBooleans __T_BOOLEANS = new TBooleans();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBooleansRecord> __RECORD_TYPE = TBooleansRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBooleansRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY id
	 */
	public final TableField<TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * ONE_ZERO mapping for one_zero
	 */
	public final TableField<TBooleansRecord, java.lang.Integer> ONE_ZERO = createField("one_zero", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * TRUE_FALSE_LC mapping for true_false_lc
	 */
	public final TableField<TBooleansRecord, java.lang.String> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * TRUE_FALSE_UC mapping for true_false_uc
	 */
	public final TableField<TBooleansRecord, java.lang.String> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * YES_NO_LC mapping for yes_no_lc
	 */
	public final TableField<TBooleansRecord, java.lang.String> YES_NO_LC = createField("yes_no_lc", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * YES_NO_UC mapping for yes_no_uc
	 */
	public final TableField<TBooleansRecord, java.lang.String> YES_NO_UC = createField("yes_no_uc", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * Y_N_LC mapping for y_n_lc
	 */
	public final TableField<TBooleansRecord, java.lang.String> Y_N_LC = createField("y_n_lc", org.jooq.impl.SQLDataType.CHAR, this);
 	/**
	 * Y_N_UC mapping for y_n_uc
	 */
	public final TableField<TBooleansRecord, java.lang.String> Y_N_UC = createField("y_n_uc", org.jooq.impl.SQLDataType.CHAR, this);
 	/**
	 * VC_BOOLEAN mapping for vc_boolean
	 */
	public final TableField<TBooleansRecord, java.lang.String> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * C_BOOLEAN mapping for c_boolean
	 */
	public final TableField<TBooleansRecord, java.lang.String> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.CHAR, this);
 	/**
	 * N_BOOLEAN mapping for n_boolean
	 */
	public final TableField<TBooleansRecord, java.lang.Integer> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.INTEGER, this);


	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("t_booleans", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TBooleans(String alias) {
		super(alias, Test.TEST, TBooleans.__T_BOOLEANS);
	}

	@Override
	public org.jooq.UniqueKey<TBooleansRecord> getMainKey() {
		return Keys.KEY_t_booleans_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TBooleansRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TBooleansRecord>>asList(Keys.KEY_t_booleans_PRIMARY);
	}

	@Override
	public TBooleans as(java.lang.String alias) {
		return new TBooleans(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}