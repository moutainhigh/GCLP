package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//短信模板表
public class Msgtemplate implements Serializable {
	@Length(max=6,min=0,message="模板编号不能超出6位")
	@ApiModelProperty(value = "模板编号", example = "", dataType="varchar(6)", required = true )
    private String templateno;

	@Length(max=300,min=0,message="模板内容不能超出300位")
	@ApiModelProperty(value = "模板内容", example = "", dataType="varchar(300)", required = true )
    private String templatecontent;

	@Length(max=80,min=0,message="模板名称不能超出80位")
	@ApiModelProperty(value = "模板名称", example = "", dataType="varchar(80)", required = true )
    private String templatename;

	@Length(max=10,min=0,message="提醒方式不能超出10位")
	@ApiModelProperty(value = "提醒方式", example = "", dataType="varchar(10)", required = true )
    private String noticetype;

	@Length(max=10,min=0,message="模板类型不能超出10位")
	@ApiModelProperty(value = "模板类型", example = "", dataType="varchar(10)", required = true )
    private String templatetype;

	@Length(max=1,min=0,message="是否生效标志不能超出1位")
	@ApiModelProperty(value = "是否生效标志", example = "", dataType="char(1)", required = true )
    private String removeflg;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getTemplateno() {
        return templateno;
    }

    public void setTemplateno(String templateno) {
        this.templateno = templateno == null ? null : templateno.trim();
    }

    public String getTemplatecontent() {
        return templatecontent;
    }

    public void setTemplatecontent(String templatecontent) {
        this.templatecontent = templatecontent == null ? null : templatecontent.trim();
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename == null ? null : templatename.trim();
    }

    public String getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(String noticetype) {
        this.noticetype = noticetype == null ? null : noticetype.trim();
    }

    public String getTemplatetype() {
        return templatetype;
    }

    public void setTemplatetype(String templatetype) {
        this.templatetype = templatetype == null ? null : templatetype.trim();
    }

    public String getRemoveflg() {
        return removeflg;
    }

    public void setRemoveflg(String removeflg) {
        this.removeflg = removeflg == null ? null : removeflg.trim();
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
        Msgtemplate other = (Msgtemplate) that;
        return (this.getTemplateno() == null ? other.getTemplateno() == null : this.getTemplateno().equals(other.getTemplateno()))
            && (this.getTemplatecontent() == null ? other.getTemplatecontent() == null : this.getTemplatecontent().equals(other.getTemplatecontent()))
            && (this.getTemplatename() == null ? other.getTemplatename() == null : this.getTemplatename().equals(other.getTemplatename()))
            && (this.getNoticetype() == null ? other.getNoticetype() == null : this.getNoticetype().equals(other.getNoticetype()))
            && (this.getTemplatetype() == null ? other.getTemplatetype() == null : this.getTemplatetype().equals(other.getTemplatetype()))
            && (this.getRemoveflg() == null ? other.getRemoveflg() == null : this.getRemoveflg().equals(other.getRemoveflg()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTemplateno() == null) ? 0 : getTemplateno().hashCode());
        result = prime * result + ((getTemplatecontent() == null) ? 0 : getTemplatecontent().hashCode());
        result = prime * result + ((getTemplatename() == null) ? 0 : getTemplatename().hashCode());
        result = prime * result + ((getNoticetype() == null) ? 0 : getNoticetype().hashCode());
        result = prime * result + ((getTemplatetype() == null) ? 0 : getTemplatetype().hashCode());
        result = prime * result + ((getRemoveflg() == null) ? 0 : getRemoveflg().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
