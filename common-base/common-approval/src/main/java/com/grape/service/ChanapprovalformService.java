package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ChanapprovalformRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.response.bean.CreditLineBean;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Verifyopinion;
import com.grape.model.db.Workhistory;

public interface ChanapprovalformService {

	void insertChanapproval(ChanapprovalformRequest req, FlowHandleResponse res);

	Chanapprovalform selectchanapprovalByLogid(String id);
	
	List<Workhistory> selectByWorkid(WorkidRequest req) ;
	
	void updateChannapproval(ChanapprovalformRequest req, FlowHandleResponse res) ;

	Verifyopinion selectVerifyByWorkid(String workid);
	
	
	List<Chanapprovalform> findChanApprovalFormByWorkid(String workid);
	
	/**
	 * 查询抵押物信息审查
	 * @param workid
	 * @return
	 */
	String findMortgagenote(String workid);
	
	/**
	 * 根据节点查询审查信息
	 * @param workid
	 * @return
	 */
	Chanapprovalform findChanapprovalformByNode(String workid);

	void saveChanapproval(ChanapprovalformRequest req);

	Chanapprovalform selectChanapprovalformByWorkid(WorkidRequest req);

}
