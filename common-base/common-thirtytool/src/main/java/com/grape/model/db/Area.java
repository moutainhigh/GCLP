package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//区域表
public class Area implements Serializable {
	@Length(max=19,min=0,message="区域id不能超出19位")
	@ApiModelProperty(value = "区域id", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@Length(max=80,min=0,message="区域名称不能超出80位")
	@ApiModelProperty(value = "区域名称", example = "", dataType="varchar(80)", required = true )
    private String areaname;

	@Length(max=19,min=0,message="上级区域不能超出19位")
	@ApiModelProperty(value = "上级区域", example = "", dataType="varchar(19)", required = true )
    private String superiorarea;

	@Length(max=1,min=0,message="代理级别不能超出1位")
	@ApiModelProperty(value = "代理级别", example = "", dataType="char(1)", required = true )
    private String agentclass;

	@Length(max=1,min=0,message="是否限售不能超出1位")
	@ApiModelProperty(value = "是否限售", example = "", dataType="char(1)", required = true )
    private String islimitsale;

	@Length(max=5,min=0,message="区域权重不能超出5位")
	@ApiModelProperty(value = "区域权重", example = "", dataType="decimal(5,2)", required = true )
    private BigDecimal areaweight;

	@Length(max=4,min=0,message="限售年限（年）不能超出4位")
	@ApiModelProperty(value = "限售年限（年）", example = "", dataType="varchar(4)", required = true )
    private String limitsaleyear;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=6,min=0,message="国标码不能超出6位")
	@ApiModelProperty(value = "国标码", example = "", dataType="varchar(6)", required = true )
    private String gbcode;

	@Length(max=10,min=0,message="片区码不能超出10位")
	@ApiModelProperty(value = "片区码", example = "", dataType="varchar(10)", required = true )
    private String areacode;

	@Length(max=2,min=0,message="片区类型不能超出2位")
	@ApiModelProperty(value = "片区类型", example = "", dataType="varchar(2)", required = true )
    private String areatype;

	@Length(max=10,min=0,message="城市首字母缩写不能超出10位")
	@ApiModelProperty(value = "城市首字母缩写", example = "", dataType="varchar(10)", required = true )
    private String cityab;

    private static final long serialVersionUID = 1L;

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getSuperiorarea() {
        return superiorarea;
    }

    public void setSuperiorarea(String superiorarea) {
        this.superiorarea = superiorarea == null ? null : superiorarea.trim();
    }

    public String getAgentclass() {
        return agentclass;
    }

    public void setAgentclass(String agentclass) {
        this.agentclass = agentclass == null ? null : agentclass.trim();
    }

    public String getIslimitsale() {
        return islimitsale;
    }

    public void setIslimitsale(String islimitsale) {
        this.islimitsale = islimitsale == null ? null : islimitsale.trim();
    }

    public BigDecimal getAreaweight() {
        return areaweight;
    }

    public void setAreaweight(BigDecimal areaweight) {
        this.areaweight = areaweight;
    }

    public String getLimitsaleyear() {
        return limitsaleyear;
    }

    public void setLimitsaleyear(String limitsaleyear) {
        this.limitsaleyear = limitsaleyear == null ? null : limitsaleyear.trim();
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

    public String getGbcode() {
        return gbcode;
    }

    public void setGbcode(String gbcode) {
        this.gbcode = gbcode == null ? null : gbcode.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getAreatype() {
        return areatype;
    }

    public void setAreatype(String areatype) {
        this.areatype = areatype == null ? null : areatype.trim();
    }

    public String getCityab() {
        return cityab;
    }

    public void setCityab(String cityab) {
        this.cityab = cityab == null ? null : cityab.trim();
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
        Area other = (Area) that;
        return (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getAreaname() == null ? other.getAreaname() == null : this.getAreaname().equals(other.getAreaname()))
            && (this.getSuperiorarea() == null ? other.getSuperiorarea() == null : this.getSuperiorarea().equals(other.getSuperiorarea()))
            && (this.getAgentclass() == null ? other.getAgentclass() == null : this.getAgentclass().equals(other.getAgentclass()))
            && (this.getIslimitsale() == null ? other.getIslimitsale() == null : this.getIslimitsale().equals(other.getIslimitsale()))
            && (this.getAreaweight() == null ? other.getAreaweight() == null : this.getAreaweight().equals(other.getAreaweight()))
            && (this.getLimitsaleyear() == null ? other.getLimitsaleyear() == null : this.getLimitsaleyear().equals(other.getLimitsaleyear()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getGbcode() == null ? other.getGbcode() == null : this.getGbcode().equals(other.getGbcode()))
            && (this.getAreacode() == null ? other.getAreacode() == null : this.getAreacode().equals(other.getAreacode()))
            && (this.getAreatype() == null ? other.getAreatype() == null : this.getAreatype().equals(other.getAreatype()))
            && (this.getCityab() == null ? other.getCityab() == null : this.getCityab().equals(other.getCityab()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getAreaname() == null) ? 0 : getAreaname().hashCode());
        result = prime * result + ((getSuperiorarea() == null) ? 0 : getSuperiorarea().hashCode());
        result = prime * result + ((getAgentclass() == null) ? 0 : getAgentclass().hashCode());
        result = prime * result + ((getIslimitsale() == null) ? 0 : getIslimitsale().hashCode());
        result = prime * result + ((getAreaweight() == null) ? 0 : getAreaweight().hashCode());
        result = prime * result + ((getLimitsaleyear() == null) ? 0 : getLimitsaleyear().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getGbcode() == null) ? 0 : getGbcode().hashCode());
        result = prime * result + ((getAreacode() == null) ? 0 : getAreacode().hashCode());
        result = prime * result + ((getAreatype() == null) ? 0 : getAreatype().hashCode());
        result = prime * result + ((getCityab() == null) ? 0 : getCityab().hashCode());
        return result;
    }
}
