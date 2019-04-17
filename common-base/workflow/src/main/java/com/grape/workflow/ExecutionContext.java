package com.grape.workflow;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import com.grape.model.db.Doctask;
import com.grape.model.db.Workitem;
import com.grape.security.Util;

public class ExecutionContext {
	private Map<Object, Object> variables = new HashMap<Object, Object>();;
	private String notation;
	private Doctask entity;
	private String tranName;
	
	private String logid;
	private String logtype;
	
	public ExecutionContext(Doctask entity){
		this.entity = entity;
		
		variables.put("sysdate", Util.getDate());
		variables.put("workid", entity.getWorkid());
	}
	
	
	public String getTranName() {
		return tranName;
	}


	public void setTranName(String tranName) {
		this.tranName = tranName;
	}


	public void setNotation(String notation) {
		this.notation = notation;
	}
	
	public String getNotation() {
		return notation;
	}

	public Map<Object, Object> getVariables() {
		return variables;
	}

	public void setVariable(String varName, Object varValue) {
		this.variables.put(varName, varValue);
	}

	public Object getVariable(String varName) {
		return this.variables.get(varName);
	}

	public void loadVariables(Map<Object, Object> map){
		this.variables.putAll(map);
	}
	
	public void removeValue(String varName){
		this.variables.remove(varName);
	}
	
	public void clearVariables(){
		this.variables.clear();
	}

	public Doctask getEntity() {
		return entity;
	}
	
	public String getWorkid(){
		return entity.getWorkid();
	}

	public void setVariables(Map<Object, Object> variables) {
		this.variables.putAll(variables);;
	}

	public String getLogid() {
		return logid;
	}

	public void setLogid(String logid) {
		this.logid = logid;
	}

	public String getLogtype() {
		return logtype;
	}

	public void setLogtype(String logtype) {
		this.logtype = logtype;
	}

}
