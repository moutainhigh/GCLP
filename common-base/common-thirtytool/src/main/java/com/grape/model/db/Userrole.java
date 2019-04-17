package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//用户角色表
public class Userrole implements Serializable {
	@Length(max=19,min=0,message="授权编号不能超出19位")
	@ApiModelProperty(value = "授权编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=8,min=0,message="用户编号不能超出8位")
	@ApiModelProperty(value = "用户编号", example = "", dataType="varchar(8)", required = true )
    private String workerid;

	@Length(max=4,min=0,message="角色编号不能超出4位")
	@ApiModelProperty(value = "角色编号", example = "", dataType="varchar(4)", required = true )
    private String roleid;

	@Length(max=1,min=0,message="授权类型不能超出1位")
	@ApiModelProperty(value = "授权类型", example = "", dataType="varchar(1)", required = true )
    private String type;

	@Length(max=8,min=0,message="授权人不能超出8位")
	@ApiModelProperty(value = "授权人", example = "", dataType="varchar(8)", required = true )
    private String authworkerid;

	@ApiModelProperty(value = "授权开始时间", example = "", dataType="datetime", required = true )
    private Date authstate;

	@ApiModelProperty(value = "授权结束日期", example = "", dataType="datetime", required = true )
    private Date authend;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAuthworkerid() {
        return authworkerid;
    }

    public void setAuthworkerid(String authworkerid) {
        this.authworkerid = authworkerid == null ? null : authworkerid.trim();
    }

    public Date getAuthstate() {
        return authstate;
    }

    public void setAuthstate(Date authstate) {
        this.authstate = authstate;
    }

    public Date getAuthend() {
        return authend;
    }

    public void setAuthend(Date authend) {
        this.authend = authend;
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
        Userrole other = (Userrole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkerid() == null ? other.getWorkerid() == null : this.getWorkerid().equals(other.getWorkerid()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAuthworkerid() == null ? other.getAuthworkerid() == null : this.getAuthworkerid().equals(other.getAuthworkerid()))
            && (this.getAuthstate() == null ? other.getAuthstate() == null : this.getAuthstate().equals(other.getAuthstate()))
            && (this.getAuthend() == null ? other.getAuthend() == null : this.getAuthend().equals(other.getAuthend()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkerid() == null) ? 0 : getWorkerid().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAuthworkerid() == null) ? 0 : getAuthworkerid().hashCode());
        result = prime * result + ((getAuthstate() == null) ? 0 : getAuthstate().hashCode());
        result = prime * result + ((getAuthend() == null) ? 0 : getAuthend().hashCode());
        return result;
    }
}
