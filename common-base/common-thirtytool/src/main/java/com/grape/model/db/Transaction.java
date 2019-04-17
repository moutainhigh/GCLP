package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//交易记录表
public class Transaction implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="交易账号不能超出19位")
	@ApiModelProperty(value = "交易账号", example = "", dataType="varchar(19)", required = true )
    private String accountno;

	@Length(max=2,min=0,message="结算类型不能超出2位")
	@ApiModelProperty(value = "结算类型", example = "", dataType="varchar(2)", required = true )
    private String balancetype;

	@Length(max=80,min=0,message="收款方不能超出80位")
	@ApiModelProperty(value = "收款方", example = "", dataType="varchar(80)", required = true )
    private String transname;

	@Length(max=19,min=0,message="收款账号不能超出19位")
	@ApiModelProperty(value = "收款账号", example = "", dataType="varchar(19)", required = true )
    private String transaccount;

	@Length(max=2,min=0,message="交易方式不能超出2位")
	@ApiModelProperty(value = "交易方式", example = "", dataType="varchar(2)", required = true )
    private String transway;

	@Length(max=17,min=0,message="交易金额不能超出17位")
	@ApiModelProperty(value = "交易金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal transamount;

	@ApiModelProperty(value = "交易时间", example = "", dataType="datetime", required = true )
    private Date transtime;

	@Length(max=300,min=0,message="不能超出300位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(300)", required = true )
    private String tradingnote;

	@Length(max=17,min=0,message="账户余额不能超出17位")
	@ApiModelProperty(value = "账户余额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal accountamount;

	@Length(max=80,min=0,message="操作人不能超出80位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(80)", required = true )
    private String dealman;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getBalancetype() {
        return balancetype;
    }

    public void setBalancetype(String balancetype) {
        this.balancetype = balancetype == null ? null : balancetype.trim();
    }

    public String getTransname() {
        return transname;
    }

    public void setTransname(String transname) {
        this.transname = transname == null ? null : transname.trim();
    }

    public String getTransaccount() {
        return transaccount;
    }

    public void setTransaccount(String transaccount) {
        this.transaccount = transaccount == null ? null : transaccount.trim();
    }

    public String getTransway() {
        return transway;
    }

    public void setTransway(String transway) {
        this.transway = transway == null ? null : transway.trim();
    }

    public BigDecimal getTransamount() {
        return transamount;
    }

    public void setTransamount(BigDecimal transamount) {
        this.transamount = transamount;
    }

    public Date getTranstime() {
        return transtime;
    }

    public void setTranstime(Date transtime) {
        this.transtime = transtime;
    }

    public String getTradingnote() {
        return tradingnote;
    }

    public void setTradingnote(String tradingnote) {
        this.tradingnote = tradingnote == null ? null : tradingnote.trim();
    }

    public BigDecimal getAccountamount() {
        return accountamount;
    }

    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
    }

    public String getDealman() {
        return dealman;
    }

    public void setDealman(String dealman) {
        this.dealman = dealman == null ? null : dealman.trim();
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
        Transaction other = (Transaction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountno() == null ? other.getAccountno() == null : this.getAccountno().equals(other.getAccountno()))
            && (this.getBalancetype() == null ? other.getBalancetype() == null : this.getBalancetype().equals(other.getBalancetype()))
            && (this.getTransname() == null ? other.getTransname() == null : this.getTransname().equals(other.getTransname()))
            && (this.getTransaccount() == null ? other.getTransaccount() == null : this.getTransaccount().equals(other.getTransaccount()))
            && (this.getTransway() == null ? other.getTransway() == null : this.getTransway().equals(other.getTransway()))
            && (this.getTransamount() == null ? other.getTransamount() == null : this.getTransamount().equals(other.getTransamount()))
            && (this.getTranstime() == null ? other.getTranstime() == null : this.getTranstime().equals(other.getTranstime()))
            && (this.getTradingnote() == null ? other.getTradingnote() == null : this.getTradingnote().equals(other.getTradingnote()))
            && (this.getAccountamount() == null ? other.getAccountamount() == null : this.getAccountamount().equals(other.getAccountamount()))
            && (this.getDealman() == null ? other.getDealman() == null : this.getDealman().equals(other.getDealman()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountno() == null) ? 0 : getAccountno().hashCode());
        result = prime * result + ((getBalancetype() == null) ? 0 : getBalancetype().hashCode());
        result = prime * result + ((getTransname() == null) ? 0 : getTransname().hashCode());
        result = prime * result + ((getTransaccount() == null) ? 0 : getTransaccount().hashCode());
        result = prime * result + ((getTransway() == null) ? 0 : getTransway().hashCode());
        result = prime * result + ((getTransamount() == null) ? 0 : getTransamount().hashCode());
        result = prime * result + ((getTranstime() == null) ? 0 : getTranstime().hashCode());
        result = prime * result + ((getTradingnote() == null) ? 0 : getTradingnote().hashCode());
        result = prime * result + ((getAccountamount() == null) ? 0 : getAccountamount().hashCode());
        result = prime * result + ((getDealman() == null) ? 0 : getDealman().hashCode());
        return result;
    }
}
