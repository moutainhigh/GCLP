package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Riskapprovalform implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批历史关联id不能超出19位")
	@ApiModelProperty(value = "审批历史关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="各个合同是否已签署正确不能超出1位")
	@ApiModelProperty(value = "各个合同是否已签署正确", example = "", dataType="char(1)", required = true )
    private String pactsignflg;

	@Length(max=300,min=0,message="各类合同是否正确签署情况说明不能超出300位")
	@ApiModelProperty(value = "各类合同是否正确签署情况说明", example = "", dataType="varchar(300)", required = true )
    private String pactsignnote;

	@Length(max=1,min=0,message="各个声明文件是否已正确签署不能超出1位")
	@ApiModelProperty(value = "各个声明文件是否已正确签署", example = "", dataType="char(1)", required = true )
    private String statesignflg;

	@Length(max=300,min=0,message="各个声明文件是否已正确签署情况说明不能超出300位")
	@ApiModelProperty(value = "各个声明文件是否已正确签署情况说明", example = "", dataType="varchar(300)", required = true )
    private String statesignnote;

	@Length(max=300,min=0,message="审批意见不能超出300位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(300)", required = true )
    private String notation;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=6,min=0,message="节点不能超出6位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(6)", required = true )
    private String nodeid;

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

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getPactsignflg() {
        return pactsignflg;
    }

    public void setPactsignflg(String pactsignflg) {
        this.pactsignflg = pactsignflg == null ? null : pactsignflg.trim();
    }

    public String getPactsignnote() {
        return pactsignnote;
    }

    public void setPactsignnote(String pactsignnote) {
        this.pactsignnote = pactsignnote == null ? null : pactsignnote.trim();
    }

    public String getStatesignflg() {
        return statesignflg;
    }

    public void setStatesignflg(String statesignflg) {
        this.statesignflg = statesignflg == null ? null : statesignflg.trim();
    }

    public String getStatesignnote() {
        return statesignnote;
    }

    public void setStatesignnote(String statesignnote) {
        this.statesignnote = statesignnote == null ? null : statesignnote.trim();
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation == null ? null : notation.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
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
        Riskapprovalform other = (Riskapprovalform) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getPactsignflg() == null ? other.getPactsignflg() == null : this.getPactsignflg().equals(other.getPactsignflg()))
            && (this.getPactsignnote() == null ? other.getPactsignnote() == null : this.getPactsignnote().equals(other.getPactsignnote()))
            && (this.getStatesignflg() == null ? other.getStatesignflg() == null : this.getStatesignflg().equals(other.getStatesignflg()))
            && (this.getStatesignnote() == null ? other.getStatesignnote() == null : this.getStatesignnote().equals(other.getStatesignnote()))
            && (this.getNotation() == null ? other.getNotation() == null : this.getNotation().equals(other.getNotation()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getPactsignflg() == null) ? 0 : getPactsignflg().hashCode());
        result = prime * result + ((getPactsignnote() == null) ? 0 : getPactsignnote().hashCode());
        result = prime * result + ((getStatesignflg() == null) ? 0 : getStatesignflg().hashCode());
        result = prime * result + ((getStatesignnote() == null) ? 0 : getStatesignnote().hashCode());
        result = prime * result + ((getNotation() == null) ? 0 : getNotation().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
