package com.grape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients
@EnableScheduling
@MapperScan(basePackages={"com.grape.model.mapper.base","com.grape.model.mapper.external"})
@EnableDiscoveryClient
public class SystemanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemanageApplication.class, args);
    }

}
