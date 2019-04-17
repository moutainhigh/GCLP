package com.grape.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grape.controller.reponse.TestResponse;
import com.grape.controller.reponse.TestResponse2;
import com.grape.controller.request.TestRequest;

@FeignClient(value = "restapi1", url="http://localhost:8088/")
public interface RemoteRestController {

	@RequestMapping("/user/test")
	 public TestResponse info(TestRequest req);
	
	@RequestMapping("/user/test2")
	 public TestResponse info2(TestRequest req);
	
	@RequestMapping("/user/test3")
	 public TestResponse info3(TestRequest req);
	
	@RequestMapping("/user/test4")
	 public TestResponse2 info4(TestRequest req);
}
