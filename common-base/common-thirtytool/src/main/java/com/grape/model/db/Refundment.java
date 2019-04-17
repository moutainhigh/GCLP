package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Refundment implements Serializable {
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=30,min=0,message="其他已收款项不能超出30位")
	@ApiModelProperty(value = "其他已收款项", example = "", dataType="varchar(30)", required = true )
    private String otherrece;

	@Length(max=30,min=0,message="已收款项不能超出30位")
	@ApiModelProperty(value = "已收款项", example = "", dataType="varchar(30)", required = true )
    private String receivables;

	@ApiModelProperty(value = "付款时间", example = "", dataType="datetime", required = true )
    private Date paydate;

	@Length(max=30,min=0,message="其他退款类型不能超出30位")
	@ApiModelProperty(value = "其他退款类型", example = "", dataType="varchar(30)", required = true )
    private String otherrefundtype;

	@Length(max=30,min=0,message="退款类型不能超出30位")
	@ApiModelProperty(value = "退款类型", example = "", dataType="varchar(30)", required = true )
    private String refundtype;

	@Length(max=17,min=0,message="应扣除不能超出17位")
	@ApiModelProperty(value = "应扣除", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal removeamount;

	@Length(max=17,min=0,message="提前还款利息不能超出17位")
	@ApiModelProperty(value = "提前还款利息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal interestrepayment;

	@Length(max=17,min=0,message="单笔保证金不能超出17位")
	@ApiModelProperty(value = "单笔保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal channelsinglebond;

	@Length(max=17,min=0,message="其他应退金额不能超出17位")
	@ApiModelProperty(value = "其他应退金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal otheramounts;

	@ApiModelProperty(value = "结清时间", example = "", dataType="datetime", required = true )
    private Date cleardate;

	@Length(max=9,min=0,message="预缴利息不能超出9位")
	@ApiModelProperty(value = "预缴利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal prepaidinterest;

	@Length(max=9,min=0,message="渠道报价利率不能超出9位")
	@ApiModelProperty(value = "渠道报价利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal chanquotationrate;

	@Length(max=9,min=0,message="我司实收利率不能超出9位")
	@ApiModelProperty(value = "我司实收利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal comrealrate;

	@Length(max=9,min=0,message="每个月代收利率不能超出9位")
	@ApiModelProperty(value = "每个月代收利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal monthrate;

	@Length(max=4,min=0,message="借款期限不能超出4位")
	@ApiModelProperty(value = "借款期限", example = "", dataType="varchar(4)", required = true )
    private String borrowterm;

	@Length(max=17,min=0,message="应返还渠道利差不能超出17位")
	@ApiModelProperty(value = "应返还渠道利差", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal backchanamount;

	@Length(max=17,min=0,message="实际返还不能超出17位")
	@ApiModelProperty(value = "实际返还", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal realbackamount;

	@Length(max=80,min=0,message="退款账户开户行不能超出80位")
	@ApiModelProperty(value = "退款账户开户行", example = "", dataType="varchar(80)", required = true )
    private String backaccountbnk;

	@Length(max=80,min=0,message="退款账户姓名不能超出80位")
	@ApiModelProperty(value = "退款账户姓名", example = "", dataType="varchar(80)", required = true )
    private String backaccountname;

	@Length(max=19,min=0,message="退款账号不能超出19位")
	@ApiModelProperty(value = "退款账号", example = "", dataType="varchar(19)", required = true )
    private String refundaccount;

	@Length(max=17,min=0,message="退款金额不能超出17位")
	@ApiModelProperty(value = "退款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal refundamount;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=17,min=0,message="出款前应收费合计不能超出17位")
	@ApiModelProperty(value = "出款前应收费合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal chargesbefore;

	@Length(max=9,min=0,message="客户预交利息不能超出9位")
	@ApiModelProperty(value = "客户预交利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal custprepaidinterest;

	@Length(max=5,min=0,message="实际使用天数不能超出5位")
	@ApiModelProperty(value = "实际使用天数", example = "", dataType="varchar(5)", required = true )
    private String actualdays;

	@Length(max=9,min=0,message="应收利息不能超出9位")
	@ApiModelProperty(value = "应收利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestreceivable;

	@Length(max=1,min=0,message="是否有渠道单笔保证金不能超出1位")
	@ApiModelProperty(value = "是否有渠道单笔保证金", example = "", dataType="char(1)", required = true )
    private String havechandeposit;

	@Length(max=17,min=0,message="付款金额不能超出17位")
	@ApiModelProperty(value = "付款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal payamount;

	@Length(max=17,min=0,message="应退金额不能超出17位")
	@ApiModelProperty(value = "应退金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal backamount;

	@ApiModelProperty(value = "放款日期", example = "", dataType="datetime", required = true )
    private Date outloandate;

	@ApiModelProperty(value = "回款日期", example = "", dataType="datetime", required = true )
    private Date backloandate;

	@Length(max=9,min=0,message="借款利率不能超出9位")
	@ApiModelProperty(value = "借款利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal borrowrate;

	@Length(max=10,min=0,message="预缴天数不能超出10位")
	@ApiModelProperty(value = "预缴天数", example = "", dataType="varchar(10)", required = true )
    private String pretakeday;

	@Length(max=9,min=0,message="应退利息不能超出9位")
	@ApiModelProperty(value = "应退利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal shouldbackamount;

	@Length(max=300,min=0,message="备注不能超出300位")
	@ApiModelProperty(value = "备注", example = "", dataType="varchar(300)", required = true )
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getOtherrece() {
        return otherrece;
    }

    public void setOtherrece(String otherrece) {
        this.otherrece = otherrece == null ? null : otherrece.trim();
    }

    public String getReceivables() {
        return receivables;
    }

    public void setReceivables(String receivables) {
        this.receivables = receivables == null ? null : receivables.trim();
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getOtherrefundtype() {
        return otherrefundtype;
    }

    public void setOtherrefundtype(String otherrefundtype) {
        this.otherrefundtype = otherrefundtype == null ? null : otherrefundtype.trim();
    }

    public String getRefundtype() {
        return refundtype;
    }

    public void setRefundtype(String refundtype) {
        this.refundtype = refundtype == null ? null : refundtype.trim();
    }

    public BigDecimal getRemoveamount() {
        return removeamount;
    }

    public void setRemoveamount(BigDecimal removeamount) {
        this.removeamount = removeamount;
    }

    public BigDecimal getInterestrepayment() {
        return interestrepayment;
    }

    public void setInterestrepayment(BigDecimal interestrepayment) {
        this.interestrepayment = interestrepayment;
    }

    public BigDecimal getChannelsinglebond() {
        return channelsinglebond;
    }

    public void setChannelsinglebond(BigDecimal channelsinglebond) {
        this.channelsinglebond = channelsinglebond;
    }

    public BigDecimal getOtheramounts() {
        return otheramounts;
    }

    public void setOtheramounts(BigDecimal otheramounts) {
        this.otheramounts = otheramounts;
    }

    public Date getCleardate() {
        return cleardate;
    }

    public void setCleardate(Date cleardate) {
        this.cleardate = cleardate;
    }

    public BigDecimal getPrepaidinterest() {
        return prepaidinterest;
    }

    public void setPrepaidinterest(BigDecimal prepaidinterest) {
        this.prepaidinterest = prepaidinterest;
    }

    public BigDecimal getChanquotationrate() {
        return chanquotationrate;
    }

    public void setChanquotationrate(BigDecimal chanquotationrate) {
        this.chanquotationrate = chanquotationrate;
    }

    public BigDecimal getComrealrate() {
        return comrealrate;
    }

    public void setComrealrate(BigDecimal comrealrate) {
        this.comrealrate = comrealrate;
    }

    public BigDecimal getMonthrate() {
        return monthrate;
    }

    public void setMonthrate(BigDecimal monthrate) {
        this.monthrate = monthrate;
    }

    public String getBorrowterm() {
        return borrowterm;
    }

    public void setBorrowterm(String borrowterm) {
        this.borrowterm = borrowterm == null ? null : borrowterm.trim();
    }

    public BigDecimal getBackchanamount() {
        return backchanamount;
    }

    public void setBackchanamount(BigDecimal backchanamount) {
        this.backchanamount = backchanamount;
    }

    public BigDecimal getRealbackamount() {
        return realbackamount;
    }

    public void setRealbackamount(BigDecimal realbackamount) {
        this.realbackamount = realbackamount;
    }

    public String getBackaccountbnk() {
        return backaccountbnk;
    }

    public void setBackaccountbnk(String backaccountbnk) {
        this.backaccountbnk = backaccountbnk == null ? null : backaccountbnk.trim();
    }

    public String getBackaccountname() {
        return backaccountname;
    }

    public void setBackaccountname(String backaccountname) {
        this.backaccountname = backaccountname == null ? null : backaccountname.trim();
    }

    public String getRefundaccount() {
        return refundaccount;
    }

    public void setRefundaccount(String refundaccount) {
        this.refundaccount = refundaccount == null ? null : refundaccount.trim();
    }

    public BigDecimal getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(BigDecimal refundamount) {
        this.refundamount = refundamount;
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

    public BigDecimal getChargesbefore() {
        return chargesbefore;
    }

    public void setChargesbefore(BigDecimal chargesbefore) {
        this.chargesbefore = chargesbefore;
    }

    public BigDecimal getCustprepaidinterest() {
        return custprepaidinterest;
    }

    public void setCustprepaidinterest(BigDecimal custprepaidinterest) {
        this.custprepaidinterest = custprepaidinterest;
    }

    public String getActualdays() {
        return actualdays;
    }

    public void setActualdays(String actualdays) {
        this.actualdays = actualdays == null ? null : actualdays.trim();
    }

    public BigDecimal getInterestreceivable() {
        return interestreceivable;
    }

    public void setInterestreceivable(BigDecimal interestreceivable) {
        this.interestreceivable = interestreceivable;
    }

    public String getHavechandeposit() {
        return havechandeposit;
    }

    public void setHavechandeposit(String havechandeposit) {
        this.havechandeposit = havechandeposit == null ? null : havechandeposit.trim();
    }

    public BigDecimal getPayamount() {
        return payamount;
    }

    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }

    public BigDecimal getBackamount() {
        return backamount;
    }

    public void setBackamount(BigDecimal backamount) {
        this.backamount = backamount;
    }

    public Date getOutloandate() {
        return outloandate;
    }

    public void setOutloandate(Date outloandate) {
        this.outloandate = outloandate;
    }

    public Date getBackloandate() {
        return backloandate;
    }

    public void setBackloandate(Date backloandate) {
        this.backloandate = backloandate;
    }

    public BigDecimal getBorrowrate() {
        return borrowrate;
    }

    public void setBorrowrate(BigDecimal borrowrate) {
        this.borrowrate = borrowrate;
    }

    public String getPretakeday() {
        return pretakeday;
    }

    public void setPretakeday(String pretakeday) {
        this.pretakeday = pretakeday == null ? null : pretakeday.trim();
    }

    public BigDecimal getShouldbackamount() {
        return shouldbackamount;
    }

    public void setShouldbackamount(BigDecimal shouldbackamount) {
        this.shouldbackamount = shouldbackamount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        Refundment other = (Refundment) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getOtherrece() == null ? other.getOtherrece() == null : this.getOtherrece().equals(other.getOtherrece()))
            && (this.getReceivables() == null ? other.getReceivables() == null : this.getReceivables().equals(other.getReceivables()))
            && (this.getPaydate() == null ? other.getPaydate() == null : this.getPaydate().equals(other.getPaydate()))
            && (this.getOtherrefundtype() == null ? other.getOtherrefundtype() == null : this.getOtherrefundtype().equals(other.getOtherrefundtype()))
            && (this.getRefundtype() == null ? other.getRefundtype() == null : this.getRefundtype().equals(other.getRefundtype()))
            && (this.getRemoveamount() == null ? other.getRemoveamount() == null : this.getRemoveamount().equals(other.getRemoveamount()))
            && (this.getInterestrepayment() == null ? other.getInterestrepayment() == null : this.getInterestrepayment().equals(other.getInterestrepayment()))
            && (this.getChannelsinglebond() == null ? other.getChannelsinglebond() == null : this.getChannelsinglebond().equals(other.getChannelsinglebond()))
            && (this.getOtheramounts() == null ? other.getOtheramounts() == null : this.getOtheramounts().equals(other.getOtheramounts()))
            && (this.getCleardate() == null ? other.getCleardate() == null : this.getCleardate().equals(other.getCleardate()))
            && (this.getPrepaidinterest() == null ? other.getPrepaidinterest() == null : this.getPrepaidinterest().equals(other.getPrepaidinterest()))
            && (this.getChanquotationrate() == null ? other.getChanquotationrate() == null : this.getChanquotationrate().equals(other.getChanquotationrate()))
            && (this.getComrealrate() == null ? other.getComrealrate() == null : this.getComrealrate().equals(other.getComrealrate()))
            && (this.getMonthrate() == null ? other.getMonthrate() == null : this.getMonthrate().equals(other.getMonthrate()))
            && (this.getBorrowterm() == null ? other.getBorrowterm() == null : this.getBorrowterm().equals(other.getBorrowterm()))
            && (this.getBackchanamount() == null ? other.getBackchanamount() == null : this.getBackchanamount().equals(other.getBackchanamount()))
            && (this.getRealbackamount() == null ? other.getRealbackamount() == null : this.getRealbackamount().equals(other.getRealbackamount()))
            && (this.getBackaccountbnk() == null ? other.getBackaccountbnk() == null : this.getBackaccountbnk().equals(other.getBackaccountbnk()))
            && (this.getBackaccountname() == null ? other.getBackaccountname() == null : this.getBackaccountname().equals(other.getBackaccountname()))
            && (this.getRefundaccount() == null ? other.getRefundaccount() == null : this.getRefundaccount().equals(other.getRefundaccount()))
            && (this.getRefundamount() == null ? other.getRefundamount() == null : this.getRefundamount().equals(other.getRefundamount()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChargesbefore() == null ? other.getChargesbefore() == null : this.getChargesbefore().equals(other.getChargesbefore()))
            && (this.getCustprepaidinterest() == null ? other.getCustprepaidinterest() == null : this.getCustprepaidinterest().equals(other.getCustprepaidinterest()))
            && (this.getActualdays() == null ? other.getActualdays() == null : this.getActualdays().equals(other.getActualdays()))
            && (this.getInterestreceivable() == null ? other.getInterestreceivable() == null : this.getInterestreceivable().equals(other.getInterestreceivable()))
            && (this.getHavechandeposit() == null ? other.getHavechandeposit() == null : this.getHavechandeposit().equals(other.getHavechandeposit()))
            && (this.getPayamount() == null ? other.getPayamount() == null : this.getPayamount().equals(other.getPayamount()))
            && (this.getBackamount() == null ? other.getBackamount() == null : this.getBackamount().equals(other.getBackamount()))
            && (this.getOutloandate() == null ? other.getOutloandate() == null : this.getOutloandate().equals(other.getOutloandate()))
            && (this.getBackloandate() == null ? other.getBackloandate() == null : this.getBackloandate().equals(other.getBackloandate()))
            && (this.getBorrowrate() == null ? other.getBorrowrate() == null : this.getBorrowrate().equals(other.getBorrowrate()))
            && (this.getPretakeday() == null ? other.getPretakeday() == null : this.getPretakeday().equals(other.getPretakeday()))
            && (this.getShouldbackamount() == null ? other.getShouldbackamount() == null : this.getShouldbackamount().equals(other.getShouldbackamount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getOtherrece() == null) ? 0 : getOtherrece().hashCode());
        result = prime * result + ((getReceivables() == null) ? 0 : getReceivables().hashCode());
        result = prime * result + ((getPaydate() == null) ? 0 : getPaydate().hashCode());
        result = prime * result + ((getOtherrefundtype() == null) ? 0 : getOtherrefundtype().hashCode());
        result = prime * result + ((getRefundtype() == null) ? 0 : getRefundtype().hashCode());
        result = prime * result + ((getRemoveamount() == null) ? 0 : getRemoveamount().hashCode());
        result = prime * result + ((getInterestrepayment() == null) ? 0 : getInterestrepayment().hashCode());
        result = prime * result + ((getChannelsinglebond() == null) ? 0 : getChannelsinglebond().hashCode());
        result = prime * result + ((getOtheramounts() == null) ? 0 : getOtheramounts().hashCode());
        result = prime * result + ((getCleardate() == null) ? 0 : getCleardate().hashCode());
        result = prime * result + ((getPrepaidinterest() == null) ? 0 : getPrepaidinterest().hashCode());
        result = prime * result + ((getChanquotationrate() == null) ? 0 : getChanquotationrate().hashCode());
        result = prime * result + ((getComrealrate() == null) ? 0 : getComrealrate().hashCode());
        result = prime * result + ((getMonthrate() == null) ? 0 : getMonthrate().hashCode());
        result = prime * result + ((getBorrowterm() == null) ? 0 : getBorrowterm().hashCode());
        result = prime * result + ((getBackchanamount() == null) ? 0 : getBackchanamount().hashCode());
        result = prime * result + ((getRealbackamount() == null) ? 0 : getRealbackamount().hashCode());
        result = prime * result + ((getBackaccountbnk() == null) ? 0 : getBackaccountbnk().hashCode());
        result = prime * result + ((getBackaccountname() == null) ? 0 : getBackaccountname().hashCode());
        result = prime * result + ((getRefundaccount() == null) ? 0 : getRefundaccount().hashCode());
        result = prime * result + ((getRefundamount() == null) ? 0 : getRefundamount().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChargesbefore() == null) ? 0 : getChargesbefore().hashCode());
        result = prime * result + ((getCustprepaidinterest() == null) ? 0 : getCustprepaidinterest().hashCode());
        result = prime * result + ((getActualdays() == null) ? 0 : getActualdays().hashCode());
        result = prime * result + ((getInterestreceivable() == null) ? 0 : getInterestreceivable().hashCode());
        result = prime * result + ((getHavechandeposit() == null) ? 0 : getHavechandeposit().hashCode());
        result = prime * result + ((getPayamount() == null) ? 0 : getPayamount().hashCode());
        result = prime * result + ((getBackamount() == null) ? 0 : getBackamount().hashCode());
        result = prime * result + ((getOutloandate() == null) ? 0 : getOutloandate().hashCode());
        result = prime * result + ((getBackloandate() == null) ? 0 : getBackloandate().hashCode());
        result = prime * result + ((getBorrowrate() == null) ? 0 : getBorrowrate().hashCode());
        result = prime * result + ((getPretakeday() == null) ? 0 : getPretakeday().hashCode());
        result = prime * result + ((getShouldbackamount() == null) ? 0 : getShouldbackamount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}
