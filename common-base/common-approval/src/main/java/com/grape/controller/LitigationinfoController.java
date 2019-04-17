package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.LitigationinfoResponse;
import com.grape.controller.reponse.LitigationinfoResponse1;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.WorkidAndCerdidAndQuerytypeReq;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Litigationinfo;
import com.grape.service.LitigationinfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Litigationinfo")
public class LitigationinfoController {
	
	@Autowired
	private LitigationinfoService litigationinfoService ;
	
	@ApiOperation(value="详细查询诉讼信息",notes="",response=LitigationinfoResponse1.class,httpMethod="POST")
	@RequestMapping("/queryByThreeid")
	public Response queryByThreeid(@RequestBody WorkidAndCerdidAndQuerytypeReq req){
		Litigationinfo litigationinfo = litigationinfoService.selectByThreeid(req) ;
		return new LitigationinfoResponse1(litigationinfo) ;		
	}
	
	@ApiOperation(value="查询诉讼信息",notes="",response=LitigationinfoResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkidAndCerdid")
	public Response queryByWorkidAndCerdid(@RequestBody WorkidAndCerdidRequest req){
		List<Litigationinfo> list = litigationinfoService.selectLitiByCerdidAndWorkid(req) ; 
		if(!list.isEmpty() && list.size() > 0){
			return new LitigationinfoResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);		
	}

}
