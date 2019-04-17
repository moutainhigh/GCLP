package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.TestResponse;
import com.grape.controller.reponse.TestResponse2;
import com.grape.controller.request.TestRequest;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {
	
	@Autowired
	private RemoteRestController remoteRest;
	
	
	@ApiOperation(value = "feignClient",httpMethod="POST",notes="测试用接口",response=TestResponse.class)
    @RequestMapping("/test")
    public Response info(@Validated @RequestBody TestRequest req) {
		 return remoteRest.info(req);
    }

	@ApiOperation(value = "feignClient2",httpMethod="POST",notes="测试用接口",response=TestResponse.class)
    @RequestMapping("/test2")
    public Response info2(@Validated @RequestBody TestRequest req) {
		 return remoteRest.info2(req);
    }
    
	@ApiOperation(value = "feignClient3",httpMethod="POST",notes="测试用接口",response=TestResponse.class)
    @RequestMapping("/test3")
    public Response info3(@Validated @RequestBody TestRequest req) {
		 return remoteRest.info3(req);
    }
    
	@ApiOperation(value = "feignClient4",httpMethod="POST",notes="测试用接口",response=TestResponse2.class)
    @RequestMapping("/test4")
    public Response info4(@Validated @RequestBody TestRequest req) {
		 return remoteRest.info4(req);
    }
}
