package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//
public class Menuinfo implements Serializable {
	@Length(max=255,min=0,message="不能超出255位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(255)", required = true )
    private String menuid;

	@Length(max=255,min=0,message="不能超出255位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(255)", required = true )
    private String editflg;

	@Length(max=255,min=0,message="不能超出255位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(255)", required = true )
    private String menuname;

	@Length(max=255,min=0,message="不能超出255位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(255)", required = true )
    private String viewflg;

    private static final long serialVersionUID = 1L;

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

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getViewflg() {
        return viewflg;
    }

    public void setViewflg(String viewflg) {
        this.viewflg = viewflg == null ? null : viewflg.trim();
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
        Menuinfo other = (Menuinfo) that;
        return (this.getMenuid() == null ? other.getMenuid() == null : this.getMenuid().equals(other.getMenuid()))
            && (this.getEditflg() == null ? other.getEditflg() == null : this.getEditflg().equals(other.getEditflg()))
            && (this.getMenuname() == null ? other.getMenuname() == null : this.getMenuname().equals(other.getMenuname()))
            && (this.getViewflg() == null ? other.getViewflg() == null : this.getViewflg().equals(other.getViewflg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuid() == null) ? 0 : getMenuid().hashCode());
        result = prime * result + ((getEditflg() == null) ? 0 : getEditflg().hashCode());
        result = prime * result + ((getMenuname() == null) ? 0 : getMenuname().hashCode());
        result = prime * result + ((getViewflg() == null) ? 0 : getViewflg().hashCode());
        return result;
    }
}
