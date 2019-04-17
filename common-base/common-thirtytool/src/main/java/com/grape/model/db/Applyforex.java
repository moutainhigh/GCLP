package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//申请展期
public class Applyforex implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=20,min=0,message="主借款人不能超出20位")
	@ApiModelProperty(value = "主借款人", example = "", dataType="varchar(20)", required = true )
    private String mainborrower;

	@Length(max=40,min=0,message="证件号码不能超出40位")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(40)", required = true )
    private String identifino;

	@Length(max=17,min=0,message="展期金额不能超出17位")
	@ApiModelProperty(value = "展期金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal examount;

	@Length(max=9,min=0,message="展期年限不能超出9位")
	@ApiModelProperty(value = "展期年限", example = "", dataType="varchar(9)", required = true )
    private String exage;

	@Length(max=9,min=0,message="展期利率不能超出9位")
	@ApiModelProperty(value = "展期利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal exinterestrate;

	@Length(max=32,min=0,message="还款方式不能超出32位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod;

	@Length(max=255,min=0,message="展期原因不能超出255位")
	@ApiModelProperty(value = "展期原因", example = "", dataType="varchar(255)", required = true )
    private String exreason;

	@Length(max=19,min=0,message="展期流水不能超出19位")
	@ApiModelProperty(value = "展期流水", example = "", dataType="varchar(19)", required = true )
    private String newworkid;

	@Length(max=19,min=0,message="原贷款流水不能超出19位")
	@ApiModelProperty(value = "原贷款流水", example = "", dataType="varchar(19)", required = true )
    private String workid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMainborrower() {
        return mainborrower;
    }

    public void setMainborrower(String mainborrower) {
        this.mainborrower = mainborrower == null ? null : mainborrower.trim();
    }

    public String getIdentifino() {
        return identifino;
    }

    public void setIdentifino(String identifino) {
        this.identifino = identifino == null ? null : identifino.trim();
    }

    public BigDecimal getExamount() {
        return examount;
    }

    public void setExamount(BigDecimal examount) {
        this.examount = examount;
    }

    public String getExage() {
        return exage;
    }

    public void setExage(String exage) {
        this.exage = exage == null ? null : exage.trim();
    }

    public BigDecimal getExinterestrate() {
        return exinterestrate;
    }

    public void setExinterestrate(BigDecimal exinterestrate) {
        this.exinterestrate = exinterestrate;
    }

    public String getRepaymethod() {
        return repaymethod;
    }

    public void setRepaymethod(String repaymethod) {
        this.repaymethod = repaymethod == null ? null : repaymethod.trim();
    }

    public String getExreason() {
        return exreason;
    }

    public void setExreason(String exreason) {
        this.exreason = exreason == null ? null : exreason.trim();
    }

    public String getNewworkid() {
        return newworkid;
    }

    public void setNewworkid(String newworkid) {
        this.newworkid = newworkid == null ? null : newworkid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
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
        Applyforex other = (Applyforex) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMainborrower() == null ? other.getMainborrower() == null : this.getMainborrower().equals(other.getMainborrower()))
            && (this.getIdentifino() == null ? other.getIdentifino() == null : this.getIdentifino().equals(other.getIdentifino()))
            && (this.getExamount() == null ? other.getExamount() == null : this.getExamount().equals(other.getExamount()))
            && (this.getExage() == null ? other.getExage() == null : this.getExage().equals(other.getExage()))
            && (this.getExinterestrate() == null ? other.getExinterestrate() == null : this.getExinterestrate().equals(other.getExinterestrate()))
            && (this.getRepaymethod() == null ? other.getRepaymethod() == null : this.getRepaymethod().equals(other.getRepaymethod()))
            && (this.getExreason() == null ? other.getExreason() == null : this.getExreason().equals(other.getExreason()))
            && (this.getNewworkid() == null ? other.getNewworkid() == null : this.getNewworkid().equals(other.getNewworkid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMainborrower() == null) ? 0 : getMainborrower().hashCode());
        result = prime * result + ((getIdentifino() == null) ? 0 : getIdentifino().hashCode());
        result = prime * result + ((getExamount() == null) ? 0 : getExamount().hashCode());
        result = prime * result + ((getExage() == null) ? 0 : getExage().hashCode());
        result = prime * result + ((getExinterestrate() == null) ? 0 : getExinterestrate().hashCode());
        result = prime * result + ((getRepaymethod() == null) ? 0 : getRepaymethod().hashCode());
        result = prime * result + ((getExreason() == null) ? 0 : getExreason().hashCode());
        result = prime * result + ((getNewworkid() == null) ? 0 : getNewworkid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        return result;
    }
}
