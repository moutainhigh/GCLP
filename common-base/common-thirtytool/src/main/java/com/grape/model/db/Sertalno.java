package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//序号表
public class Sertalno implements Serializable {
	@Length(max=10,min=0,message="类型不能超出10位")
	@ApiModelProperty(value = "类型", example = "", dataType="varchar(10)", required = true )
    private String code;

	@Length(max=16,min=0,message="序号不能超出16位")
	@ApiModelProperty(value = "序号", example = "", dataType="varchar(16)", required = true )
    private String seqno;

	@Length(max=200,min=0,message="序号不能超出200位")
	@ApiModelProperty(value = "序号", example = "", dataType="varchar(200)", required = true )
    private String descriptions;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
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
        Sertalno other = (Sertalno) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getSeqno() == null ? other.getSeqno() == null : this.getSeqno().equals(other.getSeqno()))
            && (this.getDescriptions() == null ? other.getDescriptions() == null : this.getDescriptions().equals(other.getDescriptions()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getSeqno() == null) ? 0 : getSeqno().hashCode());
        result = prime * result + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        return result;
    }
}
