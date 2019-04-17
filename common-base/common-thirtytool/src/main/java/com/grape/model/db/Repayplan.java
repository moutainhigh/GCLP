package com.grape.model.db;

import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//还款计划表
public class Repayplan implements Serializable {
    @Length(max = 19, min = 0, message = "主键id不能超出19位")
    @ApiModelProperty(value = "主键id", example = "", dataType = "varchar(19)", required = true)
    private String id;

    @Length(max = 10, min = 0, message = "申请编号不能超出10位")
    @ApiModelProperty(value = "申请编号", example = "", dataType = "varchar(10)", required = true)
    private String workid;

    @ApiModelProperty(value = "应还款日期", example = "", dataType = "datetime", required = true)
    private Date repaydate;

    @Length(max = 17, min = 0, message = "贷款余额不能超出17位")
    @ApiModelProperty(value = "贷款余额", example = "", dataType = "decimal(17,5)", required = true)
    private BigDecimal loanbalance;

    @Length(max = 17, min = 0, message = "应还款金额不能超出17位")
    @ApiModelProperty(value = "应还款金额", example = "", dataType = "decimal(17,5)", required = true)
    private BigDecimal repayamount;

    @Length(max = 17, min = 0, message = "应还款本金不能超出17位")
    @ApiModelProperty(value = "应还款本金", example = "", dataType = "decimal(17,5)", required = true)
    private BigDecimal repaycapital;

    @Length(max = 17, min = 0, message = "应还款利息不能超出17位")
    @ApiModelProperty(value = "应还款利息", example = "", dataType = "decimal(17,5)", required = true)
    private BigDecimal repayaccrual;

    @Length(max = 11, min = 0, message = "还款期数不能超出11位")
    @ApiModelProperty(value = "还款期数", example = "", dataType = "int(11)", required = true)
    private Integer repayterm;

    @Length(max = 30, min = 0, message = "还款方式不能超出30位")
    @ApiModelProperty(value = "还款方式", example = "", dataType = "varchar(30)", required = true)
    private String repaymethod;

    @Length(max = 19, min = 0, message = "还款账号不能超出19位")
    @ApiModelProperty(value = "还款账号", example = "", dataType = "varchar(19)", required = true)
    private String repayaccount;

    @Length(max = 80, min = 0, message = "还款人不能超出80位")
    @ApiModelProperty(value = "还款人", example = "", dataType = "varchar(80)", required = true)
    private String repayperson;

    @ApiModelProperty(value = "最后修改时间", example = "", dataType = "datetime", required = true)
    private Date chgdt;

    @Length(max = 8, min = 0, message = "最后修改人不能超出8位")
    @ApiModelProperty(value = "最后修改人", example = "", dataType = "varchar(8)", required = true)
    private String chgtl;

    @Length(max = 8, min = 0, message = "还款状态")
    @ApiModelProperty(value = "还款状态", example = "0", dataType = "int(1)", required = true)
    private Integer status;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public Date getRepaydate() {
        return repaydate;
    }

    public void setRepaydate(Date repaydate) {
        this.repaydate = repaydate;
    }

    public BigDecimal getLoanbalance() {
        return loanbalance;
    }

    public void setLoanbalance(BigDecimal loanbalance) {
        this.loanbalance = loanbalance;
    }

    public BigDecimal getRepayamount() {
        return repayamount;
    }

    public void setRepayamount(BigDecimal repayamount) {
        this.repayamount = repayamount;
    }

    public BigDecimal getRepaycapital() {
        return repaycapital;
    }

    public void setRepaycapital(BigDecimal repaycapital) {
        this.repaycapital = repaycapital;
    }

    public BigDecimal getRepayaccrual() {
        return repayaccrual;
    }

    public void setRepayaccrual(BigDecimal repayaccrual) {
        this.repayaccrual = repayaccrual;
    }

    public Integer getRepayterm() {
        return repayterm;
    }

    public void setRepayterm(Integer repayterm) {
        this.repayterm = repayterm;
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public String getRepayaccount() {
        return repayaccount;
    }

    public void setRepayaccount(String repayaccount) {
        this.repayaccount = repayaccount == null ? null : repayaccount.trim();
    }

    public String getRepayperson() {
        return repayperson;
    }

    public void setRepayperson(String repayperson) {
        this.repayperson = repayperson == null ? null : repayperson.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        Repayplan other = (Repayplan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
                && (this.getRepaydate() == null ? other.getRepaydate() == null : this.getRepaydate().equals(other.getRepaydate()))
                && (this.getLoanbalance() == null ? other.getLoanbalance() == null : this.getLoanbalance().equals(other.getLoanbalance()))
                && (this.getRepayamount() == null ? other.getRepayamount() == null : this.getRepayamount().equals(other.getRepayamount()))
                && (this.getRepaycapital() == null ? other.getRepaycapital() == null : this.getRepaycapital().equals(other.getRepaycapital()))
                && (this.getRepayaccrual() == null ? other.getRepayaccrual() == null : this.getRepayaccrual().equals(other.getRepayaccrual()))
                && (this.getRepayterm() == null ? other.getRepayterm() == null : this.getRepayterm().equals(other.getRepayterm()))
                && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
                && (this.getRepayaccount() == null ? other.getRepayaccount() == null : this.getRepayaccount().equals(other.getRepayaccount()))
                && (this.getRepayperson() == null ? other.getRepayperson() == null : this.getRepayperson().equals(other.getRepayperson()))
                && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
                && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getRepaydate() == null) ? 0 : getRepaydate().hashCode());
        result = prime * result + ((getLoanbalance() == null) ? 0 : getLoanbalance().hashCode());
        result = prime * result + ((getRepayamount() == null) ? 0 : getRepayamount().hashCode());
        result = prime * result + ((getRepaycapital() == null) ? 0 : getRepaycapital().hashCode());
        result = prime * result + ((getRepayaccrual() == null) ? 0 : getRepayaccrual().hashCode());
        result = prime * result + ((getRepayterm() == null) ? 0 : getRepayterm().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getRepayaccount() == null) ? 0 : getRepayaccount().hashCode());
        result = prime * result + ((getRepayperson() == null) ? 0 : getRepayperson().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result +  ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}
