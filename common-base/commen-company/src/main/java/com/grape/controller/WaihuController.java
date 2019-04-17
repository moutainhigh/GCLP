package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.context.ServerContext;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.WaihuCalllogResponse;
import com.grape.controller.reponse.WaihuCustinfoResponse;
import com.grape.controller.reponse.WaihuResponse;
import com.grape.controller.reponse.bean.WaihuCalllog;
import com.grape.controller.reponse.bean.WaihuCustinfo;
import com.grape.controller.request.AssessmentRequest;
import com.grape.controller.request.WaihuCalloutRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Callhist;
import com.grape.model.db.Codetable;
import com.grape.model.db.Verifyopinion;
import com.grape.service.CallhistService;
import com.grape.service.CustinfoService;
import com.grape.service.VerifyopinionService;
import com.grape.service.WaihuService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@Validated
@RequestMapping("/waihu")
@Log4j
public class WaihuController {
	
	@Autowired
	WaihuService waihuService;
	
	@Autowired
	VerifyopinionService verifyopinionService;
	
	@Autowired
	ServerContext serverContext;
	
	@Autowired
	CallhistService callhistServie;
	@Autowired
	CustinfoService custinfoService;
	
	@ApiOperation(value="获取客户列表",httpMethod="POST",notes="返回电话核实意见需要的客户信息列表",response = WaihuCustinfoResponse.class)
	@RequestMapping("/custinfo")
	public Response custinfo(@Validated @RequestBody WorkidRequest req){ 
		try {
			List<WaihuCustinfo> custlist =  new ArrayList<>();
			List<WaihuCustinfo> mainlist = custinfoService.findMainborrower(req.getWorkid());
			List<WaihuCustinfo> colist = custinfoService.findCoborrower(req.getWorkid());
			List<WaihuCustinfo> gulist = custinfoService.findGuarantor(req.getWorkid());
			List<WaihuCustinfo> molist = custinfoService.findMortgagor(req.getWorkid());
			custlist.addAll(mainlist);
			custlist.addAll(colist);
			custlist.addAll(gulist);
			custlist.addAll(molist);
			 
			return new WaihuCustinfoResponse(custlist);
			
		} catch (Exception e) {
			log.error(MessageDetail.QUERY_ERROR+":"+e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.OPRATION_FAIL);
		}

	}
	
	@ApiOperation(value="外呼系统获取客户token",httpMethod="POST",notes="返回外呼系统客户token",response = WaihuResponse.class)
	@RequestMapping("/token_kefu")
	public Response token_kefu(@Validated @RequestBody WorkidRequest req){
		try {
			String token = waihuService.getToken(req.getWorkid());
			if(!Util.isBlank(token)){
				return new WaihuResponse(token);
			}
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
			
		} catch (Exception e) {
			log.error(MessageDetail.QUERY_ERROR+":"+e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}

	}
	
	/*@ApiOperation(value="坐席外呼",httpMethod="POST",notes="返回操作成功或失败",response = RestfulResponse.class)
	@RequestMapping("/callout")
	public Response callout(@Validated @RequestBody WaihuCalloutRequest req){
		try {
			
			String callid = waihuService.WaihuCallout(req.getWorkid(), req.getCustphone());
			if(!Util.isBlank(callid)){
				//保持获取到的callid，获取通话记录时用到
				serverContext.saveCallhist(req.getWorkid(), callid, req.getCustname(), req.getCustphone(), req.getCusttype());
				return new ErrorEntity(StatusCode.OK,MessageDetail.OPRATION_SUCCESS);
			}
			
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.OPRATION_FAIL);
			
			
		} catch (Exception e) {
			log.error(MessageDetail.OPRATION_FAIL+":"+e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.OPRATION_FAIL);
		}

	}*/
	@ApiOperation(value="保存通话记录",httpMethod="POST",notes="返回操作成功或失败",response = RestfulResponse.class)
	@RequestMapping("/calllist_save")	
	public Response calllist_save(@Validated @RequestBody WaihuCalloutRequest req){
		try {
			
			
			//保存callid，获取通话记录时用到
			serverContext.saveCallhist(req.getWorkid(), req.getCallid(), req.getCustname(), req.getCustphone(), req.getCusttype());
			return new ErrorEntity(StatusCode.OK,MessageDetail.OPRATION_SUCCESS);
			
			
			
		} catch (Exception e) {
			log.error(MessageDetail.OPRATION_FAIL+":"+e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.OPRATION_FAIL);
		}

	}
	@ApiOperation(value="保存电话核实意见",httpMethod="POST",notes="返回操作成功或失败",response = RestfulResponse.class)
	@RequestMapping("/notation_save")
	public Response notation_save(@Validated @RequestBody AssessmentRequest req){
		try {
			
			serverContext.saveVerifyopinion(req.getWorkid(), req.getNotation(), "");
			return new ErrorEntity(StatusCode.OK,MessageDetail.OPRATION_SUCCESS);
			
		} catch (Exception e) {
			log.error(MessageDetail.QUERY_ERROR+":"+e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.OPRATION_FAIL);
		}

	}
	@ApiOperation(value="获取通话记录",httpMethod="POST",notes="返回通话记录信息和电话核实意见",response = WaihuCalllogResponse.class)
	@RequestMapping("/calllog_get")
	public Response calllog_get(@Validated @RequestBody WorkidRequest req){
		try {
			//查询该流水下所有的通话记录id
			List<Callhist> callhists = callhistServie.findCallhistByWorkid(req.getWorkid());
			List<WaihuCalllog> calllogs = new ArrayList<>();
			if(callhists.size()>0){
				
				for (Callhist callhist : callhists) {
					//查询对应callid的通话记录
					WaihuCalllog calllog = waihuService.getWaihuCalllog(req.getWorkid(), callhist.getCallid());
					if(calllog!=null){
						Codetable codetable = waihuService.findCodetableForCUSTTYPE(callhist.getCusttype());
						calllog.setCustomer_type(codetable.getCoddes());
						calllog.setCustomer_name(callhist.getCustname());
						calllogs.add(calllog);
					}
					
				}
				
			}
			
			//获取电话核实意见
			Verifyopinion verifyopinion = verifyopinionService.findVerifyopinionById(req.getWorkid());
			String notation = "" ;
			if(verifyopinion!=null){
				notation = verifyopinion.getPhoneopinion();
				if(Util.isBlank(notation)){
					notation = "";
				}
			}
			return new WaihuCalllogResponse(calllogs,notation);
		} catch (Exception e) {
			log.error(MessageDetail.QUERY_ERROR+":"+e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}

	}
}
