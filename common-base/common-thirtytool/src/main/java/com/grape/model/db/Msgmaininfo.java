package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//消息主表
public class Msgmaininfo implements Serializable {
	@Length(max=19,min=0,message="消息编号不能超出19位")
	@ApiModelProperty(value = "消息编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="贷款流水号不能超出10位")
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=8,min=0,message="发送人不能超出8位")
	@ApiModelProperty(value = "发送人", example = "", dataType="varchar(8)", required = true )
    private String senduser;

	@Length(max=8,min=0,message="接收人不能超出8位")
	@ApiModelProperty(value = "接收人", example = "", dataType="varchar(8)", required = true )
    private String recuser;

	@Length(max=2,min=0,message="消息类型不能超出2位")
	@ApiModelProperty(value = "消息类型", example = "", dataType="varchar(2)", required = true )
    private String msgtype;

	@Length(max=20,min=0,message="节点不能超出20位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(20)", required = true )
    private String node;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "内容", example = "", dataType="longtext", required = true )
    private String content;

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

    public String getSenduser() {
        return senduser;
    }

    public void setSenduser(String senduser) {
        this.senduser = senduser == null ? null : senduser.trim();
    }

    public String getRecuser() {
        return recuser;
    }

    public void setRecuser(String recuser) {
        this.recuser = recuser == null ? null : recuser.trim();
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype == null ? null : msgtype.trim();
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
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
        Msgmaininfo other = (Msgmaininfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getSenduser() == null ? other.getSenduser() == null : this.getSenduser().equals(other.getSenduser()))
            && (this.getRecuser() == null ? other.getRecuser() == null : this.getRecuser().equals(other.getRecuser()))
            && (this.getMsgtype() == null ? other.getMsgtype() == null : this.getMsgtype().equals(other.getMsgtype()))
            && (this.getNode() == null ? other.getNode() == null : this.getNode().equals(other.getNode()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getSenduser() == null) ? 0 : getSenduser().hashCode());
        result = prime * result + ((getRecuser() == null) ? 0 : getRecuser().hashCode());
        result = prime * result + ((getMsgtype() == null) ? 0 : getMsgtype().hashCode());
        result = prime * result + ((getNode() == null) ? 0 : getNode().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}
