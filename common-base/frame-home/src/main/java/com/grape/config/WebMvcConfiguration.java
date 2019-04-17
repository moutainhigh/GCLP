package com.grape.config;




import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/figure/**").addResourceLocations("file:C://Users/Administrator/Desktop/DY/DYSTP/codes/common-base/frame-home/src/main/resources/figure/");
		registry.addResourceHandler("/figure/**").addResourceLocations(this.getClass().getResource("/figure/").toString());
		
	}
	
	
}
