package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.ApplyforexForm;
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
public class ApplyforexFormResponse extends RestfulResponse{
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "信息", example = "", dataType="", required = true )
	private ApplyforexForm applyforexForm;
}
