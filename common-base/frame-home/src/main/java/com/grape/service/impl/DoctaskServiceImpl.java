package com.grape.service.impl;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.DoctaskUnfinish;
import com.grape.controller.reponse.bean.DoctaskUnfinish2;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.ApplyinfoofcomExample;
import com.grape.model.db.Custinfo;
import com.grape.model.db.CustinfoExample;
import com.grape.model.db.Doctask;

import com.grape.model.db.Mortgage;
import com.grape.model.db.MortgageExample;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.PageBean;
import com.grape.model.mapper.base.ApplyinfoofcomMapper;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.DoctaskMapper;
import com.grape.model.mapper.base.MortgageMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.DoctaskService;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;
@Service
@Log4j
public class DoctaskServiceImpl extends BaseMapper implements DoctaskService {
	
	@Autowired
	DoctaskMapper doctaskMapper;
	@Autowired
	CustinfoMapper custinfoMapper;
	@Autowired
	MortgageMapper mortgageMapper;
	@Autowired
	DoctaskExMapper doctaskExMapper;
	
	@Autowired
	ApplyinfoofcomMapper applyfoorcomMapper;

	@Override
	public Doctask findDoctaskByWorkid(String workid) {
		return doctaskMapper.selectByPrimaryKey(workid);
		
	}

	@Override
	public boolean updateDoctask(Doctask doctask) {
		int flag;
		flag = doctaskMapper.updateByPrimaryKey(doctask);
		
		if(flag==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDoctaskWith(Doctask doctask) {
		int flag;
		String workid = doctask.getWorkid();
		CustinfoExample custinfoExample = new CustinfoExample();
		custinfoExample.createCriteria().andWorkidEqualTo(workid);
			List<Custinfo> custinfos = custinfoMapper.selectByExample(custinfoExample);
			if(custinfos.size()>0){
				flag = custinfoMapper.deleteByExample(custinfoExample);
				if(flag!=1){
					log.error("删除客户信息失败");
					return false;
				}	
			
		}
		
			MortgageExample mortgageExample = new MortgageExample();
			mortgageExample.createCriteria().andWorkidEqualTo(workid);
			List<Mortgage> mortgages = mortgageMapper.selectByExample(mortgageExample);
			if(mortgages.size()>0){
				//Mortgage mortgage = mortgages.get(0);
				flag = mortgageMapper.deleteByExample(mortgageExample);
				if(flag!=1){
					log.error("删除抵押物信息失败");
					return false;
				}
			}
			flag = doctaskMapper.deleteByPrimaryKey(workid);
			if(flag==1){
				return true;
			}
		
		
		return false;
	}

	@Override
	public DoctaskUnfinish2 findDoctaskUnfinish(String workid) {
		
		DoctaskUnfinish2 doctaskUnfinish2 =  new DoctaskUnfinish2();
		CustinfoExample custinfoExample = new CustinfoExample();
		custinfoExample.createCriteria().andWorkidEqualTo(workid).andIsmarrowEqualTo("0");
		List<Custinfo> custinfos = custinfoMapper.selectByExample(custinfoExample);
		
		doctaskUnfinish2.setCustinfos(custinfos);
		
		ApplyinfoofcomExample applyinfoofcomExample = new ApplyinfoofcomExample();
		applyinfoofcomExample.createCriteria().andWorkidEqualTo(workid);
		List<Applyinfoofcom> applyinfoofcoms = applyfoorcomMapper.selectByExample(applyinfoofcomExample);
	
		doctaskUnfinish2.setApplyinfoofcoms(applyinfoofcoms);
	
		MortgageExample mortgageExample = new MortgageExample();
		mortgageExample.createCriteria().andWorkidEqualTo(workid);
		List<Mortgage> mortgages = mortgageMapper.selectByExample(mortgageExample);

		doctaskUnfinish2.setMortgages(mortgages);
		doctaskUnfinish2.setWorkid(workid);
		return doctaskUnfinish2;
	}

	@Override
	public List<DoctaskUnfinish> findDoctaskUnfinishAll(PageBean pageBean) {
		
		//只查询当前登录用户的未完成订单
		Map<String, String> parammap = new HashMap<>();
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		parammap.put("chgtl", username);
		
		List<Map<String, Object>> resultMap = queryList(DoctaskExMapper.class,"findDoctaskUnfinishAll",parammap,pageBean);
		int count = doctaskExMapper.countDoctaskUnfinishAll(parammap);
		pageBean.setRecordCount(count);
		
		List<DoctaskUnfinish> doctaskUnfinishs = new ArrayList<>();
		if(resultMap.size()>0){
			for (Map<String, Object> map : resultMap) {
				DoctaskUnfinish doctaskUnfinish = new DoctaskUnfinish();
				
				doctaskUnfinish.setWorkid((String) map.get("workid"));
				doctaskUnfinish.setCity((String) map.get("city"));
				doctaskUnfinish.setOrganizationname((String) map.get("organizationname"));
				doctaskUnfinish.setProducttype((String) map.get("producttype"));
				doctaskUnfinish.setProducttypename((String) map.get("producttypename"));
				doctaskUnfinish.setProductno((String) map.get("productno"));
				doctaskUnfinish.setProductname((String) map.get("productname"));
				if(!Util.isBlank((String) map.get("borrower"))){
					doctaskUnfinish.setBorrower((String) map.get("borrower"));
				}else{
					//如果自然人没有则查法人
					doctaskUnfinish.setBorrower((String) map.get("borrower2"));
				}
				
				doctaskUnfinish.setNode((String) map.get("node"));
				Map<String, String> paramMap = new HashMap<>();
				paramMap.put("workid", (String) map.get("workid"));
				List<String> coborrower = doctaskExMapper.findCoborrower(paramMap);
				if(coborrower.isEmpty()){
					//如果自然人没有则查法人
					doctaskExMapper.findCoborrower2(paramMap);
				}
				List<String> guarantor = doctaskExMapper.findGuarantor(paramMap);
				if(guarantor.isEmpty()){
					//如果自然人没有则查法人
					guarantor = doctaskExMapper.findGuarantor2(paramMap);
				}
				List<String> mortgagor = doctaskExMapper.findMortgagor(paramMap);
				if(mortgagor.isEmpty()){
					//如果自然人没有则查法人
					mortgagor = doctaskExMapper.findMortgagor2(paramMap);
				}
				List<String> houseno = doctaskExMapper.findHouseno(paramMap);
				doctaskUnfinish.setCoborrower(coborrower);
				doctaskUnfinish.setGuarantor(guarantor);
				doctaskUnfinish.setMortgagor(mortgagor);
				doctaskUnfinish.setHouseno(houseno);
				doctaskUnfinish.setSavetime((Date) map.get("chgdt"));
				doctaskUnfinishs.add(doctaskUnfinish);
			}
		}
		return doctaskUnfinishs;
	}

	@Override
	public List<DoctaskUnfinish> findDoctaskForLive(PageBean pageBean) {
		List<Map<String, Object>> resultMap = queryList(DoctaskExMapper.class,"findDoctaskForLive",null,pageBean);
		int count = doctaskExMapper.countDoctaskForLive();
		pageBean.setRecordCount(count);
		
		List<DoctaskUnfinish> doctaskUnfinishs = new ArrayList<>();
		if(resultMap.size()>0){
			for (Map<String, Object> map : resultMap) {
				DoctaskUnfinish doctaskUnfinish = new DoctaskUnfinish();
				
				doctaskUnfinish.setWorkid((String) map.get("workid"));
				doctaskUnfinish.setCity((String) map.get("city"));
				doctaskUnfinish.setOrganizationname((String) map.get("organizationname"));
				doctaskUnfinish.setProducttype((String) map.get("producttype"));
				doctaskUnfinish.setProducttypename((String) map.get("producttypename"));
				doctaskUnfinish.setProductno((String) map.get("productno"));
				doctaskUnfinish.setProductname((String) map.get("productname"));
				if(!Util.isBlank((String) map.get("borrower"))){
					doctaskUnfinish.setBorrower((String) map.get("borrower"));
				}else{
					//如果自然人没有则查法人
					doctaskUnfinish.setBorrower((String) map.get("borrower2"));
				}
				doctaskUnfinish.setNode((String) map.get("node"));
				Map<String, String> paramMap = new HashMap<>();
				paramMap.put("workid", (String) map.get("workid"));
				List<String> coborrower = doctaskExMapper.findCoborrower(paramMap);
				if(coborrower.isEmpty()){
					//如果自然人没有则查法人
					doctaskExMapper.findCoborrower2(paramMap);
				}
				List<String> guarantor = doctaskExMapper.findGuarantor(paramMap);
				if(guarantor.isEmpty()){
					//如果自然人没有则查法人
					guarantor = doctaskExMapper.findGuarantor2(paramMap);
				}
				List<String> mortgagor = doctaskExMapper.findMortgagor(paramMap);
				if(mortgagor.isEmpty()){
					//如果自然人没有则查法人
					mortgagor = doctaskExMapper.findMortgagor2(paramMap);
				}
				List<String> houseno = doctaskExMapper.findHouseno(paramMap);
				doctaskUnfinish.setCoborrower(coborrower);
				doctaskUnfinish.setGuarantor(guarantor);
				doctaskUnfinish.setMortgagor(mortgagor);
				doctaskUnfinish.setHouseno(houseno);
				doctaskUnfinish.setSavetime((Date) map.get("chgdt"));
				doctaskUnfinishs.add(doctaskUnfinish);
			}
		}
		return doctaskUnfinishs;
	}
	

}
