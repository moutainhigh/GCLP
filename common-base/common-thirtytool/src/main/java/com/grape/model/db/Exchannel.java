package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//
public class Exchannel implements Serializable {
	@Length(max=20,min=0,message="公司编号不能超出20位")
	@ApiModelProperty(value = "公司编号", example = "", dataType="varchar(20)", required = true )
    private String channelno;

	@Length(max=40,min=0,message="公司名称不能超出40位")
	@ApiModelProperty(value = "公司名称", example = "", dataType="varchar(40)", required = true )
    private String channelname;

	@Length(max=80,min=0,message="用户名不能超出80位")
	@ApiModelProperty(value = "用户名", example = "", dataType="varchar(80)", required = true )
    private String username;

	@Length(max=80,min=0,message="密码不能超出80位")
	@ApiModelProperty(value = "密码", example = "", dataType="varchar(80)", required = true )
    private String password;

	@Length(max=80,min=0,message="数字签名id不能超出80位")
	@ApiModelProperty(value = "数字签名id", example = "", dataType="varchar(80)", required = true )
    private String accesskeyid;

	@Length(max=80,min=0,message="数字签名秘钥不能超出80位")
	@ApiModelProperty(value = "数字签名秘钥", example = "", dataType="varchar(80)", required = true )
    private String accesskeysecret;

	@Length(max=255,min=0,message="外呼系统秘钥不能超出255位")
	@ApiModelProperty(value = "外呼系统秘钥", example = "", dataType="varchar(255)", required = true )
    private String secret;

	@Length(max=10,min=0,message="汇法网配置编号不能超出10位")
	@ApiModelProperty(value = "汇法网配置编号", example = "", dataType="varchar(10)", required = true )
    private String conid;

	@Length(max=9,min=0,message="查询每条信息的价格不能超出9位")
	@ApiModelProperty(value = "查询每条信息的价格", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal price;

	@Length(max=255,min=0,message="阿里云推流域名不能超出255位")
	@ApiModelProperty(value = "阿里云推流域名", example = "", dataType="varchar(255)", required = true )
    private String pushdomain;

	@Length(max=255,min=0,message="阿里云流域名不能超出255位")
	@ApiModelProperty(value = "阿里云流域名", example = "", dataType="varchar(255)", required = true )
    private String livedomain;

	@Length(max=255,min=0,message="阿里云直播应用名不能超出255位")
	@ApiModelProperty(value = "阿里云直播应用名", example = "", dataType="varchar(255)", required = true )
    private String appname;

	@Length(max=255,min=0,message="播放key不能超出255位")
	@ApiModelProperty(value = "播放key", example = "", dataType="varchar(255)", required = true )
    private String livekey;

	@Length(max=255,min=0,message="推流key不能超出255位")
	@ApiModelProperty(value = "推流key", example = "", dataType="varchar(255)", required = true )
    private String pushkey;

	@Length(max=255,min=0,message="阿里云直播中心不能超出255位")
	@ApiModelProperty(value = "阿里云直播中心", example = "", dataType="varchar(255)", required = true )
    private String videocenter;

	@Length(max=1,min=0,message="开启标志不能超出1位")
	@ApiModelProperty(value = "开启标志", example = "", dataType="varchar(1)", required = true )
    private String openflg;

    private static final long serialVersionUID = 1L;

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno == null ? null : channelno.trim();
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname == null ? null : channelname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccesskeyid() {
        return accesskeyid;
    }

    public void setAccesskeyid(String accesskeyid) {
        this.accesskeyid = accesskeyid == null ? null : accesskeyid.trim();
    }

    public String getAccesskeysecret() {
        return accesskeysecret;
    }

    public void setAccesskeysecret(String accesskeysecret) {
        this.accesskeysecret = accesskeysecret == null ? null : accesskeysecret.trim();
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    public String getConid() {
        return conid;
    }

    public void setConid(String conid) {
        this.conid = conid == null ? null : conid.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPushdomain() {
        return pushdomain;
    }

    public void setPushdomain(String pushdomain) {
        this.pushdomain = pushdomain == null ? null : pushdomain.trim();
    }

    public String getLivedomain() {
        return livedomain;
    }

    public void setLivedomain(String livedomain) {
        this.livedomain = livedomain == null ? null : livedomain.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getLivekey() {
        return livekey;
    }

    public void setLivekey(String livekey) {
        this.livekey = livekey == null ? null : livekey.trim();
    }

    public String getPushkey() {
        return pushkey;
    }

    public void setPushkey(String pushkey) {
        this.pushkey = pushkey == null ? null : pushkey.trim();
    }

    public String getVideocenter() {
        return videocenter;
    }

    public void setVideocenter(String videocenter) {
        this.videocenter = videocenter == null ? null : videocenter.trim();
    }

    public String getOpenflg() {
        return openflg;
    }

    public void setOpenflg(String openflg) {
        this.openflg = openflg == null ? null : openflg.trim();
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
        Exchannel other = (Exchannel) that;
        return (this.getChannelno() == null ? other.getChannelno() == null : this.getChannelno().equals(other.getChannelno()))
            && (this.getChannelname() == null ? other.getChannelname() == null : this.getChannelname().equals(other.getChannelname()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAccesskeyid() == null ? other.getAccesskeyid() == null : this.getAccesskeyid().equals(other.getAccesskeyid()))
            && (this.getAccesskeysecret() == null ? other.getAccesskeysecret() == null : this.getAccesskeysecret().equals(other.getAccesskeysecret()))
            && (this.getSecret() == null ? other.getSecret() == null : this.getSecret().equals(other.getSecret()))
            && (this.getConid() == null ? other.getConid() == null : this.getConid().equals(other.getConid()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPushdomain() == null ? other.getPushdomain() == null : this.getPushdomain().equals(other.getPushdomain()))
            && (this.getLivedomain() == null ? other.getLivedomain() == null : this.getLivedomain().equals(other.getLivedomain()))
            && (this.getAppname() == null ? other.getAppname() == null : this.getAppname().equals(other.getAppname()))
            && (this.getLivekey() == null ? other.getLivekey() == null : this.getLivekey().equals(other.getLivekey()))
            && (this.getPushkey() == null ? other.getPushkey() == null : this.getPushkey().equals(other.getPushkey()))
            && (this.getVideocenter() == null ? other.getVideocenter() == null : this.getVideocenter().equals(other.getVideocenter()))
            && (this.getOpenflg() == null ? other.getOpenflg() == null : this.getOpenflg().equals(other.getOpenflg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelno() == null) ? 0 : getChannelno().hashCode());
        result = prime * result + ((getChannelname() == null) ? 0 : getChannelname().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAccesskeyid() == null) ? 0 : getAccesskeyid().hashCode());
        result = prime * result + ((getAccesskeysecret() == null) ? 0 : getAccesskeysecret().hashCode());
        result = prime * result + ((getSecret() == null) ? 0 : getSecret().hashCode());
        result = prime * result + ((getConid() == null) ? 0 : getConid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPushdomain() == null) ? 0 : getPushdomain().hashCode());
        result = prime * result + ((getLivedomain() == null) ? 0 : getLivedomain().hashCode());
        result = prime * result + ((getAppname() == null) ? 0 : getAppname().hashCode());
        result = prime * result + ((getLivekey() == null) ? 0 : getLivekey().hashCode());
        result = prime * result + ((getPushkey() == null) ? 0 : getPushkey().hashCode());
        result = prime * result + ((getVideocenter() == null) ? 0 : getVideocenter().hashCode());
        result = prime * result + ((getOpenflg() == null) ? 0 : getOpenflg().hashCode());
        return result;
    }
}
