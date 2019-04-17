package com.grape.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class LombokEp {
	
	@Setter
	private String partSetter;  // 部分字段追加setter
	@Getter
	private String partGetter; // 部分字段追加getter
	
	public void nonNull(@NonNull String nonnull) {
		/*
		 * 将生成 
		 * if (nonnull == null) {  
		 * 		throw new NullPointerException("nonnull");  
		 * }  
	    */
	}

	public void stream() throws IOException {
		try (BufferedReader br =  new BufferedReader(new FileReader(""))) {   // 自动close资源，不是Lombok方式，@Cleanup有问题。
			// dosomething
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}
	
	
	
	public void log()  {
		log.info("增加@Log4j注解即可");
	}
	
	
}
