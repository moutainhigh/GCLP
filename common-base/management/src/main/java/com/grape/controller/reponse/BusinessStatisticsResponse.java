package com.grape.controller.reponse;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.grape.controller.reponse.bean.DeclarationBean;
import com.grape.controller.reponse.bean.LendingBean;
import com.grape.controller.reponse.bean.RefundBean;
import com.grape.controller.reponse.bean.RefusedBean;
import com.grape.controller.reponse.bean.ReplyBean;
import com.grape.controller.reponse.bean.WaitingBean;

/**
 * @描述 业务量统计返回成功参数封装类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:26
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"}, ignoreUnknown = true)
public class BusinessStatisticsResponse extends RestfulResponse {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "报单数据", required = true)
    private DeclarationBean declarationBean;

    @ApiModelProperty(value = "批复数据", required = true)
    private ReplyBean replyBean;

    @ApiModelProperty(value = "拒单数据", required = true)
    private RefusedBean refusedBean;

    @ApiModelProperty(value = "退单数据", required = true)
    private RefundBean refundBean;

    @ApiModelProperty(value = "放款数据", required = true)
    private LendingBean lendingBean;

    @ApiModelProperty(value = "抵押量", required = true)
    private Long mortgageamount;

    @ApiModelProperty(value = "未抵押量", required = true)
    private Long notmortgageamount;

    @ApiModelProperty(value = "待放款数据", required = true)
    private WaitingBean waitingBean;

    @ApiModelProperty(value = "已取证", required = true)
    private Long forensics;

    @ApiModelProperty(value = "未取证", required = true)
    private Long notforensics;

    @ApiModelProperty(value = "审批通过率", required = true)
    private Double passrate;

    @ApiModelProperty(value = "上月审批通过率", required = true)
    private Double lastpassrate;

    @ApiModelProperty(value = "审批退件率", required = true)
    private Double returnrate;

    @ApiModelProperty(value = "上月审批退件率", required = true)
    private Double lastreturnrate;

    @ApiModelProperty(value = "放款成功率", required = true)
    private BigDecimal successrate;

    @ApiModelProperty(value = "上月放款成功率", required = true)
    private BigDecimal lastsuccessrate;

    @ApiModelProperty(value = "抵押成功率", required = true)
    private Double mortgagerate;

    @ApiModelProperty(value = "上月抵押成功率", required = true)
    private Double lastmortgagerate;
}
