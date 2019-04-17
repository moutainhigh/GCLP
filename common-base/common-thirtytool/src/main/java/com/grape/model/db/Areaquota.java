package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//区域额度表
public class Areaquota implements Serializable {
	@Length(max=19,min=0,message="贷款账号不能超出19位")
	@ApiModelProperty(value = "贷款账号", example = "", dataType="varchar(19)", required = true )
    private String accountno;

	@Length(max=19,min=0,message="区域id不能超出19位")
	@ApiModelProperty(value = "区域id", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@ApiModelProperty(value = "总额度", example = "", dataType="double", required = true )
    private Double totalquota;

	@ApiModelProperty(value = "已用额度", example = "", dataType="double", required = true )
    private Double usedquota;

	@ApiModelProperty(value = "可用额度", example = "", dataType="double", required = true )
    private Double remainingquota;

    private static final long serialVersionUID = 1L;

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public Double getTotalquota() {
        return totalquota;
    }

    public void setTotalquota(Double totalquota) {
        this.totalquota = totalquota;
    }

    public Double getUsedquota() {
        return usedquota;
    }

    public void setUsedquota(Double usedquota) {
        this.usedquota = usedquota;
    }

    public Double getRemainingquota() {
        return remainingquota;
    }

    public void setRemainingquota(Double remainingquota) {
        this.remainingquota = remainingquota;
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
        Areaquota other = (Areaquota) that;
        return (this.getAccountno() == null ? other.getAccountno() == null : this.getAccountno().equals(other.getAccountno()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getTotalquota() == null ? other.getTotalquota() == null : this.getTotalquota().equals(other.getTotalquota()))
            && (this.getUsedquota() == null ? other.getUsedquota() == null : this.getUsedquota().equals(other.getUsedquota()))
            && (this.getRemainingquota() == null ? other.getRemainingquota() == null : this.getRemainingquota().equals(other.getRemainingquota()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountno() == null) ? 0 : getAccountno().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getTotalquota() == null) ? 0 : getTotalquota().hashCode());
        result = prime * result + ((getUsedquota() == null) ? 0 : getUsedquota().hashCode());
        result = prime * result + ((getRemainingquota() == null) ? 0 : getRemainingquota().hashCode());
        return result;
    }
}
