package com.grape.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

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

import com.grape.controller.reponse.LogQueryListResponse;
import com.grape.controller.request.LogQueryListRequest;
import com.grape.util.PageBean;
import com.grape.service.DoctaskService;
import com.grape.service.LogQueryService;

import io.swagger.annotations.ApiOperation;

/**
 * @描述 日志模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 15:42
 */
@RestController
@RequestMapping("/logQuery")
@Validated
@Log4j
public class LogQueryController {

    @Autowired
    private DoctaskService doctaskService;

    @Autowired
    private LogQueryService logQueryService;

    /**
     * @描述 分页查询日志
     * @参数 [logQueryListRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 15:56
     */
    @ApiOperation(value = "日志查询", httpMethod = "POST", notes = "日志查询测试接口", response = LogQueryListResponse.class)
    @RequestMapping(value = "/logQueryListReponse", method = RequestMethod.POST)
    public Response logQueryListReponse(@Validated @RequestBody LogQueryListRequest logQueryListRequest) {
        try {
            PageBean pageBeanRequest = new PageBean(logQueryListRequest.getPagenum(), logQueryListRequest.getPagesize());
            Date endDate = null;
            if (logQueryListRequest.getEndDate() != null) {
                //获取结束日期的下一天
                endDate = Date.from(LocalDateTime.ofInstant(logQueryListRequest.getEndDate().toInstant(), ZoneId.systemDefault())
                        .plusDays(1).atZone(ZoneId.systemDefault()).toInstant());
            }
            PageBean pageBeanResponse = logQueryService.logQueryListReponse(logQueryListRequest.getChecktl(),
                    logQueryListRequest.getType(), logQueryListRequest.getStartDate(), endDate, pageBeanRequest);
            return new LogQueryListResponse(pageBeanResponse.getResultList(), pageBeanResponse.getRecordCount());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_LOGQUERYLIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_LOGQUERYLIST_ERROR);
        }
    }
}
