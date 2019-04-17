package com.grape.service;

import java.util.List;


import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ExaminationRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkhistoryRequest;
import com.grape.controller.request.WorkidAndStageRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Productnode;
import com.grape.model.db.Workhistory;

public interface WorkhistoryService {

	List<Workhistory> queryByWorkid(WorkidRequest req, String orgbelongsto);

	void insertWorkhistory(WorkhistoryRequest req);


	void insertExamination(ExaminationRequest req , FlowHandleResponse res) ;

	List<Workhistory> selectRiskWorkhistory(WorkidRequest req);

	Workhistory selectWorkhisById(IdRequest req);

	List<Workhistory> selectSelfWorkhistory(WorkidAndStageRequest req);

	Productnode selectProductNode(String node);

	List<Workhistory> selectWorkhistory(WorkidRequest req);

	Workhistory selectWorkhisByStage(String workid, String string);

	/**
	 * 根据类型查询审批历史记录
	 * @param workid 流水号
	 * @param type 审批类型
	 * @param stage
	 * @return
	 */
	List<Workhistory> findWorkhistList(String workid,String type,String stage);

}
