package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//赎楼方案
public class Redemptiontype implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="原贷款银行不能超出80位")
	@ApiModelProperty(value = "原贷款银行", example = "", dataType="varchar(80)", required = true )
    private String beloanbank;

	@Length(max=80,min=0,message="新贷款银行不能超出80位")
	@ApiModelProperty(value = "新贷款银行", example = "", dataType="varchar(80)", required = true )
    private String newloanbank;

	@Length(max=17,min=0,message="原贷款金额不能超出17位")
	@ApiModelProperty(value = "原贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal applyamount;

	@Length(max=17,min=0,message="新批复金额不能超出17位")
	@ApiModelProperty(value = "新批复金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal osumofamount;

	@Length(max=80,min=0,message="赎楼账户名不能超出80位")
	@ApiModelProperty(value = "赎楼账户名", example = "", dataType="varchar(80)", required = true )
    private String redemaccountname;

	@Length(max=80,min=0,message="回款账户名不能超出80位")
	@ApiModelProperty(value = "回款账户名", example = "", dataType="varchar(80)", required = true )
    private String orepayaccountname;

	@Length(max=19,min=0,message="赎楼账号不能超出19位")
	@ApiModelProperty(value = "赎楼账号", example = "", dataType="varchar(19)", required = true )
    private String redemaccount;

	@Length(max=19,min=0,message="回款账号不能超出19位")
	@ApiModelProperty(value = "回款账号", example = "", dataType="varchar(19)", required = true )
    private String orepayaccount;

	@Length(max=120,min=0,message="回款开户行不能超出120位")
	@ApiModelProperty(value = "回款开户行", example = "", dataType="varchar(120)", required = true )
    private String orepayaccountbnk;

	@Length(max=120,min=0,message="赎楼开户行不能超出120位")
	@ApiModelProperty(value = "赎楼开户行", example = "", dataType="varchar(120)", required = true )
    private String redemccountbnk;

	@Length(max=1,min=0,message="是否第三方回款不能超出1位")
	@ApiModelProperty(value = "是否第三方回款", example = "", dataType="varchar(1)", required = true )
    private String isthirdpartyrepay;

	@Length(max=1,min=0,message="是否第三方赎楼不能超出1位")
	@ApiModelProperty(value = "是否第三方赎楼", example = "", dataType="varchar(1)", required = true )
    private String isthirdpartyredem;

	@Length(max=600,min=0,message="赎楼方案情况说明不能超出600位")
	@ApiModelProperty(value = "赎楼方案情况说明", example = "", dataType="varchar(600)", required = true )
    private String redemdescription;

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

    public String getBeloanbank() {
        return beloanbank;
    }

    public void setBeloanbank(String beloanbank) {
        this.beloanbank = beloanbank == null ? null : beloanbank.trim();
    }

    public String getNewloanbank() {
        return newloanbank;
    }

    public void setNewloanbank(String newloanbank) {
        this.newloanbank = newloanbank == null ? null : newloanbank.trim();
    }

    public BigDecimal getApplyamount() {
        return applyamount;
    }

    public void setApplyamount(BigDecimal applyamount) {
        this.applyamount = applyamount;
    }

    public BigDecimal getOsumofamount() {
        return osumofamount;
    }

    public void setOsumofamount(BigDecimal osumofamount) {
        this.osumofamount = osumofamount;
    }

    public String getRedemaccountname() {
        return redemaccountname;
    }

    public void setRedemaccountname(String redemaccountname) {
        this.redemaccountname = redemaccountname == null ? null : redemaccountname.trim();
    }

    public String getOrepayaccountname() {
        return orepayaccountname;
    }

    public void setOrepayaccountname(String orepayaccountname) {
        this.orepayaccountname = orepayaccountname == null ? null : orepayaccountname.trim();
    }

    public String getRedemaccount() {
        return redemaccount;
    }

    public void setRedemaccount(String redemaccount) {
        this.redemaccount = redemaccount == null ? null : redemaccount.trim();
    }

    public String getOrepayaccount() {
        return orepayaccount;
    }

    public void setOrepayaccount(String orepayaccount) {
        this.orepayaccount = orepayaccount == null ? null : orepayaccount.trim();
    }

    public String getOrepayaccountbnk() {
        return orepayaccountbnk;
    }

    public void setOrepayaccountbnk(String orepayaccountbnk) {
        this.orepayaccountbnk = orepayaccountbnk == null ? null : orepayaccountbnk.trim();
    }

    public String getRedemccountbnk() {
        return redemccountbnk;
    }

    public void setRedemccountbnk(String redemccountbnk) {
        this.redemccountbnk = redemccountbnk == null ? null : redemccountbnk.trim();
    }

    public String getIsthirdpartyrepay() {
        return isthirdpartyrepay;
    }

    public void setIsthirdpartyrepay(String isthirdpartyrepay) {
        this.isthirdpartyrepay = isthirdpartyrepay == null ? null : isthirdpartyrepay.trim();
    }

    public String getIsthirdpartyredem() {
        return isthirdpartyredem;
    }

    public void setIsthirdpartyredem(String isthirdpartyredem) {
        this.isthirdpartyredem = isthirdpartyredem == null ? null : isthirdpartyredem.trim();
    }

    public String getRedemdescription() {
        return redemdescription;
    }

    public void setRedemdescription(String redemdescription) {
        this.redemdescription = redemdescription == null ? null : redemdescription.trim();
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
        Redemptiontype other = (Redemptiontype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getBeloanbank() == null ? other.getBeloanbank() == null : this.getBeloanbank().equals(other.getBeloanbank()))
            && (this.getNewloanbank() == null ? other.getNewloanbank() == null : this.getNewloanbank().equals(other.getNewloanbank()))
            && (this.getApplyamount() == null ? other.getApplyamount() == null : this.getApplyamount().equals(other.getApplyamount()))
            && (this.getOsumofamount() == null ? other.getOsumofamount() == null : this.getOsumofamount().equals(other.getOsumofamount()))
            && (this.getRedemaccountname() == null ? other.getRedemaccountname() == null : this.getRedemaccountname().equals(other.getRedemaccountname()))
            && (this.getOrepayaccountname() == null ? other.getOrepayaccountname() == null : this.getOrepayaccountname().equals(other.getOrepayaccountname()))
            && (this.getRedemaccount() == null ? other.getRedemaccount() == null : this.getRedemaccount().equals(other.getRedemaccount()))
            && (this.getOrepayaccount() == null ? other.getOrepayaccount() == null : this.getOrepayaccount().equals(other.getOrepayaccount()))
            && (this.getOrepayaccountbnk() == null ? other.getOrepayaccountbnk() == null : this.getOrepayaccountbnk().equals(other.getOrepayaccountbnk()))
            && (this.getRedemccountbnk() == null ? other.getRedemccountbnk() == null : this.getRedemccountbnk().equals(other.getRedemccountbnk()))
            && (this.getIsthirdpartyrepay() == null ? other.getIsthirdpartyrepay() == null : this.getIsthirdpartyrepay().equals(other.getIsthirdpartyrepay()))
            && (this.getIsthirdpartyredem() == null ? other.getIsthirdpartyredem() == null : this.getIsthirdpartyredem().equals(other.getIsthirdpartyredem()))
            && (this.getRedemdescription() == null ? other.getRedemdescription() == null : this.getRedemdescription().equals(other.getRedemdescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getBeloanbank() == null) ? 0 : getBeloanbank().hashCode());
        result = prime * result + ((getNewloanbank() == null) ? 0 : getNewloanbank().hashCode());
        result = prime * result + ((getApplyamount() == null) ? 0 : getApplyamount().hashCode());
        result = prime * result + ((getOsumofamount() == null) ? 0 : getOsumofamount().hashCode());
        result = prime * result + ((getRedemaccountname() == null) ? 0 : getRedemaccountname().hashCode());
        result = prime * result + ((getOrepayaccountname() == null) ? 0 : getOrepayaccountname().hashCode());
        result = prime * result + ((getRedemaccount() == null) ? 0 : getRedemaccount().hashCode());
        result = prime * result + ((getOrepayaccount() == null) ? 0 : getOrepayaccount().hashCode());
        result = prime * result + ((getOrepayaccountbnk() == null) ? 0 : getOrepayaccountbnk().hashCode());
        result = prime * result + ((getRedemccountbnk() == null) ? 0 : getRedemccountbnk().hashCode());
        result = prime * result + ((getIsthirdpartyrepay() == null) ? 0 : getIsthirdpartyrepay().hashCode());
        result = prime * result + ((getIsthirdpartyredem() == null) ? 0 : getIsthirdpartyredem().hashCode());
        result = prime * result + ((getRedemdescription() == null) ? 0 : getRedemdescription().hashCode());
        return result;
    }
}
