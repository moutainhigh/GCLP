package com.grape.controller.reponse;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.SeeQuotaListBean;
import com.grape.controller.reponse.bean.StatisticalQuota;

/**
 * @描述 查询额度返回结果类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 17:19
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SeeQuotaResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "统计数据", required = true)
    private StatisticalQuota statisticalQuota;

    @ApiModelProperty(value = "数据集合", required = true)
    private List<SeeQuotaListBean> seeQuotaListBean;

    @ApiModelProperty(value = "数据总条数", required = true)
    private int countInfo;

    @ApiModelProperty(value = "更新时间", required = true)
    private Date chgdt;

}
