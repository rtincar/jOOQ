/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the Sales schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditcardRecord, java.lang.Integer> IDENTITY_CreditCard = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Creditcard.CREDITCARD, org.jooq.examples.sqlserver.adventureworks.sales.tables.Creditcard.CREDITCARD.CREDITCARDID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, java.lang.Integer> IDENTITY_CurrencyRate = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE.CURRENCYRATEID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord, java.lang.Integer> IDENTITY_Customer = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER.CUSTOMERID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderdetailRecord, java.lang.Integer> IDENTITY_SalesOrderDetail = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL.SALESORDERDETAILID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, java.lang.Integer> IDENTITY_SalesOrderHeader = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.SALESORDERID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesreasonRecord, java.lang.Integer> IDENTITY_SalesReason = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesreason.SALESREASON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesreason.SALESREASON.SALESREASONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, java.lang.Integer> IDENTITY_SalesTaxRate = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.SALESTAXRATEID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord, java.lang.Integer> IDENTITY_SalesTerritory = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.TERRITORYID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingcartitemRecord, java.lang.Integer> IDENTITY_ShoppingCartItem = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Shoppingcartitem.SHOPPINGCARTITEM, org.jooq.examples.sqlserver.adventureworks.sales.tables.Shoppingcartitem.SHOPPINGCARTITEM.SHOPPINGCARTITEMID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferRecord, java.lang.Integer> IDENTITY_SpecialOffer = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialoffer.SPECIALOFFER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialoffer.SPECIALOFFER.SPECIALOFFERID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord> PK_ContactCreditCard_ContactID_CreditCardID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CONTACTID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CREDITCARDID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord> PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.COUNTRYREGIONCODE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.CURRENCYCODE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditcardRecord> PK_CreditCard_CreditCardID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Creditcard.CREDITCARD, org.jooq.examples.sqlserver.adventureworks.sales.tables.Creditcard.CREDITCARD.CREDITCARDID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRecord> PK_Currency_CurrencyCode = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Currency.CURRENCY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currency.CURRENCY.CURRENCYCODE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord> PK_CurrencyRate_CurrencyRateID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE.CURRENCYRATEID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord> PK_Customer_CustomerID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER.CUSTOMERID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord> PK_CustomerAddress_CustomerID_AddressID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS.CUSTOMERID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS.ADDRESSID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.IndividualRecord> PK_Individual_CustomerID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.INDIVIDUAL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.INDIVIDUAL.CUSTOMERID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderdetailRecord> PK_SalesOrderDetail_SalesOrderID_SalesOrderDetailID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL.SALESORDERID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL.SALESORDERDETAILID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord> PK_SalesOrderHeader_SalesOrderID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.SALESORDERID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord> PK_SalesOrderHeaderSalesReason_SalesOrderID_SalesReasonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESORDERID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESREASONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> PK_SalesPerson_SalesPersonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON.SALESPERSONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonquotahistoryRecord> PK_SalesPersonQuotaHistory_SalesPersonID_QuotaDate = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salespersonquotahistory.SALESPERSONQUOTAHISTORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salespersonquotahistory.SALESPERSONQUOTAHISTORY.SALESPERSONID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salespersonquotahistory.SALESPERSONQUOTAHISTORY.QUOTADATE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesreasonRecord> PK_SalesReason_SalesReasonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesreason.SALESREASON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesreason.SALESREASON.SALESREASONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord> PK_SalesTaxRate_SalesTaxRateID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.SALESTAXRATEID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord> PK_SalesTerritory_TerritoryID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.TERRITORYID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord> PK_SalesTerritoryHistory_SalesPersonID_StartDate_TerritoryID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.SALESPERSONID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.STARTDATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.TERRITORYID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingcartitemRecord> PK_ShoppingCartItem_ShoppingCartItemID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Shoppingcartitem.SHOPPINGCARTITEM, org.jooq.examples.sqlserver.adventureworks.sales.tables.Shoppingcartitem.SHOPPINGCARTITEM.SHOPPINGCARTITEMID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferRecord> PK_SpecialOffer_SpecialOfferID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialoffer.SPECIALOFFER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialoffer.SPECIALOFFER.SPECIALOFFERID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferproductRecord> PK_SpecialOfferProduct_SpecialOfferID_ProductID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT.SPECIALOFFERID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT.PRODUCTID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreRecord> PK_Store_CustomerID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.CUSTOMERID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord> PK_StoreContact_CustomerID_ContactID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT.CUSTOMERID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT.CONTACTID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> FK_ContactCreditCard_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CONTACTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditcardRecord> FK_ContactCreditCard_CreditCard_CreditCardID = createForeignKey(PK_CreditCard_CreditCardID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD, org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CREDITCARDID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryregionRecord> FK_CountryRegionCurrency_CountryRegion_CountryRegionCode = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.COUNTRYREGIONCODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryregioncurrencyRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRecord> FK_CountryRegionCurrency_Currency_CurrencyCode = createForeignKey(PK_Currency_CurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Countryregioncurrency.COUNTRYREGIONCURRENCY.CURRENCYCODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRecord> FK_CurrencyRate_Currency_FromCurrencyCode = createForeignKey(PK_Currency_CurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE.FROMCURRENCYCODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRecord> FK_CurrencyRate_Currency_ToCurrencyCode = createForeignKey(PK_Currency_CurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currencyrate.CURRENCYRATE.TOCURRENCYCODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord> FK_Customer_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER.TERRITORYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord> FK_CustomerAddress_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS.CUSTOMERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> FK_CustomerAddress_Address_AddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS.ADDRESSID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddresstypeRecord> FK_CustomerAddress_AddressType_AddressTypeID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_AddressType_AddressTypeID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS.ADDRESSTYPEID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.IndividualRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord> FK_Individual_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.INDIVIDUAL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.INDIVIDUAL.CUSTOMERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.IndividualRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> FK_Individual_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.INDIVIDUAL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.INDIVIDUAL.CONTACTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderdetailRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord> FK_SalesOrderDetail_SalesOrderHeader_SalesOrderID = createForeignKey(PK_SalesOrderHeader_SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL.SALESORDERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderdetailRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferproductRecord> FK_SalesOrderDetail_SpecialOfferProduct_SpecialOfferIDProductID = createForeignKey(PK_SpecialOfferProduct_SpecialOfferID_ProductID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL.SPECIALOFFERID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderdetail.SALESORDERDETAIL.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord> FK_SalesOrderHeader_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.CUSTOMERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> FK_SalesOrderHeader_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.CONTACTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> FK_SalesOrderHeader_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.SALESPERSONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord> FK_SalesOrderHeader_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.TERRITORYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> FK_SalesOrderHeader_Address_BillToAddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.BILLTOADDRESSID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> FK_SalesOrderHeader_Address_ShipToAddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.SHIPTOADDRESSID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipmethodRecord> FK_SalesOrderHeader_ShipMethod_ShipMethodID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_ShipMethod_ShipMethodID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.SHIPMETHODID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditcardRecord> FK_SalesOrderHeader_CreditCard_CreditCardID = createForeignKey(PK_CreditCard_CreditCardID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.CREDITCARDID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyrateRecord> FK_SalesOrderHeader_CurrencyRate_CurrencyRateID = createForeignKey(PK_CurrencyRate_CurrencyRateID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheader.SALESORDERHEADER.CURRENCYRATEID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheaderRecord> FK_SalesOrderHeaderSalesReason_SalesOrderHeader_SalesOrderID = createForeignKey(PK_SalesOrderHeader_SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESORDERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesorderheadersalesreasonRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesreasonRecord> FK_SalesOrderHeaderSalesReason_SalesReason_SalesReasonID = createForeignKey(PK_SalesReason_SalesReasonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesorderheadersalesreason.SALESORDERHEADERSALESREASON.SALESREASONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeRecord> FK_SalesPerson_Employee_SalesPersonID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON.SALESPERSONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord> FK_SalesPerson_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON.TERRITORYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonquotahistoryRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> FK_SalesPersonQuotaHistory_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salespersonquotahistory.SALESPERSONQUOTAHISTORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salespersonquotahistory.SALESPERSONQUOTAHISTORY.SALESPERSONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateprovinceRecord> FK_SalesTaxRate_StateProvince_StateProvinceID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_StateProvince_StateProvinceID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.STATEPROVINCEID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> FK_SalesTerritoryHistory_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.SALESPERSONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord> FK_SalesTerritoryHistory_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.TERRITORYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingcartitemRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ShoppingCartItem_Product_ProductID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Shoppingcartitem.SHOPPINGCARTITEM, org.jooq.examples.sqlserver.adventureworks.sales.tables.Shoppingcartitem.SHOPPINGCARTITEM.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferproductRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferRecord> FK_SpecialOfferProduct_SpecialOffer_SpecialOfferID = createForeignKey(PK_SpecialOffer_SpecialOfferID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT.SPECIALOFFERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialofferproductRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_SpecialOfferProduct_Product_ProductID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Specialofferproduct.SPECIALOFFERPRODUCT.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord> FK_Store_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.CUSTOMERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord> FK_Store_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.SALESPERSONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreRecord> FK_StoreContact_Store_CustomerID = createForeignKey(PK_Store_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT.CUSTOMERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactRecord> FK_StoreContact_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT.CONTACTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord> FK_StoreContact_ContactType_ContactTypeID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_ContactType_ContactTypeID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT, org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT.CONTACTTYPEID);

	/**
	 * No instances
	 */
	private Keys() {}
}