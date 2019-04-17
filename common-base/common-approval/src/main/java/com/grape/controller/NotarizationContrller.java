package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.NotarizationResponse;
import com.grape.controller.reponse.ReservationsResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.NotarizationRequest;
import com.grape.model.db.Notarization;
import com.grape.service.NotarizationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/notarization")
public class NotarizationContrller {
	@Autowired
	NotarizationService notarizationService ;
	
	@ApiOperation(value="根据流水编号查询预约",notes="",response=NotarizationResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestBody NotarizationRequest req) {
		Notarization notar = notarizationService.queryByWorkid(req) ;
		if (notar!=null) {
			return new NotarizationResponse(notar) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}
	
	@ApiOperation(value="插入预约时间",httpMethod="POST",notes="",response=ReservationsResponse.class)
	@RequestMapping("/insertNotarization")
	public Response insertNotarization(@RequestBody NotarizationRequest req) {
		notarizationService.insertNotarize(req);
		return new RestfulResponse();
	}
}
