package com.grape.controller.response.bean;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.grape.controller.bean.ImageBean1;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.Paymentapplyinfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ComapplyBean {

	@Length(max=19,min=0,message="共同借款人不能超出19位")
	@ApiModelProperty(value = "共同借款人", example = "", dataType="varchar(19)", required = true )
    private String comapply;

	@Length(max=19,min=0,message="国籍不能超出19位")
	@ApiModelProperty(value = "国籍", example = "", dataType="varchar(19)", required = true )
    private String nationality;

	@Length(max=40,min=0,message="证件号码不能超出40位")
	@ApiModelProperty(value = "证件号码", example = "", dataType="varchar(40)", required = true )
    private String identi;
}
