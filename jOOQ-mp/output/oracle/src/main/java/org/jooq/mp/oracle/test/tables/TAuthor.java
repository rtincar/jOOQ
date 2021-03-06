
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables;

import org.jooq.mp.oracle.test.tables.records.TAuthorRecord;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;

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
public class TAuthor extends org.jooq.impl.UpdatableTableImpl <TAuthorRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TAuthor
	 */
	public static final TAuthor __T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TAuthorRecord> __RECORD_TYPE = TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<TAuthorRecord, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT, this);

 	/**
	 * FIRST_NAME mapping for FIRST_NAME
	 */
	public final TableField<TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * LAST_NAME mapping for LAST_NAME
	 */
	public final TableField<TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * DATE_OF_BIRTH mapping for DATE_OF_BIRTH
	 */
	public final TableField<TAuthorRecord, java.sql.Timestamp> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.TIMESTAMP, this);
 	/**
	 * YEAR_OF_BIRTH mapping for YEAR_OF_BIRTH
	 */
	public final TableField<TAuthorRecord, java.lang.Long> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * ADDRESS mapping for ADDRESS
	 */
	public final TableField<TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.OTHER, this);


	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("T_AUTHOR", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TAuthor(String alias) {
		super(alias, Test.TEST, TAuthor.__T_AUTHOR);
	}

	@Override
	public org.jooq.UniqueKey<TAuthorRecord> getMainKey() {
		return Keys.KEY_t_author_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TAuthorRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TAuthorRecord>>asList(Keys.KEY_t_author_PRIMARY);
	}

	@Override
	public TAuthor as(java.lang.String alias) {
		return new TAuthor(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
