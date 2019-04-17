package com.grape.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import com.grape.controller.reponse.HuifawangResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.SusongResponse;
import com.grape.controller.reponse.bean.HFWresultBean;
import com.grape.controller.reponse.bean.HFWshixianBean;
import com.grape.controller.reponse.bean.HFWzhixingBean;
import com.grape.controller.request.HFWRequest;
import com.grape.controller.request.HFWupdateRequest;
import com.grape.controller.request.SusongRequest;
import com.grape.model.db.Litigationinfo;
import com.grape.model.db.Shixin;
import com.grape.model.db.Susong;
import com.grape.service.HuifawangService;


import io.swagger.annotations.ApiOperation;

@RestController
@Validated
@RequestMapping("/huifawang")
public class HuifawangController {
	
	@Autowired
	HuifawangService huifawangService;
	
	
	@ApiOperation(value="汇法网信息",httpMethod="POST",notes="返回汇法网信息",response = HuifawangResponse.class)
	@RequestMapping("/info")
	public Response info(@Validated @RequestBody HFWRequest req){
		try {
			HFWresultBean resultBean = huifawangService.findResultBean(req.getWorkid(), req.getUsername(), req.getCertid());
			if(resultBean!=null){
				List<HFWzhixingBean> hfWzhixingBeans = resultBean.getFxcontent().getZhixing();
				String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
				List<Susong> susongs = new ArrayList<>();
				if(hfWzhixingBeans.size()>0){
					//有诉讼记录
					
					//将诉讼记录保存到诉讼记录表
					for (HFWzhixingBean hfWzhixingBean : hfWzhixingBeans) {
						Susong susong = new Susong();
						susong.setKeyid(String.valueOf(hfWzhixingBean.getKeyid()));
						susong.setWorkid(req.getWorkid());
						susong.setTypet(String.valueOf(hfWzhixingBean.getTypet()));
						susong.setTypetname(hfWzhixingBean.getTypetname());
						susong.setTitle(hfWzhixingBean.getTitle());
						susong.setSslong(hfWzhixingBean.getSslong());
						susong.setName(hfWzhixingBean.getName());
						susong.setPersonid(hfWzhixingBean.getId());
						susong.setCasenum(hfWzhixingBean.getCasenum()); 
						susong.setCourt(hfWzhixingBean.getCourt());
						susong.setMoney(hfWzhixingBean.getMoney());
						susong.setContent(hfWzhixingBean.getContent());
						susong.setState(hfWzhixingBean.getState());
						susong.setRemark(hfWzhixingBean.getRemark());
						susong.setZblong(hfWzhixingBean.getZblong());
						susong.setWlmoney(hfWzhixingBean.getWlmoney());
						susong.setApply(hfWzhixingBean.getApply());
						susong.setChgdt(new Date());
						
						susong.setChgtl(workerid);
						susongs.add(susong);
						huifawangService.insertOrUpdateSusong(susong);

					}
					
				}
				List<HFWshixianBean> hfWshixianBeans = resultBean.getFxcontent().getShixin();
				List<Shixin> shixins = new ArrayList<>();
				if(hfWshixianBeans.size()>0){
					//有失信记录
					for (HFWshixianBean hfWshixianBean : hfWshixianBeans) {
						Shixin shixin = new Shixin();
						shixin.setKeyid(String.valueOf(hfWshixianBean.getKeyid()));
						shixin.setTypet(String.valueOf(hfWshixianBean.getTypet()));
						shixin.setTypetname(hfWshixianBean.getTypetname());
						shixin.setTitle(hfWshixianBean.getTitle());
						shixin.setSslong(hfWshixianBean.getSslong());
						shixin.setName(hfWshixianBean.getName());
						shixin.setId(hfWshixianBean.getId());
						shixin.setCasenum(hfWshixianBean.getCasenum()); 
						shixin.setCourt(hfWshixianBean.getCourt());
						shixin.setContent(hfWshixianBean.getContent());
						shixin.setTimetype(hfWshixianBean.getTimetype());
						shixin.setState(hfWshixianBean.getState());
						shixin.setRemark(hfWshixianBean.getRemark());
						shixin.setSxSf(hfWshixianBean.getSx_sf());
						shixin.setSxLx(hfWshixianBean.getSx_lx());
						shixin.setSxJt(hfWshixianBean.getSx_jt());
						shixin.setSxFb(hfWshixianBean.getSx_fb());
						shixin.setSxWh(hfWshixianBean.getSx_wh());
						shixin.setSxDw(hfWshixianBean.getSx_dw());
						shixin.setWlmoney(hfWshixianBean.getWlmoney());
						shixin.setWorkid(req.getWorkid());
						shixin.setChgdt(new Date());
						shixin.setChgtl(workerid);
						shixins.add(shixin);
						huifawangService.insertOrUpdateShixin(shixin);
					}
					
				}
				return new HuifawangResponse(susongs, shixins);
			}
			
			
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.HUIFAWANG_QUERY_FAIL);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.HUIFAWANG_QUERY_FAIL);
		}

	}
	
	/*@ApiOperation(value="客户诉讼信息",httpMethod="POST",notes="如果客户有诉讼记录返回客户诉讼信息",response = SusongResponse.class)
	@RequestMapping("/susong")
	public Response susong(@Validated @RequestBody SusongRequest req){
		try {
			List<Susong> susongs = huifawangService.findSusongByWorkid(req.getWorkid());
			
			return new SusongResponse(susongs);
			
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}

	}*/
	
	/*@ApiOperation(value="更新汇法网信息",httpMethod="POST",notes="将业务填写的诉讼状态、诉讼类型等传入更新汇法网信息",response = RestfulResponse.class)
	@RequestMapping("/uodate")
	public Response update(@Validated @RequestBody HFWupdateRequest req){
		Litigationinfo litigationinfo = new Litigationinfo();
		litigationinfo.setWorkid(req.getWorkid());
		litigationinfo.setCerdid(req.getCertid());
		litigationinfo.setLitigationstate(req.getLitigationstate());
		litigationinfo.setLitigationtype(req.getLitigationtype());
		litigationinfo.setTargetamount(new BigDecimal(req.getTargetamount()));
		litigationinfo.setChgdt(new Date());
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		litigationinfo.setChgtl(username);
		if(huifawangService.litigationinfoInsertOrUpdate(litigationinfo)){
			return new ErrorEntity(StatusCode.OK,MessageDetail.HUIFAWANG_UPDATE_SUCCESS);
		}
		return new ErrorEntity(StatusCode.OK,MessageDetail.HUIFAWANG_UPDATE_FAIL);
	}*/
}
