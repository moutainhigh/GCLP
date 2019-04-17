package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//直播信息表
public class Liveinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageno;

	@Length(max=80,min=0,message="直播人不能超出80位")
	@ApiModelProperty(value = "直播人", example = "", dataType="varchar(80)", required = true )
    private String liveperson;

	@Length(max=80,min=0,message="监控人不能超出80位")
	@ApiModelProperty(value = "监控人", example = "", dataType="varchar(80)", required = true )
    private String monitor;

	@ApiModelProperty(value = "直播开始时间", example = "", dataType="datetime", required = true )
    private Date livestarttime;

	@ApiModelProperty(value = "直播结束时间", example = "", dataType="datetime", required = true )
    private Date liveendtime;

	@Length(max=1,min=0,message="是否正在直播不能超出1位")
	@ApiModelProperty(value = "是否正在直播", example = "", dataType="varchar(1)", required = true )
    private String islive;

	@Length(max=20,min=0,message="节点不能超出20位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(20)", required = true )
    private String nodeid;

	@Length(max=80,min=0,message="直播类型不能超出80位")
	@ApiModelProperty(value = "直播类型", example = "", dataType="varchar(80)", required = true )
    private String type;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getMortgageno() {
        return mortgageno;
    }

    public void setMortgageno(String mortgageno) {
        this.mortgageno = mortgageno == null ? null : mortgageno.trim();
    }

    public String getLiveperson() {
        return liveperson;
    }

    public void setLiveperson(String liveperson) {
        this.liveperson = liveperson == null ? null : liveperson.trim();
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor == null ? null : monitor.trim();
    }

    public Date getLivestarttime() {
        return livestarttime;
    }

    public void setLivestarttime(Date livestarttime) {
        this.livestarttime = livestarttime;
    }

    public Date getLiveendtime() {
        return liveendtime;
    }

    public void setLiveendtime(Date liveendtime) {
        this.liveendtime = liveendtime;
    }

    public String getIslive() {
        return islive;
    }

    public void setIslive(String islive) {
        this.islive = islive == null ? null : islive.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
        Liveinfo other = (Liveinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getMortgageno() == null ? other.getMortgageno() == null : this.getMortgageno().equals(other.getMortgageno()))
            && (this.getLiveperson() == null ? other.getLiveperson() == null : this.getLiveperson().equals(other.getLiveperson()))
            && (this.getMonitor() == null ? other.getMonitor() == null : this.getMonitor().equals(other.getMonitor()))
            && (this.getLivestarttime() == null ? other.getLivestarttime() == null : this.getLivestarttime().equals(other.getLivestarttime()))
            && (this.getLiveendtime() == null ? other.getLiveendtime() == null : this.getLiveendtime().equals(other.getLiveendtime()))
            && (this.getIslive() == null ? other.getIslive() == null : this.getIslive().equals(other.getIslive()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getMortgageno() == null) ? 0 : getMortgageno().hashCode());
        result = prime * result + ((getLiveperson() == null) ? 0 : getLiveperson().hashCode());
        result = prime * result + ((getMonitor() == null) ? 0 : getMonitor().hashCode());
        result = prime * result + ((getLivestarttime() == null) ? 0 : getLivestarttime().hashCode());
        result = prime * result + ((getLiveendtime() == null) ? 0 : getLiveendtime().hashCode());
        result = prime * result + ((getIslive() == null) ? 0 : getIslive().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
