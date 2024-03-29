/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TRoleProject;

import javax.annotation.Generated;

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
public class TRoleProjectRecord extends UpdatableRecordImpl<TRoleProjectRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -747046634;

    /**
     * Setter for <code>kelu.t_role_project.id</code>.
     */
    public TRoleProjectRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_role_project.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_role_project.role_id</code>.
     */
    public TRoleProjectRecord setRoleId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_role_project.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_role_project.project_id</code>.
     */
    public TRoleProjectRecord setProjectId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_role_project.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(2);
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
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TRoleProject.t_role_project.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TRoleProject.t_role_project.role_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TRoleProject.t_role_project.project_id;
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
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getProjectId();
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
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleProjectRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleProjectRecord value2(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleProjectRecord value3(Integer value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleProjectRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRoleProjectRecord
     */
    public TRoleProjectRecord() {
        super(TRoleProject.t_role_project);
    }

    /**
     * Create a detached, initialised TRoleProjectRecord
     */
    public TRoleProjectRecord(Integer id, Integer roleId, Integer projectId) {
        super(TRoleProject.t_role_project);

        set(0, id);
        set(1, roleId);
        set(2, projectId);
    }
}
