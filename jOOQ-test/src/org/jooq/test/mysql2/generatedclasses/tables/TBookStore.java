/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -269022780;

	/**
	 * The singleton instance of test2.t_book_store
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.mysql2.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The books store name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("t_book_store", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_BOOK_STORE_UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_BOOK_STORE_UK_T_BOOK_STORE_NAME);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TBookStore(alias);
	}
}
