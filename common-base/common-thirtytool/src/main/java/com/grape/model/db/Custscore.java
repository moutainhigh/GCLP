package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//客户评分表
public class Custscore implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=7,min=0,message="开始客户评分分数不能超出7位")
	@ApiModelProperty(value = "开始客户评分分数", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal startcustgrade;

	@Length(max=7,min=0,message="结束客户评分分数不能超出7位")
	@ApiModelProperty(value = "结束客户评分分数", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal endcustgrade;

	@Length(max=7,min=0,message="开始抵押物评分分数不能超出7位")
	@ApiModelProperty(value = "开始抵押物评分分数", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal startmortgrade;

	@Length(max=7,min=0,message="结束抵押物评分分数不能超出7位")
	@ApiModelProperty(value = "结束抵押物评分分数", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal endmortgrade;

	@Length(max=1,min=0,message="客户评分等级不能超出1位")
	@ApiModelProperty(value = "客户评分等级", example = "", dataType="char(1)", required = true )
    private String custleavel;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getStartcustgrade() {
        return startcustgrade;
    }

    public void setStartcustgrade(BigDecimal startcustgrade) {
        this.startcustgrade = startcustgrade;
    }

    public BigDecimal getEndcustgrade() {
        return endcustgrade;
    }

    public void setEndcustgrade(BigDecimal endcustgrade) {
        this.endcustgrade = endcustgrade;
    }

    public BigDecimal getStartmortgrade() {
        return startmortgrade;
    }

    public void setStartmortgrade(BigDecimal startmortgrade) {
        this.startmortgrade = startmortgrade;
    }

    public BigDecimal getEndmortgrade() {
        return endmortgrade;
    }

    public void setEndmortgrade(BigDecimal endmortgrade) {
        this.endmortgrade = endmortgrade;
    }

    public String getCustleavel() {
        return custleavel;
    }

    public void setCustleavel(String custleavel) {
        this.custleavel = custleavel == null ? null : custleavel.trim();
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
        Custscore other = (Custscore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStartcustgrade() == null ? other.getStartcustgrade() == null : this.getStartcustgrade().equals(other.getStartcustgrade()))
            && (this.getEndcustgrade() == null ? other.getEndcustgrade() == null : this.getEndcustgrade().equals(other.getEndcustgrade()))
            && (this.getStartmortgrade() == null ? other.getStartmortgrade() == null : this.getStartmortgrade().equals(other.getStartmortgrade()))
            && (this.getEndmortgrade() == null ? other.getEndmortgrade() == null : this.getEndmortgrade().equals(other.getEndmortgrade()))
            && (this.getCustleavel() == null ? other.getCustleavel() == null : this.getCustleavel().equals(other.getCustleavel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStartcustgrade() == null) ? 0 : getStartcustgrade().hashCode());
        result = prime * result + ((getEndcustgrade() == null) ? 0 : getEndcustgrade().hashCode());
        result = prime * result + ((getStartmortgrade() == null) ? 0 : getStartmortgrade().hashCode());
        result = prime * result + ((getEndmortgrade() == null) ? 0 : getEndmortgrade().hashCode());
        result = prime * result + ((getCustleavel() == null) ? 0 : getCustleavel().hashCode());
        return result;
    }
}
