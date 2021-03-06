/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo;

/**
 * This class is generated by jOOQ.
 */
public class Dbo extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1807066923;

	/**
	 * The singleton instance of dbo
	 */
	public static final Dbo DBO = new Dbo();

	/**
	 * No further instances allowed
	 */
	private Dbo() {
		super("dbo");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.sqlserver.adventureworks.dbo.tables.Awbuildversion.AWBUILDVERSION,
			org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog.DATABASELOG,
			org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG);
	}
}
