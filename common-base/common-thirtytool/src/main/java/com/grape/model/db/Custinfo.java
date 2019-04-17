package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//申请人信息表
public class Custinfo implements Serializable {
	@Length(max=10,min=0,message="贷款流水号不能超出10位")
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号不能超出32位")
	@ApiModelProperty(value = "身份证号", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="客户编号不能超出10位")
	@ApiModelProperty(value = "客户编号", example = "", dataType="varchar(10)", required = true )
    private String custno;

	@Length(max=30,min=0,message="客户类型不能超出30位")
	@ApiModelProperty(value = "客户类型", example = "", dataType="varchar(30)", required = true )
    private String custtype;

	@Length(max=80,min=0,message="客户姓名不能超出80位")
	@ApiModelProperty(value = "客户姓名", example = "", dataType="varchar(80)", required = true )
    private String custname;

	@Length(max=1,min=0,message="性别不能超出1位")
	@ApiModelProperty(value = "性别", example = "", dataType="varchar(1)", required = true )
    private String sex;

	@Length(max=10,min=0,message="证件类型不能超出10位")
	@ApiModelProperty(value = "证件类型", example = "", dataType="varchar(10)", required = true )
    private String cerdtype;

	@ApiModelProperty(value = "出生年月", example = "", dataType="datetime", required = true )
    private Date birthday;

	@Length(max=20,min=0,message="电话号码不能超出20位")
	@ApiModelProperty(value = "电话号码", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=80,min=0,message="家庭住址省份不能超出80位")
	@ApiModelProperty(value = "家庭住址省份", example = "", dataType="varchar(80)", required = true )
    private String familyaddressprovince;

	@Length(max=80,min=0,message="家庭住址市区不能超出80位")
	@ApiModelProperty(value = "家庭住址市区", example = "", dataType="varchar(80)", required = true )
    private String familyaddresscity;

	@Length(max=80,min=0,message="家庭住址区不能超出80位")
	@ApiModelProperty(value = "家庭住址区", example = "", dataType="varchar(80)", required = true )
    private String familyaddressarea;

	@Length(max=120,min=0,message="家庭住址详细信息不能超出120位")
	@ApiModelProperty(value = "家庭住址详细信息", example = "", dataType="varchar(120)", required = true )
    private String familyaddressdetail;

	@Length(max=4,min=0,message="年龄不能超出4位")
	@ApiModelProperty(value = "年龄", example = "", dataType="varchar(4)", required = true )
    private String age;

	@Length(max=80,min=0,message="户籍省份不能超出80位")
	@ApiModelProperty(value = "户籍省份", example = "", dataType="varchar(80)", required = true )
    private String censusregisterprovvince;

	@Length(max=80,min=0,message="户籍所属市区不能超出80位")
	@ApiModelProperty(value = "户籍所属市区", example = "", dataType="varchar(80)", required = true )
    private String censusregistercity;

	@Length(max=1,min=0,message="婚姻状况不能超出1位")
	@ApiModelProperty(value = "婚姻状况", example = "", dataType="char(1)", required = true )
    private String maritalstatus;

	@Length(max=1,min=0,message="是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "是否有诉讼记录", example = "", dataType="varchar(1)", required = true )
    private String islitigation;

	@Length(max=80,min=0,message="职业不能超出80位")
	@ApiModelProperty(value = "职业", example = "", dataType="varchar(80)", required = true )
    private String job;

	@ApiModelProperty(value = "操作时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="操作人不能超出8位")
	@ApiModelProperty(value = "操作人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=2,min=0,message="申请主体不能超出2位")
	@ApiModelProperty(value = "申请主体", example = "", dataType="varchar(2)", required = true )
    private String applymain;

	@Length(max=80,min=0,message="单位名称不能超出80位")
	@ApiModelProperty(value = "单位名称", example = "", dataType="varchar(80)", required = true )
    private String comname;

	@Length(max=80,min=0,message="公司性质不能超出80位")
	@ApiModelProperty(value = "公司性质", example = "", dataType="varchar(80)", required = true )
    private String comproperty1;

	@Length(max=2,min=0,message="公司性质不能超出2位")
	@ApiModelProperty(value = "公司性质", example = "", dataType="varchar(2)", required = true )
    private String comproperty;

	@Length(max=80,min=0,message="职位不能超出80位")
	@ApiModelProperty(value = "职位", example = "", dataType="varchar(80)", required = true )
    private String position;

	@Length(max=17,min=0,message="月工资收入不能超出17位")
	@ApiModelProperty(value = "月工资收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal monthincome;

	@Length(max=200,min=0,message="公司实际经营地址不能超出200位")
	@ApiModelProperty(value = "公司实际经营地址", example = "", dataType="varchar(200)", required = true )
    private String realcomaddress;

	@Length(max=17,min=0,message="营业收入不能超出17位")
	@ApiModelProperty(value = "营业收入", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal receipt;

	@Length(max=17,min=0,message="净利润不能超出17位")
	@ApiModelProperty(value = "净利润", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal netmargin;

	@Length(max=4,min=0,message="国家不能超出4位")
	@ApiModelProperty(value = "国家", example = "", dataType="varchar(4)", required = true )
    private String country;

	@Length(max=300,min=0,message="营业执照图片存放地址不能超出300位")
	@ApiModelProperty(value = "营业执照图片存放地址", example = "", dataType="varchar(300)", required = true )
    private String busilicence;

	@Length(max=300,min=0,message="身份证地址不能超出300位")
	@ApiModelProperty(value = "身份证地址", example = "", dataType="varchar(300)", required = true )
    private String cerditaddress;

	@Length(max=300,min=0,message="身份证正面图片路径不能超出300位")
	@ApiModelProperty(value = "身份证正面图片路径", example = "", dataType="varchar(300)", required = true )
    private String creditimage;

	@Length(max=300,min=0,message="身份证反面图片路径不能超出300位")
	@ApiModelProperty(value = "身份证反面图片路径", example = "", dataType="varchar(300)", required = true )
    private String creditimage2;

	@Length(max=80,min=0,message="籍贯所属省份不能超出80位")
	@ApiModelProperty(value = "籍贯所属省份", example = "", dataType="varchar(80)", required = true )
    private String nativeplaceprovince;

	@Length(max=80,min=0,message="籍贯所属城市不能超出80位")
	@ApiModelProperty(value = "籍贯所属城市", example = "", dataType="varchar(80)", required = true )
    private String nativeplacecity;

	@Length(max=80,min=0,message="籍贯所属区域不能超出80位")
	@ApiModelProperty(value = "籍贯所属区域", example = "", dataType="varchar(80)", required = true )
    private String nativeplacearea;

	@ApiModelProperty(value = "离婚时间", example = "", dataType="datetime", required = true )
    private Date discoverdate;

	@Length(max=2,min=0,message="离婚协议书不能超出2位")
	@ApiModelProperty(value = "离婚协议书", example = "", dataType="varchar(2)", required = true )
    private String discoversign;

	@Length(max=300,min=0,message="财产分配履行情况不能超出300位")
	@ApiModelProperty(value = "财产分配履行情况", example = "", dataType="varchar(300)", required = true )
    private String estatedescription;

	@Length(max=1,min=0,message="是否有子女不能超出1位")
	@ApiModelProperty(value = "是否有子女", example = "", dataType="char(1)", required = true )
    private String havachildflg;

	@Length(max=2,min=0,message="子女个数不能超出2位")
	@ApiModelProperty(value = "子女个数", example = "", dataType="varchar(2)", required = true )
    private String childcount;

	@Length(max=300,min=0,message="子女情况说明不能超出300位")
	@ApiModelProperty(value = "子女情况说明", example = "", dataType="varchar(300)", required = true )
    private String childdescription;

	@Length(max=1,min=0,message="是否从事高危行业不能超出1位")
	@ApiModelProperty(value = "是否从事高危行业", example = "", dataType="char(1)", required = true )
    private String dangerjob;

	@Length(max=4,min=0,message="与主借款人关系不能超出4位")
	@ApiModelProperty(value = "与主借款人关系", example = "", dataType="varchar(4)", required = true )
    private String relationship;

	@Length(max=32,min=0,message="配偶关联身份证号码不能超出32位")
	@ApiModelProperty(value = "配偶关联身份证号码", example = "", dataType="varchar(32)", required = true )
    private String relationcerdid;

	@Length(max=1,min=0,message="是否是配偶不能超出1位")
	@ApiModelProperty(value = "是否是配偶", example = "", dataType="char(1)", required = true )
    private String ismarrow;

	@Length(max=1,min=0,message="公司是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "公司是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String comhavelitigat;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String comhavalitigat;

	@Length(max=1000,min=0,message="职业情况说明不能超出1000位")
	@ApiModelProperty(value = "职业情况说明", example = "", dataType="varchar(1000)", required = true )
    private String jobnation;

	@ApiModelProperty(value = "业务描述", example = "", dataType="text", required = true )
    private String busdescription;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getCerdid() {
        return cerdid;
    }

    public void setCerdid(String cerdid) {
        this.cerdid = cerdid == null ? null : cerdid.trim();
    }

    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno == null ? null : custno.trim();
    }

    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype == null ? null : custtype.trim();
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCerdtype() {
        return cerdtype;
    }

    public void setCerdtype(String cerdtype) {
        this.cerdtype = cerdtype == null ? null : cerdtype.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getFamilyaddressprovince() {
        return familyaddressprovince;
    }

    public void setFamilyaddressprovince(String familyaddressprovince) {
        this.familyaddressprovince = familyaddressprovince == null ? null : familyaddressprovince.trim();
    }

    public String getFamilyaddresscity() {
        return familyaddresscity;
    }

    public void setFamilyaddresscity(String familyaddresscity) {
        this.familyaddresscity = familyaddresscity == null ? null : familyaddresscity.trim();
    }

    public String getFamilyaddressarea() {
        return familyaddressarea;
    }

    public void setFamilyaddressarea(String familyaddressarea) {
        this.familyaddressarea = familyaddressarea == null ? null : familyaddressarea.trim();
    }

    public String getFamilyaddressdetail() {
        return familyaddressdetail;
    }

    public void setFamilyaddressdetail(String familyaddressdetail) {
        this.familyaddressdetail = familyaddressdetail == null ? null : familyaddressdetail.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getCensusregisterprovvince() {
        return censusregisterprovvince;
    }

    public void setCensusregisterprovvince(String censusregisterprovvince) {
        this.censusregisterprovvince = censusregisterprovvince == null ? null : censusregisterprovvince.trim();
    }

    public String getCensusregistercity() {
        return censusregistercity;
    }

    public void setCensusregistercity(String censusregistercity) {
        this.censusregistercity = censusregistercity == null ? null : censusregistercity.trim();
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus == null ? null : maritalstatus.trim();
    }

    public String getIslitigation() {
        return islitigation;
    }

    public void setIslitigation(String islitigation) {
        this.islitigation = islitigation == null ? null : islitigation.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
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

    public String getApplymain() {
        return applymain;
    }

    public void setApplymain(String applymain) {
        this.applymain = applymain == null ? null : applymain.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public String getComproperty1() {
        return comproperty1;
    }

    public void setComproperty1(String comproperty1) {
        this.comproperty1 = comproperty1 == null ? null : comproperty1.trim();
    }

    public String getComproperty() {
        return comproperty;
    }

    public void setComproperty(String comproperty) {
        this.comproperty = comproperty == null ? null : comproperty.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public BigDecimal getMonthincome() {
        return monthincome;
    }

    public void setMonthincome(BigDecimal monthincome) {
        this.monthincome = monthincome;
    }

    public String getRealcomaddress() {
        return realcomaddress;
    }

    public void setRealcomaddress(String realcomaddress) {
        this.realcomaddress = realcomaddress == null ? null : realcomaddress.trim();
    }

    public BigDecimal getReceipt() {
        return receipt;
    }

    public void setReceipt(BigDecimal receipt) {
        this.receipt = receipt;
    }

    public BigDecimal getNetmargin() {
        return netmargin;
    }

    public void setNetmargin(BigDecimal netmargin) {
        this.netmargin = netmargin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getBusilicence() {
        return busilicence;
    }

    public void setBusilicence(String busilicence) {
        this.busilicence = busilicence == null ? null : busilicence.trim();
    }

    public String getCerditaddress() {
        return cerditaddress;
    }

    public void setCerditaddress(String cerditaddress) {
        this.cerditaddress = cerditaddress == null ? null : cerditaddress.trim();
    }

    public String getCreditimage() {
        return creditimage;
    }

    public void setCreditimage(String creditimage) {
        this.creditimage = creditimage == null ? null : creditimage.trim();
    }

    public String getCreditimage2() {
        return creditimage2;
    }

    public void setCreditimage2(String creditimage2) {
        this.creditimage2 = creditimage2 == null ? null : creditimage2.trim();
    }

    public String getNativeplaceprovince() {
        return nativeplaceprovince;
    }

    public void setNativeplaceprovince(String nativeplaceprovince) {
        this.nativeplaceprovince = nativeplaceprovince == null ? null : nativeplaceprovince.trim();
    }

    public String getNativeplacecity() {
        return nativeplacecity;
    }

    public void setNativeplacecity(String nativeplacecity) {
        this.nativeplacecity = nativeplacecity == null ? null : nativeplacecity.trim();
    }

    public String getNativeplacearea() {
        return nativeplacearea;
    }

    public void setNativeplacearea(String nativeplacearea) {
        this.nativeplacearea = nativeplacearea == null ? null : nativeplacearea.trim();
    }

    public Date getDiscoverdate() {
        return discoverdate;
    }

    public void setDiscoverdate(Date discoverdate) {
        this.discoverdate = discoverdate;
    }

    public String getDiscoversign() {
        return discoversign;
    }

    public void setDiscoversign(String discoversign) {
        this.discoversign = discoversign == null ? null : discoversign.trim();
    }

    public String getEstatedescription() {
        return estatedescription;
    }

    public void setEstatedescription(String estatedescription) {
        this.estatedescription = estatedescription == null ? null : estatedescription.trim();
    }

    public String getHavachildflg() {
        return havachildflg;
    }

    public void setHavachildflg(String havachildflg) {
        this.havachildflg = havachildflg == null ? null : havachildflg.trim();
    }

    public String getChildcount() {
        return childcount;
    }

    public void setChildcount(String childcount) {
        this.childcount = childcount == null ? null : childcount.trim();
    }

    public String getChilddescription() {
        return childdescription;
    }

    public void setChilddescription(String childdescription) {
        this.childdescription = childdescription == null ? null : childdescription.trim();
    }

    public String getDangerjob() {
        return dangerjob;
    }

    public void setDangerjob(String dangerjob) {
        this.dangerjob = dangerjob == null ? null : dangerjob.trim();
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public String getRelationcerdid() {
        return relationcerdid;
    }

    public void setRelationcerdid(String relationcerdid) {
        this.relationcerdid = relationcerdid == null ? null : relationcerdid.trim();
    }

    public String getIsmarrow() {
        return ismarrow;
    }

    public void setIsmarrow(String ismarrow) {
        this.ismarrow = ismarrow == null ? null : ismarrow.trim();
    }

    public String getComhavelitigat() {
        return comhavelitigat;
    }

    public void setComhavelitigat(String comhavelitigat) {
        this.comhavelitigat = comhavelitigat == null ? null : comhavelitigat.trim();
    }

    public String getComhavalitigat() {
        return comhavalitigat;
    }

    public void setComhavalitigat(String comhavalitigat) {
        this.comhavalitigat = comhavalitigat == null ? null : comhavalitigat.trim();
    }

    public String getJobnation() {
        return jobnation;
    }

    public void setJobnation(String jobnation) {
        this.jobnation = jobnation == null ? null : jobnation.trim();
    }

    public String getBusdescription() {
        return busdescription;
    }

    public void setBusdescription(String busdescription) {
        this.busdescription = busdescription == null ? null : busdescription.trim();
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
        Custinfo other = (Custinfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getCustno() == null ? other.getCustno() == null : this.getCustno().equals(other.getCustno()))
            && (this.getCusttype() == null ? other.getCusttype() == null : this.getCusttype().equals(other.getCusttype()))
            && (this.getCustname() == null ? other.getCustname() == null : this.getCustname().equals(other.getCustname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCerdtype() == null ? other.getCerdtype() == null : this.getCerdtype().equals(other.getCerdtype()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getTelnumber() == null ? other.getTelnumber() == null : this.getTelnumber().equals(other.getTelnumber()))
            && (this.getFamilyaddressprovince() == null ? other.getFamilyaddressprovince() == null : this.getFamilyaddressprovince().equals(other.getFamilyaddressprovince()))
            && (this.getFamilyaddresscity() == null ? other.getFamilyaddresscity() == null : this.getFamilyaddresscity().equals(other.getFamilyaddresscity()))
            && (this.getFamilyaddressarea() == null ? other.getFamilyaddressarea() == null : this.getFamilyaddressarea().equals(other.getFamilyaddressarea()))
            && (this.getFamilyaddressdetail() == null ? other.getFamilyaddressdetail() == null : this.getFamilyaddressdetail().equals(other.getFamilyaddressdetail()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getCensusregisterprovvince() == null ? other.getCensusregisterprovvince() == null : this.getCensusregisterprovvince().equals(other.getCensusregisterprovvince()))
            && (this.getCensusregistercity() == null ? other.getCensusregistercity() == null : this.getCensusregistercity().equals(other.getCensusregistercity()))
            && (this.getMaritalstatus() == null ? other.getMaritalstatus() == null : this.getMaritalstatus().equals(other.getMaritalstatus()))
            && (this.getIslitigation() == null ? other.getIslitigation() == null : this.getIslitigation().equals(other.getIslitigation()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getApplymain() == null ? other.getApplymain() == null : this.getApplymain().equals(other.getApplymain()))
            && (this.getComname() == null ? other.getComname() == null : this.getComname().equals(other.getComname()))
            && (this.getComproperty1() == null ? other.getComproperty1() == null : this.getComproperty1().equals(other.getComproperty1()))
            && (this.getComproperty() == null ? other.getComproperty() == null : this.getComproperty().equals(other.getComproperty()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getMonthincome() == null ? other.getMonthincome() == null : this.getMonthincome().equals(other.getMonthincome()))
            && (this.getRealcomaddress() == null ? other.getRealcomaddress() == null : this.getRealcomaddress().equals(other.getRealcomaddress()))
            && (this.getReceipt() == null ? other.getReceipt() == null : this.getReceipt().equals(other.getReceipt()))
            && (this.getNetmargin() == null ? other.getNetmargin() == null : this.getNetmargin().equals(other.getNetmargin()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getBusilicence() == null ? other.getBusilicence() == null : this.getBusilicence().equals(other.getBusilicence()))
            && (this.getCerditaddress() == null ? other.getCerditaddress() == null : this.getCerditaddress().equals(other.getCerditaddress()))
            && (this.getCreditimage() == null ? other.getCreditimage() == null : this.getCreditimage().equals(other.getCreditimage()))
            && (this.getCreditimage2() == null ? other.getCreditimage2() == null : this.getCreditimage2().equals(other.getCreditimage2()))
            && (this.getNativeplaceprovince() == null ? other.getNativeplaceprovince() == null : this.getNativeplaceprovince().equals(other.getNativeplaceprovince()))
            && (this.getNativeplacecity() == null ? other.getNativeplacecity() == null : this.getNativeplacecity().equals(other.getNativeplacecity()))
            && (this.getNativeplacearea() == null ? other.getNativeplacearea() == null : this.getNativeplacearea().equals(other.getNativeplacearea()))
            && (this.getDiscoverdate() == null ? other.getDiscoverdate() == null : this.getDiscoverdate().equals(other.getDiscoverdate()))
            && (this.getDiscoversign() == null ? other.getDiscoversign() == null : this.getDiscoversign().equals(other.getDiscoversign()))
            && (this.getEstatedescription() == null ? other.getEstatedescription() == null : this.getEstatedescription().equals(other.getEstatedescription()))
            && (this.getHavachildflg() == null ? other.getHavachildflg() == null : this.getHavachildflg().equals(other.getHavachildflg()))
            && (this.getChildcount() == null ? other.getChildcount() == null : this.getChildcount().equals(other.getChildcount()))
            && (this.getChilddescription() == null ? other.getChilddescription() == null : this.getChilddescription().equals(other.getChilddescription()))
            && (this.getDangerjob() == null ? other.getDangerjob() == null : this.getDangerjob().equals(other.getDangerjob()))
            && (this.getRelationship() == null ? other.getRelationship() == null : this.getRelationship().equals(other.getRelationship()))
            && (this.getRelationcerdid() == null ? other.getRelationcerdid() == null : this.getRelationcerdid().equals(other.getRelationcerdid()))
            && (this.getIsmarrow() == null ? other.getIsmarrow() == null : this.getIsmarrow().equals(other.getIsmarrow()))
            && (this.getComhavelitigat() == null ? other.getComhavelitigat() == null : this.getComhavelitigat().equals(other.getComhavelitigat()))
            && (this.getComhavalitigat() == null ? other.getComhavalitigat() == null : this.getComhavalitigat().equals(other.getComhavalitigat()))
            && (this.getJobnation() == null ? other.getJobnation() == null : this.getJobnation().equals(other.getJobnation()))
            && (this.getBusdescription() == null ? other.getBusdescription() == null : this.getBusdescription().equals(other.getBusdescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getCustno() == null) ? 0 : getCustno().hashCode());
        result = prime * result + ((getCusttype() == null) ? 0 : getCusttype().hashCode());
        result = prime * result + ((getCustname() == null) ? 0 : getCustname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCerdtype() == null) ? 0 : getCerdtype().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getTelnumber() == null) ? 0 : getTelnumber().hashCode());
        result = prime * result + ((getFamilyaddressprovince() == null) ? 0 : getFamilyaddressprovince().hashCode());
        result = prime * result + ((getFamilyaddresscity() == null) ? 0 : getFamilyaddresscity().hashCode());
        result = prime * result + ((getFamilyaddressarea() == null) ? 0 : getFamilyaddressarea().hashCode());
        result = prime * result + ((getFamilyaddressdetail() == null) ? 0 : getFamilyaddressdetail().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getCensusregisterprovvince() == null) ? 0 : getCensusregisterprovvince().hashCode());
        result = prime * result + ((getCensusregistercity() == null) ? 0 : getCensusregistercity().hashCode());
        result = prime * result + ((getMaritalstatus() == null) ? 0 : getMaritalstatus().hashCode());
        result = prime * result + ((getIslitigation() == null) ? 0 : getIslitigation().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getApplymain() == null) ? 0 : getApplymain().hashCode());
        result = prime * result + ((getComname() == null) ? 0 : getComname().hashCode());
        result = prime * result + ((getComproperty1() == null) ? 0 : getComproperty1().hashCode());
        result = prime * result + ((getComproperty() == null) ? 0 : getComproperty().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getMonthincome() == null) ? 0 : getMonthincome().hashCode());
        result = prime * result + ((getRealcomaddress() == null) ? 0 : getRealcomaddress().hashCode());
        result = prime * result + ((getReceipt() == null) ? 0 : getReceipt().hashCode());
        result = prime * result + ((getNetmargin() == null) ? 0 : getNetmargin().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getBusilicence() == null) ? 0 : getBusilicence().hashCode());
        result = prime * result + ((getCerditaddress() == null) ? 0 : getCerditaddress().hashCode());
        result = prime * result + ((getCreditimage() == null) ? 0 : getCreditimage().hashCode());
        result = prime * result + ((getCreditimage2() == null) ? 0 : getCreditimage2().hashCode());
        result = prime * result + ((getNativeplaceprovince() == null) ? 0 : getNativeplaceprovince().hashCode());
        result = prime * result + ((getNativeplacecity() == null) ? 0 : getNativeplacecity().hashCode());
        result = prime * result + ((getNativeplacearea() == null) ? 0 : getNativeplacearea().hashCode());
        result = prime * result + ((getDiscoverdate() == null) ? 0 : getDiscoverdate().hashCode());
        result = prime * result + ((getDiscoversign() == null) ? 0 : getDiscoversign().hashCode());
        result = prime * result + ((getEstatedescription() == null) ? 0 : getEstatedescription().hashCode());
        result = prime * result + ((getHavachildflg() == null) ? 0 : getHavachildflg().hashCode());
        result = prime * result + ((getChildcount() == null) ? 0 : getChildcount().hashCode());
        result = prime * result + ((getChilddescription() == null) ? 0 : getChilddescription().hashCode());
        result = prime * result + ((getDangerjob() == null) ? 0 : getDangerjob().hashCode());
        result = prime * result + ((getRelationship() == null) ? 0 : getRelationship().hashCode());
        result = prime * result + ((getRelationcerdid() == null) ? 0 : getRelationcerdid().hashCode());
        result = prime * result + ((getIsmarrow() == null) ? 0 : getIsmarrow().hashCode());
        result = prime * result + ((getComhavelitigat() == null) ? 0 : getComhavelitigat().hashCode());
        result = prime * result + ((getComhavalitigat() == null) ? 0 : getComhavalitigat().hashCode());
        result = prime * result + ((getJobnation() == null) ? 0 : getJobnation().hashCode());
        result = prime * result + ((getBusdescription() == null) ? 0 : getBusdescription().hashCode());
        return result;
    }
}
