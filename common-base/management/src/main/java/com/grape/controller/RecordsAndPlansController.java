package com.grape.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.LeftAmountResponse;
import com.grape.controller.reponse.RecordsAndPlansResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.PrePayRequest;
import com.grape.controller.request.RecordsAndPlansRequest;
import com.grape.controller.request.SaveRepaymentplanRequest;
import com.grape.model.db.Overdue;
import com.grape.model.db.Repayinfo;
import com.grape.model.db.Repayplan;
import com.grape.service.RecordsAndPlansService;
import com.grape.service.RepayInterfaceService;
import com.grape.util.PageBean;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

/**
 * @描述 还款计划模块
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/15 9:23
 */
@RestController
@RequestMapping("/recordsAndPlans")
@Validated
@Log4j
public class RecordsAndPlansController {

    @Autowired
    private RecordsAndPlansService recordsAndPlansService;
    
    @Autowired
    private RepayInterfaceService repayInterfaceService;

    /**
     * @描述 分页还款计划查询
     * @参数 [recordsAndPlansRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/15 10:39
     */
    @ApiOperation(value = "还款计划查询", httpMethod = "POST", notes = "还款计划查询测试接口", response = RecordsAndPlansResponse.class)
    @RequestMapping(value = "/recordsAndPlansResponse", method = RequestMethod.POST)
    public Response recordsAndPlansResponse(@Validated @RequestBody RecordsAndPlansRequest recordsAndPlansRequest) {
        try {
            PageBean pageBean = new PageBean(recordsAndPlansRequest.getPagenum(), recordsAndPlansRequest.getPagesize());
            return recordsAndPlansService.recordsAndPlansResponse(recordsAndPlansRequest.getWorkid(), pageBean);
        } catch (Exception e) {
            log.error(StatusCode.SELECT_RECORDSANDPLANS_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_RECORDSANDPLANS_ERROR);
        }
    }
    
    /**
     * @描述 提前还款剩余本金和利息查询
     * @参数 [LeftAmountResponse]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 cwc
     * @创建时间 2019/1/2 9:39
     */
    @ApiOperation(value = "提前还款剩余本金和利息查询", httpMethod = "POST", notes = "提前还款查询测试接口", response = LeftAmountResponse.class)
    @RequestMapping(value = "/prePayResponse", method = RequestMethod.POST)
    public Response PrePayResponse(@Validated @RequestBody PrePayRequest prePayRequest) {
    	//还款计划表本金
    	BigDecimal allAmount = new BigDecimal(0);
    	//还款计划表利息
    	BigDecimal allRateAmount = new BigDecimal(0);
    	//还款表本金
    	BigDecimal repayamount = new BigDecimal(0);
    	//还款表利息
    	BigDecimal repayrateAmount = new BigDecimal(0);
    	//剩余还款本金
    	BigDecimal amount = new BigDecimal(0);
    	//剩余换款利息
    	BigDecimal rateAmount = new BigDecimal(0);
    	//违约金
    	BigDecimal penalty = new BigDecimal(0);
        try {
        	List<Overdue> overdues = repayInterfaceService.selectOverdueResponse(prePayRequest.getWorkid());
        	//还款计划表中所有计划应还金额
            List<Repayplan> repayPlans = repayInterfaceService.selectPrePayResponse(prePayRequest.getWorkid(),prePayRequest.getRepaytype());
            if(repayPlans!=null && !repayPlans.isEmpty()){
            	String repaymethod = repayPlans.get(0).getRepaymethod();
            	for(int i=0;i<repayPlans.size();i++){
            		//所有应还本金
            		allAmount=allAmount.add(repayPlans.get(i).getRepaycapital());
            		//所有应还利息
            		allRateAmount=allRateAmount.add(repayPlans.get(i).getRepayaccrual());
            	}
            	//还款表总还款数据
            	List<Repayinfo> repayinfos = repayInterfaceService.selectRrpayInfoResponse(prePayRequest.getWorkid());
            	if(repayinfos!=null && !repayinfos.isEmpty()){
            		for(int j=0;j<repayinfos.size();j++){
            			//已还本金
            			repayamount=repayamount.add(repayinfos.get(j).getRefundmoney());
            			//已还利息
            			repayrateAmount = repayrateAmount.add(repayinfos.get(j).getRefundinterest());
            		}
            	}
            	amount=allAmount.subtract(repayamount);
            	rateAmount=allRateAmount.subtract(repayrateAmount);
            	//先息后本按剩余本金1%算
            	if(repaymethod.equals("3")){
            		penalty=amount.multiply(new BigDecimal(0.01)).setScale(2, RoundingMode.HALF_UP);
            	//等额本息和自主月供按剩余本金2%计算
            	}else if(repaymethod.equals("2") || repaymethod.equals("4")){
            		penalty=amount.multiply(new BigDecimal(0.02)).setScale(2, RoundingMode.HALF_UP);
            	}
            }
            return new LeftAmountResponse(amount.toString(),rateAmount.toString(),penalty.toString());
        } catch (Exception e) {
            log.error(StatusCode.SELECT_RECORDSANDPLANS_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SELECT_RECORDSANDPLANS_ERROR);
        }
    }

    /**
     * @描述 生成还款计划
     * @参数 [saveRepaymentplanRequest]
     * @返回值 com.grape.controller.reponse.Response
     * @创建人 zyh
     * @创建时间 2018/11/15 11:07
     */
    @ApiOperation(value = "生成还款计划", httpMethod = "POST", notes = "生成还款计划测试接口", response = RestfulResponse.class)
    @RequestMapping(value = "/saveRepaymentplan", method = RequestMethod.POST)
    public Response saveRepaymentplan(@Validated @RequestBody SaveRepaymentplanRequest saveRepaymentplanRequest) {
        try {
            recordsAndPlansService.saveRepaymentplan(saveRepaymentplanRequest.getWorkid());
            return new RestfulResponse();
        } catch (Exception e) {
            log.error(StatusCode.SAVE_REPAYMENTPLAN_ERROR.message(), e);
            return new ErrorEntity(StatusCode.SAVE_REPAYMENTPLAN_ERROR);
        }
    }
}
