/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class PTables1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1043541001;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord> OUT_TABLE = createParameter("OUT_TABLE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PTables1() {
		super(org.jooq.SQLDialect.ORACLE, "P_TABLES1", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(IN_TABLE);
		addOutParameter(OUT_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the routine
	 */
	public void setInTable(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord value) {
		setValue(IN_TABLE, value);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord getOutTable() {
		return getValue(OUT_TABLE);
	}
}
