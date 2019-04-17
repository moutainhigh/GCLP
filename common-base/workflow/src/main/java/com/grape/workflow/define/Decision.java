package com.grape.workflow.define;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Nodebutton;
import com.grape.model.db.Proctrans;

@Component()
@Scope("prototype")
public class Decision {
	private String name;
	private String to;
	private String condition;
	private Map<String,Transition> transitions;
	
	public Decision(Nodebutton nodebtn,List<Proctrans> tranlist) throws Exception {
		name = nodebtn.getName();
		to = nodebtn.getNextnode();
		if("".equals(to)){
			System.out.println(to);
		}
		condition = Workflow.transToExpr(nodebtn.getCondtn());
		
		transitions = new HashMap<String,Transition>();
		
		Transition transition = null;
		for (Proctrans proctrans : tranlist) {
			transition = new Transition(proctrans.getName(),proctrans.getTonode(),proctrans.getCondexpress());
			transitions.put(transition.getName(),transition);
		}
	}

	public String getName() {
		return name;
	}

	public String getTo() {
		return to;
	}
	
	protected void setTo(String to) {
		this.to = to;
	}
	
	public String getCondition() {
		return condition;
	}

	public Map<String,Transition> getTransitions() {
		return transitions;
	}
}
