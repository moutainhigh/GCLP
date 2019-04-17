package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//收入情况表（公司）
public class Incomeofcom implements Serializable {
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=20,min=0,message="企业统一信用编号不能超出20位")
	@ApiModelProperty(value = "企业统一信用编号", example = "", dataType="varchar(20)", required = true )
    private String comno;

	@Length(max=200,min=0,message="其他收入证明不能超出200位")
	@ApiModelProperty(value = "其他收入证明", example = "", dataType="varchar(200)", required = true )
    private String otherincome;

	@Length(max=200,min=0,message="收入情况说明不能超出200位")
	@ApiModelProperty(value = "收入情况说明", example = "", dataType="varchar(200)", required = true )
    private String incomeexplain;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getComno() {
        return comno;
    }

    public void setComno(String comno) {
        this.comno = comno == null ? null : comno.trim();
    }

    public String getOtherincome() {
        return otherincome;
    }

    public void setOtherincome(String otherincome) {
        this.otherincome = otherincome == null ? null : otherincome.trim();
    }

    public String getIncomeexplain() {
        return incomeexplain;
    }

    public void setIncomeexplain(String incomeexplain) {
        this.incomeexplain = incomeexplain == null ? null : incomeexplain.trim();
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
        Incomeofcom other = (Incomeofcom) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getComno() == null ? other.getComno() == null : this.getComno().equals(other.getComno()))
            && (this.getOtherincome() == null ? other.getOtherincome() == null : this.getOtherincome().equals(other.getOtherincome()))
            && (this.getIncomeexplain() == null ? other.getIncomeexplain() == null : this.getIncomeexplain().equals(other.getIncomeexplain()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getComno() == null) ? 0 : getComno().hashCode());
        result = prime * result + ((getOtherincome() == null) ? 0 : getOtherincome().hashCode());
        result = prime * result + ((getIncomeexplain() == null) ? 0 : getIncomeexplain().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
