package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//码表
public class Codetable implements Serializable {
	@Length(max=20,min=0,message="码表类型不能超出20位")
	@ApiModelProperty(value = "码表类型", example = "", dataType="varchar(20)", required = true )
    private String codtyp;

	@Length(max=20,min=0,message="码表标识不能超出20位")
	@ApiModelProperty(value = "码表标识", example = "", dataType="varchar(20)", required = true )
    private String codflg;

	@Length(max=100,min=0,message="码表中文内容不能超出100位")
	@ApiModelProperty(value = "码表中文内容", example = "", dataType="varchar(100)", required = true )
    private String coddes;

	@Length(max=8,min=0,message="顺序不能超出8位")
	@ApiModelProperty(value = "顺序", example = "", dataType="decimal(8,0)", required = true )
    private Integer idx;

	@Length(max=1,min=0,message="是否移除标志不能超出1位")
	@ApiModelProperty(value = "是否移除标志", example = "", dataType="char(1)", required = true )
    private String removeflg;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=40,min=0,message="描述不能超出40位")
	@ApiModelProperty(value = "描述", example = "", dataType="varchar(40)", required = true )
    private String descriptions;

    private static final long serialVersionUID = 1L;

    public String getCodtyp() {
        return codtyp;
    }

    public void setCodtyp(String codtyp) {
        this.codtyp = codtyp == null ? null : codtyp.trim();
    }

    public String getCodflg() {
        return codflg;
    }

    public void setCodflg(String codflg) {
        this.codflg = codflg == null ? null : codflg.trim();
    }

    public String getCoddes() {
        return coddes;
    }

    public void setCoddes(String coddes) {
        this.coddes = coddes == null ? null : coddes.trim();
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getRemoveflg() {
        return removeflg;
    }

    public void setRemoveflg(String removeflg) {
        this.removeflg = removeflg == null ? null : removeflg.trim();
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
        Codetable other = (Codetable) that;
        return (this.getCodtyp() == null ? other.getCodtyp() == null : this.getCodtyp().equals(other.getCodtyp()))
            && (this.getCodflg() == null ? other.getCodflg() == null : this.getCodflg().equals(other.getCodflg()))
            && (this.getCoddes() == null ? other.getCoddes() == null : this.getCoddes().equals(other.getCoddes()))
            && (this.getIdx() == null ? other.getIdx() == null : this.getIdx().equals(other.getIdx()))
            && (this.getRemoveflg() == null ? other.getRemoveflg() == null : this.getRemoveflg().equals(other.getRemoveflg()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getDescriptions() == null ? other.getDescriptions() == null : this.getDescriptions().equals(other.getDescriptions()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCodtyp() == null) ? 0 : getCodtyp().hashCode());
        result = prime * result + ((getCodflg() == null) ? 0 : getCodflg().hashCode());
        result = prime * result + ((getCoddes() == null) ? 0 : getCoddes().hashCode());
        result = prime * result + ((getIdx() == null) ? 0 : getIdx().hashCode());
        result = prime * result + ((getRemoveflg() == null) ? 0 : getRemoveflg().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        return result;
    }
}
