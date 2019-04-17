package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.model.db.Applyforex;
import com.grape.model.db.Comapply;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ApplyforexResponse extends RestfulResponse{
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "申请展期(applyforex)", required = true,example="")
	private Applyforex obj;
	
	@ApiModelProperty(value = "共同申请(comapply)", required = true,example="")
	private Comapply obj1;
}
