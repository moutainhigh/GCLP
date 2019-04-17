package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Phoneverification implements Serializable {
	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="婚姻情况是否有异常不能超出1位")
	@ApiModelProperty(value = "婚姻情况是否有异常", example = "", dataType="varchar(1)", required = true )
    private String marriageabnormal;

	@Length(max=2000,min=0,message="婚姻状况异常情况说明不能超出2000位")
	@ApiModelProperty(value = "婚姻状况异常情况说明", example = "", dataType="varchar(2000)", required = true )
    private String marriageabnormalins;

	@Length(max=1,min=0,message="征信情况是否有异常不能超出1位")
	@ApiModelProperty(value = "征信情况是否有异常", example = "", dataType="varchar(1)", required = true )
    private String creditabnormal;

	@Length(max=2000,min=0,message="征信情况异常情况说明不能超出2000位")
	@ApiModelProperty(value = "征信情况异常情况说明", example = "", dataType="varchar(2000)", required = true )
    private String creditabnormalins;

	@Length(max=1,min=0,message="诉讼情况是否有异常不能超出1位")
	@ApiModelProperty(value = "诉讼情况是否有异常", example = "", dataType="varchar(1)", required = true )
    private String litigationabnormal;

	@Length(max=2000,min=0,message="诉讼情况异常情况说明不能超出2000位")
	@ApiModelProperty(value = "诉讼情况异常情况说明", example = "", dataType="varchar(2000)", required = true )
    private String litigationabnormalins;

	@Length(max=40,min=0,message="借款用途不能超出40位")
	@ApiModelProperty(value = "借款用途", example = "", dataType="varchar(40)", required = true )
    private String borrowingpurposes;

	@Length(max=40,min=0,message="不能超出40位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(40)", required = true )
    private String repaymentsource;

	@Length(max=2000,min=0,message="电核其他事项说明不能超出2000位")
	@ApiModelProperty(value = "电核其他事项说明", example = "", dataType="varchar(2000)", required = true )
    private String othermappers;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="修改人不能超出10位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(10)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getMarriageabnormal() {
        return marriageabnormal;
    }

    public void setMarriageabnormal(String marriageabnormal) {
        this.marriageabnormal = marriageabnormal == null ? null : marriageabnormal.trim();
    }

    public String getMarriageabnormalins() {
        return marriageabnormalins;
    }

    public void setMarriageabnormalins(String marriageabnormalins) {
        this.marriageabnormalins = marriageabnormalins == null ? null : marriageabnormalins.trim();
    }

    public String getCreditabnormal() {
        return creditabnormal;
    }

    public void setCreditabnormal(String creditabnormal) {
        this.creditabnormal = creditabnormal == null ? null : creditabnormal.trim();
    }

    public String getCreditabnormalins() {
        return creditabnormalins;
    }

    public void setCreditabnormalins(String creditabnormalins) {
        this.creditabnormalins = creditabnormalins == null ? null : creditabnormalins.trim();
    }

    public String getLitigationabnormal() {
        return litigationabnormal;
    }

    public void setLitigationabnormal(String litigationabnormal) {
        this.litigationabnormal = litigationabnormal == null ? null : litigationabnormal.trim();
    }

    public String getLitigationabnormalins() {
        return litigationabnormalins;
    }

    public void setLitigationabnormalins(String litigationabnormalins) {
        this.litigationabnormalins = litigationabnormalins == null ? null : litigationabnormalins.trim();
    }

    public String getBorrowingpurposes() {
        return borrowingpurposes;
    }

    public void setBorrowingpurposes(String borrowingpurposes) {
        this.borrowingpurposes = borrowingpurposes == null ? null : borrowingpurposes.trim();
    }

    public String getRepaymentsource() {
        return repaymentsource;
    }

    public void setRepaymentsource(String repaymentsource) {
        this.repaymentsource = repaymentsource == null ? null : repaymentsource.trim();
    }

    public String getOthermappers() {
        return othermappers;
    }

    public void setOthermappers(String othermappers) {
        this.othermappers = othermappers == null ? null : othermappers.trim();
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
        Phoneverification other = (Phoneverification) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getMarriageabnormal() == null ? other.getMarriageabnormal() == null : this.getMarriageabnormal().equals(other.getMarriageabnormal()))
            && (this.getMarriageabnormalins() == null ? other.getMarriageabnormalins() == null : this.getMarriageabnormalins().equals(other.getMarriageabnormalins()))
            && (this.getCreditabnormal() == null ? other.getCreditabnormal() == null : this.getCreditabnormal().equals(other.getCreditabnormal()))
            && (this.getCreditabnormalins() == null ? other.getCreditabnormalins() == null : this.getCreditabnormalins().equals(other.getCreditabnormalins()))
            && (this.getLitigationabnormal() == null ? other.getLitigationabnormal() == null : this.getLitigationabnormal().equals(other.getLitigationabnormal()))
            && (this.getLitigationabnormalins() == null ? other.getLitigationabnormalins() == null : this.getLitigationabnormalins().equals(other.getLitigationabnormalins()))
            && (this.getBorrowingpurposes() == null ? other.getBorrowingpurposes() == null : this.getBorrowingpurposes().equals(other.getBorrowingpurposes()))
            && (this.getRepaymentsource() == null ? other.getRepaymentsource() == null : this.getRepaymentsource().equals(other.getRepaymentsource()))
            && (this.getOthermappers() == null ? other.getOthermappers() == null : this.getOthermappers().equals(other.getOthermappers()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getMarriageabnormal() == null) ? 0 : getMarriageabnormal().hashCode());
        result = prime * result + ((getMarriageabnormalins() == null) ? 0 : getMarriageabnormalins().hashCode());
        result = prime * result + ((getCreditabnormal() == null) ? 0 : getCreditabnormal().hashCode());
        result = prime * result + ((getCreditabnormalins() == null) ? 0 : getCreditabnormalins().hashCode());
        result = prime * result + ((getLitigationabnormal() == null) ? 0 : getLitigationabnormal().hashCode());
        result = prime * result + ((getLitigationabnormalins() == null) ? 0 : getLitigationabnormalins().hashCode());
        result = prime * result + ((getBorrowingpurposes() == null) ? 0 : getBorrowingpurposes().hashCode());
        result = prime * result + ((getRepaymentsource() == null) ? 0 : getRepaymentsource().hashCode());
        result = prime * result + ((getOthermappers() == null) ? 0 : getOthermappers().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
