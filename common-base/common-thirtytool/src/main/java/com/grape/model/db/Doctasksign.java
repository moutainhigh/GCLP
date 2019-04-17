package com.grape.model.db;

import java.io.Serializable;
import java.util.Date;

public class Doctasksign implements Serializable {
    private String id;

    private String workid;

    private String nodeid;

    private String userid;

    private String chgtl;

    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
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
        Doctasksign other = (Doctasksign) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}