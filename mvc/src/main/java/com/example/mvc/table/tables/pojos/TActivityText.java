/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * 文案表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TActivityText implements Serializable {

    private static final long serialVersionUID = 954685775;

    private Integer       id;
    private String        title;
    private String        content;
    private Integer       feedId;
    private String        videoFile;
    private String        coverFile;
    private Byte          isUse;
    private LocalDateTime postTime;

    public TActivityText() {}

    public TActivityText(TActivityText value) {
        this.id = value.id;
        this.title = value.title;
        this.content = value.content;
        this.feedId = value.feedId;
        this.videoFile = value.videoFile;
        this.coverFile = value.coverFile;
        this.isUse = value.isUse;
        this.postTime = value.postTime;
    }

    public TActivityText(
        Integer       id,
        String        title,
        String        content,
        Integer       feedId,
        String        videoFile,
        String        coverFile,
        Byte          isUse,
        LocalDateTime postTime
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.feedId = feedId;
        this.videoFile = videoFile;
        this.coverFile = coverFile;
        this.isUse = isUse;
        this.postTime = postTime;
    }

    public Integer getId() {
        return this.id;
    }

    public TActivityText setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 100)
    public String getTitle() {
        return this.title;
    }

    public TActivityText setTitle(String title) {
        this.title = title;
        return this;
    }

    @Size(max = 200)
    public String getContent() {
        return this.content;
    }

    public TActivityText setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getFeedId() {
        return this.feedId;
    }

    public TActivityText setFeedId(Integer feedId) {
        this.feedId = feedId;
        return this;
    }

    @Size(max = 300)
    public String getVideoFile() {
        return this.videoFile;
    }

    public TActivityText setVideoFile(String videoFile) {
        this.videoFile = videoFile;
        return this;
    }

    @Size(max = 300)
    public String getCoverFile() {
        return this.coverFile;
    }

    public TActivityText setCoverFile(String coverFile) {
        this.coverFile = coverFile;
        return this;
    }

    public Byte getIsUse() {
        return this.isUse;
    }

    public TActivityText setIsUse(Byte isUse) {
        this.isUse = isUse;
        return this;
    }

    public LocalDateTime getPostTime() {
        return this.postTime;
    }

    public TActivityText setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
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
        final TActivityText other = (TActivityText) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (content == null) {
            if (other.content != null)
                return false;
        }
        else if (!content.equals(other.content))
            return false;
        if (feedId == null) {
            if (other.feedId != null)
                return false;
        }
        else if (!feedId.equals(other.feedId))
            return false;
        if (videoFile == null) {
            if (other.videoFile != null)
                return false;
        }
        else if (!videoFile.equals(other.videoFile))
            return false;
        if (coverFile == null) {
            if (other.coverFile != null)
                return false;
        }
        else if (!coverFile.equals(other.coverFile))
            return false;
        if (isUse == null) {
            if (other.isUse != null)
                return false;
        }
        else if (!isUse.equals(other.isUse))
            return false;
        if (postTime == null) {
            if (other.postTime != null)
                return false;
        }
        else if (!postTime.equals(other.postTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.content == null) ? 0 : this.content.hashCode());
        result = prime * result + ((this.feedId == null) ? 0 : this.feedId.hashCode());
        result = prime * result + ((this.videoFile == null) ? 0 : this.videoFile.hashCode());
        result = prime * result + ((this.coverFile == null) ? 0 : this.coverFile.hashCode());
        result = prime * result + ((this.isUse == null) ? 0 : this.isUse.hashCode());
        result = prime * result + ((this.postTime == null) ? 0 : this.postTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TActivityText (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(content);
        sb.append(", ").append(feedId);
        sb.append(", ").append(videoFile);
        sb.append(", ").append(coverFile);
        sb.append(", ").append(isUse);
        sb.append(", ").append(postTime);

        sb.append(")");
        return sb.toString();
    }
}