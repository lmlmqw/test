/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TDayLabelSumRecord;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

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
public class TDayLabelSumRecordRecord extends UpdatableRecordImpl<TDayLabelSumRecordRecord> implements Record6<Integer, Integer, LocalDateTime, LocalDateTime, Long, Integer> {

    private static final long serialVersionUID = -905086563;

    /**
     * Setter for <code>kelu.t_day_label_sum_record.id</code>.
     */
    public TDayLabelSumRecordRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_day_label_sum_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_day_label_sum_record.account_id</code>. 客服ID
     */
    public TDayLabelSumRecordRecord setAccountId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_day_label_sum_record.account_id</code>. 客服ID
     */
    @NotNull
    public Integer getAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_day_label_sum_record.start_time</code>.
     */
    public TDayLabelSumRecordRecord setStartTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_day_label_sum_record.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>kelu.t_day_label_sum_record.end_time</code>.
     */
    public TDayLabelSumRecordRecord setEndTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_day_label_sum_record.end_time</code>.
     */
    public LocalDateTime getEndTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>kelu.t_day_label_sum_record.date</code>.
     */
    public TDayLabelSumRecordRecord setDate(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_day_label_sum_record.date</code>.
     */
    public Long getDate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>kelu.t_day_label_sum_record.label_count</code>.
     */
    public TDayLabelSumRecordRecord setLabelCount(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_day_label_sum_record.label_count</code>.
     */
    public Integer getLabelCount() {
        return (Integer) get(5);
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
    public Row6<Integer, Integer, LocalDateTime, LocalDateTime, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, LocalDateTime, LocalDateTime, Long, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TDayLabelSumRecord.t_day_label_sum_record.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TDayLabelSumRecord.t_day_label_sum_record.account_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return TDayLabelSumRecord.t_day_label_sum_record.start_time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return TDayLabelSumRecord.t_day_label_sum_record.end_time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TDayLabelSumRecord.t_day_label_sum_record.date;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TDayLabelSumRecord.t_day_label_sum_record.label_count;
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
    public LocalDateTime component3() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLabelCount();
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
    public LocalDateTime value3() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLabelCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord value2(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord value3(LocalDateTime value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord value4(LocalDateTime value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord value5(Long value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord value6(Integer value) {
        setLabelCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDayLabelSumRecordRecord values(Integer value1, Integer value2, LocalDateTime value3, LocalDateTime value4, Long value5, Integer value6) {
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
     * Create a detached TDayLabelSumRecordRecord
     */
    public TDayLabelSumRecordRecord() {
        super(TDayLabelSumRecord.t_day_label_sum_record);
    }

    /**
     * Create a detached, initialised TDayLabelSumRecordRecord
     */
    public TDayLabelSumRecordRecord(Integer id, Integer accountId, LocalDateTime startTime, LocalDateTime endTime, Long date, Integer labelCount) {
        super(TDayLabelSumRecord.t_day_label_sum_record);

        set(0, id);
        set(1, accountId);
        set(2, startTime);
        set(3, endTime);
        set(4, date);
        set(5, labelCount);
    }
}
