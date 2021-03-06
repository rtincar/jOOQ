/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
public class PublicFactory extends org.jooq.util.h2.H2Factory {

	private static final long serialVersionUID = -366537222;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public PublicFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #PublicFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public PublicFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public PublicFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
