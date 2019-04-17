package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.EquipmentResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.NotarizationResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.DeviceidRequest;
import com.grape.controller.request.EquipmentRequest;
import com.grape.controller.request.NotarizationRequest;
import com.grape.model.db.Equipment;
import com.grape.model.db.Notarization;
import com.grape.service.EquipmentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
	@Autowired
	private EquipmentService equipmentService ;
	
/*	@ApiOperation(value="新增尽调申请人信息接口",httpMethod="POST",notes="尽调申请人信息接口二",response=DiliapplicateinfoResponse.class)
	@RequestMapping("/insertApplicateinfo")
	public Response insertApplicateinfo(@RequestBody DiliapplicateRequest req){
		deliappllicateinfoService.insertApplicateinfo(req);
		return new RestfulResponse();
	}*/
	@ApiOperation(value="新增设备信息",httpMethod="POST",notes="",response=EquipmentResponse.class)
	@RequestMapping("/insertEquipment")
	public Response insertEquipment(@RequestBody EquipmentRequest req) {
		equipmentService.insertEquipment(req);
		return new RestfulResponse() ;
	}
	
	@ApiOperation(value="根据deviceid查询设备信息",httpMethod="POST",notes="",response=DeviceidRequest.class)
	@RequestMapping("/queryBydeviceid")
	public Response queryBydeviceid(@RequestBody DeviceidRequest req) {
		Equipment equ = equipmentService.queryBydeviceid(req) ;
		if(equ != null) {
			return new EquipmentResponse(equ) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}
}
