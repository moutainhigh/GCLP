package com.grape.controller.reponse;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.AccountInfo;
import com.grape.model.db.Redemptiontype;

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
public class PlanNaccountResponse extends RestfulResponse{
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "赎楼方案信息", example = "", dataType="", required = true )
	private Redemptiontype planInfo;
	@ApiModelProperty(value = "银行账户信息", example = "", dataType="", required = true )
	private AccountInfo accountInfo;

}
