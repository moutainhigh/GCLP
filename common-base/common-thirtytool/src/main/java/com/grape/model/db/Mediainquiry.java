package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//中介询价表
public class Mediainquiry implements Serializable {
	@Length(max=19,min=0,message="询价编号不能超出19位")
	@ApiModelProperty(value = "询价编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="贷款流水号不能超出10位")
	@ApiModelProperty(value = "贷款流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="中介名称不能超出80位")
	@ApiModelProperty(value = "中介名称", example = "", dataType="varchar(80)", required = true )
    private String agency;

	@Length(max=17,min=0,message="评估金额不能超出17位")
	@ApiModelProperty(value = "评估金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal evalamt;

	@ApiModelProperty(value = "询价时间", example = "", dataType="datetime", required = true )
    private Date evaltime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public BigDecimal getEvalamt() {
        return evalamt;
    }

    public void setEvalamt(BigDecimal evalamt) {
        this.evalamt = evalamt;
    }

    public Date getEvaltime() {
        return evaltime;
    }

    public void setEvaltime(Date evaltime) {
        this.evaltime = evaltime;
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
        Mediainquiry other = (Mediainquiry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getAgency() == null ? other.getAgency() == null : this.getAgency().equals(other.getAgency()))
            && (this.getEvalamt() == null ? other.getEvalamt() == null : this.getEvalamt().equals(other.getEvalamt()))
            && (this.getEvaltime() == null ? other.getEvaltime() == null : this.getEvaltime().equals(other.getEvaltime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getAgency() == null) ? 0 : getAgency().hashCode());
        result = prime * result + ((getEvalamt() == null) ? 0 : getEvalamt().hashCode());
        result = prime * result + ((getEvaltime() == null) ? 0 : getEvaltime().hashCode());
        return result;
    }
}
