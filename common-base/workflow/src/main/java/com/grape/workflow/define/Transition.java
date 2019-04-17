package com.grape.workflow.define;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class Transition{
	private String name;
	private String to;
	private String expression;
	
	public Transition(String name,String to,String expression) {
		this.name = name;
		this.to = to;
		this.expression = expression;
	}

	public String getName() {
		return name;
	}


	public String getTo() {
		return to;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	
}
