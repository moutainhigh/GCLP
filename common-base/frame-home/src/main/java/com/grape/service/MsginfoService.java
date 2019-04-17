package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.bean.Msginfo;
import com.grape.model.db.Msgmaininfo;
import com.grape.model.mapper.PageBean;

public interface MsginfoService {
	
	List<Msginfo> findMsginfoByWorkerid(String workerid,PageBean pageBean);
	
	List<Msginfo>  findMsginfoByWorkeridAndMsgtype(String workerid,String msgtype,PageBean pageBean);
	
	List<Msginfo>  findNewMsginfoByWorkerid(String workerid,PageBean pageBean);
	
	boolean updateState(String id);
	
	boolean insertMsg(String workid, String content, String senduser, String recuser,String msgtype);
	
	Msgmaininfo findById(String id);
	
}
