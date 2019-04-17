package com.grape.workflow.service;

import com.grape.workflow.Execution;
import com.grape.workflow.bean.Actor;
import com.grape.model.db.Doctask;
import com.grape.model.db.Workitem;

public interface WorkFolwService {
	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @return
	 * @throws Exception
	 */
	public boolean validate(Execution execution) throws Exception;
	/**
	 * 
	 * 获取一个工作项
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid
	 * @param nodeid
	 * @return
	 * @throws Exception
	 */
	public Workitem getWorkItem(String workid, String nodeid) throws Exception;
	/**
	 * 
	 * 创建工作流程
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param actor 参与者
	 * @param workid 流水号
	 * @param processId 流程名
	 * @return
	 * @throws Exception
	 */
	public Workitem createWorkProc(Actor actor,String workid,String processId,Doctask entity) throws Exception;
	/**
	 * 
	 * 启动流程
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @throws Exception
	 */
	public void startProcess(Execution execution) throws Exception;
	/**
	 * 	
	 * 取消检出工作项
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @throws Exception
	 */
	public void checkout(Execution execution) throws Exception;

	/**
	 * 
	 * 检出当前工作项
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @throws Exception
	 */
	public void checkin(Execution execution) throws Exception;
	
	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @param decisionName
	 * @throws Exception
	 */
	public void decide(Execution execution,String decisionName) throws Exception;
		
	/**
	 * 
	 * 将工作项重新指派给特定人
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @param toActor
	 * @throws Exception
	 */
	public void reassign(Execution execution,Actor toActor)throws Exception;
	
	/**
	 * 
	 * 工作项重新指派
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param execution
	 * @return
	 * @throws Exception
	 */
	public String reassign(Execution execution)throws Exception;
	
	/**
	 * 授权
	 * @param execution
	 */
	public void grant(Execution execution)throws Exception;
	
	/**
	 * 转办
	 * @param execution
	 */
	public void transferto(Execution execution)throws Exception;
	
	public void appeal(Execution execution) throws Exception;

}
