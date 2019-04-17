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
public class IncomeofcomRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value="申请编号",example="0000000001",required=true)
	private String workid;
	
	@Length(max=20,min=0,message="企业统一信用编号不能超出20位")
	@ApiModelProperty(value="企业统一信用编号",example="0000000000001",required=true,dataType="varchar(1)")
	private String comno;
	
	@Length(max=200,min=0,message="其他收入证明不能超出200位")
	@ApiModelProperty(value="其他收入证明",example="无",required=true)
	private String otherincome;
	
	@Length(max=200,min=0,message="收入情况说明不能超出200位")
	@ApiModelProperty(value="收入情况说明",example="无",required=true)
	private String incomeexplain;
	

}
