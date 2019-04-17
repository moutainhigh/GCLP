package com.grape.workflow.service;

import java.util.List;

import com.grape.model.db.Workitem;

/**
 * 
 * 类型说明
 * @author lijl
 * @version 1.0 - 2015年4月17日
 */
public interface WorkItemService {

	/**
	 * 
	 * 创建工作流水
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workItem
	 * @throws Exception
	 */
	public void create(Workitem workItem) throws Exception;
	
	public List<Workitem> findWorkItem(String workid, String forkid);
	
	/**
	 * 
	 * 通过工作流水号、节点号，查找workitem
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workid 工作流水号
	 * @param nodeid 节点号
	 * @return
	 * @throws Exception
	 */
	public abstract Workitem findWorkItemByWorkidAndNodeid(String workid,String nodeid)throws Exception;
	
	/**
	 * 通过工作流水号、分支号，查找workitem
	 * 
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workid 工作流水号
	 * @param forkid 分支号
	 * @return
	 * @throws Exception
	 */
	public abstract  List<Workitem>  findWorkItemByWorkidAndForkid(String workid, String forkid)throws Exception;
	
	/**
	 * 
	 * 通过工作流水号、分支号（默认值为0，表示当前记录为主干，没有分叉）、分支（主键），默认值为0，表示流程主干
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workid 工作流水号
	 * @param forkid     分支号（默认值为0，表示当前记录为主干，没有分叉）
	 * @param branchid 分支（主键），默认值为0，表示流程主干
	 * @return
	 * @throws Exception
	 */
	public abstract Workitem getWorkItem(String workid,String forkid,String branchid)throws Exception;

	/**
	 * 
	 * 新增工作流水
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workItem
	 * @throws Exception
	 */
	public abstract void insert(Workitem workItem)throws Exception;

	/**
	 * 
	 * 修改工作流水
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workItem
	 * @throws Exception
	 */
	public abstract void update(Workitem workItem)throws Exception;
	
	/**
	 * 
	 * 删除工作流水
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workItem
	 * @throws Exception
	 */
	public abstract void delete(Workitem workItem) throws Exception;
		
	public abstract Workitem[] getJoined(String workid, String forkid) throws Exception;
	
	//public abstract List<Workitem> query(String workid, String forkid) throws Exception;
	/**
	 * 
	 * 通过流水号，分支删除流水
	 * @author lijl
	 * @version 1.0 - 2015年4月17日
	 * @param workid 流水号
	 * @param forkid 分支号
	 * @throws Exception
	 */
	public abstract void remove(String workid, String forkid) throws Exception;
	
	
	/**
	 * 取消该柜员的所有检出项
	 * <ul>历史记录
	 *		<li>lijl - 1.0 - 2015年8月19日</li>
	 * </ul>
	 * .
	 * @param workerid
	 * @return 
	 * @throws Exception
	 */
	List<Workitem> selectChkOutWork(String workerid);
	
	public Workitem selectWorkitemByWorkid(String workid);

	public void updateByIdSelective(Workitem work);
	
	public void removeSubprocess(String workid);
}
