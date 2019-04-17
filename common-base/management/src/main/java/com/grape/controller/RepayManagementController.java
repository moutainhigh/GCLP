package com.grape.controller;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.*;
import io.swagger.annotations.ApiOperation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.controller.request.BasicInformationRequest;
import com.grape.controller.request.ManagementlistRequest;
import com.grape.controller.request.RepayManagementRequest;
import com.grape.controller.request.RepaymenthistoryRequest;
import com.grape.service.DoctaskService;
import com.grape.service.RepayManagementService;
import com.grape.util.PageBean;
import com.grape.util.Util;

/**
 * @描述 逾期管理
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/16 10:39
 */
@RestController
@RequestMapping("/repayManagement")
@Validated
@Log4j
public class RepayManagementController {

    @Autowired
    private DoctaskService doctaskService;

    @Autowired
    private RepayManagementService repayManagementService;

    /**
     * @描述 查询逾期统计信息
     * @参数 []
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 11:47
     */
    @ApiOperation(value = "逾期统计信息", httpMethod = "POST", notes = "逾期统计信息测试接口", response = OverdueStatResponse.class)
    @RequestMapping(value = "/overduestatReponse", method = RequestMethod.POST)
    public Response overdueStatReponse() {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            return new OverdueStatResponse(repayManagementService.overdueStatReponse(userOfOrgBean));
        } catch (Exception e) {
            log.error(StatusCode.SELECT_OVER_DUESTAT_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_OVER_DUESTAT_ERROR);
        }
    }

    /**
     * @描述 分页查询管理列表
     * @参数 [managementlistRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 14:15
     */
    @ApiOperation(value = "管理列表", httpMethod = "POST", notes = "管理列表测试接口", response = ManagementlistResponse.class)
    @RequestMapping(value = "/managementlistResponse", method = RequestMethod.POST)
    public Response managementlistResponse(@Validated @RequestBody ManagementlistRequest managementlistRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            PageBean pageBeanRequest = new PageBean(managementlistRequest.getPagenum(), managementlistRequest.getPagesize());
            if (managementlistRequest.getEndDate() != null) {
                //获取结束日期的下一天
                Date endDate = Date.from(LocalDateTime.ofInstant(managementlistRequest.getEndDate().toInstant(), ZoneId.systemDefault())
                        .plusDays(1).atZone(ZoneId.systemDefault()).toInstant());
                managementlistRequest.setEndDate(endDate);
            }
            //处理workId供模糊查询
            String workId = Util.fillSeqno(managementlistRequest.getWorkid());
            return repayManagementService.managementlistResponse(
                    managementlistRequest.getStartDate(), managementlistRequest.getEndDate(),
                    managementlistRequest.getProductno(), workId,
                    managementlistRequest.getCustname(), managementlistRequest.getCerdid(),
                    managementlistRequest.getHouseno(), pageBeanRequest, userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_MANAGERMENTLIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_MANAGERMENTLIST_ERROR);
        }
    }

    /**
     * @描述 分页查询原还款详情
     * @参数 [repayManagementRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 18:53
     */
    @ApiOperation(value = "原还款详情", httpMethod = "POST", notes = "原还款详情测试接口", response = RepayManagementResponse.class)
    @RequestMapping(value = "/repayManagementResponse", method = RequestMethod.POST)
    public Response repayManagementResponse(@Validated @RequestBody RepayManagementRequest repayManagementRequest) {
        try {
            PageBean pageBean = new PageBean(repayManagementRequest.getPagenum(), repayManagementRequest.getPagesize());
            return repayManagementService.repayManagementResponse(repayManagementRequest.getWorkid(), repayManagementRequest.getChecktype(), pageBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_MANAGERMENTLIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_MANAGERMENTLIST_ERROR);
        }
    }

    /**
     * @描述 分页查询展期还款详情
     * @参数 [repayRollOverRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 19:05
     */
    @ApiOperation(value = "展期还款详情", httpMethod = "POST", notes = "展期还款详情测试接口", response = RepayManagementResponse.class)
    @RequestMapping(value = "/repayRollOverResponse", method = RequestMethod.POST)
    public Response repayRollOverResponse(@Validated @RequestBody RepayManagementRequest repayRollOverRequest) {
        try {
            PageBean pageBean = new PageBean(repayRollOverRequest.getPagenum(), repayRollOverRequest.getPagesize());
            return repayManagementService.repayRollOverResponse(repayRollOverRequest.getWorkid(), repayRollOverRequest.getChecktype(), pageBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_REPAYROLLOVER_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_REPAYROLLOVER_ERROR);
        }
    }

    /**
     * @描述 查询原基本信息
     * @参数 [repaymenthistoryRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 19:10
     */
    @ApiOperation(value = "查询原基本信息", httpMethod = "POST", notes = "查询原基本信息测试接口", response = BasicInformationResponse.class)
    @RequestMapping(value = "/basicInformationResponse", method = RequestMethod.POST)
    public Response basicInformationResponse(@Validated @RequestBody BasicInformationRequest repaymenthistoryRequest) {
        try {
            return repayManagementService.basicInformationResponse(repaymenthistoryRequest.getWorkid());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_BASICINFORMATION_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_BASICINFORMATION_ERROR);
        }
    }

    /**
     * @描述 查询展期基本信息
     * @参数 [repaymenthistoryRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 19:15
     */
    @ApiOperation(value = "查询展期基本信息", httpMethod = "POST", notes = "查询展期基本信息测试接口", response = BasicInformationResponse.class)
    @RequestMapping(value = "/basicInfoRollOverResponse", method = RequestMethod.POST)
    public Response basicInfoRollOverResponse(@Validated @RequestBody BasicInformationRequest repaymenthistoryRequest) {
        try {
            return repayManagementService.basicInfoRollOverResponse(repaymenthistoryRequest.getWorkid());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_BASICINFOROLLOVER_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_BASICINFOROLLOVER_ERROR);
        }
    }

    /**
     * @描述 查询还款记录列表
     * @参数 [repaymenthistoryRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 19:19
     */
    @ApiOperation(value = "查询还款记录列表", httpMethod = "POST", notes = "查询还款记录列表测试接口", response = RepaymenthistoryResponse.class)
    @RequestMapping(value = "/repaymenthistoryResponse", method = RequestMethod.POST)
    public Response repaymenthistoryResponse(@Validated @RequestBody RepaymenthistoryRequest repaymenthistoryRequest) {
        try {
            return repayManagementService.repaymenthistoryResponse(repaymenthistoryRequest.getWorkid(), repaymenthistoryRequest.getRefundissue());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_REPAYMENTISTORY_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_REPAYMENTISTORY_ERROR);
        }
    }


    /**
     * @描述 查询逾期列表(Android)
     * @参数 []
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 19:25
     */
    @ApiOperation(value = "查询逾期列表(Android)", httpMethod = "POST", notes = "查询逾期列表(Android)测试接口", response = OverduelistResponse.class)
    @RequestMapping(value = "/overduelistResponse", method = RequestMethod.POST)
    public Response overduelistResponse() {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            return repayManagementService.overduelistResponse(userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_OVERDUELIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_OVERDUELIST_ERROR);
        }
    }


    /**
     * @描述 查询还款提醒(Android)
     * @参数 []
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/16 19:32
     */
    @ApiOperation(value = "查询还款提醒(Android)", httpMethod = "POST", notes = "查询还款提醒(Android)测试接口", response = PromptpaymentsResponse.class)
    @RequestMapping(value = "/promptpaymentsResponse", method = RequestMethod.POST)
    public Response promptpaymentsResponse() {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            return repayManagementService.promptpaymentsResponse(userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_PROPTPAYMENTS_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_PROPTPAYMENTS_ERROR);
        }
    }

}
