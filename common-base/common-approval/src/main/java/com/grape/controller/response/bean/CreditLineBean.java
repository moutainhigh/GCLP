package com.grape.controller.response.bean;

import java.math.BigDecimal;



import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class CreditLineBean {
	
	
	@ApiModelProperty(value = "抵押率（建议授信额度）", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal suggestmortgagerate;

	
	@ApiModelProperty(value = "抵押物利率备注", example = "", dataType="varchar(500)", required = true )
    private String mortgageratenote;

	
	@ApiModelProperty(value = "贷后资产负债率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal afterloandebtrate;

	
	@ApiModelProperty(value = "贷后资产负债率备注", example = "", dataType="varchar(500)", required = true )
    private String afterloandebtratenote;

	
	@ApiModelProperty(value = "抵押率授信", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal mortgagerateamount;

	
	@ApiModelProperty(value = "负债率授信", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal debtrateamount;
	
	
	@ApiModelProperty(value = "最高授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal maxcreditamount;

	
	@ApiModelProperty(value = "实际授信额度", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal realcreditamount;
	
	@ApiModelProperty(value = "字段选择", example = "", dataType="decimal(17,5)", required = true )
    private String columnselect;
}
