package com.grape.controller.reponse.bean;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @描述 退单封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:52
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class RefundBean {

    @ApiModelProperty(value = "退单量", example = "", required = true)
    private Long num;

    @ApiModelProperty(value = "退单金额", example = "", required = true)
    private BigDecimal sum;

}
