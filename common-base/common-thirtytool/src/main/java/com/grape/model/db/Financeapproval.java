package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Financeapproval implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批历史关联id不能超出19位")
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="还款计划表是否无误不能超出1位")
	@ApiModelProperty(value = "还款计划表是否无误", example = "", dataType="char(1)", required = true )
    private String repayplanrightflg;

	@Length(max=300,min=0,message="还款计划表情况说明不能超出300位")
	@ApiModelProperty(value = "还款计划表情况说明", example = "", dataType="varchar(300)", required = true )
    private String repayplanrightnote;

	@Length(max=17,min=0,message="费用到账金额不能超出17位")
	@ApiModelProperty(value = "费用到账金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal amount;

	@Length(max=300,min=0,message="放款审批意见不能超出300位")
	@ApiModelProperty(value = "放款审批意见", example = "", dataType="varchar(300)", required = true )
    private String loannotation;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=19,min=0,message="节点不能超出19位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@ApiModelProperty(value = "本金收取日期", example = "", dataType="datetime", required = true )
    private Date capitaldate;

	@Length(max=17,min=0,message="本金金额不能超出17位")
	@ApiModelProperty(value = "本金金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal capital;

	@ApiModelProperty(value = "利息金额收取日期", example = "", dataType="datetime", required = true )
    private Date ratedate;

	@Length(max=17,min=0,message="利息金额不能超出17位")
	@ApiModelProperty(value = "利息金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal rateamount;

	@ApiModelProperty(value = "提前放款保证金收取日期", example = "", dataType="datetime", required = true )
    private Date prepaymentdate;

	@Length(max=17,min=0,message="提前放款保证金不能超出17位")
	@ApiModelProperty(value = "提前放款保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal prepaymentfee;

	@ApiModelProperty(value = "审查费收入日期", example = "", dataType="datetime", required = true )
    private Date approvalfeedate;

	@Length(max=17,min=0,message="审查费费用不能超出17位")
	@ApiModelProperty(value = "审查费费用", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal approvalfee;

	@Length(max=17,min=0,message="服务费收取费用不能超出17位")
	@ApiModelProperty(value = "服务费收取费用", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal serverfee;

	@ApiModelProperty(value = "服务费收取费用日期", example = "", dataType="datetime", required = true )
    private Date serverfeedate;

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

    public String getRepayplanrightflg() {
        return repayplanrightflg;
    }

    public void setRepayplanrightflg(String repayplanrightflg) {
        this.repayplanrightflg = repayplanrightflg == null ? null : repayplanrightflg.trim();
    }

    public String getRepayplanrightnote() {
        return repayplanrightnote;
    }

    public void setRepayplanrightnote(String repayplanrightnote) {
        this.repayplanrightnote = repayplanrightnote == null ? null : repayplanrightnote.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLoannotation() {
        return loannotation;
    }

    public void setLoannotation(String loannotation) {
        this.loannotation = loannotation == null ? null : loannotation.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public Date getCapitaldate() {
        return capitaldate;
    }

    public void setCapitaldate(Date capitaldate) {
        this.capitaldate = capitaldate;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public Date getRatedate() {
        return ratedate;
    }

    public void setRatedate(Date ratedate) {
        this.ratedate = ratedate;
    }

    public BigDecimal getRateamount() {
        return rateamount;
    }

    public void setRateamount(BigDecimal rateamount) {
        this.rateamount = rateamount;
    }

    public Date getPrepaymentdate() {
        return prepaymentdate;
    }

    public void setPrepaymentdate(Date prepaymentdate) {
        this.prepaymentdate = prepaymentdate;
    }

    public BigDecimal getPrepaymentfee() {
        return prepaymentfee;
    }

    public void setPrepaymentfee(BigDecimal prepaymentfee) {
        this.prepaymentfee = prepaymentfee;
    }

    public Date getApprovalfeedate() {
        return approvalfeedate;
    }

    public void setApprovalfeedate(Date approvalfeedate) {
        this.approvalfeedate = approvalfeedate;
    }

    public BigDecimal getApprovalfee() {
        return approvalfee;
    }

    public void setApprovalfee(BigDecimal approvalfee) {
        this.approvalfee = approvalfee;
    }

    public BigDecimal getServerfee() {
        return serverfee;
    }

    public void setServerfee(BigDecimal serverfee) {
        this.serverfee = serverfee;
    }

    public Date getServerfeedate() {
        return serverfeedate;
    }

    public void setServerfeedate(Date serverfeedate) {
        this.serverfeedate = serverfeedate;
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
        Financeapproval other = (Financeapproval) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getRepayplanrightflg() == null ? other.getRepayplanrightflg() == null : this.getRepayplanrightflg().equals(other.getRepayplanrightflg()))
            && (this.getRepayplanrightnote() == null ? other.getRepayplanrightnote() == null : this.getRepayplanrightnote().equals(other.getRepayplanrightnote()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getLoannotation() == null ? other.getLoannotation() == null : this.getLoannotation().equals(other.getLoannotation()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getCapitaldate() == null ? other.getCapitaldate() == null : this.getCapitaldate().equals(other.getCapitaldate()))
            && (this.getCapital() == null ? other.getCapital() == null : this.getCapital().equals(other.getCapital()))
            && (this.getRatedate() == null ? other.getRatedate() == null : this.getRatedate().equals(other.getRatedate()))
            && (this.getRateamount() == null ? other.getRateamount() == null : this.getRateamount().equals(other.getRateamount()))
            && (this.getPrepaymentdate() == null ? other.getPrepaymentdate() == null : this.getPrepaymentdate().equals(other.getPrepaymentdate()))
            && (this.getPrepaymentfee() == null ? other.getPrepaymentfee() == null : this.getPrepaymentfee().equals(other.getPrepaymentfee()))
            && (this.getApprovalfeedate() == null ? other.getApprovalfeedate() == null : this.getApprovalfeedate().equals(other.getApprovalfeedate()))
            && (this.getApprovalfee() == null ? other.getApprovalfee() == null : this.getApprovalfee().equals(other.getApprovalfee()))
            && (this.getServerfee() == null ? other.getServerfee() == null : this.getServerfee().equals(other.getServerfee()))
            && (this.getServerfeedate() == null ? other.getServerfeedate() == null : this.getServerfeedate().equals(other.getServerfeedate()))
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
        result = prime * result + ((getRepayplanrightflg() == null) ? 0 : getRepayplanrightflg().hashCode());
        result = prime * result + ((getRepayplanrightnote() == null) ? 0 : getRepayplanrightnote().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getLoannotation() == null) ? 0 : getLoannotation().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getCapitaldate() == null) ? 0 : getCapitaldate().hashCode());
        result = prime * result + ((getCapital() == null) ? 0 : getCapital().hashCode());
        result = prime * result + ((getRatedate() == null) ? 0 : getRatedate().hashCode());
        result = prime * result + ((getRateamount() == null) ? 0 : getRateamount().hashCode());
        result = prime * result + ((getPrepaymentdate() == null) ? 0 : getPrepaymentdate().hashCode());
        result = prime * result + ((getPrepaymentfee() == null) ? 0 : getPrepaymentfee().hashCode());
        result = prime * result + ((getApprovalfeedate() == null) ? 0 : getApprovalfeedate().hashCode());
        result = prime * result + ((getApprovalfee() == null) ? 0 : getApprovalfee().hashCode());
        result = prime * result + ((getServerfee() == null) ? 0 : getServerfee().hashCode());
        result = prime * result + ((getServerfeedate() == null) ? 0 : getServerfeedate().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
