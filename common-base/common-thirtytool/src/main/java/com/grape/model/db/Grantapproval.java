package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//放款审批表
public class Grantapproval implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String loanconfirmflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String contractsignflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String declaresignflg;

	@Length(max=4,min=0,message="不能超出4位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(4)", required = true )
    private String mortgagestate;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String approvelcarryoutflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String suggestloanflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String realestatecollectflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String resultcollectflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String referenceflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String sharepledgeflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String bailcollectflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String preloanapplyflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String repayplanflg;

	@Length(max=17,min=0,message="不能超出17位")
	@ApiModelProperty(value = "", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal feeamount;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String loanapproveltype;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String approver;

	@ApiModelProperty(value = "", example = "", dataType="longtext", required = true )
    private String loanapprovelview;

	@ApiModelProperty(value = "", example = "", dataType="longtext", required = true )
    private String approvelopinion;

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

    public String getLoanconfirmflg() {
        return loanconfirmflg;
    }

    public void setLoanconfirmflg(String loanconfirmflg) {
        this.loanconfirmflg = loanconfirmflg == null ? null : loanconfirmflg.trim();
    }

    public String getContractsignflg() {
        return contractsignflg;
    }

    public void setContractsignflg(String contractsignflg) {
        this.contractsignflg = contractsignflg == null ? null : contractsignflg.trim();
    }

    public String getDeclaresignflg() {
        return declaresignflg;
    }

    public void setDeclaresignflg(String declaresignflg) {
        this.declaresignflg = declaresignflg == null ? null : declaresignflg.trim();
    }

    public String getMortgagestate() {
        return mortgagestate;
    }

    public void setMortgagestate(String mortgagestate) {
        this.mortgagestate = mortgagestate == null ? null : mortgagestate.trim();
    }

    public String getApprovelcarryoutflg() {
        return approvelcarryoutflg;
    }

    public void setApprovelcarryoutflg(String approvelcarryoutflg) {
        this.approvelcarryoutflg = approvelcarryoutflg == null ? null : approvelcarryoutflg.trim();
    }

    public String getSuggestloanflg() {
        return suggestloanflg;
    }

    public void setSuggestloanflg(String suggestloanflg) {
        this.suggestloanflg = suggestloanflg == null ? null : suggestloanflg.trim();
    }

    public String getRealestatecollectflg() {
        return realestatecollectflg;
    }

    public void setRealestatecollectflg(String realestatecollectflg) {
        this.realestatecollectflg = realestatecollectflg == null ? null : realestatecollectflg.trim();
    }

    public String getResultcollectflg() {
        return resultcollectflg;
    }

    public void setResultcollectflg(String resultcollectflg) {
        this.resultcollectflg = resultcollectflg == null ? null : resultcollectflg.trim();
    }

    public String getReferenceflg() {
        return referenceflg;
    }

    public void setReferenceflg(String referenceflg) {
        this.referenceflg = referenceflg == null ? null : referenceflg.trim();
    }

    public String getSharepledgeflg() {
        return sharepledgeflg;
    }

    public void setSharepledgeflg(String sharepledgeflg) {
        this.sharepledgeflg = sharepledgeflg == null ? null : sharepledgeflg.trim();
    }

    public String getBailcollectflg() {
        return bailcollectflg;
    }

    public void setBailcollectflg(String bailcollectflg) {
        this.bailcollectflg = bailcollectflg == null ? null : bailcollectflg.trim();
    }

    public String getPreloanapplyflg() {
        return preloanapplyflg;
    }

    public void setPreloanapplyflg(String preloanapplyflg) {
        this.preloanapplyflg = preloanapplyflg == null ? null : preloanapplyflg.trim();
    }

    public String getRepayplanflg() {
        return repayplanflg;
    }

    public void setRepayplanflg(String repayplanflg) {
        this.repayplanflg = repayplanflg == null ? null : repayplanflg.trim();
    }

    public BigDecimal getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    public String getLoanapproveltype() {
        return loanapproveltype;
    }

    public void setLoanapproveltype(String loanapproveltype) {
        this.loanapproveltype = loanapproveltype == null ? null : loanapproveltype.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public String getLoanapprovelview() {
        return loanapprovelview;
    }

    public void setLoanapprovelview(String loanapprovelview) {
        this.loanapprovelview = loanapprovelview == null ? null : loanapprovelview.trim();
    }

    public String getApprovelopinion() {
        return approvelopinion;
    }

    public void setApprovelopinion(String approvelopinion) {
        this.approvelopinion = approvelopinion == null ? null : approvelopinion.trim();
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
        Grantapproval other = (Grantapproval) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getLoanconfirmflg() == null ? other.getLoanconfirmflg() == null : this.getLoanconfirmflg().equals(other.getLoanconfirmflg()))
            && (this.getContractsignflg() == null ? other.getContractsignflg() == null : this.getContractsignflg().equals(other.getContractsignflg()))
            && (this.getDeclaresignflg() == null ? other.getDeclaresignflg() == null : this.getDeclaresignflg().equals(other.getDeclaresignflg()))
            && (this.getMortgagestate() == null ? other.getMortgagestate() == null : this.getMortgagestate().equals(other.getMortgagestate()))
            && (this.getApprovelcarryoutflg() == null ? other.getApprovelcarryoutflg() == null : this.getApprovelcarryoutflg().equals(other.getApprovelcarryoutflg()))
            && (this.getSuggestloanflg() == null ? other.getSuggestloanflg() == null : this.getSuggestloanflg().equals(other.getSuggestloanflg()))
            && (this.getRealestatecollectflg() == null ? other.getRealestatecollectflg() == null : this.getRealestatecollectflg().equals(other.getRealestatecollectflg()))
            && (this.getResultcollectflg() == null ? other.getResultcollectflg() == null : this.getResultcollectflg().equals(other.getResultcollectflg()))
            && (this.getReferenceflg() == null ? other.getReferenceflg() == null : this.getReferenceflg().equals(other.getReferenceflg()))
            && (this.getSharepledgeflg() == null ? other.getSharepledgeflg() == null : this.getSharepledgeflg().equals(other.getSharepledgeflg()))
            && (this.getBailcollectflg() == null ? other.getBailcollectflg() == null : this.getBailcollectflg().equals(other.getBailcollectflg()))
            && (this.getPreloanapplyflg() == null ? other.getPreloanapplyflg() == null : this.getPreloanapplyflg().equals(other.getPreloanapplyflg()))
            && (this.getRepayplanflg() == null ? other.getRepayplanflg() == null : this.getRepayplanflg().equals(other.getRepayplanflg()))
            && (this.getFeeamount() == null ? other.getFeeamount() == null : this.getFeeamount().equals(other.getFeeamount()))
            && (this.getLoanapproveltype() == null ? other.getLoanapproveltype() == null : this.getLoanapproveltype().equals(other.getLoanapproveltype()))
            && (this.getApprover() == null ? other.getApprover() == null : this.getApprover().equals(other.getApprover()))
            && (this.getLoanapprovelview() == null ? other.getLoanapprovelview() == null : this.getLoanapprovelview().equals(other.getLoanapprovelview()))
            && (this.getApprovelopinion() == null ? other.getApprovelopinion() == null : this.getApprovelopinion().equals(other.getApprovelopinion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getLoanconfirmflg() == null) ? 0 : getLoanconfirmflg().hashCode());
        result = prime * result + ((getContractsignflg() == null) ? 0 : getContractsignflg().hashCode());
        result = prime * result + ((getDeclaresignflg() == null) ? 0 : getDeclaresignflg().hashCode());
        result = prime * result + ((getMortgagestate() == null) ? 0 : getMortgagestate().hashCode());
        result = prime * result + ((getApprovelcarryoutflg() == null) ? 0 : getApprovelcarryoutflg().hashCode());
        result = prime * result + ((getSuggestloanflg() == null) ? 0 : getSuggestloanflg().hashCode());
        result = prime * result + ((getRealestatecollectflg() == null) ? 0 : getRealestatecollectflg().hashCode());
        result = prime * result + ((getResultcollectflg() == null) ? 0 : getResultcollectflg().hashCode());
        result = prime * result + ((getReferenceflg() == null) ? 0 : getReferenceflg().hashCode());
        result = prime * result + ((getSharepledgeflg() == null) ? 0 : getSharepledgeflg().hashCode());
        result = prime * result + ((getBailcollectflg() == null) ? 0 : getBailcollectflg().hashCode());
        result = prime * result + ((getPreloanapplyflg() == null) ? 0 : getPreloanapplyflg().hashCode());
        result = prime * result + ((getRepayplanflg() == null) ? 0 : getRepayplanflg().hashCode());
        result = prime * result + ((getFeeamount() == null) ? 0 : getFeeamount().hashCode());
        result = prime * result + ((getLoanapproveltype() == null) ? 0 : getLoanapproveltype().hashCode());
        result = prime * result + ((getApprover() == null) ? 0 : getApprover().hashCode());
        result = prime * result + ((getLoanapprovelview() == null) ? 0 : getLoanapprovelview().hashCode());
        result = prime * result + ((getApprovelopinion() == null) ? 0 : getApprovelopinion().hashCode());
        return result;
    }
}
