package com.grape.controller.request;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ExpectloaninfoRequest extends RestfulRequest{/**
	 * 
	 */   
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="申请编号",example="0000000001",required=true)
	private String workid;
	
	@ApiModelProperty(value="期待贷款金额",example="100000",required=true)
	private BigDecimal expectapplyamount;
	
	@ApiModelProperty(value="期望申请利率",example="7.6",required=true)
	private BigDecimal expectapplyrate ;
	
	@ApiModelProperty(value="期望申请年限",example="10",required=true)
	private String expectapplyyear;
	
	@ApiModelProperty(value="还款方式",example="01",required=true)
	private String repaymethod;
	
	@ApiModelProperty(value="月供金额",example = "60.00000",required = true )
    private BigDecimal monthamount;
	
	@ApiModelProperty(value = "期待总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal extotaluseamount;

	@ApiModelProperty(value = "期待总授信期限", example = "", dataType="varchar(4)", required = true )
    private String extotaluseterm;
	
	@ApiModelProperty(value = "利率类型", example = "", dataType="varchar(4)", required = true )
    private String interestratetype;
}
