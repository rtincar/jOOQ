/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 308469593;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBook.CO_AUTHOR_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBook.AUTHOR_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR);
	}
}
