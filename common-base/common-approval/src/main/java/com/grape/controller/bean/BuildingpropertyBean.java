package com.grape.controller.bean;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuildingpropertyBean {
	@Length(max=19,min=0,message="不能超出19位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(19)", required = true )
    private String id;

	@Length(max=3,min=0,message="咨询身份不能超出3位")
	@ApiModelProperty(value = "咨询身份", example = "", dataType="varchar(3)", required = true )
    private String identity;

	@Length(max=255,min=0,message="中介名片不能超出255位")
	@ApiModelProperty(value = "中介名片", example = "", dataType="varchar(255)", required = true )
    private String card;

	List<PictureBean> listPicture ;

	List<ImageList> imageList ;
	
	@Length(max=19,min=0,message="当前快速成交价不能超出19位")
	@ApiModelProperty(value = "当前快速成交价", example = "", dataType="varchar(19)", required = true )
    private String fastprice;

	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "", dataType="varchar(19)", required = true )
    private String mortgageid;

	@Length(max=19,min=0,message="实地挂盘价不能超出19位")
	@ApiModelProperty(value = "实地挂盘价", example = "", dataType="varchar(19)", required = true )
    private String realprice;


	@Length(max=17,min=0,message="房产评估单价不能超出17位")
	@ApiModelProperty(value = "房产评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal houseunitprice;

	@Length(max=17,min=0,message="房产评估总价不能超出17位")
	@ApiModelProperty(value = "房产评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal housetotalprice;
}
