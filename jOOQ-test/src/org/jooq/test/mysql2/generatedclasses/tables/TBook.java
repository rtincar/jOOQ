/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 1183275449;

	/**
	 * The singleton instance of t_book
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.mysql2.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_book_author_id
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES test2.t_author (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES test2.t_author (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Some more details about the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_book_language_id
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES test2.t_language (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql2.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.mysql2.generatedclasses.enums.TLanguage.class), this);

	/**
	 * Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The book's stock status
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql2.generatedclasses.enums.TBookStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql2.generatedclasses.enums.TBookStatus.class), this);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private TBook(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_BOOK_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_BOOK_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.mysql2.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TBook(alias);
	}
}
