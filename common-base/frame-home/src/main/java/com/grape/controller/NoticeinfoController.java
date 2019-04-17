package com.grape.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.NoticeinfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.NoticeinfoAddRequest;
import com.grape.controller.request.NoticeinfoFindRequest;
import com.grape.model.db.Noticeinfo;
import com.grape.model.mapper.PageBean;
import com.grape.service.NoticeinfoService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/notice")
@Validated
public class NoticeinfoController {
		
	@Autowired
	NoticeinfoService noticeinfoService;
	
	
	@ApiOperation(value = "新增公告信息",httpMethod="POST",notes="新增公告信息",response=RestfulResponse.class)
    @RequestMapping("/add")
	public Response add(@Validated @RequestBody NoticeinfoAddRequest req){
		
		Noticeinfo noticeinfo = new Noticeinfo();
		noticeinfo.setId(Util.getID());
		noticeinfo.setNoticetitle(req.getNoticetitle());
		noticeinfo.setNoticecontent(req.getNoticecontent());
		noticeinfo.setNewstime(new Date());
		noticeinfo.setChgdt(new Date());
		
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		noticeinfo.setIssuer(username);
		noticeinfo.setChgtl(username);
		
		if(noticeinfoService.NoticeinfoAdd(noticeinfo)){
			return new ErrorEntity(StatusCode.OK,MessageDetail.MESSAGE_ADD_SUCCESS);
		}
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.MESSAGE_ADD_FAIL);
		
	}
	
	@ApiOperation(value = "公告信息查询",httpMethod="POST",notes="返回最新公告信息",response=NoticeinfoResponse.class)
    @RequestMapping("/info")
	public Response info(){
		
		//目前默认查询5条
		
		PageBean pageBean = new PageBean(1, 5);
		
		List<Noticeinfo> noticeinfos = noticeinfoService.findNoticeinfosByDate(pageBean);
		
		if(noticeinfos!=null){
			return new NoticeinfoResponse(noticeinfos);
		}
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		
	}
	
	@ApiOperation(value = "公告信息查询",httpMethod="POST",notes="返回最新公告信息(以时间段查询)",response=NoticeinfoResponse.class)
    @RequestMapping("/info_date")
	public Response info_date(@Validated @RequestBody NoticeinfoFindRequest req){
		
		//目前默认查询5条
		
		PageBean pageBean = new PageBean(1, 5);
		
		
		List<Noticeinfo> noticeinfos = noticeinfoService.findNoticeinfoByDateOf(req.getStartdate(), req.getEnddate(), pageBean);
		
		if(noticeinfos!=null){
			return new NoticeinfoResponse(noticeinfos);
		}
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		
	}
}
