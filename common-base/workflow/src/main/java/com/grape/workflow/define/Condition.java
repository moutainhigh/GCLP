package com.grape.workflow.define;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Proccondition;

@Component()
@Scope("prototype")
public class Condition {
	private String name;
	private Set<String> conds;
	private int appear;
	private String to;
	
	public Condition(Proccondition Proccondition) {
		name = Proccondition.getConditionid();
		conds = new HashSet<String>();
		conds.addAll(Arrays.asList(Proccondition.getConds().split(",")));
		appear = Integer.parseInt(Proccondition.getAppear());
		to = Proccondition.getTonode();
	}

	public String getName() {
		return name;
	}
	
	public int getAppear() {
		return appear;
	}

	public Set<String> getConds() {
		return conds;
	}

	public String getTo() {
		return to;
	}
	
	
}
