package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Mortgage;
import com.grape.model.db.MortgageExample;
import com.grape.model.db.Mortgagematch;
import com.grape.model.db.MortgagematchExample;
import com.grape.model.mapper.base.MortgageMapper;
import com.grape.model.mapper.base.MortgagematchMapper;
import com.grape.model.mapper.external.MortgageExMapper;
import com.grape.service.MortgagematchService;
import com.grape.tool.Util;
@Service
public class MortgagematchServiceImpl implements MortgagematchService {

	@Autowired
	MortgageExMapper mortgageExMapper;
	@Autowired
	MortgagematchMapper mortgagematchMapper;
	@Autowired
	MortgageMapper mortgageMapper;
	@Override
	public List<Map<String, Object>> findMortgageParamList(String workid) {
		Map<String,String> map = new HashMap<>();
		if(!Util.isBlank(workid)){
			map.put("workid", workid);
		}
		List<Map<String, Object>> list = mortgageExMapper.findMortgagelistByParam(map);
		
		
		return list;
	}
	@Override
	public Mortgagematch findMortgagematch(String mortgageno, String matchno) {
		
		return mortgagematchMapper.selectByPrimaryKey(mortgageno, matchno);
	}
	@Override
	public List<Mortgagematch> findMortgagematchListByMortgageno(String mortgageno) {
		MortgagematchExample example = new MortgagematchExample();
		example.createCriteria().andMortgagenoEqualTo(mortgageno);
		List<Mortgagematch> list = mortgagematchMapper.selectByExample(example);
		
		return list;
	}
	@Override
	public List<Mortgagematch> findMortgagematchByMatchflag(String mortgageno, String matchflag) {
		MortgagematchExample example = new MortgagematchExample();
		example.createCriteria().andMortgagenoEqualTo(mortgageno)
		.andMatchflagEqualTo(matchflag);
		List<Mortgagematch> mortgagematchs = mortgagematchMapper.selectByExample(example);
		
		return mortgagematchs;
		
	}
	@Override
	public void updateMortgagematch(Mortgagematch mortgagematch) {
		mortgagematchMapper.updateByPrimaryKey(mortgagematch);
	}
	@Override
	public Mortgage findMortgageById(String id) {
		
		return mortgageMapper.selectByPrimaryKey(id);
	}
	@Override
	public Map<String, Object> findMortgageByParam(String mortgageno) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(mortgageno)){
			map.put("mortgageno", mortgageno);
		}
		return mortgageExMapper.findMortgageByParam(map);
	}
	@Override
	public Mortgage findFirstMortgageByWorkid(String workid) {
		MortgageExample example = new MortgageExample();
		example.setOrderByClause("id ASC");
		example.createCriteria().andWorkidEqualTo(workid);
		List<Mortgage> mortgages = mortgageMapper.selectByExample(example);
		if(mortgages.size()>0){
			return mortgages.get(0);
		}
		return null;
	}
	@Override
	public List<Mortgage> findListByWorkid(String workid) {
		MortgageExample example = new MortgageExample();
		example.createCriteria().andWorkidEqualTo(workid);
		return mortgageMapper.selectByExample(example);
	}
	@Override
	public Mortgagematch findInMatchFlag(String mortgageno) {
		MortgagematchExample example = new MortgagematchExample();
		example.createCriteria().andMortgagenoEqualTo(mortgageno).andMatchflagEqualTo("Y");
		List<Mortgagematch> list = mortgagematchMapper.selectByExample(example);
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

}
