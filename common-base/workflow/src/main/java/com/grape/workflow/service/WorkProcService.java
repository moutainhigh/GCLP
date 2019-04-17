package com.grape.workflow.service;

import com.grape.model.db.Workproc;

/**
 * 
 * 类型说明
 * @author lijl
 * @version 1.0 - 2015年4月17日
 */
public interface WorkProcService {

	/**
	 * 
	 * 通过流水号获取工作流程信息
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @return　Workproc　工作流程
	 */
	public Workproc getWorkprocByWorkId(String workid);
}
