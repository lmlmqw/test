/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TDepartment;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TDepartmentRecord extends UpdatableRecordImpl<TDepartmentRecord> implements Record8<Integer, String, LocalDateTime, Integer, Integer, Byte, Byte, String> {

    private static final long serialVersionUID = -1251485870;

    /**
     * Setter for <code>kelu.t_department.id</code>.
     */
    public TDepartmentRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_department.department_name</code>.
     */
    public TDepartmentRecord setDepartmentName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.department_name</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getDepartmentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kelu.t_department.create_time</code>.
     */
    public TDepartmentRecord setCreateTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>kelu.t_department.parent_id</code>.
     */
    public TDepartmentRecord setParentId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>kelu.t_department.seq</code>.
     */
    public TDepartmentRecord setSeq(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.seq</code>.
     */
    @NotNull
    public Integer getSeq() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>kelu.t_department.level</code>.
     */
    public TDepartmentRecord setLevel(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.level</code>.
     */
    @NotNull
    public Byte getLevel() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>kelu.t_department.is_used</code>. 0代表启用  1代表不启用
     */
    public TDepartmentRecord setIsUsed(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.is_used</code>. 0代表启用  1代表不启用
     */
    public Byte getIsUsed() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>kelu.t_department.department_describe</code>.
     */
    public TDepartmentRecord setDepartmentDescribe(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_department.department_describe</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getDepartmentDescribe() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, LocalDateTime, Integer, Integer, Byte, Byte, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, LocalDateTime, Integer, Integer, Byte, Byte, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TDepartment.t_department.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDepartment.t_department.department_name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return TDepartment.t_department.create_time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TDepartment.t_department.parent_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TDepartment.t_department.seq;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TDepartment.t_department.level;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TDepartment.t_department.is_used;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TDepartment.t_department.department_describe;
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
    public String component2() {
        return getDepartmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDepartmentDescribe();
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
    public String value2() {
        return getDepartmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDepartmentDescribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value2(String value) {
        setDepartmentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value3(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value4(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value5(Integer value) {
        setSeq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value6(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value7(Byte value) {
        setIsUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord value8(String value) {
        setDepartmentDescribe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepartmentRecord values(Integer value1, String value2, LocalDateTime value3, Integer value4, Integer value5, Byte value6, Byte value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDepartmentRecord
     */
    public TDepartmentRecord() {
        super(TDepartment.t_department);
    }

    /**
     * Create a detached, initialised TDepartmentRecord
     */
    public TDepartmentRecord(Integer id, String departmentName, LocalDateTime createTime, Integer parentId, Integer seq, Byte level, Byte isUsed, String departmentDescribe) {
        super(TDepartment.t_department);

        set(0, id);
        set(1, departmentName);
        set(2, createTime);
        set(3, parentId);
        set(4, seq);
        set(5, level);
        set(6, isUsed);
        set(7, departmentDescribe);
    }
}
