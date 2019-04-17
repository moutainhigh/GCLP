package com.grape.controller.reponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.response.bean.ApplyinfoOfComResponseBean;
import com.grape.controller.response.bean.CustinfoResponseBean;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class CustinfoResponse2 extends RestfulResponse{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<CustinfoResponseBean> custBean ;
	
	List<CustinfoResponseBean> custBean2 ;
	
	List<ApplyinfoOfComResponseBean> applyinfoofcom ;
	
	List<ApplyinfoOfComResponseBean> applyinfoofcom2 ;
	
	 @ApiModelProperty(value = "诉讼审查", example = "123", dataType="varchar(300)", required = true )
	 private String loannote;//lawnote
	 
	 @ApiModelProperty(value = "基本审查", example = "123", dataType="varchar(300)", required = true )
	 private String baseinfonote;
	 
		@ApiModelProperty(value = "基本信息审查（担保方）", example = "", dataType="varchar(500)", required = true )
	    private String baseinfonote1;
		
		@ApiModelProperty(value = "诉讼审查", example = "", dataType="varchar(500)", required = true )
	    private String lownote1;
}
