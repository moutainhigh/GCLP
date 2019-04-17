package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//渠道、资金方审批表
public class Chanapprovalform implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="关联审批历史id不能超出19位")
	@ApiModelProperty(value = "关联审批历史id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=8,min=0,message="建议总授信期限不能超出8位")
	@ApiModelProperty(value = "建议总授信期限", example = "", dataType="varchar(8)", required = true )
    private String suggestuseterm;

	@Length(max=17,min=0,message="建议总授信额度不能超出17位")
	@ApiModelProperty(value = "建议总授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal suggestuseamount;

	@Length(max=1,min=0,message="面签是否需要质检不能超出1位")
	@ApiModelProperty(value = "面签是否需要质检", example = "", dataType="char(1)", required = true )
    private String facesignflg;

	@Length(max=1,min=0,message="是否同意期待贷款申请金额不能超出1位")
	@ApiModelProperty(value = "是否同意期待贷款申请金额", example = "", dataType="char(1)", required = true )
    private String agreeexpectloanflg;

	@Length(max=9,min=0,message="建议申请利率不能超出9位")
	@ApiModelProperty(value = "建议申请利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal suggestapplyrate;

	@Length(max=2,min=0,message="建议客户等级不能超出2位")
	@ApiModelProperty(value = "建议客户等级", example = "", dataType="varchar(2)", required = true )
    private String suggestleavel;

	@Length(max=17,min=0,message="建议申请金额不能超出17位")
	@ApiModelProperty(value = "建议申请金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal suggestapplyamount;

	@Length(max=4,min=0,message="建议申请年限不能超出4位")
	@ApiModelProperty(value = "建议申请年限", example = "", dataType="varchar(4)", required = true )
    private String suggestapplyterm;

	@Length(max=80,min=0,message="建议还款方式不能超出80位")
	@ApiModelProperty(value = "建议还款方式", example = "", dataType="varchar(80)", required = true )
    private String suggestrepayway;

	@Length(max=1000,min=0,message="人工核实意见不能超出1000位")
	@ApiModelProperty(value = "人工核实意见", example = "", dataType="varchar(1000)", required = true )
    private String personchecknote;

	@Length(max=1000,min=0,message="诉讼核实意见不能超出1000位")
	@ApiModelProperty(value = "诉讼核实意见", example = "", dataType="varchar(1000)", required = true )
    private String lawchecknote;

	@Length(max=1000,min=0,message="诉讼情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "诉讼情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String lawnote;

	@Length(max=1000,min=0,message="收入情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "收入情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String incomenote;

	@Length(max=1000,min=0,message="资产情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "资产情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String assetnote;

	@Length(max=1000,min=0,message="负债情况说明（借款人）不能超出1000位")
	@ApiModelProperty(value = "负债情况说明（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String debtnote;

	@Length(max=1000,min=0,message="审批意见不能超出1000位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(1000)", required = true )
    private String natation;

	@Length(max=19,min=0,message="节点不能超出19位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=1000,min=0,message="情况说明补充意见不能超出1000位")
	@ApiModelProperty(value = "情况说明补充意见", example = "", dataType="varchar(1000)", required = true )
    private String situationnote;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@ApiModelProperty(value = "审批时间", example = "", dataType="datetime", required = true )
    private Date approvaldate;

	@Length(max=9,min=0,message="抵押率不能超出9位")
	@ApiModelProperty(value = "抵押率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagerate;

	@Length(max=9,min=0,message="总抵押成数不能超出9位")
	@ApiModelProperty(value = "总抵押成数", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal totalmortgage;

	@Length(max=9,min=0,message="服务费率不能超出9位")
	@ApiModelProperty(value = "服务费率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagefeerate;

	@Length(max=1000,min=0,message="产品说明不能超出1000位")
	@ApiModelProperty(value = "产品说明", example = "", dataType="varchar(1000)", required = true )
    private String productremark;

	@Length(max=1000,min=0,message="其他条件和要求不能超出1000位")
	@ApiModelProperty(value = "其他条件和要求", example = "", dataType="varchar(1000)", required = true )
    private String otheridea;

	@Length(max=1000,min=0,message="抵押物信息审查不能超出1000位")
	@ApiModelProperty(value = "抵押物信息审查", example = "", dataType="varchar(1000)", required = true )
    private String mortgagenote;

	@Length(max=1000,min=0,message="基础信息审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "基础信息审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String baseinfonote;

	@Length(max=1000,min=0,message="贷款信息审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "贷款信息审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String loannote;

	@Length(max=1000,min=0,message="信用记录审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "信用记录审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String creditinfonote;

	@Length(max=1000,min=0,message="征信审查（借款人）不能超出1000位")
	@ApiModelProperty(value = "征信审查（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String creditinvestnote;

	@Length(max=1000,min=0,message="覆盖情况（借款人）不能超出1000位")
	@ApiModelProperty(value = "覆盖情况（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String revertnote;

	@Length(max=1000,min=0,message="我司还款情况（借款人）不能超出1000位")
	@ApiModelProperty(value = "我司还款情况（借款人）", example = "", dataType="varchar(1000)", required = true )
    private String companyrepaynote;

	@Length(max=500,min=0,message="基本信息审查（担保方）不能超出500位")
	@ApiModelProperty(value = "基本信息审查（担保方）", example = "", dataType="varchar(500)", required = true )
    private String baseinfonote1;

	@Length(max=500,min=0,message="诉讼审查不能超出500位")
	@ApiModelProperty(value = "诉讼审查", example = "", dataType="varchar(500)", required = true )
    private String lownote1;

	@Length(max=500,min=0,message="贷款信息审查不能超出500位")
	@ApiModelProperty(value = "贷款信息审查", example = "", dataType="varchar(500)", required = true )
    private String loaninfonote1;

	@Length(max=500,min=0,message="信用信息审查不能超出500位")
	@ApiModelProperty(value = "信用信息审查", example = "", dataType="varchar(500)", required = true )
    private String creditinfonote1;

	@Length(max=500,min=0,message="征信信息审查不能超出500位")
	@ApiModelProperty(value = "征信信息审查", example = "", dataType="varchar(500)", required = true )
    private String creditinverstnote1;

	@Length(max=500,min=0,message="资产信息审查不能超出500位")
	@ApiModelProperty(value = "资产信息审查", example = "", dataType="varchar(500)", required = true )
    private String assetinfonote1;

	@Length(max=500,min=0,message="负债信息审查不能超出500位")
	@ApiModelProperty(value = "负债信息审查", example = "", dataType="varchar(500)", required = true )
    private String debtinfonote1;

	@Length(max=9,min=0,message="抵押率（建议授信额度）不能超出9位")
	@ApiModelProperty(value = "抵押率（建议授信额度）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal suggestmortgagerate;

	@Length(max=500,min=0,message="抵押率备注不能超出500位")
	@ApiModelProperty(value = "抵押率备注", example = "", dataType="varchar(500)", required = true )
    private String mortgageratenote;

	@Length(max=9,min=0,message="贷后资产负债率不能超出9位")
	@ApiModelProperty(value = "贷后资产负债率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal afterloandebtrate;

	@Length(max=500,min=0,message="贷后资产负债率备注不能超出500位")
	@ApiModelProperty(value = "贷后资产负债率备注", example = "", dataType="varchar(500)", required = true )
    private String afterloandebtratenote;

	@Length(max=17,min=0,message="抵押率授信不能超出17位")
	@ApiModelProperty(value = "抵押率授信", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal mortgagerateamount;

	@Length(max=17,min=0,message="负债率授信不能超出17位")
	@ApiModelProperty(value = "负债率授信", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal debtrateamount;

	@Length(max=17,min=0,message="最高授信额度不能超出17位")
	@ApiModelProperty(value = "最高授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal maxcreditamount;

	@Length(max=17,min=0,message="实际授信额度不能超出17位")
	@ApiModelProperty(value = "实际授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal realcreditamount;

	@Length(max=100,min=0,message="字段选择不能超出100位")
	@ApiModelProperty(value = "字段选择", example = "", dataType="varchar(100)", required = true )
    private String columnselect;

	@Length(max=10,min=0,message="是否是临时数据不能超出10位")
	@ApiModelProperty(value = "是否是临时数据", example = "", dataType="varchar(10)", required = true )
    private String tempflg;

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

    public String getSuggestuseterm() {
        return suggestuseterm;
    }

    public void setSuggestuseterm(String suggestuseterm) {
        this.suggestuseterm = suggestuseterm == null ? null : suggestuseterm.trim();
    }

    public BigDecimal getSuggestuseamount() {
        return suggestuseamount;
    }

    public void setSuggestuseamount(BigDecimal suggestuseamount) {
        this.suggestuseamount = suggestuseamount;
    }

    public String getFacesignflg() {
        return facesignflg;
    }

    public void setFacesignflg(String facesignflg) {
        this.facesignflg = facesignflg == null ? null : facesignflg.trim();
    }

    public String getAgreeexpectloanflg() {
        return agreeexpectloanflg;
    }

    public void setAgreeexpectloanflg(String agreeexpectloanflg) {
        this.agreeexpectloanflg = agreeexpectloanflg == null ? null : agreeexpectloanflg.trim();
    }

    public BigDecimal getSuggestapplyrate() {
        return suggestapplyrate;
    }

    public void setSuggestapplyrate(BigDecimal suggestapplyrate) {
        this.suggestapplyrate = suggestapplyrate;
    }

    public String getSuggestleavel() {
        return suggestleavel;
    }

    public void setSuggestleavel(String suggestleavel) {
        this.suggestleavel = suggestleavel == null ? null : suggestleavel.trim();
    }

    public BigDecimal getSuggestapplyamount() {
        return suggestapplyamount;
    }

    public void setSuggestapplyamount(BigDecimal suggestapplyamount) {
        this.suggestapplyamount = suggestapplyamount;
    }

    public String getSuggestapplyterm() {
        return suggestapplyterm;
    }

    public void setSuggestapplyterm(String suggestapplyterm) {
        this.suggestapplyterm = suggestapplyterm == null ? null : suggestapplyterm.trim();
    }

    public String getSuggestrepayway() {
        return suggestrepayway;
    }

    public void setSuggestrepayway(String suggestrepayway) {
        this.suggestrepayway = suggestrepayway == null ? null : suggestrepayway.trim();
    }

    public String getPersonchecknote() {
        return personchecknote;
    }

    public void setPersonchecknote(String personchecknote) {
        this.personchecknote = personchecknote == null ? null : personchecknote.trim();
    }

    public String getLawchecknote() {
        return lawchecknote;
    }

    public void setLawchecknote(String lawchecknote) {
        this.lawchecknote = lawchecknote == null ? null : lawchecknote.trim();
    }

    public String getLawnote() {
        return lawnote;
    }

    public void setLawnote(String lawnote) {
        this.lawnote = lawnote == null ? null : lawnote.trim();
    }

    public String getIncomenote() {
        return incomenote;
    }

    public void setIncomenote(String incomenote) {
        this.incomenote = incomenote == null ? null : incomenote.trim();
    }

    public String getAssetnote() {
        return assetnote;
    }

    public void setAssetnote(String assetnote) {
        this.assetnote = assetnote == null ? null : assetnote.trim();
    }

    public String getDebtnote() {
        return debtnote;
    }

    public void setDebtnote(String debtnote) {
        this.debtnote = debtnote == null ? null : debtnote.trim();
    }

    public String getNatation() {
        return natation;
    }

    public void setNatation(String natation) {
        this.natation = natation == null ? null : natation.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getSituationnote() {
        return situationnote;
    }

    public void setSituationnote(String situationnote) {
        this.situationnote = situationnote == null ? null : situationnote.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public BigDecimal getMortgagerate() {
        return mortgagerate;
    }

    public void setMortgagerate(BigDecimal mortgagerate) {
        this.mortgagerate = mortgagerate;
    }

    public BigDecimal getTotalmortgage() {
        return totalmortgage;
    }

    public void setTotalmortgage(BigDecimal totalmortgage) {
        this.totalmortgage = totalmortgage;
    }

    public BigDecimal getMortgagefeerate() {
        return mortgagefeerate;
    }

    public void setMortgagefeerate(BigDecimal mortgagefeerate) {
        this.mortgagefeerate = mortgagefeerate;
    }

    public String getProductremark() {
        return productremark;
    }

    public void setProductremark(String productremark) {
        this.productremark = productremark == null ? null : productremark.trim();
    }

    public String getOtheridea() {
        return otheridea;
    }

    public void setOtheridea(String otheridea) {
        this.otheridea = otheridea == null ? null : otheridea.trim();
    }

    public String getMortgagenote() {
        return mortgagenote;
    }

    public void setMortgagenote(String mortgagenote) {
        this.mortgagenote = mortgagenote == null ? null : mortgagenote.trim();
    }

    public String getBaseinfonote() {
        return baseinfonote;
    }

    public void setBaseinfonote(String baseinfonote) {
        this.baseinfonote = baseinfonote == null ? null : baseinfonote.trim();
    }

    public String getLoannote() {
        return loannote;
    }

    public void setLoannote(String loannote) {
        this.loannote = loannote == null ? null : loannote.trim();
    }

    public String getCreditinfonote() {
        return creditinfonote;
    }

    public void setCreditinfonote(String creditinfonote) {
        this.creditinfonote = creditinfonote == null ? null : creditinfonote.trim();
    }

    public String getCreditinvestnote() {
        return creditinvestnote;
    }

    public void setCreditinvestnote(String creditinvestnote) {
        this.creditinvestnote = creditinvestnote == null ? null : creditinvestnote.trim();
    }

    public String getRevertnote() {
        return revertnote;
    }

    public void setRevertnote(String revertnote) {
        this.revertnote = revertnote == null ? null : revertnote.trim();
    }

    public String getCompanyrepaynote() {
        return companyrepaynote;
    }

    public void setCompanyrepaynote(String companyrepaynote) {
        this.companyrepaynote = companyrepaynote == null ? null : companyrepaynote.trim();
    }

    public String getBaseinfonote1() {
        return baseinfonote1;
    }

    public void setBaseinfonote1(String baseinfonote1) {
        this.baseinfonote1 = baseinfonote1 == null ? null : baseinfonote1.trim();
    }

    public String getLownote1() {
        return lownote1;
    }

    public void setLownote1(String lownote1) {
        this.lownote1 = lownote1 == null ? null : lownote1.trim();
    }

    public String getLoaninfonote1() {
        return loaninfonote1;
    }

    public void setLoaninfonote1(String loaninfonote1) {
        this.loaninfonote1 = loaninfonote1 == null ? null : loaninfonote1.trim();
    }

    public String getCreditinfonote1() {
        return creditinfonote1;
    }

    public void setCreditinfonote1(String creditinfonote1) {
        this.creditinfonote1 = creditinfonote1 == null ? null : creditinfonote1.trim();
    }

    public String getCreditinverstnote1() {
        return creditinverstnote1;
    }

    public void setCreditinverstnote1(String creditinverstnote1) {
        this.creditinverstnote1 = creditinverstnote1 == null ? null : creditinverstnote1.trim();
    }

    public String getAssetinfonote1() {
        return assetinfonote1;
    }

    public void setAssetinfonote1(String assetinfonote1) {
        this.assetinfonote1 = assetinfonote1 == null ? null : assetinfonote1.trim();
    }

    public String getDebtinfonote1() {
        return debtinfonote1;
    }

    public void setDebtinfonote1(String debtinfonote1) {
        this.debtinfonote1 = debtinfonote1 == null ? null : debtinfonote1.trim();
    }

    public BigDecimal getSuggestmortgagerate() {
        return suggestmortgagerate;
    }

    public void setSuggestmortgagerate(BigDecimal suggestmortgagerate) {
        this.suggestmortgagerate = suggestmortgagerate;
    }

    public String getMortgageratenote() {
        return mortgageratenote;
    }

    public void setMortgageratenote(String mortgageratenote) {
        this.mortgageratenote = mortgageratenote == null ? null : mortgageratenote.trim();
    }

    public BigDecimal getAfterloandebtrate() {
        return afterloandebtrate;
    }

    public void setAfterloandebtrate(BigDecimal afterloandebtrate) {
        this.afterloandebtrate = afterloandebtrate;
    }

    public String getAfterloandebtratenote() {
        return afterloandebtratenote;
    }

    public void setAfterloandebtratenote(String afterloandebtratenote) {
        this.afterloandebtratenote = afterloandebtratenote == null ? null : afterloandebtratenote.trim();
    }

    public BigDecimal getMortgagerateamount() {
        return mortgagerateamount;
    }

    public void setMortgagerateamount(BigDecimal mortgagerateamount) {
        this.mortgagerateamount = mortgagerateamount;
    }

    public BigDecimal getDebtrateamount() {
        return debtrateamount;
    }

    public void setDebtrateamount(BigDecimal debtrateamount) {
        this.debtrateamount = debtrateamount;
    }

    public BigDecimal getMaxcreditamount() {
        return maxcreditamount;
    }

    public void setMaxcreditamount(BigDecimal maxcreditamount) {
        this.maxcreditamount = maxcreditamount;
    }

    public BigDecimal getRealcreditamount() {
        return realcreditamount;
    }

    public void setRealcreditamount(BigDecimal realcreditamount) {
        this.realcreditamount = realcreditamount;
    }

    public String getColumnselect() {
        return columnselect;
    }

    public void setColumnselect(String columnselect) {
        this.columnselect = columnselect == null ? null : columnselect.trim();
    }

    public String getTempflg() {
        return tempflg;
    }

    public void setTempflg(String tempflg) {
        this.tempflg = tempflg == null ? null : tempflg.trim();
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
        Chanapprovalform other = (Chanapprovalform) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getSuggestuseterm() == null ? other.getSuggestuseterm() == null : this.getSuggestuseterm().equals(other.getSuggestuseterm()))
            && (this.getSuggestuseamount() == null ? other.getSuggestuseamount() == null : this.getSuggestuseamount().equals(other.getSuggestuseamount()))
            && (this.getFacesignflg() == null ? other.getFacesignflg() == null : this.getFacesignflg().equals(other.getFacesignflg()))
            && (this.getAgreeexpectloanflg() == null ? other.getAgreeexpectloanflg() == null : this.getAgreeexpectloanflg().equals(other.getAgreeexpectloanflg()))
            && (this.getSuggestapplyrate() == null ? other.getSuggestapplyrate() == null : this.getSuggestapplyrate().equals(other.getSuggestapplyrate()))
            && (this.getSuggestleavel() == null ? other.getSuggestleavel() == null : this.getSuggestleavel().equals(other.getSuggestleavel()))
            && (this.getSuggestapplyamount() == null ? other.getSuggestapplyamount() == null : this.getSuggestapplyamount().equals(other.getSuggestapplyamount()))
            && (this.getSuggestapplyterm() == null ? other.getSuggestapplyterm() == null : this.getSuggestapplyterm().equals(other.getSuggestapplyterm()))
            && (this.getSuggestrepayway() == null ? other.getSuggestrepayway() == null : this.getSuggestrepayway().equals(other.getSuggestrepayway()))
            && (this.getPersonchecknote() == null ? other.getPersonchecknote() == null : this.getPersonchecknote().equals(other.getPersonchecknote()))
            && (this.getLawchecknote() == null ? other.getLawchecknote() == null : this.getLawchecknote().equals(other.getLawchecknote()))
            && (this.getLawnote() == null ? other.getLawnote() == null : this.getLawnote().equals(other.getLawnote()))
            && (this.getIncomenote() == null ? other.getIncomenote() == null : this.getIncomenote().equals(other.getIncomenote()))
            && (this.getAssetnote() == null ? other.getAssetnote() == null : this.getAssetnote().equals(other.getAssetnote()))
            && (this.getDebtnote() == null ? other.getDebtnote() == null : this.getDebtnote().equals(other.getDebtnote()))
            && (this.getNatation() == null ? other.getNatation() == null : this.getNatation().equals(other.getNatation()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getSituationnote() == null ? other.getSituationnote() == null : this.getSituationnote().equals(other.getSituationnote()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getApprovaldate() == null ? other.getApprovaldate() == null : this.getApprovaldate().equals(other.getApprovaldate()))
            && (this.getMortgagerate() == null ? other.getMortgagerate() == null : this.getMortgagerate().equals(other.getMortgagerate()))
            && (this.getTotalmortgage() == null ? other.getTotalmortgage() == null : this.getTotalmortgage().equals(other.getTotalmortgage()))
            && (this.getMortgagefeerate() == null ? other.getMortgagefeerate() == null : this.getMortgagefeerate().equals(other.getMortgagefeerate()))
            && (this.getProductremark() == null ? other.getProductremark() == null : this.getProductremark().equals(other.getProductremark()))
            && (this.getOtheridea() == null ? other.getOtheridea() == null : this.getOtheridea().equals(other.getOtheridea()))
            && (this.getMortgagenote() == null ? other.getMortgagenote() == null : this.getMortgagenote().equals(other.getMortgagenote()))
            && (this.getBaseinfonote() == null ? other.getBaseinfonote() == null : this.getBaseinfonote().equals(other.getBaseinfonote()))
            && (this.getLoannote() == null ? other.getLoannote() == null : this.getLoannote().equals(other.getLoannote()))
            && (this.getCreditinfonote() == null ? other.getCreditinfonote() == null : this.getCreditinfonote().equals(other.getCreditinfonote()))
            && (this.getCreditinvestnote() == null ? other.getCreditinvestnote() == null : this.getCreditinvestnote().equals(other.getCreditinvestnote()))
            && (this.getRevertnote() == null ? other.getRevertnote() == null : this.getRevertnote().equals(other.getRevertnote()))
            && (this.getCompanyrepaynote() == null ? other.getCompanyrepaynote() == null : this.getCompanyrepaynote().equals(other.getCompanyrepaynote()))
            && (this.getBaseinfonote1() == null ? other.getBaseinfonote1() == null : this.getBaseinfonote1().equals(other.getBaseinfonote1()))
            && (this.getLownote1() == null ? other.getLownote1() == null : this.getLownote1().equals(other.getLownote1()))
            && (this.getLoaninfonote1() == null ? other.getLoaninfonote1() == null : this.getLoaninfonote1().equals(other.getLoaninfonote1()))
            && (this.getCreditinfonote1() == null ? other.getCreditinfonote1() == null : this.getCreditinfonote1().equals(other.getCreditinfonote1()))
            && (this.getCreditinverstnote1() == null ? other.getCreditinverstnote1() == null : this.getCreditinverstnote1().equals(other.getCreditinverstnote1()))
            && (this.getAssetinfonote1() == null ? other.getAssetinfonote1() == null : this.getAssetinfonote1().equals(other.getAssetinfonote1()))
            && (this.getDebtinfonote1() == null ? other.getDebtinfonote1() == null : this.getDebtinfonote1().equals(other.getDebtinfonote1()))
            && (this.getSuggestmortgagerate() == null ? other.getSuggestmortgagerate() == null : this.getSuggestmortgagerate().equals(other.getSuggestmortgagerate()))
            && (this.getMortgageratenote() == null ? other.getMortgageratenote() == null : this.getMortgageratenote().equals(other.getMortgageratenote()))
            && (this.getAfterloandebtrate() == null ? other.getAfterloandebtrate() == null : this.getAfterloandebtrate().equals(other.getAfterloandebtrate()))
            && (this.getAfterloandebtratenote() == null ? other.getAfterloandebtratenote() == null : this.getAfterloandebtratenote().equals(other.getAfterloandebtratenote()))
            && (this.getMortgagerateamount() == null ? other.getMortgagerateamount() == null : this.getMortgagerateamount().equals(other.getMortgagerateamount()))
            && (this.getDebtrateamount() == null ? other.getDebtrateamount() == null : this.getDebtrateamount().equals(other.getDebtrateamount()))
            && (this.getMaxcreditamount() == null ? other.getMaxcreditamount() == null : this.getMaxcreditamount().equals(other.getMaxcreditamount()))
            && (this.getRealcreditamount() == null ? other.getRealcreditamount() == null : this.getRealcreditamount().equals(other.getRealcreditamount()))
            && (this.getColumnselect() == null ? other.getColumnselect() == null : this.getColumnselect().equals(other.getColumnselect()))
            && (this.getTempflg() == null ? other.getTempflg() == null : this.getTempflg().equals(other.getTempflg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getSuggestuseterm() == null) ? 0 : getSuggestuseterm().hashCode());
        result = prime * result + ((getSuggestuseamount() == null) ? 0 : getSuggestuseamount().hashCode());
        result = prime * result + ((getFacesignflg() == null) ? 0 : getFacesignflg().hashCode());
        result = prime * result + ((getAgreeexpectloanflg() == null) ? 0 : getAgreeexpectloanflg().hashCode());
        result = prime * result + ((getSuggestapplyrate() == null) ? 0 : getSuggestapplyrate().hashCode());
        result = prime * result + ((getSuggestleavel() == null) ? 0 : getSuggestleavel().hashCode());
        result = prime * result + ((getSuggestapplyamount() == null) ? 0 : getSuggestapplyamount().hashCode());
        result = prime * result + ((getSuggestapplyterm() == null) ? 0 : getSuggestapplyterm().hashCode());
        result = prime * result + ((getSuggestrepayway() == null) ? 0 : getSuggestrepayway().hashCode());
        result = prime * result + ((getPersonchecknote() == null) ? 0 : getPersonchecknote().hashCode());
        result = prime * result + ((getLawchecknote() == null) ? 0 : getLawchecknote().hashCode());
        result = prime * result + ((getLawnote() == null) ? 0 : getLawnote().hashCode());
        result = prime * result + ((getIncomenote() == null) ? 0 : getIncomenote().hashCode());
        result = prime * result + ((getAssetnote() == null) ? 0 : getAssetnote().hashCode());
        result = prime * result + ((getDebtnote() == null) ? 0 : getDebtnote().hashCode());
        result = prime * result + ((getNatation() == null) ? 0 : getNatation().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getSituationnote() == null) ? 0 : getSituationnote().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getApprovaldate() == null) ? 0 : getApprovaldate().hashCode());
        result = prime * result + ((getMortgagerate() == null) ? 0 : getMortgagerate().hashCode());
        result = prime * result + ((getTotalmortgage() == null) ? 0 : getTotalmortgage().hashCode());
        result = prime * result + ((getMortgagefeerate() == null) ? 0 : getMortgagefeerate().hashCode());
        result = prime * result + ((getProductremark() == null) ? 0 : getProductremark().hashCode());
        result = prime * result + ((getOtheridea() == null) ? 0 : getOtheridea().hashCode());
        result = prime * result + ((getMortgagenote() == null) ? 0 : getMortgagenote().hashCode());
        result = prime * result + ((getBaseinfonote() == null) ? 0 : getBaseinfonote().hashCode());
        result = prime * result + ((getLoannote() == null) ? 0 : getLoannote().hashCode());
        result = prime * result + ((getCreditinfonote() == null) ? 0 : getCreditinfonote().hashCode());
        result = prime * result + ((getCreditinvestnote() == null) ? 0 : getCreditinvestnote().hashCode());
        result = prime * result + ((getRevertnote() == null) ? 0 : getRevertnote().hashCode());
        result = prime * result + ((getCompanyrepaynote() == null) ? 0 : getCompanyrepaynote().hashCode());
        result = prime * result + ((getBaseinfonote1() == null) ? 0 : getBaseinfonote1().hashCode());
        result = prime * result + ((getLownote1() == null) ? 0 : getLownote1().hashCode());
        result = prime * result + ((getLoaninfonote1() == null) ? 0 : getLoaninfonote1().hashCode());
        result = prime * result + ((getCreditinfonote1() == null) ? 0 : getCreditinfonote1().hashCode());
        result = prime * result + ((getCreditinverstnote1() == null) ? 0 : getCreditinverstnote1().hashCode());
        result = prime * result + ((getAssetinfonote1() == null) ? 0 : getAssetinfonote1().hashCode());
        result = prime * result + ((getDebtinfonote1() == null) ? 0 : getDebtinfonote1().hashCode());
        result = prime * result + ((getSuggestmortgagerate() == null) ? 0 : getSuggestmortgagerate().hashCode());
        result = prime * result + ((getMortgageratenote() == null) ? 0 : getMortgageratenote().hashCode());
        result = prime * result + ((getAfterloandebtrate() == null) ? 0 : getAfterloandebtrate().hashCode());
        result = prime * result + ((getAfterloandebtratenote() == null) ? 0 : getAfterloandebtratenote().hashCode());
        result = prime * result + ((getMortgagerateamount() == null) ? 0 : getMortgagerateamount().hashCode());
        result = prime * result + ((getDebtrateamount() == null) ? 0 : getDebtrateamount().hashCode());
        result = prime * result + ((getMaxcreditamount() == null) ? 0 : getMaxcreditamount().hashCode());
        result = prime * result + ((getRealcreditamount() == null) ? 0 : getRealcreditamount().hashCode());
        result = prime * result + ((getColumnselect() == null) ? 0 : getColumnselect().hashCode());
        result = prime * result + ((getTempflg() == null) ? 0 : getTempflg().hashCode());
        return result;
    }
}
