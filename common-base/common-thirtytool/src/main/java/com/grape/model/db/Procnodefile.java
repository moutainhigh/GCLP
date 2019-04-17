package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//流程节点档案资料表
public class Procnodefile implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="节点编号不能超出10位")
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(10)", required = true )
    private String nodeid;

	@Length(max=10,min=0,message="档案编号不能超出10位")
	@ApiModelProperty(value = "档案编号", example = "", dataType="varchar(10)", required = true )
    private String fileno;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="产品编号不能超出10位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(10)", required = true )
    private String priductno;

	@Length(max=20,min=0,message="文件名不能超出20位")
	@ApiModelProperty(value = "文件名", example = "", dataType="varchar(20)", required = true )
    private String filename;

	@Length(max=10,min=0,message="类型不能超出10位")
	@ApiModelProperty(value = "类型", example = "", dataType="varchar(10)", required = true )
    private String filetype;

	@Length(max=4,min=0,message="必填或选填不能超出4位")
	@ApiModelProperty(value = "必填或选填", example = "", dataType="varchar(4)", required = true )
    private String required;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno == null ? null : fileno.trim();
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

    public String getPriductno() {
        return priductno;
    }

    public void setPriductno(String priductno) {
        this.priductno = priductno == null ? null : priductno.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required == null ? null : required.trim();
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
        Procnodefile other = (Procnodefile) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getFileno() == null ? other.getFileno() == null : this.getFileno().equals(other.getFileno()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getPriductno() == null ? other.getPriductno() == null : this.getPriductno().equals(other.getPriductno()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getFiletype() == null ? other.getFiletype() == null : this.getFiletype().equals(other.getFiletype()))
            && (this.getRequired() == null ? other.getRequired() == null : this.getRequired().equals(other.getRequired()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getFileno() == null) ? 0 : getFileno().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getPriductno() == null) ? 0 : getPriductno().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getFiletype() == null) ? 0 : getFiletype().hashCode());
        result = prime * result + ((getRequired() == null) ? 0 : getRequired().hashCode());
        return result;
    }
}
