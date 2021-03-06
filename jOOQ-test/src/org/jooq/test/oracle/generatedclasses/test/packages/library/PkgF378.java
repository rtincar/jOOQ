/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.packages.library;

/**
 * This class is generated by jOOQ.
 */
public class PkgF378 extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -1998498536;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I = createParameter("I", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO = createParameter("IO", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O = createParameter("O", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PkgF378() {
		super(org.jooq.SQLDialect.ORACLE, "PKG_F378", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.packages.Library.LIBRARY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(I);
		addInOutParameter(IO);
		addOutParameter(O);
	}

	/**
	 * Set the <code>I</code> parameter to the routine
	 */
	public void setI(java.lang.Number value) {
		setNumber(I, value);
	}

	/**
	 * Set the <code>IO</code> parameter to the routine
	 */
	public void setIo(java.lang.Number value) {
		setNumber(IO, value);
	}

	public java.math.BigDecimal getIo() {
		return getValue(IO);
	}

	public java.math.BigDecimal getO() {
		return getValue(O);
	}
}
