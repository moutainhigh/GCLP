package com.grape.controller.reponse.bean;





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
public class RecordIndexInfoResult {
	

	
	@ApiModelProperty(value="录制列表",required=true)
	private RecordIndexInfoList RecordIndexInfoList;
	

	@ApiModelProperty(value="分页的页码",required=true)
	private int PageNum;
	
	
	@ApiModelProperty(value="每页大小",required=true)
	private int PageSize;
	
	
	@ApiModelProperty(value="排序",required=true)
	private String Order;
	
	
	@ApiModelProperty(value="总页数",required=true)
	private int TotalPage;
	

	@ApiModelProperty(value="符合条件的总个数",required=true)
	private int TotalNum;
	
	@ApiModelProperty(value="请求ID",required=true)
	private String RequestId;
	
	
}
