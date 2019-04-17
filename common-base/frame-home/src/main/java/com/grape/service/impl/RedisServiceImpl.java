package com.grape.service.impl;


import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.grape.service.RedisService;



@Service  
public class RedisServiceImpl implements RedisService {  
   
  
    
	@Resource
    private RedisTemplate<String, String> redisTemplate;
  
  
  
    @Override  
    public void set(String key, String value) {  
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(key, value, 600, TimeUnit.SECONDS);
        
    }  
      
    @Override  
    public String get(String key) {  
    	ValueOperations<String, String> ops = redisTemplate.opsForValue();
    	return ops.get(key);
    }

	@Override
	public void set(String key, int time, String value) {
		 ValueOperations<String, String> ops = redisTemplate.opsForValue();
	     ops.set(key, value, time, TimeUnit.SECONDS);
	}

  
	 @Override  
	  public void del(String key) {  	  
	        redisTemplate.delete(key);
	 }
}  