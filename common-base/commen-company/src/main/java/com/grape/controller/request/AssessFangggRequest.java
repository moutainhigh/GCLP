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
public class AssessFangggRequest extends RestfulRequest {

    private static final long serialVersionUID = -7315046960598963993L;

    @NotNull
    @NotEmpty(message = "流水号为空")
    @Length(max=10,min=0,message="流水号为10位")
    @ApiModelProperty(value = "流水号", example = "0000000000", required = true)
    private String workid;
    
    @NotNull
    @NotEmpty(message = "城市编码为空")
    @Length(max=12,min=0,message="城市编码为6位")
    @ApiModelProperty(value = "城市编码", example = "440300", required = true)
    private String citycode;
    
    @NotNull
    @NotEmpty(message = "房屋坐落地址为空")
    @ApiModelProperty(value = "房屋坐落地址", example = "龙华区东环一路香缇雅苑", required = true)
    private String houseaddress;
    
    @NotNull
    @NotEmpty(message = "抵押物名称为空")
    @ApiModelProperty(value = "抵押物名称", example = "香缇雅苑", required = true)
    private String mortgagename;
    
    @NotNull
    @NotEmpty(message = "抵押物编号为空")
    @Length(max=19,min=0,message="抵押物编号为19位")
    @ApiModelProperty(value = "抵押物编号", example = "1808061456587569101", required = true)
    private String mortgageno;
    
    @NotNull
    @NotEmpty(message = "抵押物匹配编号")
    @Length(max=2,min=0,message="抵押物匹配编号为2位")
    @ApiModelProperty(value = "抵押物匹配编号", example = "0", required = true)
    private String matchno;
    
    @NotNull
    @NotEmpty(message = "建筑面积为空")
    @ApiModelProperty(value = "建筑面积", example = "111.11", required = true)
    private String floorarea;
    
    @NotNull
    @NotEmpty(message = "住宅类型为空")
    @ApiModelProperty(value = "住宅类型", example = "住宅", required = true)
    private String housetype;
    
   
}
