package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Mortgagerent;

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
public class IncomeinfoRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	@ApiModelProperty(value="申请编号",example="0000000001",required=true)
	private String workid;
	
	@NotNull
	@NotBlank
	@ApiModelProperty(value="身份证号码",example="00000000000000000001",required=true)
	private String cerdid;
	
	@ApiModelProperty(value="近半年其他总收入金额",example="10000",required=true)
	private BigDecimal halfyearreceipt;
	
	@ApiModelProperty(value="近半年月均收入金额",example="100000",required=true)
	private BigDecimal halfyaerincome;
	
	@ApiModelProperty(value="月收入",example="1000",required=true)
	private BigDecimal rentincome;
	
	@Length(max=40,min=0,message="收入情况说明不能超出80位")
	@ApiModelProperty(value = "收入情况说明", example = "", dataType="varchar(80)", required = true )
    private String incomestatement;

	@Length(max=40,min=0,message="")
	@ApiModelProperty(value = "净利润", example = "", dataType="varchar(19)", required = true )
    private String netmargin;
	
	@ApiModelProperty(value="银行流水信息",example="[{'amount':'1,2,3','bnkname':'123','bnkaccount':'123'},{'amount':'1,2,3','bnkname':'123','bnkaccount':'123'}]",required=true)
	private List<BnkIncomeRequest> list;
	
	private List<Mortgagerent> mortgagelist;
	
}
