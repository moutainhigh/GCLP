package com.grape.controller.reponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ImagefulResponse implements Response{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int DEFAULT_OK = 20000;
	
	public static final String DEFAULT_SUCCESS = "操作成功";
	
	public static final String IMAGE_SUCCESS = "附件";
	 /**
     * [M] 平台状态码
     */
    @JsonProperty("code")
    @ApiModelProperty(value = "平台状态码", example = "20000", required = true)
    private int code = DEFAULT_OK;
    
    /**
     * [M] 平台状态码
     */
    @JsonProperty("message")
    @ApiModelProperty(value = "提示信息", example = "操作成功", required = false)
    private String message = DEFAULT_SUCCESS;
    
    
    @JsonProperty("image")
    @ApiModelProperty(value = "", example = "", required = false)
    private String image = IMAGE_SUCCESS;
}
