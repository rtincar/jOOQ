/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F691CURSOR_OUT extends org.jooq.impl.AbstractRoutine<org.jooq.Result<org.jooq.Record>> {

	private static final long serialVersionUID = -2074989120;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public F691CURSOR_OUT() {
		super(org.jooq.SQLDialect.ORACLE, "F691CURSOR_OUT", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.RESULT);

		setReturnParameter(RETURN_VALUE);
	}
}
