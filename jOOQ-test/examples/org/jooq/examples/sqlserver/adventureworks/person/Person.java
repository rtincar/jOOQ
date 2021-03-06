/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person;

/**
 * This class is generated by jOOQ.
 */
public class Person extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 569470127;

	/**
	 * The singleton instance of Person
	 */
	public static final Person PERSON = new Person();

	/**
	 * No further instances allowed
	 */
	private Person() {
		super("Person");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Addresstype.ADDRESSTYPE,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.CONTACT,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype.CONTACTTYPE,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Countryregion.COUNTRYREGION,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Vadditionalcontactinfo.VADDITIONALCONTACTINFO,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Vstateprovincecountryregion.VSTATEPROVINCECOUNTRYREGION);
	}
}
