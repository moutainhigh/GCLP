package com.grape.security;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;
import org.springframework.security.oauth2.provider.error.OAuth2ExceptionRenderer;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.web.context.request.ServletWebRequest;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;

@Configuration
public class ExceptionRender {
	
	/**
	 * 登录前没有权限等等问题会进入这里
	 * @return
	 */
	@Bean
	public AuthenticationEntryPoint authenticationEntryPoint() {
		OAuth2AuthenticationEntryPoint authenticationEntryPoint = new OAuth2AuthenticationEntryPoint();
		authenticationEntryPoint.setExceptionRenderer(new OAuth2ExceptionRenderer() {
			@Override
			public void handleHttpEntityResponse(HttpEntity<?> responseEntity, ServletWebRequest webRequest)
					throws Exception {
				OAuth2Exception body = (OAuth2Exception) responseEntity.getBody();
				HttpServletResponse res =  (HttpServletResponse) webRequest.getNativeResponse();
				
				/*Iterator<String> list = webRequest.getParameterNames();
				
				while(true){
					if (list.hasNext()) {
						System.out.println(list.next());
						continue;
					}
					break;
				}*/
				// 指定允许其他域名访问    
				res.setHeader("Access-Control-Allow-Origin","*"); 
				// 响应类型    
				res.setHeader("Access-Control-Allow-Methods","POST"); 
				// 响应头设置    
				res.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");
				
				
				res.setHeader("Content-Type", "application/json;charset=UTF-8");
				
				ErrorEntity entity;
				if (body.getOAuth2ErrorCode().equals(OAuth2Exception.INVALID_TOKEN)) {
					entity = new ErrorEntity(StatusCode.INVALID_TOKEN);
				} else if (body.getOAuth2ErrorCode().equals("unauthorized")) {
					entity = new ErrorEntity(StatusCode.UNRECOGNIZE_CLIENT);
				} else if (body.getOAuth2ErrorCode().equals(OAuth2Exception.ACCESS_DENIED)) {
					entity = new ErrorEntity(StatusCode.UNAUTHORIZED);
				}else {
					entity = new ErrorEntity(StatusCode.UNKNOWED_ERROR);
				}
				res.getOutputStream().write(entity.toString().getBytes());
			}
		});
		return authenticationEntryPoint;
	}

	/**
	 * 登录后没有权限等等问题会进入这里
	 * @return
	 */
	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new AccessDeniedHandler() {

			@Override
			public void handle(HttpServletRequest req, HttpServletResponse res, AccessDeniedException ade)
					throws IOException, ServletException {
				ErrorEntity entity = new ErrorEntity(StatusCode.UNAUTHORIZED);
				res.getOutputStream().write(entity.toString().getBytes());
			}
		};
	}

}
