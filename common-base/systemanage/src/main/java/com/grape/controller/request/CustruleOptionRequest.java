package com.grape.controller.request;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.CustruleByOptionBean;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class CustruleOptionRequest extends RestfulRequest{
	@Length(max=8,min=0,message="状态不能超出8位")
    @ApiModelProperty(value = "状态", example = "", dataType="char(8)", required = true )
    private String status;

    @Length(max=16,min=0,message="规则名字不能超出16位")
    @ApiModelProperty(value = "规则名字", example = "", dataType="varchar(16)", required = true )
    private String rulename ;
    
    private Integer pagenum;
    
    private Integer pagesize;
}
