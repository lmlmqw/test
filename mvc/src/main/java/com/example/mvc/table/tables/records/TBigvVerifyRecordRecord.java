/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TBigvVerifyRecord;

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
public class TBigvVerifyRecordRecord extends UpdatableRecordImpl<TBigvVerifyRecordRecord> implements Record5<Integer, Integer, Integer, Byte, LocalDateTime> {

    private static final long serialVersionUID = -2031575060;

    /**
     * Setter for <code>kelu.t_bigv_verify_record.id</code>.
     */
    public TBigvVerifyRecordRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_bigv_verify_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_bigv_verify_record.user_id</code>.
     */
    public TBigvVerifyRecordRecord setUserId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_bigv_verify_record.user_id</code>.
     */
    @NotNull
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_bigv_verify_record.account_id</code>.
     */
    public TBigvVerifyRecordRecord setAccountId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_bigv_verify_record.account_id</code>.
     */
    @NotNull
    public Integer getAccountId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kelu.t_bigv_verify_record.status</code>. 0 认证成功 1 认证失败
     */
    public TBigvVerifyRecordRecord setStatus(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_bigv_verify_record.status</code>. 0 认证成功 1 认证失败
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>kelu.t_bigv_verify_record.post_time</code>.
     */
    public TBigvVerifyRecordRecord setPostTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_bigv_verify_record.post_time</code>.
     */
    public LocalDateTime getPostTime() {
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
        return TBigvVerifyRecord.t_bigv_verify_record.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TBigvVerifyRecord.t_bigv_verify_record.user_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TBigvVerifyRecord.t_bigv_verify_record.account_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TBigvVerifyRecord.t_bigv_verify_record.status;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return TBigvVerifyRecord.t_bigv_verify_record.post_time;
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
        return getUserId();
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
    public Byte component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getPostTime();
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
        return getUserId();
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
    public Byte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getPostTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBigvVerifyRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBigvVerifyRecordRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBigvVerifyRecordRecord value3(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBigvVerifyRecordRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBigvVerifyRecordRecord value5(LocalDateTime value) {
        setPostTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBigvVerifyRecordRecord values(Integer value1, Integer value2, Integer value3, Byte value4, LocalDateTime value5) {
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
     * Create a detached TBigvVerifyRecordRecord
     */
    public TBigvVerifyRecordRecord() {
        super(TBigvVerifyRecord.t_bigv_verify_record);
    }

    /**
     * Create a detached, initialised TBigvVerifyRecordRecord
     */
    public TBigvVerifyRecordRecord(Integer id, Integer userId, Integer accountId, Byte status, LocalDateTime postTime) {
        super(TBigvVerifyRecord.t_bigv_verify_record);

        set(0, id);
        set(1, userId);
        set(2, accountId);
        set(3, status);
        set(4, postTime);
    }
}
