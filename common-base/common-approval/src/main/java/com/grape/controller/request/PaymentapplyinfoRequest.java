package com.grape.controller.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.model.db.Groommortgage;

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
public class PaymentapplyinfoRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=10,min=0,message="申请编号不能超出10位")
	@ApiModelProperty(value = "申请编号", example = "", dataType="varchar(10)", required = true )
    private String workid;

	@ApiModelProperty(value = "放款类型", example = "", dataType="char(1)", required = true )
    private String loantype;

	@ApiModelProperty(value = "出款申请时间", example = "", dataType="datetime", required = true )
    private Date applicationtime;

	@ApiModelProperty(value = "担保费利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal examinationrate;

	@ApiModelProperty(value = "出库前应收费用合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totalfee;

	@ApiModelProperty(value = "各个合同是否已签署正确情况说明（已删除）", example = "", dataType="varchar(300)", required = true )
    private String statesignnote;

	@ApiModelProperty(value = "各个合同是否已签署正确（已删除）", example = "", dataType="char(1)", required = true )
    private String statesignflg;

	@ApiModelProperty(value = "各类合同是否正确签署情况说明", example = "", dataType="varchar(300)", required = true )
    private String pactsignnote;

	@ApiModelProperty(value = "各类合同是否正确签署", example = "", dataType="char(1)", required = true )
    private String pactsignflg;

	@ApiModelProperty(value = "《债权回购承诺函 》和《推荐函》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String debtbacknote;

	@ApiModelProperty(value = "《债权回购承诺函 》是否收取", example = "", dataType="char(1)", required = true )
    private String debtbackflg;

	@ApiModelProperty(value = "《提前放款申请书》和《推荐函》是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String priloanapplynote;

	@ApiModelProperty(value = "《提前放款申请书》是否收取", example = "", dataType="char(1)", required = true )
    private String priloanapplyflg;

	@ApiModelProperty(value = "渠道保证金是否收取", example = "", dataType="varchar(300)", required = true )
    private String chanpromisenote;

	@ApiModelProperty(value = "渠道保证金是否收取", example = "", dataType="char(1)", required = true )
    private String chanpromiseflg;

	@ApiModelProperty(value = "《推荐函》是否收取情况说明(已删除）", example = "", dataType="varchar(300)", required = true )
    private String suggesttakenote;

	@ApiModelProperty(value = "《推荐函》是否收取(已删除）", example = "", dataType="char(1)", required = true )
    private String suggesttakeflg;

	@ApiModelProperty(value = "是否有渠道单笔保证金", example = "", dataType="char(1)", required = true )
    private String havechandeposit;

	@ApiModelProperty(value = "单笔保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal singledeposit;

	@ApiModelProperty(value = "单笔保证金录入时间", example = "", dataType="datetime", required = true )
    private Date singledepositdate;

	@ApiModelProperty(value = "渠道单笔保证金", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal channelsinglebond;

	@ApiModelProperty(value = "出款前应收费合计", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal chargesbefore;

	@ApiModelProperty(value = "客户预交利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal custprepaidinterest;

	@ApiModelProperty(value = "实际使用天数", example = "", dataType="varchar(5)", required = true )
    private String actualdays;

	@ApiModelProperty(value = "是否有退款", example = "", dataType="char(1)", required = true )
    private String havebackproc;

	@ApiModelProperty(value = "应收利息", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestreceivable;

	@ApiModelProperty(value = "公证书是否签署，份数是否齐全", example = "", dataType="char(1)", required = true )
    private String notarizationflg;

	@ApiModelProperty(value = "公证书是否收取，分数是否齐全情况说明", example = "", dataType="varchar(300)", required = true )
    private String notarizationnote;

	@ApiModelProperty(value = "回款卡人身份证原件、银行卡及Ukey是否收取", example = "", dataType="char(1)", required = true )
    private String backcardflg;

	@ApiModelProperty(value = "回款卡人身份证原件、银行卡及Ukey是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String backcardnote;

	@ApiModelProperty(value = "赎楼卡人身份证原件、银行卡及Ukey是否收取", example = "", dataType="char(1)", required = true )
    private String redempbuildingflg;

	@ApiModelProperty(value = "赎楼卡人身份证原件、银行卡及Ukey是否收取情况说明", example = "", dataType="varchar(300)", required = true )
    private String redempbuildingnote;

	@ApiModelProperty(value = "出款账号与回款账号是否审核无误", example = "", dataType="char(1)", required = true )
    private String outandinaccountflg;

	@ApiModelProperty(value = "出款账号与回款账号是否审核无误情况说明", example = "", dataType="varchar(300)", required = true )
    private String outandinaccountnote;

	@ApiModelProperty(value = "面签照片（客户正在签约一张，签约完之后手持身份证和借款合同一张）", example = "", dataType="char(1)", required = true )
    private String facesignflg;

	@ApiModelProperty(value = "面签照片（客户正在签约一张，签约完之后手持身份证和借款合同一张）情况说明", example = "", dataType="varchar(300)", required = true )
    private String facesignnote;

	@ApiModelProperty(value = "赎楼账户和回款账户为对公账户，需要收齐企业营业执照、公章、私章、财务章、验支票", example = "", dataType="char(1)", required = true )
    private String publiccardflg;

	@ApiModelProperty(value = "赎楼账户和回款账户为对公账户，需要收齐企业营业执照、公章、私章、财务章、验支票情况说明", example = "", dataType="varchar(300)", required = true )
    private String publiccardnote;
	
	@ApiModelProperty(value = "打划款账户名", example = "", dataType="varchar(300)", required = true )
    private String accountname;

	@ApiModelProperty(value = "打划款账户", example = "", dataType="varchar(19)", required = true )
    private String account;

	@ApiModelProperty(value = "打划款开户行", example = "", dataType="varchar(300)", required = true )
    private String bnk;
	
	@ApiModelProperty(value = "抵押物相关信息", example = "", dataType="", required = true )
    private  List<Groommortgage> groommortgages;
	
	@ApiModelProperty(value = "情况说明", example = "", dataType="varchar(1000)", required = true )
    private String situationsuggest;

	@ApiModelProperty(value = "操作", example = "save", dataType="varchar(4)", required = true )
	private String operation;
	
	@ApiModelProperty(value = "处理人", example = "12345678", dataType="varchar(4)", required = true )
	private String userid;
	
	@ApiModelProperty(value = "下一节点审批人", example = "12345678", dataType="varchar(4)", required = true )
	private String nextactor;
	
	@ApiModelProperty(value = "节点", example = "PRD00401", dataType="varchar(4)", required = true )
	private String nodeid;
	
	@ApiModelProperty(value = "服务费", example = "", dataType="", required = true )
    private BigDecimal servicecharge;
	
	@ApiModelProperty(value = "代理渠道利率", example = "", dataType="", required = true )
    private BigDecimal proxyrate;

    private BigDecimal proxycharge;
    
    @ApiModelProperty(value = "审查费", example = "", dataType="", required = true )
    private BigDecimal examinationfee;
}
