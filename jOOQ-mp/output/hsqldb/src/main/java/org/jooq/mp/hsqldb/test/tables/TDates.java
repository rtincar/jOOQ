
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables;

import org.jooq.mp.hsqldb.test.tables.records.TDatesRecord;
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
public class TDates extends org.jooq.impl.UpdatableTableImpl <TDatesRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TDates
	 */
	public static final TDates __T_DATES = new TDates();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TDatesRecord> __RECORD_TYPE = TDatesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TDatesRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<TDatesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * D mapping for D
	 */
	public final TableField<TDatesRecord, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, this);
 	/**
	 * T mapping for T
	 */
	public final TableField<TDatesRecord, java.sql.Timestamp> T = createField("T", org.jooq.impl.SQLDataType.TIME, this);
 	/**
	 * TS mapping for TS
	 */
	public final TableField<TDatesRecord, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP, this);
 	/**
	 * D_INT mapping for D_INT
	 */
	public final TableField<TDatesRecord, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * TS_BIGINT mapping for TS_BIGINT
	 */
	public final TableField<TDatesRecord, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT, this);


	/**
	 * No further instances allowed
	 */
	private TDates() {
		super("T_DATES", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TDates(String alias) {
		super(alias, Test.TEST, TDates.__T_DATES);
	}

	@Override
	public org.jooq.UniqueKey<TDatesRecord> getMainKey() {
		return Keys.KEY_t_dates_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TDatesRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TDatesRecord>>asList(Keys.KEY_t_dates_PRIMARY);
	}

	@Override
	public TDates as(java.lang.String alias) {
		return new TDates(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
