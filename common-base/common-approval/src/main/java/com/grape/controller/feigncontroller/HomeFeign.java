package com.grape.controller.feigncontroller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grape.controller.reponse.PersonResponse;

@FeignClient(value="frame-home",url="http://localhost:8080/home")
public interface HomeFeign {
	@RequestMapping("/person/info")
	public PersonResponse personinfo(); 
	
}
