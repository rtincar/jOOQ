/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.packages;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in LIBRARY_767_PACKAGE_TEST
 */
public final class Library_767PackageTest extends org.jooq.impl.PackageImpl {

	private static final long serialVersionUID = 1396427332;

	/**
	 * The singleton instance of LIBRARY_767_PACKAGE_TEST
	 */
	public static org.jooq.test.oracle.generatedclasses.packages.Library_767PackageTest LIBRARY_767_PACKAGE_TEST = new org.jooq.test.oracle.generatedclasses.packages.Library_767PackageTest();

	/**
	 * Invoke LIBRARY_767_PACKAGE_TEST
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal library_767PackageTest(org.jooq.Configuration configuration) {
		org.jooq.test.oracle.generatedclasses.packages.library_767_package_test.Library_767PackageTest f = new org.jooq.test.oracle.generatedclasses.packages.library_767_package_test.Library_767PackageTest();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get LIBRARY_767_PACKAGE_TEST as a field
	 *
	 */
	public static org.jooq.Field<java.math.BigDecimal> library_767PackageTest() {
		org.jooq.test.oracle.generatedclasses.packages.library_767_package_test.Library_767PackageTest f = new org.jooq.test.oracle.generatedclasses.packages.library_767_package_test.Library_767PackageTest();

		return f.asField();
	}
	/**
	 * No further instances allowed
	 */
	private Library_767PackageTest() {
		super("LIBRARY_767_PACKAGE_TEST", org.jooq.test.oracle.generatedclasses.Test.TEST);
	}
}
