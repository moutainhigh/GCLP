package com.grape.workflow.define;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Branch {
	private String id;
	private String nodeid;
	private String name;
	private String to;
	
	public Branch(String id, String nodeid, String name, String to) {
		super();
		this.id = id;
		this.nodeid = nodeid;
		this.name = name;
		this.to = to;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}

	public String getNodeid() {
		return nodeid;
	}

	public void setNodeid(String nodeid) {
		this.nodeid = nodeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
