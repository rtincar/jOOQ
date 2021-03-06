/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
public class DateAsTimestampTest extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1344120928;

	/**
	 * The singleton instance of TEST
	 */
	public static final DateAsTimestampTest DATE_AS_TIMESTAMP_TEST = new DateAsTimestampTest();

	/**
	 * No further instances allowed
	 */
	private DateAsTimestampTest() {
		super("TEST");
	}

	/*
	 * instance initialiser
	 */
	{
		addMapping("TEST.T_976_OBJECT_TYPE", org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord.class);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976);
	}

	@Override
	public final java.util.List<org.jooq.UDT<?>> getUDTs() {
		return java.util.Arrays.<org.jooq.UDT<?>>asList(org.jooq.test.oracle2.generatedclasses.udt.DateAsTimestampT_976ObjectType.DATE_AS_TIMESTAMP_T_976_OBJECT_TYPE);
	}
}
