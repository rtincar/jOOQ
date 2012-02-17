
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test;

//import $recordClassImport;
import org.jooq.mp.mysql.test.Test;
import org.jooq.mp.mysql.test.Keys;

import org.jooq.Table;
import org.jooq.UniqueKey;
import org.jooq.ForeignKey;
import java.util.List;
import java.util.Arrays;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class Test extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of test
	 */
	public static final Test TEST = new Test();

	/**
	 * No further instances allowed
	 */
//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-model-name-test@
	private Test() {
		super("TEST");
	}
//MP-MANAGED-UPDATABLE-ENDING

	@Override
	public final List<Table<?>> getTables() {
		return Arrays.<Table<?>>asList(

			org.jooq.mp.mysql.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE,

			org.jooq.mp.mysql.test.tables.T65811.__T_658_11,

			org.jooq.mp.mysql.test.tables.T65812.__T_658_12,

			org.jooq.mp.mysql.test.tables.T65821.__T_658_21,

			org.jooq.mp.mysql.test.tables.T65822.__T_658_22,

			org.jooq.mp.mysql.test.tables.T65831.__T_658_31,

			org.jooq.mp.mysql.test.tables.T65832.__T_658_32,

			org.jooq.mp.mysql.test.tables.T725LobTest.__T_725_LOB_TEST,

			org.jooq.mp.mysql.test.tables.TAuthor.__T_AUTHOR,

			org.jooq.mp.mysql.test.tables.TBook.__T_BOOK,

			org.jooq.mp.mysql.test.tables.TBookDetails.__T_BOOK_DETAILS,

			org.jooq.mp.mysql.test.tables.TBookToBookStore.__T_BOOK_TO_BOOK_STORE,

			org.jooq.mp.mysql.test.tables.TBooleans.__T_BOOLEANS,

			org.jooq.mp.mysql.test.tables.TDates.__T_DATES,

			org.jooq.mp.mysql.test.tables.TIdentityPk.__T_IDENTITY_PK,

			org.jooq.mp.mysql.test.tables.TLanguage.__T_LANGUAGE,

			org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS,

			org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69,

			org.jooq.mp.mysql.test.tables.XTestCase71.__X_TEST_CASE_71,

			org.jooq.mp.mysql.test.tables.XTestCase85.__X_TEST_CASE_85,

			org.jooq.mp.mysql.test.tables.XUnused.__X_UNUSED,

			org.jooq.mp.mysql.test.tables.VAuthor.__V_AUTHOR,

			org.jooq.mp.mysql.test.tables.VBook.__V_BOOK,

			org.jooq.mp.mysql.test.tables.VLibrary.__V_LIBRARY
		);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
