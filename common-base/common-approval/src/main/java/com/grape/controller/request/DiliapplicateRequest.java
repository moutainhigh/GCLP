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
public class DiliapplicateRequest extends RestfulRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(max=32,min=0,message="借款人身份证号不能超出32位")
	@ApiModelProperty(value = "借款人身份证号", example = "360721989999999999", dataType="varchar(32)", required = true )
    private String cerdid;

	@Length(max=10,min=0,message="流水编号不能超出10位")
	@ApiModelProperty(value = "流水编号", example = "0000000008", dataType="varchar(10)", required = true )
    private String workid;

	@Length(max=80,min=0,message="借款人名称不能超出80位")
	@ApiModelProperty(value = "借款人名称", example = "李四", dataType="varchar(80)", required = true )
    private String borrower;

	@Length(max=1,min=0,message="借款人是否有重大疾病不能超出1位")
	@ApiModelProperty(value = "借款人是否有重大疾病", example = "N", dataType="char(1)", required = true )
    private String isserioussick;

	@Length(max=300,min=0,message="重大疾病情况说明不能超出300位")
	@ApiModelProperty(value = "重大疾病情况说明", example = "", dataType="varchar(300)", required = true )
    private String sicknotes;

	@Length(max=1,min=0,message="借款人是否有赌博、吸毒、涉黑、诈骗等不良嗜好不能超出1位")
	@ApiModelProperty(value = "借款人是否有赌博、吸毒、涉黑、诈骗等不良嗜好", example = "N", dataType="char(1)", required = true )
    private String isbadhabbit;

	@Length(max=300,min=0,message="不良嗜好情况说明不能超出300位")
	@ApiModelProperty(value = "不良嗜好情况说明", example = "", dataType="varchar(300)", required = true )
    private String badhabbitnotes;

	@Length(max=1,min=0,message="借款人是否存在历史犯罪记录不能超出1位")
	@ApiModelProperty(value = "借款人是否存在历史犯罪记录", example = "N", dataType="char(1)", required = true )
    private String iscriminalrecord;

	@Length(max=300,min=0,message="犯罪情况说明不能超出300位")
	@ApiModelProperty(value = "犯罪情况说明", example = "", dataType="varchar(300)", required = true )
    private String criminalnotes;

	@Length(max=1,min=0,message="是否存在离婚协议未明确本抵押物的分配不能超出1位")
	@ApiModelProperty(value = "是否存在离婚协议未明确本抵押物的分配", example = "N", dataType="char(1)", required = true )
    private String isdivorce;

	@Length(max=300,min=0,message="是否存在离婚协议未明确本抵押物的分配情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在离婚协议未明确本抵押物的分配情况说明", example = "", dataType="varchar(300)", required = true )
    private String divorcenotes;

	@Length(max=1,min=0,message="是否为未婚或单身情形，需核实婚姻状况不能超出1位")
	@ApiModelProperty(value = "是否为未婚或单身情形，需核实婚姻状况", example = "N", dataType="char(1)", required = true )
    private String isunmarried;

	@Length(max=300,min=0,message="是否为未婚或单身情形，需核实婚姻状况情况说明不能超出300位")
	@ApiModelProperty(value = "是否为未婚或单身情形，需核实婚姻状况情况说明", example = "", dataType="varchar(300)", required = true )
    private String isunmarriednotes;

	@Length(max=1,min=0,message="是否存在“假离婚”分割财产，逃避债务的嫌疑不能超出1位")
	@ApiModelProperty(value = "是否存在“假离婚”分割财产，逃避债务的嫌疑", example = "N", dataType="char(1)", required = true )
    private String isshammarriage;

	@Length(max=300,min=0,message="是否存在“假离婚”分割财产，逃避债务的嫌疑情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在“假离婚”分割财产，逃避债务的嫌疑情况说明", example = "", dataType="varchar(300)", required = true )
    private String isshammarriagenotes;

	@Length(max=1,min=0,message="为规避夫妻做共同借款人，是否存在可疑的婚姻证明不能超出1位")
	@ApiModelProperty(value = "为规避夫妻做共同借款人，是否存在可疑的婚姻证明", example = "N", dataType="char(1)", required = true )
    private String isdubiousmarriage;

	@Length(max=300,min=0,message="为规避夫妻做共同借款人，是否存在可疑的婚姻证明情况说明不能超出300位")
	@ApiModelProperty(value = "为规避夫妻做共同借款人，是否存在可疑的婚姻证明情况说明", example = "", dataType="varchar(300)", required = true )
    private String isdubiousmarriagenotes;

	@Length(max=300,min=0,message="了解贷款逾期原因不能超出300位")
	@ApiModelProperty(value = "了解贷款逾期原因", example = "无", dataType="varchar(300)", required = true )
    private String reasonofoverdue;

	@Length(max=300,min=0,message="贷款冻结、止付、呆滞、代偿等不良信息的原因不能超出300位")
	@ApiModelProperty(value = "贷款冻结、止付、呆滞、代偿等不良信息的原因", example = "无", dataType="varchar(300)", required = true )
    private String badinforeason;

	@Length(max=300,min=0,message="信用卡冻结、止付、呆滞、代偿等不良信息的原因不能超出300位")
	@ApiModelProperty(value = "信用卡冻结、止付、呆滞、代偿等不良信息的原因", example = "无", dataType="varchar(300)", required = true )
    private String badinfocreditreason;

	@Length(max=300,min=0,message="信用卡逾期原因不能超出300位")
	@ApiModelProperty(value = "信用卡逾期原因", example = "无", dataType="varchar(300)", required = true )
    private String reasonofcreditoverdue;

	@Length(max=300,min=0,message="是否存在客户口述已结案，但无法提供结案证明及付款凭证情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在客户口述已结案，但无法提供结案证明及付款凭证情况说明", example = "无", dataType="varchar(300)", required = true )
    private String isunableprovennotes;

	@Length(max=1,min=0,message="是否存在客户口述已结案，但无法提供结案证明及付款凭证不能超出1位")
	@ApiModelProperty(value = "是否存在客户口述已结案，但无法提供结案证明及付款凭证", example = "N", dataType="char(1)", required = true )
    private String isunableproven;

	@Length(max=300,min=0,message="是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态情况说明", example = "", dataType="varchar(300)", required = true )
    private String isfalsecasenotes;

	@Length(max=1,min=0,message="是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态不能超出1位")
	@ApiModelProperty(value = "是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态", example = "N", dataType="char(1)", required = true )
    private String isfalsecase;

	@Length(max=300,min=0,message="是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行情况说明不能超出300位")
	@ApiModelProperty(value = "是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行情况说明", example = "", dataType="varchar(300)", required = true )
    private String isunfulfilleddebtnotes;

	@Length(max=1,min=0,message="是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行不能超出1位")
	@ApiModelProperty(value = "是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行", example = "N", dataType="char(1)", required = true )
    private String isunfulfilleddebt;

	@Length(max=300,min=0,message="产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String isenforcedlitigationnotes;

	@Length(max=1,min=0,message="产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼不能超出1位")
	@ApiModelProperty(value = "产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼", example = "N", dataType="char(1)", required = true )
    private String isenforcedlitigation;

	@Length(max=300,min=0,message="是否属于公、检、法、军人、同行等禁入职业情况说明不能超出300位")
	@ApiModelProperty(value = "是否属于公、检、法、军人、同行等禁入职业情况说明", example = "", dataType="varchar(300)", required = true )
    private String iskeepoutjobnotes;

	@Length(max=1,min=0,message="是否属于公、检、法、军人、同行等禁入职业不能超出1位")
	@ApiModelProperty(value = "是否属于公、检、法、军人、同行等禁入职业", example = "N", dataType="char(1)", required = true )
    private String iskeepoutjob;

	@Length(max=300,min=0,message="是否涉及地产、民间金融、钢贸等谨慎行业情况说明不能超出300位")
	@ApiModelProperty(value = "是否涉及地产、民间金融、钢贸等谨慎行业情况说明", example = "", dataType="varchar(300)", required = true )
    private String isprudentindustrynotes;

	@Length(max=1,min=0,message="是否涉及地产、民间金融、钢贸等谨慎行业不能超出1位")
	@ApiModelProperty(value = "是否涉及地产、民间金融、钢贸等谨慎行业", example = "N", dataType="char(1)", required = true )
    private String isprudentindustry;

	@Length(max=300,min=0,message="借款用途是否涉及炒房、炒股、民间借贷等高风险行为情况说明不能超出300位")
	@ApiModelProperty(value = "借款用途是否涉及炒房、炒股、民间借贷等高风险行为情况说明", example = "", dataType="varchar(300)", required = true )
    private String ishignriskbehaviornotes;

	@Length(max=1,min=0,message="借款用途是否涉及炒房、炒股、民间借贷等高风险行为不能超出1位")
	@ApiModelProperty(value = "借款用途是否涉及炒房、炒股、民间借贷等高风险行为", example = "N", dataType="char(1)", required = true )
    private String ishignriskbehavior;

	@Length(max=300,min=0,message="特别注意事项调查意见不能超出300位")
	@ApiModelProperty(value = "特别注意事项调查意见", example = "", dataType="varchar(300)", required = true )
    private String specialnotes;
	
	@Length(max=300,min=0,message="控股公司是否有被执行诉讼情况说明不能超出300位")
	@ApiModelProperty(value = "控股公司是否有被执行诉讼情况说明", example = "", dataType="varchar(300)", required = true )
    private String iiscomcreditigationnote;

	@Length(max=1,min=0,message="控股公司是否有被执行诉讼不能超出1位")
	@ApiModelProperty(value = "控股公司是否有被执行诉讼", example = "", dataType="char(1)", required = true )
    private String iiscomcreditigation;
}
