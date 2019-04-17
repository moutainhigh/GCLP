package com.grape.workflow.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.grape.model.db.Person;
import com.grape.model.db.Userrole;

public class Actor{
	private Person person;
	private Department department;
	private List<String> roles = new ArrayList<String>();
	
	public Actor(Person person,Department department){
		this.person = person;
		this.department = department; 
	}
	
	public Actor(Person person,com.grape.model.db.Department department,List<Userrole> roles){
		this.person = person;
		this.department = new Department(department); 
		Set<String> temp = new HashSet<String>();
		if(roles!=null){
			for (Userrole role : roles) {
				temp.add(role.getRoleid());
			}
			this.roles.addAll(temp);
		}
	}
	
	public String getUserid() {
		return person.getWorkerid();
	}

	public List<String> getRoles() {
		return Collections.unmodifiableList(roles);
	}
	
	public Person getPerson() {
		return person;
	}
	
	public Department getDepartment() {
		return department;
	}

}
