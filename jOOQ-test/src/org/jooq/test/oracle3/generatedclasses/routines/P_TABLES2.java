/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P_TABLES2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -223556704;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_TABLE> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_TABLE.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_TABLE> OUT_TABLE = createParameter("OUT_TABLE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public P_TABLES2() {
		super(org.jooq.SQLDialect.ORACLE, "P_TABLES2", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addInParameter(IN_TABLE);
		addOutParameter(OUT_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the routine
	 */
	public void setIN_TABLE(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_TABLE value) {
		setValue(IN_TABLE, value);
	}

	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_TABLE getOUT_TABLE() {
		return getValue(OUT_TABLE);
	}
}
