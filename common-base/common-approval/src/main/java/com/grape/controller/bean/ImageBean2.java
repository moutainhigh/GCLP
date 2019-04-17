package com.grape.controller.bean;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageBean2 {

	@ApiModelProperty(value="id",example="",required=true,dataType="")
	private String id ;	
	
	@ApiModelProperty(value="name",example="",required=true,dataType="")
	private String name ;
	
	@ApiModelProperty(value="type",example="",required=true,dataType="")
	private String type ;
	
	@ApiModelProperty(value="影像表（IMAGE）",example="",required=true,dataType="")
	private List<ImageBean1> list;
}
