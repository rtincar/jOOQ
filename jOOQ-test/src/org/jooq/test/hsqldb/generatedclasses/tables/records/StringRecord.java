/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class StringRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> {

	private static final long serialVersionUID = 297611396;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.String.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.String.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOther(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.String.OTHER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.String.OTHER);
	}

	/**
	 * Create a detached StringRecord
	 */
	public StringRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING);
	}

	/**
	 * Create an attached StringRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public StringRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING, configuration);
	}
}
