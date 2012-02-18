/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1077079576;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook T_BOOK = new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES MULTI_SCHEMA.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.enums.TLanguage> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.oracle.generatedclasses.test.enums.TLanguage.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private TBook(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.oracle.generatedclasses.multi_schema.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook(alias);
	}
}
