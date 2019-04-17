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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class NodeResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;
    @ApiModelProperty(value = "是否已处理", required = true)
    private boolean flag;
    
    
    @ApiModelProperty(value = "机构编号", required = true)
    private String organizationno;
    
}