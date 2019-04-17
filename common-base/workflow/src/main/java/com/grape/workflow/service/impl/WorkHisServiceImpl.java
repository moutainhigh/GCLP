package com.grape.workflow.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.workflow.dao.BaseDao;
import com.grape.model.db.Workhistory;
import com.grape.model.db.WorkhistoryExample;
import com.grape.model.db.Workitem;
import com.grape.model.mapper.base.WorkhistoryMapper;
import com.grape.model.mapper.base.WorkitemMapper;
import com.grape.workflow.model.mapper.WorkhistMapperExtra;
import com.grape.workflow.service.WorkHisService;
import com.grape.workflow.util.WorkUtil; 

/** 
 * 类说明
 * @author lijl
 * @version 1.0 - 2015年4月20日
 */
@Service
public class WorkHisServiceImpl extends BaseDao implements WorkHisService {

	@Autowired
	private WorkhistoryMapper workhistMapper;
	
	@Autowired
	private WorkitemMapper workitemMapper;
	
	@Autowired
	private WorkhistMapperExtra histExt;
	
	public void save(Workhistory workHist)  {
		workhistMapper.insert(workHist);
	}
	
	@Override
	public void save(String workerid, String appno,String operation,String notation) throws Exception  {
	        Workitem workitem = workitemMapper.selectByPrimaryKey(appno,"0","0");
	        if(null != workitem){
    	        Workhistory workHist = new Workhistory();
    	        workHist.setOperation(operation);
    	        workHist.setWorkid(workitem.getWorkid());
    	        workHist.setUserid(workerid);
    	        workHist.setNextnode(workitem.getNode());
    	        workHist.setNode(workitem.getNode());
    	        workHist.setNotation(notation);
    	        workHist.setOperdate(new Date());
    	        workHist.setId(WorkUtil.getID());
    	        workhistMapper.insert(workHist);
	        }else{
	            throw new Exception("找不到处理的工作项["+appno+"]");
	        }
	    }

	@Override
	public List<Map<String, Object>> findWorkHishByWorkid(String workid) {
		HashMap<String, Object> paramMap = new  HashMap<String, Object>();
		paramMap.put("workid", workid);
		return this.selectList(WorkhistMapperExtra.class, "findWorkHishByWorkid", paramMap);
	}

	@Override
	public Workhistory findWorkHis(String workid) throws Exception{
		HashMap<String, Object> paramMap = new  HashMap<String, Object>();
		paramMap.put("workid", workid);
		return histExt.findWorkHishByWorkid2(paramMap);
	}

	@Override
	public Workhistory getLastWorkhistory(String workid, String nodeid) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(workid).andNodeEqualTo(nodeid);
		example.setOrderByClause("id desc");
		List<Workhistory> list = workhistMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	

}
