package com.grape.controller.reponse.bean;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Mortgage;

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
public class DoctaskUnfinish2 {
	
	@ApiModelProperty(value="流水号",required=true)
	private String workid;
	@ApiModelProperty(value="自然人信息",required=true)
	private List<Applyinfoofcom> applyinfoofcoms;
	@ApiModelProperty(value="法人信息",required=true)
	private List<Custinfo> custinfos;
	@ApiModelProperty(value="抵押物信息",required=true)
	private List<Mortgage> mortgages;
	
	
	
	
}
