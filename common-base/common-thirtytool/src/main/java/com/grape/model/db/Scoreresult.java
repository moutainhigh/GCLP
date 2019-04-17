package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//评分结果表
public class Scoreresult implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=7,min=0,message="不能超出7位")
	@ApiModelProperty(value = "", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal custgrade;

	@Length(max=7,min=0,message="不能超出7位")
	@ApiModelProperty(value = "", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal pledgegrade;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String creditid;

	@Length(max=7,min=0,message="不能超出7位")
	@ApiModelProperty(value = "", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal rategrade;

	@Length(max=9,min=0,message="不能超出9位")
	@ApiModelProperty(value = "", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagerate;

	@Length(max=9,min=0,message="不能超出9位")
	@ApiModelProperty(value = "", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal rate;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=9,min=0,message="不能超出9位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(9)", required = true )
    private String type;

	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String pledgeid;

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

    public BigDecimal getCustgrade() {
        return custgrade;
    }

    public void setCustgrade(BigDecimal custgrade) {
        this.custgrade = custgrade;
    }

    public BigDecimal getPledgegrade() {
        return pledgegrade;
    }

    public void setPledgegrade(BigDecimal pledgegrade) {
        this.pledgegrade = pledgegrade;
    }

    public String getCreditid() {
        return creditid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid == null ? null : creditid.trim();
    }

    public BigDecimal getRategrade() {
        return rategrade;
    }

    public void setRategrade(BigDecimal rategrade) {
        this.rategrade = rategrade;
    }

    public BigDecimal getMortgagerate() {
        return mortgagerate;
    }

    public void setMortgagerate(BigDecimal mortgagerate) {
        this.mortgagerate = mortgagerate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public Date getChgdt() {
        return chgdt;
    }

    public void setChgdt(Date chgdt) {
        this.chgdt = chgdt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPledgeid() {
        return pledgeid;
    }

    public void setPledgeid(String pledgeid) {
        this.pledgeid = pledgeid == null ? null : pledgeid.trim();
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
        Scoreresult other = (Scoreresult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCustgrade() == null ? other.getCustgrade() == null : this.getCustgrade().equals(other.getCustgrade()))
            && (this.getPledgegrade() == null ? other.getPledgegrade() == null : this.getPledgegrade().equals(other.getPledgegrade()))
            && (this.getCreditid() == null ? other.getCreditid() == null : this.getCreditid().equals(other.getCreditid()))
            && (this.getRategrade() == null ? other.getRategrade() == null : this.getRategrade().equals(other.getRategrade()))
            && (this.getMortgagerate() == null ? other.getMortgagerate() == null : this.getMortgagerate().equals(other.getMortgagerate()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPledgeid() == null ? other.getPledgeid() == null : this.getPledgeid().equals(other.getPledgeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCustgrade() == null) ? 0 : getCustgrade().hashCode());
        result = prime * result + ((getPledgegrade() == null) ? 0 : getPledgegrade().hashCode());
        result = prime * result + ((getCreditid() == null) ? 0 : getCreditid().hashCode());
        result = prime * result + ((getRategrade() == null) ? 0 : getRategrade().hashCode());
        result = prime * result + ((getMortgagerate() == null) ? 0 : getMortgagerate().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPledgeid() == null) ? 0 : getPledgeid().hashCode());
        return result;
    }
}
