package com.grape.controller.request;

import java.math.BigDecimal;

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
public class LitigationinfoRequest extends RestfulRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=32,min=0,message="身份证号码不能超出32位")
	@ApiModelProperty(value = "身份证号码", example = "", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=2,min=0,message="查询诉讼记录网站类型不能超出2位")
	@ApiModelProperty(value = "查询诉讼记录网站类型", example = "", dataType="varchar(2)", required = true )
    private String querytype;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="借款人是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "借款人是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String isborrlitigation;

	@Length(max=1,min=0,message="公司是否有诉讼记录不能超出1位")
	@ApiModelProperty(value = "公司是否有诉讼记录", example = "", dataType="char(1)", required = true )
    private String iscomlitigation;

	@Length(max=10,min=0,message="诉讼状态不能超出10位")
	@ApiModelProperty(value = "诉讼状态", example = "", dataType="varchar(10)", required = true )
    private String litigationstate;

	@Length(max=17,min=0,message="标的金额不能超出17位")
	@ApiModelProperty(value = "标的金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal targetamount;

	@Length(max=10,min=0,message="诉讼类型不能超出10位")
	@ApiModelProperty(value = "诉讼类型", example = "", dataType="varchar(10)", required = true )
    private String litigationtype;

	@Length(max=1,min=0,message="是否是失信人不能超出1位")
	@ApiModelProperty(value = "是否是失信人", example = "", dataType="char(1)", required = true )
    private String isdishonest;

	@Length(max=300,min=0,message="诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String litigationexplain;

	@Length(max=80,min=0,message="图片存储名称不能超出80位")
	@ApiModelProperty(value = "图片存储名称", example = "", dataType="varchar(80)", required = true )
    private String imagename;
}
