package com.grape.workflow.define;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.grape.model.db.Nodepage;
import com.grape.model.db.Productnode;

public abstract class Node {
	private String id;
	private String name;
	//private Node parent;
	private int lv;
	private final List<Menu> menuList = new ArrayList<Menu>();
	
	private String stage;
	
	private int approvenum = 0;

	//public Node(Node parent, Element element) throws Exception {
	public void init(Map<String,Menu> menumap,Productnode productnode,List<Nodepage> nodepages) throws Exception {
		id = productnode.getNodeid();
		name = productnode.getNodename();
		if(id==null){
			id = name;
		}
		stage = productnode.getStage();
		if(productnode.getApprovenum()!=null&&!"".equals(productnode.getApprovenum())){
			approvenum = Integer.parseInt(productnode.getApprovenum());
		}
		
		if(nodepages!=null){
			Menu m;
			for (int i = 0; i < nodepages.size(); i++) {
				Nodepage nodepage = nodepages.get(i);
				if(null != menumap){
					if(null != (m = menumap.get(nodepage.getPageid()))){
						menuList.add(m);
					}
				}
			}
		}
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

/*	public Node getParent() {
		return parent;
	}*/
	
	public int getLv(){
		return lv;
	}
	
	public List<Menu> getMenuList() {
		return menuList;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public int getApprovenum() {
		return approvenum;
	}

	public void setApprovenum(int approvenum) {
		this.approvenum = approvenum;
	}
	
}
