
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test.tables;

import org.jooq.mp.mysql.test.tables.records.T65822Record;
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
public class T65822 extends org.jooq.impl.UpdatableTableImpl <T65822Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T65822
	 */
	public static final T65822 __T_658_22 = new T65822();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T65822Record> __RECORD_TYPE = T65822Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T65822Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY id
	 */
	public final TableField<T65822Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * CD mapping for cd
	 */
	public final TableField<T65822Record, java.lang.Integer> CD = createField("cd", org.jooq.impl.SQLDataType.INTEGER, this);


	/**
	 * No further instances allowed
	 */
	private T65822() {
		super("t_658_22", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T65822(String alias) {
		super(alias, Test.TEST, T65822.__T_658_22);
	}

	@Override
	public org.jooq.UniqueKey<T65822Record> getMainKey() {
		return Keys.KEY_t_658_22_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T65822Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<T65822Record>>asList(Keys.KEY_t_658_22_PRIMARY);
	}

	@Override
	public T65822 as(java.lang.String alias) {
		return new T65822(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
