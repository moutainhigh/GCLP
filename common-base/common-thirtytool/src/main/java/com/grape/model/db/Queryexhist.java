package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Queryexhist implements Serializable {
	@Length(max=19,min=0,message="id不能超出19位")
	@ApiModelProperty(value = "id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=20,min=0,message="渠道编号不能超出20位")
	@ApiModelProperty(value = "渠道编号", example = "", dataType="varchar(20)", required = true )
    private String channelno;

	@Length(max=1,min=0,message="接口不能超出1位")
	@ApiModelProperty(value = "接口", example = "", dataType="varchar(1)", required = true )
    private String interfaceno;

	@Length(max=1,min=0,message="成功标志不能超出1位")
	@ApiModelProperty(value = "成功标志", example = "", dataType="varchar(1)", required = true )
    private String successflag;

	@ApiModelProperty(value = "查询时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="查询人不能超出8位")
	@ApiModelProperty(value = "查询人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

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

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno == null ? null : channelno.trim();
    }

    public String getInterfaceno() {
        return interfaceno;
    }

    public void setInterfaceno(String interfaceno) {
        this.interfaceno = interfaceno == null ? null : interfaceno.trim();
    }

    public String getSuccessflag() {
        return successflag;
    }

    public void setSuccessflag(String successflag) {
        this.successflag = successflag == null ? null : successflag.trim();
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
        Queryexhist other = (Queryexhist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getChannelno() == null ? other.getChannelno() == null : this.getChannelno().equals(other.getChannelno()))
            && (this.getInterfaceno() == null ? other.getInterfaceno() == null : this.getInterfaceno().equals(other.getInterfaceno()))
            && (this.getSuccessflag() == null ? other.getSuccessflag() == null : this.getSuccessflag().equals(other.getSuccessflag()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getChannelno() == null) ? 0 : getChannelno().hashCode());
        result = prime * result + ((getInterfaceno() == null) ? 0 : getInterfaceno().hashCode());
        result = prime * result + ((getSuccessflag() == null) ? 0 : getSuccessflag().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
