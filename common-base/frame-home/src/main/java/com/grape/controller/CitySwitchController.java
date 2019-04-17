package com.grape.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.CitySwitchResponse;
import com.grape.controller.reponse.CitySwitchResponse2;
import com.grape.controller.reponse.CityinfoResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.bean.CityAllinfo;
import com.grape.controller.reponse.bean.Cityinfo;
import com.grape.controller.request.CitySwitchRequest;
import com.grape.controller.request.CitySwitchRequest2;
import com.grape.controller.request.CitycodeRequest;
import com.grape.model.db.City;
import com.grape.model.db.Person;
import com.grape.service.CitySwitchService;
import com.grape.service.PersonService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/city")
@Validated
@Log4j
public class CitySwitchController {
		
	@Autowired
	CitySwitchService citySwitchService; 
	@Autowired
	PersonService personService;
	
	@ApiOperation(value = "城市切换",httpMethod="POST",notes="城市切换",response=CitySwitchResponse.class)
    @RequestMapping("/info")
    public Response info(@Validated @RequestBody CitySwitchRequest req) {
		try {
			List<Cityinfo> citieinfos = citySwitchService.findCityByCode(req.getAreacode());
			
			return new CitySwitchResponse(citieinfos);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	
	@ApiOperation(value = "城市切换(APP)",httpMethod="POST",notes="城市切换",response=CitySwitchResponse2.class)
    @RequestMapping("/info_app")
    public Response info_app() {
		try {
			List<CityAllinfo> cityAllinfos = citySwitchService.findCytyAllinfo();
			
			return new CitySwitchResponse2(cityAllinfos);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	@ApiOperation(value = "以城市名查询城市编码",httpMethod="POST",notes="以城市名查询城市编码（APP）",response=CityinfoResponse.class)
    @RequestMapping("/citycode")
    public Response citycode(@Validated @RequestBody CitycodeRequest req) {
		try {
			City city = citySwitchService.findCitycodeByCityname(req.getCityname());
			Cityinfo cityinfo = new Cityinfo();
			cityinfo.setCitycode(city.getCitycode());
			cityinfo.setCityname(city.getCityname());
			return new CityinfoResponse(cityinfo);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	@ApiOperation(value = "更新用户关联城市",httpMethod="POST",notes="城市切换成功时需要更新用户城市关联",response=CitySwitchResponse.class)
    @RequestMapping("/update")
    public Response update(@Validated @RequestBody CitySwitchRequest2 req) {
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		Person person = personService.findPersonByWorkeridOrPhone(username);
		person.setCity(req.getCitycode());
		if(personService.updatePerson(person)){
			return new ErrorEntity(StatusCode.OK,MessageDetail.PERSON_UPDATE_SUCCESS);
		}
		return new ErrorEntity(StatusCode.FAIL,MessageDetail.PERSON_UPDATE_FALE);
    }
}
