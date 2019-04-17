package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.GroomapprovalRequest;
import com.grape.controller.request.GroommortgageRequest;
import com.grape.model.db.Groomapproval;
import com.grape.model.db.GroomapprovalExample;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.GroommortgageExample;
import com.grape.model.mapper.base.GroomapprovalMapper;
import com.grape.model.mapper.base.GroommortgageMapper;
import com.grape.service.GroomapprovalService;
import com.grape.util.Util;
@Service
public class GroomapprovalServiceImpl implements GroomapprovalService{
	private Logger log = LoggerFactory.getLogger(GroomapprovalServiceImpl.class);
	@Autowired
	private GroomapprovalMapper groomapprovalMapper;
	@Autowired
	private GroommortgageMapper groommortgageMapper;
	@Override
	public void insertGroomApproval(GroomapprovalRequest req,FlowHandleResponse res) {
		Groomapproval approval = new Groomapproval();
		List<GroommortgageRequest> list = req.getList();
		for(int i=0;i<list.size();i++){
			GroommortgageRequest groom = list.get(i);
			Groommortgage mort = new Groommortgage();
			try {
				Util.transferFields(groom, mort);
			} catch (Exception e) {
				log.info("转换实体类出错"+e);
			}
			if(res!=null){
				mort.setLogid(res.getLogid());
			}
			mort.setChgdt(new Date());
			mort.setId(Util.getID());
			mort.setWorkid(req.getWorkid());
			groommortgageMapper.insertSelective(mort);
		}
		try {
			Util.transferFields(req, approval);
			approval.setId(Util.getID());
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		approval.setChgdt(new Date());
		if(res!=null){
			approval.setLogid(res.getLogid());
		}
		groomapprovalMapper.insertSelective(approval);
		
	}
	@Override
	public Groomapproval selectgroomapprovalByLogid(String id) {
		GroomapprovalExample example = new GroomapprovalExample();
		example.createCriteria().andLogidEqualTo(id);
		return groomapprovalMapper.selectByExample(example).get(0);
	}
	@Override
	public List<Groommortgage> selectgroommortgageByLogid(String id) {
		GroommortgageExample example = new GroommortgageExample();
		example.createCriteria().andLogidEqualTo(id);
		return groommortgageMapper.selectByExample(example);
	}

}
