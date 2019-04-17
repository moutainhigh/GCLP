package com.grape.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix="sms")
@PropertySource("classpath:sms.properties")
public class SMSConfig {
	
	private String accessKeyId;
	
	private String accessKeySecret;
	
	private String connectTimeout;
	
	private String readTimeout;
	
	private String msgSign;
	
	private String templateCode;
	
}
