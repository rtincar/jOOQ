
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables;

import org.jooq.mp.hsqldb.test.tables.records.T65831Record;
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
public class T65831 extends org.jooq.impl.UpdatableTableImpl <T65831Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T65831
	 */
	public static final T65831 __T_658_31 = new T65831();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T65831Record> __RECORD_TYPE = T65831Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T65831Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<T65831Record, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT, this);



	/**
	 * No further instances allowed
	 */
	private T65831() {
		super("T_658_31", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T65831(String alias) {
		super(alias, Test.TEST, T65831.__T_658_31);
	}

	@Override
	public org.jooq.UniqueKey<T65831Record> getMainKey() {
		return Keys.KEY_t_658_31_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T65831Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<T65831Record>>asList(Keys.KEY_t_658_31_PRIMARY);
	}

	@Override
	public T65831 as(java.lang.String alias) {
		return new T65831(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
