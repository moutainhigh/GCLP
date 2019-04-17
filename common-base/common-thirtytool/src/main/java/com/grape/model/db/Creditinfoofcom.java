package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//信用记录表（公司）
public class Creditinfoofcom implements Serializable {
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "企业信用报告日期", example = "", dataType="datetime", required = true )
    private Date comcreditdate;

	@Length(max=1,min=0,message="企业信用报告记录是否空白不能超出1位")
	@ApiModelProperty(value = "企业信用报告记录是否空白", example = "", dataType="char(1)", required = true )
    private String isblackofcredit;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public Date getComcreditdate() {
        return comcreditdate;
    }

    public void setComcreditdate(Date comcreditdate) {
        this.comcreditdate = comcreditdate;
    }

    public String getIsblackofcredit() {
        return isblackofcredit;
    }

    public void setIsblackofcredit(String isblackofcredit) {
        this.isblackofcredit = isblackofcredit == null ? null : isblackofcredit.trim();
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
        Creditinfoofcom other = (Creditinfoofcom) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getComcreditdate() == null ? other.getComcreditdate() == null : this.getComcreditdate().equals(other.getComcreditdate()))
            && (this.getIsblackofcredit() == null ? other.getIsblackofcredit() == null : this.getIsblackofcredit().equals(other.getIsblackofcredit()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getComcreditdate() == null) ? 0 : getComcreditdate().hashCode());
        result = prime * result + ((getIsblackofcredit() == null) ? 0 : getIsblackofcredit().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
