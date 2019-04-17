package com.grape.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.Msginfo;
import com.grape.model.db.Msgadditional;
import com.grape.model.db.Msgmaininfo;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.PageBean;
import com.grape.model.mapper.base.MsgadditionalMapper;
import com.grape.model.mapper.base.MsgmaininfoMapper;
import com.grape.model.mapper.external.MsginfoExMapper;
import com.grape.service.MsginfoService;
import com.grape.tool.Util;

@Service
public class MsginfoServiceImpl extends BaseMapper implements MsginfoService {

	@Autowired
	MsginfoExMapper msginfoExMapper;
	@Autowired
	MsgadditionalMapper msgadditionalMapper;
	@Autowired
	MsgmaininfoMapper msgmaininfomapper;
	@Override
	public List<Msginfo>  findMsginfoByWorkerid(String workerid,PageBean pageBean) {
		return findMsginfoByWorkeridAndMsgtype(workerid, null,pageBean);
	}
	@Override
	public List<Msginfo>  findMsginfoByWorkeridAndMsgtype(String workerid, String msgtype,PageBean pageBean) {
		
		Map<String,String> param = new HashMap<String, String>();
		param.put("workerid", workerid);
		if(msgtype!=null&&msgtype!=""){
			param.put("msgtype", msgtype);
		}
		List<Msginfo> msginfos = queryList(MsginfoExMapper.class, "findMsginfoByWorkerid", param, pageBean);
		Integer count = msginfoExMapper.countByMsginfos(param);
		pageBean.setRecordCount(count);
		return msginfos;
	}
	@Override
	public List<Msginfo>  findNewMsginfoByWorkerid(String workerid,PageBean pageBean) {
		
		Map<String,String> param = new HashMap<String, String>();
		param.put("workerid", workerid);
		
		List<Msginfo> msginfos = queryList(MsginfoExMapper.class, "findNewMsginfoByWorkerid", param, pageBean);
		Integer count = msginfoExMapper.countByNewMsginfos(param);
		pageBean.setRecordCount(count);
		
		return msginfos;
	}
	@Override
	public boolean updateState(String id) {
		Msgadditional msgadditional = msgadditionalMapper.selectByPrimaryKey(id);
		msgadditional.setState("1");
		int flag ;
		flag = msgadditionalMapper.updateByPrimaryKey(msgadditional);
		if(flag==1){
			return true;
		}
				
		return false;
	}
	@Override
	public boolean insertMsg(String workid, String content, String senduser, String recuser,String msgtype) {
		int flag;
		Msgmaininfo msgmaininfo = new Msgmaininfo();
		msgmaininfo.setId(Util.getID());
		msgmaininfo.setWorkid(workid);
		msgmaininfo.setRecuser(recuser);
		msgmaininfo.setSenduser(senduser);
		msgmaininfo.setContent(content);
		msgmaininfo.setMsgtype(msgtype);
		msgmaininfo.setChgdt(new Date());
		flag = msgmaininfomapper.insert(msgmaininfo);
		if(flag ==1){
			//成功再更新进消息附加表
			String[] recusers = recuser.split(",");
			for (String recuser2 : recusers) {
				Msgadditional msgadditional = new Msgadditional();
				msgadditional.setId(Util.getID());
				msgadditional.setRefid(msgmaininfo.getId());
				msgadditional.setState("0");
				msgadditional.setEvaltime(recuser2);
				msgadditional.setChgdt(new Date());
				flag = msgadditionalMapper.insert(msgadditional);
			}
			if(flag==1){
				return true;
			}
		}
		return false;
	}
	@Override
	public Msgmaininfo findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}



}
