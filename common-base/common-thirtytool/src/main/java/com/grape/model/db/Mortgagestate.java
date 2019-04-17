package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//
public class Mortgagestate implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=19,min=0,message="审批信息关联id不能超出19位")
	@ApiModelProperty(value = "审批信息关联id", example = "", dataType="varchar(19)", required = true )
    private String logid;

	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=300,min=0,message="情况说明不能超出300位")
	@ApiModelProperty(value = "情况说明", example = "", dataType="varchar(300)", required = true )
    private String mortgagenote;

	@Length(max=4,min=0,message="查档状态不能超出4位")
	@ApiModelProperty(value = "查档状态", example = "", dataType="varchar(4)", required = true )
    private String mortgagestate;

	@Length(max=120,min=0,message="查档资料不能超出120位")
	@ApiModelProperty(value = "查档资料", example = "", dataType="varchar(120)", required = true )
    private String checkstateimage;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

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

    public String getMortgagenote() {
        return mortgagenote;
    }

    public void setMortgagenote(String mortgagenote) {
        this.mortgagenote = mortgagenote == null ? null : mortgagenote.trim();
    }

    public String getMortgagestate() {
        return mortgagestate;
    }

    public void setMortgagestate(String mortgagestate) {
        this.mortgagestate = mortgagestate == null ? null : mortgagestate.trim();
    }

    public String getCheckstateimage() {
        return checkstateimage;
    }

    public void setCheckstateimage(String checkstateimage) {
        this.checkstateimage = checkstateimage == null ? null : checkstateimage.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
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
        Mortgagestate other = (Mortgagestate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogid() == null ? other.getLogid() == null : this.getLogid().equals(other.getLogid()))
            && (this.getMortgageid() == null ? other.getMortgageid() == null : this.getMortgageid().equals(other.getMortgageid()))
            && (this.getMortgagenote() == null ? other.getMortgagenote() == null : this.getMortgagenote().equals(other.getMortgagenote()))
            && (this.getMortgagestate() == null ? other.getMortgagestate() == null : this.getMortgagestate().equals(other.getMortgagestate()))
            && (this.getCheckstateimage() == null ? other.getCheckstateimage() == null : this.getCheckstateimage().equals(other.getCheckstateimage()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
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
        result = prime * result + ((getMortgagenote() == null) ? 0 : getMortgagenote().hashCode());
        result = prime * result + ((getMortgagestate() == null) ? 0 : getMortgagestate().hashCode());
        result = prime * result + ((getCheckstateimage() == null) ? 0 : getCheckstateimage().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
