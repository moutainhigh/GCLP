package com.grape.service.impl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.grape.context.ServerContext;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.reponse.bean.WaihuCalllog;
import com.grape.controller.reponse.bean.WaihuCalllogResult;
import com.grape.model.db.Codetable;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exinterface;
import com.grape.model.db.Person;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.service.CustinfoService;
import com.grape.service.ExchannelService;
import com.grape.service.ExinterfaceService;
import com.grape.service.WaihuService;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;
@Service
@Log4j
public class WaihuServiceImpl implements WaihuService{
	
	@Autowired
	ExchannelService exchannelService;
	@Autowired
	RestTemplate template;
	@Autowired
	PersonMapper personMapper;
	@Autowired
	ExinterfaceService exinterfaceService;
	@Autowired
	ServerContext serverContext;
	
	@Autowired
	CustinfoService custinfoService;
	
	@Autowired
	CodetableMapper codetableMapper;
	
	@Override
	public String getToken(String workid) {
		try {
			Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.WAIHU_ID);
			if (exchannel != null && exchannel.getOpenflg().equals("Y")) {
				Exinterface exinterface1 = exinterfaceService.findExinterface1(MessageDetail.WAIHU_ID);
				if (exinterface1 == null) {
					throw new NullPointerException("外呼系统获取鉴权token接口信息为空");
				}
				String email = exchannel.getUsername();
				String password = exchannel.getPassword();

				HttpHeaders headersPost = new HttpHeaders();
				headersPost.setContentType(MediaType.APPLICATION_JSON);

				JSONObject json = new JSONObject();
				json.put("email", email);
				json.put("password", password);

				HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headersPost);
				ResponseEntity<String> responseEntity = template.postForEntity(exinterface1.getUrl(), entity,
						String.class);
				log.info("返回鉴权token信息：" + responseEntity.getBody());
				if (responseEntity.getStatusCode().is2xxSuccessful()) {
					// 保存查询记录
					serverContext.saveExqueryhist(null, workid, exinterface1.getInterfaceno(), "Y",
							responseEntity.getBody(), MessageDetail.WAIHU_ID);
					JSONObject jsonObject = JSONObject.parseObject(responseEntity.getBody());
					int code = (int) jsonObject.get("code");
					if (code == 1000) {

						// 获取鉴权token后，发送请求获取客户token
						String jianquantoken = (String) jsonObject.get("open_api_auth_token");

						// 将鉴权token放入请求头
						headersPost.set("open_api_token", jianquantoken);

						// 获取当前登录用户外呼系统邮箱
						String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal()
								.toString();
						Person person = personMapper.selectByPrimaryKey(username);
						if (person == null) {
							throw new NullPointerException(MessageDetail.PERSON_NULL_ERROR);
						}
						String agent_email = person.getWaihuemail();
						// 获取签名
						long timestamp = System.currentTimeMillis() / 1000;
						String sign = Util.getSignature(email, jianquantoken, timestamp);

						JSONObject jsonObject2 = new JSONObject();
						jsonObject2.put("email", email);
						jsonObject2.put("agent_email", agent_email);
						jsonObject2.put("timestamp", timestamp);
						jsonObject2.put("sign", sign);
						log.info("请求参数" + jsonObject2);
						log.info("请求头" + headersPost);
						Exinterface exinterface2 = exinterfaceService.findExinterface2(MessageDetail.WAIHU_ID);
						if (exinterface2 == null) {
							throw new NullPointerException("外呼系统获取客户token接口信息为空");
						}
						HttpEntity<String> entity2 = new HttpEntity<String>(jsonObject2.toString(), headersPost);
						ResponseEntity<String> result = template.postForEntity(exinterface2.getUrl(), entity2,
								String.class);

						log.info("返回客服token信息" + result.getBody());
						if (result.getStatusCode().is2xxSuccessful()) {
							

							JSONObject kefu = JSONObject.parseObject(result.getBody());
							int returncode = (int) kefu.get("code");
							if (returncode == 1000) {
								// 保存查询记录
								serverContext.saveExqueryhist(null, workid, exinterface2.getInterfaceno(), "Y",
										responseEntity.getBody(), MessageDetail.WAIHU_ID);
								return (String) kefu.get("agent_api_token");
							}else {
								// 保存查询记录
								serverContext.saveExqueryhist(null, workid, exinterface2.getInterfaceno(), "N",
										responseEntity.getBody(), MessageDetail.WAIHU_ID);
							}

						} 

					}

				} else {
					// 保存查询记录
					serverContext.saveExqueryhist(null, workid, exinterface1.getInterfaceno(), "N",
							responseEntity.getBody(), MessageDetail.WAIHU_ID);
				}

			} else {
				throw new IllegalStateException(MessageDetail.WAIHU_OPEN_FAIL);
			}

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
		return null;
		
	
	}

	@Override
	public String WaihuCallout(String workid,String number) {
		try {
			Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.WAIHU_ID);
			if (exchannel != null && exchannel.getOpenflg().equals("Y")) {
				Exinterface exinterface3 = exinterfaceService.findExinterface3(MessageDetail.WAIHU_ID);
				if (exinterface3 == null) {
					throw new NullPointerException("外呼系统坐席外呼接口信息为空");
				}
				
				//请求头
				HttpHeaders headersPost = new HttpHeaders();
				headersPost.setContentType(MediaType.APPLICATION_JSON);
				
				// 获取当前登录用户外呼系统邮箱
				String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal()
						.toString();
				Person person = personMapper.selectByPrimaryKey(username);
				if (person == null) {
					throw new NullPointerException(MessageDetail.PERSON_NULL_ERROR);
				}
				String agent_email = person.getWaihuemail();
				String timestamp = Util.getDateFourteen(new Date());
				
				String exString = "agent_email=" + agent_email + "&number=" + number+"&timestamp=" + timestamp+"&"+exchannel.getSecret();
				
				String sign = DigestUtils.md5Hex(exString);
				//拼装URL。。。
				String finalUrl = exinterface3.getUrl()+"?agent_email=" + agent_email + "&number=" + number+"&timestamp=" + timestamp+"&sign="+sign;
				log.info("url:"+finalUrl);
				HttpEntity<String> entity = new HttpEntity<String>(null, headersPost);
			//	ResponseEntity<String> responseEntity = template.postForEntity(finalUrl, entity,String.class);
				ResponseEntity<String> responseEntity = template.exchange(finalUrl, HttpMethod.POST, entity, String.class);
				log.info("返回信息：" + responseEntity.getBody());
				if (responseEntity.getStatusCode().is2xxSuccessful()) {
					
					JSONObject jsonObject = JSONObject.parseObject(responseEntity.getBody());
					int code = (int) jsonObject.get("code");
					if(code==1000){
						// 保存查询记录
						serverContext.saveExqueryhist(null, workid, exinterface3.getInterfaceno(), "Y",
								responseEntity.getBody(), MessageDetail.WAIHU_ID);
						return (String) jsonObject.get("call_id");
					}} else {
						// 保存查询记录
						serverContext.saveExqueryhist(null, workid, exinterface3.getInterfaceno(), "N",
								responseEntity.getBody(), MessageDetail.WAIHU_ID);
					}

			} else {
				throw new IllegalStateException(MessageDetail.WAIHU_OPEN_FAIL);
			}

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
		return null;
	}

	@Override
	public WaihuCalllog getWaihuCalllog(String workid,String callid) {
		try {
			Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.WAIHU_ID);
			if (exchannel != null && exchannel.getOpenflg().equals("Y")) {
				Exinterface exinterface4 = exinterfaceService.findExinterface4(MessageDetail.WAIHU_ID);
				if (exinterface4 == null) {
					throw new NullPointerException("外呼系统获取通话记录接口信息为空");
				}
				
				//请求头
				HttpHeaders headersGet = new HttpHeaders();
				headersGet.setContentType(MediaType.parseMediaType("application/x-www-form-urlencoded; charset=UTF-8"));
				
				String timestamp = Util.getDateFourteen(new Date());
				
				String exString = "call_id=" + callid +"&timestamp=" + timestamp+"&"+exchannel.getSecret();
				
				String sign = DigestUtils.md5Hex(exString);
				
				//拼装URL。。。
				String finalUrl = exinterface4.getUrl()+"?call_id=" + callid +"&timestamp=" + timestamp+"&sign="+sign;
				log.info("finalURL:"+finalUrl);
				HttpEntity<String> entity = new HttpEntity<String>(null, headersGet);
				ResponseEntity<String> responseEntity = template.getForEntity(finalUrl, String.class, entity);
				log.info("通话记录接口返回信息：" + responseEntity.getBody());
				if (responseEntity.getStatusCode().is2xxSuccessful()) {
					
					JSONObject jsonObject = JSONObject.parseObject(responseEntity.getBody());
					int code = (int) jsonObject.get("code");
					if(code==1000){
						// 保存查询记录
						serverContext.saveExqueryhist(null, workid, exinterface4.getInterfaceno(), "Y",
								responseEntity.getBody(), MessageDetail.WAIHU_ID);
						WaihuCalllogResult calllogResult = JSONObject.parseObject(responseEntity.getBody(), new TypeReference<WaihuCalllogResult>(){});
						if(calllogResult.getCode()==1000){
							return calllogResult.getCall_log();
						}
						/*if(calllog!=null){
							//判断客户类型
							String certid = String.valueOf(calllog.getCustomer_id());
							Custinfo custinfo = custinfoService.findCustinfoByPrimarkey(workid, certid);
							if(custinfo!=null){
								String custtype = custinfo.getCusttype();
								String[] custtypes = custtype.split(",");
								StringBuilder builder = new StringBuilder();
								for (String string : custtypes) {
									Codetable codetable = codetableMapper.selectByPrimaryKey("CUSTTYPE", string);
									builder.append(","+codetable.getCoddes());
								}
								calllog.setCustomer_type(builder.toString().substring(1));
							}
						}*/
						
						
					}} else {
						// 保存查询记录
						serverContext.saveExqueryhist(null, workid, exinterface4.getInterfaceno(), "N",
								responseEntity.getBody(), MessageDetail.WAIHU_ID);
					}

			} else {
				throw new IllegalStateException(MessageDetail.WAIHU_OPEN_FAIL);
			}

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
		return null;
	}

	@Override
	public Codetable findCodetableForCUSTTYPE(String custtype) throws Exception{
		
		return codetableMapper.selectByPrimaryKey("CUSTTYPE", custtype);
	}
	
	
}
