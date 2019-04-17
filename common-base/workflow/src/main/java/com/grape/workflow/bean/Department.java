package com.grape.workflow.bean;

public class Department{
	private com.grape.model.db.Department organization;
	
	public Department(com.grape.model.db.Department organization) {
		this.organization = organization;
	}

	protected com.grape.model.db.Department getOrganization() {
		return organization;
	}

	public void setOrganization(com.grape.model.db.Department organization) {
		this.organization = organization;
	}

	public String getDepartId() {
		return organization.getDepartmentno();
	}

	public String getDepartLv() {
		return "0";
	}

	public String getSupperDepart() {
		return organization.getSuperdep();
	}

}
