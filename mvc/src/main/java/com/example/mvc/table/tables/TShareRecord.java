/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables;


import com.example.mvc.table.Kelu;
import com.example.mvc.table.Keys;
import com.example.mvc.table.tables.records.TShareRecordRecord;

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
public class TShareRecord extends TableImpl<TShareRecordRecord> {

    private static final long serialVersionUID = -1232743855;

    /**
     * The reference instance of <code>kelu.t_share_record</code>
     */
    public static final TShareRecord t_share_record = new TShareRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TShareRecordRecord> getRecordType() {
        return TShareRecordRecord.class;
    }

    /**
     * The column <code>kelu.t_share_record.id</code>.
     */
    public final TableField<TShareRecordRecord, Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>kelu.t_share_record.userID</code>.
     */
    public final TableField<TShareRecordRecord, Integer> userID = createField("userID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kelu.t_share_record.url</code>.
     */
    public final TableField<TShareRecordRecord, String> url = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kelu.t_share_record.postTime</code>.
     */
    public final TableField<TShareRecordRecord, LocalDateTime> postTime = createField("postTime", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>kelu.t_share_record</code> table reference
     */
    public TShareRecord() {
        this(DSL.name("t_share_record"), null);
    }

    /**
     * Create an aliased <code>kelu.t_share_record</code> table reference
     */
    public TShareRecord(String alias) {
        this(DSL.name(alias), t_share_record);
    }

    /**
     * Create an aliased <code>kelu.t_share_record</code> table reference
     */
    public TShareRecord(Name alias) {
        this(alias, t_share_record);
    }

    private TShareRecord(Name alias, Table<TShareRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private TShareRecord(Name alias, Table<TShareRecordRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TShareRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_t_share_record;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TShareRecordRecord> getPrimaryKey() {
        return Keys.KEY_t_share_record_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TShareRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<TShareRecordRecord>>asList(Keys.KEY_t_share_record_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShareRecord as(String alias) {
        return new TShareRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShareRecord as(Name alias) {
        return new TShareRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TShareRecord rename(String name) {
        return new TShareRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TShareRecord rename(Name name) {
        return new TShareRecord(name, null);
    }
}
