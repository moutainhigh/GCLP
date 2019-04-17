package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//诉讼信息表
public class Litigationinfo implements Serializable {
	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=2,min=0,message="查询诉讼记录网站类型不能超出2位")
	@ApiModelProperty(value = "查询诉讼记录网站类型", example = "", dataType="varchar(2)", required = true )
    private String querytype;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="借款人是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "借款人是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String isborrlitigation;

	@Length(max=1,min=0,message="公司是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "公司是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String iscomlitigation;

	@Length(max=10,min=0,message="诉讼状态不能超出10位")
	@ApiModelProperty(value = "诉讼状态", example = "", dataType="varchar(10)", required = true )
    private String litigationstate;

	@Length(max=17,min=0,message="标的金额不能超出17位")
	@ApiModelProperty(value = "标的金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal targetamount;

	@Length(max=10,min=0,message="诉讼类型不能超出10位")
	@ApiModelProperty(value = "诉讼类型", example = "", dataType="varchar(10)", required = true )
    private String litigationtype;

	@Length(max=1,min=0,message="是否是失信人不能超出1位")
	@ApiModelProperty(value = "是否是失信人", example = "", dataType="char(1)", required = true )
    private String isdishonest;

	@Length(max=300,min=0,message="诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String litigationexplain;

	@Length(max=80,min=0,message="图片存储名称不能超出80位")
	@ApiModelProperty(value = "图片存储名称", example = "", dataType="varchar(80)", required = true )
    private String imagename;

	@ApiModelProperty(value = "操作日期", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getQuerytype() {
        return querytype;
    }

    public void setQuerytype(String querytype) {
        this.querytype = querytype == null ? null : querytype.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getIsborrlitigation() {
        return isborrlitigation;
    }

    public void setIsborrlitigation(String isborrlitigation) {
        this.isborrlitigation = isborrlitigation == null ? null : isborrlitigation.trim();
    }

    public String getIscomlitigation() {
        return iscomlitigation;
    }

    public void setIscomlitigation(String iscomlitigation) {
        this.iscomlitigation = iscomlitigation == null ? null : iscomlitigation.trim();
    }

    public String getLitigationstate() {
        return litigationstate;
    }

    public void setLitigationstate(String litigationstate) {
        this.litigationstate = litigationstate == null ? null : litigationstate.trim();
    }

    public BigDecimal getTargetamount() {
        return targetamount;
    }

    public void setTargetamount(BigDecimal targetamount) {
        this.targetamount = targetamount;
    }

    public String getLitigationtype() {
        return litigationtype;
    }

    public void setLitigationtype(String litigationtype) {
        this.litigationtype = litigationtype == null ? null : litigationtype.trim();
    }

    public String getIsdishonest() {
        return isdishonest;
    }

    public void setIsdishonest(String isdishonest) {
        this.isdishonest = isdishonest == null ? null : isdishonest.trim();
    }

    public String getLitigationexplain() {
        return litigationexplain;
    }

    public void setLitigationexplain(String litigationexplain) {
        this.litigationexplain = litigationexplain == null ? null : litigationexplain.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
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
        Litigationinfo other = (Litigationinfo) that;
        return (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getQuerytype() == null ? other.getQuerytype() == null : this.getQuerytype().equals(other.getQuerytype()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getIsborrlitigation() == null ? other.getIsborrlitigation() == null : this.getIsborrlitigation().equals(other.getIsborrlitigation()))
            && (this.getIscomlitigation() == null ? other.getIscomlitigation() == null : this.getIscomlitigation().equals(other.getIscomlitigation()))
            && (this.getLitigationstate() == null ? other.getLitigationstate() == null : this.getLitigationstate().equals(other.getLitigationstate()))
            && (this.getTargetamount() == null ? other.getTargetamount() == null : this.getTargetamount().equals(other.getTargetamount()))
            && (this.getLitigationtype() == null ? other.getLitigationtype() == null : this.getLitigationtype().equals(other.getLitigationtype()))
            && (this.getIsdishonest() == null ? other.getIsdishonest() == null : this.getIsdishonest().equals(other.getIsdishonest()))
            && (this.getLitigationexplain() == null ? other.getLitigationexplain() == null : this.getLitigationexplain().equals(other.getLitigationexplain()))
            && (this.getImagename() == null ? other.getImagename() == null : this.getImagename().equals(other.getImagename()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getQuerytype() == null) ? 0 : getQuerytype().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getIsborrlitigation() == null) ? 0 : getIsborrlitigation().hashCode());
        result = prime * result + ((getIscomlitigation() == null) ? 0 : getIscomlitigation().hashCode());
        result = prime * result + ((getLitigationstate() == null) ? 0 : getLitigationstate().hashCode());
        result = prime * result + ((getTargetamount() == null) ? 0 : getTargetamount().hashCode());
        result = prime * result + ((getLitigationtype() == null) ? 0 : getLitigationtype().hashCode());
        result = prime * result + ((getIsdishonest() == null) ? 0 : getIsdishonest().hashCode());
        result = prime * result + ((getLitigationexplain() == null) ? 0 : getLitigationexplain().hashCode());
        result = prime * result + ((getImagename() == null) ? 0 : getImagename().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
