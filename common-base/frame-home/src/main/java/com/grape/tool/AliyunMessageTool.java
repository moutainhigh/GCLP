package com.grape.tool;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import lombok.extern.log4j.Log4j;
@Log4j
public class AliyunMessageTool {
	

	
	private static final String product = "Dysmsapi";
    //产品域名,开发者无需替换
    private static final String domain = "dysmsapi.aliyuncs.com";

    // 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
 //   private static final String accessKeyId = "LTAIR769wTQ5mhxX";
 //   private static final String accessKeySecret = "EhC2Jw0k8ECVp8SnUU7I7M5hKBfM9w";

    public static SendSmsResponse sendSms(Map<String, String> paramMap) throws com.aliyuncs.exceptions.ClientException {

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou",paramMap.get("accessKeyId"),paramMap.get("accessKeySecret"));
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(paramMap.get("phoneNumber"));
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(paramMap.get("msgSign"));
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(paramMap.get("templateCode"));
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam(paramMap.get("jsonContent"));

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
//        request.setSmsUpExtendCode(paramMap.get("extendCode"));

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
//        request.setOutId(paramMap.get("outId"));

        //hint 此处可能会抛出异常，注意catch
        try {
        	SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
        	 return sendSmsResponse;
		} catch (Exception e) {
			log.error("短信发送出错："+e.getMessage());
			throw new IllegalStateException(e);
		}
        
       
    }
    
    public static void main(String[] args) {
    	
    	Map<String, String> paramMap = new HashMap<>();
    	paramMap.put("phoneNumber", "13537668044");
    	paramMap.put("msgSign", "四海财富");
    	paramMap.put("templateCode", "SMS_105285020");
    	String number=RandomStringUtils.randomNumeric(6);
    	paramMap.put("jsonContent", "{\"code\":\""+number+"\"}");
		try {
			SendSmsResponse response = new AliyunMessageTool().sendSms(paramMap);
			System.out.println(response.getCode());
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

