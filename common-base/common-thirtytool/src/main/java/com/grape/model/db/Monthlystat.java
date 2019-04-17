package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//
public class Monthlystat implements Serializable {
	@Length(max=6,min=0,message="月份不能超出6位")
	@ApiModelProperty(value = "月份", example = "", dataType="varchar(6)", required = true )
    private String monthnum;

	@Length(max=6,min=0,message="渠道方编号不能超出6位")
	@ApiModelProperty(value = "渠道方编号", example = "", dataType="varchar(6)", required = true )
    private String channelno;

	@Length(max=6,min=0,message="资金方编号不能超出6位")
	@ApiModelProperty(value = "资金方编号", example = "", dataType="varchar(6)", required = true )
    private String fundno;

	@Length(max=6,min=0,message="通道方编号不能超出6位")
	@ApiModelProperty(value = "通道方编号", example = "", dataType="varchar(6)", required = true )
    private String aisleno;

	@Length(max=4,min=0,message="逾期率不能超出4位")
	@ApiModelProperty(value = "逾期率", example = "", dataType="decimal(4,2)", required = true )
    private BigDecimal overdueprob;

	@Length(max=11,min=0,message="在途流水数不能超出11位")
	@ApiModelProperty(value = "在途流水数", example = "", dataType="int(11)", required = true )
    private Integer onpassagenum;

	@Length(max=11,min=0,message="逾期流水数不能超出11位")
	@ApiModelProperty(value = "逾期流水数", example = "", dataType="int(11)", required = true )
    private Integer overduenum;

    private static final long serialVersionUID = 1L;

    public String getMonthnum() {
        return monthnum;
    }

    public void setMonthnum(String monthnum) {
        this.monthnum = monthnum == null ? null : monthnum.trim();
    }

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno == null ? null : channelno.trim();
    }

    public String getFundno() {
        return fundno;
    }

    public void setFundno(String fundno) {
        this.fundno = fundno == null ? null : fundno.trim();
    }

    public String getAisleno() {
        return aisleno;
    }

    public void setAisleno(String aisleno) {
        this.aisleno = aisleno == null ? null : aisleno.trim();
    }

    public BigDecimal getOverdueprob() {
        return overdueprob;
    }

    public void setOverdueprob(BigDecimal overdueprob) {
        this.overdueprob = overdueprob;
    }

    public Integer getOnpassagenum() {
        return onpassagenum;
    }

    public void setOnpassagenum(Integer onpassagenum) {
        this.onpassagenum = onpassagenum;
    }

    public Integer getOverduenum() {
        return overduenum;
    }

    public void setOverduenum(Integer overduenum) {
        this.overduenum = overduenum;
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
        Monthlystat other = (Monthlystat) that;
        return (this.getMonthnum() == null ? other.getMonthnum() == null : this.getMonthnum().equals(other.getMonthnum()))
            && (this.getChannelno() == null ? other.getChannelno() == null : this.getChannelno().equals(other.getChannelno()))
            && (this.getFundno() == null ? other.getFundno() == null : this.getFundno().equals(other.getFundno()))
            && (this.getAisleno() == null ? other.getAisleno() == null : this.getAisleno().equals(other.getAisleno()))
            && (this.getOverdueprob() == null ? other.getOverdueprob() == null : this.getOverdueprob().equals(other.getOverdueprob()))
            && (this.getOnpassagenum() == null ? other.getOnpassagenum() == null : this.getOnpassagenum().equals(other.getOnpassagenum()))
            && (this.getOverduenum() == null ? other.getOverduenum() == null : this.getOverduenum().equals(other.getOverduenum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonthnum() == null) ? 0 : getMonthnum().hashCode());
        result = prime * result + ((getChannelno() == null) ? 0 : getChannelno().hashCode());
        result = prime * result + ((getFundno() == null) ? 0 : getFundno().hashCode());
        result = prime * result + ((getAisleno() == null) ? 0 : getAisleno().hashCode());
        result = prime * result + ((getOverdueprob() == null) ? 0 : getOverdueprob().hashCode());
        result = prime * result + ((getOnpassagenum() == null) ? 0 : getOnpassagenum().hashCode());
        result = prime * result + ((getOverduenum() == null) ? 0 : getOverduenum().hashCode());
        return result;
    }
}
