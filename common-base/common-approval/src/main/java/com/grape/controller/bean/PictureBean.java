package com.grape.controller.bean;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PictureBean {
	@Length(max=255,min=0,message="不能超出255位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(255)", required = true )
    private String name;
	
	List<ImageList2> imagelist ;
	
}
