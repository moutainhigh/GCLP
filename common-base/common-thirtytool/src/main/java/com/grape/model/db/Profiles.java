package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//档案资料表
public class Profiles implements Serializable {
	@Length(max=4,min=0,message="档案编号不能超出4位")
	@ApiModelProperty(value = "档案编号", example = "", dataType="varchar(4)", required = true )
    private String fileno;

	@Length(max=80,min=0,message="档案名称不能超出80位")
	@ApiModelProperty(value = "档案名称", example = "", dataType="varchar(80)", required = true )
    private String filename;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=4,min=0,message="档案类型不能超出4位")
	@ApiModelProperty(value = "档案类型", example = "", dataType="varchar(4)", required = true )
    private String filetype;

	@Length(max=4,min=0,message="状态不能超出4位")
	@ApiModelProperty(value = "状态", example = "", dataType="varchar(4)", required = true )
    private String state;

    private static final long serialVersionUID = 1L;

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno == null ? null : fileno.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
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

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
        Profiles other = (Profiles) that;
        return (this.getFileno() == null ? other.getFileno() == null : this.getFileno().equals(other.getFileno()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getFiletype() == null ? other.getFiletype() == null : this.getFiletype().equals(other.getFiletype()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileno() == null) ? 0 : getFileno().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getFiletype() == null) ? 0 : getFiletype().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}
