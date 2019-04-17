package com.grape.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.OtherapplyinfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Otherapplyinfo;
import com.grape.model.mapper.base.OtherapplyinfoMapper;
import com.grape.service.OtherapplyinfoService;
import com.grape.util.Util;
@Service
public class OtherapplyinfoServiceImpl implements OtherapplyinfoService{
	private static final Logger log = LoggerFactory.getLogger(DelimortgageServiceImpl.class);
	@Autowired
	private OtherapplyinfoMapper otherapplyinfoMapper;
	@Override
	public void updateOtherapplyinfo(OtherapplyinfoRequest req) {
		Otherapplyinfo other = new Otherapplyinfo();
		other.setChgdt(new Date());
		try {
			Util.transferFields(req, other);
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		otherapplyinfoMapper.updateByPrimaryKey(other);
	}

	@Override
	public void insertOtherapplyinfo(OtherapplyinfoRequest req) {
		Otherapplyinfo other = new Otherapplyinfo();
		other.setChgdt(new Date());
		try {
			Util.transferFields(req, other);
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		otherapplyinfoMapper.insertSelective(other);
		
	}

	@Override
	public void deleteOtherapplyinfo(WorkidRequest req) {
		otherapplyinfoMapper.deleteByPrimaryKey(req.getWorkid());
	}

	@Override
	public Otherapplyinfo queryOtherapplyinfoByWorkid(WorkidRequest req) {
		Otherapplyinfo other = otherapplyinfoMapper.selectByPrimaryKey(req.getWorkid());
		return other;
	}

	@Override
	public Otherapplyinfo queryOtherapplyinfoByWorkid(OtherapplyinfoRequest req) {
		Otherapplyinfo other = otherapplyinfoMapper.selectByPrimaryKey(req.getWorkid());
		return other;
	}

	@Override
	public void insertOtherapply(Otherapplyinfo otherapplyinfo) {
		otherapplyinfoMapper.insertSelective(otherapplyinfo) ;
	}

}
