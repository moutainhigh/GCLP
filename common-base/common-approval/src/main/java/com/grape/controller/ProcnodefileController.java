package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.ProcnodefileResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.ProcnodefileRequest;
import com.grape.model.db.Procnodefile;
import com.grape.service.ProcnodefileService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/procnodefile")
public class ProcnodefileController {

	@Autowired
	private ProcnodefileService procnodefileService ;
	
	@RequestMapping("/queryByNodeidAndProcnodeno")
	@ApiOperation(value="根据节点和产品id",httpMethod="POST",notes="接口",response=ProcnodefileResponse.class)
	public Response queryByNodeidAndProcnodeno(@RequestBody ProcnodefileRequest req) {
		List<Procnodefile> list =procnodefileService.queryByNodeidAndProno(req) ;
		if(list != null) {
			return new ProcnodefileResponse(list) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;		
	}
	
	
}
