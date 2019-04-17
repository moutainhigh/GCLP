package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.ProductView;

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
public class ProductViewResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;

    @ApiModelProperty(value = "产品展示信息", required = true)
    private ProductView productview;
    
    @ApiModelProperty(value = "总条数", required = true)
    private String totalsize;
}
