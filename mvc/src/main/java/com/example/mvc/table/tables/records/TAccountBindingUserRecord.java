/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TAccountBindingUser;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TAccountBindingUserRecord extends UpdatableRecordImpl<TAccountBindingUserRecord> implements Record5<Integer, Integer, Integer, Byte, LocalDateTime> {

    private static final long serialVersionUID = 2068440975;

    /**
     * Setter for <code>kelu.t_account_binding_user.id</code>.
     */
    public TAccountBindingUserRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_binding_user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_account_binding_user.account_id</code>.
     */
    public TAccountBindingUserRecord setAccountId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_binding_user.account_id</code>.
     */
    @NotNull
    public Integer getAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_account_binding_user.user_id</code>.
     */
    public TAccountBindingUserRecord setUserId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_binding_user.user_id</code>.
     */
    @NotNull
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kelu.t_account_binding_user.is_remove</code>. 0 未移除绑定  1 移除绑定
     */
    public TAccountBindingUserRecord setIsRemove(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_binding_user.is_remove</code>. 0 未移除绑定  1 移除绑定
     */
    @NotNull
    public Byte getIsRemove() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>kelu.t_account_binding_user.binding_time</code>.
     */
    public TAccountBindingUserRecord setBindingTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_binding_user.binding_time</code>.
     */
    public LocalDateTime getBindingTime() {
        return (LocalDateTime) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Byte, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Byte, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TAccountBindingUser.t_account_binding_user.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TAccountBindingUser.t_account_binding_user.account_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TAccountBindingUser.t_account_binding_user.user_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TAccountBindingUser.t_account_binding_user.is_remove;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return TAccountBindingUser.t_account_binding_user.binding_time;
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsRemove();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getBindingTime();
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
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsRemove();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getBindingTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUserRecord value2(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUserRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUserRecord value4(Byte value) {
        setIsRemove(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUserRecord value5(LocalDateTime value) {
        setBindingTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountBindingUserRecord values(Integer value1, Integer value2, Integer value3, Byte value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAccountBindingUserRecord
     */
    public TAccountBindingUserRecord() {
        super(TAccountBindingUser.t_account_binding_user);
    }

    /**
     * Create a detached, initialised TAccountBindingUserRecord
     */
    public TAccountBindingUserRecord(Integer id, Integer accountId, Integer userId, Byte isRemove, LocalDateTime bindingTime) {
        super(TAccountBindingUser.t_account_binding_user);

        set(0, id);
        set(1, accountId);
        set(2, userId);
        set(3, isRemove);
        set(4, bindingTime);
    }
}