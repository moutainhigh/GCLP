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
import com.grape.controller.reponse.bean.RepaymenthistoryBean;

/**
 * @描述 查询还款记录列表返回成功结果集
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 19:17
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RepaymenthistoryResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "查询还款记录列表结果集", required = true)
    private List<RepaymenthistoryBean> repaymenthistoryBeanlist;

}
