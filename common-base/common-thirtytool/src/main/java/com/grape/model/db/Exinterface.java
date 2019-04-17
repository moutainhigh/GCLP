package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Exinterface implements Serializable {
	@Length(max=20,min=0,message="外联渠道编号不能超出20位")
	@ApiModelProperty(value = "外联渠道编号", example = "", dataType="varchar(20)", required = true )
    private String channelno;

	@Length(max=1,min=0,message="接口编号不能超出1位")
	@ApiModelProperty(value = "接口编号", example = "", dataType="varchar(1)", required = true )
    private String interfaceno;

	@Length(max=255,min=0,message="接口描述不能超出255位")
	@ApiModelProperty(value = "接口描述", example = "", dataType="varchar(255)", required = true )
    private String interfacedes;

	@Length(max=255,min=0,message="接口请求URL不能超出255位")
	@ApiModelProperty(value = "接口请求URL", example = "", dataType="varchar(255)", required = true )
    private String url;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

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

    public String getInterfacedes() {
        return interfacedes;
    }

    public void setInterfacedes(String interfacedes) {
        this.interfacedes = interfacedes == null ? null : interfacedes.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        Exinterface other = (Exinterface) that;
        return (this.getChannelno() == null ? other.getChannelno() == null : this.getChannelno().equals(other.getChannelno()))
            && (this.getInterfaceno() == null ? other.getInterfaceno() == null : this.getInterfaceno().equals(other.getInterfaceno()))
            && (this.getInterfacedes() == null ? other.getInterfacedes() == null : this.getInterfacedes().equals(other.getInterfacedes()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelno() == null) ? 0 : getChannelno().hashCode());
        result = prime * result + ((getInterfaceno() == null) ? 0 : getInterfaceno().hashCode());
        result = prime * result + ((getInterfacedes() == null) ? 0 : getInterfacedes().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
