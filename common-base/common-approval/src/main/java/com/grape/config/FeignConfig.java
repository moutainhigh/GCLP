package com.grape.config;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FeignConfig implements RequestInterceptor{
	
	@Override
	public void apply(RequestTemplate requestTemplate) {
		requestTemplate.header("authorization", getHeaders(getHttpServletRequest()).get("authorization"));
	}

	
	private HttpServletRequest getHttpServletRequest(){
		try{
			return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}catch(Exception e){
			return null;
		}
	}
	
	private Map<String,String> getHeaders(HttpServletRequest request){
		Map<String,String> map = new LinkedHashMap<>();
		Enumeration<String> enumeration = request.getHeaderNames();
		String key,value;
		while(enumeration.hasMoreElements()){
			key = enumeration.nextElement();
			value = request.getHeader(key);
			map.put(key, value);
		}
		return map;
	}
}
