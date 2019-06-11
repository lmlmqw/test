/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class TFlag implements Serializable {

    private static final long serialVersionUID = 762719076;

    private Integer       id;
    private Integer       userId;
    private String        nickname;
    private String        flag;
    private Integer       approve;
    private Integer       opposition;
    private String        pic;
    private LocalDateTime postTime;

    public TFlag() {}

    public TFlag(TFlag value) {
        this.id = value.id;
        this.userId = value.userId;
        this.nickname = value.nickname;
        this.flag = value.flag;
        this.approve = value.approve;
        this.opposition = value.opposition;
        this.pic = value.pic;
        this.postTime = value.postTime;
    }

    public TFlag(
        Integer       id,
        Integer       userId,
        String        nickname,
        String        flag,
        Integer       approve,
        Integer       opposition,
        String        pic,
        LocalDateTime postTime
    ) {
        this.id = id;
        this.userId = userId;
        this.nickname = nickname;
        this.flag = flag;
        this.approve = approve;
        this.opposition = opposition;
        this.pic = pic;
        this.postTime = postTime;
    }

    public Integer getId() {
        return this.id;
    }

    public TFlag setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getUserId() {
        return this.userId;
    }

    public TFlag setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getNickname() {
        return this.nickname;
    }

    public TFlag setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getFlag() {
        return this.flag;
    }

    public TFlag setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    public Integer getApprove() {
        return this.approve;
    }

    public TFlag setApprove(Integer approve) {
        this.approve = approve;
        return this;
    }

    public Integer getOpposition() {
        return this.opposition;
    }

    public TFlag setOpposition(Integer opposition) {
        this.opposition = opposition;
        return this;
    }

    @NotNull
    @Size(max = 300)
    public String getPic() {
        return this.pic;
    }

    public TFlag setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public LocalDateTime getPostTime() {
        return this.postTime;
    }

    public TFlag setPostTime(LocalDateTime postTime) {
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
        final TFlag other = (TFlag) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (nickname == null) {
            if (other.nickname != null)
                return false;
        }
        else if (!nickname.equals(other.nickname))
            return false;
        if (flag == null) {
            if (other.flag != null)
                return false;
        }
        else if (!flag.equals(other.flag))
            return false;
        if (approve == null) {
            if (other.approve != null)
                return false;
        }
        else if (!approve.equals(other.approve))
            return false;
        if (opposition == null) {
            if (other.opposition != null)
                return false;
        }
        else if (!opposition.equals(other.opposition))
            return false;
        if (pic == null) {
            if (other.pic != null)
                return false;
        }
        else if (!pic.equals(other.pic))
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
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.nickname == null) ? 0 : this.nickname.hashCode());
        result = prime * result + ((this.flag == null) ? 0 : this.flag.hashCode());
        result = prime * result + ((this.approve == null) ? 0 : this.approve.hashCode());
        result = prime * result + ((this.opposition == null) ? 0 : this.opposition.hashCode());
        result = prime * result + ((this.pic == null) ? 0 : this.pic.hashCode());
        result = prime * result + ((this.postTime == null) ? 0 : this.postTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TFlag (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(nickname);
        sb.append(", ").append(flag);
        sb.append(", ").append(approve);
        sb.append(", ").append(opposition);
        sb.append(", ").append(pic);
        sb.append(", ").append(postTime);

        sb.append(")");
        return sb.toString();
    }
}