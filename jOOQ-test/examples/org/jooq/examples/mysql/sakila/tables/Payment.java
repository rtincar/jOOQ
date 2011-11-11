/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Payment extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> {

	private static final long serialVersionUID = -530374556;

	/**
	 * The singleton instance of payment
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Payment PAYMENT = new org.jooq.examples.mysql.sakila.tables.Payment();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.PaymentRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.lang.Short> PAYMENT_ID = createField("payment_id", org.jooq.impl.SQLDataType.SMALLINT, PAYMENT);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.customer_id]
	 * REFERENCES customer [sakila.customer.customer_id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.lang.Short> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINT, PAYMENT);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.staff_id]
	 * REFERENCES staff [sakila.staff.staff_id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.lang.Byte> STAFF_ID = createField("staff_id", org.jooq.impl.SQLDataType.TINYINT, PAYMENT);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.rental_id]
	 * REFERENCES rental [sakila.rental.rental_id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.lang.Integer> RENTAL_ID = createField("rental_id", org.jooq.impl.SQLDataType.INTEGER, PAYMENT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.math.BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL, PAYMENT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.sql.Timestamp> PAYMENT_DATE = createField("payment_date", org.jooq.impl.SQLDataType.TIMESTAMP, PAYMENT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, PAYMENT);

	/**
	 * No further instances allowed
	 */
	private Payment() {
		super("payment", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_payment;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_payment_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_payment_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.fk_payment_customer, org.jooq.examples.mysql.sakila.Keys.fk_payment_staff, org.jooq.examples.mysql.sakila.Keys.fk_payment_rental);
	}
}
