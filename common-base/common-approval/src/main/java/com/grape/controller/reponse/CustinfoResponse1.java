package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.bean.CustinfoBean;
import com.grape.controller.response.bean.HaveLoanBean;
import com.grape.model.db.Litigationinfo;

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
public class CustinfoResponse1 extends RestfulResponse{
	private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "申请人信息(custinfo)", required = true,example="")
    private CustinfoBean cust;
    
    @ApiModelProperty(value = "诉讼记录(litigationinfo)", required = true,example="")
    private List<Litigationinfo> litigationinfo;
    
    @ApiModelProperty(value = "申请人信息(custinfo)", required = true,example="")
    private HaveLoanBean loaninfo;
}
