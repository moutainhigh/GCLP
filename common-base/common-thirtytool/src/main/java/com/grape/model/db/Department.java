package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Department implements Serializable {
	@Length(max=6,min=0,message="部门编号不能超出6位")
	@ApiModelProperty(value = "部门编号", example = "", dataType="varchar(6)", required = true )
    private String departmentno;

	@Length(max=12,min=0,message="部门所属不能超出12位")
	@ApiModelProperty(value = "部门所属", example = "", dataType="varchar(12)", required = true )
    private String depbelongsto;

	@Length(max=6,min=0,message="所属公司编号不能超出6位")
	@ApiModelProperty(value = "所属公司编号", example = "", dataType="varchar(6)", required = true )
    private String organizationno;

	@Length(max=80,min=0,message="部门名称不能超出80位")
	@ApiModelProperty(value = "部门名称", example = "", dataType="varchar(80)", required = true )
    private String departmentname;

	@Length(max=80,min=0,message="联系人不能超出80位")
	@ApiModelProperty(value = "联系人", example = "", dataType="varchar(80)", required = true )
    private String linkman;

	@Length(max=20,min=0,message="联系电话不能超出20位")
	@ApiModelProperty(value = "联系电话", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=200,min=0,message="办公地址不能超出200位")
	@ApiModelProperty(value = "办公地址", example = "", dataType="varchar(200)", required = true )
    private String address;

	@Length(max=1,min=0,message="部门代码不能超出1位")
	@ApiModelProperty(value = "部门代码", example = "", dataType="char(1)", required = true )
    private String departmentcode;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=6,min=0,message="上级部门不能超出6位")
	@ApiModelProperty(value = "上级部门", example = "", dataType="varchar(6)", required = true )
    private String superdep;

	@Length(max=4,min=0,message="级别不能超出4位")
	@ApiModelProperty(value = "级别", example = "", dataType="varchar(4)", required = true )
    private String level;

    private static final long serialVersionUID = 1L;

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getDepbelongsto() {
        return depbelongsto;
    }

    public void setDepbelongsto(String depbelongsto) {
        this.depbelongsto = depbelongsto == null ? null : depbelongsto.trim();
    }

    public String getOrganizationno() {
        return organizationno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno == null ? null : organizationno.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
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

    public String getSuperdep() {
        return superdep;
    }

    public void setSuperdep(String superdep) {
        this.superdep = superdep == null ? null : superdep.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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
        Department other = (Department) that;
        return (this.getDepartmentno() == null ? other.getDepartmentno() == null : this.getDepartmentno().equals(other.getDepartmentno()))
            && (this.getDepbelongsto() == null ? other.getDepbelongsto() == null : this.getDepbelongsto().equals(other.getDepbelongsto()))
            && (this.getOrganizationno() == null ? other.getOrganizationno() == null : this.getOrganizationno().equals(other.getOrganizationno()))
            && (this.getDepartmentname() == null ? other.getDepartmentname() == null : this.getDepartmentname().equals(other.getDepartmentname()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getTelnumber() == null ? other.getTelnumber() == null : this.getTelnumber().equals(other.getTelnumber()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDepartmentcode() == null ? other.getDepartmentcode() == null : this.getDepartmentcode().equals(other.getDepartmentcode()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getSuperdep() == null ? other.getSuperdep() == null : this.getSuperdep().equals(other.getSuperdep()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartmentno() == null) ? 0 : getDepartmentno().hashCode());
        result = prime * result + ((getDepbelongsto() == null) ? 0 : getDepbelongsto().hashCode());
        result = prime * result + ((getOrganizationno() == null) ? 0 : getOrganizationno().hashCode());
        result = prime * result + ((getDepartmentname() == null) ? 0 : getDepartmentname().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getTelnumber() == null) ? 0 : getTelnumber().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDepartmentcode() == null) ? 0 : getDepartmentcode().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getSuperdep() == null) ? 0 : getSuperdep().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }
}
