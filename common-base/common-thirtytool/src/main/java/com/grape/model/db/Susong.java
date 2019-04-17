package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Susong implements Serializable {
	@Length(max=19,min=0,message="汇法网数据主键不能超出19位")
	@ApiModelProperty(value = "汇法网数据主键", example = "", dataType="varchar(19)", required = true )
    private String keyid;

	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=5,min=0,message="数据类型编号不能超出5位")
	@ApiModelProperty(value = "数据类型编号", example = "", dataType="varchar(5)", required = true )
    private String typet;

	@Length(max=100,min=0,message="数据类型不能超出100位")
	@ApiModelProperty(value = "数据类型", example = "", dataType="varchar(100)", required = true )
    private String typetname;

	@Length(max=500,min=0,message="标题不能超出500位")
	@ApiModelProperty(value = "标题", example = "", dataType="varchar(500)", required = true )
    private String title;

	@Length(max=10,min=0,message="立案时间不能超出10位")
	@ApiModelProperty(value = "立案时间", example = "", dataType="varchar(10)", required = true )
    private String sslong;

	@Length(max=150,min=0,message="被执行人姓名或名称不能超出150位")
	@ApiModelProperty(value = "被执行人姓名或名称", example = "", dataType="varchar(150)", required = true )
    private String name;

	@Length(max=150,min=0,message="证件号码不能超出150位")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(150)", required = true )
    private String personid;

	@Length(max=500,min=0,message="执行案号不能超出500位")
	@ApiModelProperty(value = "执行案号", example = "", dataType="varchar(500)", required = true )
    private String casenum;

	@Length(max=500,min=0,message="执行法院不能超出500位")
	@ApiModelProperty(value = "执行法院", example = "", dataType="varchar(500)", required = true )
    private String court;

	@Length(max=500,min=0,message="执行标的不能超出500位")
	@ApiModelProperty(value = "执行标的", example = "", dataType="varchar(500)", required = true )
    private String money;

	@Length(max=3000,min=0,message="执行内容不能超出3000位")
	@ApiModelProperty(value = "执行内容", example = "", dataType="varchar(3000)", required = true )
    private String content;

	@Length(max=500,min=0,message="执行状态不能超出500位")
	@ApiModelProperty(value = "执行状态", example = "", dataType="varchar(500)", required = true )
    private String state;

	@Length(max=3000,min=0,message="异议备注不能超出3000位")
	@ApiModelProperty(value = "异议备注", example = "", dataType="varchar(3000)", required = true )
    private String remark;

	@Length(max=150,min=0,message="终本日期不能超出150位")
	@ApiModelProperty(value = "终本日期", example = "", dataType="varchar(150)", required = true )
    private String zblong;

	@Length(max=150,min=0,message="未履行金额不能超出150位")
	@ApiModelProperty(value = "未履行金额", example = "", dataType="varchar(150)", required = true )
    private String wlmoney;

	@Length(max=500,min=0,message="申请执行人不能超出500位")
	@ApiModelProperty(value = "申请执行人", example = "", dataType="varchar(500)", required = true )
    private String apply;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getTypet() {
        return typet;
    }

    public void setTypet(String typet) {
        this.typet = typet == null ? null : typet.trim();
    }

    public String getTypetname() {
        return typetname;
    }

    public void setTypetname(String typetname) {
        this.typetname = typetname == null ? null : typetname.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSslong() {
        return sslong;
    }

    public void setSslong(String sslong) {
        this.sslong = sslong == null ? null : sslong.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getCasenum() {
        return casenum;
    }

    public void setCasenum(String casenum) {
        this.casenum = casenum == null ? null : casenum.trim();
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getZblong() {
        return zblong;
    }

    public void setZblong(String zblong) {
        this.zblong = zblong == null ? null : zblong.trim();
    }

    public String getWlmoney() {
        return wlmoney;
    }

    public void setWlmoney(String wlmoney) {
        this.wlmoney = wlmoney == null ? null : wlmoney.trim();
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply == null ? null : apply.trim();
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
        Susong other = (Susong) that;
        return (this.getKeyid() == null ? other.getKeyid() == null : this.getKeyid().equals(other.getKeyid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getTypet() == null ? other.getTypet() == null : this.getTypet().equals(other.getTypet()))
            && (this.getTypetname() == null ? other.getTypetname() == null : this.getTypetname().equals(other.getTypetname()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSslong() == null ? other.getSslong() == null : this.getSslong().equals(other.getSslong()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPersonid() == null ? other.getPersonid() == null : this.getPersonid().equals(other.getPersonid()))
            && (this.getCasenum() == null ? other.getCasenum() == null : this.getCasenum().equals(other.getCasenum()))
            && (this.getCourt() == null ? other.getCourt() == null : this.getCourt().equals(other.getCourt()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getZblong() == null ? other.getZblong() == null : this.getZblong().equals(other.getZblong()))
            && (this.getWlmoney() == null ? other.getWlmoney() == null : this.getWlmoney().equals(other.getWlmoney()))
            && (this.getApply() == null ? other.getApply() == null : this.getApply().equals(other.getApply()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeyid() == null) ? 0 : getKeyid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getTypet() == null) ? 0 : getTypet().hashCode());
        result = prime * result + ((getTypetname() == null) ? 0 : getTypetname().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSslong() == null) ? 0 : getSslong().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPersonid() == null) ? 0 : getPersonid().hashCode());
        result = prime * result + ((getCasenum() == null) ? 0 : getCasenum().hashCode());
        result = prime * result + ((getCourt() == null) ? 0 : getCourt().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getZblong() == null) ? 0 : getZblong().hashCode());
        result = prime * result + ((getWlmoney() == null) ? 0 : getWlmoney().hashCode());
        result = prime * result + ((getApply() == null) ? 0 : getApply().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
