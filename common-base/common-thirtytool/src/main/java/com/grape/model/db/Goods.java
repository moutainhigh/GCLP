package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Goods implements Serializable {
	@Length(max=11,min=0,message="不能超出11位")
	@ApiModelProperty(value = "", example = "", dataType="int(11)", required = true )
    private Integer id;

	@Length(max=100,min=0,message="不能超出100位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(100)", required = true )
    private String name;

	@Length(max=6,min=0,message="不能超出6位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(6)", required = true )
    private String departmentno;

	@Length(max=200,min=0,message="不能超出200位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(200)", required = true )
    private String address;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=4,min=0,message="不能超出4位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(4)", required = true )
    private String departmentcode;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(1)", required = true )
    private String departmentlv;

	@Length(max=80,min=0,message="不能超出80位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(80)", required = true )
    private String departmentname;

	@Length(max=12,min=0,message="不能超出12位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(12)", required = true )
    private String depbelongsto;

	@Length(max=6,min=0,message="不能超出6位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(6)", required = true )
    private String hidepartmentno;

	@Length(max=80,min=0,message="不能超出80位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(80)", required = true )
    private String linkman;

	@Length(max=6,min=0,message="不能超出6位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(6)", required = true )
    private String organizationno;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
    }

    public String getDepartmentlv() {
        return departmentlv;
    }

    public void setDepartmentlv(String departmentlv) {
        this.departmentlv = departmentlv == null ? null : departmentlv.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDepbelongsto() {
        return depbelongsto;
    }

    public void setDepbelongsto(String depbelongsto) {
        this.depbelongsto = depbelongsto == null ? null : depbelongsto.trim();
    }

    public String getHidepartmentno() {
        return hidepartmentno;
    }

    public void setHidepartmentno(String hidepartmentno) {
        this.hidepartmentno = hidepartmentno == null ? null : hidepartmentno.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getOrganizationno() {
        return organizationno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno == null ? null : organizationno.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDepartmentno() == null ? other.getDepartmentno() == null : this.getDepartmentno().equals(other.getDepartmentno()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getDepartmentcode() == null ? other.getDepartmentcode() == null : this.getDepartmentcode().equals(other.getDepartmentcode()))
            && (this.getDepartmentlv() == null ? other.getDepartmentlv() == null : this.getDepartmentlv().equals(other.getDepartmentlv()))
            && (this.getDepartmentname() == null ? other.getDepartmentname() == null : this.getDepartmentname().equals(other.getDepartmentname()))
            && (this.getDepbelongsto() == null ? other.getDepbelongsto() == null : this.getDepbelongsto().equals(other.getDepbelongsto()))
            && (this.getHidepartmentno() == null ? other.getHidepartmentno() == null : this.getHidepartmentno().equals(other.getHidepartmentno()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getOrganizationno() == null ? other.getOrganizationno() == null : this.getOrganizationno().equals(other.getOrganizationno()))
            && (this.getTelnumber() == null ? other.getTelnumber() == null : this.getTelnumber().equals(other.getTelnumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDepartmentno() == null) ? 0 : getDepartmentno().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getDepartmentcode() == null) ? 0 : getDepartmentcode().hashCode());
        result = prime * result + ((getDepartmentlv() == null) ? 0 : getDepartmentlv().hashCode());
        result = prime * result + ((getDepartmentname() == null) ? 0 : getDepartmentname().hashCode());
        result = prime * result + ((getDepbelongsto() == null) ? 0 : getDepbelongsto().hashCode());
        result = prime * result + ((getHidepartmentno() == null) ? 0 : getHidepartmentno().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getOrganizationno() == null) ? 0 : getOrganizationno().hashCode());
        result = prime * result + ((getTelnumber() == null) ? 0 : getTelnumber().hashCode());
        return result;
    }
}
