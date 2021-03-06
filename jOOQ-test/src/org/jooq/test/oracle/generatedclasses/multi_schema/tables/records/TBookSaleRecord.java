/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_SALE", schema = "MULTI_SCHEMA")
public class TBookSaleRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> {

	private static final long serialVersionUID = 1301568703;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_TO_BOOK_STORE
	 * FOREIGN KEY (BOOK_STORE_NAME, BOOK_ID)
	 * REFERENCES TEST.T_BOOK_TO_BOOK_STORE (BOOK_STORE_NAME, BOOK_ID)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_TO_BOOK_STORE
	 * FOREIGN KEY (BOOK_STORE_NAME, BOOK_ID)
	 * REFERENCES TEST.T_BOOK_TO_BOOK_STORE (BOOK_STORE_NAME, BOOK_ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "BOOK_ID")
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_TO_BOOK_STORE
	 * FOREIGN KEY (BOOK_STORE_NAME, BOOK_ID)
	 * REFERENCES TEST.T_BOOK_TO_BOOK_STORE (BOOK_STORE_NAME, BOOK_ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord fetchTBookToBookStore() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME)))
			.and(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_TO_BOOK_STORE
	 * FOREIGN KEY (BOOK_STORE_NAME, BOOK_ID)
	 * REFERENCES TEST.T_BOOK_TO_BOOK_STORE (BOOK_STORE_NAME, BOOK_ID)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_TO_BOOK_STORE
	 * FOREIGN KEY (BOOK_STORE_NAME, BOOK_ID)
	 * REFERENCES TEST.T_BOOK_TO_BOOK_STORE (BOOK_STORE_NAME, BOOK_ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME")
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSoldAt(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_AT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SOLD_AT")
	public java.sql.Date getSoldAt() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_AT);
	}

	/**
	 * An uncommented item
	 */
	public void setSoldFor(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_FOR, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SOLD_FOR")
	public java.math.BigDecimal getSoldFor() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_FOR);
	}

	/**
	 * Create a detached TBookSaleRecord
	 */
	public TBookSaleRecord() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}
}
