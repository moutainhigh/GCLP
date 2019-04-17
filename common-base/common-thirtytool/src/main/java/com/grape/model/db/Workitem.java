package com.grape.model.db;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Workitem implements Serializable {
    private String workid;

    private String fork;

    private String branch;

    private String stage;

    private String node;

    private String state;

    private String userid;

    private Date version;

    private String authuserid;

    private Date starttime;

    private Date realtime;

    private String returnflg;

    private String retscnode;

    private String retscper;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getFork() {
        return fork;
    }

    public void setFork(String fork) {
        this.fork = fork == null ? null : fork.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public String getAuthuserid() {
        return authuserid;
    }

    public void setAuthuserid(String authuserid) {
        this.authuserid = authuserid == null ? null : authuserid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getRealtime() {
        return realtime;
    }

    public void setRealtime(Date realtime) {
        this.realtime = realtime;
    }

    public String getReturnflg() {
        return returnflg;
    }

    public void setReturnflg(String returnflg) {
        this.returnflg = returnflg == null ? null : returnflg.trim();
    }

    public String getRetscnode() {
        return retscnode;
    }

    public void setRetscnode(String retscnode) {
        this.retscnode = retscnode == null ? null : retscnode.trim();
    }

    public String getRetscper() {
        return retscper;
    }

    public void setRetscper(String retscper) {
        this.retscper = retscper == null ? null : retscper.trim();
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
        Workitem other = (Workitem) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getFork() == null ? other.getFork() == null : this.getFork().equals(other.getFork()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getNode() == null ? other.getNode() == null : this.getNode().equals(other.getNode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getAuthuserid() == null ? other.getAuthuserid() == null : this.getAuthuserid().equals(other.getAuthuserid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getRealtime() == null ? other.getRealtime() == null : this.getRealtime().equals(other.getRealtime()))
            && (this.getReturnflg() == null ? other.getReturnflg() == null : this.getReturnflg().equals(other.getReturnflg()))
            && (this.getRetscnode() == null ? other.getRetscnode() == null : this.getRetscnode().equals(other.getRetscnode()))
            && (this.getRetscper() == null ? other.getRetscper() == null : this.getRetscper().equals(other.getRetscper()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getFork() == null) ? 0 : getFork().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getNode() == null) ? 0 : getNode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getAuthuserid() == null) ? 0 : getAuthuserid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getRealtime() == null) ? 0 : getRealtime().hashCode());
        result = prime * result + ((getReturnflg() == null) ? 0 : getReturnflg().hashCode());
        result = prime * result + ((getRetscnode() == null) ? 0 : getRetscnode().hashCode());
        result = prime * result + ((getRetscper() == null) ? 0 : getRetscper().hashCode());
        return result;
    }
    
    private Doctask doctask;
    
    private Workproc workproc;
    
    private List<String> roles;

	public Doctask getEntity() {
		return doctask;
	}

	public void setEntity(Doctask doctask) {
		this.doctask = doctask;
	}

	public Workproc getWorkproc() {
		return workproc;
	}

	public void setWorkproc(Workproc workproc) {
		this.workproc = workproc;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}