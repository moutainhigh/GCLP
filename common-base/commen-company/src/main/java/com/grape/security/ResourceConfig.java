package com.grape.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter {
	
	@Autowired
	private AuthenticationEntryPoint point;
	@Autowired
	private AccessDeniedHandler handler;

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources
		.accessDeniedHandler(handler)
		.authenticationEntryPoint(point);
	}

	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		// swagger2
		.antMatchers("/swagger-ui.html*",
				"/webjars/springfox-swagger-ui/**",
				"/swagger-resources/**",
				"/v2/api-docs/**",
				"/validatorUrl**",
				"/waihu/**").permitAll()
		.anyRequest().authenticated();
	}

}
