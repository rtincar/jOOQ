/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class Rental extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> {

	private static final long serialVersionUID = 1698068118;

	/**
	 * The singleton instance of sakila.rental
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Rental RENTAL = new org.jooq.examples.mysql.sakila.tables.Rental();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.RentalRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.lang.Integer> RENTAL_ID = createField("rental_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.sql.Timestamp> RENTAL_DATE = createField("rental_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_rental_inventory
	 * FOREIGN KEY (inventory_id)
	 * REFERENCES sakila.inventory (inventory_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.lang.Integer> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_rental_customer
	 * FOREIGN KEY (customer_id)
	 * REFERENCES sakila.customer (customer_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.lang.Short> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.sql.Timestamp> RETURN_DATE = createField("return_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_rental_staff
	 * FOREIGN KEY (staff_id)
	 * REFERENCES sakila.staff (staff_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.lang.Byte> STAFF_ID = createField("staff_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Rental() {
		super("rental", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private Rental(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Rental.RENTAL);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_RENTAL;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_RENTAL_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_RENTAL_PRIMARY, org.jooq.examples.mysql.sakila.Keys.KEY_RENTAL_RENTAL_DATE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.RentalRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_RENTAL_INVENTORY, org.jooq.examples.mysql.sakila.Keys.FK_RENTAL_CUSTOMER, org.jooq.examples.mysql.sakila.Keys.FK_RENTAL_STAFF);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Rental as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Rental(alias);
	}
}
