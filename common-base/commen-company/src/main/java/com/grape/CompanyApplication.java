package com.grape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableTransactionManagement
@Configuration
@EnableDiscoveryClient
@MapperScan(basePackages={"com.grape.model.mapper.base","com.grape.model.mapper.external"})
public class CompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}
	

}
