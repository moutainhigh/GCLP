package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//查档表
public class Consult implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=80,min=0,message="查档人不能超出80位")
	@ApiModelProperty(value = "查档人", example = "", dataType="varchar(80)", required = true )
    private String consultman;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageno;

	@Length(max=10,min=0,message="查档结果不能超出10位")
	@ApiModelProperty(value = "查档结果", example = "", dataType="varchar(10)", required = true )
    private String consultresult;

	@Length(max=10,min=0,message="查档状态不能超出10位")
	@ApiModelProperty(value = "查档状态", example = "", dataType="varchar(10)", required = true )
    private String consultstate;

	@ApiModelProperty(value = "查档日期", example = "", dataType="datetime", required = true )
    private Date consultdate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getConsultman() {
        return consultman;
    }

    public void setConsultman(String consultman) {
        this.consultman = consultman == null ? null : consultman.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getMortgageno() {
        return mortgageno;
    }

    public void setMortgageno(String mortgageno) {
        this.mortgageno = mortgageno == null ? null : mortgageno.trim();
    }

    public String getConsultresult() {
        return consultresult;
    }

    public void setConsultresult(String consultresult) {
        this.consultresult = consultresult == null ? null : consultresult.trim();
    }

    public String getConsultstate() {
        return consultstate;
    }

    public void setConsultstate(String consultstate) {
        this.consultstate = consultstate == null ? null : consultstate.trim();
    }

    public Date getConsultdate() {
        return consultdate;
    }

    public void setConsultdate(Date consultdate) {
        this.consultdate = consultdate;
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
        Consult other = (Consult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConsultman() == null ? other.getConsultman() == null : this.getConsultman().equals(other.getConsultman()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getMortgageno() == null ? other.getMortgageno() == null : this.getMortgageno().equals(other.getMortgageno()))
            && (this.getConsultresult() == null ? other.getConsultresult() == null : this.getConsultresult().equals(other.getConsultresult()))
            && (this.getConsultstate() == null ? other.getConsultstate() == null : this.getConsultstate().equals(other.getConsultstate()))
            && (this.getConsultdate() == null ? other.getConsultdate() == null : this.getConsultdate().equals(other.getConsultdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConsultman() == null) ? 0 : getConsultman().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getMortgageno() == null) ? 0 : getMortgageno().hashCode());
        result = prime * result + ((getConsultresult() == null) ? 0 : getConsultresult().hashCode());
        result = prime * result + ((getConsultstate() == null) ? 0 : getConsultstate().hashCode());
        result = prime * result + ((getConsultdate() == null) ? 0 : getConsultdate().hashCode());
        return result;
    }
}
