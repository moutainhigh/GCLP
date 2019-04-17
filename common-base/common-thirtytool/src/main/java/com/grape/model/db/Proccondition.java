package com.grape.model.db;

import java.io.Serializable;

public class Proccondition implements Serializable {
    private String conditionid;

    private String nodeid;

    private String conds;

    private String appear;

    private String tonode;

    private static final long serialVersionUID = 1L;

    public String getConditionid() {
        return conditionid;
    }

    public void setConditionid(String conditionid) {
        this.conditionid = conditionid == null ? null : conditionid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getConds() {
        return conds;
    }

    public void setConds(String conds) {
        this.conds = conds == null ? null : conds.trim();
    }

    public String getAppear() {
        return appear;
    }

    public void setAppear(String appear) {
        this.appear = appear == null ? null : appear.trim();
    }

    public String getTonode() {
        return tonode;
    }

    public void setTonode(String tonode) {
        this.tonode = tonode == null ? null : tonode.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Proccondition other = (Proccondition) that;
        return (this.getConditionid() == null ? other.getConditionid() == null : this.getConditionid().equals(other.getConditionid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getConds() == null ? other.getConds() == null : this.getConds().equals(other.getConds()))
            && (this.getAppear() == null ? other.getAppear() == null : this.getAppear().equals(other.getAppear()))
            && (this.getTonode() == null ? other.getTonode() == null : this.getTonode().equals(other.getTonode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConditionid() == null) ? 0 : getConditionid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getConds() == null) ? 0 : getConds().hashCode());
        result = prime * result + ((getAppear() == null) ? 0 : getAppear().hashCode());
        result = prime * result + ((getTonode() == null) ? 0 : getTonode().hashCode());
        return result;
    }
}