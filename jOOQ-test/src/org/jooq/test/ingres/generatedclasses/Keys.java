/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the test schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> IDENTITY_t_triggers = createIdentity(org.jooq.test.ingres.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.ingres.generatedclasses.tables.TTriggers.ID_GENERATED);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.T_639NumbersTableRecord> pk_t_639_numbers_table = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.ingres.generatedclasses.tables.T_639NumbersTable.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord> pk_t_725_lob_test = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.ingres.generatedclasses.tables.T_725LobTest.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord> pk_t_author = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.ingres.generatedclasses.tables.TAuthor.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> pk_t_book = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.ingres.generatedclasses.tables.TBook.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookStoreRecord> uk_t_book_store_name = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.ingres.generatedclasses.tables.TBookStore.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookToBookStoreRecord> pk_b2bs = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBooleansRecord> pk_t_booleans = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.ingres.generatedclasses.tables.TBooleans.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord> pk_t_triggers = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.ingres.generatedclasses.tables.TTriggers.ID_GENERATED);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record> pk_x_test_case_64_69 = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_71Record> pk_x_test_case_71 = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record> pk_x_test_case_85 = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> pk_x_unused = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.ingres.generatedclasses.tables.XUnused.ID, org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> uk_x_unused_id = createUniqueKey(org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.ingres.generatedclasses.tables.XUnused.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord> fk_t_book_author_id = createForeignKey(pk_t_author, org.jooq.test.ingres.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord> fk_t_book_co_author_id = createForeignKey(pk_t_author, org.jooq.test.ingres.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.ingres.generatedclasses.tables.records.TBookStoreRecord> fk_b2bs_bs_name = createForeignKey(uk_t_book_store_name, org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> fk_b2bs_b_id = createForeignKey(pk_t_book, org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> fk_x_test_case_64_69 = createForeignKey(uk_x_unused_id, org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.ingres.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_64_69Record> fk_x_test_case_71 = createForeignKey(pk_x_test_case_64_69, org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.ingres.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> fk_x_test_case_85 = createForeignKey(pk_x_unused, org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, org.jooq.test.ingres.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> fk_x_unused_self = createForeignKey(pk_x_unused, org.jooq.test.ingres.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.ingres.generatedclasses.tables.XUnused.ID_REF, org.jooq.test.ingres.generatedclasses.tables.XUnused.NAME_REF);

	/**
	 * No instances
	 */
	private Keys() {}
}
