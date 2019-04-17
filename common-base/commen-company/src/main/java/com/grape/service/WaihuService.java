package com.grape.service;

import com.grape.controller.reponse.bean.WaihuCalllog;
import com.grape.model.db.Codetable;

public interface WaihuService {
	/**
	 * 外呼系统获取客服token
	 * @param workid 流水号
	 * @return 客服token
	 */
	String getToken(String workid);
	
	/**
	 * 外呼系统坐席外呼
	 * @param workid
	 * @return
	 */
	String WaihuCallout(String workid,String number);
	
	/**
	 * 获取通话记录
	 * @param workid 流水号
	 * @return
	 */
	WaihuCalllog getWaihuCalllog(String workid,String callid);
	
	Codetable findCodetableForCUSTTYPE(String custtype) throws Exception;
}
