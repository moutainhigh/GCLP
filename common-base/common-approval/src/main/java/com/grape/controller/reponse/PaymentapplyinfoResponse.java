package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.bean.GroommortgageBean;
import com.grape.model.db.Paymentapplyinfo;

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
public class PaymentapplyinfoResponse extends RestfulResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "还款申请表(paymentapplyinfo)", required = true,example="")
    private Paymentapplyinfo paymentapplyinfo;
	
	@ApiModelProperty(value = "抵押物信息", required = true,example="")
	private List<GroommortgageBean> mortgagelist;
}
