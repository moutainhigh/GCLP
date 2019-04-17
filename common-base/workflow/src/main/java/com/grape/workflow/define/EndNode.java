package com.grape.workflow.define;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Productnode;

@Component()
@Scope("prototype")
public class EndNode extends Node{

	/*public EndNode(Node parent,Element element) throws Exception {
		super(parent,element);
	}*/
	
	public void init(Map<String,Menu> menumap,Productnode productnode) throws Exception {
		super.init(menumap,productnode,null);
	}

}
