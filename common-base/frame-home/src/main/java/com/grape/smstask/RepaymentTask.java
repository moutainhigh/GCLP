package com.grape.smstask;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.google.gson.JsonObject;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.model.db.Smsparam;
import com.grape.service.SmsAlertsService;
import com.grape.tool.AliyunMessageTool;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class RepaymentTask {
	
	@Autowired
	SmsAlertsService smsService;

	@Scheduled(cron="0 0 10 * * *")
	public void send(){
		log.info("开始执行发送还款短信任务");

		try {
			List<Map<String, Object>> list;
			List<Smsparam> smsparamList = smsService.findSmsparamForRepayment();
			if(smsparamList.size()>0){
				for (Smsparam smsparam : smsparamList) {
					//短信发送频率
					String[] sendfreqs = smsparam.getSendfreq().split(",");

					if(sendfreqs.length>0){
						for (String sendfreq : sendfreqs) {
							//提前sendfreq天
							int day = Integer.parseInt(sendfreq);
							int startday = Integer.parseInt(Util.getDate())-day;
							String startdate = String.valueOf(startday);
							String enddate = String.valueOf(startday+1);
							list= smsService.findRepaymentList(startdate, enddate,smsparam.getProductno());
							if(list.size()>0){
								for (Map<String, Object> map : list) {
									//String custname = (String) map.get("custname");
									String telnumber = (String) map.get("telnumber");
									Date nextrepaydate = (Date) map.get("nextrepaydate");
									Calendar calendar = Calendar.getInstance();
									calendar.setTime(nextrepaydate);
									String nextmonth = String.valueOf(calendar.get(Calendar.MONTH)+1);
									String nextday= String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
									BigDecimal nextrefundmoney =  (BigDecimal) map.get("nextrefundmoney");
									JsonObject jsonObject = new JsonObject();
									jsonObject.addProperty("month", nextmonth);
									jsonObject.addProperty("year", nextday);
									jsonObject.addProperty("amont",nextrefundmoney.toString());
									
									
									//调用阿里云发送短信
									Map<String, String> paramMap = new HashMap<>();
									paramMap.put("phoneNumber",telnumber);
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
					}
				}
			}else{
				log.error("还款类型短信参数为空，任务停止");
			}
		} catch (Exception e) {
			log.error(e);
		}
		
	}
}
