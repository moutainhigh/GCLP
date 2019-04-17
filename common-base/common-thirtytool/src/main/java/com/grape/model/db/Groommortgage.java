package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Groommortgage implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批信息关联编号不能超出19位")
	@ApiModelProperty(value = "审批信息关联编号", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=19,min=0,message="抵押物编号不能超出19位")
	@ApiModelProperty(value = "抵押物编号", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="当地《不动产权证登记受理凭证》是否收取不能超出1位")
	@ApiModelProperty(value = "当地《不动产权证登记受理凭证》是否收取", example = "", dataType="char(1)", required = true )
    private String housediplomabackflg;

	@Length(max=300,min=0,message="当地《不动产权证登记受理凭证》是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "当地《不动产权证登记受理凭证》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String housediplomabacknote;

	@Length(max=1,min=0,message="当地不动产登记信息查询结果是否收取不能超出1位")
	@ApiModelProperty(value = "当地不动产登记信息查询结果是否收取", example = "", dataType="char(1)", required = true )
    private String housediplomaresultflg;

	@Length(max=300,min=0,message="当地不动产登记信息查询结果是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "当地不动产登记信息查询结果是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String housediplomaresultnote;

	@Length(max=1,min=0,message="其三证三章或股权质押是否收取不能超出1位")
	@ApiModelProperty(value = "其三证三章或股权质押是否收取", example = "", dataType="char(1)", required = true )
    private String diplomabackflg;

	@Length(max=300,min=0,message="其三证三章或股权质押是否收取情况说明不能超出300位")
	@ApiModelProperty(value = "其三证三章或股权质押是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String diplomabacknote;

	@Length(max=8,min=0,message="审批人不能超出8位")
	@ApiModelProperty(value = "审批人", example = "", dataType="varchar(8)", required = true )
    private String userid;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getMortgageid() {
        return mortgageid;
    }

    public void setMortgageid(String mortgageid) {
        this.mortgageid = mortgageid == null ? null : mortgageid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getHousediplomabackflg() {
        return housediplomabackflg;
    }

    public void setHousediplomabackflg(String housediplomabackflg) {
        this.housediplomabackflg = housediplomabackflg == null ? null : housediplomabackflg.trim();
    }

    public String getHousediplomabacknote() {
        return housediplomabacknote;
    }

    public void setHousediplomabacknote(String housediplomabacknote) {
        this.housediplomabacknote = housediplomabacknote == null ? null : housediplomabacknote.trim();
    }

    public String getHousediplomaresultflg() {
        return housediplomaresultflg;
    }

    public void setHousediplomaresultflg(String housediplomaresultflg) {
        this.housediplomaresultflg = housediplomaresultflg == null ? null : housediplomaresultflg.trim();
    }

    public String getHousediplomaresultnote() {
        return housediplomaresultnote;
    }

    public void setHousediplomaresultnote(String housediplomaresultnote) {
        this.housediplomaresultnote = housediplomaresultnote == null ? null : housediplomaresultnote.trim();
    }

    public String getDiplomabackflg() {
        return diplomabackflg;
    }

    public void setDiplomabackflg(String diplomabackflg) {
        this.diplomabackflg = diplomabackflg == null ? null : diplomabackflg.trim();
    }

    public String getDiplomabacknote() {
        return diplomabacknote;
    }

    public void setDiplomabacknote(String diplomabacknote) {
        this.diplomabacknote = diplomabacknote == null ? null : diplomabacknote.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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
        Groommortgage other = (Groommortgage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getMortgageid() == null ? other.getMortgageid() == null : this.getMortgageid().equals(other.getMortgageid()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getHousediplomabackflg() == null ? other.getHousediplomabackflg() == null : this.getHousediplomabackflg().equals(other.getHousediplomabackflg()))
            && (this.getHousediplomabacknote() == null ? other.getHousediplomabacknote() == null : this.getHousediplomabacknote().equals(other.getHousediplomabacknote()))
            && (this.getHousediplomaresultflg() == null ? other.getHousediplomaresultflg() == null : this.getHousediplomaresultflg().equals(other.getHousediplomaresultflg()))
            && (this.getHousediplomaresultnote() == null ? other.getHousediplomaresultnote() == null : this.getHousediplomaresultnote().equals(other.getHousediplomaresultnote()))
            && (this.getDiplomabackflg() == null ? other.getDiplomabackflg() == null : this.getDiplomabackflg().equals(other.getDiplomabackflg()))
            && (this.getDiplomabacknote() == null ? other.getDiplomabacknote() == null : this.getDiplomabacknote().equals(other.getDiplomabacknote()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogid() == null) ? 0 : getLogid().hashCode());
        result = prime * result + ((getMortgageid() == null) ? 0 : getMortgageid().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getHousediplomabackflg() == null) ? 0 : getHousediplomabackflg().hashCode());
        result = prime * result + ((getHousediplomabacknote() == null) ? 0 : getHousediplomabacknote().hashCode());
        result = prime * result + ((getHousediplomaresultflg() == null) ? 0 : getHousediplomaresultflg().hashCode());
        result = prime * result + ((getHousediplomaresultnote() == null) ? 0 : getHousediplomaresultnote().hashCode());
        result = prime * result + ((getDiplomabackflg() == null) ? 0 : getDiplomabackflg().hashCode());
        result = prime * result + ((getDiplomabacknote() == null) ? 0 : getDiplomabacknote().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
