package com.grape.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.BusinessStatisticsResponse;
import com.grape.controller.reponse.bean.DeclarationBean;
import com.grape.controller.reponse.bean.LendingBean;
import com.grape.controller.reponse.bean.RefundBean;
import com.grape.controller.reponse.bean.RefusedBean;
import com.grape.controller.reponse.bean.ReplyBean;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.controller.reponse.bean.WaitingBean;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.external.BusinessExMapper;
import com.grape.service.BusinessService;

@Service
public class BusinessServiceImpl extends BaseMapper implements BusinessService {

    @Autowired
    private BusinessExMapper businessExMapper;

    @Override
    public BusinessStatisticsResponse businessStatisticsResponse(
            String areaId, String productNo, String channelNo, String fundNo,
            String aisleNo, String terrcaeNo, Date startDate, Date endDate,
            UserOfOrgBean userOfOrgBean) {
        //比率集合,存放本月各比率参数
        Map<String, Object> rateMap = Maps.newHashMapWithExpectedSize(9);
        rateMap.put("areaid", areaId);
        rateMap.put("productno", productNo);
        //上月比率集合,存放上月各比率参数
        Map<String, Object> lastRateMap = Maps.newHashMapWithExpectedSize(9);
        lastRateMap.put("areaid", areaId);
        lastRateMap.put("productno", productNo);

        if ("01".equals(userOfOrgBean.getOrgbelongsto())) {
            rateMap.put("channelno", userOfOrgBean.getOrganizationno());
            lastRateMap.put("channelno", userOfOrgBean.getOrganizationno());
        }
        if ("02".equals(userOfOrgBean.getOrgbelongsto())) {
            rateMap.put("fundno", userOfOrgBean.getOrganizationno());
            lastRateMap.put("fundno", userOfOrgBean.getOrganizationno());
        }
        if ("03".equals(userOfOrgBean.getOrgbelongsto())) {
            rateMap.put("fundno", fundNo);
            lastRateMap.put("fundno", fundNo);
        }
        if ("04".equals(userOfOrgBean.getOrgbelongsto())) {
            rateMap.put("channelno", channelNo);
            rateMap.put("fundno", fundNo);
            lastRateMap.put("channelno", channelNo);
            lastRateMap.put("fundno", fundNo);
        }
        rateMap.put("startDate", startDate);
        rateMap.put("endDate", endDate);
        LocalDate lastStartDate  = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().minusMonths(1);
        LocalDate lastEndDate  = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().minusMonths(1);
        lastRateMap.put("startDate", lastStartDate);
        lastRateMap.put("endDate", lastEndDate);

        //查询报单
        DeclarationBean declarationBean = businessExMapper.getDeclarationBean(rateMap);
        //查询批复
        //TODO
        ReplyBean replyBean = businessExMapper.getReplyBean(rateMap);
        //查询拒单
        RefusedBean refusedBean = businessExMapper.getRefusedBean(rateMap);
        //查询退单
        RefundBean refundBean = businessExMapper.getRefundBean(rateMap);
        //查询放款
        LendingBean lendingBean = businessExMapper.getLendingBean(rateMap);
        //查询抵押量
        Long mortgageAmount = businessExMapper.mortgageamount(rateMap).longValue();
        //查询非抵押贷款量
        Long notMortgageAmount = businessExMapper.notmortgageamount(rateMap).longValue();
        //查询待放款量
        WaitingBean waitingBean = businessExMapper.getWaitingBean(rateMap);
        //查询已取证
        //TODO
        Long forensics = businessExMapper.getforensics(rateMap).longValue();
        //查询非取证
        Long notForensics = businessExMapper.getnotforensics(rateMap).longValue();
        //初始化通过率
        Double passRate = 0.0;
        //初始化退件率
        Double returnRate = 0.0;
        //初始化放款成功率
        BigDecimal successRate = null;
        //初始化抵押成功率
        Double mortgageRate = 0.0;
        //初始化上月审批通过率
        Double lastPassRate = 0.0;
        //初始化上月审批退件率
        Double lastReturnRate = 0.0;
        //初始化上月放款成功率
        BigDecimal lastSuccessRate = null;
        //初始化上月抵押成功率
        Double lastMortgageRate = 0.0;

        if (replyBean.getNum() != null  && declarationBean.getNum() != 0) {
            //通过率 = 批复量 / 报单量
            passRate = (double) replyBean.getNum() / (double) declarationBean.getNum();
        }
        if (refundBean.getNum() != null  && declarationBean.getNum() != 0) {
            //退件率 = 退单量 / 报单量
            returnRate = (double) refundBean.getNum() / (double) declarationBean.getNum();
        }
        if (replyBean.getSum() != null && lendingBean.getSum() != null) {
            //放款成功率 = 放款量 / 批复量
            successRate = lendingBean.getSum().divide(replyBean.getSum(), 6, BigDecimal.ROUND_HALF_UP);
        }
        if (replyBean.getNum() != 0 && replyBean.getNum() != 0) {
            //抵押成功率 = 抵押率 / 批复量
            mortgageRate = (double) mortgageAmount / (double) replyBean.getNum();
        }
        /*Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, -1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        startDate = cal.getTime();
        cal.roll(Calendar.DAY_OF_MONTH, -1);
        endDate = cal.getTime();*/

        //查询上月报单
        DeclarationBean lastDeclarationBean = businessExMapper.getDeclarationBean(lastRateMap);
        //查询上月批复
        ReplyBean lastReplyBean = businessExMapper.getReplyBean(lastRateMap);
        //查询上月退单
        RefundBean lastRefundBean = businessExMapper.getRefundBean(lastRateMap);
        //查询上月放款
        LendingBean lastLendingBean = businessExMapper.getLendingBean(lastRateMap);
        //查询上月抵押金额
        Long lastMortgageAmount = businessExMapper.mortgageamount(lastRateMap).longValue();


        if (lastReplyBean.getNum() != null && lastDeclarationBean.getNum() != null && lastDeclarationBean.getNum() != 0) {
            //上月审批通过率
            lastPassRate = (double) lastReplyBean.getNum() / (double) lastDeclarationBean.getNum();
        }
        if (lastRefundBean.getNum() != null && lastDeclarationBean.getNum() != null && lastDeclarationBean.getNum() != 0) {
            //上月审批退件率
            lastReturnRate = (double) lastRefundBean.getNum() / (double) lastDeclarationBean.getNum();
        }
        if (lastReplyBean.getSum() != null && lastLendingBean.getSum() != null) {
            //上月放款成功率
            lastSuccessRate = lastLendingBean.getSum().divide(lastReplyBean.getSum(), 2, RoundingMode.HALF_UP);
        }
        if (lastReplyBean.getNum() != null && lastReplyBean.getNum() != 0) {
            //上月抵押成功率
            lastMortgageRate = (double) lastMortgageAmount / (double) lastReplyBean.getNum();
        }
        return new BusinessStatisticsResponse(
                declarationBean, replyBean, refusedBean, refundBean, lendingBean, mortgageAmount,
                notMortgageAmount, waitingBean, forensics, notForensics, passRate, lastPassRate,
                returnRate, lastReturnRate, successRate, lastSuccessRate, mortgageRate, lastMortgageRate);
    }
}
