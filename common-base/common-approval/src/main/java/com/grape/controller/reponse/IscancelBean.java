package com.grape.controller.reponse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IscancelBean {
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private boolean isCancel;
}
