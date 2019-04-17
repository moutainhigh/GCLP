package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//其他申请信息
public class Otherapplyinfo implements Serializable {
	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=4,min=0,message="借款用途说明不能超出4位")
	@ApiModelProperty(value = "借款用途说明", example = "", dataType="varchar(4)", required = true )
    private String usageofloan;

	@Length(max=200,min=0,message="用款计划说明不能超出200位")
	@ApiModelProperty(value = "用款计划说明", example = "", dataType="varchar(200)", required = true )
    private String usageloanplan;

	@Length(max=4,min=0,message="还款来源说明不能超出4位")
	@ApiModelProperty(value = "还款来源说明", example = "", dataType="varchar(4)", required = true )
    private String repaysource;

	@Length(max=200,min=0,message="还款计划说明不能超出200位")
	@ApiModelProperty(value = "还款计划说明", example = "", dataType="varchar(200)", required = true )
    private String repayplan;

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

    public String getUsageofloan() {
        return usageofloan;
    }

    public void setUsageofloan(String usageofloan) {
        this.usageofloan = usageofloan == null ? null : usageofloan.trim();
    }

    public String getUsageloanplan() {
        return usageloanplan;
    }

    public void setUsageloanplan(String usageloanplan) {
        this.usageloanplan = usageloanplan == null ? null : usageloanplan.trim();
    }

    public String getRepaysource() {
        return repaysource;
    }

    public void setRepaysource(String repaysource) {
        this.repaysource = repaysource == null ? null : repaysource.trim();
    }

    public String getRepayplan() {
        return repayplan;
    }

    public void setRepayplan(String repayplan) {
        this.repayplan = repayplan == null ? null : repayplan.trim();
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
        Otherapplyinfo other = (Otherapplyinfo) that;
        return (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getUsageofloan() == null ? other.getUsageofloan() == null : this.getUsageofloan().equals(other.getUsageofloan()))
            && (this.getUsageloanplan() == null ? other.getUsageloanplan() == null : this.getUsageloanplan().equals(other.getUsageloanplan()))
            && (this.getRepaysource() == null ? other.getRepaysource() == null : this.getRepaysource().equals(other.getRepaysource()))
            && (this.getRepayplan() == null ? other.getRepayplan() == null : this.getRepayplan().equals(other.getRepayplan()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getUsageofloan() == null) ? 0 : getUsageofloan().hashCode());
        result = prime * result + ((getUsageloanplan() == null) ? 0 : getUsageloanplan().hashCode());
        result = prime * result + ((getRepaysource() == null) ? 0 : getRepaysource().hashCode());
        result = prime * result + ((getRepayplan() == null) ? 0 : getRepayplan().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
