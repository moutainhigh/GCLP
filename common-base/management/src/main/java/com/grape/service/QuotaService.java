package com.grape.service;

import java.math.BigDecimal;
import java.net.UnknownHostException;

import com.grape.controller.reponse.SeeChangeRecordResponse;
import com.grape.controller.reponse.SeeQuotaResponse;
import com.grape.controller.reponse.SeeAreaQuotaResponse;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.util.PageBean;

/**
 * @描述 额度模块Service层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 17:01
 */
public interface QuotaService {

    /**
     * @描述 分页查看额度
     * @参数 [checkType, fundNo, pageBean, userOfOrgBean]
     * @返回值 com.grape.controller.reponse.SeeQuotaResponse
     * @创建人 zyh
     * @创建时间 2018/11/14 17:01
     */
    SeeQuotaResponse seeQuotaResponse(String checkType, String fundNo, PageBean pageBean, UserOfOrgBean userOfOrgBean);

    /**
     * @描述 分页查看地区额度
     * @参数 [accountNo, pageBean]
     * @返回值 com.grape.controller.reponse.SeeAreaQuotaResponse
     * @创建人 zyh
     * @创建时间 2018/11/14 17:01
     */
    SeeAreaQuotaResponse seeAreaQuotaResponse(String accountNo, PageBean pageBean);

    /**
     * @描述 分页查询查看变更记录
     * @参数 [accountNo, pageBean]
     * @返回值 com.grape.controller.reponse.SeeChangeRecordResponse
     * @创建人 zyh
     * @创建时间 2018/11/14 17:01
     */
    SeeChangeRecordResponse seeChangeRecordResponse(String accountNo, PageBean pageBean);

    /**
     * @描述 新增变更记录
     * @参数 [accountNo, transAmount, tradingNote]
     * @返回值 java.lang.String
     * @创建人 zyh
     * @创建时间 2018/11/14 17:01
     */
    String saveChangeRecordResponse(String accountNo, BigDecimal transAmount, String tradingNote) throws UnknownHostException;

    /**
     * @描述 流水额度变更
     * @参数 [workId]
     * @返回值 java.lang.String
     * @创建人 zyh
     * @创建时间 2018/11/14 17:01
     */
    String updateAccountQuota(String workId);
}
