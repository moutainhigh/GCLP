package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DebtinfoBackBean {
	@ApiModelProperty(value = "贷款负债信息表(debtinfo)", required = true,example="")
    private List<DebtinfoBean> loandebtinfos;
    
    @ApiModelProperty(value = "信用卡负债信息表(debtinfo)", required = true,example="")
    private List<DebtinfoBean> cerdiddebtinfos;
    
	@ApiModelProperty(value = "历史是否无民间借贷记录", example = "", dataType="varchar(4)", required = true )
    private String historicalhavaloanflg;
    
	@ApiModelProperty(value = "是否有民间借贷记录", example = "", dataType="char(1)", required = true )
    private String havaloanflg;
	
	@ApiModelProperty(value = "总负债金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totaldebtamount;
	
	@ApiModelProperty(value = "贷款余额合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalloanamount;
	
	@ApiModelProperty(value = "信用卡余额合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalcerdidamount;
	
	@ApiModelProperty(value = "借款人负债信息审查", example = "", dataType="varchar(2000)", required = true )
    private String debtinfonotation;
	
	@ApiModelProperty(value = "担保人负债信息审查", example = "", dataType="varchar(2000)", required = true )
    private String debtinfonotation1;
	
	@ApiModelProperty(value = "我司还款情况", example = "", dataType="varchar(2000)", required = true )
    private String companyrepaynote;
}
