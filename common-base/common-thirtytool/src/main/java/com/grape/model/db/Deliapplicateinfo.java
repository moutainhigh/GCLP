package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//尽调申请人信息表
public class Deliapplicateinfo implements Serializable {
	@Length(max=32,min=0,message="借款人身份证号不能超出32位")
	@ApiModelProperty(value = "借款人身份证号", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="借款人名称不能超出80位")
	@ApiModelProperty(value = "借款人名称", example = "", dataType="varchar(80)", required = true )
    private String borrower;

	@Length(max=1,min=0,message="借款人是否有重大疾病不能超出1位")
	@ApiModelProperty(value = "借款人是否有重大疾病", example = "", dataType="char(1)", required = true )
    private String isserioussick;

	@Length(max=300,min=0,message="重大疾病情况说明不能超出300位")
	@ApiModelProperty(value = "重大疾病情况说明", example = "", dataType="varchar(300)", required = true )
    private String sicknotes;

	@Length(max=1,min=0,message="借款人是否有赌博、吸毒、涉黑、诈骗等不良嗜好不能超出1位")
	@ApiModelProperty(value = "借款人是否有赌博、吸毒、涉黑、诈骗等不良嗜好", example = "", dataType="char(1)", required = true )
    private String isbadhabbit;

	@Length(max=300,min=0,message="不良嗜好情况说明不能超出300位")
	@ApiModelProperty(value = "不良嗜好情况说明", example = "", dataType="varchar(300)", required = true )
    private String badhabbitnotes;

	@Length(max=1,min=0,message="借款人是否存在历史犯罪记录不能超出1位")
	@ApiModelProperty(value = "借款人是否存在历史犯罪记录", example = "", dataType="char(1)", required = true )
    private String iscriminalrecord;

	@Length(max=300,min=0,message="犯罪情况说明不能超出300位")
	@ApiModelProperty(value = "犯罪情况说明", example = "", dataType="varchar(300)", required = true )
    private String criminalnotes;

	@Length(max=1,min=0,message="是否存在离婚协议未明确本抵押物的分配不能超出1位")
	@ApiModelProperty(value = "是否存在离婚协议未明确本抵押物的分配", example = "", dataType="char(1)", required = true )
    private String isdivorce;

	@Length(max=300,min=0,message="是否存在离婚协议未明确本抵押物的分配情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在离婚协议未明确本抵押物的分配情况说明", example = "", dataType="varchar(300)", required = true )
    private String divorcenotes;

	@Length(max=1,min=0,message="是否为未婚或单身情形，需核实婚姻状况不能超出1位")
	@ApiModelProperty(value = "是否为未婚或单身情形，需核实婚姻状况", example = "", dataType="char(1)", required = true )
    private String isunmarried;

	@Length(max=300,min=0,message="是否为未婚或单身情形，需核实婚姻状况情况说明不能超出300位")
	@ApiModelProperty(value = "是否为未婚或单身情形，需核实婚姻状况情况说明", example = "", dataType="varchar(300)", required = true )
    private String isunmarriednotes;

	@Length(max=1,min=0,message="是否存在“假离婚”分割财产，逃避债务的嫌疑不能超出1位")
	@ApiModelProperty(value = "是否存在“假离婚”分割财产，逃避债务的嫌疑", example = "", dataType="char(1)", required = true )
    private String isshammarriage;

	@Length(max=300,min=0,message="是否存在“假离婚”分割财产，逃避债务的嫌疑情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在“假离婚”分割财产，逃避债务的嫌疑情况说明", example = "", dataType="varchar(300)", required = true )
    private String isshammarriagenotes;

	@Length(max=1,min=0,message="为规避夫妻做共同借款人，是否存在可疑的婚姻证明不能超出1位")
	@ApiModelProperty(value = "为规避夫妻做共同借款人，是否存在可疑的婚姻证明", example = "", dataType="char(1)", required = true )
    private String isdubiousmarriage;

	@Length(max=300,min=0,message="为规避夫妻做共同借款人，是否存在可疑的婚姻证明情况说明不能超出300位")
	@ApiModelProperty(value = "为规避夫妻做共同借款人，是否存在可疑的婚姻证明情况说明", example = "", dataType="varchar(300)", required = true )
    private String isdubiousmarriagenotes;

	@Length(max=300,min=0,message="了解贷款逾期原因不能超出300位")
	@ApiModelProperty(value = "了解贷款逾期原因", example = "", dataType="varchar(300)", required = true )
    private String reasonofoverdue;

	@Length(max=300,min=0,message="贷款冻结、止付、呆滞、代偿等不良信息的原因不能超出300位")
	@ApiModelProperty(value = "贷款冻结、止付、呆滞、代偿等不良信息的原因", example = "", dataType="varchar(300)", required = true )
    private String badinforeason;

	@Length(max=300,min=0,message="信用卡冻结、止付、呆滞、代偿等不良信息的原因不能超出300位")
	@ApiModelProperty(value = "信用卡冻结、止付、呆滞、代偿等不良信息的原因", example = "", dataType="varchar(300)", required = true )
    private String badinfocreditreason;

	@Length(max=300,min=0,message="信用卡逾期原因不能超出300位")
	@ApiModelProperty(value = "信用卡逾期原因", example = "", dataType="varchar(300)", required = true )
    private String reasonofcreditoverdue;

	@Length(max=300,min=0,message="是否存在客户口述已结案，但无法提供结案证明及付款凭证情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在客户口述已结案，但无法提供结案证明及付款凭证情况说明", example = "", dataType="varchar(300)", required = true )
    private String isunableprovennotes;

	@Length(max=1,min=0,message="是否存在客户口述已结案，但无法提供结案证明及付款凭证不能超出1位")
	@ApiModelProperty(value = "是否存在客户口述已结案，但无法提供结案证明及付款凭证", example = "", dataType="char(1)", required = true )
    private String isunableproven;

	@Length(max=300,min=0,message="是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态情况说明", example = "", dataType="varchar(300)", required = true )
    private String isfalsecasenotes;

	@Length(max=1,min=0,message="是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态不能超出1位")
	@ApiModelProperty(value = "是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态", example = "", dataType="char(1)", required = true )
    private String isfalsecase;

	@Length(max=300,min=0,message="是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行情况说明", example = "", dataType="varchar(300)", required = true )
    private String isunfulfilleddebtnotes;

	@Length(max=1,min=0,message="是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行不能超出1位")
	@ApiModelProperty(value = "是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行", example = "", dataType="char(1)", required = true )
    private String isunfulfilleddebt;

	@Length(max=300,min=0,message="产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String isenforcedlitigationnotes;

	@Length(max=1,min=0,message="产权人无诉讼其直系亲属（含前配偶）不能超出1位")
	@ApiModelProperty(value = "产权人无诉讼其直系亲属（含前配偶）", example = "", dataType="char(1)", required = true )
    private String isenforcedlitigation;

	@Length(max=300,min=0,message="控股公司是否有被执行诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "控股公司是否有被执行诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String iiscomcreditigationnote;

	@Length(max=1,min=0,message="控股公司是否有被执行诉讼不能超出1位")
	@ApiModelProperty(value = "控股公司是否有被执行诉讼", example = "", dataType="char(1)", required = true )
    private String iiscomcreditigation;

	@Length(max=300,min=0,message="是否属于公、检、法、军人、同行等禁入职业情况说明不能超出300位")
	@ApiModelProperty(value = "是否属于公、检、法、军人、同行等禁入职业情况说明", example = "", dataType="varchar(300)", required = true )
    private String iskeepoutjobnotes;

	@Length(max=1,min=0,message="是否属于公、检、法、军人、同行等禁入职业不能超出1位")
	@ApiModelProperty(value = "是否属于公、检、法、军人、同行等禁入职业", example = "", dataType="char(1)", required = true )
    private String iskeepoutjob;

	@Length(max=300,min=0,message="是否涉及地产、民间金融、钢贸等谨慎行业情况说明不能超出300位")
	@ApiModelProperty(value = "是否涉及地产、民间金融、钢贸等谨慎行业情况说明", example = "", dataType="varchar(300)", required = true )
    private String isprudentindustrynotes;

	@Length(max=1,min=0,message="是否涉及地产、民间金融、钢贸等谨慎行业不能超出1位")
	@ApiModelProperty(value = "是否涉及地产、民间金融、钢贸等谨慎行业", example = "", dataType="char(1)", required = true )
    private String isprudentindustry;

	@Length(max=300,min=0,message="借款用途是否涉及炒房、炒股、民间借贷等高风险行为情况说明不能超出300位")
	@ApiModelProperty(value = "借款用途是否涉及炒房、炒股、民间借贷等高风险行为情况说明", example = "", dataType="varchar(300)", required = true )
    private String ishignriskbehaviornotes;

	@Length(max=1,min=0,message="借款用途是否涉及炒房、炒股、民间借贷等高风险行为不能超出1位")
	@ApiModelProperty(value = "借款用途是否涉及炒房、炒股、民间借贷等高风险行为", example = "", dataType="char(1)", required = true )
    private String ishignriskbehavior;

	@Length(max=300,min=0,message="特别注意事项调查意见不能超出300位")
	@ApiModelProperty(value = "特别注意事项调查意见", example = "", dataType="varchar(300)", required = true )
    private String specialnotes;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower == null ? null : borrower.trim();
    }

    public String getIsserioussick() {
        return isserioussick;
    }

    public void setIsserioussick(String isserioussick) {
        this.isserioussick = isserioussick == null ? null : isserioussick.trim();
    }

    public String getSicknotes() {
        return sicknotes;
    }

    public void setSicknotes(String sicknotes) {
        this.sicknotes = sicknotes == null ? null : sicknotes.trim();
    }

    public String getIsbadhabbit() {
        return isbadhabbit;
    }

    public void setIsbadhabbit(String isbadhabbit) {
        this.isbadhabbit = isbadhabbit == null ? null : isbadhabbit.trim();
    }

    public String getBadhabbitnotes() {
        return badhabbitnotes;
    }

    public void setBadhabbitnotes(String badhabbitnotes) {
        this.badhabbitnotes = badhabbitnotes == null ? null : badhabbitnotes.trim();
    }

    public String getIscriminalrecord() {
        return iscriminalrecord;
    }

    public void setIscriminalrecord(String iscriminalrecord) {
        this.iscriminalrecord = iscriminalrecord == null ? null : iscriminalrecord.trim();
    }

    public String getCriminalnotes() {
        return criminalnotes;
    }

    public void setCriminalnotes(String criminalnotes) {
        this.criminalnotes = criminalnotes == null ? null : criminalnotes.trim();
    }

    public String getIsdivorce() {
        return isdivorce;
    }

    public void setIsdivorce(String isdivorce) {
        this.isdivorce = isdivorce == null ? null : isdivorce.trim();
    }

    public String getDivorcenotes() {
        return divorcenotes;
    }

    public void setDivorcenotes(String divorcenotes) {
        this.divorcenotes = divorcenotes == null ? null : divorcenotes.trim();
    }

    public String getIsunmarried() {
        return isunmarried;
    }

    public void setIsunmarried(String isunmarried) {
        this.isunmarried = isunmarried == null ? null : isunmarried.trim();
    }

    public String getIsunmarriednotes() {
        return isunmarriednotes;
    }

    public void setIsunmarriednotes(String isunmarriednotes) {
        this.isunmarriednotes = isunmarriednotes == null ? null : isunmarriednotes.trim();
    }

    public String getIsshammarriage() {
        return isshammarriage;
    }

    public void setIsshammarriage(String isshammarriage) {
        this.isshammarriage = isshammarriage == null ? null : isshammarriage.trim();
    }

    public String getIsshammarriagenotes() {
        return isshammarriagenotes;
    }

    public void setIsshammarriagenotes(String isshammarriagenotes) {
        this.isshammarriagenotes = isshammarriagenotes == null ? null : isshammarriagenotes.trim();
    }

    public String getIsdubiousmarriage() {
        return isdubiousmarriage;
    }

    public void setIsdubiousmarriage(String isdubiousmarriage) {
        this.isdubiousmarriage = isdubiousmarriage == null ? null : isdubiousmarriage.trim();
    }

    public String getIsdubiousmarriagenotes() {
        return isdubiousmarriagenotes;
    }

    public void setIsdubiousmarriagenotes(String isdubiousmarriagenotes) {
        this.isdubiousmarriagenotes = isdubiousmarriagenotes == null ? null : isdubiousmarriagenotes.trim();
    }

    public String getReasonofoverdue() {
        return reasonofoverdue;
    }

    public void setReasonofoverdue(String reasonofoverdue) {
        this.reasonofoverdue = reasonofoverdue == null ? null : reasonofoverdue.trim();
    }

    public String getBadinforeason() {
        return badinforeason;
    }

    public void setBadinforeason(String badinforeason) {
        this.badinforeason = badinforeason == null ? null : badinforeason.trim();
    }

    public String getBadinfocreditreason() {
        return badinfocreditreason;
    }

    public void setBadinfocreditreason(String badinfocreditreason) {
        this.badinfocreditreason = badinfocreditreason == null ? null : badinfocreditreason.trim();
    }

    public String getReasonofcreditoverdue() {
        return reasonofcreditoverdue;
    }

    public void setReasonofcreditoverdue(String reasonofcreditoverdue) {
        this.reasonofcreditoverdue = reasonofcreditoverdue == null ? null : reasonofcreditoverdue.trim();
    }

    public String getIsunableprovennotes() {
        return isunableprovennotes;
    }

    public void setIsunableprovennotes(String isunableprovennotes) {
        this.isunableprovennotes = isunableprovennotes == null ? null : isunableprovennotes.trim();
    }

    public String getIsunableproven() {
        return isunableproven;
    }

    public void setIsunableproven(String isunableproven) {
        this.isunableproven = isunableproven == null ? null : isunableproven.trim();
    }

    public String getIsfalsecasenotes() {
        return isfalsecasenotes;
    }

    public void setIsfalsecasenotes(String isfalsecasenotes) {
        this.isfalsecasenotes = isfalsecasenotes == null ? null : isfalsecasenotes.trim();
    }

    public String getIsfalsecase() {
        return isfalsecase;
    }

    public void setIsfalsecase(String isfalsecase) {
        this.isfalsecase = isfalsecase == null ? null : isfalsecase.trim();
    }

    public String getIsunfulfilleddebtnotes() {
        return isunfulfilleddebtnotes;
    }

    public void setIsunfulfilleddebtnotes(String isunfulfilleddebtnotes) {
        this.isunfulfilleddebtnotes = isunfulfilleddebtnotes == null ? null : isunfulfilleddebtnotes.trim();
    }

    public String getIsunfulfilleddebt() {
        return isunfulfilleddebt;
    }

    public void setIsunfulfilleddebt(String isunfulfilleddebt) {
        this.isunfulfilleddebt = isunfulfilleddebt == null ? null : isunfulfilleddebt.trim();
    }

    public String getIsenforcedlitigationnotes() {
        return isenforcedlitigationnotes;
    }

    public void setIsenforcedlitigationnotes(String isenforcedlitigationnotes) {
        this.isenforcedlitigationnotes = isenforcedlitigationnotes == null ? null : isenforcedlitigationnotes.trim();
    }

    public String getIsenforcedlitigation() {
        return isenforcedlitigation;
    }

    public void setIsenforcedlitigation(String isenforcedlitigation) {
        this.isenforcedlitigation = isenforcedlitigation == null ? null : isenforcedlitigation.trim();
    }

    public String getIiscomcreditigationnote() {
        return iiscomcreditigationnote;
    }

    public void setIiscomcreditigationnote(String iiscomcreditigationnote) {
        this.iiscomcreditigationnote = iiscomcreditigationnote == null ? null : iiscomcreditigationnote.trim();
    }

    public String getIiscomcreditigation() {
        return iiscomcreditigation;
    }

    public void setIiscomcreditigation(String iiscomcreditigation) {
        this.iiscomcreditigation = iiscomcreditigation == null ? null : iiscomcreditigation.trim();
    }

    public String getIskeepoutjobnotes() {
        return iskeepoutjobnotes;
    }

    public void setIskeepoutjobnotes(String iskeepoutjobnotes) {
        this.iskeepoutjobnotes = iskeepoutjobnotes == null ? null : iskeepoutjobnotes.trim();
    }

    public String getIskeepoutjob() {
        return iskeepoutjob;
    }

    public void setIskeepoutjob(String iskeepoutjob) {
        this.iskeepoutjob = iskeepoutjob == null ? null : iskeepoutjob.trim();
    }

    public String getIsprudentindustrynotes() {
        return isprudentindustrynotes;
    }

    public void setIsprudentindustrynotes(String isprudentindustrynotes) {
        this.isprudentindustrynotes = isprudentindustrynotes == null ? null : isprudentindustrynotes.trim();
    }

    public String getIsprudentindustry() {
        return isprudentindustry;
    }

    public void setIsprudentindustry(String isprudentindustry) {
        this.isprudentindustry = isprudentindustry == null ? null : isprudentindustry.trim();
    }

    public String getIshignriskbehaviornotes() {
        return ishignriskbehaviornotes;
    }

    public void setIshignriskbehaviornotes(String ishignriskbehaviornotes) {
        this.ishignriskbehaviornotes = ishignriskbehaviornotes == null ? null : ishignriskbehaviornotes.trim();
    }

    public String getIshignriskbehavior() {
        return ishignriskbehavior;
    }

    public void setIshignriskbehavior(String ishignriskbehavior) {
        this.ishignriskbehavior = ishignriskbehavior == null ? null : ishignriskbehavior.trim();
    }

    public String getSpecialnotes() {
        return specialnotes;
    }

    public void setSpecialnotes(String specialnotes) {
        this.specialnotes = specialnotes == null ? null : specialnotes.trim();
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
        Deliapplicateinfo other = (Deliapplicateinfo) that;
        return (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getBorrower() == null ? other.getBorrower() == null : this.getBorrower().equals(other.getBorrower()))
            && (this.getIsserioussick() == null ? other.getIsserioussick() == null : this.getIsserioussick().equals(other.getIsserioussick()))
            && (this.getSicknotes() == null ? other.getSicknotes() == null : this.getSicknotes().equals(other.getSicknotes()))
            && (this.getIsbadhabbit() == null ? other.getIsbadhabbit() == null : this.getIsbadhabbit().equals(other.getIsbadhabbit()))
            && (this.getBadhabbitnotes() == null ? other.getBadhabbitnotes() == null : this.getBadhabbitnotes().equals(other.getBadhabbitnotes()))
            && (this.getIscriminalrecord() == null ? other.getIscriminalrecord() == null : this.getIscriminalrecord().equals(other.getIscriminalrecord()))
            && (this.getCriminalnotes() == null ? other.getCriminalnotes() == null : this.getCriminalnotes().equals(other.getCriminalnotes()))
            && (this.getIsdivorce() == null ? other.getIsdivorce() == null : this.getIsdivorce().equals(other.getIsdivorce()))
            && (this.getDivorcenotes() == null ? other.getDivorcenotes() == null : this.getDivorcenotes().equals(other.getDivorcenotes()))
            && (this.getIsunmarried() == null ? other.getIsunmarried() == null : this.getIsunmarried().equals(other.getIsunmarried()))
            && (this.getIsunmarriednotes() == null ? other.getIsunmarriednotes() == null : this.getIsunmarriednotes().equals(other.getIsunmarriednotes()))
            && (this.getIsshammarriage() == null ? other.getIsshammarriage() == null : this.getIsshammarriage().equals(other.getIsshammarriage()))
            && (this.getIsshammarriagenotes() == null ? other.getIsshammarriagenotes() == null : this.getIsshammarriagenotes().equals(other.getIsshammarriagenotes()))
            && (this.getIsdubiousmarriage() == null ? other.getIsdubiousmarriage() == null : this.getIsdubiousmarriage().equals(other.getIsdubiousmarriage()))
            && (this.getIsdubiousmarriagenotes() == null ? other.getIsdubiousmarriagenotes() == null : this.getIsdubiousmarriagenotes().equals(other.getIsdubiousmarriagenotes()))
            && (this.getReasonofoverdue() == null ? other.getReasonofoverdue() == null : this.getReasonofoverdue().equals(other.getReasonofoverdue()))
            && (this.getBadinforeason() == null ? other.getBadinforeason() == null : this.getBadinforeason().equals(other.getBadinforeason()))
            && (this.getBadinfocreditreason() == null ? other.getBadinfocreditreason() == null : this.getBadinfocreditreason().equals(other.getBadinfocreditreason()))
            && (this.getReasonofcreditoverdue() == null ? other.getReasonofcreditoverdue() == null : this.getReasonofcreditoverdue().equals(other.getReasonofcreditoverdue()))
            && (this.getIsunableprovennotes() == null ? other.getIsunableprovennotes() == null : this.getIsunableprovennotes().equals(other.getIsunableprovennotes()))
            && (this.getIsunableproven() == null ? other.getIsunableproven() == null : this.getIsunableproven().equals(other.getIsunableproven()))
            && (this.getIsfalsecasenotes() == null ? other.getIsfalsecasenotes() == null : this.getIsfalsecasenotes().equals(other.getIsfalsecasenotes()))
            && (this.getIsfalsecase() == null ? other.getIsfalsecase() == null : this.getIsfalsecase().equals(other.getIsfalsecase()))
            && (this.getIsunfulfilleddebtnotes() == null ? other.getIsunfulfilleddebtnotes() == null : this.getIsunfulfilleddebtnotes().equals(other.getIsunfulfilleddebtnotes()))
            && (this.getIsunfulfilleddebt() == null ? other.getIsunfulfilleddebt() == null : this.getIsunfulfilleddebt().equals(other.getIsunfulfilleddebt()))
            && (this.getIsenforcedlitigationnotes() == null ? other.getIsenforcedlitigationnotes() == null : this.getIsenforcedlitigationnotes().equals(other.getIsenforcedlitigationnotes()))
            && (this.getIsenforcedlitigation() == null ? other.getIsenforcedlitigation() == null : this.getIsenforcedlitigation().equals(other.getIsenforcedlitigation()))
            && (this.getIiscomcreditigationnote() == null ? other.getIiscomcreditigationnote() == null : this.getIiscomcreditigationnote().equals(other.getIiscomcreditigationnote()))
            && (this.getIiscomcreditigation() == null ? other.getIiscomcreditigation() == null : this.getIiscomcreditigation().equals(other.getIiscomcreditigation()))
            && (this.getIskeepoutjobnotes() == null ? other.getIskeepoutjobnotes() == null : this.getIskeepoutjobnotes().equals(other.getIskeepoutjobnotes()))
            && (this.getIskeepoutjob() == null ? other.getIskeepoutjob() == null : this.getIskeepoutjob().equals(other.getIskeepoutjob()))
            && (this.getIsprudentindustrynotes() == null ? other.getIsprudentindustrynotes() == null : this.getIsprudentindustrynotes().equals(other.getIsprudentindustrynotes()))
            && (this.getIsprudentindustry() == null ? other.getIsprudentindustry() == null : this.getIsprudentindustry().equals(other.getIsprudentindustry()))
            && (this.getIshignriskbehaviornotes() == null ? other.getIshignriskbehaviornotes() == null : this.getIshignriskbehaviornotes().equals(other.getIshignriskbehaviornotes()))
            && (this.getIshignriskbehavior() == null ? other.getIshignriskbehavior() == null : this.getIshignriskbehavior().equals(other.getIshignriskbehavior()))
            && (this.getSpecialnotes() == null ? other.getSpecialnotes() == null : this.getSpecialnotes().equals(other.getSpecialnotes()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getBorrower() == null) ? 0 : getBorrower().hashCode());
        result = prime * result + ((getIsserioussick() == null) ? 0 : getIsserioussick().hashCode());
        result = prime * result + ((getSicknotes() == null) ? 0 : getSicknotes().hashCode());
        result = prime * result + ((getIsbadhabbit() == null) ? 0 : getIsbadhabbit().hashCode());
        result = prime * result + ((getBadhabbitnotes() == null) ? 0 : getBadhabbitnotes().hashCode());
        result = prime * result + ((getIscriminalrecord() == null) ? 0 : getIscriminalrecord().hashCode());
        result = prime * result + ((getCriminalnotes() == null) ? 0 : getCriminalnotes().hashCode());
        result = prime * result + ((getIsdivorce() == null) ? 0 : getIsdivorce().hashCode());
        result = prime * result + ((getDivorcenotes() == null) ? 0 : getDivorcenotes().hashCode());
        result = prime * result + ((getIsunmarried() == null) ? 0 : getIsunmarried().hashCode());
        result = prime * result + ((getIsunmarriednotes() == null) ? 0 : getIsunmarriednotes().hashCode());
        result = prime * result + ((getIsshammarriage() == null) ? 0 : getIsshammarriage().hashCode());
        result = prime * result + ((getIsshammarriagenotes() == null) ? 0 : getIsshammarriagenotes().hashCode());
        result = prime * result + ((getIsdubiousmarriage() == null) ? 0 : getIsdubiousmarriage().hashCode());
        result = prime * result + ((getIsdubiousmarriagenotes() == null) ? 0 : getIsdubiousmarriagenotes().hashCode());
        result = prime * result + ((getReasonofoverdue() == null) ? 0 : getReasonofoverdue().hashCode());
        result = prime * result + ((getBadinforeason() == null) ? 0 : getBadinforeason().hashCode());
        result = prime * result + ((getBadinfocreditreason() == null) ? 0 : getBadinfocreditreason().hashCode());
        result = prime * result + ((getReasonofcreditoverdue() == null) ? 0 : getReasonofcreditoverdue().hashCode());
        result = prime * result + ((getIsunableprovennotes() == null) ? 0 : getIsunableprovennotes().hashCode());
        result = prime * result + ((getIsunableproven() == null) ? 0 : getIsunableproven().hashCode());
        result = prime * result + ((getIsfalsecasenotes() == null) ? 0 : getIsfalsecasenotes().hashCode());
        result = prime * result + ((getIsfalsecase() == null) ? 0 : getIsfalsecase().hashCode());
        result = prime * result + ((getIsunfulfilleddebtnotes() == null) ? 0 : getIsunfulfilleddebtnotes().hashCode());
        result = prime * result + ((getIsunfulfilleddebt() == null) ? 0 : getIsunfulfilleddebt().hashCode());
        result = prime * result + ((getIsenforcedlitigationnotes() == null) ? 0 : getIsenforcedlitigationnotes().hashCode());
        result = prime * result + ((getIsenforcedlitigation() == null) ? 0 : getIsenforcedlitigation().hashCode());
        result = prime * result + ((getIiscomcreditigationnote() == null) ? 0 : getIiscomcreditigationnote().hashCode());
        result = prime * result + ((getIiscomcreditigation() == null) ? 0 : getIiscomcreditigation().hashCode());
        result = prime * result + ((getIskeepoutjobnotes() == null) ? 0 : getIskeepoutjobnotes().hashCode());
        result = prime * result + ((getIskeepoutjob() == null) ? 0 : getIskeepoutjob().hashCode());
        result = prime * result + ((getIsprudentindustrynotes() == null) ? 0 : getIsprudentindustrynotes().hashCode());
        result = prime * result + ((getIsprudentindustry() == null) ? 0 : getIsprudentindustry().hashCode());
        result = prime * result + ((getIshignriskbehaviornotes() == null) ? 0 : getIshignriskbehaviornotes().hashCode());
        result = prime * result + ((getIshignriskbehavior() == null) ? 0 : getIshignriskbehavior().hashCode());
        result = prime * result + ((getSpecialnotes() == null) ? 0 : getSpecialnotes().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
