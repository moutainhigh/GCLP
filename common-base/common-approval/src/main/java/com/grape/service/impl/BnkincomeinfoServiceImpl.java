package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.BnkincomeinfoRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Bnkincomeinfo;
import com.grape.model.db.BnkincomeinfoExample;
import com.grape.model.mapper.base.BnkincomeinfoMapper;
import com.grape.service.BnkincomeinfoService;
import com.grape.util.Util;
@Service
public class BnkincomeinfoServiceImpl implements BnkincomeinfoService{
	private static final Logger log = LoggerFactory.getLogger(BnkincomeinfoServiceImpl.class);
	
	@Autowired
	private BnkincomeinfoMapper bnkincomeinfoMapper;
	@Override
	public List<Bnkincomeinfo> queryByWorkid(String workid) {
		BnkincomeinfoExample example = new BnkincomeinfoExample();
		example.createCriteria().andWorkidEqualTo(workid);
		return bnkincomeinfoMapper.selectByExample(example);
	}
	@Override
	public List<Bnkincomeinfo> selectBnkincomeList(WorkidAndCerdidRequest req) {
		BnkincomeinfoExample example = new BnkincomeinfoExample();
		example.createCriteria().andCerdidEqualTo(req.getCerdid()).andWorkidEqualTo(req.getWorkid());
		return bnkincomeinfoMapper.selectByExample(example);
	}
	@Override
	public void insertBnkcominfo(BnkincomeinfoRequest req) {
		Bnkincomeinfo bnkinfo = new Bnkincomeinfo() ;
		try {
			Util.transferFields(req, bnkinfo);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		bnkincomeinfoMapper.insertSelective(bnkinfo) ;
	}
	@Override
	public void updateBnkcominfo(BnkincomeinfoRequest req) {
		Bnkincomeinfo bnkinfo = new Bnkincomeinfo() ;
		try {
			Util.transferFields(req, bnkinfo);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		bnkinfo.setChgdt(new Date());
		bnkincomeinfoMapper.updateByPrimaryKeySelective(bnkinfo) ;
	}

	@Override
	public void insertBnkincominfo(Bnkincomeinfo bnkincomeinfo) {
		bnkincomeinfoMapper.insertSelective(bnkincomeinfo) ;
	}

}
