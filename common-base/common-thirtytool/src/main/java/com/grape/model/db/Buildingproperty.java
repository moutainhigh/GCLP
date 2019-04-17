package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//
public class Buildingproperty implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=3,min=0,message="咨询身份不能超出3位")
	@ApiModelProperty(value = "咨询身份", example = "", dataType="varchar(3)", required = true )
    private String identity;

	@Length(max=255,min=0,message="中介名片不能超出255位")
	@ApiModelProperty(value = "中介名片", example = "", dataType="varchar(255)", required = true )
    private String card;

	@Length(max=255,min=0,message="中介名片地址不能超出255位")
	@ApiModelProperty(value = "中介名片地址", example = "", dataType="varchar(255)", required = true )
    private String picture;

	@Length(max=19,min=0,message="当前快速成交价不能超出19位")
	@ApiModelProperty(value = "当前快速成交价", example = "", dataType="varchar(19)", required = true )
    private String fastprice;

	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=19,min=0,message="实地挂盘价不能超出19位")
	@ApiModelProperty(value = "实地挂盘价", example = "", dataType="varchar(19)", required = true )
    private String realprice;

	@Length(max=255,min=0,message="实地挂盘价图片地址不能超出255位")
	@ApiModelProperty(value = "实地挂盘价图片地址", example = "", dataType="varchar(255)", required = true )
    private String realpriceprice;

	@Length(max=17,min=0,message="房产评估单价不能超出17位")
	@ApiModelProperty(value = "房产评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal houseunitprice;

	@Length(max=17,min=0,message="房产评估总价不能超出17位")
	@ApiModelProperty(value = "房产评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal housetotalprice;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getFastprice() {
        return fastprice;
    }

    public void setFastprice(String fastprice) {
        this.fastprice = fastprice == null ? null : fastprice.trim();
    }

    public String getMortgageid() {
        return mortgageid;
    }

    public void setMortgageid(String mortgageid) {
        this.mortgageid = mortgageid == null ? null : mortgageid.trim();
    }

    public String getRealprice() {
        return realprice;
    }

    public void setRealprice(String realprice) {
        this.realprice = realprice == null ? null : realprice.trim();
    }

    public String getRealpriceprice() {
        return realpriceprice;
    }

    public void setRealpriceprice(String realpriceprice) {
        this.realpriceprice = realpriceprice == null ? null : realpriceprice.trim();
    }

    public BigDecimal getHouseunitprice() {
        return houseunitprice;
    }

    public void setHouseunitprice(BigDecimal houseunitprice) {
        this.houseunitprice = houseunitprice;
    }

    public BigDecimal getHousetotalprice() {
        return housetotalprice;
    }

    public void setHousetotalprice(BigDecimal housetotalprice) {
        this.housetotalprice = housetotalprice;
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
        Buildingproperty other = (Buildingproperty) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdentity() == null ? other.getIdentity() == null : this.getIdentity().equals(other.getIdentity()))
            && (this.getCard() == null ? other.getCard() == null : this.getCard().equals(other.getCard()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getFastprice() == null ? other.getFastprice() == null : this.getFastprice().equals(other.getFastprice()))
            && (this.getMortgageid() == null ? other.getMortgageid() == null : this.getMortgageid().equals(other.getMortgageid()))
            && (this.getRealprice() == null ? other.getRealprice() == null : this.getRealprice().equals(other.getRealprice()))
            && (this.getRealpriceprice() == null ? other.getRealpriceprice() == null : this.getRealpriceprice().equals(other.getRealpriceprice()))
            && (this.getHouseunitprice() == null ? other.getHouseunitprice() == null : this.getHouseunitprice().equals(other.getHouseunitprice()))
            && (this.getHousetotalprice() == null ? other.getHousetotalprice() == null : this.getHousetotalprice().equals(other.getHousetotalprice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        result = prime * result + ((getCard() == null) ? 0 : getCard().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getFastprice() == null) ? 0 : getFastprice().hashCode());
        result = prime * result + ((getMortgageid() == null) ? 0 : getMortgageid().hashCode());
        result = prime * result + ((getRealprice() == null) ? 0 : getRealprice().hashCode());
        result = prime * result + ((getRealpriceprice() == null) ? 0 : getRealpriceprice().hashCode());
        result = prime * result + ((getHouseunitprice() == null) ? 0 : getHouseunitprice().hashCode());
        result = prime * result + ((getHousetotalprice() == null) ? 0 : getHousetotalprice().hashCode());
        return result;
    }
}
