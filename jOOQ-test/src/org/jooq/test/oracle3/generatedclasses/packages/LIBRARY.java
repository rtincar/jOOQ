/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in LIBRARY
 */
public final class LIBRARY extends org.jooq.impl.PackageImpl {

	private static final long serialVersionUID = 403831532;

	/**
	 * The singleton instance of LIBRARY
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.LIBRARY LIBRARY = new org.jooq.test.oracle3.generatedclasses.packages.LIBRARY();

	/**
	 * Invoke PKG_F_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_pkgFAuthorExists1(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_pkgFAuthorExists1(java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		return f.asField();
	}

	/**
	 * Get PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_pkgFAuthorExists1(org.jooq.Field<java.lang.String> AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		return f.asField();
	}

	/**
	 * Invoke PKG_F_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME
	 * @param UNUSED
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_pkgFAuthorExists2(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 * @param UNUSED
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_pkgFAuthorExists2(java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		return f.asField();
	}

	/**
	 * Get PKG_F_AUTHOR_EXISTS as a field
	 *
	 * @param AUTHOR_NAME
	 * @param UNUSED
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_pkgFAuthorExists2(org.jooq.Field<java.lang.String> AUTHOR_NAME, org.jooq.Field<? extends java.lang.Number> UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		return f.asField();
	}

	/**
	 * Invoke PKG_F_UNUSED
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_pkgFUnused(org.jooq.Configuration configuration) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get PKG_F_UNUSED as a field
	 *
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_pkgFUnused() {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED();

		return f.asField();
	}

	/**
	 * Invoke PKG_F378
	 *
	 * @param RETURN_VALUE OUT parameter
	 * @param I IN parameter
	 * @param IO IN OUT parameter
	 * @param O OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378 call_pkgF378(org.jooq.Configuration configuration, java.lang.Number I, java.lang.Number IO) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378();
		p.setI(I);
		p.setIO(IO);

		p.execute(configuration);
		return p;
	}

	/**
	 * Invoke PKG_P_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME IN parameter
	 * @param RESULT OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal call_pkgPAuthorExists1(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS();
		p.setAUTHOR_NAME(AUTHOR_NAME);

		p.execute(configuration);
		return p.getRESULT();
	}

	/**
	 * Invoke PKG_P_AUTHOR_EXISTS
	 *
	 * @param AUTHOR_NAME IN parameter
	 * @param RESULT OUT parameter
	 * @param UNUSED IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS call_pkgPAuthorExists2(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS();
		p.setAUTHOR_NAME(AUTHOR_NAME);
		p.setUNUSED(UNUSED);

		p.execute(configuration);
		return p;
	}
	/**
	 * No further instances allowed
	 */
	private LIBRARY() {
		super("LIBRARY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}
}
