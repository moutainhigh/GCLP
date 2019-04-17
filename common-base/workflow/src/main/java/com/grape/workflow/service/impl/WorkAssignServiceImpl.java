package com.grape.workflow.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.mapper.base.WorkassignMapper;
import com.grape.model.mapper.external.WorkflowExMapper;
import com.grape.workflow.dao.BaseDao;
import com.grape.model.db.Person;
import com.grape.model.db.Userapprove;
import com.grape.model.db.Workassign;
import com.grape.model.db.WorkassignExample;
import com.grape.model.db.Workitem;
import com.grape.workflow.model.mapper.WorkassignMapperExtra;
import com.grape.workflow.service.WorkAssignService;

/**
 * 
 * 类型说明
 * @author lijl
 * @version 1.0 - 2015年4月17日
 */
@Service
public class WorkAssignServiceImpl extends BaseDao implements WorkAssignService {

	
	@Autowired
	private WorkassignMapper workassignMapper;
	
	@Autowired
	private WorkflowExMapper workflowExMapper;
	
	public List<Workassign> generateList(String workid, String orgno,
			List<String> roles, String lane) throws Exception {
		List<Workassign> workassigns = new ArrayList<Workassign>();
		 List<HashMap<String, Object>> reslutMap = this.findWorkassignGenerateList(workid, orgno, roles, lane);
		 Workassign workAssign = null;
		 for (HashMap<String, Object> workassigMap : reslutMap) {
			    workAssign = new Workassign();
				workAssign.setWorkid((String)workassigMap.get("workid"));
				workAssign.setRoleid((String)workassigMap.get("roleid"));
				workAssign.setLane(lane);
				workAssign.setUserid((String)workassigMap.get("tlrid"));
				workassigns.add(workAssign);
		}
		return workassigns;
	}

	public Workassign getBest(String workid, String orgno, List<String> roles,
			String lane) throws Exception {
		 Workassign workAssign = null;
		 List<HashMap<String, Object>> reslutMap = this.findWorkassignBest(workid, orgno, roles, lane);
		 String tlrid = null;
		int minCount = -1;
		int count = 0;
		 for (HashMap<String, Object> workAssignMap : reslutMap) {
			    count = (Integer)workAssignMap.get("cnt");
				if(count<minCount || minCount==-1){
					minCount = count;
					tlrid = (String)workAssignMap.get("tlrid");
					if(count == 0){
						break;
					}
				}
	}	
		 if(tlrid!=null){
				workAssign = new Workassign();
				workAssign.setWorkid(workid);
//				workAssign.setRoleid(roleid);//TODO 确认该笔流水的执行角色应该放到哪里
				workAssign.setLane(lane);
				workAssign.setUserid(tlrid);
			}	 
		return workAssign;
	}

	public Workassign getBestExceptUserid(String workid, String orgno, List<String> roles,
			String lane, String exceptUserid) throws Exception {
		Workassign workAssign = null;
		String tlrid = null;
		int minCount = -1;
		int count = 0;
		 List<HashMap<String, Object>> reslutMap = this.findWorkassignBestExceptUserid(workid, orgno, roles, lane, exceptUserid);
		 for (HashMap<String, Object> workAssignMap : reslutMap) {
			     count =  (Integer)workAssignMap.get("cnt");
				if(count<minCount || minCount==-1){
					minCount = count;
					tlrid = (String)workAssignMap.get("tlrid");	
					if(count == 0){
						break;
					}
				}
		}	
		 if(tlrid!=null){
				workAssign = new Workassign();
				workAssign.setWorkid(workid);
//				workAssign.setRoleid(roleid);//TODO 确认该笔流水的执行角色应该放到哪里
				workAssign.setLane(lane);
				workAssign.setUserid(tlrid);
			}
		return workAssign;
	}

	/**
	 * 检查是否有权限处理该笔流水
	 */
	public boolean checkAccess(Workitem workitem, String lane, String userid)
			throws Exception {
		
		if(workitem.getAuthuserid()!=null){
			if(workitem.getAuthuserid().equals(userid)){//有权审批人与当前用户一致
				return true;
			}else{
				return false;//有权审批人与当前用户一致
			}
		}else{
			List<Userapprove> approve = getApproveUsers(workitem.getWorkid(),workitem.getNode(),userid);
			if(approve!=null&&approve.size()>0){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * @param userid 
	 * @param nodeid 
	 * @return
	 */
	public List<Userapprove> getApproveUsers(String workid, String nodeid, String userid){
		Map<String,String> map = new HashMap<String,String>();
		map.put("workid", workid);
		map.put("nodeid", nodeid);
		map.put("userid", userid);
		return workflowExMapper.findApproveUsers(map);
		
	}

	public boolean checkAssignable(String workid, String userid)
			throws Exception {
		boolean result = false;
		 Workassign workassign = this.findWorkassignByWorkidAndUserid(workid, userid);
		String uid=null;
		uid = workassign.getUserid();
		if(uid==null){
			result = true;
		}else{
			result = false;
		}
		return result;
	}

	public Workassign get(String workid, List<String> roles, String lane,
			String userid) throws Exception {
		Workassign workAssign = null;
		List<Workassign> workassigns = new ArrayList<Workassign>();
		WorkassignExample example = new WorkassignExample();
		example.createCriteria().andWorkidEqualTo(workid)
//		                                    .andRoleidEqualTo(roleid)//TODO 确认该笔流水的执行角色应该放到哪里
		                                    .andUseridEqualTo(userid)
		                                    .andLaneEqualTo(lane);
		
		workassigns = workassignMapper.selectByExample(example);
		if(workassigns!=null&&workassigns.size()>0){
			 workAssign = workassigns.get(0);
		}
		return workAssign;
	}

	public List<Workassign> query(String workid, List<String> roles, String lane)
			throws Exception {
		List<Workassign> workassigns = new ArrayList<Workassign>();
		WorkassignExample example = new WorkassignExample();
		example.createCriteria().andWorkidEqualTo(workid)
//		                                    .andRoleidEqualTo(roleid)//TODO 确认该笔流水的执行角色应该放到哪里
		                                    .andLaneEqualTo(lane);
		
		workassigns = workassignMapper.selectByExample(example);
		return workassigns;
	}

	public Workassign getOneByRoleId(String workid, List<String> roles, String lane)
			throws Exception {
		
		Workassign workAssign = null;
		List<Workassign> list = this.query(workid,roles,lane);
		if(list!=null && !list.isEmpty()){
			workAssign = list.get(0);
		}
		return workAssign;
	}

	public List<HashMap<String, Object>> findWorkassignGenerateList(
			String workid, String orgno, List<String> roles, String lane)
			throws Exception {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("workid", workid);
		paramMap.put("orgno", orgno);
		paramMap.put("roleid", roles);//TODO 需要修改查询语句
		paramMap.put("lane", lane);
		return  selectList(WorkassignMapperExtra.class, "findWorkassignGenerateList", paramMap);
	
	}

	public void save(List<Workassign> list) throws Exception {
		if(list!=null){
			for (Workassign workAssign : list) {
				save(workAssign);
			}
		}
		
	}

	public void save(Workassign workAssign) throws Exception {
		  workassignMapper.insert(workAssign);
	}

	public List<HashMap<String, Object>> findWorkassignBest(String workid,
			String orgno, List<String> roles, String lane) throws Exception {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("workid", workid);
		paramMap.put("orgno", orgno);
		paramMap.put("roleid", roles);//TODO 需要修改查询语句
		paramMap.put("lane", lane);
		return  selectList(WorkassignMapperExtra.class, "findWorkassignBest", paramMap);
	}

	public List<HashMap<String, Object>> findWorkassignBestExceptUserid(
			String workid, String orgno, List<String> roles, String lane,
			String exceptUserid) throws Exception {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("workid", workid);
		paramMap.put("orgno", orgno);
		paramMap.put("roleid", roles);
		paramMap.put("lane", lane);
		paramMap.put("exceptUserid", exceptUserid);
		return  selectList(WorkassignMapperExtra.class, "findWorkassignBest", paramMap);
	}

	public void delete(String workid, List<String> roles, String lane)
			throws Exception {
		WorkassignExample example = new WorkassignExample();
		example.createCriteria().andWorkidEqualTo(workid)
//		                                    .andRoleidEqualTo(roleid)//TODO 需要修改查询语句
		                                    .andLaneEqualTo(lane);       
		
		workassignMapper.deleteByExample(example);
		
	}

	public void removeOtherActors(String workid, String roleid, String lane,
			String exceptUserid) throws Exception {
		WorkassignExample example = new WorkassignExample();
		example.createCriteria().andWorkidEqualTo(workid)
		                                    .andRoleidEqualTo(roleid)
		                                    .andLaneEqualTo(lane)
		                                   .andUseridNotEqualTo(exceptUserid);
		workassignMapper.deleteByExample(example);
		
	}

	public Workassign findWorkassignByWorkidAndUserid(String workid,
			String userid) throws Exception {		
		List<Workassign> workassigns = new ArrayList<Workassign>();
		WorkassignExample example = new WorkassignExample();
		example.createCriteria().andWorkidEqualTo(workid)
		                                    .andUseridEqualTo(userid);
		workassigns = workassignMapper.selectByExample(example);
		if(workassigns!=null&&workassigns.size()>0){
			return  workassigns.get(0);
		}
		return null;
	}

	@Override
	public void updateuser(String workid, String workerid,String roleid) {
		Workassign workassign = new Workassign();
		workassign.setWorkid(workid);
		workassign.setUserid(workerid);
		workassign.setRoleid(roleid);
		workassignMapper.updateByPrimaryKey(workassign);
	}

	@Override
	public Workassign findByWorkidAndNodeid(String workid,String nodeid) {
		WorkassignExample example = new WorkassignExample();
		example.createCriteria().andWorkidEqualTo(workid).andNodeidEqualTo(nodeid);
		List<Workassign> list = workassignMapper.selectByExample(example);
		if(list!=null&&!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void removeById(String id) {
		workassignMapper.deleteByPrimaryKey(id);
	}

}
