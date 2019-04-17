package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmsparamByOptionBean {
    @ApiModelProperty(value = "短信状态")
    private String sendflg;

    @ApiModelProperty(value = "短信模板")
    private String templatecode;

    @ApiModelProperty(value = "发送类型", required = true )
    private String sendtype;
}
