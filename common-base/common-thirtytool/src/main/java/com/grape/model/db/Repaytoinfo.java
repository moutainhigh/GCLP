package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//批复信息表
public class Repaytoinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="还款方式不能超出32位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod;

	@Length(max=20,min=0,message="批复机构不能超出20位")
	@ApiModelProperty(value = "批复机构", example = "", dataType="varchar(20)", required = true )
    private String batchorg;

	@Length(max=17,min=0,message="批复金额不能超出17位")
	@ApiModelProperty(value = "批复金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal sumofamount;

	@Length(max=9,min=0,message="批复利率不能超出9位")
	@ApiModelProperty(value = "批复利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestrate;

	@Length(max=4,min=0,message="利率类型不能超出4位")
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(4)", required = true )
    private String interestratetype;

	@Length(max=4,min=0,message="贷款期限不能超出4位")
	@ApiModelProperty(value = "贷款期限", example = "", dataType="varchar(4)", required = true )
    private String loanlimittime;

	@Length(max=1,min=0,message="是否同意期待贷款申请金额不能超出1位")
	@ApiModelProperty(value = "是否同意期待贷款申请金额", example = "", dataType="char(1)", required = true )
    private String isagreeexceptamount;

	@Length(max=4,min=0,message="总授信期限不能超出4位")
	@ApiModelProperty(value = "总授信期限", example = "", dataType="varchar(4)", required = true )
    private String totaluseterm;

	@Length(max=17,min=0,message="总授信金额不能超出17位")
	@ApiModelProperty(value = "总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totaluseamount;

	@Length(max=200,min=0,message="贷款用途不能超出200位")
	@ApiModelProperty(value = "贷款用途", example = "", dataType="varchar(200)", required = true )
    private String useofloan;

	@Length(max=1,min=0,message="是否最终批复信息不能超出1位")
	@ApiModelProperty(value = "是否最终批复信息", example = "", dataType="char(1)", required = true )
    private String isfinilyflg;

	@Length(max=20,min=0,message="最终选择批复机构不能超出20位")
	@ApiModelProperty(value = "最终选择批复机构", example = "", dataType="varchar(20)", required = true )
    private String selectorg;

	@Length(max=1,min=0,message="担保方是否出具保函不能超出1位")
	@ApiModelProperty(value = "担保方是否出具保函", example = "", dataType="char(1)", required = true )
    private String chooseassure;

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

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public String getBatchorg() {
        return batchorg;
    }

    public void setBatchorg(String batchorg) {
        this.batchorg = batchorg == null ? null : batchorg.trim();
    }

    public BigDecimal getSumofamount() {
        return sumofamount;
    }

    public void setSumofamount(BigDecimal sumofamount) {
        this.sumofamount = sumofamount;
    }

    public BigDecimal getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(BigDecimal interestrate) {
        this.interestrate = interestrate;
    }

    public String getInterestratetype() {
        return interestratetype;
    }

    public void setInterestratetype(String interestratetype) {
        this.interestratetype = interestratetype == null ? null : interestratetype.trim();
    }

    public String getLoanlimittime() {
        return loanlimittime;
    }

    public void setLoanlimittime(String loanlimittime) {
        this.loanlimittime = loanlimittime == null ? null : loanlimittime.trim();
    }

    public String getIsagreeexceptamount() {
        return isagreeexceptamount;
    }

    public void setIsagreeexceptamount(String isagreeexceptamount) {
        this.isagreeexceptamount = isagreeexceptamount == null ? null : isagreeexceptamount.trim();
    }

    public String getTotaluseterm() {
        return totaluseterm;
    }

    public void setTotaluseterm(String totaluseterm) {
        this.totaluseterm = totaluseterm == null ? null : totaluseterm.trim();
    }

    public BigDecimal getTotaluseamount() {
        return totaluseamount;
    }

    public void setTotaluseamount(BigDecimal totaluseamount) {
        this.totaluseamount = totaluseamount;
    }

    public String getUseofloan() {
        return useofloan;
    }

    public void setUseofloan(String useofloan) {
        this.useofloan = useofloan == null ? null : useofloan.trim();
    }

    public String getIsfinilyflg() {
        return isfinilyflg;
    }

    public void setIsfinilyflg(String isfinilyflg) {
        this.isfinilyflg = isfinilyflg == null ? null : isfinilyflg.trim();
    }

    public String getSelectorg() {
        return selectorg;
    }

    public void setSelectorg(String selectorg) {
        this.selectorg = selectorg == null ? null : selectorg.trim();
    }

    public String getChooseassure() {
        return chooseassure;
    }

    public void setChooseassure(String chooseassure) {
        this.chooseassure = chooseassure == null ? null : chooseassure.trim();
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
        Repaytoinfo other = (Repaytoinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getBatchorg() == null ? other.getBatchorg() == null : this.getBatchorg().equals(other.getBatchorg()))
            && (this.getSumofamount() == null ? other.getSumofamount() == null : this.getSumofamount().equals(other.getSumofamount()))
            && (this.getInterestrate() == null ? other.getInterestrate() == null : this.getInterestrate().equals(other.getInterestrate()))
            && (this.getInterestratetype() == null ? other.getInterestratetype() == null : this.getInterestratetype().equals(other.getInterestratetype()))
            && (this.getLoanlimittime() == null ? other.getLoanlimittime() == null : this.getLoanlimittime().equals(other.getLoanlimittime()))
            && (this.getIsagreeexceptamount() == null ? other.getIsagreeexceptamount() == null : this.getIsagreeexceptamount().equals(other.getIsagreeexceptamount()))
            && (this.getTotaluseterm() == null ? other.getTotaluseterm() == null : this.getTotaluseterm().equals(other.getTotaluseterm()))
            && (this.getTotaluseamount() == null ? other.getTotaluseamount() == null : this.getTotaluseamount().equals(other.getTotaluseamount()))
            && (this.getUseofloan() == null ? other.getUseofloan() == null : this.getUseofloan().equals(other.getUseofloan()))
            && (this.getIsfinilyflg() == null ? other.getIsfinilyflg() == null : this.getIsfinilyflg().equals(other.getIsfinilyflg()))
            && (this.getSelectorg() == null ? other.getSelectorg() == null : this.getSelectorg().equals(other.getSelectorg()))
            && (this.getChooseassure() == null ? other.getChooseassure() == null : this.getChooseassure().equals(other.getChooseassure()))
            && (this.getNotation() == null ? other.getNotation() == null : this.getNotation().equals(other.getNotation()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getBatchorg() == null) ? 0 : getBatchorg().hashCode());
        result = prime * result + ((getSumofamount() == null) ? 0 : getSumofamount().hashCode());
        result = prime * result + ((getInterestrate() == null) ? 0 : getInterestrate().hashCode());
        result = prime * result + ((getInterestratetype() == null) ? 0 : getInterestratetype().hashCode());
        result = prime * result + ((getLoanlimittime() == null) ? 0 : getLoanlimittime().hashCode());
        result = prime * result + ((getIsagreeexceptamount() == null) ? 0 : getIsagreeexceptamount().hashCode());
        result = prime * result + ((getTotaluseterm() == null) ? 0 : getTotaluseterm().hashCode());
        result = prime * result + ((getTotaluseamount() == null) ? 0 : getTotaluseamount().hashCode());
        result = prime * result + ((getUseofloan() == null) ? 0 : getUseofloan().hashCode());
        result = prime * result + ((getIsfinilyflg() == null) ? 0 : getIsfinilyflg().hashCode());
        result = prime * result + ((getSelectorg() == null) ? 0 : getSelectorg().hashCode());
        result = prime * result + ((getChooseassure() == null) ? 0 : getChooseassure().hashCode());
        result = prime * result + ((getNotation() == null) ? 0 : getNotation().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
