package com.grape.service;

import java.util.Date;

import com.grape.controller.reponse.BusinessStatisticsResponse;
import com.grape.controller.reponse.bean.UserOfOrgBean;

/**
 * @描述 交易模块Service层接口
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:28
 */
public interface BusinessService {
    /**
     * @描述 业务量统计
     * @参数 [areaId, productNo, channelNo, fundNo, aisleNo, terrcaeNo, startDate, endDate, userOfOrgBean]
     * @返回值 com.grape.controller.reponse.BusinessStatisticsResponse
     * @创建人 zyh
     * @创建时间 2018/11/20 10:38
     */
    BusinessStatisticsResponse businessStatisticsResponse(
            String areaId, String productNo, String channelNo, String fundNo,
            String aisleNo, String terrcaeNo, Date startDate, Date endDate,
            UserOfOrgBean userOfOrgBean);

}
