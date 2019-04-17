package com.grape.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.MortgagefilingRequest;
import com.grape.controller.request.MortgagefilingidRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.db.Mortgagefiling;
import com.grape.model.db.MortgagefilingExample;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.model.mapper.base.MortgagefilingMapper;
import com.grape.service.MortgagefilingService;
import com.grape.util.Util;

@Service
public class MortgagefilingServiceImpl implements MortgagefilingService{
	private static final Logger log = LoggerFactory.getLogger(MortgagefilingServiceImpl.class);
	@Autowired
	private MortgagefilingMapper mortgagefilingMapper;
	@Autowired
	private CodetableMapper codetableMapper;
	@Override
	public void insertMortgagefiling(MortgagefilingRequest req) {
		Mortgagefiling mort = new Mortgagefiling();
		try {
			Util.transferFields(req, mort);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		mortgagefilingMapper.insertSelective(mort);
		
	}
	@Override
	public Mortgagefiling selectMortgagefiling(MortgagefilingidRequest req) {
		
		return mortgagefilingMapper.selectByPrimaryKey(req.getMortgagefilingid());
	}
	@Override
	public void updateMortgagefiling(MortgagefilingRequest req) {
		Mortgagefiling mort = new Mortgagefiling();
		try {
			Util.transferFields(req, mort);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		mortgagefilingMapper.updateByPrimaryKeySelective(mort);
		
	}
	@Override
	public Mortgagefiling selectMortgageById(MortgagefilingRequest req) {
		
		return mortgagefilingMapper.selectByPrimaryKey(req.getMortgagefilingid());
	}
	@Override
	public List<Codetable> selectCodeofCom() {
		CodetableExample example = new CodetableExample();
		example.createCriteria().andCodtypEqualTo("WHITECOM");
		return codetableMapper.selectByExample(example);
	}
	@Override
	public Mortgagefiling findMortgagefilingByMortgageid(String mortgageid) {
		MortgagefilingExample example = new MortgagefilingExample();
		example.createCriteria().andMortgageidEqualTo(mortgageid);
		List<Mortgagefiling> mortgagefilings = mortgagefilingMapper.selectByExample(example);
		if(!mortgagefilings.isEmpty()){
			return mortgagefilings.get(0);
		}
		return null;
	}
	@Override
	public List<Mortgagefiling> selectMortgagefilingByWorkid(String workid) {
		MortgagefilingExample example = new MortgagefilingExample();
		example.createCriteria().andWorkidEqualTo(workid);
		return mortgagefilingMapper.selectByExample(example);
	}

	@Override
	public void insertMortgagefi(Mortgagefiling mortgagefiling) {
		mortgagefilingMapper.insertSelective(mortgagefiling) ;
	}

}
