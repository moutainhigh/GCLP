package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.model.db.Chanapprovalform;

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
public class ComplateResponse extends RestfulResponse{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "基本资料是否完善", example = "true", dataType="boolean", required = true )
    private boolean baseinfoflg; 
	
	@ApiModelProperty(value = "抵押物资料是否完善", example = "true", dataType="boolean", required = true )
    private boolean mortgageinfoflg; 
	
	@ApiModelProperty(value = "申请人资料是否完善", example = "true", dataType="boolean", required = true )
    private boolean custinfoflg; 
	
	@ApiModelProperty(value = "附件资料是否完善", example = "true", dataType="boolean", required = true )
    private boolean imageinfoflg; 

}
