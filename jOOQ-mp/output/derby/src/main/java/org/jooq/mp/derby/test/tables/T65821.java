
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.T65821Record;
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
public class T65821 extends org.jooq.impl.UpdatableTableImpl <T65821Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T65821
	 */
	public static final T65821 __T_658_21 = new T65821();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T65821Record> __RECORD_TYPE = T65821Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T65821Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<T65821Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);



	/**
	 * No further instances allowed
	 */
	private T65821() {
		super("T_658_21", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T65821(String alias) {
		super(alias, Test.TEST, T65821.__T_658_21);
	}

	@Override
	public org.jooq.UniqueKey<T65821Record> getMainKey() {
		return Keys.KEY_t_658_21_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T65821Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<T65821Record>>asList(Keys.KEY_t_658_21_PRIMARY);
	}

	@Override
	public T65821 as(java.lang.String alias) {
		return new T65821(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
