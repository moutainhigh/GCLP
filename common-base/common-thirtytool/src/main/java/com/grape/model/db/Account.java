package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Account implements Serializable {
	@Length(max=19,min=0,message="账户号码不能超出19位")
	@ApiModelProperty(value = "账户号码", example = "", dataType="varchar(19)", required = true )
    private String accountno;

	@Length(max=19,min=0,message="额度编号不能超出19位")
	@ApiModelProperty(value = "额度编号", example = "", dataType="varchar(19)", required = true )
    private String linenumber;

	@Length(max=80,min=0,message="账户名称不能超出80位")
	@ApiModelProperty(value = "账户名称", example = "", dataType="varchar(80)", required = true )
    private String accountname;

	@Length(max=80,min=0,message="账户所属机构不能超出80位")
	@ApiModelProperty(value = "账户所属机构", example = "", dataType="varchar(80)", required = true )
    private String accountbakno;

	@Length(max=5,min=0,message="账户开户银行不能超出5位")
	@ApiModelProperty(value = "账户开户银行", example = "", dataType="varchar(5)", required = true )
    private String accountorg;

	@Length(max=2,min=0,message="账户类型不能超出2位")
	@ApiModelProperty(value = "账户类型", example = "", dataType="varchar(2)", required = true )
    private String accounttype;

	@Length(max=17,min=0,message="账户金额不能超出17位")
	@ApiModelProperty(value = "账户金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal accountremian;

	@Length(max=17,min=0,message="冻结保证金金额不能超出17位")
	@ApiModelProperty(value = "冻结保证金金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal freezeamount;

	@Length(max=17,min=0,message="保证金余额不能超出17位")
	@ApiModelProperty(value = "保证金余额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal marginbalance;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(String linenumber) {
        this.linenumber = linenumber == null ? null : linenumber.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getAccountbakno() {
        return accountbakno;
    }

    public void setAccountbakno(String accountbakno) {
        this.accountbakno = accountbakno == null ? null : accountbakno.trim();
    }

    public String getAccountorg() {
        return accountorg;
    }

    public void setAccountorg(String accountorg) {
        this.accountorg = accountorg == null ? null : accountorg.trim();
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    public BigDecimal getAccountremian() {
        return accountremian;
    }

    public void setAccountremian(BigDecimal accountremian) {
        this.accountremian = accountremian;
    }

    public BigDecimal getFreezeamount() {
        return freezeamount;
    }

    public void setFreezeamount(BigDecimal freezeamount) {
        this.freezeamount = freezeamount;
    }

    public BigDecimal getMarginbalance() {
        return marginbalance;
    }

    public void setMarginbalance(BigDecimal marginbalance) {
        this.marginbalance = marginbalance;
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
        Account other = (Account) that;
        return (this.getAccountno() == null ? other.getAccountno() == null : this.getAccountno().equals(other.getAccountno()))
            && (this.getLinenumber() == null ? other.getLinenumber() == null : this.getLinenumber().equals(other.getLinenumber()))
            && (this.getAccountname() == null ? other.getAccountname() == null : this.getAccountname().equals(other.getAccountname()))
            && (this.getAccountbakno() == null ? other.getAccountbakno() == null : this.getAccountbakno().equals(other.getAccountbakno()))
            && (this.getAccountorg() == null ? other.getAccountorg() == null : this.getAccountorg().equals(other.getAccountorg()))
            && (this.getAccounttype() == null ? other.getAccounttype() == null : this.getAccounttype().equals(other.getAccounttype()))
            && (this.getAccountremian() == null ? other.getAccountremian() == null : this.getAccountremian().equals(other.getAccountremian()))
            && (this.getFreezeamount() == null ? other.getFreezeamount() == null : this.getFreezeamount().equals(other.getFreezeamount()))
            && (this.getMarginbalance() == null ? other.getMarginbalance() == null : this.getMarginbalance().equals(other.getMarginbalance()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountno() == null) ? 0 : getAccountno().hashCode());
        result = prime * result + ((getLinenumber() == null) ? 0 : getLinenumber().hashCode());
        result = prime * result + ((getAccountname() == null) ? 0 : getAccountname().hashCode());
        result = prime * result + ((getAccountbakno() == null) ? 0 : getAccountbakno().hashCode());
        result = prime * result + ((getAccountorg() == null) ? 0 : getAccountorg().hashCode());
        result = prime * result + ((getAccounttype() == null) ? 0 : getAccounttype().hashCode());
        result = prime * result + ((getAccountremian() == null) ? 0 : getAccountremian().hashCode());
        result = prime * result + ((getFreezeamount() == null) ? 0 : getFreezeamount().hashCode());
        result = prime * result + ((getMarginbalance() == null) ? 0 : getMarginbalance().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
