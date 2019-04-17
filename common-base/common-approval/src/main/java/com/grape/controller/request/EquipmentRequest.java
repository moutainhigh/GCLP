package com.grape.controller.request;

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
public class EquipmentRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;

	@Length(max=20,min=0,message="现场平台ip不能超出20位")
	@ApiModelProperty(value = "现场平台ip", example = "120.79.34.178", dataType="varchar(20)", required = true )
    private String pltip;

	@Length(max=4,min=0,message="端口号不能超出9位")
	@ApiModelProperty(value = "端口号", example = "5510", dataType="varchar(4)", required = true )
    private String pltport;

	@Length(max=19,min=0,message="用户名不能超出19位")
	@ApiModelProperty(value = "用户名", example = "mcuuser", dataType="varchar(19)", required = true )
    private String mcuuser;

	@Length(max=19,min=0,message="密码不能超出19位")
	@ApiModelProperty(value = "密码", example = "mcupwd", dataType="varchar(19)", required = true )
    private String mcupwd;

	@Length(max=40,min=0,message="设备编号不能超出40位")
	@ApiModelProperty(value = "设备编号", example = "1243479175@kkcom", dataType="varchar(40)", required = true )
    private String deviceid;

	@Length(max=3,min=0,message="视频源号不能超出9位")
	@ApiModelProperty(value = "视频源号", example = "0", dataType="varchar(3)", required = true )
    private String src;

	@Length(max=3,min=0,message="编码通道号不能超出9位")
	@ApiModelProperty(value = "编码通道号", example = "0", dataType="varchar(3)", required = true )
    private String chan;

	@Length(max=19,min=0,message="设备所在厂商不能超出19位")
	@ApiModelProperty(value = "设备所在厂商", example = "kk", dataType="varchar(19)", required = true )
    private String manu;
	
	@Length(max=40,min=0,message="域id不能超出40位")
	@ApiModelProperty(value = "域id", example = "", dataType="varchar(40)", required = true )
    private String domainid;

	@Length(max=40,min=0,message="不能超出40位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(40)", required = true )
    private String puid;
	
	@Length(max=40,min=0,message="不能超出44位")
	@ApiModelProperty(value = "高级端口号", example = "", dataType="varchar(40)", required = true )
	private String highport;
}
