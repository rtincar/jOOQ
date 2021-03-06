
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test.tables;

import org.jooq.mp.mysql.test.tables.records.TLanguageRecord;
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
public class TLanguage extends org.jooq.impl.UpdatableTableImpl <TLanguageRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TLanguage
	 */
	public static final TLanguage __T_LANGUAGE = new TLanguage();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TLanguageRecord> __RECORD_TYPE = TLanguageRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TLanguageRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * CD mapping for CD
	 */
	public final TableField<TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR, this);
 	/**
	 * DESCRIPTION mapping for DESCRIPTION
	 */
	public final TableField<TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * DESCRIPTION_ENGLISH mapping for description_english
	 */
	public final TableField<TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR, this);


	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("t_language", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TLanguage(String alias) {
		super(alias, Test.TEST, TLanguage.__T_LANGUAGE);
	}

	@Override
	public org.jooq.UniqueKey<TLanguageRecord> getMainKey() {
		return Keys.KEY_t_language_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TLanguageRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TLanguageRecord>>asList(Keys.KEY_t_language_PRIMARY);
	}

	@Override
	public TLanguage as(java.lang.String alias) {
		return new TLanguage(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
