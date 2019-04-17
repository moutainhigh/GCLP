package com.grape.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.TestResponse;
import com.grape.controller.reponse.TestResponse2;
import com.grape.controller.request.TestRequest;
import com.grape.repository.entity.Goods;
import com.grape.service.GoodService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

	@Autowired
	private GoodService goodService; 
	
	@ApiOperation(value = "某个接口",httpMethod="POST",notes="测试用接口",response=TestResponse.class)
    @RequestMapping("/test")
    public Response info(@Validated @RequestBody TestRequest req) {
		
		List<Goods> list = goodService.getGoodsByName(req.getName(),0,10);
		if(!list.isEmpty()) {
			return new TestResponse(list.get(0));
		}
		return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
    }

	@ApiOperation(value = "某个接口第二种方式",httpMethod="POST",notes="测试用接口2",response=TestResponse.class)
    @RequestMapping("/test2")
    public Response info2(@Validated @RequestBody TestRequest req) {
		
		List<Goods> list = goodService.getGoodsByName2(req.getName(),0,10);
		if(!list.isEmpty()) {
			return new TestResponse(list.get(0));
		}
		return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
    }
	
	@ApiOperation(value = "某个接口第三种方式",httpMethod="POST",notes="测试用接口3",response=TestResponse.class)
    @RequestMapping("/test3")
    public Response info3(@Validated @RequestBody TestRequest req) {
		
		List<Goods> list = goodService.getGoodsByName3(req.getName(),0,10);
		if(!list.isEmpty()) {
			return new TestResponse(list.get(0));
		}
		return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
    }
	
	@ApiOperation(value = "某个接口第四种方式",httpMethod="POST",notes="测试用接口4",response=TestResponse.class)
    @RequestMapping("/test4")
    public Response info4(@Validated @RequestBody TestRequest req) {
		
		List<Map<String,Object>> list = goodService.getGoodsByName4(req.getName(),0,10);
		if(!list.isEmpty()) {
			return new TestResponse2(list.get(0));
		}
		return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
    }
}
