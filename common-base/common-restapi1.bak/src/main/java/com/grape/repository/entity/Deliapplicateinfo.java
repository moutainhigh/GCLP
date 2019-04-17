package com.grape.repository.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Table(name = "deliapplicateinfo")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class Deliapplicateinfo {//尽调申请人信息表

	@Id
	@Column(name = "id", nullable = false, length = 19)
	private String id;//主键ID

	@Column(name = "workid", nullable = true, length = 10)
	private String workid;//流水编号

	@Column(name = "borrower", nullable = true, length = 80)
	private String borrower;//借款人名称

	@Column(name = "relationcustno", nullable = true, length = 10)
	private String relationcustno;//关联客户编号

	@Column(name = "cerdid", nullable = true, length = 32)
	private String cerdid;//借款人身份证号

	@Column(name = "isserioussick", nullable = true, length = 1)
	private String isserioussick;//借款人是否有重大疾病

	@Column(name = "isbadhabbit", nullable = true, length = 1)
	private String isbadhabbit;//借款人是否有赌博、吸毒、涉黑、诈骗等不良嗜好

	@Column(name = "iscriminalrecord", nullable = true, length = 1)
	private String iscriminalrecord;//借款人是否存在历史犯罪记录

	@Column(name = "isdivorce", nullable = true, length = 1)
	private String isdivorce;//是否存在离婚协议未明确本抵押物的分配

	@Column(name = "isunmarried", nullable = true, length = 1)
	private String isunmarried;//是否为未婚或单身情形，需核实婚姻状况

	@Column(name = "isshammarriage", nullable = true, length = 1)
	private String isshammarriage;//是否存在“假离婚”分割财产，逃避债务的嫌疑

	@Column(name = "isdubiousmarriage", nullable = true, length = 1)
	private String isdubiousmarriage;//为规避夫妻做共同借款人，是否存在可疑的婚姻证明

	@Column(name = "reasonofoverdue", nullable = true, length = 300)
	private String reasonofoverdue;//了解当前逾期原因

	@Column(name = "badinforeason", nullable = true, length = 300)
	private String badinforeason;//了解冻结、止付、呆滞、代偿等不良信息的原因

	@Column(name = "isunableproven", nullable = true, length = 1)
	private String isunableproven;//是否存在客户口述已结案，但无法提供结案证明及付款凭证

	@Column(name = "isfalsecase", nullable = true, length = 1)
	private String isfalsecase;//是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态

	@Column(name = "isunfulfilleddebt", nullable = true, length = 1)
	private String isunfulfilleddebt;//是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行

	@Column(name = "isenforcedlitigation", nullable = true, length = 1)
	private String isenforcedlitigation;//产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼

	@Column(name = "iskeepoutjob", nullable = true, length = 1)
	private String iskeepoutjob;//是否属于公、检、法、军人、同行等禁入职业

	@Column(name = "isprudentindustry", nullable = true, length = 1)
	private String isprudentindustry;//是否涉及地产、民间金融、钢贸等谨慎行业

	@Column(name = "ishignriskbehavior", nullable = true, length = 1)
	private String ishignriskbehavior;//借款用途是否涉及炒房、炒股、民间借贷等高风险行为

	@Column(name = "chgdt", nullable = true)
	private Date chgdt;//最后修改时间

	@Column(name = "chgtl", nullable = true, length = 8)
	private String chgtl;//最后修改人

}