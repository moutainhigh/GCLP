package com.grape.controller.response.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsappealBean {

	@ApiModelProperty(value = "是否可以申诉", example = "", dataType="varchar(10)", required = true )
    private boolean isAppeal;
}
