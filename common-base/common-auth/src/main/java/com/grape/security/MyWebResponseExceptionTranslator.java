package com.grape.security;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import com.grape.security.MyOauth2Exception;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;

public class MyWebResponseExceptionTranslator extends DefaultWebResponseExceptionTranslator {
	
	@Override
	public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception {
		if(e.getMessage().contains("Wrong password")||e.getMessage().contains("Username not found")){
			HashMap<String, String> errorParams = new HashMap<String,String>();
			errorParams.put("code", "20001");
			errorParams.put("message", "用户名错误或密码错误");
			
			return new ResponseEntity<>(MyOauth2Exception.valueOf(errorParams),HttpStatus.OK);
			
		}
		return super.translate(e);
	}

}
