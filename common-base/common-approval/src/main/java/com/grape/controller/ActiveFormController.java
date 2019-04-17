package com.grape.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.TestResponse2;
import com.grape.util.DbInfoUtil;

import io.swagger.annotations.ApiOperation;

/** 
* @author cwc
* @version 创建时间：2019年1月23日 下午7:51:14  
*/
@RestController
@RequestMapping("/ActiveForm")
public class ActiveFormController {
	@RequestMapping("/getActiveFormInfo")
	@ApiOperation(value="获取动态表单数据", httpMethod="POST",notes="接口")
	public Response getActiveFormInfo(){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://120.78.70.14:3306/dyitp";
		String user = "root";
		String pwd = "dj8ik,(OL>";
		String table ="person";
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list=DbInfoUtil.getTableInfo(driver, url, user, pwd, table);
		return new TestResponse2(list);
	}
}
