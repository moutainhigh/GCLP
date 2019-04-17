package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
public class RefundmentRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=30,min=0,message="其他已收款项不能超出30位")
	@ApiModelProperty(value = "其他已收款项", example = "", dataType="varchar(30)", required = true )
    private String otherrece;

	@Length(max=30,min=0,message="已收款项不能超出30位")
	@ApiModelProperty(value = "已收款项", example = "", dataType="varchar(30)", required = true )
    private List<String> receivablesList;

	@Length(max=30,min=0,message="退款类型不能超出30位")
	@ApiModelProperty(value = "退款类型", example = "", dataType="varchar(30)", required = true )
    private List<String> refundtypeList;

	@ApiModelProperty(value = "已收款项", example = "", dataType="varchar(30)", required = true )
    private String receivables;

	@ApiModelProperty(value = "付款时间", example = "", dataType="datetime", required = true )
    private Date paydate;

	@ApiModelProperty(value = "其他退款类型", example = "", dataType="varchar(30)", required = true )
    private String otherrefundtype;

	@ApiModelProperty(value = "退款类型", example = "", dataType="varchar(30)", required = true )
    private String refundtype;

	@ApiModelProperty(value = "应扣除", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal removeamount;

	@ApiModelProperty(value = "提前还款利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestrepayment;

	@ApiModelProperty(value = "渠道单笔保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal channelsinglebond;

	@ApiModelProperty(value = "其他应退金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal otheramounts;

	@ApiModelProperty(value = "结清时间", example = "", dataType="datetime", required = true )
    private Date cleardate;

	@ApiModelProperty(value = "预缴利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal prepaidinterest;

	@ApiModelProperty(value = "渠道报价利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal chanquotationrate;

	@ApiModelProperty(value = "我司实收利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal comrealrate;

	@ApiModelProperty(value = "每个月代收利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal monthrate;

	@ApiModelProperty(value = "借款期限", example = "", dataType="varchar(4)", required = true )
    private String borrowterm;

	@ApiModelProperty(value = "应返还渠道利差", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal backchanamount;

	@ApiModelProperty(value = "实际返还", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal realbackamount;

	@ApiModelProperty(value = "退款账户开户行", example = "", dataType="varchar(80)", required = true )
    private String backaccountbnk;

	@ApiModelProperty(value = "退款账户姓名", example = "", dataType="varchar(80)", required = true )
    private String backaccountname;

	@ApiModelProperty(value = "退款账号", example = "", dataType="varchar(19)", required = true )
    private String refundaccount;

	@ApiModelProperty(value = "退款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal refundamount;

	@ApiModelProperty(value = "出款前应收费合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal chargesbefore;

	@ApiModelProperty(value = "客户预交利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal custprepaidinterest;

	@ApiModelProperty(value = "实际使用天数", example = "", dataType="varchar(5)", required = true )
    private String actualdays;

	@ApiModelProperty(value = "应收利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestreceivable;

	@ApiModelProperty(value = "是否有渠道单笔保证金", example = "", dataType="char(1)", required = true )
    private String havechandeposit;
	
	@ApiModelProperty(value = "付款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal payamount;

	@ApiModelProperty(value = "应退金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal backamount;

	@ApiModelProperty(value = "放款日期", example = "", dataType="datetime", required = true )
    private Date outloandate;

	@ApiModelProperty(value = "回款日期", example = "", dataType="datetime", required = true )
    private Date backloandate;

	@ApiModelProperty(value = "借款利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal borrowrate;

	@ApiModelProperty(value = "预缴天数", example = "", dataType="varchar(10)", required = true )
    private String pretakeday;

	@ApiModelProperty(value = "应退利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal shouldbackamount;
	
	@ApiModelProperty(value = "操作", example = "save", dataType="varchar(4)", required = true )
	private String operation;
	
	@ApiModelProperty(value = "处理人", example = "12345678", dataType="varchar(4)", required = true )
	private String userid;
	
	@ApiModelProperty(value = "下一节点审批人", example = "12345678", dataType="varchar(4)", required = true )
	private String nextactor;
	
	@ApiModelProperty(value = "节点", example = "PRD00401", dataType="varchar(4)", required = true )
	private String nodeid;
	
	@ApiModelProperty(value = "备注", example = "", dataType="varchar(300)", required = true )
    private String remark;
	
	@ApiModelProperty(value = "他项权证", example = "", dataType="varchar(300)", required = true )
    private List<ImageBean> imagelist;

}
