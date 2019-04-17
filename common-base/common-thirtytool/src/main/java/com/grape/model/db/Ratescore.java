package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//利率评分表
public class Ratescore implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=4,min=0,message="开始利率评分分数不能超出4位")
	@ApiModelProperty(value = "开始利率评分分数", example = "", dataType="varchar(4)", required = true )
    private String startrategrade;

	@Length(max=4,min=0,message="结束利率评分分数不能超出4位")
	@ApiModelProperty(value = "结束利率评分分数", example = "", dataType="varchar(4)", required = true )
    private String endrategrade;

	@Length(max=9,min=0,message="利率不能超出9位")
	@ApiModelProperty(value = "利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal rate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStartrategrade() {
        return startrategrade;
    }

    public void setStartrategrade(String startrategrade) {
        this.startrategrade = startrategrade == null ? null : startrategrade.trim();
    }

    public String getEndrategrade() {
        return endrategrade;
    }

    public void setEndrategrade(String endrategrade) {
        this.endrategrade = endrategrade == null ? null : endrategrade.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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
        Ratescore other = (Ratescore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStartrategrade() == null ? other.getStartrategrade() == null : this.getStartrategrade().equals(other.getStartrategrade()))
            && (this.getEndrategrade() == null ? other.getEndrategrade() == null : this.getEndrategrade().equals(other.getEndrategrade()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStartrategrade() == null) ? 0 : getStartrategrade().hashCode());
        result = prime * result + ((getEndrategrade() == null) ? 0 : getEndrategrade().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        return result;
    }
}
