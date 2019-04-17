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
 * @描述 放款封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:53
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class LendingBean {

    @ApiModelProperty(value = "放款量", example = "", required = true)
    private Long num;

    @ApiModelProperty(value = "放款金额", example = "", required = true)
    private BigDecimal sum;

}
