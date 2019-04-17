package com.grape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients
@EnableScheduling
@MapperScan(basePackages={"com.grape.model.mapper.base","com.grape.model.mapper.external"})
public class ApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprovalApplication.class, args);
	}
	/*@Bean 
	public EmbeddedServletContainerCustomizer containerCustomizer(){ 
		return new EmbeddedServletContainerCustomizer() { 
			@Override 
			public void customize(ConfigurableEmbeddedServletContainer container) { 
				container.setSessionTimeout(3600);//单位为S 
			} 
		}; 
	} */
}
