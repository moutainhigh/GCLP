package com.grape.controller.request;



import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.grape.controller.response.bean.RiskinfoBean;

import io.swagger.annotations.ApiModelProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PhoneverificationRequest {
	
	
	@NotNull
    @NotEmpty(message = "流水号不能为空")
	@Length(max=10,min=0,message="不能超出10位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=1,min=0,message="婚姻情况是否有异常不能超出1位")
	@ApiModelProperty(value = "婚姻情况是否有异常", example = "", dataType="varchar(1)", required = true )
    private String marriageabnormal;

	@Length(max=2000,min=0,message="婚姻状况异常情况说明不能超出2000位")
	@ApiModelProperty(value = "婚姻状况异常情况说明", example = "", dataType="varchar(2000)", required = true )
    private String marriageabnormalins;

	@Length(max=1,min=0,message="征信情况是否有异常不能超出1位")
	@ApiModelProperty(value = "征信情况是否有异常", example = "", dataType="varchar(1)", required = true )
    private String creditabnormal;

	@Length(max=2000,min=0,message="征信情况异常情况说明不能超出2000位")
	@ApiModelProperty(value = "征信情况异常情况说明", example = "", dataType="varchar(2000)", required = true )
    private String creditabnormalins;

	@Length(max=1,min=0,message="诉讼情况是否有异常不能超出1位")
	@ApiModelProperty(value = "诉讼情况是否有异常", example = "", dataType="varchar(1)", required = true )
    private String litigationabnormal;

	@Length(max=2000,min=0,message="诉讼情况异常情况说明不能超出2000位")
	@ApiModelProperty(value = "诉讼情况异常情况说明", example = "", dataType="varchar(2000)", required = true )
    private String litigationabnormalins;

	@Length(max=40,min=0,message="借款用途不能超出40位")
	@ApiModelProperty(value = "借款用途", example = "", dataType="varchar(40)", required = true )
    private String borrowingpurposes;

	@Length(max=40,min=0,message="不能超出40位")
	@ApiModelProperty(value = "", example = "", dataType="varchar(40)", required = true )
    private String repaymentsource;

	@Length(max=2000,min=0,message="电核其他事项说明不能超出2000位")
	@ApiModelProperty(value = "电核其他事项说明", example = "", dataType="varchar(2000)", required = true )
    private String othermappers;

	@ApiModelProperty(value = "风险列表(传参使用)", example = "", dataType="varchar(2000)", required = true )
    private List<RiskinfoBean> riskinfos;

}
