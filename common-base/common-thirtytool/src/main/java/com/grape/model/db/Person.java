package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//用户表
public class Person implements Serializable {
	@Length(max=8,min=0,message="用户编号不能超出8位")
	@ApiModelProperty(value = "用户编号", example = "", dataType="varchar(8)", required = true )
    private String workerid;

	@Length(max=80,min=0,message="用户名称不能超出80位")
	@ApiModelProperty(value = "用户名称", example = "", dataType="varchar(80)", required = true )
    private String workername;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=80,min=0,message="密码不能超出80位")
	@ApiModelProperty(value = "密码", example = "", dataType="varchar(80)", required = true )
    private String password;

	@Length(max=6,min=0,message="所属部门不能超出6位")
	@ApiModelProperty(value = "所属部门", example = "", dataType="varchar(6)", required = true )
    private String department;

	@Length(max=4,min=0,message="状态不能超出4位")
	@ApiModelProperty(value = "状态", example = "", dataType="varchar(4)", required = true )
    private String state;

	@Length(max=6,min=0,message="所属机构不能超出6位")
	@ApiModelProperty(value = "所属机构", example = "", dataType="varchar(6)", required = true )
    private String organizationid;

	@Length(max=20,min=0,message="电话号码不能超出20位")
	@ApiModelProperty(value = "电话号码", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=11,min=0,message="手机号码不能超出11位")
	@ApiModelProperty(value = "手机号码", example = "", dataType="varchar(11)", required = true )
    private String mobilephone;

	@Length(max=80,min=0,message="不能超出80位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(80)", required = true )
    private String email;

	@Length(max=80,min=0,message="不能超出80位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(80)", required = true )
    private String city;

	@ApiModelProperty(value = "最后修改日期", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=8,min=0,message="直属上司不能超出8位")
	@ApiModelProperty(value = "直属上司", example = "", dataType="varchar(8)", required = true )
    private String supervisor;

	@Length(max=4,min=0,message="级别不能超出4位")
	@ApiModelProperty(value = "级别", example = "", dataType="varchar(4)", required = true )
    private String level;

	@Length(max=80,min=0,message="外呼系统邮箱不能超出80位")
	@ApiModelProperty(value = "外呼系统邮箱", example = "", dataType="varchar(80)", required = true )
    private String waihuemail;

    private static final long serialVersionUID = 1L;

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getWaihuemail() {
        return waihuemail;
    }

    public void setWaihuemail(String waihuemail) {
        this.waihuemail = waihuemail == null ? null : waihuemail.trim();
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
        Person other = (Person) that;
        return (this.getWorkerid() == null ? other.getWorkerid() == null : this.getWorkerid().equals(other.getWorkerid()))
            && (this.getWorkername() == null ? other.getWorkername() == null : this.getWorkername().equals(other.getWorkername()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getOrganizationid() == null ? other.getOrganizationid() == null : this.getOrganizationid().equals(other.getOrganizationid()))
            && (this.getTelnumber() == null ? other.getTelnumber() == null : this.getTelnumber().equals(other.getTelnumber()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getSupervisor() == null ? other.getSupervisor() == null : this.getSupervisor().equals(other.getSupervisor()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getWaihuemail() == null ? other.getWaihuemail() == null : this.getWaihuemail().equals(other.getWaihuemail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkerid() == null) ? 0 : getWorkerid().hashCode());
        result = prime * result + ((getWorkername() == null) ? 0 : getWorkername().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getOrganizationid() == null) ? 0 : getOrganizationid().hashCode());
        result = prime * result + ((getTelnumber() == null) ? 0 : getTelnumber().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getSupervisor() == null) ? 0 : getSupervisor().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getWaihuemail() == null) ? 0 : getWaihuemail().hashCode());
        return result;
    }
}
