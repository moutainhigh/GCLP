package com.grape.controller.reponse.bean;


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
public class HFWshixianBean {
	
	
	private long keyid;
	
	private int typet;
	
	private String typetname;	
	
	private String title;

	private String sslong;
	
	private String name;
	
	private String id;
	
	private String casenum;
	
	private String court;
	
	private String content;
	
	private String timetype;
	
	private String state;
	
	private String remark;

	private String sx_sf;
	
	private String sx_lx;
	
	private String sx_jt;
	
	private String sx_fb;
	
	private String sx_wh;
	
	private String sx_dw;
	
	private String wlmoney;

}
