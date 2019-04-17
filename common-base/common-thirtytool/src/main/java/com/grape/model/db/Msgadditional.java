package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//消息附加表
public class Msgadditional implements Serializable {
	@Length(max=19,min=0,message="消息编号不能超出19位")
	@ApiModelProperty(value = "消息编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="关联消息编号不能超出19位")
	@ApiModelProperty(value = "关联消息编号", example = "", dataType="varchar(19)", required = true )
    private String refid;

	@Length(max=8,min=0,message="接收人不能超出8位")
	@ApiModelProperty(value = "接收人", example = "", dataType="varchar(8)", required = true )
    private String evaltime;

	@Length(max=1,min=0,message="消息状态不能超出1位")
	@ApiModelProperty(value = "消息状态", example = "", dataType="varchar(1)", required = true )
    private String state;

	@ApiModelProperty(value = "", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public String getEvaltime() {
        return evaltime;
    }

    public void setEvaltime(String evaltime) {
        this.evaltime = evaltime == null ? null : evaltime.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
        Msgadditional other = (Msgadditional) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRefid() == null ? other.getRefid() == null : this.getRefid().equals(other.getRefid()))
            && (this.getEvaltime() == null ? other.getEvaltime() == null : this.getEvaltime().equals(other.getEvaltime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRefid() == null) ? 0 : getRefid().hashCode());
        result = prime * result + ((getEvaltime() == null) ? 0 : getEvaltime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
