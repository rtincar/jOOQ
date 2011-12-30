/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> {

	private static final long serialVersionUID = 72829924;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCustomerId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getCustomerId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> fetchPaymentList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT)
			.where(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> fetchRentalList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.store_id]
	 * REFERENCES store [sakila.store.store_id]
	 * </pre></code>
	 */
	public void setStoreId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.store_id]
	 * REFERENCES store [sakila.store.store_id]
	 * </pre></code>
	 */
	public java.lang.Byte getStoreId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.store_id]
	 * REFERENCES store [sakila.store.store_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StoreRecord fetchStore() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setEmail(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getEmail() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.address_id]
	 * REFERENCES address [sakila.address.address_id]
	 * </pre></code>
	 */
	public void setAddressId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.address_id]
	 * REFERENCES address [sakila.address.address_id]
	 * </pre></code>
	 */
	public java.lang.Short getAddressId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.address_id]
	 * REFERENCES address [sakila.address.address_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.AddressRecord fetchAddress() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setActive(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getActive() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE);
	}

	/**
	 * An uncommented item
	 */
	public void setCreateDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getCreateDate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE);
	}

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER);
	}
}
