
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.T725LobTestRecord;
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
public class T725LobTest extends org.jooq.impl.UpdatableTableImpl <T725LobTestRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T725LobTest
	 */
	public static final T725LobTest __T_725_LOB_TEST = new T725LobTest();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T725LobTestRecord> __RECORD_TYPE = T725LobTestRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T725LobTestRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<T725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * LOB mapping for LOB
	 */
	public final TableField<T725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, this);


	/**
	 * No further instances allowed
	 */
	private T725LobTest() {
		super("T_725_LOB_TEST", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T725LobTest(String alias) {
		super(alias, Test.TEST, T725LobTest.__T_725_LOB_TEST);
	}

	@Override
	public org.jooq.UniqueKey<T725LobTestRecord> getMainKey() {
		return Keys.KEY_t_725_lob_test_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T725LobTestRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<T725LobTestRecord>>asList(Keys.KEY_t_725_lob_test_PRIMARY);
	}

	@Override
	public T725LobTest as(java.lang.String alias) {
		return new T725LobTest(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
