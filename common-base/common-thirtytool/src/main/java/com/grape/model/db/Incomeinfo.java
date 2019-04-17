package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//收入情况表
public class Incomeinfo implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=17,min=0,message="近半年其他收入总额不能超出17位")
	@ApiModelProperty(value = "近半年其他收入总额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal halfyearreceipt;

	@Length(max=17,min=0,message="近半年其他月均收入总额不能超出17位")
	@ApiModelProperty(value = "近半年其他月均收入总额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal halfyaerincome;

	@Length(max=17,min=0,message="月收入不能超出17位")
	@ApiModelProperty(value = "月收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal rentincome;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=80,min=0,message="收入情况说明不能超出80位")
	@ApiModelProperty(value = "收入情况说明", example = "", dataType="varchar(80)", required = true )
    private String incomestatement;

	@Length(max=19,min=0,message="净利润不能超出19位")
	@ApiModelProperty(value = "净利润", example = "", dataType="varchar(19)", required = true )
    private String netmargin;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public BigDecimal getHalfyearreceipt() {
        return halfyearreceipt;
    }

    public void setHalfyearreceipt(BigDecimal halfyearreceipt) {
        this.halfyearreceipt = halfyearreceipt;
    }

    public BigDecimal getHalfyaerincome() {
        return halfyaerincome;
    }

    public void setHalfyaerincome(BigDecimal halfyaerincome) {
        this.halfyaerincome = halfyaerincome;
    }

    public BigDecimal getRentincome() {
        return rentincome;
    }

    public void setRentincome(BigDecimal rentincome) {
        this.rentincome = rentincome;
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getIncomestatement() {
        return incomestatement;
    }

    public void setIncomestatement(String incomestatement) {
        this.incomestatement = incomestatement == null ? null : incomestatement.trim();
    }

    public String getNetmargin() {
        return netmargin;
    }

    public void setNetmargin(String netmargin) {
        this.netmargin = netmargin == null ? null : netmargin.trim();
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
        Incomeinfo other = (Incomeinfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getHalfyearreceipt() == null ? other.getHalfyearreceipt() == null : this.getHalfyearreceipt().equals(other.getHalfyearreceipt()))
            && (this.getHalfyaerincome() == null ? other.getHalfyaerincome() == null : this.getHalfyaerincome().equals(other.getHalfyaerincome()))
            && (this.getRentincome() == null ? other.getRentincome() == null : this.getRentincome().equals(other.getRentincome()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getIncomestatement() == null ? other.getIncomestatement() == null : this.getIncomestatement().equals(other.getIncomestatement()))
            && (this.getNetmargin() == null ? other.getNetmargin() == null : this.getNetmargin().equals(other.getNetmargin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getHalfyearreceipt() == null) ? 0 : getHalfyearreceipt().hashCode());
        result = prime * result + ((getHalfyaerincome() == null) ? 0 : getHalfyaerincome().hashCode());
        result = prime * result + ((getRentincome() == null) ? 0 : getRentincome().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getIncomestatement() == null) ? 0 : getIncomestatement().hashCode());
        result = prime * result + ((getNetmargin() == null) ? 0 : getNetmargin().hashCode());
        return result;
    }
}
