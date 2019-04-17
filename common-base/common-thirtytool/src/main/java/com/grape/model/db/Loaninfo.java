package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Loaninfo implements Serializable {
	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=8,min=0,message="申请编号不能超出8位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(8)", required = true )
    private String workid;

	@Length(max=80,min=0,message="前一押机构不能超出80位")
	@ApiModelProperty(value = "前一押机构", example = "", dataType="varchar(80)", required = true )
    private String firstmortgageorg;

	@Length(max=80,min=0,message="前二押机构不能超出80位")
	@ApiModelProperty(value = "前二押机构", example = "", dataType="varchar(80)", required = true )
    private String secondmortgage;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getMortgageid() {
        return mortgageid;
    }

    public void setMortgageid(String mortgageid) {
        this.mortgageid = mortgageid == null ? null : mortgageid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getFirstmortgageorg() {
        return firstmortgageorg;
    }

    public void setFirstmortgageorg(String firstmortgageorg) {
        this.firstmortgageorg = firstmortgageorg == null ? null : firstmortgageorg.trim();
    }

    public String getSecondmortgage() {
        return secondmortgage;
    }

    public void setSecondmortgage(String secondmortgage) {
        this.secondmortgage = secondmortgage == null ? null : secondmortgage.trim();
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
        Loaninfo other = (Loaninfo) that;
        return (this.getMortgageid() == null ? other.getMortgageid() == null : this.getMortgageid().equals(other.getMortgageid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getFirstmortgageorg() == null ? other.getFirstmortgageorg() == null : this.getFirstmortgageorg().equals(other.getFirstmortgageorg()))
            && (this.getSecondmortgage() == null ? other.getSecondmortgage() == null : this.getSecondmortgage().equals(other.getSecondmortgage()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMortgageid() == null) ? 0 : getMortgageid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getFirstmortgageorg() == null) ? 0 : getFirstmortgageorg().hashCode());
        result = prime * result + ((getSecondmortgage() == null) ? 0 : getSecondmortgage().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
