/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the dbo schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.test.ase.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> IDENTITY_t_triggers = createIdentity(org.jooq.test.ase.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.ase.generatedclasses.tables.TTriggers.ID_GENERATED);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_639NumbersTableRecord> t_639_numbers_table__pk_t_639_numbers_table = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.ase.generatedclasses.tables.T_639NumbersTable.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord> t_725_lob_test__pk_t_725_lob_test = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.ase.generatedclasses.tables.T_725LobTest.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record> t_986_1__pk_986 = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.ase.generatedclasses.tables.T_986_1.REF);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_2Record> t_986_2__pk_986 = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.ase.generatedclasses.tables.T_986_2.REF);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TAuthorRecord> t_author__pk_t_author = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.ase.generatedclasses.tables.TAuthor.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookRecord> t_book__pk_t_book = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.ase.generatedclasses.tables.TBook.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord> t_book_store__uk_t_book_store_name = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.ase.generatedclasses.tables.TBookStore.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> t_book_to_book_store__pk_b2bs = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord> t_booleans__pk_t_booleans = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.ase.generatedclasses.tables.TBooleans.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TTriggersRecord> t_triggers__pk_t_triggers = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.ase.generatedclasses.tables.TTriggers.ID_GENERATED);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record> x_test_case_64_69__pk_x_test_case_64_69 = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_71Record> x_test_case_71__pk_x_test_case_71 = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.ase.generatedclasses.tables.XTestCase_71.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record> x_test_case_85__pk_x_test_case_85 = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.ase.generatedclasses.tables.XTestCase_85.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord> x_unused__pk_x_unused = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.ase.generatedclasses.tables.XUnused.ID, org.jooq.test.ase.generatedclasses.tables.XUnused.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord> x_unused__uk_x_unused_id = createUniqueKey(org.jooq.test.ase.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.ase.generatedclasses.tables.XUnused.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.TBookRecord, org.jooq.test.ase.generatedclasses.tables.records.TAuthorRecord> t_book__fk_t_book_author_id = createForeignKey(t_author__pk_t_author, org.jooq.test.ase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.ase.generatedclasses.tables.TBook.AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.TBookRecord, org.jooq.test.ase.generatedclasses.tables.records.TAuthorRecord> t_book__fk_t_book_co_author_id = createForeignKey(t_author__pk_t_author, org.jooq.test.ase.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.ase.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord> t_book_to_book_store__fk_b2bs_bs_name = createForeignKey(t_book_store__uk_t_book_store_name, org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.ase.generatedclasses.tables.records.TBookRecord> t_book_to_book_store__fk_b2bs_b_id = createForeignKey(t_book__pk_t_book, org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord> x_test_case_64_69__fk_x_test_case_64_69 = createForeignKey(x_unused__uk_x_unused_id, org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record> x_test_case_71__fk_x_test_case_71 = createForeignKey(x_test_case_64_69__pk_x_test_case_64_69, org.jooq.test.ase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.ase.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord> x_test_case_85__fk_x_test_case_85 = createForeignKey(x_unused__pk_x_unused, org.jooq.test.ase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.ase.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, org.jooq.test.ase.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord> x_unused__fk_x_unused_self = createForeignKey(x_unused__pk_x_unused, org.jooq.test.ase.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.ase.generatedclasses.tables.XUnused.ID_REF, org.jooq.test.ase.generatedclasses.tables.XUnused.NAME_REF);

	/**
	 * No instances
	 */
	private Keys() {}
}
