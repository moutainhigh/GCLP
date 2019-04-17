package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//申请人信息表（公司）
public class Applyinfoofcom implements Serializable {
	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=30,min=0,message="统一社会信用代码不能超出30位")
	@ApiModelProperty(value = "统一社会信用代码", example = "", dataType="varchar(30)", required = true )
    private String socialcreditcode;

	@Length(max=30,min=0,message="申请人类型不能超出30位")
	@ApiModelProperty(value = "申请人类型", example = "", dataType="varchar(30)", required = true )
    private String applyertype;

	@Length(max=80,min=0,message="申请主体不能超出80位")
	@ApiModelProperty(value = "申请主体", example = "", dataType="varchar(80)", required = true )
    private String applymainbody;

	@Length(max=80,min=0,message="企业名称不能超出80位")
	@ApiModelProperty(value = "企业名称", example = "", dataType="varchar(80)", required = true )
    private String orgname;

	@Length(max=20,min=0,message="经营类型不能超出20位")
	@ApiModelProperty(value = "经营类型", example = "", dataType="varchar(20)", required = true )
    private String managetype;

	@Length(max=80,min=0,message="法定代表人不能超出80位")
	@ApiModelProperty(value = "法定代表人", example = "", dataType="varchar(80)", required = true )
    private String juridical;

	@ApiModelProperty(value = "公司成立日期", example = "", dataType="datetime", required = true )
    private Date comstartdate;

	@ApiModelProperty(value = "营业期限至", example = "", dataType="datetime", required = true )
    private Date comenddate;

	@Length(max=17,min=0,message="注册资本不能超出17位")
	@ApiModelProperty(value = "注册资本", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal registcapital;

	@Length(max=17,min=0,message="认缴资本不能超出17位")
	@ApiModelProperty(value = "认缴资本", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal contricapital;

	@Length(max=300,min=0,message="公司注册地址详细地址不能超出300位")
	@ApiModelProperty(value = "公司注册地址详细地址", example = "", dataType="varchar(300)", required = true )
    private String comaddress;

	@Length(max=10,min=0,message="公司注册地址区不能超出10位")
	@ApiModelProperty(value = "公司注册地址区", example = "", dataType="varchar(10)", required = true )
    private String comaddressarea;

	@Length(max=30,min=0,message="公司注册地址城市不能超出30位")
	@ApiModelProperty(value = "公司注册地址城市", example = "", dataType="varchar(30)", required = true )
    private String comaddresscity;

	@Length(max=30,min=0,message="公司注册地址省份不能超出30位")
	@ApiModelProperty(value = "公司注册地址省份", example = "", dataType="varchar(30)", required = true )
    private String comaddressprovince;

	@Length(max=300,min=0,message="公司实际经营地址不能超出300位")
	@ApiModelProperty(value = "公司实际经营地址", example = "", dataType="varchar(300)", required = true )
    private String realcomaddress;

	@Length(max=30,min=0,message="公司实际经营地址区不能超出30位")
	@ApiModelProperty(value = "公司实际经营地址区", example = "", dataType="varchar(30)", required = true )
    private String realcomaddressarea;

	@Length(max=30,min=0,message="公司实际经营地址城市不能超出30位")
	@ApiModelProperty(value = "公司实际经营地址城市", example = "", dataType="varchar(30)", required = true )
    private String realcomaddresscity;

	@Length(max=30,min=0,message="公司实际经营地址省份不能超出30位")
	@ApiModelProperty(value = "公司实际经营地址省份", example = "", dataType="varchar(30)", required = true )
    private String realcomaddressprovince;

	@Length(max=80,min=0,message="经营范围不能超出80位")
	@ApiModelProperty(value = "经营范围", example = "", dataType="varchar(80)", required = true )
    private String managearea;

	@Length(max=6,min=0,message="行业分类不能超出6位")
	@ApiModelProperty(value = "行业分类", example = "", dataType="varchar(6)", required = true )
    private String industrysecond;

	@Length(max=6,min=0,message="行业分类不能超出6位")
	@ApiModelProperty(value = "行业分类", example = "", dataType="varchar(6)", required = true )
    private String industryfirst;

	@Length(max=80,min=0,message="主要产品及业务不能超出80位")
	@ApiModelProperty(value = "主要产品及业务", example = "", dataType="varchar(80)", required = true )
    private String mianbusiness;

	@Length(max=80,min=0,message="主要供应商不能超出80位")
	@ApiModelProperty(value = "主要供应商", example = "", dataType="varchar(80)", required = true )
    private String mainsupplier;

	@Length(max=80,min=0,message="主要客户不能超出80位")
	@ApiModelProperty(value = "主要客户", example = "", dataType="varchar(80)", required = true )
    private String maincustomer;

	@Length(max=1000,min=0,message="法人信息备注不能超出1000位")
	@ApiModelProperty(value = "法人信息备注", example = "", dataType="varchar(1000)", required = true )
    private String shareremark;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getSocialcreditcode() {
        return socialcreditcode;
    }

    public void setSocialcreditcode(String socialcreditcode) {
        this.socialcreditcode = socialcreditcode == null ? null : socialcreditcode.trim();
    }

    public String getApplyertype() {
        return applyertype;
    }

    public void setApplyertype(String applyertype) {
        this.applyertype = applyertype == null ? null : applyertype.trim();
    }

    public String getApplymainbody() {
        return applymainbody;
    }

    public void setApplymainbody(String applymainbody) {
        this.applymainbody = applymainbody == null ? null : applymainbody.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getManagetype() {
        return managetype;
    }

    public void setManagetype(String managetype) {
        this.managetype = managetype == null ? null : managetype.trim();
    }

    public String getJuridical() {
        return juridical;
    }

    public void setJuridical(String juridical) {
        this.juridical = juridical == null ? null : juridical.trim();
    }

    public Date getComstartdate() {
        return comstartdate;
    }

    public void setComstartdate(Date comstartdate) {
        this.comstartdate = comstartdate;
    }

    public Date getComenddate() {
        return comenddate;
    }

    public void setComenddate(Date comenddate) {
        this.comenddate = comenddate;
    }

    public BigDecimal getRegistcapital() {
        return registcapital;
    }

    public void setRegistcapital(BigDecimal registcapital) {
        this.registcapital = registcapital;
    }

    public BigDecimal getContricapital() {
        return contricapital;
    }

    public void setContricapital(BigDecimal contricapital) {
        this.contricapital = contricapital;
    }

    public String getComaddress() {
        return comaddress;
    }

    public void setComaddress(String comaddress) {
        this.comaddress = comaddress == null ? null : comaddress.trim();
    }

    public String getComaddressarea() {
        return comaddressarea;
    }

    public void setComaddressarea(String comaddressarea) {
        this.comaddressarea = comaddressarea == null ? null : comaddressarea.trim();
    }

    public String getComaddresscity() {
        return comaddresscity;
    }

    public void setComaddresscity(String comaddresscity) {
        this.comaddresscity = comaddresscity == null ? null : comaddresscity.trim();
    }

    public String getComaddressprovince() {
        return comaddressprovince;
    }

    public void setComaddressprovince(String comaddressprovince) {
        this.comaddressprovince = comaddressprovince == null ? null : comaddressprovince.trim();
    }

    public String getRealcomaddress() {
        return realcomaddress;
    }

    public void setRealcomaddress(String realcomaddress) {
        this.realcomaddress = realcomaddress == null ? null : realcomaddress.trim();
    }

    public String getRealcomaddressarea() {
        return realcomaddressarea;
    }

    public void setRealcomaddressarea(String realcomaddressarea) {
        this.realcomaddressarea = realcomaddressarea == null ? null : realcomaddressarea.trim();
    }

    public String getRealcomaddresscity() {
        return realcomaddresscity;
    }

    public void setRealcomaddresscity(String realcomaddresscity) {
        this.realcomaddresscity = realcomaddresscity == null ? null : realcomaddresscity.trim();
    }

    public String getRealcomaddressprovince() {
        return realcomaddressprovince;
    }

    public void setRealcomaddressprovince(String realcomaddressprovince) {
        this.realcomaddressprovince = realcomaddressprovince == null ? null : realcomaddressprovince.trim();
    }

    public String getManagearea() {
        return managearea;
    }

    public void setManagearea(String managearea) {
        this.managearea = managearea == null ? null : managearea.trim();
    }

    public String getIndustrysecond() {
        return industrysecond;
    }

    public void setIndustrysecond(String industrysecond) {
        this.industrysecond = industrysecond == null ? null : industrysecond.trim();
    }

    public String getIndustryfirst() {
        return industryfirst;
    }

    public void setIndustryfirst(String industryfirst) {
        this.industryfirst = industryfirst == null ? null : industryfirst.trim();
    }

    public String getMianbusiness() {
        return mianbusiness;
    }

    public void setMianbusiness(String mianbusiness) {
        this.mianbusiness = mianbusiness == null ? null : mianbusiness.trim();
    }

    public String getMainsupplier() {
        return mainsupplier;
    }

    public void setMainsupplier(String mainsupplier) {
        this.mainsupplier = mainsupplier == null ? null : mainsupplier.trim();
    }

    public String getMaincustomer() {
        return maincustomer;
    }

    public void setMaincustomer(String maincustomer) {
        this.maincustomer = maincustomer == null ? null : maincustomer.trim();
    }

    public String getShareremark() {
        return shareremark;
    }

    public void setShareremark(String shareremark) {
        this.shareremark = shareremark == null ? null : shareremark.trim();
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
        Applyinfoofcom other = (Applyinfoofcom) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getSocialcreditcode() == null ? other.getSocialcreditcode() == null : this.getSocialcreditcode().equals(other.getSocialcreditcode()))
            && (this.getApplyertype() == null ? other.getApplyertype() == null : this.getApplyertype().equals(other.getApplyertype()))
            && (this.getApplymainbody() == null ? other.getApplymainbody() == null : this.getApplymainbody().equals(other.getApplymainbody()))
            && (this.getOrgname() == null ? other.getOrgname() == null : this.getOrgname().equals(other.getOrgname()))
            && (this.getManagetype() == null ? other.getManagetype() == null : this.getManagetype().equals(other.getManagetype()))
            && (this.getJuridical() == null ? other.getJuridical() == null : this.getJuridical().equals(other.getJuridical()))
            && (this.getComstartdate() == null ? other.getComstartdate() == null : this.getComstartdate().equals(other.getComstartdate()))
            && (this.getComenddate() == null ? other.getComenddate() == null : this.getComenddate().equals(other.getComenddate()))
            && (this.getRegistcapital() == null ? other.getRegistcapital() == null : this.getRegistcapital().equals(other.getRegistcapital()))
            && (this.getContricapital() == null ? other.getContricapital() == null : this.getContricapital().equals(other.getContricapital()))
            && (this.getComaddress() == null ? other.getComaddress() == null : this.getComaddress().equals(other.getComaddress()))
            && (this.getComaddressarea() == null ? other.getComaddressarea() == null : this.getComaddressarea().equals(other.getComaddressarea()))
            && (this.getComaddresscity() == null ? other.getComaddresscity() == null : this.getComaddresscity().equals(other.getComaddresscity()))
            && (this.getComaddressprovince() == null ? other.getComaddressprovince() == null : this.getComaddressprovince().equals(other.getComaddressprovince()))
            && (this.getRealcomaddress() == null ? other.getRealcomaddress() == null : this.getRealcomaddress().equals(other.getRealcomaddress()))
            && (this.getRealcomaddressarea() == null ? other.getRealcomaddressarea() == null : this.getRealcomaddressarea().equals(other.getRealcomaddressarea()))
            && (this.getRealcomaddresscity() == null ? other.getRealcomaddresscity() == null : this.getRealcomaddresscity().equals(other.getRealcomaddresscity()))
            && (this.getRealcomaddressprovince() == null ? other.getRealcomaddressprovince() == null : this.getRealcomaddressprovince().equals(other.getRealcomaddressprovince()))
            && (this.getManagearea() == null ? other.getManagearea() == null : this.getManagearea().equals(other.getManagearea()))
            && (this.getIndustrysecond() == null ? other.getIndustrysecond() == null : this.getIndustrysecond().equals(other.getIndustrysecond()))
            && (this.getIndustryfirst() == null ? other.getIndustryfirst() == null : this.getIndustryfirst().equals(other.getIndustryfirst()))
            && (this.getMianbusiness() == null ? other.getMianbusiness() == null : this.getMianbusiness().equals(other.getMianbusiness()))
            && (this.getMainsupplier() == null ? other.getMainsupplier() == null : this.getMainsupplier().equals(other.getMainsupplier()))
            && (this.getMaincustomer() == null ? other.getMaincustomer() == null : this.getMaincustomer().equals(other.getMaincustomer()))
            && (this.getShareremark() == null ? other.getShareremark() == null : this.getShareremark().equals(other.getShareremark()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getSocialcreditcode() == null) ? 0 : getSocialcreditcode().hashCode());
        result = prime * result + ((getApplyertype() == null) ? 0 : getApplyertype().hashCode());
        result = prime * result + ((getApplymainbody() == null) ? 0 : getApplymainbody().hashCode());
        result = prime * result + ((getOrgname() == null) ? 0 : getOrgname().hashCode());
        result = prime * result + ((getManagetype() == null) ? 0 : getManagetype().hashCode());
        result = prime * result + ((getJuridical() == null) ? 0 : getJuridical().hashCode());
        result = prime * result + ((getComstartdate() == null) ? 0 : getComstartdate().hashCode());
        result = prime * result + ((getComenddate() == null) ? 0 : getComenddate().hashCode());
        result = prime * result + ((getRegistcapital() == null) ? 0 : getRegistcapital().hashCode());
        result = prime * result + ((getContricapital() == null) ? 0 : getContricapital().hashCode());
        result = prime * result + ((getComaddress() == null) ? 0 : getComaddress().hashCode());
        result = prime * result + ((getComaddressarea() == null) ? 0 : getComaddressarea().hashCode());
        result = prime * result + ((getComaddresscity() == null) ? 0 : getComaddresscity().hashCode());
        result = prime * result + ((getComaddressprovince() == null) ? 0 : getComaddressprovince().hashCode());
        result = prime * result + ((getRealcomaddress() == null) ? 0 : getRealcomaddress().hashCode());
        result = prime * result + ((getRealcomaddressarea() == null) ? 0 : getRealcomaddressarea().hashCode());
        result = prime * result + ((getRealcomaddresscity() == null) ? 0 : getRealcomaddresscity().hashCode());
        result = prime * result + ((getRealcomaddressprovince() == null) ? 0 : getRealcomaddressprovince().hashCode());
        result = prime * result + ((getManagearea() == null) ? 0 : getManagearea().hashCode());
        result = prime * result + ((getIndustrysecond() == null) ? 0 : getIndustrysecond().hashCode());
        result = prime * result + ((getIndustryfirst() == null) ? 0 : getIndustryfirst().hashCode());
        result = prime * result + ((getMianbusiness() == null) ? 0 : getMianbusiness().hashCode());
        result = prime * result + ((getMainsupplier() == null) ? 0 : getMainsupplier().hashCode());
        result = prime * result + ((getMaincustomer() == null) ? 0 : getMaincustomer().hashCode());
        result = prime * result + ((getShareremark() == null) ? 0 : getShareremark().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
