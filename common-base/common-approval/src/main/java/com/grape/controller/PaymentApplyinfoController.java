package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.GroommortgageBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.PaymentapplyinfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.PaymentapplyinfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.Mortgage;
import com.grape.model.db.Paymentapplyinfo;
import com.grape.service.MortgageService;
import com.grape.service.PaymentapplyinfoService;
import com.grape.service.WorkflowService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/paymentApplyinfo")
public class PaymentApplyinfoController {
	@Autowired
	private WorkflowForeign workflowfeign;
	@Autowired
	private WorkflowService workflowService;
	@Autowired
	private PaymentapplyinfoService paymentapplyinfoService;
	@Autowired
	private MortgageService mortgageService;
	
	@RequestMapping("/insertPayment")
	@ApiOperation(value="新增放款申请信息",notes="放款申请信息接口一",httpMethod="POST",response=FlowHandleResponse.class)
	public Response insertPaymentapplyinfo(@RequestBody PaymentapplyinfoRequest req){
		FlowHandleResponse res = new FlowHandleResponse();
		Paymentapplyinfo info=paymentapplyinfoService.selectPaymentapplyinfo(req.getWorkid());
		if(!req.getOperation().equals("保存")){
			FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid());
			if(handlereq!=null){
				handlereq.setHisttype("5");
				handlereq.setActor(req.getUserid());
				handlereq.setNextActor(req.getNextactor());
				handlereq.setOperation(req.getOperation());
				res=workflowfeign.handle(handlereq);
				if(res.getCode()!=20000){
					return res;
				}
				if(info!=null){
					paymentapplyinfoService.updatePaymentapplyinfo(req,res);
				}else{
					paymentapplyinfoService.insertPaymentapplyinfo(req,res);
				}
			}
		}else{
			if(info!=null){
				paymentapplyinfoService.updatePaymentapplyinfo(req,res);
			}else{
				paymentapplyinfoService.insertPaymentapplyinfo(req,res);
			}
		}
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectPaymentByWorkid")
	@ApiOperation(value="放款申请信息",notes="放款申请信息接口一",httpMethod="POST",response=PaymentapplyinfoResponse.class)
	public Response selectPaymentByWorkid(@RequestBody WorkidRequest req){
		Paymentapplyinfo info=paymentapplyinfoService.selectPaymentapplyinfo(req.getWorkid());
		List<Groommortgage> mortgagelist = paymentapplyinfoService.selectGroommortgage(req);
		List<GroommortgageBean> grromlist = new ArrayList<>() ;
		if(mortgagelist!=null && !mortgagelist.isEmpty()){
			for (Groommortgage groommortgage : mortgagelist) {
				GroommortgageBean groommortgageBean = new GroommortgageBean() ;
				try {
					Util.transferFields(groommortgage, groommortgageBean);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Mortgage mortgage = mortgageService.selectByMortgageid(groommortgage.getMortgageid()) ;
				groommortgageBean.setMartgagename(mortgage.getMartgagename());
				grromlist.add(groommortgageBean) ;
			}
		}
		if(info!=null){
			return new PaymentapplyinfoResponse(info,grromlist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
}
