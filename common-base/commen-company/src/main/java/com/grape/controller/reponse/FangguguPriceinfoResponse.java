package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.ChannelAssessinfo;
import com.grape.model.db.Person;

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
public class FangguguPriceinfoResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;

   
    
    @ApiModelProperty(value = "房估估评估价格", required = true)
    private ChannelAssessinfo fanggugupriceinfo;
    
   
    
}
