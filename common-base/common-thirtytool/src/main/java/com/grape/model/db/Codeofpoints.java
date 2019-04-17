package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//评分规则表
public class Codeofpoints implements Serializable {
	@Length(max=11,min=0,message="不能超出11位")
	@ApiModelProperty(value = "", example = "", dataType="int(11)", required = true )
    private Integer id;

	@Length(max=20,min=0,message="字段名称不能超出20位")
	@ApiModelProperty(value = "字段名称", example = "", dataType="varchar(20)", required = true )
    private String columnname;

	@Length(max=40,min=0,message="评分标准不能超出40位")
	@ApiModelProperty(value = "评分标准", example = "", dataType="varchar(40)", required = true )
    private String scoringrubrics;

	@Length(max=5,min=0,message="分数不能超出5位")
	@ApiModelProperty(value = "分数", example = "", dataType="decimal(5,2)", required = true )
    private BigDecimal grade;

	@Length(max=8,min=0,message="最后修改人不能超出8位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getScoringrubrics() {
        return scoringrubrics;
    }

    public void setScoringrubrics(String scoringrubrics) {
        this.scoringrubrics = scoringrubrics == null ? null : scoringrubrics.trim();
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
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
        Codeofpoints other = (Codeofpoints) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColumnname() == null ? other.getColumnname() == null : this.getColumnname().equals(other.getColumnname()))
            && (this.getScoringrubrics() == null ? other.getScoringrubrics() == null : this.getScoringrubrics().equals(other.getScoringrubrics()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColumnname() == null) ? 0 : getColumnname().hashCode());
        result = prime * result + ((getScoringrubrics() == null) ? 0 : getScoringrubrics().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        return result;
    }
}
