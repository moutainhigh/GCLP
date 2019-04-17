package com.grape.controller.request;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

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
@EqualsAndHashCode(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class ContractRequest extends RestfulRequest{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Length(max=11,min=0,message="不能超出11位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(11)", required = true )
    private String productno;

	@Length(max=20,min=0,message="不能超出20位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(20)", required = true )
    private String aera;

	@Length(max=20,min=0,message="渠道不能超出20位")
	@ApiModelProperty(value = "渠道", example = "", dataType="varchar(20)", required = true )
    private String channelno;

	@Length(max=255,min=0,message="文件名不能超出255位")
	@ApiModelProperty(value = "文件名", example = "", dataType="varchar(255)", required = true )
    private String filename;

	@ApiModelProperty(value = "时间", example = "", dataType="datetime", required = true )
    private Date time;

	@Length(max=20,min=0,message="上传人不能超出20位")
	@ApiModelProperty(value = "上传人", example = "", dataType="varchar(20)", required = true )
    private String uploadperson;
}
