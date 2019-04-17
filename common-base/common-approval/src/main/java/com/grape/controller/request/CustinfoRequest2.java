package com.grape.controller.request;

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
public class CustinfoRequest2 extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotBlank
	@Length(max=10,min=0,message="申请编号不能超出10位")
    @ApiModelProperty(value = "申请编号", example = "0000000001", required = true)
    private String workid;
	
	@NotNull
	@NotBlank
	@Length(max=32,min=0,message="身份证号不能超出32位")
    @ApiModelProperty(value = "身份证号", example = "787897878978", required = true)
    private String cerdid;
	
	@Length(max=4,min=0,message="客户类型不能超出4位")
    @ApiModelProperty(value = "客户类型", example = "1", required = true)
    private String custtype;
	
	@Length(max=80,min=0,message="籍贯所属省份不能超出80位")
	@ApiModelProperty(value = "籍贯所属省份", example = "1", dataType="varchar(80)", required = true )
    private String nativeplaceprovince;

	@Length(max=80,min=0,message="籍贯所属城市不能超出80位")
	@ApiModelProperty(value = "籍贯所属城市", example = "1", dataType="varchar(80)", required = true )
    private String nativeplacecity;
	
    @ApiModelProperty(value = "离婚时间", example = "2019-09-09", required = true)
    private Date discoverdate;
	
	@Length(max=2,min=0,message="离婚协议书不能超出2位")
    @ApiModelProperty(value = "离婚协议书", example = "1", required = true)
    private String discoversign;
	
	@Length(max=300,min=0,message="财产分配履行情况不能超出300位")
    @ApiModelProperty(value = "财产分配履行情况", example = "履行良好", required = true)
    private String estatedescription;
	
	@Length(max=1,min=0,message="是否有子女不能超出1位")
    @ApiModelProperty(value = "是否有子女", example = "Y", required = true)
    private String havachildflg;
	
	@Length(max=2,min=0,message="子女个数不能超出2位")
    @ApiModelProperty(value = "子女个数", example = "2", required = true)
    private String childcount;
	
	@Length(max=300,min=0,message="子女情况说明不能超出300位")
    @ApiModelProperty(value = "子女情况说明", example = "无", required = true)
    private String childdescription;
	
	@Length(max=1,min=0,message="是否从事高危行业不能超出1位")
    @ApiModelProperty(value = "是否从事高危行业", example = "Y", required = true)
    private String dangerjob;
	
	@ApiModelProperty(value = "与主借款人关系", example = "Y", required = true)
    private String relationship;
	

}
