package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//节点页面表
public class Nodepage implements Serializable {
	@Length(max=10,min=0,message="id不能超出10位")
	@ApiModelProperty(value = "id", example = "", dataType="char(10)", required = true )
    private String id;

	@Length(max=10,min=0,message="产品编号不能超出10位")
	@ApiModelProperty(value = "产品编号", example = "", dataType="char(10)", required = true )
    private String productno;

	@Length(max=10,min=0,message="节点不能超出10位")
	@ApiModelProperty(value = "节点", example = "", dataType="char(10)", required = true )
    private String nodeid;

	@Length(max=10,min=0,message="页面不能超出10位")
	@ApiModelProperty(value = "页面", example = "", dataType="char(10)", required = true )
    private String pageid;

	@Length(max=10,min=0,message="是否可编辑不能超出10位")
	@ApiModelProperty(value = "是否可编辑", example = "", dataType="char(10)", required = true )
    private String editflg;

	@Length(max=10,min=0,message="是否可查看不能超出10位")
	@ApiModelProperty(value = "是否可查看", example = "", dataType="char(10)", required = true )
    private String viewflg;

	@Length(max=80,min=0,message="页面所属按钮不能超出80位")
	@ApiModelProperty(value = "页面所属按钮", example = "", dataType="varchar(80)", required = true )
    private String pagebutton;

	@Length(max=1,min=0,message="在基本信息页展示不能超出1位")
	@ApiModelProperty(value = "在基本信息页展示", example = "", dataType="char(1)", required = true )
    private String basepageflg;

	@Length(max=1,min=0,message="在审批信息页展示不能超出1位")
	@ApiModelProperty(value = "在审批信息页展示", example = "", dataType="char(1)", required = true )
    private String approvalpageflg;

	@Length(max=10,min=0,message="最后修改人不能超出10位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="char(10)", required = true )
    private String chgtl;

	@Length(max=10,min=0,message="最后修改时间不能超出10位")
	@ApiModelProperty(value = "最后修改时间", example = "", dataType="char(10)", required = true )
    private String chgdt;

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

    public String getPageid() {
        return pageid;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid == null ? null : pageid.trim();
    }

    public String getEditflg() {
        return editflg;
    }

    public void setEditflg(String editflg) {
        this.editflg = editflg == null ? null : editflg.trim();
    }

    public String getViewflg() {
        return viewflg;
    }

    public void setViewflg(String viewflg) {
        this.viewflg = viewflg == null ? null : viewflg.trim();
    }

    public String getPagebutton() {
        return pagebutton;
    }

    public void setPagebutton(String pagebutton) {
        this.pagebutton = pagebutton == null ? null : pagebutton.trim();
    }

    public String getBasepageflg() {
        return basepageflg;
    }

    public void setBasepageflg(String basepageflg) {
        this.basepageflg = basepageflg == null ? null : basepageflg.trim();
    }

    public String getApprovalpageflg() {
        return approvalpageflg;
    }

    public void setApprovalpageflg(String approvalpageflg) {
        this.approvalpageflg = approvalpageflg == null ? null : approvalpageflg.trim();
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public String getChgdt() {
        return chgdt;
    }

    public void setChgdt(String chgdt) {
        this.chgdt = chgdt == null ? null : chgdt.trim();
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
        Nodepage other = (Nodepage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getPageid() == null ? other.getPageid() == null : this.getPageid().equals(other.getPageid()))
            && (this.getEditflg() == null ? other.getEditflg() == null : this.getEditflg().equals(other.getEditflg()))
            && (this.getViewflg() == null ? other.getViewflg() == null : this.getViewflg().equals(other.getViewflg()))
            && (this.getPagebutton() == null ? other.getPagebutton() == null : this.getPagebutton().equals(other.getPagebutton()))
            && (this.getBasepageflg() == null ? other.getBasepageflg() == null : this.getBasepageflg().equals(other.getBasepageflg()))
            && (this.getApprovalpageflg() == null ? other.getApprovalpageflg() == null : this.getApprovalpageflg().equals(other.getApprovalpageflg()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getPageid() == null) ? 0 : getPageid().hashCode());
        result = prime * result + ((getEditflg() == null) ? 0 : getEditflg().hashCode());
        result = prime * result + ((getViewflg() == null) ? 0 : getViewflg().hashCode());
        result = prime * result + ((getPagebutton() == null) ? 0 : getPagebutton().hashCode());
        result = prime * result + ((getBasepageflg() == null) ? 0 : getBasepageflg().hashCode());
        result = prime * result + ((getApprovalpageflg() == null) ? 0 : getApprovalpageflg().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
