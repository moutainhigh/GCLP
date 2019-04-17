package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Shixin implements Serializable {
	@Length(max=19,min=0,message="数据主键不能超出19位")
	@ApiModelProperty(value = "数据主键", example = "", dataType="varchar(19)", required = true )
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

	@Length(max=10,min=0,message="具体日期不能超出10位")
	@ApiModelProperty(value = "具体日期", example = "", dataType="varchar(10)", required = true )
    private String sslong;

	@Length(max=150,min=0,message="被执行人姓名或名称不能超出150位")
	@ApiModelProperty(value = "被执行人姓名或名称", example = "", dataType="varchar(150)", required = true )
    private String name;

	@Length(max=150,min=0,message="证件号码不能超出150位")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(150)", required = true )
    private String id;

	@Length(max=500,min=0,message="执行案号不能超出500位")
	@ApiModelProperty(value = "执行案号", example = "", dataType="varchar(500)", required = true )
    private String casenum;

	@Length(max=500,min=0,message="执行法院不能超出500位")
	@ApiModelProperty(value = "执行法院", example = "", dataType="varchar(500)", required = true )
    private String court;

	@Length(max=500,min=0,message="日期类别不能超出500位")
	@ApiModelProperty(value = "日期类别", example = "", dataType="varchar(500)", required = true )
    private String timetype;

	@Length(max=500,min=0,message="执行状态不能超出500位")
	@ApiModelProperty(value = "执行状态", example = "", dataType="varchar(500)", required = true )
    private String state;

	@Length(max=255,min=0,message="省份不能超出255位")
	@ApiModelProperty(value = "省份", example = "", dataType="varchar(255)", required = true )
    private String sxSf;

	@Length(max=500,min=0,message="发布时间不能超出500位")
	@ApiModelProperty(value = "发布时间", example = "", dataType="varchar(500)", required = true )
    private String sxFb;

	@Length(max=500,min=0,message="执行依据文号不能超出500位")
	@ApiModelProperty(value = "执行依据文号", example = "", dataType="varchar(500)", required = true )
    private String sxWh;

	@Length(max=500,min=0,message="执行依据单位不能超出500位")
	@ApiModelProperty(value = "执行依据单位", example = "", dataType="varchar(500)", required = true )
    private String sxDw;

	@Length(max=500,min=0,message="未履行金额不能超出500位")
	@ApiModelProperty(value = "未履行金额", example = "", dataType="varchar(500)", required = true )
    private String wlmoney;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "执行内容", example = "", dataType="longtext", required = true )
    private String content;

	@ApiModelProperty(value = "异议备注", example = "", dataType="longtext", required = true )
    private String remark;

	@ApiModelProperty(value = "履行情况", example = "", dataType="longtext", required = true )
    private String sxLx;

	@ApiModelProperty(value = "具体情形", example = "", dataType="longtext", required = true )
    private String sxJt;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getTimetype() {
        return timetype;
    }

    public void setTimetype(String timetype) {
        this.timetype = timetype == null ? null : timetype.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSxSf() {
        return sxSf;
    }

    public void setSxSf(String sxSf) {
        this.sxSf = sxSf == null ? null : sxSf.trim();
    }

    public String getSxFb() {
        return sxFb;
    }

    public void setSxFb(String sxFb) {
        this.sxFb = sxFb == null ? null : sxFb.trim();
    }

    public String getSxWh() {
        return sxWh;
    }

    public void setSxWh(String sxWh) {
        this.sxWh = sxWh == null ? null : sxWh.trim();
    }

    public String getSxDw() {
        return sxDw;
    }

    public void setSxDw(String sxDw) {
        this.sxDw = sxDw == null ? null : sxDw.trim();
    }

    public String getWlmoney() {
        return wlmoney;
    }

    public void setWlmoney(String wlmoney) {
        this.wlmoney = wlmoney == null ? null : wlmoney.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSxLx() {
        return sxLx;
    }

    public void setSxLx(String sxLx) {
        this.sxLx = sxLx == null ? null : sxLx.trim();
    }

    public String getSxJt() {
        return sxJt;
    }

    public void setSxJt(String sxJt) {
        this.sxJt = sxJt == null ? null : sxJt.trim();
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
        Shixin other = (Shixin) that;
        return (this.getKeyid() == null ? other.getKeyid() == null : this.getKeyid().equals(other.getKeyid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getTypet() == null ? other.getTypet() == null : this.getTypet().equals(other.getTypet()))
            && (this.getTypetname() == null ? other.getTypetname() == null : this.getTypetname().equals(other.getTypetname()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSslong() == null ? other.getSslong() == null : this.getSslong().equals(other.getSslong()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCasenum() == null ? other.getCasenum() == null : this.getCasenum().equals(other.getCasenum()))
            && (this.getCourt() == null ? other.getCourt() == null : this.getCourt().equals(other.getCourt()))
            && (this.getTimetype() == null ? other.getTimetype() == null : this.getTimetype().equals(other.getTimetype()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSxSf() == null ? other.getSxSf() == null : this.getSxSf().equals(other.getSxSf()))
            && (this.getSxFb() == null ? other.getSxFb() == null : this.getSxFb().equals(other.getSxFb()))
            && (this.getSxWh() == null ? other.getSxWh() == null : this.getSxWh().equals(other.getSxWh()))
            && (this.getSxDw() == null ? other.getSxDw() == null : this.getSxDw().equals(other.getSxDw()))
            && (this.getWlmoney() == null ? other.getWlmoney() == null : this.getWlmoney().equals(other.getWlmoney()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSxLx() == null ? other.getSxLx() == null : this.getSxLx().equals(other.getSxLx()))
            && (this.getSxJt() == null ? other.getSxJt() == null : this.getSxJt().equals(other.getSxJt()));
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
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCasenum() == null) ? 0 : getCasenum().hashCode());
        result = prime * result + ((getCourt() == null) ? 0 : getCourt().hashCode());
        result = prime * result + ((getTimetype() == null) ? 0 : getTimetype().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSxSf() == null) ? 0 : getSxSf().hashCode());
        result = prime * result + ((getSxFb() == null) ? 0 : getSxFb().hashCode());
        result = prime * result + ((getSxWh() == null) ? 0 : getSxWh().hashCode());
        result = prime * result + ((getSxDw() == null) ? 0 : getSxDw().hashCode());
        result = prime * result + ((getWlmoney() == null) ? 0 : getWlmoney().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSxLx() == null) ? 0 : getSxLx().hashCode());
        result = prime * result + ((getSxJt() == null) ? 0 : getSxJt().hashCode());
        return result;
    }
}
