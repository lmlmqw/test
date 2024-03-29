/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


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
public class TRecommendTopic implements Serializable {

    private static final long serialVersionUID = -1181733751;

    private Integer       id;
    private Integer       topicId;
    private LocalDateTime postTime;
    private Byte          isDelete;

    public TRecommendTopic() {}

    public TRecommendTopic(TRecommendTopic value) {
        this.id = value.id;
        this.topicId = value.topicId;
        this.postTime = value.postTime;
        this.isDelete = value.isDelete;
    }

    public TRecommendTopic(
        Integer       id,
        Integer       topicId,
        LocalDateTime postTime,
        Byte          isDelete
    ) {
        this.id = id;
        this.topicId = topicId;
        this.postTime = postTime;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return this.id;
    }

    public TRecommendTopic setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getTopicId() {
        return this.topicId;
    }

    public TRecommendTopic setTopicId(Integer topicId) {
        this.topicId = topicId;
        return this;
    }

    public LocalDateTime getPostTime() {
        return this.postTime;
    }

    public TRecommendTopic setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
        return this;
    }

    @NotNull
    public Byte getIsDelete() {
        return this.isDelete;
    }

    public TRecommendTopic setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TRecommendTopic other = (TRecommendTopic) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (topicId == null) {
            if (other.topicId != null)
                return false;
        }
        else if (!topicId.equals(other.topicId))
            return false;
        if (postTime == null) {
            if (other.postTime != null)
                return false;
        }
        else if (!postTime.equals(other.postTime))
            return false;
        if (isDelete == null) {
            if (other.isDelete != null)
                return false;
        }
        else if (!isDelete.equals(other.isDelete))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.topicId == null) ? 0 : this.topicId.hashCode());
        result = prime * result + ((this.postTime == null) ? 0 : this.postTime.hashCode());
        result = prime * result + ((this.isDelete == null) ? 0 : this.isDelete.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRecommendTopic (");

        sb.append(id);
        sb.append(", ").append(topicId);
        sb.append(", ").append(postTime);
        sb.append(", ").append(isDelete);

        sb.append(")");
        return sb.toString();
    }
}
