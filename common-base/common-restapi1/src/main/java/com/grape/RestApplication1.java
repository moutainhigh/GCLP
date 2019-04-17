package com.grape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableTransactionManagement
public class RestApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication1.class, args);
	}
}
