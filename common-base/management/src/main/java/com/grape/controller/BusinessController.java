package com.grape.controller;

import java.util.Calendar;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.BusinessStatisticsResponse;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.controller.request.BusinessStatisticsRequest;
import com.grape.service.BusinessService;
import com.grape.service.DoctaskService;

import io.swagger.annotations.ApiOperation;

/**
 * @描述 业务量统计模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 11:17
 */
@RestController
@RequestMapping("/business")
@Validated
@Log4j
public class BusinessController {

    @Autowired
    private DoctaskService doctaskService;

    @Autowired
    private BusinessService businessService;

    /**
     * @描述 业务量统计
     * @参数 [businessStatisticsRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 13:42
     */
    @ApiOperation(value = "业务量统计", httpMethod = "POST", notes = "业务量统计测试接口", response = BusinessStatisticsResponse.class)
    @RequestMapping(value = "/businessStatisticsResponse", method = RequestMethod.POST)
    public Response businessStatisticsResponse(@Validated @RequestBody BusinessStatisticsRequest businessStatisticsRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            if (businessStatisticsRequest.getEndDate() != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(businessStatisticsRequest.getEndDate());
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                businessStatisticsRequest.setEndDate(calendar.getTime());
            }
            return businessService.businessStatisticsResponse(
                    businessStatisticsRequest.getAreaid(), businessStatisticsRequest.getProductno(),
                    businessStatisticsRequest.getChannelno(), businessStatisticsRequest.getFundno(),
                    businessStatisticsRequest.getAisleno(), businessStatisticsRequest.getTerrcaeno(),
                    businessStatisticsRequest.getStartDate(), businessStatisticsRequest.getEndDate(),
                    userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.BUSINESS_STATISTICS_ERROR.message(), e);
            return new ErrorEntity(StatusCode.BUSINESS_STATISTICS_ERROR);
        }
    }
}
