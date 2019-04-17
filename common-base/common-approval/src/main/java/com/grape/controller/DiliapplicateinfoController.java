package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.DiliapplicateinfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.DiliapplicateRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Deliapplicateinfo;
import com.grape.service.DiliapplicateinfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/deliapplicateinfo")
public class DiliapplicateinfoController {
	@Autowired
	private DiliapplicateinfoService deliappllicateinfoService;
	
	@ApiOperation(value="根据贷款申请编号和身份证号查询尽调抵押物信息接口",notes="尽调抵押物信息接口",httpMethod="POST",response=DiliapplicateinfoResponse.class)
	@RequestMapping("/queryApplyinfoByWorkid")
	public Response queryApplyinfoByWorkid(@RequestBody WorkidAndCerdidRequest req){
		Deliapplicateinfo list = deliappllicateinfoService.queryApplyByWorkid(req);
		if(list!=null){
			return new DiliapplicateinfoResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="新增尽调申请人信息接口",httpMethod="POST",notes="尽调申请人信息接口二",response=DiliapplicateinfoResponse.class)
	@RequestMapping("/insertApplicateinfo")
	public Response insertApplicateinfo(@RequestBody DiliapplicateRequest req){
		WorkidAndCerdidRequest request = new WorkidAndCerdidRequest() ;
		request.setCerdid(req.getCerdid());
		request.setWorkid(req.getWorkid());
		Deliapplicateinfo list = deliappllicateinfoService.queryApplyByWorkid(request);
		if(list!=null){
			deliappllicateinfoService.updateApplicateinfo(req);
		}else{
			deliappllicateinfoService.insertApplicateinfo(req);
		}
		return new RestfulResponse();
	}
	
	@ApiOperation(value="更新尽调申请人信息接口",httpMethod="POST",notes="尽调申请人信息接口二",response=DiliapplicateinfoResponse.class)
	@RequestMapping("/updateApplicateinfo")
	public Response updateApplicateinfo(@RequestBody DiliapplicateRequest req){
		deliappllicateinfoService.updateApplicateinfo(req);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="通过申请编号删除尽调申请人信息接口",httpMethod="POST",notes="尽调申请人信息接口二",response=DiliapplicateinfoResponse.class)
	@RequestMapping("/deleteApplicateinfo")
	public Response deleteApplicateinfo(@RequestParam("workid") String workid,@RequestParam("cerdid") String cerdid){
		deliappllicateinfoService.deleteApplicateinfo(workid,cerdid);
		return new RestfulResponse();
	}
}
