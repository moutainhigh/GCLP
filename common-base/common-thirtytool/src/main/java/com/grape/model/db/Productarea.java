package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//null
public class Productarea implements Serializable {
	@Length(max=19,min=0,message="区域id不能超出19位")
	@ApiModelProperty(value = "区域id", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@Length(max=6,min=0,message="产品id不能超出6位")
	@ApiModelProperty(value = "产品id", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=80,min=0,message="描述不能超出80位")
	@ApiModelProperty(value = "描述", example = "", dataType="varchar(80)", required = true )
    private String description;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="最后修改人不能超出10位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(10)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        Productarea other = (Productarea) that;
        return (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
