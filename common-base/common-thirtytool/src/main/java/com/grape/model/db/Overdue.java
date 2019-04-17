package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Overdue implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=6,min=0,message="逾期期数不能超出6位")
	@ApiModelProperty(value = "逾期期数", example = "", dataType="varchar(6)", required = true )
    private String overdueterm;

	@Length(max=17,min=0,message="逾期本金不能超出17位")
	@ApiModelProperty(value = "逾期本金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overduecorpus;

	@Length(max=17,min=0,message="逾期利息不能超出17位")
	@ApiModelProperty(value = "逾期利息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueaccrual;

	@Length(max=17,min=0,message="罚息金额不能超出17位")
	@ApiModelProperty(value = "罚息金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal defaultinterest;

	@Length(max=17,min=0,message="滞纳金不能超出17位")
	@ApiModelProperty(value = "滞纳金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal delayingpayment;

	@ApiModelProperty(value = "逾期时间", example = "", dataType="datetime", required = true )
    private Date latetime;

	@Length(max=11,min=0,message="逾期天数不能超出11位")
	@ApiModelProperty(value = "逾期天数", example = "", dataType="int(11)", required = true )
    private Integer overduedays;

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

    public String getOverdueterm() {
        return overdueterm;
    }

    public void setOverdueterm(String overdueterm) {
        this.overdueterm = overdueterm == null ? null : overdueterm.trim();
    }

    public BigDecimal getOverduecorpus() {
        return overduecorpus;
    }

    public void setOverduecorpus(BigDecimal overduecorpus) {
        this.overduecorpus = overduecorpus;
    }

    public BigDecimal getOverdueaccrual() {
        return overdueaccrual;
    }

    public void setOverdueaccrual(BigDecimal overdueaccrual) {
        this.overdueaccrual = overdueaccrual;
    }

    public BigDecimal getDefaultinterest() {
        return defaultinterest;
    }

    public void setDefaultinterest(BigDecimal defaultinterest) {
        this.defaultinterest = defaultinterest;
    }

    public BigDecimal getDelayingpayment() {
        return delayingpayment;
    }

    public void setDelayingpayment(BigDecimal delayingpayment) {
        this.delayingpayment = delayingpayment;
    }

    public Date getLatetime() {
        return latetime;
    }

    public void setLatetime(Date latetime) {
        this.latetime = latetime;
    }

    public Integer getOverduedays() {
        return overduedays;
    }

    public void setOverduedays(Integer overduedays) {
        this.overduedays = overduedays;
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
        Overdue other = (Overdue) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getOverdueterm() == null ? other.getOverdueterm() == null : this.getOverdueterm().equals(other.getOverdueterm()))
            && (this.getOverduecorpus() == null ? other.getOverduecorpus() == null : this.getOverduecorpus().equals(other.getOverduecorpus()))
            && (this.getOverdueaccrual() == null ? other.getOverdueaccrual() == null : this.getOverdueaccrual().equals(other.getOverdueaccrual()))
            && (this.getDefaultinterest() == null ? other.getDefaultinterest() == null : this.getDefaultinterest().equals(other.getDefaultinterest()))
            && (this.getDelayingpayment() == null ? other.getDelayingpayment() == null : this.getDelayingpayment().equals(other.getDelayingpayment()))
            && (this.getLatetime() == null ? other.getLatetime() == null : this.getLatetime().equals(other.getLatetime()))
            && (this.getOverduedays() == null ? other.getOverduedays() == null : this.getOverduedays().equals(other.getOverduedays()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getOverdueterm() == null) ? 0 : getOverdueterm().hashCode());
        result = prime * result + ((getOverduecorpus() == null) ? 0 : getOverduecorpus().hashCode());
        result = prime * result + ((getOverdueaccrual() == null) ? 0 : getOverdueaccrual().hashCode());
        result = prime * result + ((getDefaultinterest() == null) ? 0 : getDefaultinterest().hashCode());
        result = prime * result + ((getDelayingpayment() == null) ? 0 : getDelayingpayment().hashCode());
        result = prime * result + ((getLatetime() == null) ? 0 : getLatetime().hashCode());
        result = prime * result + ((getOverduedays() == null) ? 0 : getOverduedays().hashCode());
        return result;
    }
}
