package com.grape.controller.reponse;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.RepayManagementBean;
import com.grape.controller.reponse.bean.StatisticalRepay;

/**
 * @描述 原还款详情成功返回结果集
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 18:51
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RepayManagementResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "统计还款", required = true)
    private StatisticalRepay statisticalRepay;

    @ApiModelProperty(value = "数据集合", required = true)
    private List<RepayManagementBean> RepayManagementBeanlist;

    @ApiModelProperty(value = "数据总条数", required = true)
    private int countInfo;

}
