/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -1952103321;

	/**
	 * The singleton instance of t_book_to_book_store
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The book store name
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book_to_book_store.book_store_name]
	 * REFERENCES t_book_store [test.t_book_store.name]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("book_store_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book_to_book_store.book_id]
	 * REFERENCES t_book [test.t_book.ID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The number of books on stock
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("t_book_to_book_store", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_t_book_to_book_store_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_t_book_to_book_store_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.fk_b2bs_bs_name, org.jooq.test.mysql2.generatedclasses.Keys.fk_b2bs_b_id);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore(alias);
	}
}
