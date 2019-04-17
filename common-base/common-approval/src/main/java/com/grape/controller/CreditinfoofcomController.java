package com.grape.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.CreditinfoofcomResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.CreditinfoofcomRequest;
import com.grape.model.db.Creditinfoofcom;
import com.grape.service.CreditinfoofcomService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/creditinfoofcom")
public class CreditinfoofcomController {
	@Autowired
	private CreditinfoofcomService CreditinfoofcomService;
	@ApiOperation(value="根据申请编号查询公司信用记录",notes="公司信用记录接口一",response=CreditinfoofcomResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestParam("workid") String workid){
		Creditinfoofcom list = CreditinfoofcomService.queryByWorkid(workid);
		if(list!=null){
			return new CreditinfoofcomResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="更新公司信用记录",notes="公司信用记录接口二",response=CreditinfoofcomResponse.class,httpMethod="POST")
	@RequestMapping("/savecreditofcom")
	public Response savecreditofcom(@RequestBody CreditinfoofcomRequest req){
		CreditinfoofcomService.saveCreditinfoofcom(req);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="删除公司信用记录",notes="公司信用记录接口三",response=CreditinfoofcomResponse.class,httpMethod="POST")
	@RequestMapping("/deletecreditofcom")
	public Response deletecreditofcom(@RequestParam("workid") String workid){
		CreditinfoofcomService.deleteCreditinfoofcom(workid);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="新增公司信用记录",notes="公司信用记录接口四",response=CreditinfoofcomResponse.class,httpMethod="POST")
	@RequestMapping("/insertcreditofcom")
	public Response insertcreditofcom(@RequestBody CreditinfoofcomRequest req){
		CreditinfoofcomService.insertCreditinfoofcom(req);
		return new RestfulResponse();
	}
}
