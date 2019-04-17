package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//
public class Proctrans implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String transid;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String buttonid;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String name;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String tonode;

	@Length(max=500,min=0,message="不能超出500位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(500)", required = true )
    private String condexpress;

    private static final long serialVersionUID = 1L;

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid == null ? null : transid.trim();
    }

    public String getButtonid() {
        return buttonid;
    }

    public void setButtonid(String buttonid) {
        this.buttonid = buttonid == null ? null : buttonid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTonode() {
        return tonode;
    }

    public void setTonode(String tonode) {
        this.tonode = tonode == null ? null : tonode.trim();
    }

    public String getCondexpress() {
        return condexpress;
    }

    public void setCondexpress(String condexpress) {
        this.condexpress = condexpress == null ? null : condexpress.trim();
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
        Proctrans other = (Proctrans) that;
        return (this.getTransid() == null ? other.getTransid() == null : this.getTransid().equals(other.getTransid()))
            && (this.getButtonid() == null ? other.getButtonid() == null : this.getButtonid().equals(other.getButtonid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTonode() == null ? other.getTonode() == null : this.getTonode().equals(other.getTonode()))
            && (this.getCondexpress() == null ? other.getCondexpress() == null : this.getCondexpress().equals(other.getCondexpress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransid() == null) ? 0 : getTransid().hashCode());
        result = prime * result + ((getButtonid() == null) ? 0 : getButtonid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTonode() == null) ? 0 : getTonode().hashCode());
        result = prime * result + ((getCondexpress() == null) ? 0 : getCondexpress().hashCode());
        return result;
    }
}
