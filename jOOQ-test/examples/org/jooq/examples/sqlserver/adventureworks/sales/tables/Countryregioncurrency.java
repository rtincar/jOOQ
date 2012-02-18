/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Countryregioncurrency extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord> {

	private static final long serialVersionUID = -524007537;

	/**
	 * The singleton instance of CountryRegionCurrency
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency COUNTRYREGIONCURRENCY = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_CountryRegion_CountryRegionCode
	 * FOREIGN KEY (CountryRegionCode)
	 * REFERENCES Person.CountryRegion (CountryRegionCode)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, java.lang.String> COUNTRYREGIONCODE = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CountryRegionCurrency_Currency_CurrencyCode
	 * FOREIGN KEY (CurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, java.lang.String> CURRENCYCODE = createField("CurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Countryregioncurrency() {
		super("CountryRegionCurrency", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Countryregioncurrency(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CountryRegionCurrency_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CountryRegionCurrency_Currency_CurrencyCode);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency(alias);
	}
}
