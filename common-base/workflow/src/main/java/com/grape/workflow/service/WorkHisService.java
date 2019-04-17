package com.grape.workflow.service;

import java.util.List;
import java.util.Map;

import com.grape.model.db.Workhistory;

/** 
 * 类说明
 * @author lijl
 * @version 1.0 - 2015年4月20日
 */
public interface WorkHisService {

	/**
	 * 
	 * 保存工作历史信息
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param Workhistory 工作历史信息
	 * @throws Exception
	 */
	public void save(Workhistory Workhistory);
	
	public List<Map<String,Object>> findWorkHishByWorkid(String workid);
	
	public Workhistory findWorkHis(String workid)throws Exception;

    void save(String workerid, String appno, String operation, String notation) throws Exception;
    
    Workhistory getLastWorkhistory(String workid,String nodeid);
}
