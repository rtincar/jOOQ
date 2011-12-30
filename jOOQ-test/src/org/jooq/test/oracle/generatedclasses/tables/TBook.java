/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1083619928;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final org.jooq.test.oracle.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.oracle.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [TEST.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [TEST.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [TEST.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.oracle.generatedclasses.enums.TLanguage.class), this);

	/**
	 * Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", org.jooq.test.oracle.generatedclasses.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TBook(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.oracle.generatedclasses.Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.oracle.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.tables.TBook(alias);
	}
}
