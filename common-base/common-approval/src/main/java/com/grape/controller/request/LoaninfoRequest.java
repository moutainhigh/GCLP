package com.grape.controller.request;

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
public class LoaninfoRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=8,min=0,message="申请编号不能超出8位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(8)", required = true )
    private String workid;

	@Length(max=80,min=0,message="前一押机构不能超出80位")
	@ApiModelProperty(value = "前一押机构", example = "", dataType="varchar(80)", required = true )
    private String firstmortgageorg;

	@Length(max=80,min=0,message="前二押机构不能超出80位")
	@ApiModelProperty(value = "前二押机构", example = "", dataType="varchar(80)", required = true )
    private String secondmortgage;
}
