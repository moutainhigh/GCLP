package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//日志表
public class Log implements Serializable {
	@Length(max=19,min=0,message="日志主键不能超出19位")
	@ApiModelProperty(value = "日志主键", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="类型不能超出10位")
	@ApiModelProperty(value = "类型", example = "", dataType="varchar(10)", required = true )
    private String type;

	@Length(max=40,min=0,message="类型描述不能超出40位")
	@ApiModelProperty(value = "类型描述", example = "", dataType="varchar(40)", required = true )
    private String typevalue;

	@Length(max=8,min=0,message="记录人不能超出8位")
	@ApiModelProperty(value = "记录人", example = "", dataType="varchar(8)", required = true )
    private String checktl;

	@Length(max=5,min=0,message="机构编号不能超出5位")
	@ApiModelProperty(value = "机构编号", example = "", dataType="varchar(5)", required = true )
    private String organizationno;

	@Length(max=6,min=0,message="部门编号不能超出6位")
	@ApiModelProperty(value = "部门编号", example = "", dataType="varchar(6)", required = true )
    private String departmentno;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String refLogid;

	@ApiModelProperty(value = "最后修改日期", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改时间不能超出8位")
	@ApiModelProperty(value = "最后修改时间", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "描述", example = "", dataType="longtext", required = true )
    private String descriptions;

    private static final long serialVersionUID = 1L;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypevalue() {
        return typevalue;
    }

    public void setTypevalue(String typevalue) {
        this.typevalue = typevalue == null ? null : typevalue.trim();
    }

    public String getChecktl() {
        return checktl;
    }

    public void setChecktl(String checktl) {
        this.checktl = checktl == null ? null : checktl.trim();
    }

    public String getOrganizationno() {
        return organizationno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno == null ? null : organizationno.trim();
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getRefLogid() {
        return refLogid;
    }

    public void setRefLogid(String refLogid) {
        this.refLogid = refLogid == null ? null : refLogid.trim();
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

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
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
        Log other = (Log) that;
        return (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTypevalue() == null ? other.getTypevalue() == null : this.getTypevalue().equals(other.getTypevalue()))
            && (this.getChecktl() == null ? other.getChecktl() == null : this.getChecktl().equals(other.getChecktl()))
            && (this.getOrganizationno() == null ? other.getOrganizationno() == null : this.getOrganizationno().equals(other.getOrganizationno()))
            && (this.getDepartmentno() == null ? other.getDepartmentno() == null : this.getDepartmentno().equals(other.getDepartmentno()))
            && (this.getRefLogid() == null ? other.getRefLogid() == null : this.getRefLogid().equals(other.getRefLogid()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getDescriptions() == null ? other.getDescriptions() == null : this.getDescriptions().equals(other.getDescriptions()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTypevalue() == null) ? 0 : getTypevalue().hashCode());
        result = prime * result + ((getChecktl() == null) ? 0 : getChecktl().hashCode());
        result = prime * result + ((getOrganizationno() == null) ? 0 : getOrganizationno().hashCode());
        result = prime * result + ((getDepartmentno() == null) ? 0 : getDepartmentno().hashCode());
        result = prime * result + ((getRefLogid() == null) ? 0 : getRefLogid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        return result;
    }
}
