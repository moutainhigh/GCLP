package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//系统参数表
public class Sysparameter implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=12,min=0,message="参数类型不能超出12位")
	@ApiModelProperty(value = "参数类型", example = "", dataType="varchar(12)", required = true )
    private String parametertype;

	@Length(max=12,min=0,message="参数名称不能超出12位")
	@ApiModelProperty(value = "参数名称", example = "", dataType="varchar(12)", required = true )
    private String parametername;

	@Length(max=10,min=0,message="参数内容不能超出10位")
	@ApiModelProperty(value = "参数内容", example = "", dataType="varchar(10)", required = true )
    private String parametercontent;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParametertype() {
        return parametertype;
    }

    public void setParametertype(String parametertype) {
        this.parametertype = parametertype == null ? null : parametertype.trim();
    }

    public String getParametername() {
        return parametername;
    }

    public void setParametername(String parametername) {
        this.parametername = parametername == null ? null : parametername.trim();
    }

    public String getParametercontent() {
        return parametercontent;
    }

    public void setParametercontent(String parametercontent) {
        this.parametercontent = parametercontent == null ? null : parametercontent.trim();
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
        Sysparameter other = (Sysparameter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParametertype() == null ? other.getParametertype() == null : this.getParametertype().equals(other.getParametertype()))
            && (this.getParametername() == null ? other.getParametername() == null : this.getParametername().equals(other.getParametername()))
            && (this.getParametercontent() == null ? other.getParametercontent() == null : this.getParametercontent().equals(other.getParametercontent()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParametertype() == null) ? 0 : getParametertype().hashCode());
        result = prime * result + ((getParametername() == null) ? 0 : getParametername().hashCode());
        result = prime * result + ((getParametercontent() == null) ? 0 : getParametercontent().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
