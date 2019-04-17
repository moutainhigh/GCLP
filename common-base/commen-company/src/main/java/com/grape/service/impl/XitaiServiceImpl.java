package com.grape.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.reponse.bean.XTQueryPriceResponseBean;
import com.grape.controller.request.bean.XTQueryPriceRequestBean;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exinterface;
import com.grape.model.mapper.base.DelimortgageMapper;
import com.grape.service.ExinterfaceService;
import com.grape.service.XitaiService;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class XitaiServiceImpl implements XitaiService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ExinterfaceService exinterfaceService;
	
	@Autowired
	DelimortgageMapper delimortgageMapper;
	
	
	@Override
	public XTQueryPriceResponseBean findQueryPrice(Exchannel exchannel,String citycode,String areacode,String mortgagename,String address,
			String floorarea,String floor,String height) {
		
		
		try{
			//获取接口信息
			Exinterface exinterface1 = exinterfaceService.findExinterface1(MessageDetail.XITAI_ID);
			if(exinterface1==null){
				throw new NullPointerException("禧泰评估接口信息为空");
			}
			
			//参数组装
			XTQueryPriceRequestBean priceRequestBean  = new XTQueryPriceRequestBean();
			
			String apiKey = exchannel.getAccesskeyid();
			priceRequestBean.setApiKey(apiKey);
			priceRequestBean.setCity(citycode);
			priceRequestBean.setDistrict(areacode);
			priceRequestBean.setHaname(mortgagename);
			priceRequestBean.setLocation(address);
			priceRequestBean.setBldgarea(floorarea);
			priceRequestBean.setFloor(floor);
			priceRequestBean.setHeight(height);
		
			
			HttpHeaders headersPost = new HttpHeaders();
			headersPost.setContentType(MediaType.APPLICATION_JSON_UTF8);
			List<MediaType> list = new ArrayList<>();
			list.add(MediaType.APPLICATION_JSON_UTF8);
			headersPost.setAccept(list);
			HttpEntity<String> httpEntity = new HttpEntity<String>(JSONObject.toJSON(priceRequestBean).toString(), headersPost);
			
			ResponseEntity<String> responseEntity = restTemplate.postForEntity(exinterface1.getUrl(), httpEntity, String.class);
			log.info("禧泰评估接口返回信息："+responseEntity.getBody());
			if(responseEntity.getStatusCode().is2xxSuccessful()){
				XTQueryPriceResponseBean priceResponseBean = new ObjectMapper().readValue(responseEntity.getBody(), new TypeReference<XTQueryPriceResponseBean>() {
				});
				if("1".equals(priceResponseBean.getStatuscode())){
					return priceResponseBean;
				}else{
					log.info("禧泰评估失败："+priceResponseBean.getDataInfo());
				}

			}
			
			
		} catch (Exception e) {
			log.warn(e.getMessage());
			throw new IllegalStateException(e);
		}
		return null;
	}

}
