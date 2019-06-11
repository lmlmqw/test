/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.records;


import com.example.mvc.table.tables.TRecommendTopic;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class TRecommendTopicRecord extends UpdatableRecordImpl<TRecommendTopicRecord> implements Record4<Integer, Integer, LocalDateTime, Byte> {

    private static final long serialVersionUID = 1252867228;

    /**
     * Setter for <code>kelu.t_recommend_topic.id</code>.
     */
    public TRecommendTopicRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_recommend_topic.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kelu.t_recommend_topic.topic_id</code>.
     */
    public TRecommendTopicRecord setTopicId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_recommend_topic.topic_id</code>.
     */
    @NotNull
    public Integer getTopicId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kelu.t_recommend_topic.post_time</code>.
     */
    public TRecommendTopicRecord setPostTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_recommend_topic.post_time</code>.
     */
    public LocalDateTime getPostTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>kelu.t_recommend_topic.is_delete</code>. 是否被删除推荐
     */
    public TRecommendTopicRecord setIsDelete(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>kelu.t_recommend_topic.is_delete</code>. 是否被删除推荐
     */
    @NotNull
    public Byte getIsDelete() {
        return (Byte) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, LocalDateTime, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, LocalDateTime, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TRecommendTopic.t_recommend_topic.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TRecommendTopic.t_recommend_topic.topic_id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return TRecommendTopic.t_recommend_topic.post_time;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TRecommendTopic.t_recommend_topic.is_delete;
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
        return getTopicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component3() {
        return getPostTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsDelete();
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
        return getTopicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getPostTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendTopicRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendTopicRecord value2(Integer value) {
        setTopicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendTopicRecord value3(LocalDateTime value) {
        setPostTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendTopicRecord value4(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendTopicRecord values(Integer value1, Integer value2, LocalDateTime value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRecommendTopicRecord
     */
    public TRecommendTopicRecord() {
        super(TRecommendTopic.t_recommend_topic);
    }

    /**
     * Create a detached, initialised TRecommendTopicRecord
     */
    public TRecommendTopicRecord(Integer id, Integer topicId, LocalDateTime postTime, Byte isDelete) {
        super(TRecommendTopic.t_recommend_topic);

        set(0, id);
        set(1, topicId);
        set(2, postTime);
        set(3, isDelete);
    }
}