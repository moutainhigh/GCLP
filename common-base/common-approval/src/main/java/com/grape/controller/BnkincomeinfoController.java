package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.BnkincomeinfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Bnkincomeinfo;
import com.grape.service.BnkincomeinfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/bnkincome")
public class BnkincomeinfoController {
	@Autowired
	private BnkincomeinfoService bnkincomeinfoService;
	@ApiOperation(value="根据申请编号查询银行流水",notes="银行流水信息接口一",response=BnkincomeinfoResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestBody WorkidRequest req){
		List<Bnkincomeinfo> list = bnkincomeinfoService.queryByWorkid(req.getWorkid());
		if(list!=null){
			return new BnkincomeinfoResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	

}
