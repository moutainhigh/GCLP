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
public class CodeofpointsRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="主键id不能超出19位")
	@ApiModelProperty(value = "主键id", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=20,min=0,message="字段名称不能超出20位")
	@ApiModelProperty(value = "字段名称", example = "", dataType="varchar(20)", required = true )
    private String columnname;

	@Length(max=40,min=0,message="评分指标不能超出40位")
	@ApiModelProperty(value = "评分指标", example = "", dataType="varchar(40)", required = true )
    private String scoringrubrics;

	@Length(max=5,min=0,message="分数不能超出5位")
	@ApiModelProperty(value = "分数", example = "", dataType="decimal(5,2)", required = true )
    private BigDecimal grade;
}
