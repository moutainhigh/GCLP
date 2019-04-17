package com.grape.controller;

import java.net.UnknownHostException;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.RepayInterfaceRequest;
import com.grape.service.RepayInterfaceService;

import io.swagger.annotations.ApiOperation;

/**
 * @描述 还款模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 14:47
 */
@RestController
@RequestMapping("/repayInterface")
@Validated
@Log4j
public class RepayInterfaceController {

    @Autowired
    private RepayInterfaceService repayInterfaceService;

    /**
     * @描述 正常还款、逾期接口
     * @参数 [repayInterfaceRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/15 14:47
     */
    @ApiOperation(value = "正常还款、逾期接口", httpMethod = "POST", notes = "正常还款、逾期测试接口", response = RestfulResponse.class)
    @RequestMapping("/repayInterfaceReponse")
    public Response repayInterfaceReponse(@Validated @RequestBody RepayInterfaceRequest repayInterfaceRequest) throws UnknownHostException {
        try {
            String result = repayInterfaceService.repayInterfaceReponse(
                    repayInterfaceRequest.getWorkid(), repayInterfaceRequest.getRefundissue(),
                    repayInterfaceRequest.getRepaytype(), repayInterfaceRequest.getRealityrefunddate(),
                    repayInterfaceRequest.getRefundmoney(), repayInterfaceRequest.getRefundinterest(),
                    repayInterfaceRequest.getBreachofcontract(), repayInterfaceRequest.getInterestmoney(),
                    repayInterfaceRequest.getDelayingpayment());
            if ("20000".equals(result)) {
                return new RestfulResponse();
            }
            if ("20002".equals(result)) {
                return new ErrorEntity(StatusCode.OVERDUE_RECORD);
            }
            if ("30027".equals(result)) {
                return new ErrorEntity(StatusCode.OVER_CAPITAL_OR_ACCRUAL_ERROR);
            }
            return null;
        } catch (Exception e) {
            log.error(StatusCode.REPAY_INTERFACE_ERROR.message(), e);
            return new ErrorEntity(StatusCode.REPAY_INTERFACE_ERROR);
        }
    }

    /**
     * TODO     还款接口
     *
     * @param repayInterfaceRequest
     * @return com.grape.controller.reponse.Response
     * @author zyh
     * @date 17:59 2019/1/2
     **/
    @ApiOperation(value = "正常还款、逾期、提前还款、展期还款接口", httpMethod = "POST", notes = "正常还款、逾期、提前还款、展期还款接口", response = RestfulResponse.class)
    @RequestMapping("/repaymentAmount")
    public Response repaymentAmount(@Validated @RequestBody RepayInterfaceRequest repayInterfaceRequest) {
        try {
            //判断还款类型是为 1.提前划款 2.正常还款 3.逾期还款 4.展期还款
            switch (repayInterfaceRequest.getRepaytype()) {
                case "1":
                    //提前还款
                    String advanceCode = repayInterfaceService.advanceRepayment(repayInterfaceRequest.getWorkid(), repayInterfaceRequest.getRefundmoney(), repayInterfaceRequest.getRefundinterest(),
                            repayInterfaceRequest.getBreachofcontract(), repayInterfaceRequest.getRealityrefunddate());
                    if ("20002".equals(advanceCode)) {
                        return new ErrorEntity(StatusCode.OVERDUE_RECORD);
                    }
                    return new RestfulResponse();

                case "2":
                    //正常还款
                    String normalCode = repayInterfaceService.normalRepayment(repayInterfaceRequest.getWorkid(), repayInterfaceRequest.getRefundissue(),
                            repayInterfaceRequest.getRealityrefunddate(), repayInterfaceRequest.getRefundmoney(), repayInterfaceRequest.getRefundinterest());
                    if ("20002".equals(normalCode)) {
                        return new ErrorEntity(StatusCode.OVERDUE_RECORD);
                    } else if ("30027".equals(normalCode)) {
                        return new ErrorEntity(StatusCode.OVER_CAPITAL_OR_ACCRUAL_ERROR);
                    }
                    return new RestfulResponse();

                case "3":
                    //逾期还款
                    String overdueCode = repayInterfaceService.overdueRepayment(repayInterfaceRequest.getWorkid(), repayInterfaceRequest.getRefundissue(), repayInterfaceRequest.getRealityrefunddate(),
                            repayInterfaceRequest.getInterestmoney(), repayInterfaceRequest.getRefundinterest(), repayInterfaceRequest.getInterestmoney(), repayInterfaceRequest.getDelayingpayment());
                    if ("30028".equals(overdueCode)) {
                        return new ErrorEntity(StatusCode.NOT_OVERDUE_ERROR);
                    } else if ("30029".equals(overdueCode)) {
                        return new ErrorEntity(StatusCode.OVER_OVERDUE_ERROR);
                    }
                    return new RestfulResponse();
                case "4":
                    //展期还款
                    String extendedCode = repayInterfaceService.extendedRepayment(repayInterfaceRequest.getWorkid(), repayInterfaceRequest.getRefundissue(),
                            repayInterfaceRequest.getRealityrefunddate(), repayInterfaceRequest.getRefundmoney(), repayInterfaceRequest.getRefundinterest());
                    if ("20002".equals(extendedCode)) {
                        return new ErrorEntity(StatusCode.OVERDUE_RECORD);
                    } else if ("30027".equals(extendedCode)) {
                        return new ErrorEntity(StatusCode.OVER_CAPITAL_OR_ACCRUAL_ERROR);
                    }
                    return new RestfulResponse();
                default:
                    return null;
            }
        } catch (Exception e) {
            log.error(StatusCode.REPAY_INTERFACE_ERROR.message(), e);
            return new ErrorEntity(StatusCode.REPAY_INTERFACE_ERROR);
        }
    }
}
