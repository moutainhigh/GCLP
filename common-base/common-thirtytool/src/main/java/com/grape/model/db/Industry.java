package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//
public class Industry implements Serializable {
	@Length(max=10,min=0,message="行业编码不能超出10位")
	@ApiModelProperty(value = "行业编码", example = "", dataType="varchar(10)", required = true )
    private String codflg;

	@Length(max=80,min=0,message="行业名称不能超出80位")
	@ApiModelProperty(value = "行业名称", example = "", dataType="varchar(80)", required = true )
    private String codname;

    private static final long serialVersionUID = 1L;

    public String getCodflg() {
        return codflg;
    }

    public void setCodflg(String codflg) {
        this.codflg = codflg == null ? null : codflg.trim();
    }

    public String getCodname() {
        return codname;
    }

    public void setCodname(String codname) {
        this.codname = codname == null ? null : codname.trim();
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
        Industry other = (Industry) that;
        return (this.getCodflg() == null ? other.getCodflg() == null : this.getCodflg().equals(other.getCodflg()))
            && (this.getCodname() == null ? other.getCodname() == null : this.getCodname().equals(other.getCodname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodflg() == null) ? 0 : getCodflg().hashCode());
        result = prime * result + ((getCodname() == null) ? 0 : getCodname().hashCode());
        return result;
    }
}
