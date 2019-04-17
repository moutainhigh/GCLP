package com.grape.workflow.define;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class StartTo{
	private String name;
	private List<String> roles;
	private String to;
	
	public StartTo(String name,List<String> roles,String to) {
		this.name = name;
		this.roles = roles;
		this.to = to;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getRoles() {
		return Collections.unmodifiableList(roles);
	}

	public String getTo() {
		return to;
	}
	
	
}
