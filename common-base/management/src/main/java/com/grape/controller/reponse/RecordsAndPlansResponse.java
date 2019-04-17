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
import com.grape.controller.reponse.bean.RepaymentplanBean;
import com.grape.controller.reponse.bean.RepayplanmainBean;

/**
 * @描述 查询还款计划返回结果集
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 11:08
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RecordsAndPlansResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主计划", required = true)
    private RepayplanmainBean repayplanmainBean;

    @ApiModelProperty(value = "还款计划", required = true)
    private List<RepaymentplanBean> repaymentplanBeanlist;

    @ApiModelProperty(value = "还款计划条数", required = true)
    private int countInfo;

}
