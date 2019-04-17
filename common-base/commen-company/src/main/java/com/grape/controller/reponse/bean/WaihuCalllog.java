package com.grape.controller.reponse.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class WaihuCalllog {
	
	@ApiModelProperty(value="客户类型",required=true)
	private String customer_type;
	@ApiModelProperty(value="客户姓名",required=true)
	private String customer_name;
	@ApiModelProperty(value="客户电话",required=true)
	private String customer_number;
	@ApiModelProperty(value="归属地",required=true)
	private String mobile_area;
	@ApiModelProperty(value="通话类型，“呼入”或“呼出”",required=true)
	private String call_type;
	@ApiModelProperty(value="通话方式，“ip座机”或“手机”",required=true)
	private String seat_type;
	@ApiModelProperty(value="通话结果，“接通”、“客户未接通”或“客服未接通”",required=true)
	private String result;
	@ApiModelProperty(value="会话时长",required=true)
	private int duration;
	@ApiModelProperty(value="通话录音文件地址",required=true)
	private String record_url;
	@ApiModelProperty(value="客户评价，“满意”、“不满意”、“未评价”或“无需评价”",required=true)
	private String satisfic;
	@ApiModelProperty(value="拨号时间",required=true)
	private Date start_time;
	@ApiModelProperty(value="客服姓名",required=true)
	private String agent_name;
	@ApiModelProperty(value="客服邮箱",required=true)
	private String agent_email;
	@ApiModelProperty(value="响铃时间",required=true)
	private String ringing_duration;
	@ApiModelProperty(value="挂断时间",required=true)
	private Date end_time;
	@ApiModelProperty(value="客户id",required=true)
	private int customer_id;
	@ApiModelProperty(value="业务记录id",required=true)
	private int note_id;
	@ApiModelProperty(value="中继号",required=true)
	private String trunk_number;
	@ApiModelProperty(value="来源",required=true)
	private String call_source;
	@ApiModelProperty(value="排队状态",required=true)
	private String query_type;
	@ApiModelProperty(value="排队耗时",required=true)
	private int query_time;
	@ApiModelProperty(value="留言",required=true)
	private String leave_message;
	@ApiModelProperty(value="通话挂断方",required=true)
	private String drop_side;
}
