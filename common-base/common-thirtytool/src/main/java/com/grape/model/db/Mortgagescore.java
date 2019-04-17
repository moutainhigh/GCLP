package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//抵押物评分表
public class Mortgagescore implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=4,min=0,message="开始抵押物评分分数不能超出4位")
	@ApiModelProperty(value = "开始抵押物评分分数", example = "", dataType="varchar(4)", required = true )
    private String startmortgrade;

	@Length(max=4,min=0,message="结束抵押物评分分数不能超出4位")
	@ApiModelProperty(value = "结束抵押物评分分数", example = "", dataType="varchar(4)", required = true )
    private String endmortgrade;

	@Length(max=9,min=0,message="抵押率不能超出9位")
	@ApiModelProperty(value = "抵押率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal mortgagerate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStartmortgrade() {
        return startmortgrade;
    }

    public void setStartmortgrade(String startmortgrade) {
        this.startmortgrade = startmortgrade == null ? null : startmortgrade.trim();
    }

    public String getEndmortgrade() {
        return endmortgrade;
    }

    public void setEndmortgrade(String endmortgrade) {
        this.endmortgrade = endmortgrade == null ? null : endmortgrade.trim();
    }

    public BigDecimal getMortgagerate() {
        return mortgagerate;
    }

    public void setMortgagerate(BigDecimal mortgagerate) {
        this.mortgagerate = mortgagerate;
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
        Mortgagescore other = (Mortgagescore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStartmortgrade() == null ? other.getStartmortgrade() == null : this.getStartmortgrade().equals(other.getStartmortgrade()))
            && (this.getEndmortgrade() == null ? other.getEndmortgrade() == null : this.getEndmortgrade().equals(other.getEndmortgrade()))
            && (this.getMortgagerate() == null ? other.getMortgagerate() == null : this.getMortgagerate().equals(other.getMortgagerate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStartmortgrade() == null) ? 0 : getStartmortgrade().hashCode());
        result = prime * result + ((getEndmortgrade() == null) ? 0 : getEndmortgrade().hashCode());
        result = prime * result + ((getMortgagerate() == null) ? 0 : getMortgagerate().hashCode());
        return result;
    }
}
