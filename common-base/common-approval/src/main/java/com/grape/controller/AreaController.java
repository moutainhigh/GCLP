package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.AreaResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.AreaRequest;
import com.grape.model.db.Area;
import com.grape.service.AreaService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/area")
public class AreaController {
	@Autowired
	private AreaService areaService ;
	
	@RequestMapping("/queryByGbcode")
	@ApiOperation(value="根据国标编号查询相关的",httpMethod="POST",notes="接口",response=AreaResponse.class)
	public Response queryByGbcode(@RequestBody AreaRequest req) {
		List<Area> list = areaService.queryByGbcode(req) ;
		if(list != null) {
			return new AreaResponse(list) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}
}
