
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables;

import org.jooq.mp.hsqldb.test.tables.records.TArraysRecord;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;

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
public class TArrays extends org.jooq.impl.UpdatableTableImpl <TArraysRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TArrays
	 */
	public static final TArrays __T_ARRAYS = new TArrays();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TArraysRecord> __RECORD_TYPE = TArraysRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TArraysRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * STRING_ARRAY mapping for STRING_ARRAY
	 */
	public final TableField<TArraysRecord, java.lang.Integer> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.ARRAY, this);
 	/**
	 * NUMBER_ARRAY mapping for NUMBER_ARRAY
	 */
	public final TableField<TArraysRecord, java.lang.Integer> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.ARRAY, this);
 	/**
	 * DATE_ARRAY mapping for DATE_ARRAY
	 */
	public final TableField<TArraysRecord, java.lang.Integer> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.ARRAY, this);


	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("T_ARRAYS", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TArrays(String alias) {
		super(alias, Test.TEST, TArrays.__T_ARRAYS);
	}

	@Override
	public org.jooq.UniqueKey<TArraysRecord> getMainKey() {
		return Keys.KEY_t_arrays_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TArraysRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TArraysRecord>>asList(Keys.KEY_t_arrays_PRIMARY);
	}

	@Override
	public TArrays as(java.lang.String alias) {
		return new TArrays(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
