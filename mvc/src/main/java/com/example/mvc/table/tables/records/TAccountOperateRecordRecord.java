/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TAccountOperateRecord;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TAccountOperateRecordRecord extends UpdatableRecordImpl<TAccountOperateRecordRecord> implements Record6<Integer, Integer, Integer, Short, LocalDateTime, String> {

    private static final long serialVersionUID = 324167053;

    /**
     * Setter for <code>kelu.t_account_operate_record.id</code>.
     */
    public TAccountOperateRecordRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_operate_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_account_operate_record.account_id</code>.
     */
    public TAccountOperateRecordRecord setAccountId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_operate_record.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_account_operate_record.relate_id</code>. relate_id 可能为角色ID  部门ID 账号ID  根据type来判断是角色还是部门还是账号还是菜单
     */
    public TAccountOperateRecordRecord setRelateId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_operate_record.relate_id</code>. relate_id 可能为角色ID  部门ID 账号ID  根据type来判断是角色还是部门还是账号还是菜单
     */
    @NotNull
    public Integer getRelateId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kelu.t_account_operate_record.type</code>.
     */
    public TAccountOperateRecordRecord setType(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_operate_record.type</code>.
     */
    @NotNull
    public Short getType() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>kelu.t_account_operate_record.create_time</code>.
     */
    public TAccountOperateRecordRecord setCreateTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_operate_record.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>kelu.t_account_operate_record.operate_info</code>.
     */
    public TAccountOperateRecordRecord setOperateInfo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_account_operate_record.operate_info</code>.
     */
    @NotNull
    @Size(max = 1024)
    public String getOperateInfo() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Short, LocalDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Short, LocalDateTime, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TAccountOperateRecord.t_account_operate_record.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TAccountOperateRecord.t_account_operate_record.account_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TAccountOperateRecord.t_account_operate_record.relate_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TAccountOperateRecord.t_account_operate_record.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return TAccountOperateRecord.t_account_operate_record.create_time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TAccountOperateRecord.t_account_operate_record.operate_info;
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
        return getRelateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOperateInfo();
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
        return getRelateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOperateInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord value2(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord value3(Integer value) {
        setRelateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord value4(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord value6(String value) {
        setOperateInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAccountOperateRecordRecord values(Integer value1, Integer value2, Integer value3, Short value4, LocalDateTime value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAccountOperateRecordRecord
     */
    public TAccountOperateRecordRecord() {
        super(TAccountOperateRecord.t_account_operate_record);
    }

    /**
     * Create a detached, initialised TAccountOperateRecordRecord
     */
    public TAccountOperateRecordRecord(Integer id, Integer accountId, Integer relateId, Short type, LocalDateTime createTime, String operateInfo) {
        super(TAccountOperateRecord.t_account_operate_record);

        set(0, id);
        set(1, accountId);
        set(2, relateId);
        set(3, type);
        set(4, createTime);
        set(5, operateInfo);
    }
}
