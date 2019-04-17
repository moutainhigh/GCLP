package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Applymaninfo implements Serializable {
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="身份证号不能超出32位")
	@ApiModelProperty(value = "身份证号", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=2,min=0,message="客户类型不能超出2位")
	@ApiModelProperty(value = "客户类型", example = "", dataType="varchar(2)", required = true )
    private String custtype;

	@Length(max=80,min=0,message="客户姓名不能超出80位")
	@ApiModelProperty(value = "客户姓名", example = "", dataType="varchar(80)", required = true )
    private String custname;

	@Length(max=2,min=0,message="性别不能超出2位")
	@ApiModelProperty(value = "性别", example = "", dataType="varchar(2)", required = true )
    private String sex;

	@Length(max=200,min=0,message="身份证地址不能超出200位")
	@ApiModelProperty(value = "身份证地址", example = "", dataType="varchar(200)", required = true )
    private String cerdidaddress;

	@ApiModelProperty(value = "出生年月", example = "", dataType="datetime", required = true )
    private Date birthdate;

	@Length(max=20,min=0,message="电话号码不能超出20位")
	@ApiModelProperty(value = "电话号码", example = "", dataType="varchar(20)", required = true )
    private String telnumber;

	@Length(max=4,min=0,message="年龄不能超出4位")
	@ApiModelProperty(value = "年龄", example = "", dataType="varchar(4)", required = true )
    private String age;

	@Length(max=300,min=0,message="家庭住址不能超出300位")
	@ApiModelProperty(value = "家庭住址", example = "", dataType="varchar(300)", required = true )
    private String familyaddress;

	@Length(max=200,min=0,message="户籍不能超出200位")
	@ApiModelProperty(value = "户籍", example = "", dataType="varchar(200)", required = true )
    private String register;

	@Length(max=200,min=0,message="籍贯不能超出200位")
	@ApiModelProperty(value = "籍贯", example = "", dataType="varchar(200)", required = true )
    private String nativeplace;

	@Length(max=2,min=0,message="婚姻状况不能超出2位")
	@ApiModelProperty(value = "婚姻状况", example = "", dataType="varchar(2)", required = true )
    private String marrystate;

	@ApiModelProperty(value = "离婚时间", example = "", dataType="datetime", required = true )
    private Date divorcedate;

	@Length(max=2,min=0,message="离婚协议书不能超出2位")
	@ApiModelProperty(value = "离婚协议书", example = "", dataType="varchar(2)", required = true )
    private String divorcesign;

	@Length(max=200,min=0,message="财产分割情况及履行情况不能超出200位")
	@ApiModelProperty(value = "财产分割情况及履行情况", example = "", dataType="varchar(200)", required = true )
    private String estatestate;

	@Length(max=1,min=0,message="是否有子女不能超出1位")
	@ApiModelProperty(value = "是否有子女", example = "", dataType="char(1)", required = true )
    private String havechildflg;

	@Length(max=4,min=0,message="子女个数不能超出4位")
	@ApiModelProperty(value = "子女个数", example = "", dataType="varchar(4)", required = true )
    private String childcount;

	@Length(max=500,min=0,message="子女情况说明不能超出500位")
	@ApiModelProperty(value = "子女情况说明", example = "", dataType="varchar(500)", required = true )
    private String childdescription;

	@Length(max=1,min=0,message="是否从事高危行业不能超出1位")
	@ApiModelProperty(value = "是否从事高危行业", example = "", dataType="char(1)", required = true )
    private String dangerjobflg;

	@Length(max=2,min=0,message="职业不能超出2位")
	@ApiModelProperty(value = "职业", example = "", dataType="varchar(2)", required = true )
    private String job;

	@Length(max=80,min=0,message="单位名称不能超出80位")
	@ApiModelProperty(value = "单位名称", example = "", dataType="varchar(80)", required = true )
    private String comname;

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

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

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

    public String getCerdidaddress() {
        return cerdidaddress;
    }

    public void setCerdidaddress(String cerdidaddress) {
        this.cerdidaddress = cerdidaddress == null ? null : cerdidaddress.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getFamilyaddress() {
        return familyaddress;
    }

    public void setFamilyaddress(String familyaddress) {
        this.familyaddress = familyaddress == null ? null : familyaddress.trim();
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getMarrystate() {
        return marrystate;
    }

    public void setMarrystate(String marrystate) {
        this.marrystate = marrystate == null ? null : marrystate.trim();
    }

    public Date getDivorcedate() {
        return divorcedate;
    }

    public void setDivorcedate(Date divorcedate) {
        this.divorcedate = divorcedate;
    }

    public String getDivorcesign() {
        return divorcesign;
    }

    public void setDivorcesign(String divorcesign) {
        this.divorcesign = divorcesign == null ? null : divorcesign.trim();
    }

    public String getEstatestate() {
        return estatestate;
    }

    public void setEstatestate(String estatestate) {
        this.estatestate = estatestate == null ? null : estatestate.trim();
    }

    public String getHavechildflg() {
        return havechildflg;
    }

    public void setHavechildflg(String havechildflg) {
        this.havechildflg = havechildflg == null ? null : havechildflg.trim();
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

    public String getDangerjobflg() {
        return dangerjobflg;
    }

    public void setDangerjobflg(String dangerjobflg) {
        this.dangerjobflg = dangerjobflg == null ? null : dangerjobflg.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
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
        Applymaninfo other = (Applymaninfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getCerdid() == null ? other.getCerdid() == null : this.getCerdid().equals(other.getCerdid()))
            && (this.getCusttype() == null ? other.getCusttype() == null : this.getCusttype().equals(other.getCusttype()))
            && (this.getCustname() == null ? other.getCustname() == null : this.getCustname().equals(other.getCustname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getCerdidaddress() == null ? other.getCerdidaddress() == null : this.getCerdidaddress().equals(other.getCerdidaddress()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getTelnumber() == null ? other.getTelnumber() == null : this.getTelnumber().equals(other.getTelnumber()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getFamilyaddress() == null ? other.getFamilyaddress() == null : this.getFamilyaddress().equals(other.getFamilyaddress()))
            && (this.getRegister() == null ? other.getRegister() == null : this.getRegister().equals(other.getRegister()))
            && (this.getNativeplace() == null ? other.getNativeplace() == null : this.getNativeplace().equals(other.getNativeplace()))
            && (this.getMarrystate() == null ? other.getMarrystate() == null : this.getMarrystate().equals(other.getMarrystate()))
            && (this.getDivorcedate() == null ? other.getDivorcedate() == null : this.getDivorcedate().equals(other.getDivorcedate()))
            && (this.getDivorcesign() == null ? other.getDivorcesign() == null : this.getDivorcesign().equals(other.getDivorcesign()))
            && (this.getEstatestate() == null ? other.getEstatestate() == null : this.getEstatestate().equals(other.getEstatestate()))
            && (this.getHavechildflg() == null ? other.getHavechildflg() == null : this.getHavechildflg().equals(other.getHavechildflg()))
            && (this.getChildcount() == null ? other.getChildcount() == null : this.getChildcount().equals(other.getChildcount()))
            && (this.getChilddescription() == null ? other.getChilddescription() == null : this.getChilddescription().equals(other.getChilddescription()))
            && (this.getDangerjobflg() == null ? other.getDangerjobflg() == null : this.getDangerjobflg().equals(other.getDangerjobflg()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getComname() == null ? other.getComname() == null : this.getComname().equals(other.getComname()))
            && (this.getComproperty() == null ? other.getComproperty() == null : this.getComproperty().equals(other.getComproperty()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getMonthincome() == null ? other.getMonthincome() == null : this.getMonthincome().equals(other.getMonthincome()))
            && (this.getRealcomaddress() == null ? other.getRealcomaddress() == null : this.getRealcomaddress().equals(other.getRealcomaddress()))
            && (this.getReceipt() == null ? other.getReceipt() == null : this.getReceipt().equals(other.getReceipt()))
            && (this.getNetmargin() == null ? other.getNetmargin() == null : this.getNetmargin().equals(other.getNetmargin()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getBusdescription() == null ? other.getBusdescription() == null : this.getBusdescription().equals(other.getBusdescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getCerdid() == null) ? 0 : getCerdid().hashCode());
        result = prime * result + ((getCusttype() == null) ? 0 : getCusttype().hashCode());
        result = prime * result + ((getCustname() == null) ? 0 : getCustname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCerdidaddress() == null) ? 0 : getCerdidaddress().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getTelnumber() == null) ? 0 : getTelnumber().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getFamilyaddress() == null) ? 0 : getFamilyaddress().hashCode());
        result = prime * result + ((getRegister() == null) ? 0 : getRegister().hashCode());
        result = prime * result + ((getNativeplace() == null) ? 0 : getNativeplace().hashCode());
        result = prime * result + ((getMarrystate() == null) ? 0 : getMarrystate().hashCode());
        result = prime * result + ((getDivorcedate() == null) ? 0 : getDivorcedate().hashCode());
        result = prime * result + ((getDivorcesign() == null) ? 0 : getDivorcesign().hashCode());
        result = prime * result + ((getEstatestate() == null) ? 0 : getEstatestate().hashCode());
        result = prime * result + ((getHavechildflg() == null) ? 0 : getHavechildflg().hashCode());
        result = prime * result + ((getChildcount() == null) ? 0 : getChildcount().hashCode());
        result = prime * result + ((getChilddescription() == null) ? 0 : getChilddescription().hashCode());
        result = prime * result + ((getDangerjobflg() == null) ? 0 : getDangerjobflg().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getComname() == null) ? 0 : getComname().hashCode());
        result = prime * result + ((getComproperty() == null) ? 0 : getComproperty().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getMonthincome() == null) ? 0 : getMonthincome().hashCode());
        result = prime * result + ((getRealcomaddress() == null) ? 0 : getRealcomaddress().hashCode());
        result = prime * result + ((getReceipt() == null) ? 0 : getReceipt().hashCode());
        result = prime * result + ((getNetmargin() == null) ? 0 : getNetmargin().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getBusdescription() == null) ? 0 : getBusdescription().hashCode());
        return result;
    }
}
