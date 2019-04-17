package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//还款表
public class Repayinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="还款人不能超出80位")
	@ApiModelProperty(value = "还款人", example = "", dataType="varchar(80)", required = true )
    private String repayperson;

	@Length(max=17,min=0,message="还款金额不能超出17位")
	@ApiModelProperty(value = "还款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal repayamount;

	@Length(max=11,min=0,message="还款期号不能超出11位")
	@ApiModelProperty(value = "还款期号", example = "", dataType="int(11)", required = true )
    private Integer refundissue;

	@Length(max=17,min=0,message="还款本金不能超出17位")
	@ApiModelProperty(value = "还款本金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal refundmoney;

	@Length(max=17,min=0,message="还款利息不能超出17位")
	@ApiModelProperty(value = "还款利息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal refundinterest;

	@ApiModelProperty(value = "实际还款日期", example = "", dataType="datetime", required = true )
    private Date realityrefunddate;

	@Length(max=17,min=0,message="罚息金额不能超出17位")
	@ApiModelProperty(value = "罚息金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal interestmoney;

	@ApiModelProperty(value = "罚息缴纳日期", example = "", dataType="datetime", required = true )
    private Date interestmoneydate;

	@Length(max=17,min=0,message="滞纳金不能超出17位")
	@ApiModelProperty(value = "滞纳金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal delayingpayment;

	@ApiModelProperty(value = "滞纳金缴纳日期", example = "", dataType="datetime", required = true )
    private Date delayingpaymentdate;

	@Length(max=17,min=0,message="违约金不能超出17位")
	@ApiModelProperty(value = "违约金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal breachofcontract;

	@Length(max=30,min=0,message="还款类型不能超出30位")
	@ApiModelProperty(value = "还款类型", example = "", dataType="varchar(30)", required = true )
    private String repaymethod;

	@Length(max=2,min=0,message="是否逾期不能超出2位")
	@ApiModelProperty(value = "是否逾期", example = "", dataType="varchar(2)", required = true )
    private String whetheroverdue;

	@ApiModelProperty(value = "统一还款时间", example = "", dataType="datetime", required = true )
    private Date unifiedtime;

	@Length(max=19,min=0,message="还款账号不能超出19位")
	@ApiModelProperty(value = "还款账号", example = "", dataType="varchar(19)", required = true )
    private String repayaccount;

	@Length(max=80,min=0,message="还款账户银行不能超出80位")
	@ApiModelProperty(value = "还款账户银行", example = "", dataType="varchar(80)", required = true )
    private String repaybank;

	@Length(max=19,min=0,message="收款账号不能超出19位")
	@ApiModelProperty(value = "收款账号", example = "", dataType="varchar(19)", required = true )
    private String accountnumber;

	@Length(max=80,min=0,message="收款人不能超出80位")
	@ApiModelProperty(value = "收款人", example = "", dataType="varchar(80)", required = true )
    private String payee;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

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

    public String getRepayperson() {
        return repayperson;
    }

    public void setRepayperson(String repayperson) {
        this.repayperson = repayperson == null ? null : repayperson.trim();
    }

    public BigDecimal getRepayamount() {
        return repayamount;
    }

    public void setRepayamount(BigDecimal repayamount) {
        this.repayamount = repayamount;
    }

    public Integer getRefundissue() {
        return refundissue;
    }

    public void setRefundissue(Integer refundissue) {
        this.refundissue = refundissue;
    }

    public BigDecimal getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(BigDecimal refundmoney) {
        this.refundmoney = refundmoney;
    }

    public BigDecimal getRefundinterest() {
        return refundinterest;
    }

    public void setRefundinterest(BigDecimal refundinterest) {
        this.refundinterest = refundinterest;
    }

    public Date getRealityrefunddate() {
        return realityrefunddate;
    }

    public void setRealityrefunddate(Date realityrefunddate) {
        this.realityrefunddate = realityrefunddate;
    }

    public BigDecimal getInterestmoney() {
        return interestmoney;
    }

    public void setInterestmoney(BigDecimal interestmoney) {
        this.interestmoney = interestmoney;
    }

    public Date getInterestmoneydate() {
        return interestmoneydate;
    }

    public void setInterestmoneydate(Date interestmoneydate) {
        this.interestmoneydate = interestmoneydate;
    }

    public BigDecimal getDelayingpayment() {
        return delayingpayment;
    }

    public void setDelayingpayment(BigDecimal delayingpayment) {
        this.delayingpayment = delayingpayment;
    }

    public Date getDelayingpaymentdate() {
        return delayingpaymentdate;
    }

    public void setDelayingpaymentdate(Date delayingpaymentdate) {
        this.delayingpaymentdate = delayingpaymentdate;
    }

    public BigDecimal getBreachofcontract() {
        return breachofcontract;
    }

    public void setBreachofcontract(BigDecimal breachofcontract) {
        this.breachofcontract = breachofcontract;
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public String getWhetheroverdue() {
        return whetheroverdue;
    }

    public void setWhetheroverdue(String whetheroverdue) {
        this.whetheroverdue = whetheroverdue == null ? null : whetheroverdue.trim();
    }

    public Date getUnifiedtime() {
        return unifiedtime;
    }

    public void setUnifiedtime(Date unifiedtime) {
        this.unifiedtime = unifiedtime;
    }

    public String getRepayaccount() {
        return repayaccount;
    }

    public void setRepayaccount(String repayaccount) {
        this.repayaccount = repayaccount == null ? null : repayaccount.trim();
    }

    public String getRepaybank() {
        return repaybank;
    }

    public void setRepaybank(String repaybank) {
        this.repaybank = repaybank == null ? null : repaybank.trim();
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber == null ? null : accountnumber.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
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
        Repayinfo other = (Repayinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getRepayperson() == null ? other.getRepayperson() == null : this.getRepayperson().equals(other.getRepayperson()))
            && (this.getRepayamount() == null ? other.getRepayamount() == null : this.getRepayamount().equals(other.getRepayamount()))
            && (this.getRefundissue() == null ? other.getRefundissue() == null : this.getRefundissue().equals(other.getRefundissue()))
            && (this.getRefundmoney() == null ? other.getRefundmoney() == null : this.getRefundmoney().equals(other.getRefundmoney()))
            && (this.getRefundinterest() == null ? other.getRefundinterest() == null : this.getRefundinterest().equals(other.getRefundinterest()))
            && (this.getRealityrefunddate() == null ? other.getRealityrefunddate() == null : this.getRealityrefunddate().equals(other.getRealityrefunddate()))
            && (this.getInterestmoney() == null ? other.getInterestmoney() == null : this.getInterestmoney().equals(other.getInterestmoney()))
            && (this.getInterestmoneydate() == null ? other.getInterestmoneydate() == null : this.getInterestmoneydate().equals(other.getInterestmoneydate()))
            && (this.getDelayingpayment() == null ? other.getDelayingpayment() == null : this.getDelayingpayment().equals(other.getDelayingpayment()))
            && (this.getDelayingpaymentdate() == null ? other.getDelayingpaymentdate() == null : this.getDelayingpaymentdate().equals(other.getDelayingpaymentdate()))
            && (this.getBreachofcontract() == null ? other.getBreachofcontract() == null : this.getBreachofcontract().equals(other.getBreachofcontract()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getWhetheroverdue() == null ? other.getWhetheroverdue() == null : this.getWhetheroverdue().equals(other.getWhetheroverdue()))
            && (this.getUnifiedtime() == null ? other.getUnifiedtime() == null : this.getUnifiedtime().equals(other.getUnifiedtime()))
            && (this.getRepayaccount() == null ? other.getRepayaccount() == null : this.getRepayaccount().equals(other.getRepayaccount()))
            && (this.getRepaybank() == null ? other.getRepaybank() == null : this.getRepaybank().equals(other.getRepaybank()))
            && (this.getAccountnumber() == null ? other.getAccountnumber() == null : this.getAccountnumber().equals(other.getAccountnumber()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getRepayperson() == null) ? 0 : getRepayperson().hashCode());
        result = prime * result + ((getRepayamount() == null) ? 0 : getRepayamount().hashCode());
        result = prime * result + ((getRefundissue() == null) ? 0 : getRefundissue().hashCode());
        result = prime * result + ((getRefundmoney() == null) ? 0 : getRefundmoney().hashCode());
        result = prime * result + ((getRefundinterest() == null) ? 0 : getRefundinterest().hashCode());
        result = prime * result + ((getRealityrefunddate() == null) ? 0 : getRealityrefunddate().hashCode());
        result = prime * result + ((getInterestmoney() == null) ? 0 : getInterestmoney().hashCode());
        result = prime * result + ((getInterestmoneydate() == null) ? 0 : getInterestmoneydate().hashCode());
        result = prime * result + ((getDelayingpayment() == null) ? 0 : getDelayingpayment().hashCode());
        result = prime * result + ((getDelayingpaymentdate() == null) ? 0 : getDelayingpaymentdate().hashCode());
        result = prime * result + ((getBreachofcontract() == null) ? 0 : getBreachofcontract().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getWhetheroverdue() == null) ? 0 : getWhetheroverdue().hashCode());
        result = prime * result + ((getUnifiedtime() == null) ? 0 : getUnifiedtime().hashCode());
        result = prime * result + ((getRepayaccount() == null) ? 0 : getRepayaccount().hashCode());
        result = prime * result + ((getRepaybank() == null) ? 0 : getRepaybank().hashCode());
        result = prime * result + ((getAccountnumber() == null) ? 0 : getAccountnumber().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
