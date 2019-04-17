package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.IncomeofcomResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.IncomeofcomRequest;
import com.grape.model.db.Incomeofcom;
import com.grape.service.IncomeofcomService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Incomeofcom")
public class IncomeofcomController {

	@Autowired
	private IncomeofcomService IncomeofcomService;
	@ApiOperation(value="根据申请编号和公司编号查询公司收入情况",notes="公司收入情况接口一",response=IncomeofcomResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestParam("workid") String workid,@RequestParam("comno") String comno){
		Incomeofcom list = IncomeofcomService.queryByWorkidAndComno(workid, comno);
		if(list!=null){
			return new IncomeofcomResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="更新公司收入情况",notes="公司收入情况接口二",response=IncomeofcomResponse.class,httpMethod="POST")
	@RequestMapping("/savecreditofcom")
	public Response savecreditofcom(@RequestBody IncomeofcomRequest req){
		IncomeofcomService.saveIncomeofcom(req);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="删除公司收入情况",notes="公司信用收入情况三",response=IncomeofcomResponse.class,httpMethod="POST")
	@RequestMapping("/deletecreditofcom")
	public Response deletecreditofcom(@RequestParam("workid") String workid,@RequestParam("comno") String comno){
		IncomeofcomService.deleteIncomeofcom(workid,comno);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="新增公司收入情况",notes="公司收入情况接口四",response=IncomeofcomResponse.class,httpMethod="POST")
	@RequestMapping("/insertcreditofcom")
	public Response insertcreditofcom(@RequestBody IncomeofcomRequest req){
		IncomeofcomService.insertIncomeofcom(req);
		return new RestfulResponse();
	}
}
