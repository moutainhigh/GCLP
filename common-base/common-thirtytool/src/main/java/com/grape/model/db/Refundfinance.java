package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Refundfinance implements Serializable {
	@Length(max=19,min=0,message="主键不能超出19位")
	@ApiModelProperty(value = "主键", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批历史关联id不能超出19位")
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=17,min=0,message="服务费收取金额不能超出17位")
	@ApiModelProperty(value = "服务费收取金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal serveramount;

	@ApiModelProperty(value = "服务费收取日期", example = "", dataType="datetime", required = true )
    private Date serverdate;

	@Length(max=17,min=0,message="审查费费用不能超出17位")
	@ApiModelProperty(value = "审查费费用", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal approvalamount;

	@ApiModelProperty(value = "审查费收取日期", example = "", dataType="datetime", required = true )
    private Date approvaldate;

	@Length(max=17,min=0,message="提前放款保证金不能超出17位")
	@ApiModelProperty(value = "提前放款保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal prepaymentamount;

	@ApiModelProperty(value = "提前放款保证金收取日期", example = "", dataType="datetime", required = true )
    private Date prepaymemtdate;

	@Length(max=17,min=0,message="利息金额不能超出17位")
	@ApiModelProperty(value = "利息金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal rateamount;

	@ApiModelProperty(value = "利息收取金额", example = "", dataType="datetime", required = true )
    private Date ratedate;

	@Length(max=17,min=0,message="本金金额不能超出17位")
	@ApiModelProperty(value = "本金金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal loanamount;

	@ApiModelProperty(value = "本金收取日期", example = "", dataType="datetime", required = true )
    private Date loandate;

	@Length(max=2000,min=0,message="审批意见不能超出2000位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(2000)", required = true )
    private String notation;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public BigDecimal getServeramount() {
        return serveramount;
    }

    public void setServeramount(BigDecimal serveramount) {
        this.serveramount = serveramount;
    }

    public Date getServerdate() {
        return serverdate;
    }

    public void setServerdate(Date serverdate) {
        this.serverdate = serverdate;
    }

    public BigDecimal getApprovalamount() {
        return approvalamount;
    }

    public void setApprovalamount(BigDecimal approvalamount) {
        this.approvalamount = approvalamount;
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public BigDecimal getPrepaymentamount() {
        return prepaymentamount;
    }

    public void setPrepaymentamount(BigDecimal prepaymentamount) {
        this.prepaymentamount = prepaymentamount;
    }

    public Date getPrepaymemtdate() {
        return prepaymemtdate;
    }

    public void setPrepaymemtdate(Date prepaymemtdate) {
        this.prepaymemtdate = prepaymemtdate;
    }

    public BigDecimal getRateamount() {
        return rateamount;
    }

    public void setRateamount(BigDecimal rateamount) {
        this.rateamount = rateamount;
    }

    public Date getRatedate() {
        return ratedate;
    }

    public void setRatedate(Date ratedate) {
        this.ratedate = ratedate;
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public Date getLoandate() {
        return loandate;
    }

    public void setLoandate(Date loandate) {
        this.loandate = loandate;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation == null ? null : notation.trim();
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
        Refundfinance other = (Refundfinance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getServeramount() == null ? other.getServeramount() == null : this.getServeramount().equals(other.getServeramount()))
            && (this.getServerdate() == null ? other.getServerdate() == null : this.getServerdate().equals(other.getServerdate()))
            && (this.getApprovalamount() == null ? other.getApprovalamount() == null : this.getApprovalamount().equals(other.getApprovalamount()))
            && (this.getApprovaldate() == null ? other.getApprovaldate() == null : this.getApprovaldate().equals(other.getApprovaldate()))
            && (this.getPrepaymentamount() == null ? other.getPrepaymentamount() == null : this.getPrepaymentamount().equals(other.getPrepaymentamount()))
            && (this.getPrepaymemtdate() == null ? other.getPrepaymemtdate() == null : this.getPrepaymemtdate().equals(other.getPrepaymemtdate()))
            && (this.getRateamount() == null ? other.getRateamount() == null : this.getRateamount().equals(other.getRateamount()))
            && (this.getRatedate() == null ? other.getRatedate() == null : this.getRatedate().equals(other.getRatedate()))
            && (this.getLoanamount() == null ? other.getLoanamount() == null : this.getLoanamount().equals(other.getLoanamount()))
            && (this.getLoandate() == null ? other.getLoandate() == null : this.getLoandate().equals(other.getLoandate()))
            && (this.getNotation() == null ? other.getNotation() == null : this.getNotation().equals(other.getNotation()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getServeramount() == null) ? 0 : getServeramount().hashCode());
        result = prime * result + ((getServerdate() == null) ? 0 : getServerdate().hashCode());
        result = prime * result + ((getApprovalamount() == null) ? 0 : getApprovalamount().hashCode());
        result = prime * result + ((getApprovaldate() == null) ? 0 : getApprovaldate().hashCode());
        result = prime * result + ((getPrepaymentamount() == null) ? 0 : getPrepaymentamount().hashCode());
        result = prime * result + ((getPrepaymemtdate() == null) ? 0 : getPrepaymemtdate().hashCode());
        result = prime * result + ((getRateamount() == null) ? 0 : getRateamount().hashCode());
        result = prime * result + ((getRatedate() == null) ? 0 : getRatedate().hashCode());
        result = prime * result + ((getLoanamount() == null) ? 0 : getLoanamount().hashCode());
        result = prime * result + ((getLoandate() == null) ? 0 : getLoandate().hashCode());
        result = prime * result + ((getNotation() == null) ? 0 : getNotation().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
