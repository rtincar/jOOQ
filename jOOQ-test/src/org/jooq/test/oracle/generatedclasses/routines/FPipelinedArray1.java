/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class FPipelinedArray1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> {

	private static final long serialVersionUID = -561194325;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FPipelinedArray1() {
		super(org.jooq.SQLDialect.ORACLE, "F_PIPELINED_ARRAY1", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
	}
}
