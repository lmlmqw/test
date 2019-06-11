/*
 * This file is generated by jOOQ.
*/
package com.example.mvc.table.tables.pojos;


import java.io.Serializable;

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
public class TRoleAccount implements Serializable {

    private static final long serialVersionUID = -2108870191;

    private Integer id;
    private Integer roleId;
    private Integer accountId;

    public TRoleAccount() {}

    public TRoleAccount(TRoleAccount value) {
        this.id = value.id;
        this.roleId = value.roleId;
        this.accountId = value.accountId;
    }

    public TRoleAccount(
        Integer id,
        Integer roleId,
        Integer accountId
    ) {
        this.id = id;
        this.roleId = roleId;
        this.accountId = accountId;
    }

    public Integer getId() {
        return this.id;
    }

    public TRoleAccount setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public TRoleAccount setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    @NotNull
    public Integer getAccountId() {
        return this.accountId;
    }

    public TRoleAccount setAccountId(Integer accountId) {
        this.accountId = accountId;
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
        final TRoleAccount other = (TRoleAccount) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        if (accountId == null) {
            if (other.accountId != null)
                return false;
        }
        else if (!accountId.equals(other.accountId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        result = prime * result + ((this.accountId == null) ? 0 : this.accountId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRoleAccount (");

        sb.append(id);
        sb.append(", ").append(roleId);
        sb.append(", ").append(accountId);

        sb.append(")");
        return sb.toString();
    }
}