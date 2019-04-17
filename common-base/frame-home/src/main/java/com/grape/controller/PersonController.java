package com.grape.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.PersonIdResponse;
import com.grape.controller.reponse.PersoninfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.bean.Personinfo;
import com.grape.controller.request.PersoninfoRequest;
import com.grape.model.db.Person;
import com.grape.service.PersonService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/person")
@Validated
public class PersonController {
	

	@Autowired
	PersonService personService;
	
	
	
	@ApiOperation(value = "个人中心",httpMethod="POST",notes="个人中心(获取当前登录用户的个人信息)",response=PersoninfoResponse.class)
    @RequestMapping("/info")
    public Response info() {
		
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		
		Personinfo personinfo =  personService.findPersoninfoByUsername(username);
		if(personinfo!=null){
			return new PersoninfoResponse(personinfo);
		}
		
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
    }
	
	@ApiOperation(value = "个人信息",httpMethod="POST",notes="根据用户名查询个人信息",response=PersoninfoResponse.class)
    @RequestMapping("/personInfo")
    public Response personiInfo(@Validated @RequestBody PersoninfoRequest req) {
	
		
		Personinfo personinfo =  personService.findPersoninfoByUsername(req.getUsername());
		if(personinfo!=null){
			return new PersoninfoResponse(personinfo);
		}
		
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
    }
	
	@ApiOperation(value = "用户身份信息",httpMethod="POST",notes="根据用户名查询身份信息",response=PersonIdResponse.class)
    @RequestMapping("/person_id")
    public Response person_id(@Validated @RequestBody PersoninfoRequest req) {
	
		try {
			Person person = personService.findPersonByWorkeridOrPhone(req.getUsername());
			
			if(person!=null){
				return new PersonIdResponse(person.getWorkerid(),person.getWorkername(),person.getCerdid());
			}else{
				return new ErrorEntity(StatusCode.FAIL,MessageDetail.PERSON_NULL_ERROR);
			}
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
			
		
    }
}
