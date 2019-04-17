package com.grape.service;


public interface RedisService {

	
	  
	    public void set(String key, String value);  
	    
	    public void set(String key,int time, String value); 
	  
	    public String get(String key);
		void del(String key);  
	    
}
