package com.grape.workflow.define;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.grape.model.db.Nodepage;
import com.grape.model.db.Noderole;
import com.grape.model.db.Productnode;

public abstract class Executable extends Node {
	protected String departLv = null;
	protected List<String> roles = new ArrayList<String>();;
	protected String lane = null;;
	protected String assignMode = null;
	protected String assignTargetNode = null;
	protected String authority = null;
	
	public void init(Map<String,Menu> menumap,Productnode productnode,List<Nodepage> nodepages,List<Noderole> noderoles) throws Exception {
		super.init(menumap,productnode,nodepages);
		
		//TODU
		
		if(noderoles!=null){
			for (Noderole noderole : noderoles) {
				roles.add(noderole.getRoleid());
			}
		}
		lane = productnode.getLane();
		
		if (productnode.getAssignmode() == null) {
			assignMode = Workflow.ASSIGN_ROLES;
		}else {
			assignMode = productnode.getAssignmode();
		}

		authority = productnode.getAuthority();
		assignTargetNode = productnode.getAssigntagnode();
	}
	
	
	public String getDepartLv() {
		return departLv;
	}

	public List<String> getRoles() {
		return Collections.unmodifiableList(roles);
	}
	
	public abstract List<String> getRoles(String transName);

	public String getLane() {
		return lane;
	}

	public String getAssignMode() {
		return assignMode;
	}

	public String getAuthority() {
		return authority;
	}


	public String getAssignTargetNode() {
		return assignTargetNode;
	}


	public void setAssignTargetNode(String assignTargetNode) {
		this.assignTargetNode = assignTargetNode;
	}

}
