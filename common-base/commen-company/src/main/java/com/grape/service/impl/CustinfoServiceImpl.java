package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.WaihuCustinfo;
import com.grape.model.db.Codetable;
import com.grape.model.db.Custinfo;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.external.CustinfoExMapper;
import com.grape.service.CustinfoService;
import com.grape.tool.Util;
@Service
public class CustinfoServiceImpl implements CustinfoService {
	
	@Autowired
	CustinfoExMapper custinfoExMapper;
	@Autowired
	CustinfoMapper custinfoMapper;
	@Override
	public List<WaihuCustinfo> findMainborrower(String workid) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(workid)){
			map.put("workid", workid);
		}
		return custinfoExMapper.findMainborrower(map);
	}

	@Override
	public List<WaihuCustinfo> findCoborrower(String workid) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(workid)){
			map.put("workid", workid);
		}
		return custinfoExMapper.findCoborrower(map);
	}

	@Override
	public List<WaihuCustinfo> findGuarantor(String workid) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(workid)){
			map.put("workid", workid);
		}
		return custinfoExMapper.findGuarantor(map);
	}

	@Override
	public List<WaihuCustinfo> findMortgagor(String workid) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(workid)){
			map.put("workid", workid);
		}
		return custinfoExMapper.findMortgagor(map);
	}

	@Override
	public List<Custinfo> findCustinfoByWorkid(String workid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Codetable findCodetableByCusttype(String codflg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Custinfo findCustinfoByPrimarkey(String workid, String certid) {
		
		return custinfoMapper.selectByPrimaryKey(workid, certid);
	}

}
