package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//null
public class Smsparam implements Serializable {
	@Length(max=19,min=0,message="短信编号���ܳ���19λ")
	@ApiModelProperty(value = "短信编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=40,min=0,message="accessKeyId���ܳ���40λ")
	@ApiModelProperty(value = "accessKeyId", example = "", dataType="varchar(40)", required = true )
    private String accesskeyid;

	@Length(max=80,min=0,message="accessKeySecret���ܳ���80λ")
	@ApiModelProperty(value = "accessKeySecret", example = "", dataType="varchar(80)", required = true )
    private String accesskeysecret;

	@Length(max=40,min=0,message="短信签名���ܳ���40λ")
	@ApiModelProperty(value = "短信签名", example = "", dataType="varchar(40)", required = true )
    private String msgsign;

	@Length(max=40,min=0,message="短信模板���ܳ���40λ")
	@ApiModelProperty(value = "短信模板", example = "", dataType="varchar(40)", required = true )
    private String templatecode;

	@Length(max=19,min=0,message="产品编号���ܳ���19λ")
	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(19)", required = true )
    private String productno;

	@Length(max=30,min=0,message="发送频率（以逗号隔开）���ܳ���30λ")
	@ApiModelProperty(value = "发送频率（以逗号隔开）", example = "", dataType="varchar(30)", required = true )
    private String sendfreq;

	@Length(max=1,min=0,message="发送类型（1为验证码2为还款3为逾期）���ܳ���1λ")
	@ApiModelProperty(value = "发送类型（1为验证码2为还款3为逾期）", example = "", dataType="varchar(1)", required = true )
    private String sendtype;

	@Length(max=2,min=0,message="尝试发送次数���ܳ���2λ")
	@ApiModelProperty(value = "尝试发送次数", example = "", dataType="varchar(2)", required = true )
    private String sendchance;

	@Length(max=1,min=0,message="发送标志���ܳ���1λ")
	@ApiModelProperty(value = "发送标志", example = "", dataType="varchar(1)", required = true )
    private String sendflg;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="修改人���ܳ���8λ")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@Length(max=255,min=0,message="描述信息���ܳ���255λ")
	@ApiModelProperty(value = "描述信息", example = "", dataType="varchar(255)", required = true )
    private String description;

	@Length(max=2,min=0,message="是否启用���ܳ���2λ")
	@ApiModelProperty(value = "是否启用", example = "", dataType="varchar(2)", required = true )
    private String useflg;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getMsgsign() {
        return msgsign;
    }

    public void setMsgsign(String msgsign) {
        this.msgsign = msgsign == null ? null : msgsign.trim();
    }

    public String getTemplatecode() {
        return templatecode;
    }

    public void setTemplatecode(String templatecode) {
        this.templatecode = templatecode == null ? null : templatecode.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getSendfreq() {
        return sendfreq;
    }

    public void setSendfreq(String sendfreq) {
        this.sendfreq = sendfreq == null ? null : sendfreq.trim();
    }

    public String getSendtype() {
        return sendtype;
    }

    public void setSendtype(String sendtype) {
        this.sendtype = sendtype == null ? null : sendtype.trim();
    }

    public String getSendchance() {
        return sendchance;
    }

    public void setSendchance(String sendchance) {
        this.sendchance = sendchance == null ? null : sendchance.trim();
    }

    public String getSendflg() {
        return sendflg;
    }

    public void setSendflg(String sendflg) {
        this.sendflg = sendflg == null ? null : sendflg.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUseflg() {
        return useflg;
    }

    public void setUseflg(String useflg) {
        this.useflg = useflg == null ? null : useflg.trim();
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
        Smsparam other = (Smsparam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccesskeyid() == null ? other.getAccesskeyid() == null : this.getAccesskeyid().equals(other.getAccesskeyid()))
            && (this.getAccesskeysecret() == null ? other.getAccesskeysecret() == null : this.getAccesskeysecret().equals(other.getAccesskeysecret()))
            && (this.getMsgsign() == null ? other.getMsgsign() == null : this.getMsgsign().equals(other.getMsgsign()))
            && (this.getTemplatecode() == null ? other.getTemplatecode() == null : this.getTemplatecode().equals(other.getTemplatecode()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getSendfreq() == null ? other.getSendfreq() == null : this.getSendfreq().equals(other.getSendfreq()))
            && (this.getSendtype() == null ? other.getSendtype() == null : this.getSendtype().equals(other.getSendtype()))
            && (this.getSendchance() == null ? other.getSendchance() == null : this.getSendchance().equals(other.getSendchance()))
            && (this.getSendflg() == null ? other.getSendflg() == null : this.getSendflg().equals(other.getSendflg()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getUseflg() == null ? other.getUseflg() == null : this.getUseflg().equals(other.getUseflg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccesskeyid() == null) ? 0 : getAccesskeyid().hashCode());
        result = prime * result + ((getAccesskeysecret() == null) ? 0 : getAccesskeysecret().hashCode());
        result = prime * result + ((getMsgsign() == null) ? 0 : getMsgsign().hashCode());
        result = prime * result + ((getTemplatecode() == null) ? 0 : getTemplatecode().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getSendfreq() == null) ? 0 : getSendfreq().hashCode());
        result = prime * result + ((getSendtype() == null) ? 0 : getSendtype().hashCode());
        result = prime * result + ((getSendchance() == null) ? 0 : getSendchance().hashCode());
        result = prime * result + ((getSendflg() == null) ? 0 : getSendflg().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getUseflg() == null) ? 0 : getUseflg().hashCode());
        return result;
    }
}
