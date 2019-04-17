package com.grape.controller.request.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

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
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class XTQueryPriceRequestBean {
	
	/**
	 * API KEY
	 */
	private String apiKey ;
	/**
	 * 城市码
	 */
	private String city ;
	/**
	 * 行政区码
	 */
	private String district ;
	/**
	 * 评估房源所在的小区名称
	 */
	private String haname ;
	/**
	 * 房源所在地址描述 
	 */
	private String location ;
	/**
	 * 评估房源的面积 
	 */
	private String bldgarea ;
	/**
	 * 评估房源所在楼层 
	 */ 
	private String floor ;
	/**
	 * 评估房源所在楼座的楼高 
	 */ 
	private String height ;
	/**
	 * 建筑年代 
	 */
	private String buildyear ;
	/**
	 * 申请单号
	 */
	private String applyno ;
}
