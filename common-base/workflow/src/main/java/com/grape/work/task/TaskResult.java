package com.grape.work.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskResult {

	private boolean result = true;
	
	private String description = "";
	
	public void addDescription(String desc){
		this.description += desc;
	}
	
	public void prependDescription(String desc){
		this.description = desc+this.description;
	}
	
}
