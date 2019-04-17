package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//抵押物查档表
public class Mortgagefiling implements Serializable {
	@Length(max=19,min=0,message="抵押物查档ID不能超出19位")
	@ApiModelProperty(value = "抵押物查档ID", example = "", dataType="varchar(19)", required = true )
    private String mortgagefilingid;

	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="抵押物是否有网签备案不能超出1位")
	@ApiModelProperty(value = "抵押物是否有网签备案", example = "", dataType="char(1)", required = true )
    private String isnetsign;

	@Length(max=8,min=0,message="查封次数不能超出8位")
	@ApiModelProperty(value = "查封次数", example = "", dataType="varchar(8)", required = true )
    private String closecount;

	@Length(max=30,min=0,message="解除查封时间距今时长不能超出30位")
	@ApiModelProperty(value = "解除查封时间距今时长", example = "", dataType="varchar(30)", required = true )
    private String endclosetime;

	@ApiModelProperty(value = "解除查封时间", example = "", dataType="datetime", required = true )
    private Date endclosedate;

	@Length(max=2,min=0,message="抵押物是否曾有查封不能超出2位")
	@ApiModelProperty(value = "抵押物是否曾有查封", example = "", dataType="varchar(2)", required = true )
    private String ismortgageclose;

	@Length(max=200,min=0,message="扣押等法律纠纷记录不能超出200位")
	@ApiModelProperty(value = "扣押等法律纠纷记录", example = "", dataType="varchar(200)", required = true )
    private String legaldispute;

	@Length(max=10,min=0,message="抵押物查档状态不能超出10位")
	@ApiModelProperty(value = "抵押物查档状态", example = "", dataType="varchar(10)", required = true )
    private String mortgagestate;

	@Length(max=120,min=0,message="抵押物现抵押银行或公司不能超出120位")
	@ApiModelProperty(value = "抵押物现抵押银行或公司", example = "", dataType="varchar(120)", required = true )
    private String mortgagecomorbank;

	@Length(max=6,min=0,message="抵押物单月查档人数不能超出6位")
	@ApiModelProperty(value = "抵押物单月查档人数", example = "", dataType="varchar(6)", required = true )
    private String queriesofmonth;

	@Length(max=80,min=0,message="前手一押不能超出80位")
	@ApiModelProperty(value = "前手一押", example = "", dataType="varchar(80)", required = true )
    private String fronthandone;

	@Length(max=6,min=0,message="抵押物查档次数不能超出6位")
	@ApiModelProperty(value = "抵押物查档次数", example = "", dataType="varchar(6)", required = true )
    private String queriesoftotal;

	@Length(max=80,min=0,message="抵押物顺位人一不能超出80位")
	@ApiModelProperty(value = "抵押物顺位人一", example = "", dataType="varchar(80)", required = true )
    private String mortgages1;

	@Length(max=80,min=0,message="第一顺位抵押权人不能超出80位")
	@ApiModelProperty(value = "第一顺位抵押权人", example = "", dataType="varchar(80)", required = true )
    private String mortgagesman1;

	@Length(max=80,min=0,message="抵押物顺位人二不能超出80位")
	@ApiModelProperty(value = "抵押物顺位人二", example = "", dataType="varchar(80)", required = true )
    private String mortgages2;

	@Length(max=80,min=0,message="第二顺位抵押权人不能超出80位")
	@ApiModelProperty(value = "第二顺位抵押权人", example = "", dataType="varchar(80)", required = true )
    private String mortgagesman2;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=40,min=0,message="前手一压机构名称不能超出40位")
	@ApiModelProperty(value = "前手一压机构名称", example = "", dataType="varchar(40)", required = true )
    private String oneagency;

	@Length(max=80,min=0,message="前手二押不能超出80位")
	@ApiModelProperty(value = "前手二押", example = "", dataType="varchar(80)", required = true )
    private String fronthandtwo;

	@Length(max=40,min=0,message="前手二押名称不能超出40位")
	@ApiModelProperty(value = "前手二押名称", example = "", dataType="varchar(40)", required = true )
    private String twoagency;

    private static final long serialVersionUID = 1L;

    public String getMortgagefilingid() {
        return mortgagefilingid;
    }

    public void setMortgagefilingid(String mortgagefilingid) {
        this.mortgagefilingid = mortgagefilingid == null ? null : mortgagefilingid.trim();
    }

    public String getMortgageid() {
        return mortgageid;
    }

    public void setMortgageid(String mortgageid) {
        this.mortgageid = mortgageid == null ? null : mortgageid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getIsnetsign() {
        return isnetsign;
    }

    public void setIsnetsign(String isnetsign) {
        this.isnetsign = isnetsign == null ? null : isnetsign.trim();
    }

    public String getClosecount() {
        return closecount;
    }

    public void setClosecount(String closecount) {
        this.closecount = closecount == null ? null : closecount.trim();
    }

    public String getEndclosetime() {
        return endclosetime;
    }

    public void setEndclosetime(String endclosetime) {
        this.endclosetime = endclosetime == null ? null : endclosetime.trim();
    }

    public Date getEndclosedate() {
        return endclosedate;
    }

    public void setEndclosedate(Date endclosedate) {
        this.endclosedate = endclosedate;
    }

    public String getIsmortgageclose() {
        return ismortgageclose;
    }

    public void setIsmortgageclose(String ismortgageclose) {
        this.ismortgageclose = ismortgageclose == null ? null : ismortgageclose.trim();
    }

    public String getLegaldispute() {
        return legaldispute;
    }

    public void setLegaldispute(String legaldispute) {
        this.legaldispute = legaldispute == null ? null : legaldispute.trim();
    }

    public String getMortgagestate() {
        return mortgagestate;
    }

    public void setMortgagestate(String mortgagestate) {
        this.mortgagestate = mortgagestate == null ? null : mortgagestate.trim();
    }

    public String getMortgagecomorbank() {
        return mortgagecomorbank;
    }

    public void setMortgagecomorbank(String mortgagecomorbank) {
        this.mortgagecomorbank = mortgagecomorbank == null ? null : mortgagecomorbank.trim();
    }

    public String getQueriesofmonth() {
        return queriesofmonth;
    }

    public void setQueriesofmonth(String queriesofmonth) {
        this.queriesofmonth = queriesofmonth == null ? null : queriesofmonth.trim();
    }

    public String getFronthandone() {
        return fronthandone;
    }

    public void setFronthandone(String fronthandone) {
        this.fronthandone = fronthandone == null ? null : fronthandone.trim();
    }

    public String getQueriesoftotal() {
        return queriesoftotal;
    }

    public void setQueriesoftotal(String queriesoftotal) {
        this.queriesoftotal = queriesoftotal == null ? null : queriesoftotal.trim();
    }

    public String getMortgages1() {
        return mortgages1;
    }

    public void setMortgages1(String mortgages1) {
        this.mortgages1 = mortgages1 == null ? null : mortgages1.trim();
    }

    public String getMortgagesman1() {
        return mortgagesman1;
    }

    public void setMortgagesman1(String mortgagesman1) {
        this.mortgagesman1 = mortgagesman1 == null ? null : mortgagesman1.trim();
    }

    public String getMortgages2() {
        return mortgages2;
    }

    public void setMortgages2(String mortgages2) {
        this.mortgages2 = mortgages2 == null ? null : mortgages2.trim();
    }

    public String getMortgagesman2() {
        return mortgagesman2;
    }

    public void setMortgagesman2(String mortgagesman2) {
        this.mortgagesman2 = mortgagesman2 == null ? null : mortgagesman2.trim();
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

    public String getOneagency() {
        return oneagency;
    }

    public void setOneagency(String oneagency) {
        this.oneagency = oneagency == null ? null : oneagency.trim();
    }

    public String getFronthandtwo() {
        return fronthandtwo;
    }

    public void setFronthandtwo(String fronthandtwo) {
        this.fronthandtwo = fronthandtwo == null ? null : fronthandtwo.trim();
    }

    public String getTwoagency() {
        return twoagency;
    }

    public void setTwoagency(String twoagency) {
        this.twoagency = twoagency == null ? null : twoagency.trim();
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
        Mortgagefiling other = (Mortgagefiling) that;
        return (this.getMortgagefilingid() == null ? other.getMortgagefilingid() == null : this.getMortgagefilingid().equals(other.getMortgagefilingid()))
            && (this.getMortgageid() == null ? other.getMortgageid() == null : this.getMortgageid().equals(other.getMortgageid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getIsnetsign() == null ? other.getIsnetsign() == null : this.getIsnetsign().equals(other.getIsnetsign()))
            && (this.getClosecount() == null ? other.getClosecount() == null : this.getClosecount().equals(other.getClosecount()))
            && (this.getEndclosetime() == null ? other.getEndclosetime() == null : this.getEndclosetime().equals(other.getEndclosetime()))
            && (this.getEndclosedate() == null ? other.getEndclosedate() == null : this.getEndclosedate().equals(other.getEndclosedate()))
            && (this.getIsmortgageclose() == null ? other.getIsmortgageclose() == null : this.getIsmortgageclose().equals(other.getIsmortgageclose()))
            && (this.getLegaldispute() == null ? other.getLegaldispute() == null : this.getLegaldispute().equals(other.getLegaldispute()))
            && (this.getMortgagestate() == null ? other.getMortgagestate() == null : this.getMortgagestate().equals(other.getMortgagestate()))
            && (this.getMortgagecomorbank() == null ? other.getMortgagecomorbank() == null : this.getMortgagecomorbank().equals(other.getMortgagecomorbank()))
            && (this.getQueriesofmonth() == null ? other.getQueriesofmonth() == null : this.getQueriesofmonth().equals(other.getQueriesofmonth()))
            && (this.getFronthandone() == null ? other.getFronthandone() == null : this.getFronthandone().equals(other.getFronthandone()))
            && (this.getQueriesoftotal() == null ? other.getQueriesoftotal() == null : this.getQueriesoftotal().equals(other.getQueriesoftotal()))
            && (this.getMortgages1() == null ? other.getMortgages1() == null : this.getMortgages1().equals(other.getMortgages1()))
            && (this.getMortgagesman1() == null ? other.getMortgagesman1() == null : this.getMortgagesman1().equals(other.getMortgagesman1()))
            && (this.getMortgages2() == null ? other.getMortgages2() == null : this.getMortgages2().equals(other.getMortgages2()))
            && (this.getMortgagesman2() == null ? other.getMortgagesman2() == null : this.getMortgagesman2().equals(other.getMortgagesman2()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getOneagency() == null ? other.getOneagency() == null : this.getOneagency().equals(other.getOneagency()))
            && (this.getFronthandtwo() == null ? other.getFronthandtwo() == null : this.getFronthandtwo().equals(other.getFronthandtwo()))
            && (this.getTwoagency() == null ? other.getTwoagency() == null : this.getTwoagency().equals(other.getTwoagency()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMortgagefilingid() == null) ? 0 : getMortgagefilingid().hashCode());
        result = prime * result + ((getMortgageid() == null) ? 0 : getMortgageid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getIsnetsign() == null) ? 0 : getIsnetsign().hashCode());
        result = prime * result + ((getClosecount() == null) ? 0 : getClosecount().hashCode());
        result = prime * result + ((getEndclosetime() == null) ? 0 : getEndclosetime().hashCode());
        result = prime * result + ((getEndclosedate() == null) ? 0 : getEndclosedate().hashCode());
        result = prime * result + ((getIsmortgageclose() == null) ? 0 : getIsmortgageclose().hashCode());
        result = prime * result + ((getLegaldispute() == null) ? 0 : getLegaldispute().hashCode());
        result = prime * result + ((getMortgagestate() == null) ? 0 : getMortgagestate().hashCode());
        result = prime * result + ((getMortgagecomorbank() == null) ? 0 : getMortgagecomorbank().hashCode());
        result = prime * result + ((getQueriesofmonth() == null) ? 0 : getQueriesofmonth().hashCode());
        result = prime * result + ((getFronthandone() == null) ? 0 : getFronthandone().hashCode());
        result = prime * result + ((getQueriesoftotal() == null) ? 0 : getQueriesoftotal().hashCode());
        result = prime * result + ((getMortgages1() == null) ? 0 : getMortgages1().hashCode());
        result = prime * result + ((getMortgagesman1() == null) ? 0 : getMortgagesman1().hashCode());
        result = prime * result + ((getMortgages2() == null) ? 0 : getMortgages2().hashCode());
        result = prime * result + ((getMortgagesman2() == null) ? 0 : getMortgagesman2().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getOneagency() == null) ? 0 : getOneagency().hashCode());
        result = prime * result + ((getFronthandtwo() == null) ? 0 : getFronthandtwo().hashCode());
        result = prime * result + ((getTwoagency() == null) ? 0 : getTwoagency().hashCode());
        return result;
    }
}
