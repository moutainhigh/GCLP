package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ApplyinfoOfComRequest;
import com.grape.controller.request.Codflg;
import com.grape.controller.request.WorkidAndComnoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.ApplyinfoofcomExample;
import com.grape.model.db.Industry;
import com.grape.model.db.Shareman;
import com.grape.model.mapper.base.ApplyinfoofcomMapper;
import com.grape.model.mapper.base.IndustryMapper;
import com.grape.model.mapper.base.SharemanMapper;
import com.grape.service.ApplyinfoOfComService;
import com.grape.util.Util;

@Service
public class ApplyinfoOfComServiceImpl implements ApplyinfoOfComService{
	private final static Logger log =  LoggerFactory.getLogger(ApplyinfoOfComServiceImpl.class);
	@Autowired
	private ApplyinfoofcomMapper applyinfoofcomMapper;
	@Autowired
	private IndustryMapper industryMapper;
	@Autowired
	private SharemanMapper sharemanMapper;
	@Override
	public List<Applyinfoofcom> queryByWorkid(String workid) {
		ApplyinfoofcomExample example = new ApplyinfoofcomExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Applyinfoofcom> list = applyinfoofcomMapper.selectByExample(example);
		return list;
	}
	@Override
	public void saveApplyinfoOfCom(ApplyinfoOfComRequest req) {
		List<Shareman> list = req.getList();
		for(int i=0;i<list.size();i++){
			Shareman share = new Shareman();
			share=list.get(i);
			share.setChgdt(new Date());
			sharemanMapper.updateByPrimaryKeySelective(share);
		}
		Applyinfoofcom apply = new Applyinfoofcom();
		try {
			Util.transferFields(req, apply);
		} catch (Exception e) {
			log.info("实体转换出错"+e);
		}
		applyinfoofcomMapper.updateByPrimaryKeySelective(apply);
	}
	
	@Override
	public void insertApplyinfoOfCom(ApplyinfoOfComRequest req) {
		List<Shareman> list = req.getList();
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++){
				Shareman share = new Shareman();
				share=list.get(i);
				share.setId(Util.getID());
				share.setCerdid(req.getSocialcreditcode());
				share.setChgdt(new Date());
				sharemanMapper.insertSelective(share);
			}
		}
		
		Applyinfoofcom apply = new Applyinfoofcom();
		try {
			Util.transferFields(req, apply);
		} catch (Exception e) {
			log.info("实体转换出错"+e);
		}
		applyinfoofcomMapper.insertSelective(apply);
	}
	@Override
	public void deleteApplyinfoOfCom(WorkidAndComnoRequest req) {
		Applyinfoofcom apply = new Applyinfoofcom();
		apply.setWorkid(req.getWorkid());
		try {
			applyinfoofcomMapper.deleteByPrimaryKey(req.getWorkid(), req.getComno());
		} catch (Exception e) {
			log.info("删除公司申请人信息出错"+e);
		}
		
	}
	@Override
	public Applyinfoofcom queryByWorkidAndCredid(WorkidAndComnoRequest req) {
		ApplyinfoofcomExample example = new ApplyinfoofcomExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andSocialcreditcodeEqualTo(req.getComno());
		List<Applyinfoofcom> applyinfo = applyinfoofcomMapper.selectByExample(example);
		if(!applyinfo.isEmpty() && applyinfo.size()>0){
			return applyinfo.get(0);
		}
		return null;
	}
	@Override
	public List<Applyinfoofcom> selectApplyinfoByWorkid(WorkidRequest req) {
		ApplyinfoofcomExample example = new ApplyinfoofcomExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		return applyinfoofcomMapper.selectByExample(example);
	}
	@Override
	public Industry selectIndustry(Codflg req) {
		return industryMapper.selectByPrimaryKey(req.getCodflg());
	}
	
}
