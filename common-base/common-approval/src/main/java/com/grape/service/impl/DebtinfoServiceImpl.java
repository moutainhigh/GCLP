package com.grape.service.impl;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.DebtinfoListRequest;
import com.grape.controller.request.DebtinfoRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Debtinfo;
import com.grape.model.db.DebtinfoExample;
import com.grape.model.mapper.base.DebtinfoMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.DebtinfoService;
import com.grape.util.Util;
@Service
public class DebtinfoServiceImpl implements DebtinfoService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	@Autowired
	private DebtinfoMapper debtinfoMapper;
	@Autowired
	private DoctaskExMapper doctaskExMapper;
	@Override
	public List<Debtinfo> queryDebtByWorkidAndCerdid(WorkidAndCerdidRequest req) {
		DebtinfoExample example = new DebtinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andCerdidEqualTo(req.getCerdid());
		List<Debtinfo> debtinfo = debtinfoMapper.selectByExample(example);
		return debtinfo;
	}

	@Override
	public void insertDebtinfo(DebtinfoListRequest req) {
		List<Debtinfo> list = req.getList();
		if(!list.isEmpty() && list!=null){
			for(int i=0;i<list.size();i++){
				Debtinfo debt = new Debtinfo();
				try {
					Util.transferFields(list.get(i), debt);
				} catch (Exception e) {
					log.info("实体类转换出错"+e);
				}
				debt.setId(Util.getID());
			/*	debt.setWorkid(req.getWorkid());
				debt.setCerdid(req.getCerdid());*/
				debt.setChgdt(new Date());
				debt.setHavaloanflg(req.getHavaloanflg());
				debt.setHistoricalhavaloanflg(req.getHistoricalhavaloanflg());
				debtinfoMapper.insertSelective(debt);
			}
		}else{
			Debtinfo debt = new Debtinfo();
			debt.setId(Util.getID());
			debt.setCerdid(req.getCerdid());
			debt.setWorkid(req.getWorkid());
			debt.setChgdt(new Date());
			debt.setHavaloanflg(req.getHavaloanflg());
			debt.setHistoricalhavaloanflg(req.getHistoricalhavaloanflg());
			debtinfoMapper.insertSelective(debt);
		}
	}

	@Override
	public void updateDebtinfo(DebtinfoListRequest req) {
		List<Debtinfo> list = req.getList();
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				Debtinfo debt = new Debtinfo();
				try {
					Util.transferFields(list.get(i), debt);
				} catch (Exception e) {
					log.info("实体类转换出错"+e);
				}
				debt.setChgdt(new Date());
				debt.setHavaloanflg(req.getHavaloanflg());
				debt.setHistoricalhavaloanflg(req.getHistoricalhavaloanflg());
				debtinfoMapper.updateByPrimaryKeySelective(debt);
			}
		}
	}

	@Override
	public void deleteDebtinfo(IdRequest req) {
		debtinfoMapper.deleteByPrimaryKey(req.getId());
	}

	@Override
	public List<Debtinfo> queryDebtByWorkidAndCerdid(DebtinfoListRequest req) {
		String workid = req.getWorkid();
		String cerdid = req.getCerdid();
		DebtinfoExample example = new DebtinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andCerdidEqualTo(cerdid);
		return debtinfoMapper.selectByExample(example);
	}

	@Override
	public void deleteDebtinfo(DebtinfoListRequest req) {
		String workid = req.getWorkid();
		String cerdid = req.getCerdid();
		DebtinfoExample example = new DebtinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andCerdidEqualTo(cerdid);
		debtinfoMapper.deleteByExample(example);
	}

	@Override
	public List<Debtinfo> queryByWorkid(String workid) {
		DebtinfoExample example = new DebtinfoExample() ; 
		example.createCriteria().andWorkidEqualTo(workid) ;
		return debtinfoMapper.selectByExample(example);
	}

	@Override
	public void insertDebtinfo(DebtinfoRequest req) {
		Debtinfo debtinfo = new Debtinfo() ;
		try {
			Util.transferFields(req, debtinfo);
			debtinfo.setId(Util.getID());
		} catch (Exception e) {
			log.info("实体类转换出错"+e);
		}
		debtinfoMapper.insertSelective(debtinfo) ;
	}

	@Override
	public void insertDebtin(Debtinfo debt) {
		debtinfoMapper.insertSelective(debt) ;
	}

	@Override
	public Chanapprovalform queryChanapprovalByWorkid(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		return doctaskExMapper.selectIncomeNotation(map);
	}

}
