package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Shareman implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=19,min=0,message="身份证号码不能超出19位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(19)", required = true )
    private String cerdid;

	@Length(max=4,min=0,message="股东类别不能超出4位")
	@ApiModelProperty(value = "股东类别", example = "", dataType="varchar(4)", required = true )
    private String sharetype;

	@Length(max=80,min=0,message="股东名称不能超出80位")
	@ApiModelProperty(value = "股东名称", example = "", dataType="varchar(80)", required = true )
    private String sharename;

	@Length(max=4,min=0,message="股东国籍不能超出4位")
	@ApiModelProperty(value = "股东国籍", example = "", dataType="varchar(4)", required = true )
    private String country;

	@Length(max=4,min=0,message="年龄不能超出4位")
	@ApiModelProperty(value = "年龄", example = "", dataType="varchar(4)", required = true )
    private String age;

	@Length(max=17,min=0,message="出资额不能超出17位")
	@ApiModelProperty(value = "出资额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal amount;

	@Length(max=8,min=0,message="出资比例不能超出8位")
	@ApiModelProperty(value = "出资比例", example = "", dataType="decimal(8,5)", required = true )
    private BigDecimal investmentrate;

	@Length(max=300,min=0,message="备注不能超出300位")
	@ApiModelProperty(value = "备注", example = "", dataType="varchar(300)", required = true )
    private String remark;

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

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getSharetype() {
        return sharetype;
    }

    public void setSharetype(String sharetype) {
        this.sharetype = sharetype == null ? null : sharetype.trim();
    }

    public String getSharename() {
        return sharename;
    }

    public void setSharename(String sharename) {
        this.sharename = sharename == null ? null : sharename.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getInvestmentrate() {
        return investmentrate;
    }

    public void setInvestmentrate(BigDecimal investmentrate) {
        this.investmentrate = investmentrate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        Shareman other = (Shareman) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getSharetype() == null ? other.getSharetype() == null : this.getSharetype().equals(other.getSharetype()))
            && (this.getSharename() == null ? other.getSharename() == null : this.getSharename().equals(other.getSharename()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getInvestmentrate() == null ? other.getInvestmentrate() == null : this.getInvestmentrate().equals(other.getInvestmentrate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getSharetype() == null) ? 0 : getSharetype().hashCode());
        result = prime * result + ((getSharename() == null) ? 0 : getSharename().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getInvestmentrate() == null) ? 0 : getInvestmentrate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
