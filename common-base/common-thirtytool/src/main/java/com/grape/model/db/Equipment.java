package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//设备
public class Equipment implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=20,min=0,message="现场平台ip不能超出20位")
	@ApiModelProperty(value = "现场平台ip", example = "", dataType="varchar(20)", required = true )
    private String pltip;

	@Length(max=9,min=0,message="端口号不能超出9位")
	@ApiModelProperty(value = "端口号", example = "", dataType="varchar(9)", required = true )
    private String pltport;

	@Length(max=19,min=0,message="用户名不能超出19位")
	@ApiModelProperty(value = "用户名", example = "", dataType="varchar(19)", required = true )
    private String mcuuser;

	@Length(max=19,min=0,message="密码不能超出19位")
	@ApiModelProperty(value = "密码", example = "", dataType="varchar(19)", required = true )
    private String mcupwd;

	@Length(max=40,min=0,message="设备编号不能超出40位")
	@ApiModelProperty(value = "设备编号", example = "", dataType="varchar(40)", required = true )
    private String deviceid;

	@Length(max=9,min=0,message="视频源号不能超出9位")
	@ApiModelProperty(value = "视频源号", example = "", dataType="varchar(9)", required = true )
    private String src;

	@Length(max=9,min=0,message="编码通道号不能超出9位")
	@ApiModelProperty(value = "编码通道号", example = "", dataType="varchar(9)", required = true )
    private String chan;

	@Length(max=19,min=0,message="设备所在厂商不能超出19位")
	@ApiModelProperty(value = "设备所在厂商", example = "", dataType="varchar(19)", required = true )
    private String manu;

	@Length(max=40,min=0,message="域id不能超出40位")
	@ApiModelProperty(value = "域id", example = "", dataType="varchar(40)", required = true )
    private String domainid;

	@Length(max=40,min=0,message="不能超出40位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(40)", required = true )
    private String puid;
	
	@Length(max=40,min=0,message="不能超出44位")
	@ApiModelProperty(value = "高级端口号", example = "", dataType="varchar(40)", required = true )
	private String highport;

	    private static final long serialVersionUID = 1L;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getPltip() {
	        return pltip;
	    }

	    public void setPltip(String pltip) {
	        this.pltip = pltip == null ? null : pltip.trim();
	    }

	    public String getPltport() {
	        return pltport;
	    }

	    public void setPltport(String pltport) {
	        this.pltport = pltport == null ? null : pltport.trim();
	    }

	    public String getMcuuser() {
	        return mcuuser;
	    }

	    public void setMcuuser(String mcuuser) {
	        this.mcuuser = mcuuser == null ? null : mcuuser.trim();
	    }

	    public String getMcupwd() {
	        return mcupwd;
	    }

	    public void setMcupwd(String mcupwd) {
	        this.mcupwd = mcupwd == null ? null : mcupwd.trim();
	    }

	    public String getDeviceid() {
	        return deviceid;
	    }

	    public void setDeviceid(String deviceid) {
	        this.deviceid = deviceid == null ? null : deviceid.trim();
	    }

	    public String getSrc() {
	        return src;
	    }

	    public void setSrc(String src) {
	        this.src = src == null ? null : src.trim();
	    }

	    public String getChan() {
	        return chan;
	    }

	    public void setChan(String chan) {
	        this.chan = chan == null ? null : chan.trim();
	    }

	    public String getManu() {
	        return manu;
	    }

	    public void setManu(String manu) {
	        this.manu = manu == null ? null : manu.trim();
	    }

	    public String getDomainid() {
	        return domainid;
	    }

	    public void setDomainid(String domainid) {
	        this.domainid = domainid == null ? null : domainid.trim();
	    }

	    public String getPuid() {
	        return puid;
	    }

	    public void setPuid(String puid) {
	        this.puid = puid == null ? null : puid.trim();
	    }

	    public String getHighport() {
	        return highport;
	    }

	    public void setHighport(String highport) {
	        this.highport = highport == null ? null : highport.trim();
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
	        Equipment other = (Equipment) that;
	        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
	            && (this.getPltip() == null ? other.getPltip() == null : this.getPltip().equals(other.getPltip()))
	            && (this.getPltport() == null ? other.getPltport() == null : this.getPltport().equals(other.getPltport()))
	            && (this.getMcuuser() == null ? other.getMcuuser() == null : this.getMcuuser().equals(other.getMcuuser()))
	            && (this.getMcupwd() == null ? other.getMcupwd() == null : this.getMcupwd().equals(other.getMcupwd()))
	            && (this.getDeviceid() == null ? other.getDeviceid() == null : this.getDeviceid().equals(other.getDeviceid()))
	            && (this.getSrc() == null ? other.getSrc() == null : this.getSrc().equals(other.getSrc()))
	            && (this.getChan() == null ? other.getChan() == null : this.getChan().equals(other.getChan()))
	            && (this.getManu() == null ? other.getManu() == null : this.getManu().equals(other.getManu()))
	            && (this.getDomainid() == null ? other.getDomainid() == null : this.getDomainid().equals(other.getDomainid()))
	            && (this.getPuid() == null ? other.getPuid() == null : this.getPuid().equals(other.getPuid()))
	            && (this.getHighport() == null ? other.getHighport() == null : this.getHighport().equals(other.getHighport()));
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
	        result = prime * result + ((getPltip() == null) ? 0 : getPltip().hashCode());
	        result = prime * result + ((getPltport() == null) ? 0 : getPltport().hashCode());
	        result = prime * result + ((getMcuuser() == null) ? 0 : getMcuuser().hashCode());
	        result = prime * result + ((getMcupwd() == null) ? 0 : getMcupwd().hashCode());
	        result = prime * result + ((getDeviceid() == null) ? 0 : getDeviceid().hashCode());
	        result = prime * result + ((getSrc() == null) ? 0 : getSrc().hashCode());
	        result = prime * result + ((getChan() == null) ? 0 : getChan().hashCode());
	        result = prime * result + ((getManu() == null) ? 0 : getManu().hashCode());
	        result = prime * result + ((getDomainid() == null) ? 0 : getDomainid().hashCode());
	        result = prime * result + ((getPuid() == null) ? 0 : getPuid().hashCode());
	        result = prime * result + ((getHighport() == null) ? 0 : getHighport().hashCode());
	        return result;
	    }
	}

