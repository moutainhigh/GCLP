package com.grape.workflow.define;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Proccondition;
import com.grape.model.db.Productnode;

@Component()
@Scope("prototype")
public class JoinNode{
	private ForkNode fork;
	private String to;
	private List<Condition> conds;

	public void init(Map<String,Menu> menumap,Productnode productnode,ForkNode fork,List<Proccondition> procconds) throws Exception {
		this.fork = fork;
		this.to = productnode.getTonode();
		
		if(procconds!=null){
			conds = new ArrayList<Condition>();
			for (Proccondition Proccondition : procconds) {
				conds.add(new Condition(Proccondition));
			}
		}
		
		// 检测
		if(null != to && null != conds){
			throw new Exception(this.getFork().getName()+"的Join节点的目标节点和条件只能选择一个输入");
		}else if(null == to && null == conds){
			throw new Exception(this.getFork().getName()+"的Join节点的目标节点和条件必须选择一个输入");
		}
		
	}

	public String getTo() {
		return to;
	}

	public ForkNode getFork() {
		return fork;
	}
	
	public List<Condition> getCondition() {
		return conds;
	}
}
