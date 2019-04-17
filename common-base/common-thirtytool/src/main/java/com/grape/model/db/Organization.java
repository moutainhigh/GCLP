package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//机构表
public class Organization implements Serializable {
	@Length(max=6,min=0,message="机构编号不能超出6位")
	@ApiModelProperty(value = "机构编号", example = "", dataType="varchar(6)", required = true )
    private String organizationno;

	@Length(max=60,min=0,message="机构名称不能超出60位")
	@ApiModelProperty(value = "机构名称", example = "", dataType="varchar(60)", required = true )
    private String organizationname;

	@Length(max=16,min=0,message="机构所属不能超出16位")
	@ApiModelProperty(value = "机构所属", example = "", dataType="varchar(16)", required = true )
    private String orgbelongsto;

	@Length(max=80,min=0,message="联系人不能超出80位")
	@ApiModelProperty(value = "联系人", example = "", dataType="varchar(80)", required = true )
    private String linkman;

	@Length(max=20,min=0,message="联系电话不能超出20位")
	@ApiModelProperty(value = "联系电话", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=200,min=0,message="办公地址不能超出200位")
	@ApiModelProperty(value = "办公地址", example = "", dataType="varchar(200)", required = true )
    private String address;

	@Length(max=1,min=0,message="机构代码不能超出1位")
	@ApiModelProperty(value = "机构代码", example = "", dataType="char(1)", required = true )
    private String organizationcode;

	@Length(max=1,min=0,message="机构级别不能超出1位")
	@ApiModelProperty(value = "机构级别", example = "", dataType="char(1)", required = true )
    private String orgleavel;

	@Length(max=30,min=0,message="公司简称不能超出30位")
	@ApiModelProperty(value = "公司简称", example = "", dataType="varchar(30)", required = true )
    private String orgofch;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "机构描述", example = "", dataType="longtext", required = true )
    private String description;

    private static final long serialVersionUID = 1L;

    public String getOrganizationno() {
        return organizationno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno == null ? null : organizationno.trim();
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }

    public String getOrgbelongsto() {
        return orgbelongsto;
    }

    public void setOrgbelongsto(String orgbelongsto) {
        this.orgbelongsto = orgbelongsto == null ? null : orgbelongsto.trim();
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

    public String getOrganizationcode() {
        return organizationcode;
    }

    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode == null ? null : organizationcode.trim();
    }

    public String getOrgleavel() {
        return orgleavel;
    }

    public void setOrgleavel(String orgleavel) {
        this.orgleavel = orgleavel == null ? null : orgleavel.trim();
    }

    public String getOrgofch() {
        return orgofch;
    }

    public void setOrgofch(String orgofch) {
        this.orgofch = orgofch == null ? null : orgofch.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        Organization other = (Organization) that;
        return (this.getOrganizationno() == null ? other.getOrganizationno() == null : this.getOrganizationno().equals(other.getOrganizationno()))
            && (this.getOrganizationname() == null ? other.getOrganizationname() == null : this.getOrganizationname().equals(other.getOrganizationname()))
            && (this.getOrgbelongsto() == null ? other.getOrgbelongsto() == null : this.getOrgbelongsto().equals(other.getOrgbelongsto()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getTelnumber() == null ? other.getTelnumber() == null : this.getTelnumber().equals(other.getTelnumber()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getOrganizationcode() == null ? other.getOrganizationcode() == null : this.getOrganizationcode().equals(other.getOrganizationcode()))
            && (this.getOrgleavel() == null ? other.getOrgleavel() == null : this.getOrgleavel().equals(other.getOrgleavel()))
            && (this.getOrgofch() == null ? other.getOrgofch() == null : this.getOrgofch().equals(other.getOrgofch()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrganizationno() == null) ? 0 : getOrganizationno().hashCode());
        result = prime * result + ((getOrganizationname() == null) ? 0 : getOrganizationname().hashCode());
        result = prime * result + ((getOrgbelongsto() == null) ? 0 : getOrgbelongsto().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getTelnumber() == null) ? 0 : getTelnumber().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getOrganizationcode() == null) ? 0 : getOrganizationcode().hashCode());
        result = prime * result + ((getOrgleavel() == null) ? 0 : getOrgleavel().hashCode());
        result = prime * result + ((getOrgofch() == null) ? 0 : getOrgofch().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}
