
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables;

import org.jooq.mp.hsqldb.test.tables.records.XUnusedRecord;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;

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
public class XUnused extends org.jooq.impl.UpdatableTableImpl <XUnusedRecord> {

	private static final long serialVersionUID = 123456789;

	/**
	 * The singleton instance of XUnused
	 */
	public static final XUnused __X_UNUSED = new XUnused();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XUnusedRecord> __RECORD_TYPE = XUnusedRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XUnusedRecord> getRecordType() {
		return __RECORD_TYPE;
	}


 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY ID
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);
 
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY NAME
	 */
	public final TableField<XUnusedRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

 	/**
	 * BIG_INTEGER mapping for BIG_INTEGER
	 */
	public final TableField<XUnusedRecord, java.lang.Long> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.BIGINT, this);
 	/**
	 * CLASS mapping for CLASS
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * FIELDS mapping for FIELDS
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * CONFIGURATION mapping for CONFIGURATION
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * U_D_T mapping for U_D_T
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * META_DATA mapping for META_DATA
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * TYPE0 mapping for TYPE0
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * PRIMARY_KEY mapping for PRIMARY_KEY
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * PRIMARYKEY mapping for PRIMARYKEY
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, this);
 	/**
	 * FIELD_737 mapping for FIELD 737
	 */
	public final TableField<XUnusedRecord, java.math.BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.DECIMAL, this);

   	/**
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XUnused.idRef]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public final TableField<XUnusedRecord, java.lang.Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, this);


	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("X_UNUSED", Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private XUnused(String alias) {
		super(alias, Test.TEST, XUnused.__X_UNUSED);
	}

	@Override
	public org.jooq.UniqueKey<XUnusedRecord> getMainKey() {
		return Keys.KEY_x_unused_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<UniqueKey<XUnusedRecord>> getKeys() {
		return java.util.Arrays.<UniqueKey<XUnusedRecord>>asList(Keys.KEY_x_unused_PRIMARY);
	}

	@Override
	public XUnused as(java.lang.String alias) {
		return new XUnused(alias);
	}
	
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
