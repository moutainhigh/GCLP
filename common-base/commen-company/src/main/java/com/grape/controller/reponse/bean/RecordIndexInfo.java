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
public class RecordIndexInfo {
	
	
	@ApiModelProperty(value="索引文件地址",required=true)
	private String RecordUrl;
	
	
	@ApiModelProperty(value="流所属加速域名",required=true)
	private String DomainName;
	

	@ApiModelProperty(value="流所属应用名称",required=true)
	private String AppName;
	

	@ApiModelProperty(value="直播流名称",required=true)
	private String StreamName;

	@ApiModelProperty(value="开始时间",required=true)
	private String StartTime;
	

	@ApiModelProperty(value="结束时间",required=true)
	private String EndTime;
	

	@ApiModelProperty(value="录制时长",required=true)
	private float Duration;
	
	
	@ApiModelProperty(value="视频高",required=true)
	private int Height;
	
	
	@ApiModelProperty(value="视频宽",required=true)
	private int Width;
	
	
	@ApiModelProperty(value="创建时间",required=true)
	private String CreateTime;
	
	
	@ApiModelProperty(value="索引文件 ID",required=true)
	private String RecordId;
	
	
	@ApiModelProperty(value="OSSBucket的名称",required=true)
	private String OssBucket;
	
	
	@ApiModelProperty(value="OSSEndpoint域名",required=true)
	private String OssEndpoint;
	
	
	@ApiModelProperty(value="OSSObject",required=true)
	private String OssObject;
	
	
	
}
