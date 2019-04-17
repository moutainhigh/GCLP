package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ApplyforexRequest;
import com.grape.controller.request.StatisticalRepay;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Applyforex;
import com.grape.model.db.ApplyforexExample;
import com.grape.model.db.Product;
import com.grape.model.db.RepayinfoExample;
import com.grape.model.db.Repayplan;
import com.grape.model.db.RepayplanExample;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.mapper.base.ApplyforexMapper;
import com.grape.model.mapper.base.ComapplyMapper;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.RepayinfoMapper;
import com.grape.model.mapper.base.RepayplanMapper;
import com.grape.model.mapper.external.ApplyforexFMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.model.mapper.external.RepaytoinfoExMapper;
import com.grape.service.ApplyforexService;
import com.grape.util.Util;
@Service
public class ApplyforexServiceImpl implements ApplyforexService {
	private static final Logger log = LoggerFactory.getLogger(CustinfoServiceImpl.class);
	
	@Autowired
	private ApplyforexMapper applyforexMapper;
	@Autowired
	private ComapplyMapper comapplyMapper;
	@Autowired
	private RepayinfoMapper repayinfoMapper ;
	@Autowired
	private RepayplanMapper repayplanMapper ;
	@Autowired
	private DoctaskExMapper doctaskExMapper ;
	@Autowired
	private ApplyforexFMapper applyforexFMapper ;
	@Autowired
	private CustinfoMapper custinfoMapper ;
	@Autowired
	private RepaytoinfoExMapper repaytoinfoExMapper;

	@Override
	public void insertApplyforex(ApplyforexRequest request){
		Applyforex applyforex = new Applyforex() ;
		
		ApplyforexRequest req = new ApplyforexRequest() ;
		req.setMainborrower(request.getMainborrower());
		req.setIdentifino(request.getIdentifino());
		req.setExamount(request.getExamount());
		req.setExage(request.getExage());
		req.setExinterestrate(request.getExinterestrate());
		req.setRepaymethod(request.getRepaymethod());
		req.setExreason(request.getExreason());
		req.setNewworkid(request.getNewworkid());
		req.setWorkid(request.getWorkid());
	
		try {
			Util.transferFields(req, applyforex);
		} catch (Exception e) {
			log.info("实体转换出错"+e);
		}		
			applyforex.setId(Util.getID());
			applyforexMapper.insert(applyforex) ;		
	}

	@Override
	public int countByExample(WorkidRequest req) {
		RepayinfoExample example = new RepayinfoExample() ;
		RepayplanExample example2 = new RepayplanExample() ;
		example.createCriteria().andWorkidEqualTo(req.getWorkid()) ;
		example2.createCriteria().andWorkidEqualTo(req.getWorkid()) ;
		int countByExample = repayinfoMapper.countByExample(example) ;
		int countByExample2 = repayplanMapper.countByExample(example2) ;
		if(countByExample2 - countByExample == 1) {
			return 1 ;
		}else{
			return 0;
		}
	}

	@Override
	public Product selectProducttype(WorkidRequest req) {
		
		return doctaskExMapper.selectProducttype(req);
	}

	@Override
	public Repaytoinfo selectFinalrepaytoinfo(WorkidRequest req) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("workid", req.getWorkid());
		return repaytoinfoExMapper.selectFinalRepaytoinfo(map);
	}

	@Override
	public StatisticalRepay statisticalRepay(String workid) {
	
		return applyforexFMapper.statisticalRepay(workid);
	}

	@Override
	public Applyforex selectByPrimaryKey(String workid) {
		
		return applyforexMapper.selectByPrimaryKey(workid);
	}

	@Override
	public Repayplan selectRepaycapital(String workid) {
		
		return applyforexFMapper.selectRepaycapital(workid);
	}

	@Override
	public List<Repayplan> isApplyforex(String workid) {
	 List<Repayplan> list = applyforexFMapper.isApplyforex(workid) ;
		return list;
	}

	@Override
	public List<Applyforex> selectByWorkid(String workid) {
		ApplyforexExample example = new ApplyforexExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		List<Applyforex> list = applyforexMapper.selectByExample(example) ;
		return list;
	}

	@Override
	public String selectByNewWorkid(String workid) {
		ApplyforexExample example = new ApplyforexExample() ;
		example.createCriteria().andNewworkidEqualTo(workid) ;
		List<Applyforex> list = applyforexMapper.selectByExample(example) ;
		if(!list.isEmpty() && list!=null){
			String repaymethod = list.get(0).getRepaymethod();
			return repaymethod;
		}
		return null;
	}

	@Override
	public List<Applyforex> selectByNewWorkids(String newWorkid) {
		ApplyforexExample example = new ApplyforexExample() ;
		example.createCriteria().andNewworkidEqualTo(newWorkid) ;
		return applyforexMapper.selectByExample(example) ;
	}

}
