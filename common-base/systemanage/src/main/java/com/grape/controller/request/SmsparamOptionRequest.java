package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.response.bean.SmsparamByOptionBean;
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
public class SmsparamOptionRequest extends RestfulRequest{
    @ApiModelProperty(value = "短信状态")
    private String sendflg;

    @ApiModelProperty(value = "短信模板")
    private String templatecode;

    @ApiModelProperty(value = "发送类型", required = true )
    private String sendtype;

    @ApiModelProperty(value = "产品类型", required = true )
    private String productno;

    @ApiModelProperty(value="页面编号")
    private Integer pagenum;

    @ApiModelProperty(value="页面数量")
    private Integer pagesize;
}
