package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Formdata implements Serializable {
	@Length(max=11,min=0,message="主键ID不能超出11位")
	@ApiModelProperty(value = "主键ID", example = "", dataType="int(11)", required = true )
    private Integer id;

	@Length(max=19,min=0,message="表单编号不能超出19位")
	@ApiModelProperty(value = "表单编号", example = "", dataType="varchar(19)", required = true )
    private String formid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "存贮时间", example = "", dataType="datetime", required = true )
    private Date savetime;

	@ApiModelProperty(value = "表单json数据", example = "", dataType="text", required = true )
    private String formdata;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid == null ? null : formid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

    public String getFormdata() {
        return formdata;
    }

    public void setFormdata(String formdata) {
        this.formdata = formdata == null ? null : formdata.trim();
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
        Formdata other = (Formdata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFormid() == null ? other.getFormid() == null : this.getFormid().equals(other.getFormid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getSavetime() == null ? other.getSavetime() == null : this.getSavetime().equals(other.getSavetime()))
            && (this.getFormdata() == null ? other.getFormdata() == null : this.getFormdata().equals(other.getFormdata()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFormid() == null) ? 0 : getFormid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getSavetime() == null) ? 0 : getSavetime().hashCode());
        result = prime * result + ((getFormdata() == null) ? 0 : getFormdata().hashCode());
        return result;
    }
}
