/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> {

	private static final long serialVersionUID = 1838715971;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCustomerId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getCustomerId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> fetchPaymentList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT)
			.where(org.jooq.examples.mysql.sakila.tables.Payment.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> getPaymentList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT)
			.where(org.jooq.examples.mysql.sakila.tables.Payment.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> fetchRentalList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> getRentalList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER_ID)))
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
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.STORE_ID, value);
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
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.STORE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.store_id]
	 * REFERENCES store [sakila.store.store_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StoreRecord fetchStore() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.STORE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.store_id]
	 * REFERENCES store [sakila.store.store_id]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.examples.mysql.sakila.tables.records.StoreRecord getStore() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.STORE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setEmail(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.EMAIL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getEmail() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.EMAIL);
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
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.ADDRESS_ID, value);
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
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.ADDRESS_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.address_id]
	 * REFERENCES address [sakila.address.address_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.AddressRecord fetchAddress() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.ADDRESS_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.customer.address_id]
	 * REFERENCES address [sakila.address.address_id]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.examples.mysql.sakila.tables.records.AddressRecord getAddress() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.ADDRESS_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setActive(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.ACTIVE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getActive() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.ACTIVE);
	}

	/**
	 * An uncommented item
	 */
	public void setCreateDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CREATE_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getCreateDate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CREATE_DATE);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.LAST_UPDATE);
	}

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER);
	}

	/**
	 * Create an attached CustomerRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public CustomerRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER, configuration);
	}
}
