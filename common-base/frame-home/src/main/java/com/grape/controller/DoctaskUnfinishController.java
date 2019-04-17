package com.grape.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.DoctaskUnfinishResponse;
import com.grape.controller.reponse.DoctaskUnfinishResponse2;
import com.grape.controller.reponse.DoctaskUpdateResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.bean.DoctaskUnfinish;
import com.grape.controller.reponse.bean.DoctaskUnfinish2;

import com.grape.controller.request.CommenPageRequest;
import com.grape.controller.request.DoctaskUnfinishRequest;
import com.grape.model.db.Doctask;
import com.grape.model.mapper.PageBean;

import com.grape.service.DoctaskService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/unfinish")
@Validated
@Log4j
public class DoctaskUnfinishController {
		
	@Autowired
	private DoctaskService doctaskService;
	
	@ApiOperation(value = "未完成流水信息",httpMethod="POST",notes="返回未完成的流水信息",response=DoctaskUnfinishResponse.class)
    @RequestMapping("/info")
    public Response info(@Validated @RequestBody CommenPageRequest req) {
		try {
			
			PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
			List<DoctaskUnfinish> doctaskUnfinishs = doctaskService.findDoctaskUnfinishAll(pageBean);
			
			return new DoctaskUnfinishResponse(pageBean.getRecordCount().toString(),doctaskUnfinishs);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	
	@ApiOperation(value = "未完成流水详细信息",httpMethod="POST",notes="返回未完成流水的详细信息",response=DoctaskUnfinishResponse2.class)
    @RequestMapping("/detail")
    public Response detail(@Validated @RequestBody DoctaskUnfinishRequest req) {
		try {
			
			DoctaskUnfinish2 doctaskUnfinish2 = doctaskService.findDoctaskUnfinish(req.getWorkid());
			if(doctaskUnfinish2!=null){
				return new DoctaskUnfinishResponse2(doctaskUnfinish2);
			}else{
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.DOCTASK_NULL_ERROR);
			}
			
			} catch (Exception e) {
				log.error(e.getMessage());
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		
			}
	}
	
	@ApiOperation(value = "更新未完成订单状态",httpMethod="POST",notes="将流水从未完成状态移除",response=RestfulResponse.class)
    @RequestMapping("/update")
    public Response update(@Validated @RequestBody DoctaskUnfinishRequest req) {
		
			Doctask doctask = doctaskService.findDoctaskByWorkid(req.getWorkid());
			if(doctask==null){
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.DOCTASK_NULL_ERROR);
			}
			doctask.setIntostate("");
			if(doctaskService.updateDoctask(doctask)){
				return new ErrorEntity(StatusCode.OK,MessageDetail.DOCTASK_UPDATE_SUCCESS);
			}
			return new ErrorEntity(StatusCode.OK,MessageDetail.DOCTASK_UPDATE_FALE);
	
	}
	
	@ApiOperation(value = "新增未完成订单",httpMethod="POST",notes="新增未完成订单",response=RestfulResponse.class)
    @RequestMapping("/add")
    public Response add(@Validated @RequestBody DoctaskUnfinishRequest req) {
		
			Doctask doctask = doctaskService.findDoctaskByWorkid(req.getWorkid());
			if(doctask==null){
				
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.DOCTASK_NULL_ERROR);
			}
			doctask.setIntostate("1");
			if(doctaskService.updateDoctask(doctask)){
				
				return new ErrorEntity(StatusCode.OK,MessageDetail.DOCTASK_UPDATE_SUCCESS);
			}
			return new ErrorEntity(StatusCode.OK,MessageDetail.DOCTASK_UPDATE_FALE);
	
	}
	@ApiOperation(value = "新增未完成订单",httpMethod="POST",notes="新增未完成订单",response=DoctaskUpdateResponse.class)
    @RequestMapping("/add_app")
    public Response add_app(@Validated @RequestBody DoctaskUnfinishRequest req) {
		
			Doctask doctask = doctaskService.findDoctaskByWorkid(req.getWorkid());
			if(doctask==null){
				
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.DOCTASK_NULL_ERROR);
			}
			doctask.setIntostate("1");
			if(doctaskService.updateDoctask(doctask)){
				
				return new DoctaskUpdateResponse("Y");
			}
			return new DoctaskUpdateResponse("N");
	
	}
	
	@ApiOperation(value = "删除未完成订单",httpMethod="POST",notes="删除未完成订单",response=RestfulResponse.class)
    @RequestMapping("/delete")
    public Response delete(@Validated @RequestBody DoctaskUnfinishRequest req) {
		
			Doctask doctask = doctaskService.findDoctaskByWorkid(req.getWorkid());
			if(doctask==null){
				
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.DOCTASK_NULL_ERROR);
			}
			if(doctaskService.deleteDoctaskWith(doctask)){
				return new ErrorEntity(StatusCode.OK,MessageDetail.DOCTASK_DELETE_SUCCESS);
			}
			return new ErrorEntity(StatusCode.OK,MessageDetail.DOCTASK_DELETE_FALE);
	
	}
}
