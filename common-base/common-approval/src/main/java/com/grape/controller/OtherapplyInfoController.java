package com.grape.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.OtherapplyInfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.OtherapplyinfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Otherapplyinfo;
import com.grape.service.OtherapplyinfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/otherapplyinfo")
public class OtherapplyInfoController {
	@Autowired
	private OtherapplyinfoService otherapplyinfoService;
	@ApiOperation(value="根据申请编号查询期待贷款申请信息",notes="期待贷款申请信息接口一",httpMethod="POST",response=OtherapplyInfoResponse.class)
	@RequestMapping("queryOtherapplyinfoByWorkid")
	public Response queryOtherapplyinfoByWorkid(@RequestBody WorkidRequest req){
		Otherapplyinfo other = otherapplyinfoService.queryOtherapplyinfoByWorkid(req);
		if(other!=null){
			return new OtherapplyInfoResponse(other);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("insertOtherapplyinfo")
	@ApiOperation(value="插入期待贷款申请信息",notes="期待贷款申请信息接口二",httpMethod="POST",response=OtherapplyInfoResponse.class)
	public Response insertOtherapplyinfo(@RequestBody OtherapplyinfoRequest req){
		Otherapplyinfo other = otherapplyinfoService.queryOtherapplyinfoByWorkid(req);
		if(other!=null){
			otherapplyinfoService.updateOtherapplyinfo(req);
		}else{
			otherapplyinfoService.insertOtherapplyinfo(req);
		}
	
		return new RestfulResponse();
	}
	
	@RequestMapping("updateOtherapplyinfo")
	@ApiOperation(value="更新期待贷款申请信息",notes="期待贷款申请信息接口三",httpMethod="POST",response=OtherapplyInfoResponse.class)
	public Response updateOtherapplyinfo(@RequestBody OtherapplyinfoRequest req){
		otherapplyinfoService.updateOtherapplyinfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteOtherapplyinfo")
	@ApiOperation(value="根据主键workid删除期待贷款申请信息",notes="期待贷款申请信息接口四",httpMethod="POST",response=OtherapplyInfoResponse.class)
	public Response deleteOtherapplyinfo(@RequestBody WorkidRequest req){
		otherapplyinfoService.deleteOtherapplyinfo(req);
		return new RestfulResponse();
	}
}
