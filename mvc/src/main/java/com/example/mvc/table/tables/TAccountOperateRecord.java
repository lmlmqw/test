/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables;


import com.example.mvc.table.Kelu;
import com.example.mvc.table.Keys;
import com.example.mvc.table.tables.records.TAccountOperateRecordRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAccountOperateRecord extends TableImpl<TAccountOperateRecordRecord> {

    private static final long serialVersionUID = 1776191912;

    /**
     * The reference instance of <code>kelu.t_account_operate_record</code>
     */
    public static final TAccountOperateRecord t_account_operate_record = new TAccountOperateRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAccountOperateRecordRecord> getRecordType() {
        return TAccountOperateRecordRecord.class;
    }

    /**
     * The column <code>kelu.t_account_operate_record.id</code>.
     */
    public final TableField<TAccountOperateRecordRecord, Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>kelu.t_account_operate_record.account_id</code>.
     */
    public final TableField<TAccountOperateRecordRecord, Integer> account_id = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>kelu.t_account_operate_record.relate_id</code>. relate_id 可能为角色ID  部门ID 账号ID  根据type来判断是角色还是部门还是账号还是菜单
     */
    public final TableField<TAccountOperateRecordRecord, Integer> relate_id = createField("relate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "relate_id 可能为角色ID  部门ID 账号ID  根据type来判断是角色还是部门还是账号还是菜单");

    /**
     * The column <code>kelu.t_account_operate_record.type</code>.
     */
    public final TableField<TAccountOperateRecordRecord, Short> type = createField("type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>kelu.t_account_operate_record.create_time</code>.
     */
    public final TableField<TAccountOperateRecordRecord, LocalDateTime> create_time = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>kelu.t_account_operate_record.operate_info</code>.
     */
    public final TableField<TAccountOperateRecordRecord, String> operate_info = createField("operate_info", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * Create a <code>kelu.t_account_operate_record</code> table reference
     */
    public TAccountOperateRecord() {
        this(DSL.name("t_account_operate_record"), null);
    }

    /**
     * Create an aliased <code>kelu.t_account_operate_record</code> table reference
     */
    public TAccountOperateRecord(String alias) {
        this(DSL.name(alias), t_account_operate_record);
    }

    /**
     * Create an aliased <code>kelu.t_account_operate_record</code> table reference
     */
    public TAccountOperateRecord(Name alias) {
        this(alias, t_account_operate_record);
    }

    private TAccountOperateRecord(Name alias, Table<TAccountOperateRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private TAccountOperateRecord(Name alias, Table<TAccountOperateRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kelu.kelu;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TAccountOperateRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_t_account_operate_record;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TAccountOperateRecordRecord> getPrimaryKey() {
        return Keys.KEY_t_account_operate_record_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TAccountOperateRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<TAccountOperateRecordRecord>>asList(Keys.KEY_t_account_operate_record_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecord as(String alias) {
        return new TAccountOperateRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecord as(Name alias) {
        return new TAccountOperateRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TAccountOperateRecord rename(String name) {
        return new TAccountOperateRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TAccountOperateRecord rename(Name name) {
        return new TAccountOperateRecord(name, null);
    }
}
