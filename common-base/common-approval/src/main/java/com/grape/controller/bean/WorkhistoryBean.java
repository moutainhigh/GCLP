package com.grape.controller.bean;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cwc
 * @version 创建时间：2018年12月13日 下午12:02:32
 */
@Getter
@Setter
public class WorkhistoryBean {
    @Length(max = 19, min = 0, message = "主键id不能超出19位")
    @ApiModelProperty(value = "主键id", example = "", dataType = "varchar(19)", required = true)
    private String id;

    @Length(max = 10, min = 0, message = "流水编号不能超出10位")
    @ApiModelProperty(value = "流水编号", example = "", dataType = "varchar(10)", required = true)
    private String workid;

    @Length(max = 20, min = 0, message = "不能超出20位")
    @ApiModelProperty(value = "", example = "", dataType = "varchar(20)", required = true)
    private String fork;

    @Length(max = 20, min = 0, message = "不能超出20位")
    @ApiModelProperty(value = "", example = "", dataType = "varchar(20)", required = true)
    private String branch;

    @Length(max = 8, min = 0, message = "审批人不能超出8位")
    @ApiModelProperty(value = "审批人", example = "", dataType = "varchar(8)", required = true)
    private String userid;

    @Length(max = 19, min = 0, message = "节点不能超出19位")
    @ApiModelProperty(value = "节点", example = "", dataType = "varchar(19)", required = true)
    private String node;

    @Length(max = 19, min = 0, message = "下一节点不能超出19位")
    @ApiModelProperty(value = "下一节点", example = "", dataType = "varchar(19)", required = true)
    private String nextnode;

    @Length(max = 80, min = 0, message = "操作不能超出80位")
    @ApiModelProperty(value = "操作", example = "", dataType = "varchar(80)", required = true)
    private String operation;

    @ApiModelProperty(value = "操作日期", example = "", dataType = "datetime", required = true)
    private Date operdate;

    @Length(max = 20, min = 0, message = "不能超出20位")
    @ApiModelProperty(value = "", example = "", dataType = "varchar(20)", required = true)
    private String stage;

    @Length(max = 6, min = 0, message = "类型不能超出6位")
    @ApiModelProperty(value = "类型", example = "", dataType = "varchar(6)", required = true)
    private String type;

    @ApiModelProperty(value = "审批意见", example = "", dataType = "longtext", required = true)
    private String notation;

    @ApiModelProperty(value = "", example = "历史类型", dataType = "varchar(20)", required = true)
    private String historytype;
}
