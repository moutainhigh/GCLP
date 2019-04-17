package com.grape.service;

import java.math.BigDecimal;
import java.net.UnknownHostException;

import com.grape.controller.reponse.SeeTradingResponse;
import com.grape.controller.reponse.SeeAccountResponse;
import com.grape.controller.reponse.StatisticalAccountResponse;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.util.PageBean;

/**
 * @描述 账号Service层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 14:51
 */
public interface AccountService {

    /**
     * @描述 分组统计账号
     * @参数 [checkType, userOfOrgBean]
     * @返回值 com.grape.controller.reponse.StatisticalAccountResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 14:52
     */
    StatisticalAccountResponse statisticalAccountResponse(String checkType, UserOfOrgBean userOfOrgBean);

    /**
     * @描述 分页查询账号
     * @参数 [checkType, pageBean, userOfOrgBean]
     * @返回值 com.grape.controller.reponse.SeeAccountResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 16:10
     */
    SeeAccountResponse seeAccountResponse(String checkType, PageBean pageBean, UserOfOrgBean userOfOrgBean);

    /**
     * @描述 新增交易记录
     * @参数 [organizationNo, topupOrDeduction, balanceType, transAmount, tradingNote, userOfOrgBean]
     * @返回值 java.lang.String
     * @创建人 zyh
     * @创建时间 2018/11/20 14:27
     */
    String saveTradingResponse(String organizationNo, String topupOrDeduction, String balanceType, BigDecimal transAmount, String tradingNote, UserOfOrgBean userOfOrgBean) throws UnknownHostException;

    /**
     * @描述 查看交易记录
     * @参数 [organizationNo, accountType, pageBean, userOfOrgBean]
     * @返回值 com.grape.controller.reponse.SeeTradingResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 17:06
     */
    SeeTradingResponse seeTradingResponse(String organizationNo, String accountType, PageBean pageBean, UserOfOrgBean userOfOrgBean);

}
