package com.grape.controller;

import java.net.UnknownHostException;

import io.swagger.annotations.ApiOperation;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.SeeTradingResponse;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.SeeAccountResponse;
import com.grape.controller.reponse.StatisticalAccountResponse;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.controller.request.SaveTradingRequest;
import com.grape.controller.request.SeeTradingRequest;
import com.grape.controller.request.SeeAccountRequest;
import com.grape.controller.request.StatisticalAccountRequest;
import com.grape.service.AccountService;
import com.grape.service.DoctaskService;
import com.grape.util.PageBean;

/**
 * @描述 账目模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 13:39
 */
@RestController
@RequestMapping("/account")
@Validated
@Log4j
public class AccountController {

    @Autowired
    private DoctaskService doctaskService;

    @Autowired
    private AccountService accountService;

    /**
     * @描述 查看账户统计信息
     * @参数 [statisticalAccountRequest]
     * @返回值 com.grape.controller.reponse.StatisticalAccountResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 13:45
     */
    @ApiOperation(value = "查看账户统计信息", httpMethod = "POST", notes = "查看账户统计信息测试接口", response = StatisticalAccountResponse.class)
    @RequestMapping(value = "/statisticalAccountResponse", method = RequestMethod.POST)
    public Response statisticalAccountResponse(@Validated @RequestBody StatisticalAccountRequest statisticalAccountRequest) {
        try {
            //获取员工号和手机号码,封装Bean
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            return accountService.statisticalAccountResponse(statisticalAccountRequest.getChecktype(), userOfOrgBean);
        } catch (Exception e) {
            //捕捉错误异常,返回错误状态码
            log.error(StatusCode.STATISTICAL_ACCOUNT_ERROR.message(), e);
            return new ErrorEntity(StatusCode.STATISTICAL_ACCOUNT_ERROR);
        }
    }

    /**
     * @描述 查看账户列表信息
     * @参数 [seeAccountRequest]
     * @返回值 com.grape.controller.reponse.SeeAccountResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 13:51
     */
    @ApiOperation(value = "查看账户列表信息", httpMethod = "POST", notes = "查看账户列表信息测试接口", response = SeeAccountResponse.class)
    @RequestMapping(value = "/channelSeeAccountResponse", method = RequestMethod.POST)
    public Response channelSeeAccountResponse(@Validated @RequestBody SeeAccountRequest seeAccountRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            PageBean pageBean = new PageBean(seeAccountRequest.getPagenum(), seeAccountRequest.getPagesize());
            return accountService.seeAccountResponse(seeAccountRequest.getChecktype(), pageBean, userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.CHANNEL_SEE_ACCOUNT_ERROR.message(), e);
            return new ErrorEntity(StatusCode.CHANNEL_SEE_ACCOUNT_ERROR);
        }
    }

    /**
     * @描述 新增交易记录
     * @参数 [saveTradingRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/13 13:52
     */
    @ApiOperation(value = "新增交易记录", httpMethod = "POST", notes = "新增交易记录测试接口", response = Response.class)
    @RequestMapping(value = "/SaveTradingResponse", method = RequestMethod.POST)
    public Response saveTradingResponse(@Validated @RequestBody SaveTradingRequest saveTradingRequest) throws UnknownHostException {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            String res = accountService.saveTradingResponse(saveTradingRequest.getOrganizationno(), saveTradingRequest.getTopupOrDeduction(),
                    saveTradingRequest.getBalancetype(), saveTradingRequest.getTransamount(), saveTradingRequest.getTradingnote(), userOfOrgBean);
            if ("20000".equals(res)) {
                return new RestfulResponse();
            }
            return new ErrorEntity(StatusCode.SAVEORUPDATE_ERROR);
        } catch (Exception e) {
            log.error(StatusCode.SAVE_TRADING_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SAVE_TRADING_ERROR);
        }
    }

    /**
     * @描述 查看交易记录
     * @参数 [seeTradingRequest]
     * @返回值 com.grape.controller.reponse.SeeTradingResponse
     * @创建人 zyh
     * @创建时间 2018/11/13 13:52
     */
    @ApiOperation(value = "查看交易记录", httpMethod = "POST", notes = "查看交易记录测试接口", response = SeeTradingResponse.class)
    @RequestMapping(value = "/platformSeeTradingResponse", method = RequestMethod.POST)
    public Response seeTradingResponse(@Validated @RequestBody SeeTradingRequest seeTradingRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            PageBean pageBean = new PageBean(seeTradingRequest.getPagenum(), seeTradingRequest.getPagesize());
            return accountService.seeTradingResponse(seeTradingRequest.getOrganizationno(), seeTradingRequest.getAccounttype(), pageBean, userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.SEE_TRADING_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SEE_TRADING_ERROR);
        }
    }
}
