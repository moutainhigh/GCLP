package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//审批历史记录表
public class Workhistory implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String fork;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String branch;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@Length(max=19,min=0,message="节点不能超出19位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(19)", required = true )
    private String node;

	@Length(max=19,min=0,message="下一节点不能超出19位")
	@ApiModelProperty(value = "下一节点", example = "", dataType="varchar(19)", required = true )
    private String nextnode;

	@Length(max=80,min=0,message="操作不能超出80位")
	@ApiModelProperty(value = "操作", example = "", dataType="varchar(80)", required = true )
    private String operation;

	@ApiModelProperty(value = "操作日期", example = "", dataType="datetime", required = true )
    private Date operdate;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String stage;

	@Length(max=6,min=0,message="类型不能超出6位")
	@ApiModelProperty(value = "类型", example = "", dataType="varchar(6)", required = true )
    private String type;

	@ApiModelProperty(value = "审批意见", example = "", dataType="longtext", required = true )
    private String notation;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    public String getNextnode() {
        return nextnode;
    }

    public void setNextnode(String nextnode) {
        this.nextnode = nextnode == null ? null : nextnode.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Date getOperdate() {
        return operdate;
    }

    public void setOperdate(Date operdate) {
        this.operdate = operdate;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation == null ? null : notation.trim();
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
        Workhistory other = (Workhistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getFork() == null ? other.getFork() == null : this.getFork().equals(other.getFork()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNode() == null ? other.getNode() == null : this.getNode().equals(other.getNode()))
            && (this.getNextnode() == null ? other.getNextnode() == null : this.getNextnode().equals(other.getNextnode()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getOperdate() == null ? other.getOperdate() == null : this.getOperdate().equals(other.getOperdate()))
            && (this.getStage() == null ? other.getStage() == null : this.getStage().equals(other.getStage()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getNotation() == null ? other.getNotation() == null : this.getNotation().equals(other.getNotation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getFork() == null) ? 0 : getFork().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNode() == null) ? 0 : getNode().hashCode());
        result = prime * result + ((getNextnode() == null) ? 0 : getNextnode().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getOperdate() == null) ? 0 : getOperdate().hashCode());
        result = prime * result + ((getStage() == null) ? 0 : getStage().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getNotation() == null) ? 0 : getNotation().hashCode());
        return result;
    }
}
