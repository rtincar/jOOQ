
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.TBookToBookStoreRecord;
import org.jooq.mp.derby.test.Test;
import org.jooq.mp.derby.test.Keys;

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
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl <TBookToBookStoreRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of TBookToBookStore
	 */
	public static final TBookToBookStore __T_BOOK_TO_BOOK_STORE = new TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookToBookStoreRecord> __RECORD_TYPE = TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}


  
 	/**
	 * STOCK mapping for STOCK
	 */
	public final TableField<TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this);

   	/**
     * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TBookToBookStore.bookId]
	 * REFERENCES TBook [TBook.id]
	 * </pre></code>
	 */
	public final TableField<TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, this);

   	/**
     * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TBookToBookStore.bookStoreName]
	 * REFERENCES TBookStore [TBookStore.name]
	 * </pre></code>
	 */
	public final TableField<TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);


	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("T_BOOK_TO_BOOK_STORE", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore(String alias) {
		super(alias, Test.TEST, TBookToBookStore.__T_BOOK_TO_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<TBookToBookStoreRecord> getMainKey() {
		return Keys.KEY_t_book_to_book_store_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<TBookToBookStoreRecord>>asList(Keys.KEY_t_book_to_book_store_PRIMARY);
	}

	@Override
	public TBookToBookStore as(java.lang.String alias) {
		return new TBookToBookStore(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
