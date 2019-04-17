package com.grape.controller.reponse;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.WaihuCalllog;
import com.grape.model.db.Phoneverification;
import com.grape.model.db.Riskinfo;

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
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class PhoneVerificationResponse extends RestfulResponse{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "电话核查基本信息", example = "", dataType="", required = true )
	private Phoneverification phoneverification ;
	@ApiModelProperty(value = "风险信息列表", example = "", dataType="", required = true )
	private List<Riskinfo> riskinfos;
	@ApiModelProperty(value = "电话通话记录", example = "", dataType="", required = true )
	private List<WaihuCalllog> calllogs;

}
