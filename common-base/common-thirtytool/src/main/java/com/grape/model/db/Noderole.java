package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//角色权限表
public class Noderole implements Serializable {
	@Length(max=19,min=0,message="id不能超出19位")
	@ApiModelProperty(value = "id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=6,min=0,message="产品编号不能超出6位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=4,min=0,message="节点不能超出4位")
	@ApiModelProperty(value = "节点", example = "", dataType="varchar(4)", required = true )
    private String nodeid;

	@Length(max=16,min=0,message="跳转类型不能超出16位")
	@ApiModelProperty(value = "跳转类型", example = "", dataType="varchar(16)", required = true )
    private String redirecttype;

	@Length(max=4,min=0,message="上一节点不能超出4位")
	@ApiModelProperty(value = "上一节点", example = "", dataType="varchar(4)", required = true )
    private String lastnode;

	@Length(max=120,min=0,message="进入条件不能超出120位")
	@ApiModelProperty(value = "进入条件", example = "", dataType="varchar(120)", required = true )
    private String entercondition;

	@Length(max=4,min=0,message="节点时限不能超出4位")
	@ApiModelProperty(value = "节点时限", example = "", dataType="varchar(4)", required = true )
    private String nodetime;

	@Length(max=4,min=0,message="角色不能超出4位")
	@ApiModelProperty(value = "角色", example = "", dataType="varchar(4)", required = true )
    private String roleid;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgdt;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgtl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getRedirecttype() {
        return redirecttype;
    }

    public void setRedirecttype(String redirecttype) {
        this.redirecttype = redirecttype == null ? null : redirecttype.trim();
    }

    public String getLastnode() {
        return lastnode;
    }

    public void setLastnode(String lastnode) {
        this.lastnode = lastnode == null ? null : lastnode.trim();
    }

    public String getEntercondition() {
        return entercondition;
    }

    public void setEntercondition(String entercondition) {
        this.entercondition = entercondition == null ? null : entercondition.trim();
    }

    public String getNodetime() {
        return nodetime;
    }

    public void setNodetime(String nodetime) {
        this.nodetime = nodetime == null ? null : nodetime.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getChgdt() {
        return chgdt;
    }

    public void setChgdt(String chgdt) {
        this.chgdt = chgdt == null ? null : chgdt.trim();
    }

    public Date getChgtl() {
        return chgtl;
    }

    public void setChgtl(Date chgtl) {
        this.chgtl = chgtl;
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
        Noderole other = (Noderole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getRedirecttype() == null ? other.getRedirecttype() == null : this.getRedirecttype().equals(other.getRedirecttype()))
            && (this.getLastnode() == null ? other.getLastnode() == null : this.getLastnode().equals(other.getLastnode()))
            && (this.getEntercondition() == null ? other.getEntercondition() == null : this.getEntercondition().equals(other.getEntercondition()))
            && (this.getNodetime() == null ? other.getNodetime() == null : this.getNodetime().equals(other.getNodetime()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getRedirecttype() == null) ? 0 : getRedirecttype().hashCode());
        result = prime * result + ((getLastnode() == null) ? 0 : getLastnode().hashCode());
        result = prime * result + ((getEntercondition() == null) ? 0 : getEntercondition().hashCode());
        result = prime * result + ((getNodetime() == null) ? 0 : getNodetime().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
