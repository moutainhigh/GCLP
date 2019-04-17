package com.grape.controller.request;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepaytoInfoRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=32,min=0,message="还款方式不能超出32位")
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod;

	@Length(max=20,min=0,message="批复机构不能超出20位")
	@ApiModelProperty(value = "批复机构", example = "", dataType="varchar(20)", required = true )
    private String batchorg;

	@Length(max=17,min=0,message="批复金额不能超出17位")
	@ApiModelProperty(value = "批复金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal sumofamount;

	@Length(max=9,min=0,message="批复利率不能超出9位")
	@ApiModelProperty(value = "批复利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestrate;

	@Length(max=4,min=0,message="利率类型不能超出4位")
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(4)", required = true )
    private String interestratetype;

	@Length(max=4,min=0,message="贷款期限不能超出4位")
	@ApiModelProperty(value = "贷款期限", example = "", dataType="varchar(4)", required = true )
    private String loanlimittime;

	@Length(max=1,min=0,message="是否同意期待贷款申请金额不能超出1位")
	@ApiModelProperty(value = "是否同意期待贷款申请金额", example = "", dataType="char(1)", required = true )
    private String isagreeexceptamount;

	@Length(max=200,min=0,message="贷款用途不能超出200位")
	@ApiModelProperty(value = "贷款用途", example = "", dataType="varchar(200)", required = true )
    private String useofloan;
	
	@Length(max=4,min=0,message="总授信期限不能超出4位")
	@ApiModelProperty(value = "总授信期限", example = "", dataType="varchar(4)", required = true )
    private String totaluseterm;

	@Length(max=17,min=0,message="总授信金额不能超出17位")
	@ApiModelProperty(value = "总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totaluseamount;

	@Length(max=1,min=0,message="是否最终批复信息不能超出1位")
	@ApiModelProperty(value = "是否最终批复信息", example = "", dataType="char(1)", required = true )
    private String isfinilyflg;

	@Length(max=20,min=0,message="最终选择批复机构不能超出20位")
	@ApiModelProperty(value = "最终选择批复机构", example = "", dataType="varchar(20)", required = true )
    private String selectorg;

	@Length(max=1,min=0,message="担保方是否出具保函不能超出1位")
	@ApiModelProperty(value = "担保方是否出具保函", example = "", dataType="char(1)", required = true )
    private String chooseassure;

	@Length(max=2000,min=0,message="审批意见不能超出2000位")
	@ApiModelProperty(value = "审批意见", example = "", dataType="varchar(2000)", required = true )
    private String notation;
	
	@ApiModelProperty(value = "节点编号", example = "", dataType="varchar(10)", required = true )
    private String nodeid;
	
	@ApiModelProperty(value = "操作", example = "", dataType="varchar(10)", required = true )
    private String operation;
	
}
