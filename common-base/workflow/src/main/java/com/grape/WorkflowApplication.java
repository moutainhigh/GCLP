package com.grape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.grape.workflow.define.Workflow;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages={"com.grape.model.mapper.base","com.grape.model.mapper.external","com.grape.workflow.model.mapper"})
public class WorkflowApplication {
	
	public static ConfigurableApplicationContext instance;
	
	public static void main(String[] args) throws Exception{
		
		instance = SpringApplication.run(WorkflowApplication.class, args);
		
		Workflow workflow = instance.getBean(Workflow.class);
		
		workflow.init();
		
		
	}

}
