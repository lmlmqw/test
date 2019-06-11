/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables;


import com.example.mvc.table.Kelu;
import com.example.mvc.table.Keys;
import com.example.mvc.table.tables.records.TRoleOperateRecord;

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
public class TRoleOperate extends TableImpl<TRoleOperateRecord> {

    private static final long serialVersionUID = -75601564;

    /**
     * The reference instance of <code>kelu.t_role_operate</code>
     */
    public static final TRoleOperate t_role_operate = new TRoleOperate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRoleOperateRecord> getRecordType() {
        return TRoleOperateRecord.class;
    }

    /**
     * The column <code>kelu.t_role_operate.id</code>.
     */
    public final TableField<TRoleOperateRecord, Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>kelu.t_role_operate.role_id</code>.
     */
    public final TableField<TRoleOperateRecord, Integer> role_id = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kelu.t_role_operate.operate_id</code>.
     */
    public final TableField<TRoleOperateRecord, Integer> operate_id = createField("operate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>kelu.t_role_operate</code> table reference
     */
    public TRoleOperate() {
        this(DSL.name("t_role_operate"), null);
    }

    /**
     * Create an aliased <code>kelu.t_role_operate</code> table reference
     */
    public TRoleOperate(String alias) {
        this(DSL.name(alias), t_role_operate);
    }

    /**
     * Create an aliased <code>kelu.t_role_operate</code> table reference
     */
    public TRoleOperate(Name alias) {
        this(alias, t_role_operate);
    }

    private TRoleOperate(Name alias, Table<TRoleOperateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRoleOperate(Name alias, Table<TRoleOperateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TRoleOperateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_t_role_operate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRoleOperateRecord> getPrimaryKey() {
        return Keys.KEY_t_role_operate_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRoleOperateRecord>> getKeys() {
        return Arrays.<UniqueKey<TRoleOperateRecord>>asList(Keys.KEY_t_role_operate_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleOperate as(String alias) {
        return new TRoleOperate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleOperate as(Name alias) {
        return new TRoleOperate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRoleOperate rename(String name) {
        return new TRoleOperate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TRoleOperate rename(Name name) {
        return new TRoleOperate(name, null);
    }
}