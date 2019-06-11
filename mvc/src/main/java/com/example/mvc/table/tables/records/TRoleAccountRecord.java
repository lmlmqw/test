/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TRoleAccount;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

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
public class TRoleAccountRecord extends UpdatableRecordImpl<TRoleAccountRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -986985661;

    /**
     * Setter for <code>kelu.t_role_account.id</code>.
     */
    public TRoleAccountRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_role_account.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_role_account.role_id</code>.
     */
    public TRoleAccountRecord setRoleId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_role_account.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_role_account.account_id</code>.
     */
    public TRoleAccountRecord setAccountId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_role_account.account_id</code>.
     */
    @NotNull
    public Integer getAccountId() {
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
        return TRoleAccount.t_role_account.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TRoleAccount.t_role_account.role_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TRoleAccount.t_role_account.account_id;
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
        return getAccountId();
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleAccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleAccountRecord value2(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleAccountRecord value3(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleAccountRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRoleAccountRecord
     */
    public TRoleAccountRecord() {
        super(TRoleAccount.t_role_account);
    }

    /**
     * Create a detached, initialised TRoleAccountRecord
     */
    public TRoleAccountRecord(Integer id, Integer roleId, Integer accountId) {
        super(TRoleAccount.t_role_account);

        set(0, id);
        set(1, roleId);
        set(2, accountId);
    }
}
