package com.grape.service.impl;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grape.context.ServerContext;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.reponse.bean.SLCitysBean;
import com.grape.controller.reponse.bean.SLLoginRespBean;
import com.grape.controller.reponse.bean.SLQueryPriceResponseBean;
import com.grape.controller.request.bean.SLLoginbean;
import com.grape.controller.request.bean.SLQueryPriceRequestBean;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exinterface;

import com.grape.service.ExchannelService;
import com.grape.service.ExinterfaceService;

import com.grape.service.HouseassessService;
import com.grape.service.ShilianService;


import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ShilianServiceImpl implements ShilianService {
	

	@Autowired
	RestTemplate template;
	@Autowired
	ExchannelService exchannelService;
	@Autowired
	HouseassessService houseassessService;
	@Autowired
	ExinterfaceService exinterfaceService;
	@Autowired
	ServerContext serverContext;

	@Override
	public SLQueryPriceResponseBean findSLQueryPrice(Exchannel exchannel,String queryid,String workid, int cityCode,
			String houseaddress,Float floorarea) {
		try {
		
			// 首先进行登录
			SLLoginbean loginbean = new SLLoginbean();
			loginbean.setUsername(exchannel.getUsername());
			loginbean.setPassword(exchannel.getPassword());

			HttpHeaders headersPost = new HttpHeaders();
			headersPost.setContentType(MediaType.APPLICATION_JSON_UTF8);
		
			HttpHeaders headersGet = new HttpHeaders();
			headersGet.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
			HttpEntity<SLLoginbean> httpEntity = new HttpEntity<SLLoginbean>(loginbean, headersPost);

			ResponseEntity<SLLoginRespBean> loginresult;
		
			/**
			 * 远程post请求验证账号密码获取token
			 */
			Exinterface exinterface1 = exinterfaceService.findExinterface1(MessageDetail.SHILIAN_ID);
			if(exinterface1==null){
				throw new NullPointerException("世联登录接口信息为空！");
			}
			loginresult = template.postForEntity(exinterface1.getUrl(), httpEntity,
					SLLoginRespBean.class);
			log.info("登录接口返回信息："+loginresult.getBody().toString());
			if (loginresult.getStatusCode().is2xxSuccessful()) {
				//保存查询历史
				serverContext.saveExqueryhist(null, workid, exinterface1.getInterfaceno(), "Y", loginresult.getBody().toString(), MessageDetail.SHILIAN_ID);
				// 登录成功进行下一步
				// 除登录外需要传入token
				headersGet.set("Authorization", "Basic " + loginresult.getBody().getToken());
				
				headersPost.set("Authorization", "Basic " + loginresult.getBody().getToken());
				
				HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<MultiValueMap<String, Object>>(null,
						headersGet);
				Exinterface exinterface2 = exinterfaceService.findExinterface2(MessageDetail.SHILIAN_ID);
				if(exinterface2==null){
					throw new NullPointerException("世联获取城市列表接口信息为空！");
				}
				ResponseEntity<String> citysResult = template.exchange(
						exinterface2.getUrl(), HttpMethod.GET, entity, String.class);

				log.info("城市接口返回信息:"+citysResult.toString());

				int cityid = 0; //获取世联对应的城市ID
				if (citysResult.getStatusCode().is2xxSuccessful()) {
					//保存查询历史
					serverContext.saveExqueryhist(null, workid, exinterface2.getInterfaceno(), "Y",citysResult.toString(), MessageDetail.SHILIAN_ID);
					
					List<SLCitysBean> citysBeans = new ObjectMapper().readValue(citysResult.getBody(),
							new TypeReference<List<SLCitysBean>>() {
							});

					for (SLCitysBean citysBean : citysBeans) {
						if (citysBean.getGBCode() == cityCode) {
							cityid = citysBean.getId();
							break;
						}
					}
					
					//获取城市ID后，根据城市ID和楼盘名称获取楼盘ID
				/*	String constructionUrl = "http://test.worldunion.cn:8620/QueryPrice/GetConstruction/"+cityid+"/"+martgagename;;
					ResponseEntity<SLConstructionBean> constructionBean = template.exchange(
							constructionUrl, HttpMethod.GET, entity, SLConstructionBean.class);
					
					
						int houseId = constructionBean.getBody().getID();*/
						
						//进行估价
						SLQueryPriceRequestBean queryPricebean = new SLQueryPriceRequestBean();
						queryPricebean.setAddress(houseaddress);
						queryPricebean.setCaseId(queryid);
						queryPricebean.setBuildArea(floorarea);
						// queryPricebean.setForward("西南");
						queryPricebean.setCityID(cityid);
						queryPricebean.setConstructionId(0);
						queryPricebean.setHouseId(0);
						queryPricebean.setBuildingId(0);

						HttpEntity<SLQueryPriceRequestBean> httpEntity2 = new HttpEntity<SLQueryPriceRequestBean>(
								queryPricebean, headersPost);

						ResponseEntity<String> result;
						Exinterface exinterface3 = exinterfaceService.findExinterface3(MessageDetail.SHILIAN_ID);
						if(exinterface3==null){
							throw new NullPointerException("世联自动估值接口信息为空！");
						}
						result = template.postForEntity(exinterface3.getUrl(),
								httpEntity2, String.class);
						
						log.info("综合估价接口返回信息："+result.getBody());
						if(result.getStatusCode().is2xxSuccessful()){
							//保存查询历史
							serverContext.saveExqueryhist(queryid, workid, exinterface3.getInterfaceno(), "Y",result.getBody(), MessageDetail.SHILIAN_ID);
							
							SLQueryPriceResponseBean queryPriceResponseBean = new ObjectMapper().readValue(result.getBody(),new TypeReference<SLQueryPriceResponseBean>() {
							});
							
								return queryPriceResponseBean;
						
							
						}else{
							//保存查询历史
							serverContext.saveExqueryhist(queryid, workid, exinterface3.getInterfaceno(), "N",result.getBody(), MessageDetail.SHILIAN_ID);
							
						}
						
					}else{
						//保存查询历史
						serverContext.saveExqueryhist(null, workid, exinterface2.getInterfaceno(), "N",citysResult.toString(), MessageDetail.SHILIAN_ID);
					}
				
					
			}else{
				//保存查询历史
				serverContext.saveExqueryhist(null, workid, exinterface1.getInterfaceno(), "Y", loginresult.getBody().toString(), MessageDetail.SHILIAN_ID);
			}
		} catch (Exception e) {
			log.warn(e.getMessage());
			throw new IllegalStateException(e);
		}
		return null;
	}
	
	
	public <T> T restTemplate(String url, Map<String,T> params, Class<T> var, HttpMethod method) {
	    RestTemplate restTemplate = new RestTemplate();
	    FormHttpMessageConverter fc = new FormHttpMessageConverter();
	    StringHttpMessageConverter s = new StringHttpMessageConverter(StandardCharsets.UTF_8);
	    List<HttpMessageConverter<?>> partConverters = new ArrayList<HttpMessageConverter<?>>();
	    partConverters.add(s);
	    partConverters.add(new ResourceHttpMessageConverter());
	    fc.setPartConverters(partConverters);
	    restTemplate.getMessageConverters().addAll(Arrays.asList(fc, new MappingJackson2HttpMessageConverter()));
	    MultiValueMap<String, T> map = new LinkedMultiValueMap<>();
	    map.setAll(params);
	    switch (method) {
	        case POST:
	            return restTemplate.postForObject(url, map, var);
	        case GET:
	            String getParams = "?" + map.keySet().stream().map(k -> String.format("%s={%s}", k, k)).collect(Collectors.joining("&"));
	            return restTemplate.getForObject(url + getParams, var, params);
	        default:
	            return restTemplate.postForObject(url, map, var);
	    }
	}


	@Override
	public SLQueryPriceResponseBean findSLqueryPriceRecord(String queryid,String workid) {
		try {
			Exinterface exinterface =null;
			Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.SHILIAN_ID);
			// 首先进行登录
			SLLoginbean loginbean = new SLLoginbean();
			loginbean.setUsername(exchannel.getUsername());
			loginbean.setPassword(exchannel.getPassword());

			HttpHeaders headersPost = new HttpHeaders();
			headersPost.setContentType(MediaType.APPLICATION_JSON_UTF8);
		
			HttpHeaders headersGet = new HttpHeaders();
			headersGet.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
			HttpEntity<SLLoginbean> httpEntity = new HttpEntity<SLLoginbean>(loginbean, headersPost);

			ResponseEntity<SLLoginRespBean> bean;
		
			/**
			 * 远程post请求验证账号密码获取token
			 */
			exinterface = exinterfaceService.findExinterface1(MessageDetail.SHILIAN_ID);
			if(exinterface==null){
				throw new NullPointerException("世联登录接口信息为空！");
			}
			bean = template.postForEntity(exinterface.getUrl(), httpEntity,
					SLLoginRespBean.class);
			log.info(bean.getBody().toString());
			if (bean.getStatusCode().is2xxSuccessful()) {
				//保存查询历史
				serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "Y", bean.getBody().toString(), MessageDetail.SHILIAN_ID);
				// 登录成功进行下一步
				// 除登录外需要传入token
				headersGet.set("Authorization", "Basic " + bean.getBody().getToken());
				
				
				
				HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<MultiValueMap<String, Object>>(null,
						headersGet);
				exinterface = exinterfaceService.findExinterface4(MessageDetail.SHILIAN_ID);
				if(exinterface==null){
					throw new NullPointerException("世联查询估价记录接口信息为空！");
				}
				ResponseEntity<String> result = template.exchange(
						exinterface.getUrl()+queryid, HttpMethod.GET, entity, String.class);
				
				log.info(result.toString());
				if(result.getStatusCode().is2xxSuccessful()){
					
					//保存查询历史
					serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "Y", result.toString(), MessageDetail.SHILIAN_ID);
					SLQueryPriceResponseBean queryPriceResponseBean = new ObjectMapper().readValue(result.getBody(),new TypeReference<SLQueryPriceResponseBean>() {});
					
					return queryPriceResponseBean;
					
					
				}else{
					//保存查询历史
					serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "N",result.toString(), MessageDetail.SHILIAN_ID);
				}
				
	
			}else{
				//保存查询历史
				serverContext.saveExqueryhist(null, workid, exinterface.getInterfaceno(), "N", bean.getBody().toString(), MessageDetail.SHILIAN_ID);
			}
		} catch (Exception e) {
			log.warn(e.getMessage());
			throw new IllegalStateException(e);
		}
		return null;
	}
	
	
	
}
