package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grape.controller.reponse.DoctaskResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.DoctaskRequest;
import com.grape.service.DoctaskService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/doctask")
public class DoctaskController {
	@Autowired
	private DoctaskService docteskService ;
	
	@ApiOperation(value="根据workid更新设备编号",notes="",httpMethod="POST",response=DoctaskResponse.class)
	@RequestMapping("/queryApplyinfoByWorkid")
	public Response updateApplicateinfo(@RequestBody DoctaskRequest req){
		docteskService.updateDoctask(req);
		return new RestfulResponse();
	}
}
