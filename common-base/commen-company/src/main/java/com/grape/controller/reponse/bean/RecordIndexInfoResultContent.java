package com.grape.controller.reponse.bean;






import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

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
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RecordIndexInfoResultContent {
	

	
	@ApiModelProperty(value="录制内容结果",required=true)
	private List<RecordIndexInfoResult> recordIndexInfoResultList;
	
	@ApiModelProperty(value="直播类型",required=true)
	private String livetype;
	
	@ApiModelProperty(value="抵押物名称",required=true)
	private String mortgagename;
	
	@ApiModelProperty(value="抵押物id",required=true)
	private String mortgageno;
	
	@ApiModelProperty(value="正在上传的视频数量",required=true)
	private int uploadno;
	
}
