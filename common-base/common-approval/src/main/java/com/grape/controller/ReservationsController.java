package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.BnkincomeinfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.ReservationsResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.ReservationsRequest;
import com.grape.model.db.Reservations;
import com.grape.service.ReservationsService;
import com.grape.service.WorkflowService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/reservations")
public class ReservationsController {
	@Autowired
	ReservationsService reservationsService ;
	
	@Autowired
	private WorkflowForeign workflowfeign;
	
	@Autowired
	private WorkflowService workflowService;
	
	@ApiOperation(value="根据流水编号查询预约",notes="",response=ReservationsResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestParam("workid") String workid) {
		Reservations reser = reservationsService.queryByWorkid(workid) ;
		if (reser!=null) {
			return new ReservationsResponse(reser) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}
	
	@ApiOperation(value="插入预约下户时间",httpMethod="POST",notes="",response=ReservationsResponse.class)
	@RequestMapping("/insertReservations")
	public Response insertReservations(@RequestBody ReservationsRequest req) {
		FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid()) ;
		FlowHandleResponse res = new FlowHandleResponse();
		if(handlereq!=null){
			handlereq.setHisttype("9");
			handlereq.setNextActor(req.getNextactor());
			handlereq.setOperation(req.getOperation());
			if(!req.getOperation().equals("保存")) {
				res = workflowfeign.handle(handlereq) ;
				if(res.getCode()!=20000){
					return res;
				}
			}
		}else{
			return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
		}
		reservationsService.insertfacesign(req,res);
		return new RestfulResponse();
	}

}
