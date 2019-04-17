package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Bnkaccount implements Serializable {
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="打划款账户名不能超出80位")
	@ApiModelProperty(value = "打划款账户名", example = "", dataType="varchar(80)", required = true )
    private String accountname;

	@Length(max=19,min=0,message="打划款账户不能超出19位")
	@ApiModelProperty(value = "打划款账户", example = "", dataType="varchar(19)", required = true )
    private String account;

	@Length(max=80,min=0,message="打划款开户行不能超出80位")
	@ApiModelProperty(value = "打划款开户行", example = "", dataType="varchar(80)", required = true )
    private String bnk;

	@Length(max=120,min=0,message="还款开户行不能超出120位")
	@ApiModelProperty(value = "还款开户行", example = "", dataType="varchar(120)", required = true )
    private String repayaccountbnk;

	@Length(max=80,min=0,message="还款账户名不能超出80位")
	@ApiModelProperty(value = "还款账户名", example = "", dataType="varchar(80)", required = true )
    private String repayaccountname;

	@Length(max=19,min=0,message="还款账号不能超出19位")
	@ApiModelProperty(value = "还款账号", example = "", dataType="varchar(19)", required = true )
    private String repayaccount;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getBnk() {
        return bnk;
    }

    public void setBnk(String bnk) {
        this.bnk = bnk == null ? null : bnk.trim();
    }

    public String getRepayaccountbnk() {
        return repayaccountbnk;
    }

    public void setRepayaccountbnk(String repayaccountbnk) {
        this.repayaccountbnk = repayaccountbnk == null ? null : repayaccountbnk.trim();
    }

    public String getRepayaccountname() {
        return repayaccountname;
    }

    public void setRepayaccountname(String repayaccountname) {
        this.repayaccountname = repayaccountname == null ? null : repayaccountname.trim();
    }

    public String getRepayaccount() {
        return repayaccount;
    }

    public void setRepayaccount(String repayaccount) {
        this.repayaccount = repayaccount == null ? null : repayaccount.trim();
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
        Bnkaccount other = (Bnkaccount) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getAccountname() == null ? other.getAccountname() == null : this.getAccountname().equals(other.getAccountname()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getBnk() == null ? other.getBnk() == null : this.getBnk().equals(other.getBnk()))
            && (this.getRepayaccountbnk() == null ? other.getRepayaccountbnk() == null : this.getRepayaccountbnk().equals(other.getRepayaccountbnk()))
            && (this.getRepayaccountname() == null ? other.getRepayaccountname() == null : this.getRepayaccountname().equals(other.getRepayaccountname()))
            && (this.getRepayaccount() == null ? other.getRepayaccount() == null : this.getRepayaccount().equals(other.getRepayaccount()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getAccountname() == null) ? 0 : getAccountname().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getBnk() == null) ? 0 : getBnk().hashCode());
        result = prime * result + ((getRepayaccountbnk() == null) ? 0 : getRepayaccountbnk().hashCode());
        result = prime * result + ((getRepayaccountname() == null) ? 0 : getRepayaccountname().hashCode());
        result = prime * result + ((getRepayaccount() == null) ? 0 : getRepayaccount().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
