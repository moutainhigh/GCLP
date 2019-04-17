package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//期待贷款信息表
public class Exceptloaninfo implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=17,min=0,message="期待贷款金额不能超出17位")
	@ApiModelProperty(value = "期待贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal expectapplyamount;

	@Length(max=8,min=0,message="期望申请利率不能超出8位")
	@ApiModelProperty(value = "期望申请利率", example = "", dataType="decimal(8,5)", required = true )
    private BigDecimal expectapplyrate;

	@Length(max=4,min=0,message="利率类型不能超出4位")
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(4)", required = true )
    private String interestratetype;

	@Length(max=4,min=0,message="期望申请年限不能超出4位")
	@ApiModelProperty(value = "期望申请年限", example = "", dataType="varchar(4)", required = true )
    private String expectapplyyear;

	@Length(max=20,min=0,message="还款方式不能超出20位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(20)", required = true )
    private String repaymethod;

	@Length(max=17,min=0,message="月供金额不能超出17位")
	@ApiModelProperty(value = "月供金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal monthamount;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=17,min=0,message="期待总授信金额不能超出17位")
	@ApiModelProperty(value = "期待总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal extotaluseamount;

	@Length(max=4,min=0,message="期待总授信期限不能超出4位")
	@ApiModelProperty(value = "期待总授信期限", example = "", dataType="varchar(4)", required = true )
    private String extotaluseterm;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public BigDecimal getExpectapplyamount() {
        return expectapplyamount;
    }

    public void setExpectapplyamount(BigDecimal expectapplyamount) {
        this.expectapplyamount = expectapplyamount;
    }

    public BigDecimal getExpectapplyrate() {
        return expectapplyrate;
    }

    public void setExpectapplyrate(BigDecimal expectapplyrate) {
        this.expectapplyrate = expectapplyrate;
    }

    public String getInterestratetype() {
        return interestratetype;
    }

    public void setInterestratetype(String interestratetype) {
        this.interestratetype = interestratetype == null ? null : interestratetype.trim();
    }

    public String getExpectapplyyear() {
        return expectapplyyear;
    }

    public void setExpectapplyyear(String expectapplyyear) {
        this.expectapplyyear = expectapplyyear == null ? null : expectapplyyear.trim();
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public BigDecimal getMonthamount() {
        return monthamount;
    }

    public void setMonthamount(BigDecimal monthamount) {
        this.monthamount = monthamount;
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

    public BigDecimal getExtotaluseamount() {
        return extotaluseamount;
    }

    public void setExtotaluseamount(BigDecimal extotaluseamount) {
        this.extotaluseamount = extotaluseamount;
    }

    public String getExtotaluseterm() {
        return extotaluseterm;
    }

    public void setExtotaluseterm(String extotaluseterm) {
        this.extotaluseterm = extotaluseterm == null ? null : extotaluseterm.trim();
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
        Exceptloaninfo other = (Exceptloaninfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getExpectapplyamount() == null ? other.getExpectapplyamount() == null : this.getExpectapplyamount().equals(other.getExpectapplyamount()))
            && (this.getExpectapplyrate() == null ? other.getExpectapplyrate() == null : this.getExpectapplyrate().equals(other.getExpectapplyrate()))
            && (this.getInterestratetype() == null ? other.getInterestratetype() == null : this.getInterestratetype().equals(other.getInterestratetype()))
            && (this.getExpectapplyyear() == null ? other.getExpectapplyyear() == null : this.getExpectapplyyear().equals(other.getExpectapplyyear()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getMonthamount() == null ? other.getMonthamount() == null : this.getMonthamount().equals(other.getMonthamount()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getExtotaluseamount() == null ? other.getExtotaluseamount() == null : this.getExtotaluseamount().equals(other.getExtotaluseamount()))
            && (this.getExtotaluseterm() == null ? other.getExtotaluseterm() == null : this.getExtotaluseterm().equals(other.getExtotaluseterm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getExpectapplyamount() == null) ? 0 : getExpectapplyamount().hashCode());
        result = prime * result + ((getExpectapplyrate() == null) ? 0 : getExpectapplyrate().hashCode());
        result = prime * result + ((getInterestratetype() == null) ? 0 : getInterestratetype().hashCode());
        result = prime * result + ((getExpectapplyyear() == null) ? 0 : getExpectapplyyear().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getMonthamount() == null) ? 0 : getMonthamount().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getExtotaluseamount() == null) ? 0 : getExtotaluseamount().hashCode());
        result = prime * result + ((getExtotaluseterm() == null) ? 0 : getExtotaluseterm().hashCode());
        return result;
    }
}
