/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables;


import com.example.mvc.table.Kelu;
import com.example.mvc.table.Keys;
import com.example.mvc.table.tables.records.TResourceRecord;

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
public class TResource extends TableImpl<TResourceRecord> {

    private static final long serialVersionUID = 679104687;

    /**
     * The reference instance of <code>kelu.t_resource</code>
     */
    public static final TResource t_resource = new TResource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TResourceRecord> getRecordType() {
        return TResourceRecord.class;
    }

    /**
     * The column <code>kelu.t_resource.id</code>.
     */
    public final TableField<TResourceRecord, Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>kelu.t_resource.operate_id</code>.
     */
    public final TableField<TResourceRecord, Integer> operate_id = createField("operate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>kelu.t_resource.url</code>.
     */
    public final TableField<TResourceRecord, String> url = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>kelu.t_resource</code> table reference
     */
    public TResource() {
        this(DSL.name("t_resource"), null);
    }

    /**
     * Create an aliased <code>kelu.t_resource</code> table reference
     */
    public TResource(String alias) {
        this(DSL.name(alias), t_resource);
    }

    /**
     * Create an aliased <code>kelu.t_resource</code> table reference
     */
    public TResource(Name alias) {
        this(alias, t_resource);
    }

    private TResource(Name alias, Table<TResourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TResource(Name alias, Table<TResourceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TResourceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_t_resource;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TResourceRecord> getPrimaryKey() {
        return Keys.KEY_t_resource_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TResourceRecord>> getKeys() {
        return Arrays.<UniqueKey<TResourceRecord>>asList(Keys.KEY_t_resource_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResource as(String alias) {
        return new TResource(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResource as(Name alias) {
        return new TResource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TResource rename(String name) {
        return new TResource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TResource rename(Name name) {
        return new TResource(name, null);
    }
}