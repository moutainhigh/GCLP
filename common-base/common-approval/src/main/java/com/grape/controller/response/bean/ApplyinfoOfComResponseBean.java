package com.grape.controller.response.bean;

import java.util.List;

import com.grape.controller.bean.ApplyinfofcomBean;
import com.grape.model.db.Shareman;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplyinfoOfComResponseBean {
	@ApiModelProperty(value = "申请人信息表(公司)(applyinfoofcom)", required = true,example="")
	private ApplyinfofcomBean obj;
	
	@ApiModelProperty(value = "股东信息(shareman)", required = true,example="")
	private List<Shareman> list;
}
