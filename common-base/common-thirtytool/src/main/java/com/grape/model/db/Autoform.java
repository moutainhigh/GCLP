package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Autoform implements Serializable {
	@Length(max=18,min=0,message="主键ID不能超出18位")
	@ApiModelProperty(value = "主键ID", example = "", dataType="int(18)", required = true )
    private Integer id;

	@Length(max=19,min=0,message="表单编号不能超出19位")
	@ApiModelProperty(value = "表单编号", example = "", dataType="varchar(19)", required = true )
    private String formid;

	@Length(max=2,min=0,message="出处标识不能超出2位")
	@ApiModelProperty(value = "出处标识", example = "", dataType="varchar(2)", required = true )
    private String formflg;

	@Length(max=255,min=0,message="表单描述不能超出255位")
	@ApiModelProperty(value = "表单描述", example = "", dataType="varchar(255)", required = true )
    private String description;

	@Length(max=80,min=0,message="表单名称不能超出80位")
	@ApiModelProperty(value = "表单名称", example = "", dataType="varchar(80)", required = true )
    private String formname;

	@Length(max=2,min=0,message="表单状态不能超出2位")
	@ApiModelProperty(value = "表单状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@ApiModelProperty(value = "最后操作时间", example = "", dataType="date", required = true )
    private Date chgdt;

	@Length(max=30,min=0,message="最后操作人不能超出30位")
	@ApiModelProperty(value = "最后操作人", example = "", dataType="varchar(30)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "字段json串", example = "", dataType="text", required = true )
    private String jsoncolumn;

	@ApiModelProperty(value = "表单配置", example = "", dataType="text", required = true )
    private String config;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid == null ? null : formid.trim();
    }

    public String getFormflg() {
        return formflg;
    }

    public void setFormflg(String formflg) {
        this.formflg = formflg == null ? null : formflg.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname == null ? null : formname.trim();
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

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public String getJsoncolumn() {
        return jsoncolumn;
    }

    public void setJsoncolumn(String jsoncolumn) {
        this.jsoncolumn = jsoncolumn == null ? null : jsoncolumn.trim();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
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
        Autoform other = (Autoform) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFormid() == null ? other.getFormid() == null : this.getFormid().equals(other.getFormid()))
            && (this.getFormflg() == null ? other.getFormflg() == null : this.getFormflg().equals(other.getFormflg()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getFormname() == null ? other.getFormname() == null : this.getFormname().equals(other.getFormname()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getJsoncolumn() == null ? other.getJsoncolumn() == null : this.getJsoncolumn().equals(other.getJsoncolumn()))
            && (this.getConfig() == null ? other.getConfig() == null : this.getConfig().equals(other.getConfig()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFormid() == null) ? 0 : getFormid().hashCode());
        result = prime * result + ((getFormflg() == null) ? 0 : getFormflg().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getFormname() == null) ? 0 : getFormname().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getJsoncolumn() == null) ? 0 : getJsoncolumn().hashCode());
        result = prime * result + ((getConfig() == null) ? 0 : getConfig().hashCode());
        return result;
    }
}
