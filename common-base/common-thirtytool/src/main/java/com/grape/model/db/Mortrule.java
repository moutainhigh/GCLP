package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//
public class Mortrule implements Serializable {
	@Length(max=19,min=0,message="编号不能超出19位")
	@ApiModelProperty(value = "编号", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=1000,min=0,message="抵押物评分规则表达式不能超出1000位")
	@ApiModelProperty(value = "抵押物评分规则表达式", example = "", dataType="varchar(1000)", required = true )
    private String expression;

	@Length(max=7,min=0,message="命中时分数不能超出7位")
	@ApiModelProperty(value = "命中时分数", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal score1;

	@Length(max=7,min=0,message="不命中时分数不能超出7位")
	@ApiModelProperty(value = "不命中时分数", example = "", dataType="decimal(7,2)", required = true )
    private BigDecimal score2;

	@Length(max=120,min=0,message="描述不能超出120位")
	@ApiModelProperty(value = "描述", example = "", dataType="varchar(120)", required = true )
    private String description;

	@Length(max=8,min=0,message="修改人不能超出8位")
	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgtm;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public BigDecimal getScore1() {
        return score1;
    }

    public void setScore1(BigDecimal score1) {
        this.score1 = score1;
    }

    public BigDecimal getScore2() {
        return score2;
    }

    public void setScore2(BigDecimal score2) {
        this.score2 = score2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getChgtl() {
        return chgtl;
    }

    public void setChgtl(String chgtl) {
        this.chgtl = chgtl == null ? null : chgtl.trim();
    }

    public Date getChgtm() {
        return chgtm;
    }

    public void setChgtm(Date chgtm) {
        this.chgtm = chgtm;
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
        Mortrule other = (Mortrule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getExpression() == null ? other.getExpression() == null : this.getExpression().equals(other.getExpression()))
            && (this.getScore1() == null ? other.getScore1() == null : this.getScore1().equals(other.getScore1()))
            && (this.getScore2() == null ? other.getScore2() == null : this.getScore2().equals(other.getScore2()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()))
            && (this.getChgtm() == null ? other.getChgtm() == null : this.getChgtm().equals(other.getChgtm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getExpression() == null) ? 0 : getExpression().hashCode());
        result = prime * result + ((getScore1() == null) ? 0 : getScore1().hashCode());
        result = prime * result + ((getScore2() == null) ? 0 : getScore2().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        result = prime * result + ((getChgtm() == null) ? 0 : getChgtm().hashCode());
        return result;
    }
}
