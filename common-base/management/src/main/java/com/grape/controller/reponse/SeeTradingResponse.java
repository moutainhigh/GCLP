package com.grape.controller.reponse;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.SeeTradingBean;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SeeTradingResponse extends RestfulResponse{

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "数据集合", example = "", required = true)
    private List<SeeTradingBean> seeTradingBean;
	
	@ApiModelProperty(value = "数据总条数", example = "", required = true)
    private int countInfo;
	
}
