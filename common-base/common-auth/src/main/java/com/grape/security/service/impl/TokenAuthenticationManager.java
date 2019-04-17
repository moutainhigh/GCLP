package com.grape.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.grape.security.bean.CustomUserDetails;


@Component
public class TokenAuthenticationManager implements AuthenticationManager {

    @Autowired
    private CustomUserService customUserService; //cai 添加
    
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		 	String username = null;
			String cacheusername = authentication.getName();
		 	if(cacheusername.contains("phone")){
		 		username = cacheusername.replace("phone", "");
		 	}else{
		 		username = cacheusername;
		 	}
		 	System.out.println(cacheusername+"||"+username);
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        String password = (String) authentication.getCredentials();
	        CustomUserDetails user = (CustomUserDetails) customUserService.loadUserByUsername(username);//cai 添加
	        if(user == null){
	            throw new BadCredentialsException("Username not found.");
	        }
	        
	        //如果用户使用手机号验证码登录形式，直接进行密码校验，无需加密校验
	        if(cacheusername.contains("phone")){
	        	if(!password.equals(user.getPassword())){
	        		 throw new BadCredentialsException("Wrong password.");
	        	}
	        }else{
	        	 //加密过程在这里体现
		        if (!encoder.matches(password, user.getPassword())) {
		            throw new BadCredentialsException("Wrong password.");
		        }
	        }
	        
	       

	        return new UsernamePasswordAuthenticationToken(user, password, user.getAuthorities());
	}

}
