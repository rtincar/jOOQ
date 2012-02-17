
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test.tables;

import org.jooq.mp.mysql.test.tables.records.T639NumbersTableRecord;
import org.jooq.mp.mysql.test.Test;
import org.jooq.mp.mysql.test.Keys;

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
public class T639NumbersTable extends org.jooq.impl.UpdatableTableImpl <T639NumbersTableRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of T639NumbersTable
	 */
	public static final T639NumbersTable __T_639_NUMBERS_TABLE = new T639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	private static final Class<T639NumbersTableRecord> __RECORD_TYPE = T639NumbersTableRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T639NumbersTableRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

 	/**
	 * BYTE mapping for BYTE
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Short> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.SMALLINT, this);
 	/**
	 * SHORT mapping for SHORT
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Integer> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * INTEGER mapping for INTEGER
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * LONG mapping for LONG
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * BYTE_DECIMAL mapping for BYTE_DECIMAL
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * SHORT_DECIMAL mapping for SHORT_DECIMAL
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * INTEGER_DECIMAL mapping for INTEGER_DECIMAL
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * LONG_DECIMAL mapping for LONG_DECIMAL
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * BIG_INTEGER mapping for BIG_INTEGER
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * BIG_DECIMAL mapping for BIG_DECIMAL
	 */
	public final TableField<T639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL, this);
 	/**
	 * FLOAT mapping for FLOAT
	 */
	public final TableField<T639NumbersTableRecord, java.lang.Long> FLOAT = createField("FLOAT", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * DOUBLE mapping for DOUBLE
	 */
	public final TableField<T639NumbersTableRecord, java.math.BigDecimal> DOUBLE = createField("DOUBLE", org.jooq.impl.SQLDataType.DECIMAL, this);


	/**
	 * No further instances allowed
	 */
	private T639NumbersTable() {
		super("t_639_numbers_table", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T639NumbersTable(String alias) {
		super(alias, Test.TEST, T639NumbersTable.__T_639_NUMBERS_TABLE);
	}

	@Override
	public org.jooq.UniqueKey<T639NumbersTableRecord> getMainKey() {
		return Keys.KEY_t_639_numbers_table_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<T639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<T639NumbersTableRecord>>asList(Keys.KEY_t_639_numbers_table_PRIMARY);
	}

	@Override
	public T639NumbersTable as(java.lang.String alias) {
		return new T639NumbersTable(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
