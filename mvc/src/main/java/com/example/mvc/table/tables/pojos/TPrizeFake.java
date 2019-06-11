/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * 有奖征集视频假名单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPrizeFake implements Serializable {

    private static final long serialVersionUID = 1894267076;

    private Integer id;
    private Integer userId;
    private String  nikename;
    private String  avatarFile;

    public TPrizeFake() {}

    public TPrizeFake(TPrizeFake value) {
        this.id = value.id;
        this.userId = value.userId;
        this.nikename = value.nikename;
        this.avatarFile = value.avatarFile;
    }

    public TPrizeFake(
        Integer id,
        Integer userId,
        String  nikename,
        String  avatarFile
    ) {
        this.id = id;
        this.userId = userId;
        this.nikename = nikename;
        this.avatarFile = avatarFile;
    }

    public Integer getId() {
        return this.id;
    }

    public TPrizeFake setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getUserId() {
        return this.userId;
    }

    public TPrizeFake setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getNikename() {
        return this.nikename;
    }

    public TPrizeFake setNikename(String nikename) {
        this.nikename = nikename;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getAvatarFile() {
        return this.avatarFile;
    }

    public TPrizeFake setAvatarFile(String avatarFile) {
        this.avatarFile = avatarFile;
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
        final TPrizeFake other = (TPrizeFake) obj;
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
        if (nikename == null) {
            if (other.nikename != null)
                return false;
        }
        else if (!nikename.equals(other.nikename))
            return false;
        if (avatarFile == null) {
            if (other.avatarFile != null)
                return false;
        }
        else if (!avatarFile.equals(other.avatarFile))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.nikename == null) ? 0 : this.nikename.hashCode());
        result = prime * result + ((this.avatarFile == null) ? 0 : this.avatarFile.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPrizeFake (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(nikename);
        sb.append(", ").append(avatarFile);

        sb.append(")");
        return sb.toString();
    }
}
