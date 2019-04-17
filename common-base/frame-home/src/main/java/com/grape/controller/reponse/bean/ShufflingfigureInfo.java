package com.grape.controller.reponse.bean;



import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)

public class ShufflingfigureInfo {
	
	@ApiModelProperty(value="id",required=true)
	
	private String id;
	@ApiModelProperty(value="影像名称",required=true)
	
	private String filename;
	@ApiModelProperty(value="影像url",required=true)

	private String fileurl;
	@ApiModelProperty(value="产品编号",required=true)

	private String productno;
	@ApiModelProperty(value="产品名称",required=true)

	private String productname;
	
	
}
