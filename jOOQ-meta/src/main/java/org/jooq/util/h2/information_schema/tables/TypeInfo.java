/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TypeInfo extends org.jooq.impl.TableImpl<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord> {

	private static final long serialVersionUID = -1193050812;

	/**
	 * The singleton instance of TYPE_INFO
	 */
	public static final org.jooq.util.h2.information_schema.tables.TypeInfo TYPE_INFO = new org.jooq.util.h2.information_schema.tables.TypeInfo();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord> __RECORD_TYPE = org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.String> PREFIX = createField("PREFIX", org.jooq.impl.SQLDataType.VARCHAR, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.String> SUFFIX = createField("SUFFIX", org.jooq.impl.SQLDataType.VARCHAR, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.String> PARAMS = createField("PARAMS", org.jooq.impl.SQLDataType.VARCHAR, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Boolean> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BOOLEAN, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Short> MINIMUM_SCALE = createField("MINIMUM_SCALE", org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Short> MAXIMUM_SCALE = createField("MAXIMUM_SCALE", org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Boolean> CASE_SENSITIVE = createField("CASE_SENSITIVE", org.jooq.impl.SQLDataType.BOOLEAN, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord, java.lang.Short> SEARCHABLE = createField("SEARCHABLE", org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO);

	/**
	 * No further instances allowed
	 */
	private TypeInfo() {
		super("TYPE_INFO", org.jooq.util.h2.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
