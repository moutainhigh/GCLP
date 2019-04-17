package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//公告信息表
public class Noticeinfo implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=40,min=0,message="公告标题不能超出40位")
	@ApiModelProperty(value = "公告标题", example = "", dataType="varchar(40)", required = true )
    private String noticetitle;

	@Length(max=80,min=0,message="发布人不能超出80位")
	@ApiModelProperty(value = "发布人", example = "", dataType="varchar(80)", required = true )
    private String issuer;

	@ApiModelProperty(value = "发布时间", example = "", dataType="datetime", required = true )
    private Date newstime;

	@Length(max=80,min=0,message="最后修改人不能超出80位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(80)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@ApiModelProperty(value = "公告内容", example = "", dataType="longtext", required = true )
    private String noticecontent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle == null ? null : noticetitle.trim();
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }

    public Date getNewstime() {
        return newstime;
    }

    public void setNewstime(Date newstime) {
        this.newstime = newstime;
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

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent == null ? null : noticecontent.trim();
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
        Noticeinfo other = (Noticeinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNoticetitle() == null ? other.getNoticetitle() == null : this.getNoticetitle().equals(other.getNoticetitle()))
            && (this.getIssuer() == null ? other.getIssuer() == null : this.getIssuer().equals(other.getIssuer()))
            && (this.getNewstime() == null ? other.getNewstime() == null : this.getNewstime().equals(other.getNewstime()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getNoticecontent() == null ? other.getNoticecontent() == null : this.getNoticecontent().equals(other.getNoticecontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNoticetitle() == null) ? 0 : getNoticetitle().hashCode());
        result = prime * result + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        result = prime * result + ((getNewstime() == null) ? 0 : getNewstime().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getNoticecontent() == null) ? 0 : getNoticecontent().hashCode());
        return result;
    }
}
