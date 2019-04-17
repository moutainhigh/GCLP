package com.grape.controller.response.bean;

import java.util.List;

import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Litigationinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CustinfoResponseBean {
	 @ApiModelProperty(value = "申请人信息(custinfo)", required = true,example="")
	 private Custinfo cust;
	    
	 @ApiModelProperty(value = "诉讼记录(litigationinfo)", required = true,example="")
	 private List<Litigationinfo> litigationinfo;
	 
	 @ApiModelProperty(value = "诉讼审查", example = "123", dataType="varchar(300)", required = true )
	 private String lawnote;
	 
	 @ApiModelProperty(value = "基本审查", example = "123", dataType="varchar(300)", required = true )
	 private String mainnote;

}
