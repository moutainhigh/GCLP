package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//资产信息表
public class Assetinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=10,min=0,message="资产类型不能超出10位")
	@ApiModelProperty(value = "资产类型", example = "", dataType="varchar(10)", required = true )
    private String assettype;

	@Length(max=8,min=0,message="坐落地址区不能超出8位")
	@ApiModelProperty(value = "坐落地址区", example = "", dataType="varchar(8)", required = true )
    private String addresssarea;

	@Length(max=8,min=0,message="坐落地址市不能超出8位")
	@ApiModelProperty(value = "坐落地址市", example = "", dataType="varchar(8)", required = true )
    private String addresscity;

	@Length(max=8,min=0,message="坐落地址省不能超出8位")
	@ApiModelProperty(value = "坐落地址省", example = "", dataType="varchar(8)", required = true )
    private String addressprov;

	@Length(max=200,min=0,message="坐落地址详细信息不能超出200位")
	@ApiModelProperty(value = "坐落地址详细信息", example = "", dataType="varchar(200)", required = true )
    private String address;

	@Length(max=1,min=0,message="是否提供产证不能超出1位")
	@ApiModelProperty(value = "是否提供产证", example = "1", dataType="char(1)", required = true )
    private String isprovidepaper;

	@Length(max=80,min=0,message="产权人不能超出80位")
	@ApiModelProperty(value = "产权人", example = "", dataType="varchar(80)", required = true )
    private String propertyowner;

	@Length(max=20,min=0,message="房产性质不能超出20位")
	@ApiModelProperty(value = "房产性质", example = "", dataType="varchar(20)", required = true )
    private String housenature;

	@Length(max=4,min=0,message="建筑面积不能超出4位")
	@ApiModelProperty(value = "建筑面积", example = "1000", dataType="varchar(4)", required = true )
    private String housearea;

	@ApiModelProperty(value = "购买时间", example = "", dataType="datetime", required = true )
    private Date buytime;

	@Length(max=17,min=0,message="购买价格不能超出17位")
	@ApiModelProperty(value = "购买价格", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal buyprice;

	@Length(max=10,min=0,message="资料选择类别不能超出10位")
	@ApiModelProperty(value = "资料选择类别", example = "", dataType="varchar(10)", required = true )
    private String docchoosetype;

	@Length(max=200,min=0,message="资产情况说明不能超出200位")
	@ApiModelProperty(value = "资产情况说明", example = "", dataType="varchar(200)", required = true )
    private String assetsituation;

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

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public String getAddresssarea() {
        return addresssarea;
    }

    public void setAddresssarea(String addresssarea) {
        this.addresssarea = addresssarea == null ? null : addresssarea.trim();
    }

    public String getAddresscity() {
        return addresscity;
    }

    public void setAddresscity(String addresscity) {
        this.addresscity = addresscity == null ? null : addresscity.trim();
    }

    public String getAddressprov() {
        return addressprov;
    }

    public void setAddressprov(String addressprov) {
        this.addressprov = addressprov == null ? null : addressprov.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIsprovidepaper() {
        return isprovidepaper;
    }

    public void setIsprovidepaper(String isprovidepaper) {
        this.isprovidepaper = isprovidepaper == null ? null : isprovidepaper.trim();
    }

    public String getPropertyowner() {
        return propertyowner;
    }

    public void setPropertyowner(String propertyowner) {
        this.propertyowner = propertyowner == null ? null : propertyowner.trim();
    }

    public String getHousenature() {
        return housenature;
    }

    public void setHousenature(String housenature) {
        this.housenature = housenature == null ? null : housenature.trim();
    }

    public String getHousearea() {
        return housearea;
    }

    public void setHousearea(String housearea) {
        this.housearea = housearea == null ? null : housearea.trim();
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public BigDecimal getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(BigDecimal buyprice) {
        this.buyprice = buyprice;
    }

    public String getDocchoosetype() {
        return docchoosetype;
    }

    public void setDocchoosetype(String docchoosetype) {
        this.docchoosetype = docchoosetype == null ? null : docchoosetype.trim();
    }

    public String getAssetsituation() {
        return assetsituation;
    }

    public void setAssetsituation(String assetsituation) {
        this.assetsituation = assetsituation == null ? null : assetsituation.trim();
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
        Assetinfo other = (Assetinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getAssettype() == null ? other.getAssettype() == null : this.getAssettype().equals(other.getAssettype()))
            && (this.getAddresssarea() == null ? other.getAddresssarea() == null : this.getAddresssarea().equals(other.getAddresssarea()))
            && (this.getAddresscity() == null ? other.getAddresscity() == null : this.getAddresscity().equals(other.getAddresscity()))
            && (this.getAddressprov() == null ? other.getAddressprov() == null : this.getAddressprov().equals(other.getAddressprov()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIsprovidepaper() == null ? other.getIsprovidepaper() == null : this.getIsprovidepaper().equals(other.getIsprovidepaper()))
            && (this.getPropertyowner() == null ? other.getPropertyowner() == null : this.getPropertyowner().equals(other.getPropertyowner()))
            && (this.getHousenature() == null ? other.getHousenature() == null : this.getHousenature().equals(other.getHousenature()))
            && (this.getHousearea() == null ? other.getHousearea() == null : this.getHousearea().equals(other.getHousearea()))
            && (this.getBuytime() == null ? other.getBuytime() == null : this.getBuytime().equals(other.getBuytime()))
            && (this.getBuyprice() == null ? other.getBuyprice() == null : this.getBuyprice().equals(other.getBuyprice()))
            && (this.getDocchoosetype() == null ? other.getDocchoosetype() == null : this.getDocchoosetype().equals(other.getDocchoosetype()))
            && (this.getAssetsituation() == null ? other.getAssetsituation() == null : this.getAssetsituation().equals(other.getAssetsituation()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getAssettype() == null) ? 0 : getAssettype().hashCode());
        result = prime * result + ((getAddresssarea() == null) ? 0 : getAddresssarea().hashCode());
        result = prime * result + ((getAddresscity() == null) ? 0 : getAddresscity().hashCode());
        result = prime * result + ((getAddressprov() == null) ? 0 : getAddressprov().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIsprovidepaper() == null) ? 0 : getIsprovidepaper().hashCode());
        result = prime * result + ((getPropertyowner() == null) ? 0 : getPropertyowner().hashCode());
        result = prime * result + ((getHousenature() == null) ? 0 : getHousenature().hashCode());
        result = prime * result + ((getHousearea() == null) ? 0 : getHousearea().hashCode());
        result = prime * result + ((getBuytime() == null) ? 0 : getBuytime().hashCode());
        result = prime * result + ((getBuyprice() == null) ? 0 : getBuyprice().hashCode());
        result = prime * result + ((getDocchoosetype() == null) ? 0 : getDocchoosetype().hashCode());
        result = prime * result + ((getAssetsituation() == null) ? 0 : getAssetsituation().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
