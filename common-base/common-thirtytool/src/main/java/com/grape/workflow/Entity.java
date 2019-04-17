package com.grape.workflow;

public abstract class Entity {
	private String workid;
	
	public Entity(String workid){
		this.workid = workid;
	}

	public String getWorkid() {
		return workid;
	}
}
