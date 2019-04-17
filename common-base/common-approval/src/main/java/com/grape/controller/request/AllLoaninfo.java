package com.grape.controller.request;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Doctask;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Otherapplyinfo;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.Scoreresult;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllLoaninfo {
	
	@ApiModelProperty(value = "流水编号", example = "", dataType="varchar(10)", required = true )
    private String workid;
	
	@ApiModelProperty(value = "城市", example = "", dataType="varchar(19)", required = true )
    private String areaname;

	@ApiModelProperty(value = "渠道方", example = "", dataType="varchar(6)", required = true )
    private String organizationname;
	
	@ApiModelProperty(value = "产品", example = "", dataType="varchar(6)", required = true )
    private String productname;
	
	@ApiModelProperty(value = "产品码", example = "", dataType="varchar(6)", required = true )
    private String productno;
	
	@ApiModelProperty(value = "业务类型", example = "", dataType="varchar(6)", required = true )
    private String producttype;
	
	@ApiModelProperty(value = "业务类型名称", example = "", dataType="varchar(6)", required = true )
    private String producttypename;
	
	@ApiModelProperty(value = "主办", example = "", dataType="", required = true )
    private String workername;
	
	@ApiModelProperty(value = "期待贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal expectapplyamount;

	@ApiModelProperty(value = "期望申请利率", example = "", dataType="decimal(8,5)", required = true )
    private BigDecimal expectapplyrate;

	@ApiModelProperty(value = "期望申请年限", example = "", dataType="varchar(4)", required = true )
    private String expectapplyyear;

	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(20)", required = true )
    private String repaymethod;
	
	@ApiModelProperty(value="利率类型",example="")
	private String Ratetype;

/*	@ApiModelProperty(value = "月供金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal monthamount;*/
	
	@ApiModelProperty(value = "借款用途说明", example = "", dataType="varchar(4)", required = true )
    private String usageofloan;

	@ApiModelProperty(value = "用款计划说明", example = "", dataType="varchar(200)", required = true )
    private String usageloanplan;

	@ApiModelProperty(value = "还款来源说明", example = "", dataType="varchar(4)", required = true )
    private String repaysource;

	@ApiModelProperty(value = "还款计划说明", example = "", dataType="varchar(200)", required = true )
    private String repayplan;
	
	@ApiModelProperty(value = "打划款账户名", example = "", dataType="varchar(80)", required = true )
    private String accountname;

	@ApiModelProperty(value = "打划款账户", example = "", dataType="varchar(19)", required = true )
    private String account;

	@ApiModelProperty(value = "打划款开户行", example = "", dataType="varchar(80)", required = true )
    private String bnk;
	
	@ApiModelProperty(value = "评级", example = "", dataType="", required = true )
    private String level;
	
	@ApiModelProperty(value = "还款方式", example = "", dataType="varchar(32)", required = true )
    private String repaymethod1;

	@ApiModelProperty(value = "批复机构", example = "", dataType="varchar(20)", required = true )
    private String batchorg;

	@ApiModelProperty(value = "批复金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal sumofamount;

	@ApiModelProperty(value = "批复利率", example = "", dataType="decimal(9,6)", required = true )
    private BigDecimal interestrate;

	@ApiModelProperty(value = "贷款期限", example = "", dataType="varchar(4)", required = true )
    private String loanlimittime;
	
	@ApiModelProperty(value = "贷款用途", example = "", dataType="varchar(200)", required = true )
    private String useofloan;
	
	@ApiModelProperty(value = "合同编号", example = "", dataType="varchar(200)", required = true )
    private String contractno;

	@ApiModelProperty(value = "审批成数", example = "", required = true)
    private BigDecimal cvs;
	
	@ApiModelProperty(value = "剩余本金（元）", example = "", required = true)
    private BigDecimal loanbalance;
	
	@ApiModelProperty(value = "剩余贷款期限", example = "", required = true)
    private Long remainingdays ;
	
	@ApiModelProperty(value = "应还款日期", example = "", required = true)
    private Date nextrepaydate;
	
	@ApiModelProperty(value = "还款账户名", example = "", dataType="varchar(80)", required = true )
    private String repayaccountname;
	
	@ApiModelProperty(value = "还款账号", example = "", dataType="varchar(19)", required = true )
    private String repayaccount;
	
	@ApiModelProperty(value = "首次放款日", example = "", dataType="datetime", required = true )
    private Date firstloandate;

	@ApiModelProperty(value = "结清日期", example = "", dataType="datetime", required = true )
    private Date settledate;

	@ApiModelProperty(value = "贷款到期日", example = "", dataType="datetime", required = true )
    private Date maturitydate;
	
	@ApiModelProperty(value = "申请日期", example = "", dataType="datetime", required = true )
    private Date applydate;

	@ApiModelProperty(value = "还款开户行", example = "", dataType="varchar(120)", required = true )
    private String repayaccountbnk;
	
	@ApiModelProperty(value = "期待总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal extotaluseamount;

	@ApiModelProperty(value = "期待总授信期限", example = "", dataType="varchar(4)", required = true )
    private String extotaluseterm;
	
	@ApiModelProperty(value = "总授信期限", example = "", dataType="varchar(4)", required = true )
    private String totaluseterm;

	@ApiModelProperty(value = "总授信金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal totaluseamount;
	
	@ApiModelProperty(value = "原贷款银行", example = "", dataType="varchar(80)", required = true )
    private String beloanbank;

	@ApiModelProperty(value = "新贷款银行", example = "", dataType="varchar(80)", required = true )
    private String newloanbank;

	@ApiModelProperty(value = "原贷款金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal applyamount;

	@ApiModelProperty(value = "新批复金额", example = "", dataType="decimal(17,5)", required = true )
    private BigDecimal osumofamount;

	@ApiModelProperty(value = "赎楼账户名", example = "", dataType="varchar(80)", required = true )
    private String redemaccountname;

	@ApiModelProperty(value = "回款账户名", example = "", dataType="varchar(80)", required = true )
    private String orepayaccountname;

	@ApiModelProperty(value = "赎楼账号", example = "", dataType="varchar(19)", required = true )
    private String redemaccount;

	@ApiModelProperty(value = "回款账号", example = "", dataType="varchar(19)", required = true )
    private String orepayaccount;

	@ApiModelProperty(value = "回款开户行", example = "", dataType="varchar(120)", required = true )
    private String orepayaccountbnk;

	@ApiModelProperty(value = "赎楼开户行", example = "", dataType="varchar(120)", required = true )
    private String redemccountbnk;

	@ApiModelProperty(value = "是否第三方回款", example = "", dataType="varchar(1)", required = true )
    private String isthirdpartyrepay;

	@ApiModelProperty(value = "是否第三方赎楼", example = "", dataType="varchar(1)", required = true )
    private String isthirdpartyredem;

	@ApiModelProperty(value = "赎楼方案情况说明", example = "", dataType="varchar(600)", required = true )
    private String redemdescription;
}
