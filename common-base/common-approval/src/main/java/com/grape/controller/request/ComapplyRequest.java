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
public class ComapplyRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;
	
	@Length(max=19,min=0,message="共同借款人不能超出19位")
	@ApiModelProperty(value = "共同借款人", example = "", dataType="varchar(19)", required = true )
    private String comapply;

	@Length(max=19,min=0,message="国籍不能超出19位")
	@ApiModelProperty(value = "国籍", example = "", dataType="varchar(19)", required = true )
    private String nationality;

	@Length(max=40,min=0,message="证件号码不能超出40位2")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(40)", required = true )
    private String identi;
	
}
