package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.ReservationsResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.VisaResponse;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.VisaRequest;
import com.grape.model.db.Visa;
import com.grape.service.VisaService;
import com.grape.service.WorkflowService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/visa")
public class VisaController {
	
	@Autowired
	VisaService visaService ;
	
	@Autowired
	private WorkflowForeign workflowfeign;
	
	@Autowired
	private WorkflowService workflowService;
	
	@ApiOperation(value="根据流水编号查询预约",notes="",response=VisaResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestParam String workid) {
		Visa visa = visaService.queryByWorkid(workid) ;
		if(visa != null) {
			return new VisaResponse(visa) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="插入预约面签时间",httpMethod="POST",notes="",response=VisaResponse.class)
	@RequestMapping("/insertReservations")
	public Response insertVisa(@RequestBody VisaRequest req) {
		FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid()) ;
		FlowHandleResponse res = new FlowHandleResponse();
		handlereq.setHisttype("8");
		handlereq.setNextActor(req.getNextactor());
		handlereq.setOperation(req.getOperation());
		res = workflowfeign.handle(handlereq) ;
		if(res.getCode()!=20000){
			return res;
		}
		visaService.insertVisa(req,res);
		return new RestfulResponse() ;
	}
}
