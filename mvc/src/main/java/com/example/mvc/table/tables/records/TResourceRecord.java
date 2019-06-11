/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TResource;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TResourceRecord extends UpdatableRecordImpl<TResourceRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -246411421;

    /**
     * Setter for <code>kelu.t_resource.id</code>.
     */
    public TResourceRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_resource.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_resource.operate_id</code>.
     */
    public TResourceRecord setOperateId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_resource.operate_id</code>.
     */
    public Integer getOperateId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_resource.url</code>.
     */
    public TResourceRecord setUrl(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_resource.url</code>.
     */
    @Size(max = 255)
    public String getUrl() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TResource.t_resource.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TResource.t_resource.operate_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TResource.t_resource.url;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getOperateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOperateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResourceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResourceRecord value2(Integer value) {
        setOperateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResourceRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResourceRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TResourceRecord
     */
    public TResourceRecord() {
        super(TResource.t_resource);
    }

    /**
     * Create a detached, initialised TResourceRecord
     */
    public TResourceRecord(Integer id, Integer operateId, String url) {
        super(TResource.t_resource);

        set(0, id);
        set(1, operateId);
        set(2, url);
    }
}