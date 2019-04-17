package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//流程审批信息表
public class Processappinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="贷款信息是否修改不能超出1位")
	@ApiModelProperty(value = "贷款信息是否修改", example = "", dataType="char(1)", required = true )
    private String loanchangeflg;

	@Length(max=1,min=0,message="是否同意期望贷款申请信息不能超出1位")
	@ApiModelProperty(value = "是否同意期望贷款申请信息", example = "", dataType="char(1)", required = true )
    private String agreeloanflg;

	@Length(max=17,min=0,message="申请金额不能超出17位")
	@ApiModelProperty(value = "申请金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal applyamount;

	@Length(max=9,min=0,message="申请利率不能超出9位")
	@ApiModelProperty(value = "申请利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal applyrate;

	@Length(max=4,min=0,message="申请年限不能超出4位")
	@ApiModelProperty(value = "申请年限", example = "", dataType="varchar(4)", required = true )
    private String yearofapply;

	@Length(max=32,min=0,message="还款方式不能超出32位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod;

	@Length(max=16,min=0,message="核实结果不能超出16位")
	@ApiModelProperty(value = "核实结果", example = "", dataType="varchar(16)", required = true )
    private String checkresult;

	@Length(max=16,min=0,message="审批类型不能超出16位")
	@ApiModelProperty(value = "审批类型", example = "", dataType="varchar(16)", required = true )
    private String approvetype;

	@Length(max=200,min=0,message="待补充资料不能超出200位")
	@ApiModelProperty(value = "待补充资料", example = "", dataType="varchar(200)", required = true )
    private String additionalinfo;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String approveperson;

	@ApiModelProperty(value = "审批时间", example = "", dataType="datetime", required = true )
    private Date approvetime;

	@ApiModelProperty(value = "核实意见", example = "", dataType="longtext", required = true )
    private String checkview;

	@ApiModelProperty(value = "审批意见", example = "", dataType="longtext", required = true )
    private String approveview;

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

    public String getLoanchangeflg() {
        return loanchangeflg;
    }

    public void setLoanchangeflg(String loanchangeflg) {
        this.loanchangeflg = loanchangeflg == null ? null : loanchangeflg.trim();
    }

    public String getAgreeloanflg() {
        return agreeloanflg;
    }

    public void setAgreeloanflg(String agreeloanflg) {
        this.agreeloanflg = agreeloanflg == null ? null : agreeloanflg.trim();
    }

    public BigDecimal getApplyamount() {
        return applyamount;
    }

    public void setApplyamount(BigDecimal applyamount) {
        this.applyamount = applyamount;
    }

    public BigDecimal getApplyrate() {
        return applyrate;
    }

    public void setApplyrate(BigDecimal applyrate) {
        this.applyrate = applyrate;
    }

    public String getYearofapply() {
        return yearofapply;
    }

    public void setYearofapply(String yearofapply) {
        this.yearofapply = yearofapply == null ? null : yearofapply.trim();
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    public String getApprovetype() {
        return approvetype;
    }

    public void setApprovetype(String approvetype) {
        this.approvetype = approvetype == null ? null : approvetype.trim();
    }

    public String getAdditionalinfo() {
        return additionalinfo;
    }

    public void setAdditionalinfo(String additionalinfo) {
        this.additionalinfo = additionalinfo == null ? null : additionalinfo.trim();
    }

    public String getApproveperson() {
        return approveperson;
    }

    public void setApproveperson(String approveperson) {
        this.approveperson = approveperson == null ? null : approveperson.trim();
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public String getCheckview() {
        return checkview;
    }

    public void setCheckview(String checkview) {
        this.checkview = checkview == null ? null : checkview.trim();
    }

    public String getApproveview() {
        return approveview;
    }

    public void setApproveview(String approveview) {
        this.approveview = approveview == null ? null : approveview.trim();
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
        Processappinfo other = (Processappinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getLoanchangeflg() == null ? other.getLoanchangeflg() == null : this.getLoanchangeflg().equals(other.getLoanchangeflg()))
            && (this.getAgreeloanflg() == null ? other.getAgreeloanflg() == null : this.getAgreeloanflg().equals(other.getAgreeloanflg()))
            && (this.getApplyamount() == null ? other.getApplyamount() == null : this.getApplyamount().equals(other.getApplyamount()))
            && (this.getApplyrate() == null ? other.getApplyrate() == null : this.getApplyrate().equals(other.getApplyrate()))
            && (this.getYearofapply() == null ? other.getYearofapply() == null : this.getYearofapply().equals(other.getYearofapply()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getCheckresult() == null ? other.getCheckresult() == null : this.getCheckresult().equals(other.getCheckresult()))
            && (this.getApprovetype() == null ? other.getApprovetype() == null : this.getApprovetype().equals(other.getApprovetype()))
            && (this.getAdditionalinfo() == null ? other.getAdditionalinfo() == null : this.getAdditionalinfo().equals(other.getAdditionalinfo()))
            && (this.getApproveperson() == null ? other.getApproveperson() == null : this.getApproveperson().equals(other.getApproveperson()))
            && (this.getApprovetime() == null ? other.getApprovetime() == null : this.getApprovetime().equals(other.getApprovetime()))
            && (this.getCheckview() == null ? other.getCheckview() == null : this.getCheckview().equals(other.getCheckview()))
            && (this.getApproveview() == null ? other.getApproveview() == null : this.getApproveview().equals(other.getApproveview()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getLoanchangeflg() == null) ? 0 : getLoanchangeflg().hashCode());
        result = prime * result + ((getAgreeloanflg() == null) ? 0 : getAgreeloanflg().hashCode());
        result = prime * result + ((getApplyamount() == null) ? 0 : getApplyamount().hashCode());
        result = prime * result + ((getApplyrate() == null) ? 0 : getApplyrate().hashCode());
        result = prime * result + ((getYearofapply() == null) ? 0 : getYearofapply().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getCheckresult() == null) ? 0 : getCheckresult().hashCode());
        result = prime * result + ((getApprovetype() == null) ? 0 : getApprovetype().hashCode());
        result = prime * result + ((getAdditionalinfo() == null) ? 0 : getAdditionalinfo().hashCode());
        result = prime * result + ((getApproveperson() == null) ? 0 : getApproveperson().hashCode());
        result = prime * result + ((getApprovetime() == null) ? 0 : getApprovetime().hashCode());
        result = prime * result + ((getCheckview() == null) ? 0 : getCheckview().hashCode());
        result = prime * result + ((getApproveview() == null) ? 0 : getApproveview().hashCode());
        return result;
    }
}
