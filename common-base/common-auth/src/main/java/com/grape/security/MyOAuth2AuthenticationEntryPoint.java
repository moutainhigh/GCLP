package com.grape.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;

public class MyOAuth2AuthenticationEntryPoint extends OAuth2AuthenticationEntryPoint{

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		if(BadCredentialsException.class.isInstance(authException)){
			super.commence(request, response, authException);
		}else{
			super.commence(request, response, authException);
		}
		
	}
	
}
