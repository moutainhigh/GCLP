package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//渠道-产品表
public class Chanproduct implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=5,min=0,message="机构编号不能超出5位")
	@ApiModelProperty(value = "机构编号", example = "", dataType="varchar(5)", required = true )
    private String organizationno;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrganizationno() {
        return organizationno;
    }

    public void setOrganizationno(String organizationno) {
        this.organizationno = organizationno == null ? null : organizationno.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
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
        Chanproduct other = (Chanproduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrganizationno() == null ? other.getOrganizationno() == null : this.getOrganizationno().equals(other.getOrganizationno()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrganizationno() == null) ? 0 : getOrganizationno().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        return result;
    }
}
