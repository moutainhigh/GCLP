package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.AreaResponse;
import com.grape.controller.reponse.BnkaccountResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.BnkAccountRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Bnkaccount;
import com.grape.service.BnkaccountService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/bnkaccount")
public class BnkaccountController {
	@Autowired
	private BnkaccountService bnkaccountService ;
	
	@RequestMapping("insertBnkaccount")
	@ApiOperation(value="插入银行账户信息",notes="",httpMethod="POST",response=BnkaccountResponse.class)
	public Response insertBnkaccount(@RequestBody BnkAccountRequest req){
		Bnkaccount bnk = bnkaccountService.queryBnkaccountByWorkid(req.getWorkid()) ;
		if(bnk!=null){
			bnkaccountService.updateBnkaccount(req);
		}else{
			bnkaccountService.insertBnkaccount(req);
		}
	
		return new RestfulResponse();
	}
	
	@RequestMapping("updateBnkaccount")
	@ApiOperation(value="更新银行账户申请信息",notes="",httpMethod="POST",response=BnkaccountResponse.class)
	public Response updateBnkaccount(@RequestBody BnkAccountRequest req){
		bnkaccountService.updateBnkaccount(req) ;
		return new RestfulResponse();
	}
	
	@RequestMapping("queryBnkaccount")
	@ApiOperation(value="查询银行账户信息",notes="",httpMethod="POST",response=BnkaccountResponse.class)
	public Response queryBnkaccount(@RequestBody WorkidRequest req){
		Bnkaccount Bnkaccount = bnkaccountService.queryBnkaccountByWorkid(req.getWorkid()) ;
		if(Bnkaccount != null) {
			return new BnkaccountResponse(Bnkaccount) ;
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR) ;
		}
	}
}
