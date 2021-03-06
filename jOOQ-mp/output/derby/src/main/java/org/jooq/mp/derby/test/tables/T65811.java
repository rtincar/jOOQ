
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.T65811Record;
import org.jooq.mp.derby.test.Test;
import org.jooq.mp.derby.test.Keys;

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
public class T65811 extends org.jooq.impl.UpdatableTableImpl <T65811Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T65811
	 */
	public static final T65811 __T_658_11 = new T65811();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T65811Record> __RECORD_TYPE = T65811Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T65811Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<T65811Record, java.lang.String> ID = createField("ID", org.jooq.impl.SQLDataType.CHAR, this);



	/**
	 * No further instances allowed
	 */
	private T65811() {
		super("T_658_11", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T65811(String alias) {
		super(alias, Test.TEST, T65811.__T_658_11);
	}

	@Override
	public org.jooq.UniqueKey<T65811Record> getMainKey() {
		return Keys.KEY_t_658_11_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T65811Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<T65811Record>>asList(Keys.KEY_t_658_11_PRIMARY);
	}

	@Override
	public T65811 as(java.lang.String alias) {
		return new T65811(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
