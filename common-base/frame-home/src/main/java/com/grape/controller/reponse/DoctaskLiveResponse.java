package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.DoctaskUnfinish;

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
public class DoctaskLiveResponse extends RestfulResponse {

    private static final long serialVersionUID = 8178288370714851790L;
    
    @ApiModelProperty(value = "总条数", required = true)
    private String totalsize;
    
    @ApiModelProperty(value = "直播流水列表", required = true)
    private List<DoctaskUnfinish> doctaskLives;
    
}
