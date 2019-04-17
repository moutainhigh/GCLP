package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//null
public class Nodebutton implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=80,min=0,message="按钮名称不能超出80位")
	@ApiModelProperty(value = "按钮名称", example = "", dataType="varchar(80)", required = true )
    private String name;

	@Length(max=19,min=0,message="跳转节点不能超出19位")
	@ApiModelProperty(value = "跳转节点", example = "", dataType="varchar(19)", required = true )
    private String nextnode;

	@Length(max=120,min=0,message="跳转条件不能超出120位")
	@ApiModelProperty(value = "跳转条件", example = "", dataType="varchar(120)", required = true )
    private String condtn;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改日期", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String productno;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String nodeid;

	@Length(max=20,min=0,message="按键顺序不能超出20位")
	@ApiModelProperty(value = "按键顺序", example = "", dataType="varchar(20)", required = true )
    private String ordernode;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNextnode() {
        return nextnode;
    }

    public void setNextnode(String nextnode) {
        this.nextnode = nextnode == null ? null : nextnode.trim();
    }

    public String getCondtn() {
        return condtn;
    }

    public void setCondtn(String condtn) {
        this.condtn = condtn == null ? null : condtn.trim();
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

    public String getOrdernode() {
        return ordernode;
    }

    public void setOrdernode(String ordernode) {
        this.ordernode = ordernode == null ? null : ordernode.trim();
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
        Nodebutton other = (Nodebutton) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNextnode() == null ? other.getNextnode() == null : this.getNextnode().equals(other.getNextnode()))
            && (this.getCondtn() == null ? other.getCondtn() == null : this.getCondtn().equals(other.getCondtn()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getOrdernode() == null ? other.getOrdernode() == null : this.getOrdernode().equals(other.getOrdernode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNextnode() == null) ? 0 : getNextnode().hashCode());
        result = prime * result + ((getCondtn() == null) ? 0 : getCondtn().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getOrdernode() == null) ? 0 : getOrdernode().hashCode());
        return result;
    }
}
