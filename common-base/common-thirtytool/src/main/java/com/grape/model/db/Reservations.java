package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//预约下户信息表
public class Reservations implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@ApiModelProperty(value = "预约时间", example = "", dataType="datetime", required = true )
    private Date reservationtime;

	@Length(max=80,min=0,message="预约客户名称不能超出80位")
	@ApiModelProperty(value = "预约客户名称", example = "", dataType="varchar(80)", required = true )
    private String custname;

	@Length(max=300,min=0,message="预约地点不能超出300位")
	@ApiModelProperty(value = "预约地点", example = "", dataType="varchar(300)", required = true )
    private String reservationplace;

	@Length(max=30,min=0,message="客户联系方式不能超出30位")
	@ApiModelProperty(value = "客户联系方式", example = "", dataType="varchar(30)", required = true )
    private String custcontactway;

	@Length(max=80,min=0,message="平台尽调专员不能超出80位")
	@ApiModelProperty(value = "平台尽调专员", example = "", dataType="varchar(80)", required = true )
    private String dueofplanform;

	@Length(max=80,min=0,message="渠道协助人不能超出80位")
	@ApiModelProperty(value = "渠道协助人", example = "", dataType="varchar(80)", required = true )
    private String chanassistant;

	@Length(max=10,min=0,message="关联流水编号不能超出10位")
	@ApiModelProperty(value = "关联流水编号", example = "", dataType="varchar(10)", required = true )
    private String relationworkid;

	@Length(max=10,min=0,message="最后修改人不能超出10位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(10)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public String getReservationplace() {
        return reservationplace;
    }

    public void setReservationplace(String reservationplace) {
        this.reservationplace = reservationplace == null ? null : reservationplace.trim();
    }

    public String getCustcontactway() {
        return custcontactway;
    }

    public void setCustcontactway(String custcontactway) {
        this.custcontactway = custcontactway == null ? null : custcontactway.trim();
    }

    public String getDueofplanform() {
        return dueofplanform;
    }

    public void setDueofplanform(String dueofplanform) {
        this.dueofplanform = dueofplanform == null ? null : dueofplanform.trim();
    }

    public String getChanassistant() {
        return chanassistant;
    }

    public void setChanassistant(String chanassistant) {
        this.chanassistant = chanassistant == null ? null : chanassistant.trim();
    }

    public String getRelationworkid() {
        return relationworkid;
    }

    public void setRelationworkid(String relationworkid) {
        this.relationworkid = relationworkid == null ? null : relationworkid.trim();
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

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
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
        Reservations other = (Reservations) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReservationtime() == null ? other.getReservationtime() == null : this.getReservationtime().equals(other.getReservationtime()))
            && (this.getCustname() == null ? other.getCustname() == null : this.getCustname().equals(other.getCustname()))
            && (this.getReservationplace() == null ? other.getReservationplace() == null : this.getReservationplace().equals(other.getReservationplace()))
            && (this.getCustcontactway() == null ? other.getCustcontactway() == null : this.getCustcontactway().equals(other.getCustcontactway()))
            && (this.getDueofplanform() == null ? other.getDueofplanform() == null : this.getDueofplanform().equals(other.getDueofplanform()))
            && (this.getChanassistant() == null ? other.getChanassistant() == null : this.getChanassistant().equals(other.getChanassistant()))
            && (this.getRelationworkid() == null ? other.getRelationworkid() == null : this.getRelationworkid().equals(other.getRelationworkid()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReservationtime() == null) ? 0 : getReservationtime().hashCode());
        result = prime * result + ((getCustname() == null) ? 0 : getCustname().hashCode());
        result = prime * result + ((getReservationplace() == null) ? 0 : getReservationplace().hashCode());
        result = prime * result + ((getCustcontactway() == null) ? 0 : getCustcontactway().hashCode());
        result = prime * result + ((getDueofplanform() == null) ? 0 : getDueofplanform().hashCode());
        result = prime * result + ((getChanassistant() == null) ? 0 : getChanassistant().hashCode());
        result = prime * result + ((getRelationworkid() == null) ? 0 : getRelationworkid().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        return result;
    }
}
