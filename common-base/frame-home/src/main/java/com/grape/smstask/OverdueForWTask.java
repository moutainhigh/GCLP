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
import com.grape.model.db.Person;
import com.grape.model.db.Smsparam;
import com.grape.service.PersonService;
import com.grape.service.SmsAlertsService;
import com.grape.tool.AliyunMessageTool;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class OverdueForWTask {
	
	@Autowired
	SmsAlertsService smsService;
	
	@Autowired
	PersonService personService;

	@Scheduled(cron="0 0 10 * * *")
	public void send(){
		
		
		try {
			log.info("开始执行发送逾期短信（内部）任务");
			
			List<Smsparam> smsparams = smsService.findSmsparamForOverdueForW();
			if(smsparams.size()>0){
				
				for (Smsparam smsparam : smsparams) {
					//发送渠道方逾期短信
					List<Map<String, Object>> channellist = smsService.findOverdueListInChannel(smsparam.getProductno());
					if(channellist.size()>0){
						for (Map<String, Object> map : channellist) {
							List<Person> persons = smsService.findPersonInDaihou((String) map.get("organizationid"), "DQ01");
							if(persons.size()>0){
								for (Person person : persons) {
									this.sendmsg(smsparam, map, person);
								}
								
							}
						}
					}
					
					
					//发送平台方逾期短信
					List<Map<String, Object>> terrcaelist = smsService.findOverdueListInTerrcae(smsparam.getProductno());
					if(terrcaelist.size()>0){
						for (Map<String, Object> map : terrcaelist) {
							List<Person> persons = smsService.findPersonInDaihou((String) map.get("organizationid"), "DP01");
							if(persons.size()>0){
								for (Person person : persons) {
									this.sendmsg(smsparam, map, person);
								}
								
							}
						}
					}
					
					
					//发送资金方逾期短信
					List<Map<String, Object>> fundlist = smsService.findOverdueListInFund(smsparam.getProductno());
					if(fundlist.size()>0){
						for (Map<String, Object> map : fundlist) {
							List<Person> persons = smsService.findPersonInDaihou((String) map.get("organizationid"), "DZ01");
							if(persons.size()>0){
								for (Person person : persons) {
									this.sendmsg(smsparam, map, person);
								}
								
							}
						}
					}
					
					
					//发送通道方逾期短信
					List<Map<String, Object>> aislelist = smsService.findOverdueListInAisle(smsparam.getProductno());
					if(aislelist.size()>0){
						for (Map<String, Object> map : aislelist) {
							List<Person> persons = smsService.findPersonInDaihou((String) map.get("organizationid"), "DT01");
							if(persons.size()>0){
								for (Person person : persons) {
									this.sendmsg(smsparam, map, person);
								}
								
							}
						}
					}
					
					
					//发送渠道经理逾期短信
					List<Map<String, Object>> userlist = smsService.findOverdueListInUserid(smsparam.getProductno());
					if(userlist.size()>0){
						for (Map<String, Object> map : userlist) {
							Person person = personService.findPersonByWorkeridOrPhone((String) map.get("userid"));
							
							this.sendmsg(smsparam, map, person);
								
							
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
	
	private void sendmsg(Smsparam smsparam,Map<String, Object> map,Person person) throws Exception{
		
			String phone = person.getMobilephone();
			String size = String.valueOf(map.get("size")) ;
			
			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("number", size);
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
					throw new Exception(e);
				}
	    		
			}
		
	}
}
