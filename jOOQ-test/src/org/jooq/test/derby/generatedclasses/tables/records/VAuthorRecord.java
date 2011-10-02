/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -596079294;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VAuthor.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	/**
	 * Create an attached VAuthorRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public VAuthorRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.derby.generatedclasses.tables.VAuthor.V_AUTHOR, configuration);
	}
}
