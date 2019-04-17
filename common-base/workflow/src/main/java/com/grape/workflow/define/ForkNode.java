package com.grape.workflow.define;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Nodepage;
import com.grape.model.db.Procbranch;
import com.grape.model.db.Productnode;

@Component()
@Scope("prototype")
public class ForkNode extends Node {
	
	private List<Branch> branchs = new ArrayList<>();
//	private final List<String> branchs = new ArrayList<>();

	/*public ForkNode(Node parent,Element element) throws Exception {
		super(parent, element);*/
	
	private String fork;
	
	private String branch;
	
	public void init(Map<String,Menu> menumap,Productnode productnode,List<Nodepage> nodepages,List<Procbranch> branches) throws Exception {
		super.init(menumap,productnode,nodepages);
		
		this.fork = productnode.getFork();
		this.branch = productnode.getBranch();
		
		if(branches!=null){
			for (Procbranch procbranch : branches) {
				this.branchs.add(new Branch(procbranch.getBranchid(),procbranch.getNodeid(),procbranch.getName(),procbranch.getTonode()));
			}
		}

	}

	public List<Branch> getBranches() {
		return branchs;
	}

	public String getFork() {
		return fork;
	}

	public void setFork(String fork) {
		this.fork = fork;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
