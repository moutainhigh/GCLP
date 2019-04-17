package com.grape.controller.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageBean {
	
	@ApiModelProperty(value="文件名称")
	private String filename;
	
	@ApiModelProperty(value="文件类型")
	private String filetype;
}
