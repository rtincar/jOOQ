/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class ObjectRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord> {

	private static final long serialVersionUID = -1393659592;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (OTHER, null) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setOther(java.lang.Object value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.OTHER, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (OTHER, null) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.OTHER);
	}

	/**
	 * Create a detached ObjectRecord
	 */
	public ObjectRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT);
	}

	/**
	 * Create an attached ObjectRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public ObjectRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT, configuration);
	}
}
