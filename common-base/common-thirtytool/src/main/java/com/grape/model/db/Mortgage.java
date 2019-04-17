package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Size;

//抵押物信息表
public class Mortgage implements Serializable {
	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=2,min=0,message="抵押物类型不能超出2位")
	@ApiModelProperty(value = "抵押物类型", example = "", dataType="varchar(2)", required = true )
    private String mortgagetype;

	@Length(max=80,min=0,message="产权人不能超出80位")
	@ApiModelProperty(value = "产权人", example = "", dataType="varchar(80)", required = true )
    private String propertyowner;

	@Length(max=80,min=0,message="房屋坐落地址所属省份不能超出80位")
	@ApiModelProperty(value = "房屋坐落地址所属省份", example = "", dataType="varchar(80)", required = true )
    private String houseaddressprovince;

	@Length(max=80,min=0,message="房屋坐落地址所属城市不能超出80位")
	@ApiModelProperty(value = "房屋坐落地址所属城市", example = "", dataType="varchar(80)", required = true )
    private String houseaddresscity;

	@Length(max=80,min=0,message="房屋坐落地址所属区域不能超出80位")
	@ApiModelProperty(value = "房屋坐落地址所属区域", example = "", dataType="varchar(80)", required = true )
    private String houseaddressarea;

	@Length(max=300,min=0,message="房屋坐落地址详情不能超出300位")
	@ApiModelProperty(value = "房屋坐落地址详情", example = "", dataType="varchar(300)", required = true )
    private String houseaddressdetail;

	@Length(max=19,min=0,message="所属内区外区不能超出19位")
	@ApiModelProperty(value = "所属内区外区", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@Length(max=80,min=0,message="抵押物名称不能超出80位")
	@ApiModelProperty(value = "抵押物名称", example = "", dataType="varchar(80)", required = true )
    private String martgagename;

	@Length(max=80,min=0,message="建筑面积不能超出80位")
	@ApiModelProperty(value = "建筑面积", example = "", dataType="varchar(80)", required = true )
    private String floorarea;

	@Length(max=4,min=0,message="土地使用年限不能超出4位")
	@ApiModelProperty(value = "土地使用年限", example = "", dataType="varchar(4)", required = true )
    private String landuseage;

	@ApiModelProperty(value = "土地使用结束日期", example = "", dataType="datetime", required = true )
    private Date landuseenddate;

	@ApiModelProperty(value = "土地使用开始时间", example = "", dataType="datetime", required = true )
    private Date landusestartdate;

	@Length(max=30,min=0,message="抵押物一级类型不能超出30位")
	@ApiModelProperty(value = "抵押物一级类型", example = "", dataType="varchar(30)", required = true )
    private String mortgagefirsttype;

	@Length(max=30,min=0,message="抵押物二级类型不能超出30位")
	@ApiModelProperty(value = "抵押物二级类型", example = "", dataType="varchar(30)", required = true )
    private String mortgagesecondtype;

	@Length(max=80,min=0,message="其他土地用途不能超出80位")
	@ApiModelProperty(value = "其他土地用途", example = "", dataType="varchar(80)", required = true )
    private String otherlandpurpose;

	@Length(max=30,min=0,message="土地用途不能超出30位")
	@ApiModelProperty(value = "土地用途", example = "", dataType="varchar(30)", required = true )
    private String landpurpose;

	@Length(max=80,min=0,message="其他房屋用途不能超出80位")
	@ApiModelProperty(value = "其他房屋用途", example = "", dataType="varchar(80)", required = true )
    private String otherhousepurpose;

	@Length(max=20,min=0,message="房屋用途不能超出20位")
	@ApiModelProperty(value = "房屋用途", example = "", dataType="varchar(20)", required = true )
    private String housepurpose;

	@ApiModelProperty(value = "产权登记日期", example = "", dataType="datetime", required = true )
    private Date registrationdate;

	@ApiModelProperty(value = "竣工日期", example = "", dataType="datetime", required = true )
    private Date housefinishdate;

	@ApiModelProperty(value = "购房日期", example = "", dataType="datetime", required = true )
    private Date buyhousedate;

	@Length(max=4,min=0,message="楼龄不能超出4位")
	@ApiModelProperty(value = "楼龄", example = "", dataType="varchar(4)", required = true )
    private String houseage;

	@Length(max=16,min=0,message="土地性质不能超出16位")
	@ApiModelProperty(value = "土地性质", example = "", dataType="varchar(16)", required = true )
    private String landproperty;

	@Length(max=12,min=0,message="房屋性质不能超出12位")
	@ApiModelProperty(value = "房屋性质", example = "", dataType="varchar(12)", required = true )
    private String houseproperty;

	@Length(max=1,min=0,message="产权状态不能超出1位")
	@ApiModelProperty(value = "产权状态", example = "", dataType="char(1)", required = true )
    private String propertystate;

	@Length(max=4,min=0,message="空置时长（月）不能超出4位")
	@ApiModelProperty(value = "空置时长（月）", example = "", dataType="varchar(4)", required = true )
    private String nousetime;

	@Length(max=6,min=0,message="空置面积 不能超出6位")
	@ApiModelProperty(value = "空置面积 ", example = "", dataType="varchar(6)", required = true )
    private String nousearea;

	@Length(max=17,min=0,message="线上评估总价不能超出17位")
	@ApiModelProperty(value = "线上评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netreportamount;

	@Length(max=17,min=0,message="线上评估单价不能超出17位")
	@ApiModelProperty(value = "线上评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netreportprice;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="抵押物是否为唯一住宅不能超出1位")
	@ApiModelProperty(value = "抵押物是否为唯一住宅", example = "", dataType="char(1)", required = true )
    private String housesoloflg;

	@Length(max=600,min=0,message="房产证图片地址不能超出600位")
	@ApiModelProperty(value = "房产证图片地址", example = "", dataType="varchar(600)", required = true )
    private String certificateurl;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "操作时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=19,min=0,message="产权证编号不能超出19位")
	@ApiModelProperty(value = "产权证编号", example = "", dataType="varchar(19)", required = true )
    private String houseno;

	@Length(max=600,min=0,message="情况说明不能超出600位")
	@ApiModelProperty(value = "情况说明", example = "", dataType="varchar(600)", required = true )
    private String description;

	@Length(max=19,min=0,message="土地证编号不能超出19位")
	@ApiModelProperty(value = "土地证编号", example = "", dataType="varchar(19)", required = true )
    private String landcertificateno;

	@Length(max=1,min=0,message="是否有土地证不能超出1位")
	@ApiModelProperty(value = "是否有土地证", example = "", dataType="varchar(1)", required = true )
    private String islandcertificate;

	@Length(max=9,min=0,message="产权证类型不能超出9位")
	@ApiModelProperty(value = "产权证类型", example = "", dataType="varchar(9)", required = true )
    private String propertytype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMortgagetype() {
        return mortgagetype;
    }

    public void setMortgagetype(String mortgagetype) {
        this.mortgagetype = mortgagetype == null ? null : mortgagetype.trim();
    }

    public String getPropertyowner() {
        return propertyowner;
    }

    public void setPropertyowner(String propertyowner) {
        this.propertyowner = propertyowner == null ? null : propertyowner.trim();
    }

    public String getHouseaddressprovince() {
        return houseaddressprovince;
    }

    public void setHouseaddressprovince(String houseaddressprovince) {
        this.houseaddressprovince = houseaddressprovince == null ? null : houseaddressprovince.trim();
    }

    public String getHouseaddresscity() {
        return houseaddresscity;
    }

    public void setHouseaddresscity(String houseaddresscity) {
        this.houseaddresscity = houseaddresscity == null ? null : houseaddresscity.trim();
    }

    public String getHouseaddressarea() {
        return houseaddressarea;
    }

    public void setHouseaddressarea(String houseaddressarea) {
        this.houseaddressarea = houseaddressarea == null ? null : houseaddressarea.trim();
    }

    public String getHouseaddressdetail() {
        return houseaddressdetail;
    }

    public void setHouseaddressdetail(String houseaddressdetail) {
        this.houseaddressdetail = houseaddressdetail == null ? null : houseaddressdetail.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getMartgagename() {
        return martgagename;
    }

    public void setMartgagename(String martgagename) {
        this.martgagename = martgagename == null ? null : martgagename.trim();
    }

    public String getFloorarea() {
        return floorarea;
    }

    public void setFloorarea(String floorarea) {
        this.floorarea = floorarea == null ? null : floorarea.trim();
    }

    public String getLanduseage() {
        return landuseage;
    }

    public void setLanduseage(String landuseage) {
        this.landuseage = landuseage == null ? null : landuseage.trim();
    }

    public Date getLanduseenddate() {
        return landuseenddate;
    }

    public void setLanduseenddate(Date landuseenddate) {
        this.landuseenddate = landuseenddate;
    }

    public Date getLandusestartdate() {
        return landusestartdate;
    }

    public void setLandusestartdate(Date landusestartdate) {
        this.landusestartdate = landusestartdate;
    }

    public String getMortgagefirsttype() {
        return mortgagefirsttype;
    }

    public void setMortgagefirsttype(String mortgagefirsttype) {
        this.mortgagefirsttype = mortgagefirsttype == null ? null : mortgagefirsttype.trim();
    }

    public String getMortgagesecondtype() {
        return mortgagesecondtype;
    }

    public void setMortgagesecondtype(String mortgagesecondtype) {
        this.mortgagesecondtype = mortgagesecondtype == null ? null : mortgagesecondtype.trim();
    }

    public String getOtherlandpurpose() {
        return otherlandpurpose;
    }

    public void setOtherlandpurpose(String otherlandpurpose) {
        this.otherlandpurpose = otherlandpurpose == null ? null : otherlandpurpose.trim();
    }

    public String getLandpurpose() {
        return landpurpose;
    }

    public void setLandpurpose(String landpurpose) {
        this.landpurpose = landpurpose == null ? null : landpurpose.trim();
    }

    public String getOtherhousepurpose() {
        return otherhousepurpose;
    }

    public void setOtherhousepurpose(String otherhousepurpose) {
        this.otherhousepurpose = otherhousepurpose == null ? null : otherhousepurpose.trim();
    }

    public String getHousepurpose() {
        return housepurpose;
    }

    public void setHousepurpose(String housepurpose) {
        this.housepurpose = housepurpose == null ? null : housepurpose.trim();
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public Date getHousefinishdate() {
        return housefinishdate;
    }

    public void setHousefinishdate(Date housefinishdate) {
        this.housefinishdate = housefinishdate;
    }

    public Date getBuyhousedate() {
        return buyhousedate;
    }

    public void setBuyhousedate(Date buyhousedate) {
        this.buyhousedate = buyhousedate;
    }

    public String getHouseage() {
        return houseage;
    }

    public void setHouseage(String houseage) {
        this.houseage = houseage == null ? null : houseage.trim();
    }

    public String getLandproperty() {
        return landproperty;
    }

    public void setLandproperty(String landproperty) {
        this.landproperty = landproperty == null ? null : landproperty.trim();
    }

    public String getHouseproperty() {
        return houseproperty;
    }

    public void setHouseproperty(String houseproperty) {
        this.houseproperty = houseproperty == null ? null : houseproperty.trim();
    }

    public String getPropertystate() {
        return propertystate;
    }

    public void setPropertystate(String propertystate) {
        this.propertystate = propertystate == null ? null : propertystate.trim();
    }

    public String getNousetime() {
        return nousetime;
    }

    public void setNousetime(String nousetime) {
        this.nousetime = nousetime == null ? null : nousetime.trim();
    }

    public String getNousearea() {
        return nousearea;
    }

    public void setNousearea(String nousearea) {
        this.nousearea = nousearea == null ? null : nousearea.trim();
    }

    public BigDecimal getNetreportamount() {
        return netreportamount;
    }

    public void setNetreportamount(BigDecimal netreportamount) {
        this.netreportamount = netreportamount;
    }

    public BigDecimal getNetreportprice() {
        return netreportprice;
    }

    public void setNetreportprice(BigDecimal netreportprice) {
        this.netreportprice = netreportprice;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getHousesoloflg() {
        return housesoloflg;
    }

    public void setHousesoloflg(String housesoloflg) {
        this.housesoloflg = housesoloflg == null ? null : housesoloflg.trim();
    }

    public String getCertificateurl() {
        return certificateurl;
    }

    public void setCertificateurl(String certificateurl) {
        this.certificateurl = certificateurl == null ? null : certificateurl.trim();
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

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno == null ? null : houseno.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLandcertificateno() {
        return landcertificateno;
    }

    public void setLandcertificateno(String landcertificateno) {
        this.landcertificateno = landcertificateno == null ? null : landcertificateno.trim();
    }

    public String getIslandcertificate() {
        return islandcertificate;
    }

    public void setIslandcertificate(String islandcertificate) {
        this.islandcertificate = islandcertificate == null ? null : islandcertificate.trim();
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype == null ? null : propertytype.trim();
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
        Mortgage other = (Mortgage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMortgagetype() == null ? other.getMortgagetype() == null : this.getMortgagetype().equals(other.getMortgagetype()))
            && (this.getPropertyowner() == null ? other.getPropertyowner() == null : this.getPropertyowner().equals(other.getPropertyowner()))
            && (this.getHouseaddressprovince() == null ? other.getHouseaddressprovince() == null : this.getHouseaddressprovince().equals(other.getHouseaddressprovince()))
            && (this.getHouseaddresscity() == null ? other.getHouseaddresscity() == null : this.getHouseaddresscity().equals(other.getHouseaddresscity()))
            && (this.getHouseaddressarea() == null ? other.getHouseaddressarea() == null : this.getHouseaddressarea().equals(other.getHouseaddressarea()))
            && (this.getHouseaddressdetail() == null ? other.getHouseaddressdetail() == null : this.getHouseaddressdetail().equals(other.getHouseaddressdetail()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getMartgagename() == null ? other.getMartgagename() == null : this.getMartgagename().equals(other.getMartgagename()))
            && (this.getFloorarea() == null ? other.getFloorarea() == null : this.getFloorarea().equals(other.getFloorarea()))
            && (this.getLanduseage() == null ? other.getLanduseage() == null : this.getLanduseage().equals(other.getLanduseage()))
            && (this.getLanduseenddate() == null ? other.getLanduseenddate() == null : this.getLanduseenddate().equals(other.getLanduseenddate()))
            && (this.getLandusestartdate() == null ? other.getLandusestartdate() == null : this.getLandusestartdate().equals(other.getLandusestartdate()))
            && (this.getMortgagefirsttype() == null ? other.getMortgagefirsttype() == null : this.getMortgagefirsttype().equals(other.getMortgagefirsttype()))
            && (this.getMortgagesecondtype() == null ? other.getMortgagesecondtype() == null : this.getMortgagesecondtype().equals(other.getMortgagesecondtype()))
            && (this.getOtherlandpurpose() == null ? other.getOtherlandpurpose() == null : this.getOtherlandpurpose().equals(other.getOtherlandpurpose()))
            && (this.getLandpurpose() == null ? other.getLandpurpose() == null : this.getLandpurpose().equals(other.getLandpurpose()))
            && (this.getOtherhousepurpose() == null ? other.getOtherhousepurpose() == null : this.getOtherhousepurpose().equals(other.getOtherhousepurpose()))
            && (this.getHousepurpose() == null ? other.getHousepurpose() == null : this.getHousepurpose().equals(other.getHousepurpose()))
            && (this.getRegistrationdate() == null ? other.getRegistrationdate() == null : this.getRegistrationdate().equals(other.getRegistrationdate()))
            && (this.getHousefinishdate() == null ? other.getHousefinishdate() == null : this.getHousefinishdate().equals(other.getHousefinishdate()))
            && (this.getBuyhousedate() == null ? other.getBuyhousedate() == null : this.getBuyhousedate().equals(other.getBuyhousedate()))
            && (this.getHouseage() == null ? other.getHouseage() == null : this.getHouseage().equals(other.getHouseage()))
            && (this.getLandproperty() == null ? other.getLandproperty() == null : this.getLandproperty().equals(other.getLandproperty()))
            && (this.getHouseproperty() == null ? other.getHouseproperty() == null : this.getHouseproperty().equals(other.getHouseproperty()))
            && (this.getPropertystate() == null ? other.getPropertystate() == null : this.getPropertystate().equals(other.getPropertystate()))
            && (this.getNousetime() == null ? other.getNousetime() == null : this.getNousetime().equals(other.getNousetime()))
            && (this.getNousearea() == null ? other.getNousearea() == null : this.getNousearea().equals(other.getNousearea()))
            && (this.getNetreportamount() == null ? other.getNetreportamount() == null : this.getNetreportamount().equals(other.getNetreportamount()))
            && (this.getNetreportprice() == null ? other.getNetreportprice() == null : this.getNetreportprice().equals(other.getNetreportprice()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getHousesoloflg() == null ? other.getHousesoloflg() == null : this.getHousesoloflg().equals(other.getHousesoloflg()))
            && (this.getCertificateurl() == null ? other.getCertificateurl() == null : this.getCertificateurl().equals(other.getCertificateurl()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getHouseno() == null ? other.getHouseno() == null : this.getHouseno().equals(other.getHouseno()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLandcertificateno() == null ? other.getLandcertificateno() == null : this.getLandcertificateno().equals(other.getLandcertificateno()))
            && (this.getIslandcertificate() == null ? other.getIslandcertificate() == null : this.getIslandcertificate().equals(other.getIslandcertificate()))
            && (this.getPropertytype() == null ? other.getPropertytype() == null : this.getPropertytype().equals(other.getPropertytype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMortgagetype() == null) ? 0 : getMortgagetype().hashCode());
        result = prime * result + ((getPropertyowner() == null) ? 0 : getPropertyowner().hashCode());
        result = prime * result + ((getHouseaddressprovince() == null) ? 0 : getHouseaddressprovince().hashCode());
        result = prime * result + ((getHouseaddresscity() == null) ? 0 : getHouseaddresscity().hashCode());
        result = prime * result + ((getHouseaddressarea() == null) ? 0 : getHouseaddressarea().hashCode());
        result = prime * result + ((getHouseaddressdetail() == null) ? 0 : getHouseaddressdetail().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getMartgagename() == null) ? 0 : getMartgagename().hashCode());
        result = prime * result + ((getFloorarea() == null) ? 0 : getFloorarea().hashCode());
        result = prime * result + ((getLanduseage() == null) ? 0 : getLanduseage().hashCode());
        result = prime * result + ((getLanduseenddate() == null) ? 0 : getLanduseenddate().hashCode());
        result = prime * result + ((getLandusestartdate() == null) ? 0 : getLandusestartdate().hashCode());
        result = prime * result + ((getMortgagefirsttype() == null) ? 0 : getMortgagefirsttype().hashCode());
        result = prime * result + ((getMortgagesecondtype() == null) ? 0 : getMortgagesecondtype().hashCode());
        result = prime * result + ((getOtherlandpurpose() == null) ? 0 : getOtherlandpurpose().hashCode());
        result = prime * result + ((getLandpurpose() == null) ? 0 : getLandpurpose().hashCode());
        result = prime * result + ((getOtherhousepurpose() == null) ? 0 : getOtherhousepurpose().hashCode());
        result = prime * result + ((getHousepurpose() == null) ? 0 : getHousepurpose().hashCode());
        result = prime * result + ((getRegistrationdate() == null) ? 0 : getRegistrationdate().hashCode());
        result = prime * result + ((getHousefinishdate() == null) ? 0 : getHousefinishdate().hashCode());
        result = prime * result + ((getBuyhousedate() == null) ? 0 : getBuyhousedate().hashCode());
        result = prime * result + ((getHouseage() == null) ? 0 : getHouseage().hashCode());
        result = prime * result + ((getLandproperty() == null) ? 0 : getLandproperty().hashCode());
        result = prime * result + ((getHouseproperty() == null) ? 0 : getHouseproperty().hashCode());
        result = prime * result + ((getPropertystate() == null) ? 0 : getPropertystate().hashCode());
        result = prime * result + ((getNousetime() == null) ? 0 : getNousetime().hashCode());
        result = prime * result + ((getNousearea() == null) ? 0 : getNousearea().hashCode());
        result = prime * result + ((getNetreportamount() == null) ? 0 : getNetreportamount().hashCode());
        result = prime * result + ((getNetreportprice() == null) ? 0 : getNetreportprice().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getHousesoloflg() == null) ? 0 : getHousesoloflg().hashCode());
        result = prime * result + ((getCertificateurl() == null) ? 0 : getCertificateurl().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getHouseno() == null) ? 0 : getHouseno().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLandcertificateno() == null) ? 0 : getLandcertificateno().hashCode());
        result = prime * result + ((getIslandcertificate() == null) ? 0 : getIslandcertificate().hashCode());
        result = prime * result + ((getPropertytype() == null) ? 0 : getPropertytype().hashCode());
        return result;
    }
}
