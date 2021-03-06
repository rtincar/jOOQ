/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
public class Test2Factory extends org.jooq.util.mysql.MySQLFactory {

	private static final long serialVersionUID = -1427816631;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public Test2Factory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #Test2Factory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public Test2Factory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public Test2Factory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
