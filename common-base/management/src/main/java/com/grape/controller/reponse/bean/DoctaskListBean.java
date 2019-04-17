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

/**
 * @描述 流水封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 15:06
 */
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class DoctaskListBean {

    @ApiModelProperty(value = "流水编号", example = "", required = true)
    private String workid;

    @ApiModelProperty(value = "城市", example = "", required = true)
    private String areaname;

    @ApiModelProperty(value = "渠道编号", example = "", required = true)
    private String organizationno;

    @ApiModelProperty(value = "渠道名称", example = "", required = true)
    private String organizationname;

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

    @ApiModelProperty(value = "流水状态名", example = "", required = true)
    private String nodename;

    @ApiModelProperty(value = "流水状态码", example = "", required = true)
    private String nodeid;
	
	@ApiModelProperty(value = "待办已办标识", example = "", required = true)
    private String processflg;

    public DoctaskListBean(String workid, String areaname, String organizationno,
                           String organizationname, String coddes, String productname,
                           String productno, String custname, Timestamp applydate,
                           String nodename, String nodeid) {
        super();
        this.workid = workid;
        this.areaname = areaname;
        this.organizationno = organizationno;
        this.organizationname = organizationname;
        this.coddes = coddes;
        this.productname = productname;
        this.productno = productno;
        this.custname = custname;
        this.applydate = applydate;
        this.nodename = nodename;
        this.nodeid = nodeid;
    }

}
