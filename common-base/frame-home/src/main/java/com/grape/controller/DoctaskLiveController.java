package com.grape.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.DoctaskLiveResponse;

import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;

import com.grape.controller.reponse.bean.DoctaskUnfinish;
import com.grape.controller.request.CommenPageRequest;

import com.grape.model.mapper.PageBean;

import com.grape.service.DoctaskService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/live")
@Validated
@Log4j
public class DoctaskLiveController {
		
	@Autowired
	private DoctaskService doctaskService;
	
	@ApiOperation(value = "直播流水信息",httpMethod="POST",notes="返回正在直播的流水信息",response=DoctaskLiveResponse.class)
    @RequestMapping("/info")
    public Response info(@Validated @RequestBody CommenPageRequest req) {
		try {
			
			PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
			List<DoctaskUnfinish> doctaskLives = doctaskService.findDoctaskForLive(pageBean);
			
			return new DoctaskLiveResponse(pageBean.getRecordCount().toString(),doctaskLives);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	

}
