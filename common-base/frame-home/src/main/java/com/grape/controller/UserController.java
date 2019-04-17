package com.grape.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;

import com.grape.controller.reponse.PasswordResetResponse2;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.TestResponse;
import com.grape.controller.reponse.UserinfoResponse;
import com.grape.controller.reponse.bean.Userinfo;
import com.grape.controller.request.PasswordChangeReq;
import com.grape.controller.request.PasswordForgetReq;
import com.grape.controller.request.PasswordForgetReq2;
import com.grape.controller.request.PasswordForgetReq3;
import com.grape.controller.request.PasswordResetReq;
import com.grape.controller.request.PersonRequest;
import com.grape.controller.request.TestRequest;
import com.grape.model.db.Area;
import com.grape.model.db.AreaExample;
import com.grape.model.db.Person;
import com.grape.model.db.Productarea;
import com.grape.model.db.ProductareaExample;
import com.grape.model.db.Smsparam;
import com.grape.model.db.Userrole;
import com.grape.model.mapper.base.AreaMapper;

import com.grape.model.mapper.base.ProductareaMapper;

import com.grape.service.PersonService;
import com.grape.service.RedisService;
import com.grape.service.SmsAlertsService;
import com.grape.service.UserinfoService;
import com.grape.tool.AliyunMessageTool;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/user")
@Validated

@Log4j
public class UserController {
	
	@Autowired
	private UserinfoService userinfoSerice;
	@Autowired
	private PersonService personService;
	@Autowired
	private RedisService redisService;
	@Autowired
	private SmsAlertsService smsAlertsService;

	@Autowired
	AreaMapper areaMapper;
	@Autowired
	ProductareaMapper productareaMapper;
	
	@ApiOperation(value = "用户信息",httpMethod="POST",notes="获取用户信息",response=UserinfoResponse.class)
    @RequestMapping("/info")
    public Response info() {
		//Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		
		Person person = personService.findPersonByWorkeridOrPhone(username);
		
		Userinfo userinfo = userinfoSerice.findUserinfoByWorkerid(person.getWorkerid());
		if(userinfo!=null){
			return new UserinfoResponse(userinfo);
		}
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
    }
	
	
	@ApiOperation(value = "修改密码",httpMethod="POST",notes="修改密码",response=RestfulResponse.class)
    @RequestMapping("/change")
    public Response change(@Validated @RequestBody PasswordChangeReq req) {
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		
		Person person = personService.findPersonByWorkeridOrPhone(username);
		
		if(!personService.checkPassword(person, req.getOldPassword())){
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.PASSWORD_ERROR);
		}else{
			
			if(personService.updatePassword(person,req.getNewPassword())){
				return new ErrorEntity(StatusCode.OK,MessageDetail.PASSWORD_UPDATE_SUCCESS);
			}
		}
		
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.PASSWORD_UPDATE_FAIL);
    }
	

	
	@ApiOperation(value = "重置密码（权限）",httpMethod="POST",notes="重置密码（系统管理员权限）",response=RestfulResponse.class)
    @RequestMapping("/reset")
    public Response reset(@Validated @RequestBody PasswordResetReq req) {
		
		//可能要校验权限
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		if(username==null){
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.PERSON_NULL_ERROR);
		}
		List<Userrole> userroles = userinfoSerice.findUserroleByUsername(username);
		for (Userrole userrole : userroles) {
			if(userrole.getRoleid().equals("0101")){
				if(personService.resetPassword(req.getUsername(),req.getNewPassword())){
					return new ErrorEntity(StatusCode.OK);
				}
			}else{
				return new ErrorEntity(StatusCode.PERMISSIONS_ERROR);
			}
		}
		
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.PASSWORD_RESET_FAIL);
    }
	@ApiOperation(value = "忘记密码第一步（获取验证码）",httpMethod="POST",notes="忘记密码第一步（获取验证码）",response=RestfulResponse.class)
    @RequestMapping("/forget_getkey")
    public Response forget_getkey(@Validated @RequestBody PasswordForgetReq req) {
		
		//生成随机6位验证码
		String keyCode = RandomStringUtils.randomNumeric(6);
		//String keyCode = "123456"; //测试暂用
		
		
			//调用阿里云服务发送短信
				
				try {
					//验证是否有此号码的用户
					Person person = personService.findPersonByPhone(req.getPhone());
					if(person==null){
						return new ErrorEntity(StatusCode.FAIL,MessageDetail.PERSON_NULL_ERROR);
					}
					Smsparam smsparam = smsAlertsService.findSmsparamForCode();
					
					Map<String, String> paramMap = new HashMap<>();
					paramMap.put("phoneNumber", req.getPhone());
			    	paramMap.put("msgSign", smsparam.getMsgsign());
			    	paramMap.put("templateCode",smsparam.getTemplatecode());
			    	paramMap.put("accessKeyId",smsparam.getAccesskeyid());
			    	paramMap.put("accessKeySecret",smsparam.getAccesskeysecret());
			    	paramMap.put("jsonContent", "{\"code\":\""+keyCode+"\"}");
					SendSmsResponse response =  AliyunMessageTool.sendSms(paramMap);
					if(response.getCode()!=null&&response.getCode().equals("OK")){
						//发送短信成功将验证码存进redis
						redisService.set(req.getPhone()+"_reset", 600, keyCode);
						
						return new ErrorEntity(StatusCode.OK,"短信发送成功");
					}else{
						return new ErrorEntity(StatusCode.FAIL,"短信发送失败");
					}
					
				} catch (ClientException e) {
					return new ErrorEntity(StatusCode.FAIL,"短信发送失败");
				}
				
    }
	@ApiOperation(value = "忘记密码第二步（校验验证码）",httpMethod="POST",notes="忘记密码第二步（校验验证码）",response=PasswordResetResponse2.class)
    @RequestMapping("/forget_valikey")
    public Response forget_valikey(@Validated @RequestBody PasswordForgetReq2 req) {
		
		//校验验证码
		try {
			String keycode=redisService.get(req.getPhone()+"_reset");
			if(Util.isBlank(keycode)){
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.KEYCODE_FAIL);
			}
			if(keycode.equals(req.getKeyCode())){
				//返回8位数的校验码
				String resultCode =RandomStringUtils.randomAlphanumeric(8);
			    redisService.set(req.getPhone()+"_check",600,resultCode); 
				
				return new PasswordResetResponse2(resultCode);
			}else{
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.KEYCODE_ERROR);
			}
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
		}
		
		
		
		
		
		
    }
	
	@ApiOperation(value = "忘记密码第三步（密码重置）",httpMethod="POST",notes="忘记密码第三步（密码重置）",response=RestfulResponse.class)
    @RequestMapping("/forget_reset")
    public Response forget_reset(@Validated @RequestBody PasswordForgetReq3 req) {
		
		String resultCode = redisService.get(req.getPhone()+"_check");
		if(Util.isBlank(resultCode)){
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.VALICODE_FAIL);
		}else if(!resultCode.equals(req.getValicode())){
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.VALICODE_ERROR);
		}
		Person person = personService.findPersonByPhone(req.getPhone());
		if(person==null){
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.PERSON_NULL_ERROR);
		}
		
		if(personService.resetPasswordByPerson(person, req.getNewPassword())){
			return new ErrorEntity(StatusCode.OK,MessageDetail.PASSWORD_RESET_SUCCESS);
		} 

		return new ErrorEntity(StatusCode.FAIL,MessageDetail.PASSWORD_RESET_FAIL);
    }
	
	@ApiOperation(value = "新增用户供测试",httpMethod="POST",notes="新增用户供测试",response=RestfulResponse.class)
    @RequestMapping("/useradd")
    public Response useradd(@Validated @RequestBody PersonRequest req) {
		
		if(personService.useradd(req.getPerson())){
			return new ErrorEntity(StatusCode.OK);
		}
		
		return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
    }
	
	@ApiOperation(value = "添加sql",httpMethod="POST",response=RestfulResponse.class)
    @RequestMapping("/test")
    public Response test(@Validated @RequestBody TestRequest req) {
		List<Area> areas;
		AreaExample areaExample = new AreaExample();
		areaExample.createCriteria().andAreacodeEqualTo("HUANAN");
		/*.andAreacodeEqualTo("HUAZHONG")
		.andAreacodeEqualTo("HUABEI")
		.andAreacodeEqualTo("HUAXI")
		.andAreacodeEqualTo("HUAZHONG");*/
		 areas = areaMapper.selectByExample(areaExample);
		if(areas.size()>0){
			for (Area area : areas) {
				ProductareaExample productareaExample = new ProductareaExample();
				productareaExample.createCriteria().andAreaidEqualTo(area.getAreaid());
				List<Productarea> productareas = productareaMapper.selectByExample(productareaExample);
				if(productareas.size()<=0){
					for (int i = 1; i < 5; i++) {
						Productarea productarea = new Productarea();
						productarea.setAreaid(area.getAreaid()); 
						productarea.setProductno("SLD00"+i);
						productareaMapper.insert(productarea);
					}
				}
				
			}
		}
		AreaExample areaExample2 = new AreaExample();
		areaExample.createCriteria().andAreacodeEqualTo("HUABEI");
		/*.andAreacodeEqualTo("HUAZHONG")
		.andAreacodeEqualTo("HUABEI")
		.andAreacodeEqualTo("HUAXI")
		.andAreacodeEqualTo("HUAZHONG");*/
		areas= areaMapper.selectByExample(areaExample2);
		if(areas.size()>0){
			for (Area area : areas) {
				ProductareaExample productareaExample = new ProductareaExample();
				productareaExample.createCriteria().andAreaidEqualTo(area.getAreaid());
				List<Productarea> productareas = productareaMapper.selectByExample(productareaExample);
				if(productareas.size()<=0){
					for (int i = 1; i < 5; i++) {
						Productarea productarea = new Productarea();
						productarea.setAreaid(area.getAreaid()); 
						productarea.setProductno("SLD00"+i);
						productareaMapper.insert(productarea);
					}
				}
				
			}
		}
		AreaExample areaExample3 = new AreaExample();
		areaExample.createCriteria().andAreacodeEqualTo("HUAZHONG");
		/*.andAreacodeEqualTo("HUAZHONG")
		.andAreacodeEqualTo("HUABEI")
		.andAreacodeEqualTo("HUAXI")
		.andAreacodeEqualTo("HUAZHONG");*/
		 areas = areaMapper.selectByExample(areaExample3);
		if(areas.size()>0){
			for (Area area : areas) {
				ProductareaExample productareaExample = new ProductareaExample();
				productareaExample.createCriteria().andAreaidEqualTo(area.getAreaid());
				List<Productarea> productareas = productareaMapper.selectByExample(productareaExample);
				if(productareas.size()<=0){
					for (int i = 1; i < 5; i++) {
						Productarea productarea = new Productarea();
						productarea.setAreaid(area.getAreaid()); 
						productarea.setProductno("SLD00"+i);
						productareaMapper.insert(productarea);
					}
				}
				
			}
		}
		AreaExample areaExample4 = new AreaExample();
		areaExample.createCriteria().andAreacodeEqualTo("HUAXI");
		/*.andAreacodeEqualTo("HUAZHONG")
		.andAreacodeEqualTo("HUABEI")
		.andAreacodeEqualTo("HUAXI")
		.andAreacodeEqualTo("HUAZHONG");*/
		 areas = areaMapper.selectByExample(areaExample4);
		if(areas.size()>0){
			for (Area area : areas) {
				ProductareaExample productareaExample = new ProductareaExample();
				productareaExample.createCriteria().andAreaidEqualTo(area.getAreaid());
				List<Productarea> productareas = productareaMapper.selectByExample(productareaExample);
				if(productareas.size()<=0){
					for (int i = 1; i < 5; i++) {
						Productarea productarea = new Productarea();
						productarea.setAreaid(area.getAreaid()); 
						productarea.setProductno("SLD00"+i);
						productareaMapper.insert(productarea);
					}
				}
				
			}
		}
		AreaExample areaExample5 = new AreaExample();
		areaExample.createCriteria().andAreacodeEqualTo("HUAZHONG");
		/*.andAreacodeEqualTo("HUAZHONG")
		.andAreacodeEqualTo("HUABEI")
		.andAreacodeEqualTo("HUAXI")
		.andAreacodeEqualTo("HUAZHONG");*/
		 areas = areaMapper.selectByExample(areaExample5);
		if(areas.size()>0){
			for (Area area : areas) {
				ProductareaExample productareaExample = new ProductareaExample();
				productareaExample.createCriteria().andAreaidEqualTo(area.getAreaid());
				List<Productarea> productareas = productareaMapper.selectByExample(productareaExample);
				if(productareas.size()<=0){
					for (int i = 1; i < 5; i++) {
						Productarea productarea = new Productarea();
						productarea.setAreaid(area.getAreaid()); 
						productarea.setProductno("SLD00"+i);
						productareaMapper.insert(productarea);
					}
				}
				
			}
		}
		
		return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
    }
	
	@ApiOperation(value = "手机号登录第一步（获取验证码）",httpMethod="POST",notes="手机号登录第一步（获取验证码）",response=RestfulResponse.class)
    @RequestMapping("/login_getkey")
    public Response login_getkey(@Validated @RequestBody PasswordForgetReq req) {

		//生成随机6位验证码
		String keyCode = RandomStringUtils.randomNumeric(6);
		//String keyCode = "654321"; //测试暂用
		
		
		//调用阿里云服务发送短信
		
		try {
				Smsparam smsparam = smsAlertsService.findSmsparamForCode();
			
				Map<String, String> paramMap = new HashMap<>();
				paramMap.put("phoneNumber", req.getPhone());
		    	paramMap.put("msgSign", smsparam.getMsgsign());
		    	paramMap.put("templateCode",smsparam.getTemplatecode());
		    	paramMap.put("accessKeyId",smsparam.getAccesskeyid());
		    	paramMap.put("accessKeySecret",smsparam.getAccesskeysecret());
		    	paramMap.put("jsonContent", "{\"code\":\""+keyCode+"\"}");
				SendSmsResponse response =  AliyunMessageTool.sendSms(paramMap);
				if(response.getCode()!=null&&response.getCode().equals("OK")){
					//发送短信成功将验证码存进redis
					redisService.set(req.getPhone()+"_login", 600, keyCode);
					
					return new ErrorEntity(StatusCode.OK,MessageDetail.SMS_SEND_SUCCESS);
				}else{
					return new ErrorEntity(StatusCode.FAIL,MessageDetail.SMS_SEND_FAIL);
				}
			
			
			
		} catch (ClientException e) {
			return new ErrorEntity(StatusCode.FAIL,"短信发送失败");
		}
		
		
    }
	
	@ApiOperation(value = "手机号登录第二步",httpMethod="POST",notes="手机号登录第二步（校验验证码通过登录成功则返回token）",response=TestResponse.class)
    @RequestMapping("/login_phone")
    public Response login_valikey(@Validated @RequestBody PasswordForgetReq2 req) {
		
		String keyCode = redisService.get(req.getPhone()+"_login");
		if(!Util.isBlank(keyCode)){
			if(keyCode.equals(req.getKeyCode())){
			//验证码正确，想授权中心发送请求获取token
			
				Person person = personService.findPersonByPhone(req.getPhone());
				if(person==null){
					return new ErrorEntity(StatusCode.FAIL,MessageDetail.PERSON_NULL_ERROR);
				}
			
				try {
				
					String result = userinfoSerice.logonInPhone(req.getPhone(), person.getPassword());
					return new TestResponse(result);
				} catch (Exception e) {
					log.info(e);
					return new ErrorEntity(StatusCode.FAIL,MessageDetail.LOGIN_FAIL);
				
				}
				
			}else{
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.KEYCODE_ERROR);
		
			}
		
		}else{
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.KEYCODE_FAIL);
		}
		
    }
	
	
}
