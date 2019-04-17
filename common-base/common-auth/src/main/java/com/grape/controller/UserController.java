package com.grape.controller;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

	@Resource
	private RedisTokenStore redisTokenStore;

	@Resource
	StringRedisTemplate redis;

	@ApiOperation(hidden = true, value = "获取用户身份")
	@RequestMapping("/info")
	public Principal info(Principal principal) {

		try {

			OAuth2Authentication atoken = (OAuth2Authentication) principal;

			OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) atoken.getDetails();
			String tokenValue = details.getTokenValue();

			DefaultOAuth2AccessToken readAccessToken = (DefaultOAuth2AccessToken) redisTokenStore
					.readAccessToken(tokenValue);

			// 每次都将access_token有效期更新为1小时
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Long time = new Long(System.currentTimeMillis() +60*60*1000);
			String d = format.format(time);
			Date date = format.parse(d);

			readAccessToken.setExpiration(date);
			Long expire = redis.getExpire("access:" + tokenValue);
			System.out.println(expire);
			redisTokenStore.storeAccessToken(readAccessToken, atoken);

			int expiresIn = readAccessToken.getExpiresIn();
			System.out.println(expiresIn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return principal;

	}

}
