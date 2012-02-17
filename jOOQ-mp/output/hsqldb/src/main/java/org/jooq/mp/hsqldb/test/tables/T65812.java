
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables;

import org.jooq.mp.hsqldb.test.tables.records.T65812Record;
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
public class T65812 extends org.jooq.impl.UpdatableTableImpl <T65812Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T65812
	 */
	public static final T65812 __T_658_12 = new T65812();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T65812Record> __RECORD_TYPE = T65812Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T65812Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<T65812Record, java.lang.String> ID = createField("ID", org.jooq.impl.SQLDataType.CHAR, this);

 	/**
	 * CD mapping for CD
	 */
	public final TableField<T65812Record, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR, this);


	/**
	 * No further instances allowed
	 */
	private T65812() {
		super("T_658_12", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T65812(String alias) {
		super(alias, Test.TEST, T65812.__T_658_12);
	}

	@Override
	public org.jooq.UniqueKey<T65812Record> getMainKey() {
		return Keys.KEY_t_658_12_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T65812Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<T65812Record>>asList(Keys.KEY_t_658_12_PRIMARY);
	}

	@Override
	public T65812 as(java.lang.String alias) {
		return new T65812(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
