package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.bean.MortgagerentBean;
import com.grape.model.db.Incomeinfo;

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
public class IncomeInfoResponse extends RestfulResponse{
	private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "收入情况表(incomeinfo)", required = true,example="")
    private Incomeinfo incomeinfo;
    
    @ApiModelProperty(value = "银行流水表(bnkincomeinfo)", required = true,example="")
    private List<BnkincomeBean> bnkincome;
    
    @ApiModelProperty(value = "抵押物租金(mortgagerent)", required = true,example="")
    private List<MortgagerentBean> mortgagerent;
    
}
