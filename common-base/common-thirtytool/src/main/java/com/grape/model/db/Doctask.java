package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//流水表
public class Doctask implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=6,min=0,message="部门编号不能超出6位")
	@ApiModelProperty(value = "部门编号", example = "", dataType="varchar(6)", required = true )
    private String departmentno;

	@Length(max=19,min=0,message="区域ID不能超出19位")
	@ApiModelProperty(value = "区域ID", example = "", dataType="varchar(19)", required = true )
    private String areaid;

	@Length(max=6,min=0,message="渠道方编号不能超出6位")
	@ApiModelProperty(value = "渠道方编号", example = "", dataType="varchar(6)", required = true )
    private String channelno;

	@Length(max=6,min=0,message="平台方编号不能超出6位")
	@ApiModelProperty(value = "平台方编号", example = "", dataType="varchar(6)", required = true )
    private String terrcaeno;

	@Length(max=6,min=0,message="通道方编号不能超出6位")
	@ApiModelProperty(value = "通道方编号", example = "", dataType="varchar(6)", required = true )
    private String aisleno;

	@Length(max=6,min=0,message="资金方编号不能超出6位")
	@ApiModelProperty(value = "资金方编号", example = "", dataType="varchar(6)", required = true )
    private String fundno;

	@Length(max=12,min=0,message="状态不能超出12位")
	@ApiModelProperty(value = "状态", example = "", dataType="varchar(12)", required = true )
    private String state;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@ApiModelProperty(value = "申请日期", example = "", dataType="datetime", required = true )
    private Date applydate;

	@Length(max=8,min=0,message="业务所属柜员不能超出8位")
	@ApiModelProperty(value = "业务所属柜员", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=6,min=0,message="兜底机构不能超出6位")
	@ApiModelProperty(value = "兜底机构", example = "", dataType="varchar(6)", required = true )
    private String subsidycomno;

	@Length(max=40,min=0,message="合同编号不能超出40位")
	@ApiModelProperty(value = "合同编号", example = "", dataType="varchar(40)", required = true )
    private String contractno;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=1,min=0,message="录入状态不能超出1位")
	@ApiModelProperty(value = "录入状态", example = "", dataType="varchar(1)", required = true )
    private String intostate;

	@Length(max=40,min=0,message="设备编号不能超出40位")
	@ApiModelProperty(value = "设备编号", example = "", dataType="varchar(40)", required = true )
    private String deviceid;

	@Length(max=1,min=0,message="等级不能超出1位")
	@ApiModelProperty(value = "等级", example = "", dataType="varchar(1)", required = true )
    private String level;

	@Length(max=2,min=0,message="是否直播不能超出2位")
	@ApiModelProperty(value = "是否直播", example = "", dataType="varchar(2)", required = true )
    private String istolive;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno == null ? null : channelno.trim();
    }

    public String getTerrcaeno() {
        return terrcaeno;
    }

    public void setTerrcaeno(String terrcaeno) {
        this.terrcaeno = terrcaeno == null ? null : terrcaeno.trim();
    }

    public String getAisleno() {
        return aisleno;
    }

    public void setAisleno(String aisleno) {
        this.aisleno = aisleno == null ? null : aisleno.trim();
    }

    public String getFundno() {
        return fundno;
    }

    public void setFundno(String fundno) {
        this.fundno = fundno == null ? null : fundno.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getSubsidycomno() {
        return subsidycomno;
    }

    public void setSubsidycomno(String subsidycomno) {
        this.subsidycomno = subsidycomno == null ? null : subsidycomno.trim();
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
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

    public String getIntostate() {
        return intostate;
    }

    public void setIntostate(String intostate) {
        this.intostate = intostate == null ? null : intostate.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getIstolive() {
        return istolive;
    }

    public void setIstolive(String istolive) {
        this.istolive = istolive == null ? null : istolive.trim();
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
        Doctask other = (Doctask) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getDepartmentno() == null ? other.getDepartmentno() == null : this.getDepartmentno().equals(other.getDepartmentno()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getChannelno() == null ? other.getChannelno() == null : this.getChannelno().equals(other.getChannelno()))
            && (this.getTerrcaeno() == null ? other.getTerrcaeno() == null : this.getTerrcaeno().equals(other.getTerrcaeno()))
            && (this.getAisleno() == null ? other.getAisleno() == null : this.getAisleno().equals(other.getAisleno()))
            && (this.getFundno() == null ? other.getFundno() == null : this.getFundno().equals(other.getFundno()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getApplydate() == null ? other.getApplydate() == null : this.getApplydate().equals(other.getApplydate()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getSubsidycomno() == null ? other.getSubsidycomno() == null : this.getSubsidycomno().equals(other.getSubsidycomno()))
            && (this.getContractno() == null ? other.getContractno() == null : this.getContractno().equals(other.getContractno()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getIntostate() == null ? other.getIntostate() == null : this.getIntostate().equals(other.getIntostate()))
            && (this.getDeviceid() == null ? other.getDeviceid() == null : this.getDeviceid().equals(other.getDeviceid()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getIstolive() == null ? other.getIstolive() == null : this.getIstolive().equals(other.getIstolive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getDepartmentno() == null) ? 0 : getDepartmentno().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getChannelno() == null) ? 0 : getChannelno().hashCode());
        result = prime * result + ((getTerrcaeno() == null) ? 0 : getTerrcaeno().hashCode());
        result = prime * result + ((getAisleno() == null) ? 0 : getAisleno().hashCode());
        result = prime * result + ((getFundno() == null) ? 0 : getFundno().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getApplydate() == null) ? 0 : getApplydate().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getSubsidycomno() == null) ? 0 : getSubsidycomno().hashCode());
        result = prime * result + ((getContractno() == null) ? 0 : getContractno().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getIntostate() == null) ? 0 : getIntostate().hashCode());
        result = prime * result + ((getDeviceid() == null) ? 0 : getDeviceid().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getIstolive() == null) ? 0 : getIstolive().hashCode());
        return result;
    }
}
