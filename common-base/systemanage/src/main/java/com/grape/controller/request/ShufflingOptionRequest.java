package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ShufflingOptionRequest extends RestfulRequest{
    @Length(max=80,min=0,message="影像名称不能超出80位")
    @ApiModelProperty(value = "影像名称", example = "", dataType="varchar(80)", required = true )
    private String filename;

    @Length(max=1,min=0,message="启用标志不能超出1位")
    @ApiModelProperty(value = "启用标志", example = "", dataType="varchar(1)", required = true )
    private String useflg;

    @Length(max=1,min=0,message="")
    @ApiModelProperty(value = "产品编号", example = "", dataType="varchar(1)", required = true )
    private String productno;

    @ApiModelProperty(value="页面编号")
    private Integer pagenum;

    @ApiModelProperty(value="页面数量")
    private Integer pagesize;
}
