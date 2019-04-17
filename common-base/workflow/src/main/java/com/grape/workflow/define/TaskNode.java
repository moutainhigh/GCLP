package com.grape.workflow.define;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Nodebutton;
import com.grape.model.db.Nodepage;
import com.grape.model.db.Noderole;
import com.grape.model.db.Proctrans;
import com.grape.model.db.Productnode;
import com.grape.service.ProductService;

@Component()
@Scope("prototype")
public final class TaskNode extends Executable{
	
	private Map<String, Decision> decisions = new LinkedHashMap<String, Decision>();;
	
	private String branch = null;;
	
	@Autowired
	private ProductService productService;
		
	public void init(Map<String,Menu> menumap,Productnode productnode,
			List<Nodepage> nodepages,List<Noderole> noderoles,
			List<Nodebutton> nodebtns) throws Exception {
		super.init(menumap,productnode,nodepages,noderoles);
		
		this.branch = productnode.getBranch();
		
		Decision decision = null;
		for (Nodebutton nodebutton : nodebtns) {
			List<Proctrans> proctrans = productService.getProctrans(nodebutton.getId());
			decision = new Decision(nodebutton,proctrans);
			decisions.put(decision.getName(), decision);
		}
		if(decisions.isEmpty()){
			System.out.println("123");
		}
		validRole();
	}

	public String getBranch() {
		return branch;
	}

	public Map<String, Decision> getDecisions() {
		return decisions;
	}

	public Decision getDecision(String decisionName) {
		return decisions.get(decisionName);
	}

	private void validRole() throws Exception {//modify by wwx
		if(!getRoles().contains(Workflow.ALL_OF_ROLE)){
			for (int i = 0; i < roles.size(); i++) {
				if(!Workflow.getInstance().getRoles().contains(roles.get(i))){
					throw new Exception("节点："+this.getId()+"，找不到的角色："+roles.get(i));
				}
			}
		}
	}

	@Override
	public List<String> getRoles(String transName) {
		return getRoles();
	}

}
