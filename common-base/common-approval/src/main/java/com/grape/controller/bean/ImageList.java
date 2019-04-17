package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageList {
	
	@Length(max=255,min=0,message="名称不能超出255位")
	@ApiModelProperty(value = "名称", example = "", dataType="varchar(255)", required = true )
    private String name;
	
	List<PictureBean> listPicture ;
	
}
