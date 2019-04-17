package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ChanapprovalformRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.response.bean.CreditLineBean;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.ChanapprovalformExample;
import com.grape.model.db.Verifyopinion;
import com.grape.model.db.Workhistory;
import com.grape.model.db.WorkhistoryExample;
import com.grape.model.mapper.base.ChanapprovalformMapper;
import com.grape.model.mapper.base.VerifyopinionMapper;
import com.grape.model.mapper.base.WorkhistoryMapper;
import com.grape.model.mapper.external.ChanapprovalformExMapper;
import com.grape.service.ChanapprovalformService;
import com.grape.util.Util;

@Service
public class ChanapprovalformServiceImpl implements ChanapprovalformService{
	private static final Logger log = LoggerFactory.getLogger(ChanapprovalformServiceImpl.class);
	@Autowired
	private ChanapprovalformMapper chanapprovalformMapper;
	@Autowired
	private WorkhistoryMapper workhistoryMapper ;
	@Autowired
	private VerifyopinionMapper verifyoptionMapper;
	
	@Autowired
	private ChanapprovalformExMapper chanapprovalformExMapper;
	
	@Override
	public void insertChanapproval(ChanapprovalformRequest req, FlowHandleResponse res) {
		Chanapprovalform chan = new Chanapprovalform();
		try {
			Util.transferFields(req, chan);
			chan.setId(Util.getID());
			chan.setTempflg("0");
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		if(res!=null){
			chan.setLogid(res.getLogid());
		}
		chanapprovalformMapper.insertSelective(chan);
		
	}
	@Override
	public Chanapprovalform selectchanapprovalByLogid(String id) {
		ChanapprovalformExample example = new ChanapprovalformExample();
		example.createCriteria().andLogidEqualTo(id);
		List<Chanapprovalform> list = chanapprovalformMapper.selectByExample(example);
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
	@Override
	public List<Workhistory> selectByWorkid(WorkidRequest req) {
		WorkhistoryExample exam = new WorkhistoryExample() ;
		exam.createCriteria().andWorkidEqualTo(req.getWorkid()) ;
		return workhistoryMapper.selectByExample(exam) ;
	}
	/*
	 * 		for (Workhistory workhis : list) {
			if(workhis.getNode().contains("PRD001")) {
				int i = 0 ;
				for(i = 110 ; i < 112 ; i ++) {
					if(workhis.getNode().contains(String.valueOf(i)) && workhis.getNextnode().equals("PRD00151")) {
						
					}
				}
			}
		}
	 */
	@Override
	public void updateChannapproval(ChanapprovalformRequest req, FlowHandleResponse res) {
		Chanapprovalform chan = new Chanapprovalform();
		try {
			Util.transferFields(req, chan);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		if(res!=null){
			chan.setLogid(res.getLogid());
		}
		chanapprovalformMapper.updateByPrimaryKeySelective(chan);
	}
	@Override
	public Verifyopinion selectVerifyByWorkid(String workid) {
		return verifyoptionMapper.selectByPrimaryKey(workid);
	}
	@Override
	public List<Chanapprovalform> findChanApprovalFormByWorkid(String workid) {
		ChanapprovalformExample example = new ChanapprovalformExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Chanapprovalform> chanapprovalforms = chanapprovalformMapper.selectByExample(example);
		return chanapprovalforms;
	}
	@Override
	public String findMortgagenote(String workid) {
		List<Chanapprovalform> chanapprovalforms= chanapprovalformExMapper.findMortgagenoteByMap(workid);
		if(!chanapprovalforms.isEmpty()){
			return chanapprovalforms.get(0).getMortgagenote();
		}
		return null;
	}
	@Override
	public Chanapprovalform findChanapprovalformByNode(String workid) {
		
		Map<String, String> map = new HashMap<>();
		map.put("workid", workid);
		map.put("nodename", "资金方一级审批");
		List<Chanapprovalform> chanapprovalforms = chanapprovalformExMapper.findChanapprovalformByMap(map);
		if(!chanapprovalforms.isEmpty()){
			return chanapprovalforms.get(0);
		}
		return null;
	}
	@Override
	public void saveChanapproval(ChanapprovalformRequest req) {
		Map<String, String> map = new HashMap<>();
		map.put("workid", req.getWorkid());
		Chanapprovalform chanapproval = chanapprovalformExMapper.selectTempChanapprovalform(map);
		if(chanapproval!= null){
			try {
				Util.transferFields(req, chanapproval);
				chanapproval.setTempflg("1");
			} catch (Exception e) {
				log.info("转换实体类出错");
			}
			chanapprovalformMapper.updateByPrimaryKeySelective(chanapproval);
		}else{
			Chanapprovalform chan = new Chanapprovalform();
			try {
				Util.transferFields(req, chan);
				chan.setId(Util.getID());
				chan.setTempflg("1");
			} catch (Exception e) {
				log.info("转换实体类出错");
			}
			chanapprovalformMapper.insertSelective(chan);
		}
	}
	@Override
	public Chanapprovalform selectChanapprovalformByWorkid(WorkidRequest req) {
		Map<String, String> map = new HashMap<>();
		map.put("workid", req.getWorkid());
		Chanapprovalform chanapproval = chanapprovalformExMapper.selectTempChanapprovalform(map);
		return chanapproval;
	}
}
