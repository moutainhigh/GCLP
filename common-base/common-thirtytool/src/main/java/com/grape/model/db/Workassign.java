package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//
public class Workassign implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=4,min=0,message="不能超出4位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(4)", required = true )
    private String assignmode;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=120,min=0,message="不能超出120位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(120)", required = true )
    private String roleid;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(1)", required = true )
    private String lane;

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

    public String getAssignmode() {
        return assignmode;
    }

    public void setAssignmode(String assignmode) {
        this.assignmode = assignmode == null ? null : assignmode.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane == null ? null : lane.trim();
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
        Workassign other = (Workassign) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getAssignmode() == null ? other.getAssignmode() == null : this.getAssignmode().equals(other.getAssignmode()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getLane() == null ? other.getLane() == null : this.getLane().equals(other.getLane()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getAssignmode() == null) ? 0 : getAssignmode().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getLane() == null) ? 0 : getLane().hashCode());
        return result;
    }
}
