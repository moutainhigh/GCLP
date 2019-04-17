package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

//
public class Riskinfo implements Serializable {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水号不能超出10位")
	@ApiModelProperty(value = "流水号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=2000,min=0,message="风险建议不能超出2000位")
	@ApiModelProperty(value = "风险建议", example = "", dataType="varchar(2000)", required = true )
    private String riskadvice;

	@Length(max=2000,min=0,message="风险揭示不能超出2000位")
	@ApiModelProperty(value = "风险揭示", example = "", dataType="varchar(2000)", required = true )
    private String riskdiclosure;

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

    public String getRiskadvice() {
        return riskadvice;
    }

    public void setRiskadvice(String riskadvice) {
        this.riskadvice = riskadvice == null ? null : riskadvice.trim();
    }

    public String getRiskdiclosure() {
        return riskdiclosure;
    }

    public void setRiskdiclosure(String riskdiclosure) {
        this.riskdiclosure = riskdiclosure == null ? null : riskdiclosure.trim();
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
        Riskinfo other = (Riskinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getRiskadvice() == null ? other.getRiskadvice() == null : this.getRiskadvice().equals(other.getRiskadvice()))
            && (this.getRiskdiclosure() == null ? other.getRiskdiclosure() == null : this.getRiskdiclosure().equals(other.getRiskdiclosure()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getRiskadvice() == null) ? 0 : getRiskadvice().hashCode());
        result = prime * result + ((getRiskdiclosure() == null) ? 0 : getRiskdiclosure().hashCode());
        return result;
    }
}
