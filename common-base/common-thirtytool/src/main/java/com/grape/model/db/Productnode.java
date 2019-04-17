package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//null
public class Productnode implements Serializable {
	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String type;

	@Length(max=19,min=0,message="节点编号不能超出19位")
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=80,min=0,message="节点名称不能超出80位")
	@ApiModelProperty(value = "节点名称", example = "", dataType="varchar(80)", required = true )
    private String nodename;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String fork;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String branch;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String tonode;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(1)", required = true )
    private String lane;

	@Length(max=4,min=0,message="不能超出4位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(4)", required = true )
    private String assignmode;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String authority;

	@Length(max=20,min=0,message="审批阶段不能超出20位")
	@ApiModelProperty(value = "审批阶段", example = "", dataType="varchar(20)", required = true )
    private String stage;

	@Length(max=19,min=0,message="下一审批人指派目标节点不能超出19位")
	@ApiModelProperty(value = "下一审批人指派目标节点", example = "", dataType="varchar(19)", required = true )
    private String assigntagnode;

	@Length(max=2,min=0,message="处理时间不能超出2位")
	@ApiModelProperty(value = "处理时间", example = "", dataType="varchar(2)", required = true )
    private String processtime;

	@Length(max=2,min=0,message="不能超出2位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(2)", required = true )
    private String approvenum;

	@Length(max=2,min=0,message="节点状态不能超出2位")
	@ApiModelProperty(value = "节点状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@Length(max=2,min=0,message="是否虚拟节点不能超出2位")
	@ApiModelProperty(value = "是否虚拟节点", example = "", dataType="varchar(2)", required = true )
    private String istruenode;

	@Length(max=2,min=0,message="审批类型不能超出2位")
	@ApiModelProperty(value = "审批类型", example = "", dataType="varchar(2)", required = true )
    private String bussinesstype;

    private static final long serialVersionUID = 1L;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
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

    public String getFork() {
        return fork;
    }

    public void setFork(String fork) {
        this.fork = fork == null ? null : fork.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getTonode() {
        return tonode;
    }

    public void setTonode(String tonode) {
        this.tonode = tonode == null ? null : tonode.trim();
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane == null ? null : lane.trim();
    }

    public String getAssignmode() {
        return assignmode;
    }

    public void setAssignmode(String assignmode) {
        this.assignmode = assignmode == null ? null : assignmode.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getAssigntagnode() {
        return assigntagnode;
    }

    public void setAssigntagnode(String assigntagnode) {
        this.assigntagnode = assigntagnode == null ? null : assigntagnode.trim();
    }

    public String getProcesstime() {
        return processtime;
    }

    public void setProcesstime(String processtime) {
        this.processtime = processtime == null ? null : processtime.trim();
    }

    public String getApprovenum() {
        return approvenum;
    }

    public void setApprovenum(String approvenum) {
        this.approvenum = approvenum == null ? null : approvenum.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIstruenode() {
        return istruenode;
    }

    public void setIstruenode(String istruenode) {
        this.istruenode = istruenode == null ? null : istruenode.trim();
    }

    public String getBussinesstype() {
        return bussinesstype;
    }

    public void setBussinesstype(String bussinesstype) {
        this.bussinesstype = bussinesstype == null ? null : bussinesstype.trim();
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
        Productnode other = (Productnode) that;
        return (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getNodename() == null ? other.getNodename() == null : this.getNodename().equals(other.getNodename()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getFork() == null ? other.getFork() == null : this.getFork().equals(other.getFork()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getTonode() == null ? other.getTonode() == null : this.getTonode().equals(other.getTonode()))
            && (this.getLane() == null ? other.getLane() == null : this.getLane().equals(other.getLane()))
            && (this.getAssignmode() == null ? other.getAssignmode() == null : this.getAssignmode().equals(other.getAssignmode()))
            && (this.getAuthority() == null ? other.getAuthority() == null : this.getAuthority().equals(other.getAuthority()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getAssigntagnode() == null ? other.getAssigntagnode() == null : this.getAssigntagnode().equals(other.getAssigntagnode()))
            && (this.getProcesstime() == null ? other.getProcesstime() == null : this.getProcesstime().equals(other.getProcesstime()))
            && (this.getApprovenum() == null ? other.getApprovenum() == null : this.getApprovenum().equals(other.getApprovenum()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIstruenode() == null ? other.getIstruenode() == null : this.getIstruenode().equals(other.getIstruenode()))
            && (this.getBussinesstype() == null ? other.getBussinesstype() == null : this.getBussinesstype().equals(other.getBussinesstype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getNodename() == null) ? 0 : getNodename().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getFork() == null) ? 0 : getFork().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getTonode() == null) ? 0 : getTonode().hashCode());
        result = prime * result + ((getLane() == null) ? 0 : getLane().hashCode());
        result = prime * result + ((getAssignmode() == null) ? 0 : getAssignmode().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getAssigntagnode() == null) ? 0 : getAssigntagnode().hashCode());
        result = prime * result + ((getProcesstime() == null) ? 0 : getProcesstime().hashCode());
        result = prime * result + ((getApprovenum() == null) ? 0 : getApprovenum().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getIstruenode() == null) ? 0 : getIstruenode().hashCode());
        result = prime * result + ((getBussinesstype() == null) ? 0 : getBussinesstype().hashCode());
        return result;
    }
}
