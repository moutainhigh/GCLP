package com.grape.workflow.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.grape.model.db.Workassign;
import com.grape.model.db.Workitem;

/**
 * 
 * 类型说明
 * @author lijl
 * @version 1.0 - 2015年4月17日
 */
public interface WorkAssignService {

	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid
	 * @param orgno
	 * @param roleid
	 * @param lane
	 * @return
	 * @throws Exception
	 */
	public abstract List<Workassign >  generateList(String workid,String orgno,List<String> roles,String lane) throws Exception;
	
	/**
	 * 
	 * 通过流水号、机构号、角色、通道获取最优的工作分配信息列表
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @param orgno　机构号
	 * @param roleid　角色
	 * @param lane　　通道
	 * @return
	 * @throws Exception
	 */
    public abstract Workassign getBest(String workid,String orgno,List<String> roles,String lane) throws Exception;
	
    /**
     * 
     * 通过流水号、机构号、角色、通道，用户ID获取最优的工作分配（除了指定的某个柜员）信息列表
     * lijl
     * 1.0 - 2015年4月23日
     * @param workid　流水号
     * @param orgno　机构号
     * @param roleid　　角色
     * @param lane　　　通道
     * @param exceptUserid　用户ID
     * @return
     * @throws Exception
     */
	public abstract Workassign getBestExceptUserid(String workid,String orgno,List<String> roles,String lane,String exceptUserid) throws Exception;
	
	/**
	 * 
	 * 通过流水号、通道、用户ID校验
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @param lane　　通道
	 * @param userid　用户ID
	 * @return
	 * @throws Exception
	 */
	public abstract boolean checkAccess(Workitem workitem,String lane,String userid) throws Exception;
	
	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @param userid　用户ID
	 * @return
	 * @throws Exception
	 */
	public abstract boolean checkAssignable(String workid, String userid)throws Exception;
	
	/**
	 * 
	 * 通过流水号、角色、通道、用户ID获取工作分配信息
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @param roleid　　角色
	 * @param lane　　通道
	 * @param userid　用户ID
	 * @return
	 * @throws Exception
	 */
	public abstract Workassign get(String workid,List<String> roles,String lane,String userid) throws Exception;
	
	/**
	 * 
	 * 通过流水号、角色、通道获取工作分配列表信息
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @param roleid　角色
	 * @param lane　　通道
	 * @return　工作分配列表
	 * @throws Exception
	 */
	public abstract List<Workassign> query(String workid, List<String> roles,String lane) throws Exception;
	
	/**
	 * 
	 * 通过流水号、角色、通道获取工作分配信息
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid 流水号
	 * @param roleid  角色
	 * @param lane   通道
	 * @return     工作分配信息
	 * @throws Exception
	 */
	public abstract Workassign getOneByRoleId(String workid,List<String> roles,String lane) throws Exception;

	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid
	 * @param orgno
	 * @param roleid
	 * @param lane
	 * @return
	 * @throws Exception
	 */
	public abstract List<HashMap<String, Object>>  findWorkassignGenerateList(String workid,String orgno,List<String> roles,String lane) throws Exception;
	
	/**
	 * 
	 * 保存工作分配信息（多个工作分配）
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param list 工作分配信息列表
	 * @throws Exception
	 */
	public abstract void save(List<Workassign> list) throws Exception;

	/**
	 * 
	 * 保存工作分配信息（单个）
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workAssign　工作分配
	 * @throws Exception
	 */
	public abstract void save(Workassign workAssign) throws Exception;

	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid
	 * @param orgno
	 * @param roleid
	 * @param lane
	 * @return
	 * @throws Exception
	 */
	public abstract List<HashMap<String, Object>> findWorkassignBest(String workid,String orgno,List<String> roles,String lane) throws Exception;
	
	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid
	 * @param orgno
	 * @param roleid
	 * @param lane
	 * @param exceptUserid
	 * @return
	 * @throws Exception
	 */
	public abstract List<HashMap<String, Object>> findWorkassignBestExceptUserid(String workid,String orgno,List<String> roles,String lane,String exceptUserid) throws Exception;

	/**
	 * 
	 * 通过流水号、角色、通道删除工作分配信息
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid　流水号
	 * @param roleid　角色
	 * @param lane　　通道
	 * @throws Exception
	 */
	public abstract void delete(String workid,List<String> roles,String lane) throws Exception;
	
	/**
	 * 
	 * 方法说明
	 * lijl
	 * 1.0 - 2015年4月23日
	 * @param workid
	 * @param roleid
	 * 
	 * 
	 * 
	 * 
	 * @param lane
	 * @param exceptUserid
	 * @throws Exception
	 */
	public abstract void removeOtherActors(String workid,String roleid,String lane,String exceptUserid) throws Exception;
	
    /**
     * 
     * 通过流水号，用户ID获得工作分配信息
     * lijl
     * 1.0 - 2015年4月23日
     * @param workid  流水号
     * @param userid  用户ID
     * @return  工作分配信息
     * @throws Exception
     */
	public abstract Workassign findWorkassignByWorkidAndUserid(String workid,String userid) throws Exception;

	public abstract void updateuser(String workid, String workerid,String roleid);

	public abstract Workassign findByWorkidAndNodeid(String workid,String nodeid);
	
	public abstract void removeById(String id);
}
