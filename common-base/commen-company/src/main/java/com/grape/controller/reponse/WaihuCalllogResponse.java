package com.grape.controller.reponse;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.WaihuCalllog;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class WaihuCalllogResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;

   
    
    @ApiModelProperty(value = "通话记录信息", required = true)
    private List<WaihuCalllog>  calllogs;
    
    @ApiModelProperty(value = "电话核实意见", required = true)
    private String notation;
    
   
    
}
