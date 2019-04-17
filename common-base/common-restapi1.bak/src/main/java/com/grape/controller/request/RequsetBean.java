package com.grape.controller.request;
/*package com.grape.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.grape.controller.reponse.RestfulResponse;

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
public class AccountRequset extends RestfulResponse{

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "账户号码", example = "accountno", required = true)
    private String accountno;
	
	@ApiModelProperty(value = "账户名称", example = "accountname", required = true)
    private String accountname;
    
	@ApiModelProperty(value = "账户所属机构", example = "accountorg", required = true)
    private String accountorg;
    
	@ApiModelProperty(value = "账户开户银行", example = "accountbakno", required = true)
    private String accountbakno;
	
	@ApiModelProperty(value = "账户余额", example = "accountremian", required = true)
    private BigDecimal accountremian;
    
	@ApiModelProperty(value = "账户类型", example = "accounttype", required = true)
    private String accounttype;
    
	@ApiModelProperty(value = "是否默认结算账户", example = "balanceaccountflg", required = true)
    private String balanceaccountflg;

	@ApiModelProperty(value = "账户变更权限机构", example = "permitchangeorg", required = true)
    private String permitchangeorg;
    
	@ApiModelProperty(value = "保证金金额", example = "bailamount", required = true)
    private BigDecimal bailamount;

	@ApiModelProperty(value = "冻结保证金金额", example = "freezeamount", required = true)
    private BigDecimal freezeamount;
    
	@ApiModelProperty(value = "放款额度", example = "lenders", required = true)
    private BigDecimal lenders;
    
	@ApiModelProperty(value = "可用额度", example = "usefullimit", required = true)
    private BigDecimal usefullimit;
    
	@ApiModelProperty(value = "贷款余额", example = "loanremian", required = true)
    private BigDecimal loanremian;
    
	@ApiModelProperty(value = "最后修改人", example = "chgtl", required = true)
    private String chgtl;
    
	@ApiModelProperty(value = "最后修改时间", example = "chgdt", required = true)
    private Date chgdt;
    
}
*/