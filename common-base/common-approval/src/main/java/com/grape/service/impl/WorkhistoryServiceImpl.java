package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ExaminationRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkhistoryRequest;
import com.grape.controller.request.WorkidAndStageRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Examination;
import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import com.grape.model.db.Workhistory;
import com.grape.model.db.WorkhistoryExample;
import com.grape.model.mapper.base.ExaminationMapper;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.model.mapper.base.WorkhistoryMapper;
import com.grape.service.WorkhistoryService;
import com.grape.util.Util;
@Service
public class WorkhistoryServiceImpl implements WorkhistoryService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	@Autowired
	private WorkhistoryMapper workhistoryMapper;
	@Autowired
	private ExaminationMapper examinationMapper ;
	@Autowired
	private ProductnodeMapper productnodeMapper;
	
	@Override
	public List<Workhistory> queryByWorkid(WorkidRequest req,String orgbelongsto) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andUseridNotEqualTo("00000000");
		List<Workhistory> workhislist = workhistoryMapper.selectByExample(example);
		return workhislist;
	}
	@Override
	public void insertWorkhistory(WorkhistoryRequest req) {
		Workhistory workhis = new Workhistory();
		try {
			Util.transferFields(req, workhis);
			
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		workhis.setId(Util.getID());
		workhistoryMapper.insertSelective(workhis);
	}

	@Override
	public void insertExamination(ExaminationRequest req , FlowHandleResponse res) {
		Examination examin = new Examination() ;
		try {
			Util.transferFields(req, examin);
			examin.setId(Util.getID());
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		if(res!=null){
			examin.setLogid(res.getLogid());
		}		
		examinationMapper.insert(examin) ;		
	}

	@Override
	public List<Workhistory> selectRiskWorkhistory(WorkidRequest req) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andStageEqualTo("3");
		List<Workhistory> list = workhistoryMapper.selectByExampleWithBLOBs(example);
		return list;
	}
	@Override
	public Workhistory selectWorkhisById(IdRequest req) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andIdEqualTo(req.getId());
		List<Workhistory> list = workhistoryMapper.selectByExampleWithBLOBs(example);
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
	@Override
	public List<Workhistory> selectSelfWorkhistory(WorkidAndStageRequest req) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andStageEqualTo(req.getStage());
		return workhistoryMapper.selectByExampleWithBLOBs(example);
	}
	@Override
	public Productnode selectProductNode(String node) {
		ProductnodeExample example = new ProductnodeExample();
		example.createCriteria().andNodeidEqualTo(node);
		return productnodeMapper.selectByExample(example).get(0);
	}

	@Override
	public List<Workhistory> selectWorkhistory(WorkidRequest req) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		List<Workhistory> workhislist = workhistoryMapper.selectByExample(example);
		return workhislist;
	}

	@Override
	public Workhistory selectWorkhisByStage(String workid, String stage) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(workid).andStageEqualTo(stage);
		List<Workhistory> list = workhistoryMapper.selectByExample(example);
		return list.get((list.size()-1));
	}
	@Override
	public List<Workhistory> findWorkhistList(String workid, String type,String stage) {
		WorkhistoryExample example = new WorkhistoryExample();
		example.createCriteria().andWorkidEqualTo(workid).andTypeEqualTo(type).andStageEqualTo(stage);
		List<Workhistory> list = workhistoryMapper.selectByExample(example);
		
		return list;
	}
	
	


	
}
