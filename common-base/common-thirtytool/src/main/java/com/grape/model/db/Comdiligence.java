package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//公司尽调信息表
public class Comdiligence implements Serializable {
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=2,min=0,message="公司经营类型不能超出2位")
	@ApiModelProperty(value = "公司经营类型", example = "", dataType="varchar(2)", required = true )
    private String companytype;

	@Length(max=80,min=0,message="公司从业人员不能超出80位")
	@ApiModelProperty(value = "公司从业人员", example = "", dataType="varchar(80)", required = true )
    private String comemployee;

	@Length(max=80,min=0,message="工厂情况不能超出80位")
	@ApiModelProperty(value = "工厂情况", example = "", dataType="varchar(80)", required = true )
    private String comsituation;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "公司背景介绍", example = "", dataType="longtext", required = true )
    private String combackground;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype == null ? null : companytype.trim();
    }

    public String getComemployee() {
        return comemployee;
    }

    public void setComemployee(String comemployee) {
        this.comemployee = comemployee == null ? null : comemployee.trim();
    }

    public String getComsituation() {
        return comsituation;
    }

    public void setComsituation(String comsituation) {
        this.comsituation = comsituation == null ? null : comsituation.trim();
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

    public String getCombackground() {
        return combackground;
    }

    public void setCombackground(String combackground) {
        this.combackground = combackground == null ? null : combackground.trim();
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
        Comdiligence other = (Comdiligence) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCompanytype() == null ? other.getCompanytype() == null : this.getCompanytype().equals(other.getCompanytype()))
            && (this.getComemployee() == null ? other.getComemployee() == null : this.getComemployee().equals(other.getComemployee()))
            && (this.getComsituation() == null ? other.getComsituation() == null : this.getComsituation().equals(other.getComsituation()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getCombackground() == null ? other.getCombackground() == null : this.getCombackground().equals(other.getCombackground()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCompanytype() == null) ? 0 : getCompanytype().hashCode());
        result = prime * result + ((getComemployee() == null) ? 0 : getComemployee().hashCode());
        result = prime * result + ((getComsituation() == null) ? 0 : getComsituation().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getCombackground() == null) ? 0 : getCombackground().hashCode());
        return result;
    }
}
