package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//信用记录表
public class Creditrecode implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@ApiModelProperty(value = "征信报告日期", example = "", dataType="datetime", required = true )
    private Date creditreportdate;

	@Length(max=1,min=0,message="贷款征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "贷款征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofloancredit;

	@Length(max=1,min=0,message="贷款征信记录空白情况说明不能超出1位")
	@ApiModelProperty(value = "贷款征信记录空白情况说明", example = "", dataType="char(1)", required = true )
    private String isblackofcreditcard2;

	@Length(max=1,min=0,message="信用卡征信记录是否空白不能超出1位")
	@ApiModelProperty(value = "信用卡征信记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofcreditcard;

	@Length(max=1,min=0,message="信用卡征信记录空白情况说明不能超出1位")
	@ApiModelProperty(value = "信用卡征信记录空白情况说明", example = "", dataType="char(1)", required = true )
    private String isblackofloancredit2;

	@Length(max=1,min=0,message="信用记录是否包含止付、冻结、呆账不能超出1位")
	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit2;

	@Length(max=1,min=0,message="信用记录是否包含止付、冻结、呆账不能超出1位")
	@ApiModelProperty(value = "信用记录是否包含止付、冻结、呆账", example = "", dataType="char(1)", required = true )
    private String iswarnofcredit;

	@Length(max=1,min=0,message="当前是否逾期不能超出1位")
	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue2;

	@Length(max=1,min=0,message="当前是否逾期不能超出1位")
	@ApiModelProperty(value = "当前是否逾期", example = "", dataType="char(1)", required = true )
    private String isoverdue;

	@Length(max=1,min=0,message="是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue2;

	@Length(max=1,min=0,message="是否有逾期记录不能超出1位")
	@ApiModelProperty(value = "是否有逾期记录", example = "", dataType="char(1)", required = true )
    private String isrecentoverdue;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "操作时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=1,min=0,message="当前逾期是否已结清不能超出1位")
	@ApiModelProperty(value = "当前逾期是否已结清", example = "", dataType="char(1)", required = true )
    private String overdueclearflg2;

	@Length(max=1,min=0,message="当前逾期是否已结清不能超出1位")
	@ApiModelProperty(value = "当前逾期是否已结清", example = "", dataType="char(1)", required = true )
    private String overdueclearflg;

	@Length(max=4,min=0,message="当前逾期笔数不能超出4位")
	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount2;

	@Length(max=4,min=0,message="当前逾期笔数不能超出4位")
	@ApiModelProperty(value = "当前逾期笔数", example = "", dataType="varchar(4)", required = true )
    private String overduecount;

	@Length(max=10,min=0,message="当前逾期天数不能超出10位")
	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="varchar(10)", required = true )
    private String overdueday2;

	@Length(max=10,min=0,message="当前逾期天数不能超出10位")
	@ApiModelProperty(value = "当前逾期天数", example = "", dataType="varchar(10)", required = true )
    private String overdueday;

	@Length(max=17,min=0,message="当前逾期金额不能超出17位")
	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount2;

	@Length(max=17,min=0,message="当前逾期金额不能超出17位")
	@ApiModelProperty(value = "当前逾期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal overdueamount;

	@Length(max=10,min=0,message="最高逾期次数不能超出10位")
	@ApiModelProperty(value = "最高逾期次数", example = "", dataType="varchar(10)", required = true )
    private String maxoverduecount2;

	@Length(max=10,min=0,message="最高逾期次数不能超出10位")
	@ApiModelProperty(value = "最高逾期次数", example = "", dataType="varchar(10)", required = true )
    private String maxoverduecount;

	@Length(max=10,min=0,message="累计逾期次数不能超出10位")
	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount2;

	@Length(max=4,min=0,message="最高逾期天数不能超出4位")
	@ApiModelProperty(value = "最高逾期天数", example = "", dataType="varchar(4)", required = true )
    private String maxoverdueday;

	@Length(max=2,min=0,message="最高逾期天数2不能超出2位")
	@ApiModelProperty(value = "最高逾期天数2", example = "", dataType="varchar(2)", required = true )
    private String maxoverdueday2;

	@Length(max=10,min=0,message="累计逾期次数不能超出10位")
	@ApiModelProperty(value = "累计逾期次数", example = "", dataType="varchar(10)", required = true )
    private String totaloverduecount;

	@Length(max=1,min=0,message="是否欠缴年费导致逾期不能超出1位")
	@ApiModelProperty(value = "是否欠缴年费导致逾期", example = "", dataType="varchar(1)", required = true )
    private String isoverdueforpay;

	@Length(max=1,min=0,message="是否欠缴年费导致逾期2不能超出1位")
	@ApiModelProperty(value = "是否欠缴年费导致逾期2", example = "", dataType="varchar(1)", required = true )
    private String isoverdueforpay2;

	@Length(max=1,min=0,message="是否有对外担保不能超出1位")
	@ApiModelProperty(value = "是否有对外担保", example = "", dataType="varchar(1)", required = true )
    private String isguarantee;

	@Length(max=20,min=0,message="逾期发生期间不能超出20位")
	@ApiModelProperty(value = "逾期发生期间", example = "", dataType="varchar(20)", required = true )
    private String overdueperiod;

	@Length(max=20,min=0,message="逾期发生期间2不能超出20位")
	@ApiModelProperty(value = "逾期发生期间2", example = "", dataType="varchar(20)", required = true )
    private String overdueperiod2;

	@Length(max=1,min=0,message="对外担保是否已结清不能超出1位")
	@ApiModelProperty(value = "对外担保是否已结清", example = "", dataType="varchar(1)", required = true )
    private String isclearedup;

	@Length(max=40,min=0,message="对外担保的五级分类不能超出40位")
	@ApiModelProperty(value = "对外担保的五级分类", example = "", dataType="varchar(40)", required = true )
    private String fiveguarantee;

	@Length(max=10,min=0,message="征信查询次数不能超出10位")
	@ApiModelProperty(value = "征信查询次数", example = "", dataType="varchar(10)", required = true )
    private String frequencyofenquiry;

	@Length(max=10,min=0,message="本人查询不能超出10位")
	@ApiModelProperty(value = "本人查询", example = "", dataType="varchar(10)", required = true )
    private String inquire;

	@Length(max=10,min=0,message="贷款审批不能超出10位")
	@ApiModelProperty(value = "贷款审批", example = "", dataType="varchar(10)", required = true )
    private String loanapproval;

	@Length(max=10,min=0,message="信用卡记录不能超出10位")
	@ApiModelProperty(value = "信用卡记录", example = "", dataType="varchar(10)", required = true )
    private String creditapproval;

	@Length(max=10,min=0,message="贷后管理不能超出10位")
	@ApiModelProperty(value = "贷后管理", example = "", dataType="varchar(10)", required = true )
    private String postloanmana;

	@Length(max=10,min=0,message="担保资格审查不能超出10位")
	@ApiModelProperty(value = "担保资格审查", example = "", dataType="varchar(10)", required = true )
    private String gqexamination;

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

    public Date getCreditreportdate() {
        return creditreportdate;
    }

    public void setCreditreportdate(Date creditreportdate) {
        this.creditreportdate = creditreportdate;
    }

    public String getIsblackofloancredit() {
        return isblackofloancredit;
    }

    public void setIsblackofloancredit(String isblackofloancredit) {
        this.isblackofloancredit = isblackofloancredit == null ? null : isblackofloancredit.trim();
    }

    public String getIsblackofcreditcard2() {
        return isblackofcreditcard2;
    }

    public void setIsblackofcreditcard2(String isblackofcreditcard2) {
        this.isblackofcreditcard2 = isblackofcreditcard2 == null ? null : isblackofcreditcard2.trim();
    }

    public String getIsblackofcreditcard() {
        return isblackofcreditcard;
    }

    public void setIsblackofcreditcard(String isblackofcreditcard) {
        this.isblackofcreditcard = isblackofcreditcard == null ? null : isblackofcreditcard.trim();
    }

    public String getIsblackofloancredit2() {
        return isblackofloancredit2;
    }

    public void setIsblackofloancredit2(String isblackofloancredit2) {
        this.isblackofloancredit2 = isblackofloancredit2 == null ? null : isblackofloancredit2.trim();
    }

    public String getIswarnofcredit2() {
        return iswarnofcredit2;
    }

    public void setIswarnofcredit2(String iswarnofcredit2) {
        this.iswarnofcredit2 = iswarnofcredit2 == null ? null : iswarnofcredit2.trim();
    }

    public String getIswarnofcredit() {
        return iswarnofcredit;
    }

    public void setIswarnofcredit(String iswarnofcredit) {
        this.iswarnofcredit = iswarnofcredit == null ? null : iswarnofcredit.trim();
    }

    public String getIsoverdue2() {
        return isoverdue2;
    }

    public void setIsoverdue2(String isoverdue2) {
        this.isoverdue2 = isoverdue2 == null ? null : isoverdue2.trim();
    }

    public String getIsoverdue() {
        return isoverdue;
    }

    public void setIsoverdue(String isoverdue) {
        this.isoverdue = isoverdue == null ? null : isoverdue.trim();
    }

    public String getIsrecentoverdue2() {
        return isrecentoverdue2;
    }

    public void setIsrecentoverdue2(String isrecentoverdue2) {
        this.isrecentoverdue2 = isrecentoverdue2 == null ? null : isrecentoverdue2.trim();
    }

    public String getIsrecentoverdue() {
        return isrecentoverdue;
    }

    public void setIsrecentoverdue(String isrecentoverdue) {
        this.isrecentoverdue = isrecentoverdue == null ? null : isrecentoverdue.trim();
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

    public String getOverdueclearflg2() {
        return overdueclearflg2;
    }

    public void setOverdueclearflg2(String overdueclearflg2) {
        this.overdueclearflg2 = overdueclearflg2 == null ? null : overdueclearflg2.trim();
    }

    public String getOverdueclearflg() {
        return overdueclearflg;
    }

    public void setOverdueclearflg(String overdueclearflg) {
        this.overdueclearflg = overdueclearflg == null ? null : overdueclearflg.trim();
    }

    public String getOverduecount2() {
        return overduecount2;
    }

    public void setOverduecount2(String overduecount2) {
        this.overduecount2 = overduecount2 == null ? null : overduecount2.trim();
    }

    public String getOverduecount() {
        return overduecount;
    }

    public void setOverduecount(String overduecount) {
        this.overduecount = overduecount == null ? null : overduecount.trim();
    }

    public String getOverdueday2() {
        return overdueday2;
    }

    public void setOverdueday2(String overdueday2) {
        this.overdueday2 = overdueday2 == null ? null : overdueday2.trim();
    }

    public String getOverdueday() {
        return overdueday;
    }

    public void setOverdueday(String overdueday) {
        this.overdueday = overdueday == null ? null : overdueday.trim();
    }

    public BigDecimal getOverdueamount2() {
        return overdueamount2;
    }

    public void setOverdueamount2(BigDecimal overdueamount2) {
        this.overdueamount2 = overdueamount2;
    }

    public BigDecimal getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(BigDecimal overdueamount) {
        this.overdueamount = overdueamount;
    }

    public String getMaxoverduecount2() {
        return maxoverduecount2;
    }

    public void setMaxoverduecount2(String maxoverduecount2) {
        this.maxoverduecount2 = maxoverduecount2 == null ? null : maxoverduecount2.trim();
    }

    public String getMaxoverduecount() {
        return maxoverduecount;
    }

    public void setMaxoverduecount(String maxoverduecount) {
        this.maxoverduecount = maxoverduecount == null ? null : maxoverduecount.trim();
    }

    public String getTotaloverduecount2() {
        return totaloverduecount2;
    }

    public void setTotaloverduecount2(String totaloverduecount2) {
        this.totaloverduecount2 = totaloverduecount2 == null ? null : totaloverduecount2.trim();
    }

    public String getMaxoverdueday() {
        return maxoverdueday;
    }

    public void setMaxoverdueday(String maxoverdueday) {
        this.maxoverdueday = maxoverdueday == null ? null : maxoverdueday.trim();
    }

    public String getMaxoverdueday2() {
        return maxoverdueday2;
    }

    public void setMaxoverdueday2(String maxoverdueday2) {
        this.maxoverdueday2 = maxoverdueday2 == null ? null : maxoverdueday2.trim();
    }

    public String getTotaloverduecount() {
        return totaloverduecount;
    }

    public void setTotaloverduecount(String totaloverduecount) {
        this.totaloverduecount = totaloverduecount == null ? null : totaloverduecount.trim();
    }

    public String getIsoverdueforpay() {
        return isoverdueforpay;
    }

    public void setIsoverdueforpay(String isoverdueforpay) {
        this.isoverdueforpay = isoverdueforpay == null ? null : isoverdueforpay.trim();
    }

    public String getIsoverdueforpay2() {
        return isoverdueforpay2;
    }

    public void setIsoverdueforpay2(String isoverdueforpay2) {
        this.isoverdueforpay2 = isoverdueforpay2 == null ? null : isoverdueforpay2.trim();
    }

    public String getIsguarantee() {
        return isguarantee;
    }

    public void setIsguarantee(String isguarantee) {
        this.isguarantee = isguarantee == null ? null : isguarantee.trim();
    }

    public String getOverdueperiod() {
        return overdueperiod;
    }

    public void setOverdueperiod(String overdueperiod) {
        this.overdueperiod = overdueperiod == null ? null : overdueperiod.trim();
    }

    public String getOverdueperiod2() {
        return overdueperiod2;
    }

    public void setOverdueperiod2(String overdueperiod2) {
        this.overdueperiod2 = overdueperiod2 == null ? null : overdueperiod2.trim();
    }

    public String getIsclearedup() {
        return isclearedup;
    }

    public void setIsclearedup(String isclearedup) {
        this.isclearedup = isclearedup == null ? null : isclearedup.trim();
    }

    public String getFiveguarantee() {
        return fiveguarantee;
    }

    public void setFiveguarantee(String fiveguarantee) {
        this.fiveguarantee = fiveguarantee == null ? null : fiveguarantee.trim();
    }

    public String getFrequencyofenquiry() {
        return frequencyofenquiry;
    }

    public void setFrequencyofenquiry(String frequencyofenquiry) {
        this.frequencyofenquiry = frequencyofenquiry == null ? null : frequencyofenquiry.trim();
    }

    public String getInquire() {
        return inquire;
    }

    public void setInquire(String inquire) {
        this.inquire = inquire == null ? null : inquire.trim();
    }

    public String getLoanapproval() {
        return loanapproval;
    }

    public void setLoanapproval(String loanapproval) {
        this.loanapproval = loanapproval == null ? null : loanapproval.trim();
    }

    public String getCreditapproval() {
        return creditapproval;
    }

    public void setCreditapproval(String creditapproval) {
        this.creditapproval = creditapproval == null ? null : creditapproval.trim();
    }

    public String getPostloanmana() {
        return postloanmana;
    }

    public void setPostloanmana(String postloanmana) {
        this.postloanmana = postloanmana == null ? null : postloanmana.trim();
    }

    public String getGqexamination() {
        return gqexamination;
    }

    public void setGqexamination(String gqexamination) {
        this.gqexamination = gqexamination == null ? null : gqexamination.trim();
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
        Creditrecode other = (Creditrecode) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getCreditreportdate() == null ? other.getCreditreportdate() == null : this.getCreditreportdate().equals(other.getCreditreportdate()))
            && (this.getIsblackofloancredit() == null ? other.getIsblackofloancredit() == null : this.getIsblackofloancredit().equals(other.getIsblackofloancredit()))
            && (this.getIsblackofcreditcard2() == null ? other.getIsblackofcreditcard2() == null : this.getIsblackofcreditcard2().equals(other.getIsblackofcreditcard2()))
            && (this.getIsblackofcreditcard() == null ? other.getIsblackofcreditcard() == null : this.getIsblackofcreditcard().equals(other.getIsblackofcreditcard()))
            && (this.getIsblackofloancredit2() == null ? other.getIsblackofloancredit2() == null : this.getIsblackofloancredit2().equals(other.getIsblackofloancredit2()))
            && (this.getIswarnofcredit2() == null ? other.getIswarnofcredit2() == null : this.getIswarnofcredit2().equals(other.getIswarnofcredit2()))
            && (this.getIswarnofcredit() == null ? other.getIswarnofcredit() == null : this.getIswarnofcredit().equals(other.getIswarnofcredit()))
            && (this.getIsoverdue2() == null ? other.getIsoverdue2() == null : this.getIsoverdue2().equals(other.getIsoverdue2()))
            && (this.getIsoverdue() == null ? other.getIsoverdue() == null : this.getIsoverdue().equals(other.getIsoverdue()))
            && (this.getIsrecentoverdue2() == null ? other.getIsrecentoverdue2() == null : this.getIsrecentoverdue2().equals(other.getIsrecentoverdue2()))
            && (this.getIsrecentoverdue() == null ? other.getIsrecentoverdue() == null : this.getIsrecentoverdue().equals(other.getIsrecentoverdue()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getOverdueclearflg2() == null ? other.getOverdueclearflg2() == null : this.getOverdueclearflg2().equals(other.getOverdueclearflg2()))
            && (this.getOverdueclearflg() == null ? other.getOverdueclearflg() == null : this.getOverdueclearflg().equals(other.getOverdueclearflg()))
            && (this.getOverduecount2() == null ? other.getOverduecount2() == null : this.getOverduecount2().equals(other.getOverduecount2()))
            && (this.getOverduecount() == null ? other.getOverduecount() == null : this.getOverduecount().equals(other.getOverduecount()))
            && (this.getOverdueday2() == null ? other.getOverdueday2() == null : this.getOverdueday2().equals(other.getOverdueday2()))
            && (this.getOverdueday() == null ? other.getOverdueday() == null : this.getOverdueday().equals(other.getOverdueday()))
            && (this.getOverdueamount2() == null ? other.getOverdueamount2() == null : this.getOverdueamount2().equals(other.getOverdueamount2()))
            && (this.getOverdueamount() == null ? other.getOverdueamount() == null : this.getOverdueamount().equals(other.getOverdueamount()))
            && (this.getMaxoverduecount2() == null ? other.getMaxoverduecount2() == null : this.getMaxoverduecount2().equals(other.getMaxoverduecount2()))
            && (this.getMaxoverduecount() == null ? other.getMaxoverduecount() == null : this.getMaxoverduecount().equals(other.getMaxoverduecount()))
            && (this.getTotaloverduecount2() == null ? other.getTotaloverduecount2() == null : this.getTotaloverduecount2().equals(other.getTotaloverduecount2()))
            && (this.getMaxoverdueday() == null ? other.getMaxoverdueday() == null : this.getMaxoverdueday().equals(other.getMaxoverdueday()))
            && (this.getMaxoverdueday2() == null ? other.getMaxoverdueday2() == null : this.getMaxoverdueday2().equals(other.getMaxoverdueday2()))
            && (this.getTotaloverduecount() == null ? other.getTotaloverduecount() == null : this.getTotaloverduecount().equals(other.getTotaloverduecount()))
            && (this.getIsoverdueforpay() == null ? other.getIsoverdueforpay() == null : this.getIsoverdueforpay().equals(other.getIsoverdueforpay()))
            && (this.getIsoverdueforpay2() == null ? other.getIsoverdueforpay2() == null : this.getIsoverdueforpay2().equals(other.getIsoverdueforpay2()))
            && (this.getIsguarantee() == null ? other.getIsguarantee() == null : this.getIsguarantee().equals(other.getIsguarantee()))
            && (this.getOverdueperiod() == null ? other.getOverdueperiod() == null : this.getOverdueperiod().equals(other.getOverdueperiod()))
            && (this.getOverdueperiod2() == null ? other.getOverdueperiod2() == null : this.getOverdueperiod2().equals(other.getOverdueperiod2()))
            && (this.getIsclearedup() == null ? other.getIsclearedup() == null : this.getIsclearedup().equals(other.getIsclearedup()))
            && (this.getFiveguarantee() == null ? other.getFiveguarantee() == null : this.getFiveguarantee().equals(other.getFiveguarantee()))
            && (this.getFrequencyofenquiry() == null ? other.getFrequencyofenquiry() == null : this.getFrequencyofenquiry().equals(other.getFrequencyofenquiry()))
            && (this.getInquire() == null ? other.getInquire() == null : this.getInquire().equals(other.getInquire()))
            && (this.getLoanapproval() == null ? other.getLoanapproval() == null : this.getLoanapproval().equals(other.getLoanapproval()))
            && (this.getCreditapproval() == null ? other.getCreditapproval() == null : this.getCreditapproval().equals(other.getCreditapproval()))
            && (this.getPostloanmana() == null ? other.getPostloanmana() == null : this.getPostloanmana().equals(other.getPostloanmana()))
            && (this.getGqexamination() == null ? other.getGqexamination() == null : this.getGqexamination().equals(other.getGqexamination()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getCreditreportdate() == null) ? 0 : getCreditreportdate().hashCode());
        result = prime * result + ((getIsblackofloancredit() == null) ? 0 : getIsblackofloancredit().hashCode());
        result = prime * result + ((getIsblackofcreditcard2() == null) ? 0 : getIsblackofcreditcard2().hashCode());
        result = prime * result + ((getIsblackofcreditcard() == null) ? 0 : getIsblackofcreditcard().hashCode());
        result = prime * result + ((getIsblackofloancredit2() == null) ? 0 : getIsblackofloancredit2().hashCode());
        result = prime * result + ((getIswarnofcredit2() == null) ? 0 : getIswarnofcredit2().hashCode());
        result = prime * result + ((getIswarnofcredit() == null) ? 0 : getIswarnofcredit().hashCode());
        result = prime * result + ((getIsoverdue2() == null) ? 0 : getIsoverdue2().hashCode());
        result = prime * result + ((getIsoverdue() == null) ? 0 : getIsoverdue().hashCode());
        result = prime * result + ((getIsrecentoverdue2() == null) ? 0 : getIsrecentoverdue2().hashCode());
        result = prime * result + ((getIsrecentoverdue() == null) ? 0 : getIsrecentoverdue().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getOverdueclearflg2() == null) ? 0 : getOverdueclearflg2().hashCode());
        result = prime * result + ((getOverdueclearflg() == null) ? 0 : getOverdueclearflg().hashCode());
        result = prime * result + ((getOverduecount2() == null) ? 0 : getOverduecount2().hashCode());
        result = prime * result + ((getOverduecount() == null) ? 0 : getOverduecount().hashCode());
        result = prime * result + ((getOverdueday2() == null) ? 0 : getOverdueday2().hashCode());
        result = prime * result + ((getOverdueday() == null) ? 0 : getOverdueday().hashCode());
        result = prime * result + ((getOverdueamount2() == null) ? 0 : getOverdueamount2().hashCode());
        result = prime * result + ((getOverdueamount() == null) ? 0 : getOverdueamount().hashCode());
        result = prime * result + ((getMaxoverduecount2() == null) ? 0 : getMaxoverduecount2().hashCode());
        result = prime * result + ((getMaxoverduecount() == null) ? 0 : getMaxoverduecount().hashCode());
        result = prime * result + ((getTotaloverduecount2() == null) ? 0 : getTotaloverduecount2().hashCode());
        result = prime * result + ((getMaxoverdueday() == null) ? 0 : getMaxoverdueday().hashCode());
        result = prime * result + ((getMaxoverdueday2() == null) ? 0 : getMaxoverdueday2().hashCode());
        result = prime * result + ((getTotaloverduecount() == null) ? 0 : getTotaloverduecount().hashCode());
        result = prime * result + ((getIsoverdueforpay() == null) ? 0 : getIsoverdueforpay().hashCode());
        result = prime * result + ((getIsoverdueforpay2() == null) ? 0 : getIsoverdueforpay2().hashCode());
        result = prime * result + ((getIsguarantee() == null) ? 0 : getIsguarantee().hashCode());
        result = prime * result + ((getOverdueperiod() == null) ? 0 : getOverdueperiod().hashCode());
        result = prime * result + ((getOverdueperiod2() == null) ? 0 : getOverdueperiod2().hashCode());
        result = prime * result + ((getIsclearedup() == null) ? 0 : getIsclearedup().hashCode());
        result = prime * result + ((getFiveguarantee() == null) ? 0 : getFiveguarantee().hashCode());
        result = prime * result + ((getFrequencyofenquiry() == null) ? 0 : getFrequencyofenquiry().hashCode());
        result = prime * result + ((getInquire() == null) ? 0 : getInquire().hashCode());
        result = prime * result + ((getLoanapproval() == null) ? 0 : getLoanapproval().hashCode());
        result = prime * result + ((getCreditapproval() == null) ? 0 : getCreditapproval().hashCode());
        result = prime * result + ((getPostloanmana() == null) ? 0 : getPostloanmana().hashCode());
        result = prime * result + ((getGqexamination() == null) ? 0 : getGqexamination().hashCode());
        return result;
    }
}
