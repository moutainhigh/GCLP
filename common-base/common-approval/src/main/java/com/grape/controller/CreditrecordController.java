package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.CreditrecordResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.CreditrecodeRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Creditrecode;
import com.grape.service.CreditrecordService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/creditrecord")
public class CreditrecordController {
	@Autowired
	private CreditrecordService creditrecordService;
	
	@RequestMapping("queryByWorkid")
	@ApiOperation(value="根据申请编号查询信用记录",notes="信用记录接口一",httpMethod="POST",response=CreditrecordResponse.class)
	public Response queryByWorkid(@RequestBody WorkidAndCerdidRequest req){
		Creditrecode credit = creditrecordService.queryCreditByWorkid(req);
		if(credit!=null){
			return new CreditrecordResponse(credit);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("insertCreditrecord")
	@ApiOperation(value="插入信用记录",notes="信用记录接口二",httpMethod="POST",response=CreditrecordResponse.class)
	public Response insertCreditrecord(@RequestBody CreditrecodeRequest req){
		creditrecordService.insertCreditInfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("updateCreditrecord")
	@ApiOperation(value="更新信用记录",notes="信用记录接口二",httpMethod="POST",response=CreditrecordResponse.class)
	public Response updateCreditrecord(@RequestBody CreditrecodeRequest req){
		creditrecordService.updateCreditrecord(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteCreditrecord")
	@ApiOperation(value="根据主键workid删除信用记录",notes="信用记录接口二",httpMethod="POST",response=CreditrecordResponse.class)
	public Response deleteCreditrecord(@RequestBody WorkidAndCerdidRequest req){
		creditrecordService.deleteCreditrecord(req);
		return new RestfulResponse();
	}
}
