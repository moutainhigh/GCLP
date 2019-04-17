package com.grape.model.db;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;

public class Paymentapplyinfo implements Serializable {

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="放款类型不能超出1位")
	@ApiModelProperty(value = "放款类型", example = "", dataType="char(1)", required = true )
    private String loantype;

	@ApiModelProperty(value = "出款申请时间", example = "", dataType="datetime", required = true )
    private Date applicationtime;

	@Length(max=9,min=0,message="担保费利率不能超出9位")
	@ApiModelProperty(value = "担保费利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal examinationrate;

	@Length(max=17,min=0,message="出库前应收费用合计不能超出17位")
	@ApiModelProperty(value = "出库前应收费用合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalfee;

	@Length(max=1000,min=0,message="情况说明不能超出1000位")
	@ApiModelProperty(value = "情况说明", example = "", dataType="varchar(1000)", required = true )
    private String situationsuggest;

	@Length(max=300,min=0,message="各个合同是否已签署正确情况说明（已删除）不能超出300位")
	@ApiModelProperty(value = "各个合同是否已签署正确情况说明（已删除）", example = "", dataType="varchar(300)", required = true )
    private String statesignnote;

	@Length(max=1,min=0,message="各个合同是否已签署正确（已删除）不能超出1位")
	@ApiModelProperty(value = "各个合同是否已签署正确（已删除）", example = "", dataType="char(1)", required = true )
    private String statesignflg;

	@Length(max=300,min=0,message="各类合同是否正确签署情况说明不能超出300位")
	@ApiModelProperty(value = "各类合同是否正确签署情况说明", example = "", dataType="varchar(300)", required = true )
    private String pactsignnote;

	@Length(max=1,min=0,message="各类合同是否正确签署不能超出1位")
	@ApiModelProperty(value = "各类合同是否正确签署", example = "", dataType="char(1)", required = true )
    private String pactsignflg;

	@Length(max=300,min=0,message="《债权回购承诺函 》和《推荐函》是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "《债权回购承诺函 》和《推荐函》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String debtbacknote;

	@Length(max=1,min=0,message="《债权回购承诺函 》是否收取不能超出1位")
	@ApiModelProperty(value = "《债权回购承诺函 》是否收取", example = "", dataType="char(1)", required = true )
    private String debtbackflg;

	@Length(max=300,min=0,message="《提前放款申请书》和《推荐函》是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "《提前放款申请书》和《推荐函》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String priloanapplynote;

	@Length(max=1,min=0,message="《提前放款申请书》是否收取不能超出1位")
	@ApiModelProperty(value = "《提前放款申请书》是否收取", example = "", dataType="char(1)", required = true )
    private String priloanapplyflg;

	@Length(max=300,min=0,message="渠道保证金是否收取不能超出300位")
	@ApiModelProperty(value = "渠道保证金是否收取", example = "", dataType="varchar(300)", required = true )
    private String chanpromisenote;

	@Length(max=1,min=0,message="渠道保证金是否收取不能超出1位")
	@ApiModelProperty(value = "渠道保证金是否收取", example = "", dataType="char(1)", required = true )
    private String chanpromiseflg;

	@Length(max=300,min=0,message="《推荐函》是否收取情况说明(已删除）不能超出300位")
	@ApiModelProperty(value = "《推荐函》是否收取情况说明(已删除）", example = "", dataType="varchar(300)", required = true )
    private String suggesttakenote;

	@Length(max=1,min=0,message="《推荐函》是否收取(已删除）不能超出1位")
	@ApiModelProperty(value = "《推荐函》是否收取(已删除）", example = "", dataType="char(1)", required = true )
    private String suggesttakeflg;

	@Length(max=1,min=0,message="是否有渠道单笔保证金不能超出1位")
	@ApiModelProperty(value = "是否有渠道单笔保证金", example = "", dataType="char(1)", required = true )
    private String havechandeposit;

	@Length(max=17,min=0,message="单笔保证金不能超出17位")
	@ApiModelProperty(value = "单笔保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal singledeposit;

	@ApiModelProperty(value = "单笔保证金录入时间", example = "", dataType="datetime", required = true )
    private Date singledepositdate;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=17,min=0,message="渠道单笔保证金不能超出17位")
	@ApiModelProperty(value = "渠道单笔保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal channelsinglebond;

	@Length(max=17,min=0,message="出款前应收费合计不能超出17位")
	@ApiModelProperty(value = "出款前应收费合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal chargesbefore;

	@Length(max=17,min=0,message="客户预交利息不能超出17位")
	@ApiModelProperty(value = "客户预交利息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal custprepaidinterest;

	@Length(max=5,min=0,message="实际使用天数不能超出5位")
	@ApiModelProperty(value = "实际使用天数", example = "", dataType="varchar(5)", required = true )
    private String actualdays;

	@Length(max=1,min=0,message="是否有退款不能超出1位")
	@ApiModelProperty(value = "是否有退款", example = "", dataType="char(1)", required = true )
    private String havebackproc;

	@Length(max=17,min=0,message="应收利息不能超出17位")
	@ApiModelProperty(value = "应收利息", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal interestreceivable;

	@Length(max=1,min=0,message="公证书是否签署，份数是否齐全不能超出1位")
	@ApiModelProperty(value = "公证书是否签署，份数是否齐全", example = "", dataType="char(1)", required = true )
    private String notarizationflg;

	@Length(max=300,min=0,message="公证书是否收取，分数是否齐全情况说明不能超出300位")
	@ApiModelProperty(value = "公证书是否收取，分数是否齐全情况说明", example = "", dataType="varchar(300)", required = true )
    private String notarizationnote;

	@Length(max=1,min=0,message="回款卡人身份证原件、银行卡及Ukey是否收取不能超出1位")
	@ApiModelProperty(value = "回款卡人身份证原件、银行卡及Ukey是否收取", example = "", dataType="char(1)", required = true )
    private String backcardflg;

	@Length(max=300,min=0,message="回款卡人身份证原件、银行卡及Ukey是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "回款卡人身份证原件、银行卡及Ukey是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String backcardnote;

	@Length(max=1,min=0,message="赎楼卡人身份证原件、银行卡及Ukey是否收取不能超出1位")
	@ApiModelProperty(value = "赎楼卡人身份证原件、银行卡及Ukey是否收取", example = "", dataType="char(1)", required = true )
    private String redempbuildingflg;

	@Length(max=300,min=0,message="赎楼卡人身份证原件、银行卡及Ukey是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "赎楼卡人身份证原件、银行卡及Ukey是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String redempbuildingnote;

	@Length(max=1,min=0,message="出款账号与回款账号是否审核无误不能超出1位")
	@ApiModelProperty(value = "出款账号与回款账号是否审核无误", example = "", dataType="char(1)", required = true )
    private String outandinaccountflg;

	@Length(max=300,min=0,message="出款账号与回款账号是否审核无误情况说明不能超出300位")
	@ApiModelProperty(value = "出款账号与回款账号是否审核无误情况说明", example = "", dataType="varchar(300)", required = true )
    private String outandinaccountnote;

	@Length(max=1,min=0,message="面签照片（客户正在签约一张，签约完之后手持身份证和借款合同一张）不能超出1位")
	@ApiModelProperty(value = "面签照片（客户正在签约一张，签约完之后手持身份证和借款合同一张）", example = "", dataType="char(1)", required = true )
    private String facesignflg;

	@Length(max=300,min=0,message="面签照片（客户正在签约一张，签约完之后手持身份证和借款合同一张）情况说明不能超出300位")
	@ApiModelProperty(value = "面签照片（客户正在签约一张，签约完之后手持身份证和借款合同一张）情况说明", example = "", dataType="varchar(300)", required = true )
    private String facesignnote;

	@Length(max=1,min=0,message="赎楼账户和回款账户为对公账户，需要收齐企业营业执照、公章、私章、财务章、验支票不能超出1位")
	@ApiModelProperty(value = "赎楼账户和回款账户为对公账户，需要收齐企业营业执照、公章、私章、财务章、验支票", example = "", dataType="char(1)", required = true )
    private String publiccardflg;

	@Length(max=300,min=0,message="赎楼账户和回款账户为对公账户，需要收齐企业营业执照、公章、私章、财务章、验支票情况说明不能超出300位")
	@ApiModelProperty(value = "赎楼账户和回款账户为对公账户，需要收齐企业营业执照、公章、私章、财务章、验支票情况说明", example = "", dataType="varchar(300)", required = true )
    private String publiccardnote;

	@Length(max=20,min=0,message="打划款账户不能超出20位")
	@ApiModelProperty(value = "打划款账户", example = "", dataType="varchar(20)", required = true )
    private String account;

	@Length(max=300,min=0,message="打划款账户名不能超出300位")
	@ApiModelProperty(value = "打划款账户名", example = "", dataType="varchar(300)", required = true )
    private String accountname;

	@Length(max=300,min=0,message="打划款开户行不能超出300位")
	@ApiModelProperty(value = "打划款开户行", example = "", dataType="varchar(300)", required = true )
    private String bnk;
	
	@ApiModelProperty(value = "服务费", example = "", dataType="", required = true )
    private BigDecimal servicecharge;
	
	@ApiModelProperty(value = "代理渠道利率", example = "", dataType="", required = true )
    private BigDecimal proxyrate;

    private BigDecimal proxycharge;
    
    @ApiModelProperty(value = "审查费", example = "", dataType="", required = true )
    private BigDecimal examinationfee;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getLoantype() {
        return loantype;
    }

    public void setLoantype(String loantype) {
        this.loantype = loantype == null ? null : loantype.trim();
    }

    public Date getApplicationtime() {
        return applicationtime;
    }

    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    public BigDecimal getExaminationrate() {
        return examinationrate;
    }

    public void setExaminationrate(BigDecimal examinationrate) {
        this.examinationrate = examinationrate;
    }

    public BigDecimal getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(BigDecimal totalfee) {
        this.totalfee = totalfee;
    }

    public String getSituationsuggest() {
        return situationsuggest;
    }

    public void setSituationsuggest(String situationsuggest) {
        this.situationsuggest = situationsuggest == null ? null : situationsuggest.trim();
    }

    public String getStatesignnote() {
        return statesignnote;
    }

    public void setStatesignnote(String statesignnote) {
        this.statesignnote = statesignnote == null ? null : statesignnote.trim();
    }

    public String getStatesignflg() {
        return statesignflg;
    }

    public void setStatesignflg(String statesignflg) {
        this.statesignflg = statesignflg == null ? null : statesignflg.trim();
    }

    public String getPactsignnote() {
        return pactsignnote;
    }

    public void setPactsignnote(String pactsignnote) {
        this.pactsignnote = pactsignnote == null ? null : pactsignnote.trim();
    }

    public String getPactsignflg() {
        return pactsignflg;
    }

    public void setPactsignflg(String pactsignflg) {
        this.pactsignflg = pactsignflg == null ? null : pactsignflg.trim();
    }

    public String getDebtbacknote() {
        return debtbacknote;
    }

    public void setDebtbacknote(String debtbacknote) {
        this.debtbacknote = debtbacknote == null ? null : debtbacknote.trim();
    }

    public String getDebtbackflg() {
        return debtbackflg;
    }

    public void setDebtbackflg(String debtbackflg) {
        this.debtbackflg = debtbackflg == null ? null : debtbackflg.trim();
    }

    public String getPriloanapplynote() {
        return priloanapplynote;
    }

    public void setPriloanapplynote(String priloanapplynote) {
        this.priloanapplynote = priloanapplynote == null ? null : priloanapplynote.trim();
    }

    public String getPriloanapplyflg() {
        return priloanapplyflg;
    }

    public void setPriloanapplyflg(String priloanapplyflg) {
        this.priloanapplyflg = priloanapplyflg == null ? null : priloanapplyflg.trim();
    }

    public String getChanpromisenote() {
        return chanpromisenote;
    }

    public void setChanpromisenote(String chanpromisenote) {
        this.chanpromisenote = chanpromisenote == null ? null : chanpromisenote.trim();
    }

    public String getChanpromiseflg() {
        return chanpromiseflg;
    }

    public void setChanpromiseflg(String chanpromiseflg) {
        this.chanpromiseflg = chanpromiseflg == null ? null : chanpromiseflg.trim();
    }

    public String getSuggesttakenote() {
        return suggesttakenote;
    }

    public void setSuggesttakenote(String suggesttakenote) {
        this.suggesttakenote = suggesttakenote == null ? null : suggesttakenote.trim();
    }

    public String getSuggesttakeflg() {
        return suggesttakeflg;
    }

    public void setSuggesttakeflg(String suggesttakeflg) {
        this.suggesttakeflg = suggesttakeflg == null ? null : suggesttakeflg.trim();
    }

    public String getHavechandeposit() {
        return havechandeposit;
    }

    public void setHavechandeposit(String havechandeposit) {
        this.havechandeposit = havechandeposit == null ? null : havechandeposit.trim();
    }

    public BigDecimal getSingledeposit() {
        return singledeposit;
    }

    public void setSingledeposit(BigDecimal singledeposit) {
        this.singledeposit = singledeposit;
    }

    public Date getSingledepositdate() {
        return singledepositdate;
    }

    public void setSingledepositdate(Date singledepositdate) {
        this.singledepositdate = singledepositdate;
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

    public BigDecimal getChannelsinglebond() {
        return channelsinglebond;
    }

    public void setChannelsinglebond(BigDecimal channelsinglebond) {
        this.channelsinglebond = channelsinglebond;
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

    public String getHavebackproc() {
        return havebackproc;
    }

    public void setHavebackproc(String havebackproc) {
        this.havebackproc = havebackproc == null ? null : havebackproc.trim();
    }

    public BigDecimal getInterestreceivable() {
        return interestreceivable;
    }

    public void setInterestreceivable(BigDecimal interestreceivable) {
        this.interestreceivable = interestreceivable;
    }

    public String getNotarizationflg() {
        return notarizationflg;
    }

    public void setNotarizationflg(String notarizationflg) {
        this.notarizationflg = notarizationflg == null ? null : notarizationflg.trim();
    }

    public String getNotarizationnote() {
        return notarizationnote;
    }

    public void setNotarizationnote(String notarizationnote) {
        this.notarizationnote = notarizationnote == null ? null : notarizationnote.trim();
    }

    public String getBackcardflg() {
        return backcardflg;
    }

    public void setBackcardflg(String backcardflg) {
        this.backcardflg = backcardflg == null ? null : backcardflg.trim();
    }

    public String getBackcardnote() {
        return backcardnote;
    }

    public void setBackcardnote(String backcardnote) {
        this.backcardnote = backcardnote == null ? null : backcardnote.trim();
    }

    public String getRedempbuildingflg() {
        return redempbuildingflg;
    }

    public void setRedempbuildingflg(String redempbuildingflg) {
        this.redempbuildingflg = redempbuildingflg == null ? null : redempbuildingflg.trim();
    }

    public String getRedempbuildingnote() {
        return redempbuildingnote;
    }

    public void setRedempbuildingnote(String redempbuildingnote) {
        this.redempbuildingnote = redempbuildingnote == null ? null : redempbuildingnote.trim();
    }

    public String getOutandinaccountflg() {
        return outandinaccountflg;
    }

    public void setOutandinaccountflg(String outandinaccountflg) {
        this.outandinaccountflg = outandinaccountflg == null ? null : outandinaccountflg.trim();
    }

    public String getOutandinaccountnote() {
        return outandinaccountnote;
    }

    public void setOutandinaccountnote(String outandinaccountnote) {
        this.outandinaccountnote = outandinaccountnote == null ? null : outandinaccountnote.trim();
    }

    public String getFacesignflg() {
        return facesignflg;
    }

    public void setFacesignflg(String facesignflg) {
        this.facesignflg = facesignflg == null ? null : facesignflg.trim();
    }

    public String getFacesignnote() {
        return facesignnote;
    }

    public void setFacesignnote(String facesignnote) {
        this.facesignnote = facesignnote == null ? null : facesignnote.trim();
    }

    public String getPubliccardflg() {
        return publiccardflg;
    }

    public void setPubliccardflg(String publiccardflg) {
        this.publiccardflg = publiccardflg == null ? null : publiccardflg.trim();
    }

    public String getPubliccardnote() {
        return publiccardnote;
    }

    public void setPubliccardnote(String publiccardnote) {
        this.publiccardnote = publiccardnote == null ? null : publiccardnote.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getBnk() {
        return bnk;
    }

    public void setBnk(String bnk) {
        this.bnk = bnk == null ? null : bnk.trim();
    }

    public BigDecimal getServicecharge() {
        return servicecharge;
    }

    public void setServicecharge(BigDecimal servicecharge) {
        this.servicecharge = servicecharge;
    }

    public BigDecimal getProxyrate() {
        return proxyrate;
    }

    public void setProxyrate(BigDecimal proxyrate) {
        this.proxyrate = proxyrate;
    }

    public BigDecimal getProxycharge() {
        return proxycharge;
    }

    public void setProxycharge(BigDecimal proxycharge) {
        this.proxycharge = proxycharge;
    }

    public BigDecimal getExaminationfee() {
        return examinationfee;
    }

    public void setExaminationfee(BigDecimal examinationfee) {
        this.examinationfee = examinationfee;
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
        Paymentapplyinfo other = (Paymentapplyinfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getLoantype() == null ? other.getLoantype() == null : this.getLoantype().equals(other.getLoantype()))
            && (this.getApplicationtime() == null ? other.getApplicationtime() == null : this.getApplicationtime().equals(other.getApplicationtime()))
            && (this.getExaminationrate() == null ? other.getExaminationrate() == null : this.getExaminationrate().equals(other.getExaminationrate()))
            && (this.getTotalfee() == null ? other.getTotalfee() == null : this.getTotalfee().equals(other.getTotalfee()))
            && (this.getSituationsuggest() == null ? other.getSituationsuggest() == null : this.getSituationsuggest().equals(other.getSituationsuggest()))
            && (this.getStatesignnote() == null ? other.getStatesignnote() == null : this.getStatesignnote().equals(other.getStatesignnote()))
            && (this.getStatesignflg() == null ? other.getStatesignflg() == null : this.getStatesignflg().equals(other.getStatesignflg()))
            && (this.getPactsignnote() == null ? other.getPactsignnote() == null : this.getPactsignnote().equals(other.getPactsignnote()))
            && (this.getPactsignflg() == null ? other.getPactsignflg() == null : this.getPactsignflg().equals(other.getPactsignflg()))
            && (this.getDebtbacknote() == null ? other.getDebtbacknote() == null : this.getDebtbacknote().equals(other.getDebtbacknote()))
            && (this.getDebtbackflg() == null ? other.getDebtbackflg() == null : this.getDebtbackflg().equals(other.getDebtbackflg()))
            && (this.getPriloanapplynote() == null ? other.getPriloanapplynote() == null : this.getPriloanapplynote().equals(other.getPriloanapplynote()))
            && (this.getPriloanapplyflg() == null ? other.getPriloanapplyflg() == null : this.getPriloanapplyflg().equals(other.getPriloanapplyflg()))
            && (this.getChanpromisenote() == null ? other.getChanpromisenote() == null : this.getChanpromisenote().equals(other.getChanpromisenote()))
            && (this.getChanpromiseflg() == null ? other.getChanpromiseflg() == null : this.getChanpromiseflg().equals(other.getChanpromiseflg()))
            && (this.getSuggesttakenote() == null ? other.getSuggesttakenote() == null : this.getSuggesttakenote().equals(other.getSuggesttakenote()))
            && (this.getSuggesttakeflg() == null ? other.getSuggesttakeflg() == null : this.getSuggesttakeflg().equals(other.getSuggesttakeflg()))
            && (this.getHavechandeposit() == null ? other.getHavechandeposit() == null : this.getHavechandeposit().equals(other.getHavechandeposit()))
            && (this.getSingledeposit() == null ? other.getSingledeposit() == null : this.getSingledeposit().equals(other.getSingledeposit()))
            && (this.getSingledepositdate() == null ? other.getSingledepositdate() == null : this.getSingledepositdate().equals(other.getSingledepositdate()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChannelsinglebond() == null ? other.getChannelsinglebond() == null : this.getChannelsinglebond().equals(other.getChannelsinglebond()))
            && (this.getChargesbefore() == null ? other.getChargesbefore() == null : this.getChargesbefore().equals(other.getChargesbefore()))
            && (this.getCustprepaidinterest() == null ? other.getCustprepaidinterest() == null : this.getCustprepaidinterest().equals(other.getCustprepaidinterest()))
            && (this.getActualdays() == null ? other.getActualdays() == null : this.getActualdays().equals(other.getActualdays()))
            && (this.getHavebackproc() == null ? other.getHavebackproc() == null : this.getHavebackproc().equals(other.getHavebackproc()))
            && (this.getInterestreceivable() == null ? other.getInterestreceivable() == null : this.getInterestreceivable().equals(other.getInterestreceivable()))
            && (this.getNotarizationflg() == null ? other.getNotarizationflg() == null : this.getNotarizationflg().equals(other.getNotarizationflg()))
            && (this.getNotarizationnote() == null ? other.getNotarizationnote() == null : this.getNotarizationnote().equals(other.getNotarizationnote()))
            && (this.getBackcardflg() == null ? other.getBackcardflg() == null : this.getBackcardflg().equals(other.getBackcardflg()))
            && (this.getBackcardnote() == null ? other.getBackcardnote() == null : this.getBackcardnote().equals(other.getBackcardnote()))
            && (this.getRedempbuildingflg() == null ? other.getRedempbuildingflg() == null : this.getRedempbuildingflg().equals(other.getRedempbuildingflg()))
            && (this.getRedempbuildingnote() == null ? other.getRedempbuildingnote() == null : this.getRedempbuildingnote().equals(other.getRedempbuildingnote()))
            && (this.getOutandinaccountflg() == null ? other.getOutandinaccountflg() == null : this.getOutandinaccountflg().equals(other.getOutandinaccountflg()))
            && (this.getOutandinaccountnote() == null ? other.getOutandinaccountnote() == null : this.getOutandinaccountnote().equals(other.getOutandinaccountnote()))
            && (this.getFacesignflg() == null ? other.getFacesignflg() == null : this.getFacesignflg().equals(other.getFacesignflg()))
            && (this.getFacesignnote() == null ? other.getFacesignnote() == null : this.getFacesignnote().equals(other.getFacesignnote()))
            && (this.getPubliccardflg() == null ? other.getPubliccardflg() == null : this.getPubliccardflg().equals(other.getPubliccardflg()))
            && (this.getPubliccardnote() == null ? other.getPubliccardnote() == null : this.getPubliccardnote().equals(other.getPubliccardnote()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getAccountname() == null ? other.getAccountname() == null : this.getAccountname().equals(other.getAccountname()))
            && (this.getBnk() == null ? other.getBnk() == null : this.getBnk().equals(other.getBnk()))
            && (this.getServicecharge() == null ? other.getServicecharge() == null : this.getServicecharge().equals(other.getServicecharge()))
            && (this.getProxyrate() == null ? other.getProxyrate() == null : this.getProxyrate().equals(other.getProxyrate()))
            && (this.getProxycharge() == null ? other.getProxycharge() == null : this.getProxycharge().equals(other.getProxycharge()))
            && (this.getExaminationfee() == null ? other.getExaminationfee() == null : this.getExaminationfee().equals(other.getExaminationfee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getLoantype() == null) ? 0 : getLoantype().hashCode());
        result = prime * result + ((getApplicationtime() == null) ? 0 : getApplicationtime().hashCode());
        result = prime * result + ((getExaminationrate() == null) ? 0 : getExaminationrate().hashCode());
        result = prime * result + ((getTotalfee() == null) ? 0 : getTotalfee().hashCode());
        result = prime * result + ((getSituationsuggest() == null) ? 0 : getSituationsuggest().hashCode());
        result = prime * result + ((getStatesignnote() == null) ? 0 : getStatesignnote().hashCode());
        result = prime * result + ((getStatesignflg() == null) ? 0 : getStatesignflg().hashCode());
        result = prime * result + ((getPactsignnote() == null) ? 0 : getPactsignnote().hashCode());
        result = prime * result + ((getPactsignflg() == null) ? 0 : getPactsignflg().hashCode());
        result = prime * result + ((getDebtbacknote() == null) ? 0 : getDebtbacknote().hashCode());
        result = prime * result + ((getDebtbackflg() == null) ? 0 : getDebtbackflg().hashCode());
        result = prime * result + ((getPriloanapplynote() == null) ? 0 : getPriloanapplynote().hashCode());
        result = prime * result + ((getPriloanapplyflg() == null) ? 0 : getPriloanapplyflg().hashCode());
        result = prime * result + ((getChanpromisenote() == null) ? 0 : getChanpromisenote().hashCode());
        result = prime * result + ((getChanpromiseflg() == null) ? 0 : getChanpromiseflg().hashCode());
        result = prime * result + ((getSuggesttakenote() == null) ? 0 : getSuggesttakenote().hashCode());
        result = prime * result + ((getSuggesttakeflg() == null) ? 0 : getSuggesttakeflg().hashCode());
        result = prime * result + ((getHavechandeposit() == null) ? 0 : getHavechandeposit().hashCode());
        result = prime * result + ((getSingledeposit() == null) ? 0 : getSingledeposit().hashCode());
        result = prime * result + ((getSingledepositdate() == null) ? 0 : getSingledepositdate().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChannelsinglebond() == null) ? 0 : getChannelsinglebond().hashCode());
        result = prime * result + ((getChargesbefore() == null) ? 0 : getChargesbefore().hashCode());
        result = prime * result + ((getCustprepaidinterest() == null) ? 0 : getCustprepaidinterest().hashCode());
        result = prime * result + ((getActualdays() == null) ? 0 : getActualdays().hashCode());
        result = prime * result + ((getHavebackproc() == null) ? 0 : getHavebackproc().hashCode());
        result = prime * result + ((getInterestreceivable() == null) ? 0 : getInterestreceivable().hashCode());
        result = prime * result + ((getNotarizationflg() == null) ? 0 : getNotarizationflg().hashCode());
        result = prime * result + ((getNotarizationnote() == null) ? 0 : getNotarizationnote().hashCode());
        result = prime * result + ((getBackcardflg() == null) ? 0 : getBackcardflg().hashCode());
        result = prime * result + ((getBackcardnote() == null) ? 0 : getBackcardnote().hashCode());
        result = prime * result + ((getRedempbuildingflg() == null) ? 0 : getRedempbuildingflg().hashCode());
        result = prime * result + ((getRedempbuildingnote() == null) ? 0 : getRedempbuildingnote().hashCode());
        result = prime * result + ((getOutandinaccountflg() == null) ? 0 : getOutandinaccountflg().hashCode());
        result = prime * result + ((getOutandinaccountnote() == null) ? 0 : getOutandinaccountnote().hashCode());
        result = prime * result + ((getFacesignflg() == null) ? 0 : getFacesignflg().hashCode());
        result = prime * result + ((getFacesignnote() == null) ? 0 : getFacesignnote().hashCode());
        result = prime * result + ((getPubliccardflg() == null) ? 0 : getPubliccardflg().hashCode());
        result = prime * result + ((getPubliccardnote() == null) ? 0 : getPubliccardnote().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getAccountname() == null) ? 0 : getAccountname().hashCode());
        result = prime * result + ((getBnk() == null) ? 0 : getBnk().hashCode());
        result = prime * result + ((getServicecharge() == null) ? 0 : getServicecharge().hashCode());
        result = prime * result + ((getProxyrate() == null) ? 0 : getProxyrate().hashCode());
        result = prime * result + ((getProxycharge() == null) ? 0 : getProxycharge().hashCode());
        result = prime * result + ((getExaminationfee() == null) ? 0 : getExaminationfee().hashCode());
        return result;
    }
}