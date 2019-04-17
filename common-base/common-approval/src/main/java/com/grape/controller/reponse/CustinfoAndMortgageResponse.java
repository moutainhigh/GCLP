package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Mortgage;

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
public class CustinfoAndMortgageResponse extends RestfulResponse{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @ApiModelProperty(value = "申请人信息(custinfo)", required = true,example="{workid:xx,custno:xx}")
    private List<Custinfo> custinfos;
    
    @ApiModelProperty(value = "申请人信息(custinfo)", required = true,example="{workid:xx,custno:xx}")
    private List<Applyinfoofcom> applyinfoofcoms;
    
    @ApiModelProperty(value = "抵押物信息表(mortgage)", required = true,example="")
    private List<Mortgage> mortgages;

}
