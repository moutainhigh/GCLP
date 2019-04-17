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
import com.grape.controller.reponse.bean.SeeAreaQuotaListBean;
import com.grape.controller.reponse.bean.StatisticalAreaQuota;

/**
 * @描述 查询地区额度结果集
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 17:24
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class SeeAreaQuotaResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "统计额度", required = true)
    private StatisticalAreaQuota statisticalAreaQuota;

    @ApiModelProperty(value = "数据集合", required = true)
    private List<SeeAreaQuotaListBean> seeAreaQuotaListBean;

    @ApiModelProperty(value = "数据总条数", required = true)
    private int countInfo;

}
