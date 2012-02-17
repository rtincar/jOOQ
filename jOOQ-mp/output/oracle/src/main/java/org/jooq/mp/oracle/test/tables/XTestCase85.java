
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables;

import org.jooq.mp.oracle.test.tables.records.XTestCase85Record;
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
public class XTestCase85 extends org.jooq.impl.UpdatableTableImpl <XTestCase85Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of XTestCase85
	 */
	public static final XTestCase85 __X_TEST_CASE_85 = new XTestCase85();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase85Record> __RECORD_TYPE = XTestCase85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase85Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<XTestCase85Record, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT, this);


   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase85.XUnusedId]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public final TableField<XTestCase85Record, java.lang.Long> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.BIGINT, this);


	/**
	 * No further instances allowed
	 */
	private XTestCase85() {
		super("X_TEST_CASE_85", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private XTestCase85(String alias) {
		super(alias, Test.TEST, XTestCase85.__X_TEST_CASE_85);
	}

	@Override
	public org.jooq.UniqueKey<XTestCase85Record> getMainKey() {
		return Keys.KEY_x_test_case_85_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<XTestCase85Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<XTestCase85Record>>asList(Keys.KEY_x_test_case_85_PRIMARY);
	}

	@Override
	public XTestCase85 as(java.lang.String alias) {
		return new XTestCase85(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
