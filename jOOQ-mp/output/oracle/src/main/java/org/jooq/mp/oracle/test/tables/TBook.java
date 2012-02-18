
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables;

import org.jooq.mp.oracle.test.tables.records.TBookRecord;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;

import org.jooq.TableField;
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
public class TBook extends org.jooq.impl.UpdatableTableImpl <TBookRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TBook
	 */
	public static final TBook __T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookRecord> __RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<TBookRecord, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT, this);

 	/**
	 * TITLE mapping for TITLE
	 */
	public final TableField<TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);
 	/**
	 * PUBLISHED_IN mapping for PUBLISHED_IN
	 */
	public final TableField<TBookRecord, java.lang.Long> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * CONTENT_TEXT mapping for CONTENT_TEXT
	 */
	public final TableField<TBookRecord, java.sql.Clob> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);
 	/**
	 * CONTENT_PDF mapping for CONTENT_PDF
	 */
	public final TableField<TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TBook.coAuthorId]
	 * REFERENCES TAuthor [TAuthor.id]
	 * </pre></code>
	 */
	public final TableField<TBookRecord, java.lang.Long> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.BIGINT, this);

   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TBook.authorId]
	 * REFERENCES TAuthor [TAuthor.id]
	 * </pre></code>
	 */
	public final TableField<TBookRecord, java.lang.Long> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.BIGINT, this);

   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TBook.detailsId]
	 * REFERENCES TBookDetails [TBookDetails.id]
	 * </pre></code>
	 */
	public final TableField<TBookRecord, java.lang.Long> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.BIGINT, this);

   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TBook.languageId]
	 * REFERENCES TLanguage [TLanguage.id]
	 * </pre></code>
	 */
	public final TableField<TBookRecord, java.lang.Long> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.BIGINT, this);


	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TBook(String alias) {
		super(alias, Test.TEST, TBook.__T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<TBookRecord> getMainKey() {
		return Keys.KEY_t_book_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TBookRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TBookRecord>>asList(Keys.KEY_t_book_PRIMARY);
	}

	@Override
	public TBook as(java.lang.String alias) {
		return new TBook(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}