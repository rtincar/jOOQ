/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Currencyrate extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord> {

	private static final long serialVersionUID = -2064560685;

	/**
	 * The singleton instance of CurrencyRate
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate CURRENCYRATE = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.lang.Integer> CURRENCYRATEID = createField("CurrencyRateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.sql.Timestamp> CURRENCYRATEDATE = createField("CurrencyRateDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.CurrencyRate.FromCurrencyCode]
	 * REFERENCES Currency [Sales.Currency.CurrencyCode]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.lang.String> FROMCURRENCYCODE = createField("FromCurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.CurrencyRate.ToCurrencyCode]
	 * REFERENCES Currency [Sales.Currency.CurrencyCode]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.lang.String> TOCURRENCYCODE = createField("ToCurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.math.BigDecimal> AVERAGERATE = createField("AverageRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.math.BigDecimal> ENDOFDAYRATE = createField("EndOfDayRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Currencyrate() {
		super("CurrencyRate", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Currencyrate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_CurrencyRate;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CurrencyRate_CurrencyRateID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CurrencyRate_CurrencyRateID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CurrencyRate_Currency_FromCurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CurrencyRate_Currency_ToCurrencyCode);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate(alias);
	}
}
