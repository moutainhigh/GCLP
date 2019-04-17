package com.grape.controller.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class MortgagematchRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;
    @NotNull
    @NotEmpty(message = "流水号为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
    
    @NotNull
    @NotEmpty(message = "城市编码为空")
    @Length(max=6,min=0,message="城市编码为6位")
    @ApiModelProperty(value = "城市编码", example = "440300", required = true)
    private String citycode;
    
    @NotNull
    @NotEmpty(message = "抵押物名称为空")
    @ApiModelProperty(value = "抵押物名称", example = "香缇雅苑", required = true)
    private String martgagename;
    
    @NotNull
    @NotEmpty(message = "抵押物编号为空")
    @Length(max=19,min=0,message="城市编码为19位")
    @ApiModelProperty(value = "抵押物编号", example = "1808061456587569101", required = true)
    private String mortgageno;
    
    

}
