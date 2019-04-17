package com.grape.workflow;

import com.grape.workflow.bean.Actor;
import com.grape.workflow.define.Node;
import com.grape.workflow.define.Process;
import com.grape.workflow.define.Workflow;
import com.grape.model.db.Workitem;


public class Execution{
	private String workId;
	private String fromNodeId;
	private Workitem workItem;
	private Actor actor;
	private Actor toActor;
	private ExecutionContext context;
	private String operation;
	private String returnflg;
	private String toNodeid;
	
	public Execution(Actor actor,Actor toActor,Workitem workItem,String operation,ExecutionContext executionContext) {
		this.workId = workItem.getWorkid();
		this.actor = actor;
		this.workItem = workItem;
		this.context = executionContext;
		this.operation = operation;
		this.toActor = toActor;
	}

	public Process process() {
		return Workflow.getProcess(workItem);
	}

	public Node node() {
		return Workflow.getNode(workItem);
	}

	public Workitem getWorkItem() {
		return workItem;
	}
	
	public String getWorkId() {
		return workId;
	}

	public Actor getActor() {
		return actor;
	}

	public ExecutionContext getContext() {
		return context;
	}

	public String getOperation() {
		return operation;
	}

	public Actor getToActor() {
		return toActor;
	}

	public void setToActor(Actor toActor) {
		this.toActor = toActor;
	}

	public String getTransName() {
		return context.getTranName();
	}

	public String getReturnflg() {
		return returnflg;
	}

	public void setReturnflg(String returnflg) {
		this.returnflg = returnflg;
	}

	public String getToNodeid() {
		return toNodeid;
	}

	public void setToNodeid(String toNodeid) {
		this.toNodeid = toNodeid;
	}

	public String getFromNodeId() {
		return fromNodeId;
	}

	public void setFromNodeId(String fromNodeId) {
		this.fromNodeId = fromNodeId;
	}
	
}
