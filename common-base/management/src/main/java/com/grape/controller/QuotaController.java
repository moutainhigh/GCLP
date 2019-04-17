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
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.SeeAreaQuotaResponse;
import com.grape.controller.reponse.SeeChangeRecordResponse;
import com.grape.controller.reponse.SeeQuotaResponse;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.controller.request.SaveChangeRecordRequest;
import com.grape.controller.request.SaveRepaymentplanRequest;
import com.grape.controller.request.SeeAreaQuotaRequest;
import com.grape.controller.request.SeeQuotaRequest;
import com.grape.service.DoctaskService;
import com.grape.service.QuotaService;
import com.grape.util.PageBean;

/**
 * @描述 额度模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/14 17:02
 */
@RestController
@RequestMapping("/quota")
@Validated
@Log4j
public class QuotaController {

    @Autowired
    private DoctaskService doctaskService;

    @Autowired
    private QuotaService quotaService;

    /**
     * @描述 分页查询额度
     * @参数 [seeQuotaRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 17:20
     */
    @ApiOperation(value = "查看额度", httpMethod = "POST", notes = "查看额度测试接口", response = SeeQuotaResponse.class)
    @RequestMapping(value = "/seeQuotaResponse", method = RequestMethod.POST)
    public Response seeQuotaResponse(@Validated @RequestBody SeeQuotaRequest seeQuotaRequest) {
        try {
            UserOfOrgBean userOfOrgBean = doctaskService.getUserOfOrg();
            PageBean pageBean = new PageBean(seeQuotaRequest.getPagenum(), seeQuotaRequest.getPagesize());
            return quotaService.seeQuotaResponse(seeQuotaRequest.getChecktype(), seeQuotaRequest.getFundno(), pageBean, userOfOrgBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_QUOTALIST_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_QUOTALIST_ERROR);
        }
    }

    /**
     * @描述 分页查询地区额度
     * @参数 [seeAreaQuotaRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 17:28
     */
    @ApiOperation(value = "查看地区额度", httpMethod = "POST", notes = "查看地区额度测试接口", response = SeeAreaQuotaResponse.class)
    @RequestMapping(value = "/seeAreaQuotaResponse", method = RequestMethod.POST)
    public Response seeAreaQuotaResponse(@Validated @RequestBody SeeAreaQuotaRequest seeAreaQuotaRequest) {
        try {
            PageBean pageBean = new PageBean(seeAreaQuotaRequest.getPagenum(), seeAreaQuotaRequest.getPagesize());
            return quotaService.seeAreaQuotaResponse(seeAreaQuotaRequest.getAccountno(), pageBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_AREAQUOTA_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_AREAQUOTA_ERROR);
        }
    }

    /**
     * @描述 分页查询变更记录
     * @参数 [seeAreaQuotaRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 17:45
     */
    @ApiOperation(value = "查看变更记录", httpMethod = "POST", notes = "查看变更记录测试接口", response = SeeChangeRecordResponse.class)
    @RequestMapping(value = "/seeChangeRecordResponse", method = RequestMethod.POST)
    public Response seeChangeRecordResponse(@Validated @RequestBody SeeAreaQuotaRequest seeAreaQuotaRequest) {
        try {
            PageBean pageBean = new PageBean(seeAreaQuotaRequest.getPagenum(), seeAreaQuotaRequest.getPagesize());
            return quotaService.seeChangeRecordResponse(seeAreaQuotaRequest.getAccountno(), pageBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_CHANGERECORD_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_CHANGERECORD_ERROR);
        }
    }

    /**
     * @描述 新增变更记录
     * @参数 [saveChangeRecordRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 19:37
     */
    @ApiOperation(value = "新增变更记录", httpMethod = "POST", notes = "新增变更记录测试接口", response = Response.class)
    @RequestMapping(value = "/saveChangeRecordResponse", method = RequestMethod.POST)
    public Response saveChangeRecordResponse(@Validated @RequestBody SaveChangeRecordRequest saveChangeRecordRequest) {
        try {
            String res = quotaService.saveChangeRecordResponse(saveChangeRecordRequest.getAccountno(), saveChangeRecordRequest.getTransamount(), saveChangeRecordRequest.getTradingnote());
            if ("20000".equals(res)) {
                return new RestfulResponse();
            }
            if ("20006".equals(res)) {
                return new ErrorEntity(StatusCode.ONE_ERROR);
            }
            if ("20007".equals(res)) {
                return new ErrorEntity(StatusCode.TWO_ERROR);
            }
            return null;
        } catch (Exception e) {
            log.error(StatusCode.SAVE_CHANGERECORD_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SAVE_CHANGERECORD_ERROR);
        }
    }

    /**
     * @描述 流水额度变更
     * @参数 [updateAccountQuotaRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/14 19:47
     */
    @ApiOperation(value = "流水额度变更", httpMethod = "POST", notes = "流水额度变更测试接口", response = Response.class)
    @RequestMapping(value = "/updateAccountQuota", method = RequestMethod.POST)
    public Response updateAccountQuota(@Validated @RequestBody SaveRepaymentplanRequest updateAccountQuotaRequest) {
        try {
            String res = quotaService.updateAccountQuota(updateAccountQuotaRequest.getWorkid());
            if ("20000".equals(res)) {
                return new RestfulResponse();
            }
            if ("20004".equals(res)) {
                return new ErrorEntity(StatusCode.ACCOUNTNULL_ERROR);
            }
            if ("20005".equals(res)) {
                return new ErrorEntity(StatusCode.INSUFFICIENTAMOUNT_ERROR);
            }
            return null;
        } catch (Exception e) {
            log.error(StatusCode.UPDATE_ACCOUNTQUOTA_ERROR.message(), e);
            return new ErrorEntity(StatusCode.UPDATE_ACCOUNTQUOTA_ERROR);
        }
    }
}
