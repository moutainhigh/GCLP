package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//角色菜单表
public class Rolemenu implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=4,min=0,message="不能超出4位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(4)", required = true )
    private String roleid;

	@Length(max=6,min=0,message="不能超出6位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(6)", required = true )
    private String menuid;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String editflg;

	@Length(max=1,min=0,message="不能超出1位")
	@ApiModelProperty(value = "", example = "", dataType="char(1)", required = true )
    private String viewflg;

	@Length(max=1,min=0,message="菜单类型不能超出1位")
	@ApiModelProperty(value = "菜单类型", example = "", dataType="char(1)", required = true )
    private String menutype;

	@Length(max=8,min=0,message="不能超出8位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
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

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype == null ? null : menutype.trim();
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
        Rolemenu other = (Rolemenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()))
            && (this.getEditflg() == null ? other.getEditflg() == null : this.getEditflg().equals(other.getEditflg()))
            && (this.getViewflg() == null ? other.getViewflg() == null : this.getViewflg().equals(other.getViewflg()))
            && (this.getMenutype() == null ? other.getMenutype() == null : this.getMenutype().equals(other.getMenutype()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        result = prime * result + ((getEditflg() == null) ? 0 : getEditflg().hashCode());
        result = prime * result + ((getViewflg() == null) ? 0 : getViewflg().hashCode());
        result = prime * result + ((getMenutype() == null) ? 0 : getMenutype().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
