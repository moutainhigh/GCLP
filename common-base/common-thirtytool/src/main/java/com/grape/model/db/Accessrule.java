package com.grape.model.db;
import org.hibernate.validator.constraints.Length;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

//null
public class Accessrule implements Serializable {
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=6,min=0,message="产品码不能超出6位")
	@ApiModelProperty(value = "产品码", example = "", dataType="varchar(6)", required = true )
    private String productno;

	@Length(max=80,min=0,message="规则名称不能超出80位")
	@ApiModelProperty(value = "规则名称", example = "", dataType="varchar(80)", required = true )
    private String rulename;

	@Length(max=1000,min=0,message="表达式不能超出1000位")
	@ApiModelProperty(value = "表达式", example = "", dataType="varchar(1000)", required = true )
    private String expression;

	@Length(max=1,min=0,message="准入类型不能超出1位")
	@ApiModelProperty(value = "准入类型", example = "", dataType="char(1)", required = true )
    private String admittancetype;

	@Length(max=1,min=0,message="命中时是否尽调注意事项不能超出1位")
	@ApiModelProperty(value = "命中时是否尽调注意事项", example = "", dataType="char(1)", required = true )
    private String isattention;

	@Length(max=1,min=0,message="命中时是否审批注意事项不能超出1位")
	@ApiModelProperty(value = "命中时是否审批注意事项", example = "", dataType="char(1)", required = true )
    private String isworkidtice;

	@Length(max=200,min=0,message="异常提示信息不能超出200位")
	@ApiModelProperty(value = "异常提示信息", example = "", dataType="varchar(200)", required = true )
    private String remark;

	@Length(max=2,min=0,message="校验类型[是否必要条件]不能超出2位")
	@ApiModelProperty(value = "校验类型[是否必要条件]", example = "", dataType="varchar(2)", required = true )
    private String validtype;

	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String rulestype;

	@Length(max=2,min=0,message="规则状态不能超出2位")
	@ApiModelProperty(value = "规则状态", example = "", dataType="varchar(2)", required = true )
    private String state;

	@ApiModelProperty(value = "最后修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@Length(max=10,min=0,message="最后修改人不能超出10位")
	@ApiModelProperty(value = "最后修改人", example = "", dataType="varchar(10)", required = true )
    private String chgtl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename == null ? null : rulename.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public String getAdmittancetype() {
        return admittancetype;
    }

    public void setAdmittancetype(String admittancetype) {
        this.admittancetype = admittancetype == null ? null : admittancetype.trim();
    }

    public String getIsattention() {
        return isattention;
    }

    public void setIsattention(String isattention) {
        this.isattention = isattention == null ? null : isattention.trim();
    }

    public String getIsworkidtice() {
        return isworkidtice;
    }

    public void setIsworkidtice(String isworkidtice) {
        this.isworkidtice = isworkidtice == null ? null : isworkidtice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getValidtype() {
        return validtype;
    }

    public void setValidtype(String validtype) {
        this.validtype = validtype == null ? null : validtype.trim();
    }

    public String getRulestype() {
        return rulestype;
    }

    public void setRulestype(String rulestype) {
        this.rulestype = rulestype == null ? null : rulestype.trim();
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
        Accessrule other = (Accessrule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductno() == null ? other.getProductno() == null : this.getProductno().equals(other.getProductno()))
            && (this.getRulename() == null ? other.getRulename() == null : this.getRulename().equals(other.getRulename()))
            && (this.getExpression() == null ? other.getExpression() == null : this.getExpression().equals(other.getExpression()))
            && (this.getAdmittancetype() == null ? other.getAdmittancetype() == null : this.getAdmittancetype().equals(other.getAdmittancetype()))
            && (this.getIsattention() == null ? other.getIsattention() == null : this.getIsattention().equals(other.getIsattention()))
            && (this.getIsworkidtice() == null ? other.getIsworkidtice() == null : this.getIsworkidtice().equals(other.getIsworkidtice()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getValidtype() == null ? other.getValidtype() == null : this.getValidtype().equals(other.getValidtype()))
            && (this.getRulestype() == null ? other.getRulestype() == null : this.getRulestype().equals(other.getRulestype()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getChgdt() == null ? other.getChgdt() == null : this.getChgdt().equals(other.getChgdt()))
            && (this.getChgtl() == null ? other.getChgtl() == null : this.getChgtl().equals(other.getChgtl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductno() == null) ? 0 : getProductno().hashCode());
        result = prime * result + ((getRulename() == null) ? 0 : getRulename().hashCode());
        result = prime * result + ((getExpression() == null) ? 0 : getExpression().hashCode());
        result = prime * result + ((getAdmittancetype() == null) ? 0 : getAdmittancetype().hashCode());
        result = prime * result + ((getIsattention() == null) ? 0 : getIsattention().hashCode());
        result = prime * result + ((getIsworkidtice() == null) ? 0 : getIsworkidtice().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getValidtype() == null) ? 0 : getValidtype().hashCode());
        result = prime * result + ((getRulestype() == null) ? 0 : getRulestype().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getChgdt() == null) ? 0 : getChgdt().hashCode());
        result = prime * result + ((getChgtl() == null) ? 0 : getChgtl().hashCode());
        return result;
    }
}
