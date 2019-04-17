package com.grape.smstask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.google.gson.JsonObject;
import com.grape.controller.bean.MessageDetail;
import com.grape.model.db.Smsparam;
import com.grape.service.SmsAlertsService;
import com.grape.tool.AliyunMessageTool;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class OverdueForPTask {
	
	@Autowired
	SmsAlertsService smsService;
	@Scheduled(cron="0 0 10 * * *")
	public void send(){
		
		
		try {
			log.info("开始执行发送逾期短信（客户）任务");
			
			List<Smsparam> smsparams = smsService.findSmsparamForOverdue();
			if(smsparams.size()>0){
				
				for (Smsparam smsparam : smsparams) {
					//查出需要发送逾期短信的客户
					List<Map<String, Object>> list = smsService.findOverdueList(smsparam.getProductno());
					if(list.size()>0){
						for (Map<String, Object> map : list) {
							String phone = (String) map.get("telnumber");
							String overday = String.valueOf(map.get("overduenum")) ;
							
							JsonObject jsonObject = new JsonObject();
							jsonObject.addProperty("day", overday);
							//调用阿里云发送短信
							Map<String, String> paramMap = new HashMap<>();
							paramMap.put("phoneNumber",phone);
					    	paramMap.put("msgSign", smsparam.getMsgsign());
					    	paramMap.put("templateCode",smsparam.getTemplatecode());
					    	paramMap.put("accessKeyId",smsparam.getAccesskeyid());
					    	paramMap.put("accessKeySecret",smsparam.getAccesskeysecret());
					    	paramMap.put("jsonContent", jsonObject.toString());
					    	
					    	//尝试发送次数
					    	String chance = smsparam.getSendchance();
					    	if(Util.isBlank(chance)){
					    		chance="1";
					    	}
					    	for (int i = 0; i < Integer.parseInt(chance); i++) {
					    		try {
					    			SendSmsResponse response =  AliyunMessageTool.sendSms(paramMap);
									if(response.getCode()!=null&&response.getCode().equals("OK")){
										log.info("逾期提醒"+MessageDetail.SMS_SEND_SUCCESS);
										break;
									}else{
										log.error("逾期提醒"+MessageDetail.SMS_SEND_FAIL+":"+response.getMessage());
									}
								} catch (Exception e) {
									log.error("逾期提醒"+MessageDetail.SMS_SEND_FAIL+":"+e.getMessage());
								}
					    		
							}
							
						}
					}
					
				}
				log.info("逾期短信（客户）任务执行完毕");
			}else{
				log.info("逾期类型短信参数为空，任务停止");
			}
			
		} catch (Exception e) {
			log.error(e);
		}
		
	}
	
}
