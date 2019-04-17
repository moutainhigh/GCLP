package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

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
public class BuildingpropertyRequest extends RestfulRequest{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotBlank
	@Length(max=3,min=0,message="咨询身份不能超出2位")
	@ApiModelProperty(value = "咨询身份", example = "01", dataType="varchar(3)", required = true )
    private String identity;

	@NotNull
	@NotBlank
	@Length(max=255,min=0,message="中介名片不能超出255位")
	@ApiModelProperty(value = "中介名片", example = "0000000001", dataType="varchar(255)", required = true )
    private String card;

	@NotNull
	@NotBlank
	@Length(max=255,min=0,message="中介名片地址不能超出255位")
	@ApiModelProperty(value = "中介名片地址", example = "0000000001", dataType="varchar(255)", required = true )
    private String picture;

	@NotNull
	@NotBlank
	@Length(max=19,min=0,message="当前快速成交价不能超出19位")
	@ApiModelProperty(value = "当前快速成交价", example = "1000000", dataType="varchar(19)", required = true )
    private String fastprice;

	@NotNull
	@NotBlank
	@Length(max=19,min=0,message="抵押物id不能超出19位")
	@ApiModelProperty(value = "抵押物id", example = "0000000001", dataType="varchar(19)", required = true )
    private String mortgageid;

	@NotNull
	@NotBlank
	@Length(max=19,min=0,message="实地挂盘价不能超出19位")
	@ApiModelProperty(value = "实地挂盘价", example = "1000000", dataType="varchar(19)", required = true )
    private String realprice;

	@ApiModelProperty(value = "实地挂盘价图片地址", example = "", dataType="varchar(255)", required = true )
    private String realpriceprice;

	@ApiModelProperty(value = "房产评估单价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal houseunitprice;

	@ApiModelProperty(value = "房产评估总价", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal housetotalprice;
}
