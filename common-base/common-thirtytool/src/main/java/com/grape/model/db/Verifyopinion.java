package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Verifyopinion implements Serializable {
	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=255,min=0,message="电话核实意见不能超出255位")
	@ApiModelProperty(value = "电话核实意见", example = "", dataType="varchar(255)", required = true )
    private String phoneopinion;

	@Length(max=255,min=0,message="抵押物核实意见不能超出255位")
	@ApiModelProperty(value = "抵押物核实意见", example = "", dataType="varchar(255)", required = true )
    private String mortgageopinion;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="x修改人不能超出10位")
	@ApiModelProperty(value = "x修改人", example = "", dataType="varchar(10)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getPhoneopinion() {
        return phoneopinion;
    }

    public void setPhoneopinion(String phoneopinion) {
        this.phoneopinion = phoneopinion == null ? null : phoneopinion.trim();
    }

    public String getMortgageopinion() {
        return mortgageopinion;
    }

    public void setMortgageopinion(String mortgageopinion) {
        this.mortgageopinion = mortgageopinion == null ? null : mortgageopinion.trim();
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
        Verifyopinion other = (Verifyopinion) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getPhoneopinion() == null ? other.getPhoneopinion() == null : this.getPhoneopinion().equals(other.getPhoneopinion()))
            && (this.getMortgageopinion() == null ? other.getMortgageopinion() == null : this.getMortgageopinion().equals(other.getMortgageopinion()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getPhoneopinion() == null) ? 0 : getPhoneopinion().hashCode());
        result = prime * result + ((getMortgageopinion() == null) ? 0 : getMortgageopinion().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
