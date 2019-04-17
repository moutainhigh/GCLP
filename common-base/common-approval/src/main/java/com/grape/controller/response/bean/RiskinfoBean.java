package com.grape.controller.response.bean;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

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
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RiskinfoBean {

	@Length(max=2000,min=0,message="风险建议不能超出2000位")
	@ApiModelProperty(value = "风险建议", example = "", dataType="varchar(2000)", required = true )
    private String riskadvice;

	@Length(max=2000,min=0,message="风险揭示不能超出2000位")
	@ApiModelProperty(value = "风险揭示", example = "", dataType="varchar(2000)", required = true )
    private String riskdiclosure;
}
