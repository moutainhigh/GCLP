package com.grape.controller.request;

import java.util.Date;


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
public class SmsParamRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="主键ID（修改时需要传递）")
	private String id;

	@ApiModelProperty(value = "accessKeyId", example = "", dataType="varchar(40)", required = true )
    private String accesskeyid;

	@ApiModelProperty(value = "accessKeySecret", example = "", dataType="varchar(80)", required = true )
    private String accesskeysecret;

	@ApiModelProperty(value = "短信签名", example = "", dataType="varchar(40)", required = true )
    private String msgsign;

	@ApiModelProperty(value = "短信模板", example = "", dataType="varchar(40)", required = true )
    private String templatecode;

	@ApiModelProperty(value = "产品编号", example = "", dataType="varchar(19)", required = true )
    private String productno;

	@ApiModelProperty(value = "发送频率（以逗号隔开）", example = "", dataType="varchar(30)", required = true )
    private String sendfreq;

	@ApiModelProperty(value = "发送类型（1为验证码2为还款3为逾期）", example = "", dataType="varchar(1)", required = true )
    private String sendtype;

	@ApiModelProperty(value = "尝试发送次数", example = "", dataType="varchar(2)", required = true )
    private String sendchance;

	@ApiModelProperty(value = "发送标志", example = "", dataType="varchar(1)", required = true )
    private String sendflg;

	@ApiModelProperty(value = "修改时间", example = "", dataType="datetime", required = true )
    private Date chgdt;

	@ApiModelProperty(value = "修改人", example = "", dataType="varchar(8)", required = true )
    private String chgtl;

	@ApiModelProperty(value = "描述信息", example = "", dataType="varchar(255)", required = true )
    private String description;

	@ApiModelProperty(value = "是否启用", example = "", dataType="varchar(2)", required = true )
    private String useflg;
}
