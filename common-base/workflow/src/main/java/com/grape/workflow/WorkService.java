package com.grape.workflow;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grape.workflow.bean.Actor;
import com.grape.workflow.define.Node;
import com.grape.workflow.define.Workflow;
import com.grape.model.db.Doctask;
import com.grape.model.db.Workhistory;
import com.grape.model.db.Workitem;
import com.grape.workflow.service.WorkFolwService;
import com.grape.workflow.service.WorkHisService;
import com.grape.workflow.service.WorkItemService;
import com.grape.workflow.util.Util;
import com.grape.workflow.util.WorkUtil;

@Component
public abstract class WorkService{
	
	Logger logger = LoggerFactory.getLogger(WorkService.class);

	@Autowired
	WorkFolwService  workFolwService;
	
	@Autowired
	WorkItemService workItemService;
	
	@Autowired
	WorkHisService workHisService;

	/**
	 * 
	 * 通过流水号、节点、Entity获得工作项信息
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param workid 流水号
	 * @param nodeid 节点
	 * @param entity 
	 * @return 工作项信息
	 * @throws Exception
	 */
	public Workitem getWorkItem(String workid,String nodeid,Doctask entity) throws Exception{
		Workitem workItem = workFolwService.getWorkItem(workid,nodeid);//TODO 获取Workitem不对
		if(workItem == null){
			throw new Exception("工作项已转移或不存在，流水号："+workid+"，节点："+nodeid);
		}
		workItem.setEntity(entity);
		return workItem;
	}
	
	/**
	 * 
	 * 启动流程
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param xContext 全局上下文
	 * @param processId 流水号
	 * @return 工作项信息
	 * @throws Exception
	 */
	public final Workitem startProcess(ExecutionContext xContext,String processId,Actor actor,Actor toActor) throws Exception{
		String workid = xContext.getWorkid();
		logger.info("["+actor.getUserid()+"]开始流程，流水号:"+workid+"，流程名称："+processId);
		
		Workitem workItem = workFolwService.createWorkProc(actor, workid, processId,xContext.getEntity());
		
		Execution execution = new Execution(actor,toActor,workItem,Workflow.OPER_START,xContext);
		
		workItem.setEntity(xContext.getEntity());
		
		initGlobalVars(execution);
		
		before(execution);
		
//		if(workItem.getRoles().isEmpty()){
//			workItem.setRoles(execution.process().getStartNode().getStartTo(execution.getTransName()).getRoles());
//		}		
		
		if(!workFolwService.validate(execution)){
			throw new Exception("验证失败");
		}
		
		String fromNode = workItem.getNode();
		String fromStage = Workflow.getNode(workItem).getStage();
		
		workFolwService.startProcess(execution);
		
		after(execution);
		
		Workhistory workHist = new Workhistory();
		workHist.setWorkid(workItem.getWorkid());
		workHist.setFork(workItem.getFork());
		workHist.setBranch(workItem.getBranch());
		workHist.setStage(fromStage);
		workHist.setNode(fromNode);
		workHist.setOperation(Workflow.OPER_START);
		workHist.setNextnode(workItem.getNode());
		workHist.setNotation(execution.getContext().getNotation());
		workHist.setType(execution.getContext().getLogtype());
			
		saveWorkHistory(workHist,actor);
		
		xContext.setLogid(workHist.getId());//增加返回日志编号
		
		return workItem;
	}
	
	public final Workitem handle(ExecutionContext xContext, String nodeid, String operation,Actor actor,Actor toActor,String backNodeid,String backflg) throws Exception{
		String workid = xContext.getWorkid();
		logger.info("["+actor.getUserid()+"]处理流程，流水号:"+workid+"，操作："+operation);
		
		Workitem workitem = this.getWorkItem(workid,nodeid,xContext.getEntity());
		
		if("1".equals(workitem.getReturnflg())&&!"".equals(Util.outObj(workitem.getRetscnode()))){//如果是直接返回，并且返回目标节点
			operation = Workflow.OPER_RETURN;
		}
		
		Execution execution = new Execution(actor,toActor,workitem,operation, xContext);
		execution.setFromNodeId(nodeid);
		execution.setToNodeid(backNodeid);
		execution.setReturnflg(backflg);

		initGlobalVars(execution);
		
		before(execution);
		
		if(!Workflow.OPER_APPEAL.equals(operation)){
			if(!(Workflow.OPER_CANCEL.equals(operation)&&actor.getUserid().equals(workitem.getEntity().getUserid()))){
				if(!workFolwService.validate(execution)){
					throw new Exception("验证失败");
				}
			}
		}
		
		String fromNode = workitem.getNode();
		String fromStage = Workflow.getNode(workitem).getStage();
		
		if(operation.equals(Workflow.OPER_CHECKOUT)){
			workFolwService.checkout(execution);
		}else if(operation.equals(Workflow.OPER_CHECKIN)){
			workFolwService.checkin(execution);
		}else if(Workflow.OPER_GRANT.equals(operation)){
			workFolwService.grant(execution);
		}else if(Workflow.OPER_TRANSFERTO.equals(operation)){
			workFolwService.transferto(execution);
		}else if(Workflow.OPER_APPEAL.equals(operation)){
			workFolwService.appeal(execution);
		}else{
			workFolwService.decide(execution, operation);
		}
		
		after(execution);

		Workhistory workHist = new Workhistory();
		workHist.setWorkid(workitem.getWorkid());
		workHist.setStage(fromStage);
		workHist.setFork(workitem.getFork());
		workHist.setBranch(workitem.getBranch());
		workHist.setNode(fromNode);
		workHist.setOperation(operation);
		workHist.setNextnode(workitem.getNode());
		workHist.setNotation(execution.getContext().getNotation());
		workHist.setType(execution.getContext().getLogtype());
		
		saveWorkHistory(workHist,actor);
		
		xContext.setLogid(workHist.getId());//增加返回日志编号
		
		if(operation!=null && (operation.trim().contains("取消")||operation.trim().contains("拒绝"))){
			Workitem mainWorkitem = workItemService.getWorkItem(workid, "0", "0");
			mainWorkitem.setNode(workitem.getNode());
			mainWorkitem.setState("0");
			mainWorkitem.setStage(workitem.getStage());
			workItemService.removeSubprocess(workid);
			workItemService.updateByIdSelective(mainWorkitem);
		}
		
		return workitem;
		
	}
	
	public final void reassign(ExecutionContext xContext, String nodeid, Actor toActor,Actor actor) throws Exception{
		String workid = xContext.getWorkid();
		logger.info("["+actor.getUserid()+"]重新指派，流水号:"+workid+"，指派给："+toActor.getUserid());
		
		Workitem workItem = this.getWorkItem(workid,nodeid,xContext.getEntity());
				
		Execution execution = new Execution(actor,toActor,workItem,Workflow.OPER_REASSIGN,xContext);
		
		initGlobalVars(execution);
		
		before(execution);
		
		if(!workFolwService.validate(execution)){
			throw new Exception("验证失败");
		}
		
		String fromStage = Workflow.getNode(workItem).getStage();
		
		workFolwService.reassign(execution, toActor);
		
		after(execution);
		
		Workhistory workHist = new Workhistory();
		workHist.setWorkid(workItem.getWorkid());
		workHist.setFork(workItem.getFork());
		workHist.setBranch(workItem.getBranch());
		workHist.setStage(fromStage);
		workHist.setNode(workItem.getNode());
		workHist.setOperation(Workflow.OPER_REASSIGN);
		workHist.setNextnode(workItem.getNode());
		
		if(execution.getContext().getNotation() == null){
			workHist.setNotation("重新指派给：" + toActor.getUserid());
		}else{
			workHist.setNotation(execution.getContext().getNotation());
		}
		workHist.setType(execution.getContext().getLogtype());
		
		saveWorkHistory(workHist,actor);
		
		xContext.setLogid(workHist.getId());//增加返回日志编号
	}
	
	public final void reassign(ExecutionContext xContext, String nodeid,Actor actor) throws Exception{
		String workid = xContext.getWorkid();
		logger.info("["+actor.getUserid()+"]重新指派，流水号:"+workid+"，指派给一个参与者");
		
		Workitem workItem = this.getWorkItem(workid,nodeid,xContext.getEntity());
		
		//TODO 重新指派toActor需要再分析
		Execution execution = new Execution(actor,null,workItem,Workflow.OPER_REASSIGN, xContext);

		initGlobalVars(execution);
		
		before(execution);
		
		if(!workFolwService.validate(execution)){
			throw new Exception("验证失败");
		}
		
		String fromStage = Workflow.getNode(workItem).getStage();
		
		String toUserid = workFolwService.reassign(execution);
		
		after(execution);

		Workhistory workHist = new Workhistory();
		workHist.setWorkid(workItem.getWorkid());
		workHist.setFork(workItem.getFork());
		workHist.setBranch(workItem.getBranch());
		workHist.setStage(fromStage);
		workHist.setNode(workItem.getNode());
		workHist.setOperation(Workflow.OPER_REASSIGN);
		workHist.setNextnode(workItem.getNode());
		workHist.setType(execution.getContext().getLogtype());
		
		if(execution.getContext().getNotation() == null){
			workHist.setNotation("重新指派给：" + toUserid);
		}else{
			workHist.setNotation(execution.getContext().getNotation());
		}
		saveWorkHistory(workHist,actor);
		
		xContext.setLogid(workHist.getId());//增加返回日志编号
	}
	/**
	 * 
	 * 初始化 全局变量
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param execution
	 * @throws Exception
	 */
	protected abstract void initGlobalVars( Execution execution) throws Exception;
	/**
	 * 
	 * 启动流程之前，执行的操作
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param execution
	 * @throws Exception
	 */
	protected abstract void before( Execution execution) throws Exception;
	
	/**
	 * 流程结束后，执行的操作
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param execution
	 * @throws Exception
	 */
	protected abstract void after( Execution execution) throws Exception;
	
	/**
	 * 
	 * 保存工作历史记录
	 * lijl
	 * 1.0 - 2015年4月29日
	 * @param workHist 工作历史
	 * @throws Exception
	 */
	private void saveWorkHistory(Workhistory workHist,Actor actor) throws Exception{
		//历史记录
		workHist.setId(WorkUtil.getID());
		workHist.setUserid(actor.getUserid());
		workHist.setOperdate(new Date());
		
		if(workHist.getNode().equals(workHist.getNextnode())){
			workHist.setNextnode(null);
		}
		
		workHisService.save(workHist);
		
		String nextnode = workHist.getNextnode();
		if(nextnode == null){
			nextnode = "";
		}
		
		logger.info("流水号："+workHist.getWorkid()+
				"，节点："+workHist.getNode()+
				"，用户："+workHist.getUserid()+
				"，操作："+workHist.getOperation()+
				"，下一节点："+nextnode);
	}
	
	public final void grant(ExecutionContext xContext, String nodeid, Actor actor,Actor toActor) throws Exception{
		String workid = xContext.getWorkid();
		logger.info("["+actor.getUserid()+"]将流水号["+workid+"]授权给一个参与者["+toActor.getUserid()+"]");
		
		Workitem workItem = this.getWorkItem(workid,nodeid,xContext.getEntity());
		String fromStage = Workflow.getNode(workItem).getStage();
		
		Execution execution = new Execution(actor,null,workItem,Workflow.OPER_GRANT, xContext);

		initGlobalVars(execution);
		
		if(!workFolwService.validate(execution)){
			throw new Exception("验证失败");
		}
		
		workFolwService.grant(execution);
		
		Workhistory workHist = new Workhistory();
		workHist.setWorkid(workItem.getWorkid());
		workHist.setFork(workItem.getFork());
		workHist.setBranch(workItem.getBranch());
		workHist.setStage(fromStage);
		workHist.setNode(workItem.getNode());
		workHist.setOperation(Workflow.OPER_GRANT);
		workHist.setNextnode(workItem.getNode());
		workHist.setType(execution.getContext().getLogtype());
		
		if(execution.getContext().getNotation() == null){
			workHist.setNotation("授权给给：" + toActor.getUserid());
		}else{
			workHist.setNotation(execution.getContext().getNotation());
		}
		saveWorkHistory(workHist,actor);
		
		xContext.setLogid(workHist.getId());//增加返回日志编号
	}

}
