/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class SalesByStoreRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SalesByStoreRecord> {

	private static final long serialVersionUID = -1283247364;

	/**
	 * An uncommented item
	 */
	public void setStore(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.STORE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getStore() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.STORE);
	}

	/**
	 * An uncommented item
	 */
	public void setManager(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.MANAGER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getManager() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.MANAGER);
	}

	/**
	 * An uncommented item
	 */
	public void setTotalSales(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.TOTAL_SALES, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getTotalSales() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.TOTAL_SALES);
	}

	/**
	 * Create a detached SalesByStoreRecord
	 */
	public SalesByStoreRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE);
	}

	/**
	 * Create an attached SalesByStoreRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public SalesByStoreRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE, configuration);
	}
}
