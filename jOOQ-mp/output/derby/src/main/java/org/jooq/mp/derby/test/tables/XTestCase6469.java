
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.XTestCase6469Record;
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
public class XTestCase6469 extends org.jooq.impl.UpdatableTableImpl <XTestCase6469Record> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of XTestCase6469
	 */
	public static final XTestCase6469 __X_TEST_CASE_64_69 = new XTestCase6469();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase6469Record> __RECORD_TYPE = XTestCase6469Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase6469Record> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<XTestCase6469Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);


   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase6469.unusedId]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public final TableField<XTestCase6469Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);


	/**
	 * No further instances allowed
	 */
	private XTestCase6469() {
		super("X_TEST_CASE_64_69", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private XTestCase6469(String alias) {
		super(alias, Test.TEST, XTestCase6469.__X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.UniqueKey<XTestCase6469Record> getMainKey() {
		return Keys.KEY_x_test_case_64_69_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<XTestCase6469Record>> getKeys() {
		return java.util.Arrays.<UniqueKey<XTestCase6469Record>>asList(Keys.KEY_x_test_case_64_69_PRIMARY);
	}

	@Override
	public XTestCase6469 as(java.lang.String alias) {
		return new XTestCase6469(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
