package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

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
public class ProductContentResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "产品编号", required = true)
    private String productno;
    
    @ApiModelProperty(value = "产品详细内容", required = true)
    private String content;
    
    @ApiModelProperty(value = "是否启用", required = true)
    private boolean useflg;
}
