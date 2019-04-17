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
public class ManagementlistBean{
	
	@ApiModelProperty(value = "流水编号", example = "", required = true)
    private String workid;
	
	@ApiModelProperty(value = "城市", example = "", required = true)
    private String areaname;
	
	@ApiModelProperty(value = "渠道", example = "", required = true)
    private String organizationname;
	
	@ApiModelProperty(value = "渠道编号", example = "", required = true)
    private String organizationno;
	
	@ApiModelProperty(value = "业务类型", example = "", required = true)
    private String coddes;
	
	@ApiModelProperty(value = "产品", example = "", required = true)
    private String productname;
	
	@ApiModelProperty(value = "产品编号", example = "", required = true)
    private String productno;
	
	@ApiModelProperty(value = "主借款人", example = "", required = true)
    private String custname;
	
	@ApiModelProperty(value = "共同借款人", example = "", required = true)
    private List<String> coborrower;

	@ApiModelProperty(value = "担保人", example = "", required = true)
    private List<String> guarantor;

	@ApiModelProperty(value = "抵押人", example = "", required = true)
    private List<String> mortgagor;
	
	@ApiModelProperty(value = "房产证编号", example = "", required = true)
    private List<String> houseid;
	
	@ApiModelProperty(value = "申请时间", example = "", required = true)
    private Timestamp applydate;
	
	@ApiModelProperty(value = "是否已读", example = "", required = true)
    private String ishaveread;
	
	@ApiModelProperty(value = "流水状态", example = "", required = true)
    private String nodename;
	
	@ApiModelProperty(value = "流水状态码", example = "", required = true)
    private String nodeid;

	public ManagementlistBean(String workid, String areaname,
			String organizationname,String organizationno, String coddes, String productname,
			String productno, String custname, Timestamp applydate,
			String ishaveread, String nodename, String nodeid) {
		super();
		this.workid = workid;
		this.areaname = areaname;
		this.organizationname = organizationname;
		this.organizationno = organizationno;
		this.coddes = coddes;
		this.productname = productname;
		this.productno = productno;
		this.custname = custname;
		this.applydate = applydate;
		this.ishaveread = ishaveread;
		this.nodename = nodename;
		this.nodeid = nodeid;
	}
}
