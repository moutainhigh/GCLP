package com.grape.controller.bean;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssetinfoBackBean {
	@ApiModelProperty(value = "其他房产资产信息表(assetinfo)", required = true,example="")
    private List<AssetinfoBean> houseasset;
    
    @ApiModelProperty(value = "其他资产信息表(assetinfo)", required = true,example="")
    private List<AssetinfoBean> othersasset;
    
    @ApiModelProperty(value = "资产审查说明", required = true,example="")
    private String assessnotation;
}
