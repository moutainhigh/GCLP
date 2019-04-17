package com.grape.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.grape.service.ICacheService;

/** 
* @author cwc
* @version 创建时间：2018年12月26日 上午10:50:46  
*/
/**
 * 启动加载缓存
 *
 * @author dongxiaoqiang0115
 */
@Component
public class InitCache implements ApplicationRunner {
 
	@Autowired
	private ICacheService cache;
 
	@Override
	@Async
	public void run(ApplicationArguments arg) throws Exception {
		// 加载字典表缓存
		cache.initDictCache();
		// 加载表达式缓存
//		cache.initExpressionCache();
	}
}

