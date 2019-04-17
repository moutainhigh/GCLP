package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.bean.ImageBean1;
import com.grape.model.db.Delimortgage;

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
public class DilimortgageResponse extends RestfulResponse{
	private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "尽调申请人信息表(dilimortgage)", required = true,example="")
    private Delimortgage obj;
    
    @ApiModelProperty(value="影像表（IMAGE）",example="",required=true,dataType="")
	private List<List<ImageBean1>> list;
    
    
}
