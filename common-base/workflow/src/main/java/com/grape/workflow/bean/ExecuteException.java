package com.grape.workflow.bean;
import java.util.HashMap;
import java.util.Map;

public class ExecuteException extends Exception {
	private static final long serialVersionUID = 1L;
	private Map<String,Object> data  =  new HashMap<String,Object>();
	public ExecuteException(Exception e){
		super(e);
	}
	
	public ExecuteException(Map<String,Object> callback,String msg){
		super(msg);
		data = callback;
	}
	
	public ExecuteException(String msg){
		super(msg);
	}
	
	public ExecuteException(){
		super();
	}
	
	public Map<String,Object> getContext(){
		return data;
	}
	
	public ExecuteException put(String key,Object value){
		data.put(key, value);
		return this;
	}
}
