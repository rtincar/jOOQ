/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Columns of user's tables, views and clusters
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class AllTabCols extends org.jooq.impl.TableImpl<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord> {

	private static final long serialVersionUID = 1897822466;

	/**
	 * The singleton instance of ALL_TAB_COLS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllTabCols ALL_TAB_COLS = new org.jooq.util.oracle.sys.tables.AllTabCols();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord> __RECORD_TYPE = org.jooq.util.oracle.sys.tables.records.AllTabColsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Table, view or cluster name
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Column name
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Datatype of the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Datatype modifier of the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> DATA_TYPE_MOD = createField("DATA_TYPE_MOD", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Owner of the datatype of the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> DATA_TYPE_OWNER = createField("DATA_TYPE_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Length of the column in bytes
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> DATA_PRECISION = createField("DATA_PRECISION", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Digits to right of decimal point in a number
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> DATA_SCALE = createField("DATA_SCALE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Does column allow NULL values?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Sequence number of the column as created
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> COLUMN_ID = createField("COLUMN_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Length of default value for the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> DEFAULT_LENGTH = createField("DEFAULT_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Default value for the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> DATA_DEFAULT = createField("DATA_DEFAULT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The number of distinct values in the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> NUM_DISTINCT = createField("NUM_DISTINCT", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The low value in the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, byte[]> LOW_VALUE = createField("LOW_VALUE", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The high value in the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, byte[]> HIGH_VALUE = createField("HIGH_VALUE", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The density of the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> DENSITY = createField("DENSITY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The number of nulls in the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> NUM_NULLS = createField("NUM_NULLS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The number of buckets in histogram for the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> NUM_BUCKETS = createField("NUM_BUCKETS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The date of the most recent time this column was analyzed
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.sql.Date> LAST_ANALYZED = createField("LAST_ANALYZED", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The sample size used in analyzing this column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> SAMPLE_SIZE = createField("SAMPLE_SIZE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Character set name
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Declaration length of character type column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> CHAR_COL_DECL_LENGTH = createField("CHAR_COL_DECL_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Are the statistics calculated without merging underlying partitions?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> GLOBAL_STATS = createField("GLOBAL_STATS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Were the statistics entered directly by the user?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> USER_STATS = createField("USER_STATS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The average length of the column in bytes
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> AVG_COL_LEN = createField("AVG_COL_LEN", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The maximum length of the column in characters
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> CHAR_LENGTH = createField("CHAR_LENGTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * C if maximum length is specified in characters, B if in bytes
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> CHAR_USED = createField("CHAR_USED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Is column data in 8.0 image format?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> V80_FMT_IMAGE = createField("V80_FMT_IMAGE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Has column data been upgraded to the latest type version format?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> DATA_UPGRADED = createField("DATA_UPGRADED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Is this a hidden column?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> HIDDEN_COLUMN = createField("HIDDEN_COLUMN", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Is this a virtual column?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> VIRTUAL_COLUMN = createField("VIRTUAL_COLUMN", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Sequence number of the column in the segment
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> SEGMENT_COLUMN_ID = createField("SEGMENT_COLUMN_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Internal sequence number of the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.math.BigDecimal> INTERNAL_COLUMN_ID = createField("INTERNAL_COLUMN_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> HISTOGRAM = createField("HISTOGRAM", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Qualified column name
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllTabColsRecord, java.lang.String> QUALIFIED_COL_NAME = createField("QUALIFIED_COL_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private AllTabCols() {
		super("ALL_TAB_COLS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * No further instances allowed
	 */
	private AllTabCols(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllTabCols.ALL_TAB_COLS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllTabCols as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllTabCols(alias);
	}
}
