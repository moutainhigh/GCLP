package com.grape.controller;

import com.grape.model.db.Redemptiontype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.RedemptiontypeResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.RedemptiontypeRequest;
import com.grape.service.RedemptiontypeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/redemptiontype")
public class RedemptiontypeController {
	
	@Autowired
	private RedemptiontypeService redemptiontypeService ;
	
	@RequestMapping("/insertRedemptiontype")
	@ApiOperation(value="添加赎楼方案", httpMethod="POST",notes="接口",response=RedemptiontypeResponse.class)
	public Response insertRedmptiontype(@RequestBody RedemptiontypeRequest req) {
		Redemptiontype redemptiontype = redemptiontypeService.findRedemptiontypeByWorkid(req.getWorkid()) ;
		if(null != redemptiontype) {
			req.setId(redemptiontype.getId());
			redemptiontypeService.updateRedmptiontype(req);
		}else {
			redemptiontypeService.insertRedemptiontype(req);
		}
		return new RestfulResponse();
	}

}
