package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//还款计划主表
public class Repayplanmain implements Serializable {
	@Length(max=19,min=0,message="主键不能超出19位")
	@ApiModelProperty(value = "主键", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=30,min=0,message="客户名称不能超出30位")
	@ApiModelProperty(value = "客户名称", example = "", dataType="varchar(30)", required = true )
    private String custname;

	@Length(max=17,min=0,message="总授信额度不能超出17位")
	@ApiModelProperty(value = "总授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalcreditline;

	@Length(max=11,min=0,message="总授信期限不能超出11位")
	@ApiModelProperty(value = "总授信期限", example = "", dataType="int(11)", required = true )
    private Integer generalcreditperiod;

	@Length(max=17,min=0,message="借款本金不能超出17位")
	@ApiModelProperty(value = "借款本金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal loanprincipal;

	@Length(max=30,min=0,message="借款成数不能超出30位")
	@ApiModelProperty(value = "借款成数", example = "", dataType="varchar(30)", required = true )
    private String borrowinginto;

	@Length(max=11,min=0,message="借款期数不能超出11位")
	@ApiModelProperty(value = "借款期数", example = "", dataType="int(11)", required = true )
    private Integer loanperiods;

	@Length(max=9,min=0,message="借款利率不能超出9位")
	@ApiModelProperty(value = "借款利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal borrowingrates;

	@Length(max=50,min=0,message="还款银行不能超出50位")
	@ApiModelProperty(value = "还款银行", example = "", dataType="varchar(50)", required = true )
    private String reimbursementbank;

	@Length(max=50,min=0,message="还款户名不能超出50位")
	@ApiModelProperty(value = "还款户名", example = "", dataType="varchar(50)", required = true )
    private String repaymentname;

	@Length(max=30,min=0,message="还款账号不能超出30位")
	@ApiModelProperty(value = "还款账号", example = "", dataType="varchar(30)", required = true )
    private String repaymentaccount;

	@Length(max=20,min=0,message="还款方式不能超出20位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(20)", required = true )
    private String reimbursementmeans;

	@Length(max=300,min=0,message="还款备注不能超出300位")
	@ApiModelProperty(value = "还款备注", example = "", dataType="varchar(300)", required = true )
    private String reimbursementnote;

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

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public BigDecimal getTotalcreditline() {
        return totalcreditline;
    }

    public void setTotalcreditline(BigDecimal totalcreditline) {
        this.totalcreditline = totalcreditline;
    }

    public Integer getGeneralcreditperiod() {
        return generalcreditperiod;
    }

    public void setGeneralcreditperiod(Integer generalcreditperiod) {
        this.generalcreditperiod = generalcreditperiod;
    }

    public BigDecimal getLoanprincipal() {
        return loanprincipal;
    }

    public void setLoanprincipal(BigDecimal loanprincipal) {
        this.loanprincipal = loanprincipal;
    }

    public String getBorrowinginto() {
        return borrowinginto;
    }

    public void setBorrowinginto(String borrowinginto) {
        this.borrowinginto = borrowinginto == null ? null : borrowinginto.trim();
    }

    public Integer getLoanperiods() {
        return loanperiods;
    }

    public void setLoanperiods(Integer loanperiods) {
        this.loanperiods = loanperiods;
    }

    public BigDecimal getBorrowingrates() {
        return borrowingrates;
    }

    public void setBorrowingrates(BigDecimal borrowingrates) {
        this.borrowingrates = borrowingrates;
    }

    public String getReimbursementbank() {
        return reimbursementbank;
    }

    public void setReimbursementbank(String reimbursementbank) {
        this.reimbursementbank = reimbursementbank == null ? null : reimbursementbank.trim();
    }

    public String getRepaymentname() {
        return repaymentname;
    }

    public void setRepaymentname(String repaymentname) {
        this.repaymentname = repaymentname == null ? null : repaymentname.trim();
    }

    public String getRepaymentaccount() {
        return repaymentaccount;
    }

    public void setRepaymentaccount(String repaymentaccount) {
        this.repaymentaccount = repaymentaccount == null ? null : repaymentaccount.trim();
    }

    public String getReimbursementmeans() {
        return reimbursementmeans;
    }

    public void setReimbursementmeans(String reimbursementmeans) {
        this.reimbursementmeans = reimbursementmeans == null ? null : reimbursementmeans.trim();
    }

    public String getReimbursementnote() {
        return reimbursementnote;
    }

    public void setReimbursementnote(String reimbursementnote) {
        this.reimbursementnote = reimbursementnote == null ? null : reimbursementnote.trim();
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
        Repayplanmain other = (Repayplanmain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCustname() == null ? other.getCustname() == null : this.getCustname().equals(other.getCustname()))
            && (this.getTotalcreditline() == null ? other.getTotalcreditline() == null : this.getTotalcreditline().equals(other.getTotalcreditline()))
            && (this.getGeneralcreditperiod() == null ? other.getGeneralcreditperiod() == null : this.getGeneralcreditperiod().equals(other.getGeneralcreditperiod()))
            && (this.getLoanprincipal() == null ? other.getLoanprincipal() == null : this.getLoanprincipal().equals(other.getLoanprincipal()))
            && (this.getBorrowinginto() == null ? other.getBorrowinginto() == null : this.getBorrowinginto().equals(other.getBorrowinginto()))
            && (this.getLoanperiods() == null ? other.getLoanperiods() == null : this.getLoanperiods().equals(other.getLoanperiods()))
            && (this.getBorrowingrates() == null ? other.getBorrowingrates() == null : this.getBorrowingrates().equals(other.getBorrowingrates()))
            && (this.getReimbursementbank() == null ? other.getReimbursementbank() == null : this.getReimbursementbank().equals(other.getReimbursementbank()))
            && (this.getRepaymentname() == null ? other.getRepaymentname() == null : this.getRepaymentname().equals(other.getRepaymentname()))
            && (this.getRepaymentaccount() == null ? other.getRepaymentaccount() == null : this.getRepaymentaccount().equals(other.getRepaymentaccount()))
            && (this.getReimbursementmeans() == null ? other.getReimbursementmeans() == null : this.getReimbursementmeans().equals(other.getReimbursementmeans()))
            && (this.getReimbursementnote() == null ? other.getReimbursementnote() == null : this.getReimbursementnote().equals(other.getReimbursementnote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCustname() == null) ? 0 : getCustname().hashCode());
        result = prime * result + ((getTotalcreditline() == null) ? 0 : getTotalcreditline().hashCode());
        result = prime * result + ((getGeneralcreditperiod() == null) ? 0 : getGeneralcreditperiod().hashCode());
        result = prime * result + ((getLoanprincipal() == null) ? 0 : getLoanprincipal().hashCode());
        result = prime * result + ((getBorrowinginto() == null) ? 0 : getBorrowinginto().hashCode());
        result = prime * result + ((getLoanperiods() == null) ? 0 : getLoanperiods().hashCode());
        result = prime * result + ((getBorrowingrates() == null) ? 0 : getBorrowingrates().hashCode());
        result = prime * result + ((getReimbursementbank() == null) ? 0 : getReimbursementbank().hashCode());
        result = prime * result + ((getRepaymentname() == null) ? 0 : getRepaymentname().hashCode());
        result = prime * result + ((getRepaymentaccount() == null) ? 0 : getRepaymentaccount().hashCode());
        result = prime * result + ((getReimbursementmeans() == null) ? 0 : getReimbursementmeans().hashCode());
        result = prime * result + ((getReimbursementnote() == null) ? 0 : getReimbursementnote().hashCode());
        return result;
    }
}
