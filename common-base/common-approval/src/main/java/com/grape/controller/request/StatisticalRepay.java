package com.grape.controller.request;

import java.math.BigDecimal;
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
public class StatisticalRepay extends RestfulRequest{
	private static final long serialVersionUID = 1L;

	//****************************************
	@Length(max=17,min=0,message="展期差额")
	@ApiModelProperty(value = "展期差额", example = "", dataType="decimal(17,5)", required = true )
	private BigDecimal Spread ;
	
	@ApiModelProperty(value = "剩余天数", example = "", required = true)
    private Integer reminddays;
	
	@ApiModelProperty(value = "已还本金", example = "", required = true)
    private BigDecimal refundmoneySum;
	
	@ApiModelProperty(value = "已还利息", example = "", required = true)
    private BigDecimal refundinterestSum;
	
	@ApiModelProperty(value = "应缴罚息", example = "", required = true)
    private BigDecimal penaltIinterestSum;
	
	@ApiModelProperty(value = "已缴滞纳金", example = "", required = true)
    private BigDecimal rdelayingSum;
	
	@ApiModelProperty(value = "已缴违约金", example = "", required = true)
    private BigDecimal breachofcontractSum;
	
	@ApiModelProperty(value = "欠缴本金", example = "", required = true)
    private BigDecimal overduecorpusSum;
	
	@ApiModelProperty(value = "欠缴利息", example = "", required = true)
    private BigDecimal overdueaccrualSum;
	
	@ApiModelProperty(value = "欠缴罚息", example = "", required = true)
    private BigDecimal defaultinterestSum;
	
	@ApiModelProperty(value = "欠缴滞纳金", example = "", required = true)
    private BigDecimal odelayingSum;
	
	@ApiModelProperty(value = "当前提前还款违约金", example = "", required = true)
    private BigDecimal breachOfContract;
	
	@ApiModelProperty(value = "累计逾期天数", example = "", required = true)
    private Integer addoverduedaynum;
	
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
}
