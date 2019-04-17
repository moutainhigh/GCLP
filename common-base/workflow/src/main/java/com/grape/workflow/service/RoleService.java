package com.grape.workflow.service;

import java.util.List;
import java.util.Set;

public interface RoleService {

	Set<String> getAllRoles();
	
	String getNodeFirstAuthuserid(String userid,List<String> roles);

}
