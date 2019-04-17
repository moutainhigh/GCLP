package com.grape.controller.reponse.bean;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class OverduelistBean{
	
	@ApiModelProperty(value = "流水编号", example = "", required = true)
    private String workid;
	
	@ApiModelProperty(value = "产品", example = "", required = true)
    private String productname;
	
	@ApiModelProperty(value = "主借款人", example = "", required = true)
    private String custname;
	
	@ApiModelProperty(value = "共同借款人", example = "", required = true)
    private List<String> coborrower;

	@ApiModelProperty(value = "抵押人", example = "", required = true)
    private List<String> mortgagor;
	
	@ApiModelProperty(value = "应还款时间", example = "", required = true)
    private Timestamp overduedate;
	
	@ApiModelProperty(value = "累计逾期天数", example = "", required = true)
    private Integer addoverduedaynum;
	
	@ApiModelProperty(value = "产品编号", example = "", required = true)
    private String productno;
	
	@ApiModelProperty(value = "流水状态码", example = "", required = true)
    private String nodeid;

	public OverduelistBean(String workid, String productname, String custname,
			Timestamp overduedate, Integer addoverduedaynum, String productno,
			String nodeid) {
		super();
		this.workid = workid;
		this.productname = productname;
		this.custname = custname;
		this.overduedate = overduedate;
		this.addoverduedaynum = addoverduedaynum;
		this.productno = productno;
		this.nodeid = nodeid;
	}
}
