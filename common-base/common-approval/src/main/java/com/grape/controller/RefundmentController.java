package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.RefundmentResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.HaveBackProcRequest;
import com.grape.controller.request.RefundfinanceRequest;
import com.grape.controller.request.RefundmentRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Doctask;
import com.grape.model.db.Refundment;
import com.grape.service.DoctaskService;
import com.grape.service.PaymentapplyinfoService;
import com.grape.service.RefundmentService;
import com.grape.service.WorkflowService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/refundment")
public class RefundmentController {
	@Autowired
	private WorkflowForeign workflowfeign;
	@Autowired
	private WorkflowService workflowService;
	@Autowired
	private RefundmentService refundementService;
	@Autowired
	private PaymentapplyinfoService paymentapplyinfoService;
	@Autowired
	private DoctaskService doctaskService;
	
	@ApiOperation(value="根据申请编号查询退款信息",notes="退款信息查询的第一个接口",response=RefundmentResponse.class,httpMethod="POST")
	@RequestMapping("/selectByWorkid")
	public Response selectRefundmentByWorkid(@RequestBody WorkidRequest req){
		Refundment refund = refundementService.selectRfundmentByWorkid(req);
		Doctask doc = doctaskService.queryByWorkid(req.getWorkid());
		String productno="";
		if(doc!=null){
			productno=doc.getProductno();
			if(productno.contains("SLD") || productno.contains("PRD")){
				productno = productno.substring(0, 3);
			}else{
				productno = productno.substring(0, 2);
			}
		}
		if(refund!=null){
			return new RefundmentResponse(refund,productno);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	@ApiOperation(value="新增退款信息",notes="退款信息查询的第二个接口",response=RefundmentResponse.class,httpMethod="POST")
	@RequestMapping("/insertRefundment")
	public Response insertRefundment(@RequestBody RefundmentRequest req){
		if(!req.getOperation().equals("保存")){
			FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid());
			if(handlereq!=null){
				FlowHandleResponse res = new FlowHandleResponse();
				handlereq.setHisttype("2");
				handlereq.setActor(req.getUserid());
				handlereq.setNextActor(req.getNextactor());
				handlereq.setOperation(req.getOperation());
				res=workflowfeign.handle(handlereq);
				if(res.getCode()!=20000){
					return res;
				}
			}else{
				return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
			}
		}
		Refundment refund = refundementService.selectRfundmentByWorkid(req.getWorkid());
		if(refund!=null){
			refundementService.updateRefundinfo(req);
		}else{
			refundementService.insertRfundment(req);
		}
		return new RestfulResponse();
	}
	
	@ApiOperation(value="是否需要退款",notes="退款信息查询的第三个接口",response=RefundmentResponse.class,httpMethod="POST")
	@RequestMapping("/updateHavebackproc")
	public Response updateHavebackproc(@RequestBody HaveBackProcRequest req){
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		paymentapplyinfoService.updatePayment(req);
		if(!req.getOperation().equals("保存")){
			FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid());
			FlowHandleResponse res = new FlowHandleResponse();
			handlereq.setHisttype("15");
			handlereq.setActor(userid);
			handlereq.setOperation(req.getOperation());
			res=workflowfeign.handle(handlereq);
			if(res.getCode()!=20000){
				return res;
			}
		}
		return new RestfulResponse();
	}
	
	@ApiOperation(value="新增退款财务一级审批",notes="财务退款审批信息新增接口",httpMethod="POST",response=RestfulResponse.class)
	@RequestMapping("/insertRefundfinance")
	public Response insertRefundfinance(@RequestBody @Validated RefundfinanceRequest refundfinance){
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		FlowHandleRequest handlereq=workflowService.selectWorkflow(refundfinance.getWorkid(),refundfinance.getNodeid());
		FlowHandleResponse res = new FlowHandleResponse();
		if(handlereq!=null){
			handlereq.setHisttype("15");
			handlereq.setActor(userid);
			handlereq.setNotation(refundfinance.getNotation());
			handlereq.setNextActor(refundfinance.getNextactor());
			handlereq.setOperation(refundfinance.getOperation());
			if(!refundfinance.getOperation().equals("保存")){
				res=workflowfeign.handle(handlereq);
				if(res.getCode()!=20000){
					return res;
				}
			}
		}else{
			return new ErrorEntity(StatusCode.NOWORKITEMFOUND_ERROR);
		}
		refundementService.insertRefundfinance(refundfinance,res);
		return new RestfulResponse();
	}
	
}
