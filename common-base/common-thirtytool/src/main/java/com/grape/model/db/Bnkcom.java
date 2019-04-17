package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Bnkcom implements Serializable {
	@Length(max=5,min=0,message="不能超出5位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(5)", required = true )
    private String comno;

	@Length(max=5,min=0,message="不能超出5位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(5)", required = true )
    private String bnkno;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(1)", required = true )
    private String removeflg;

    private static final long serialVersionUID = 1L;

    public String getComno() {
        return comno;
    }

    public void setComno(String comno) {
        this.comno = comno == null ? null : comno.trim();
    }

    public String getBnkno() {
        return bnkno;
    }

    public void setBnkno(String bnkno) {
        this.bnkno = bnkno == null ? null : bnkno.trim();
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

    public String getRemoveflg() {
        return removeflg;
    }

    public void setRemoveflg(String removeflg) {
        this.removeflg = removeflg == null ? null : removeflg.trim();
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
        Bnkcom other = (Bnkcom) that;
        return (this.getComno() == null ? other.getComno() == null : this.getComno().equals(other.getComno()))
            && (this.getBnkno() == null ? other.getBnkno() == null : this.getBnkno().equals(other.getBnkno()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getRemoveflg() == null ? other.getRemoveflg() == null : this.getRemoveflg().equals(other.getRemoveflg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComno() == null) ? 0 : getComno().hashCode());
        result = prime * result + ((getBnkno() == null) ? 0 : getBnkno().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getRemoveflg() == null) ? 0 : getRemoveflg().hashCode());
        return result;
    }
}
