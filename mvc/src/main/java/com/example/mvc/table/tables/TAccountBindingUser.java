/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables;


import com.example.mvc.table.Kelu;
import com.example.mvc.table.Keys;
import com.example.mvc.table.tables.records.TAccountBindingUserRecord;

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
public class TAccountBindingUser extends TableImpl<TAccountBindingUserRecord> {

    private static final long serialVersionUID = -1894936190;

    /**
     * The reference instance of <code>kelu.t_account_binding_user</code>
     */
    public static final TAccountBindingUser t_account_binding_user = new TAccountBindingUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAccountBindingUserRecord> getRecordType() {
        return TAccountBindingUserRecord.class;
    }

    /**
     * The column <code>kelu.t_account_binding_user.id</code>.
     */
    public final TableField<TAccountBindingUserRecord, Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>kelu.t_account_binding_user.account_id</code>.
     */
    public final TableField<TAccountBindingUserRecord, Integer> account_id = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kelu.t_account_binding_user.user_id</code>.
     */
    public final TableField<TAccountBindingUserRecord, Integer> user_id = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kelu.t_account_binding_user.is_remove</code>. 0 未移除绑定  1 移除绑定
     */
    public final TableField<TAccountBindingUserRecord, Byte> is_remove = createField("is_remove", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "0 未移除绑定  1 移除绑定");

    /**
     * The column <code>kelu.t_account_binding_user.binding_time</code>.
     */
    public final TableField<TAccountBindingUserRecord, LocalDateTime> binding_time = createField("binding_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>kelu.t_account_binding_user</code> table reference
     */
    public TAccountBindingUser() {
        this(DSL.name("t_account_binding_user"), null);
    }

    /**
     * Create an aliased <code>kelu.t_account_binding_user</code> table reference
     */
    public TAccountBindingUser(String alias) {
        this(DSL.name(alias), t_account_binding_user);
    }

    /**
     * Create an aliased <code>kelu.t_account_binding_user</code> table reference
     */
    public TAccountBindingUser(Name alias) {
        this(alias, t_account_binding_user);
    }

    private TAccountBindingUser(Name alias, Table<TAccountBindingUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TAccountBindingUser(Name alias, Table<TAccountBindingUserRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TAccountBindingUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_t_account_binding_user;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TAccountBindingUserRecord> getPrimaryKey() {
        return Keys.KEY_t_account_binding_user_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TAccountBindingUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TAccountBindingUserRecord>>asList(Keys.KEY_t_account_binding_user_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUser as(String alias) {
        return new TAccountBindingUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUser as(Name alias) {
        return new TAccountBindingUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TAccountBindingUser rename(String name) {
        return new TAccountBindingUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TAccountBindingUser rename(Name name) {
        return new TAccountBindingUser(name, null);
    }
}