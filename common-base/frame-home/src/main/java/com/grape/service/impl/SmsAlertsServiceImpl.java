package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Person;
import com.grape.model.db.Smsparam;
import com.grape.model.db.SmsparamExample;
import com.grape.model.mapper.base.SmsparamMapper;
import com.grape.model.mapper.external.SmsAlertsExMapper;
import com.grape.service.SmsAlertsService;
import com.grape.tool.Util;
@Service
public class SmsAlertsServiceImpl implements SmsAlertsService {

	@Autowired
	SmsAlertsExMapper smsAlertsExMapper;
	
	@Autowired
	SmsparamMapper smsparamMapper;

	@Override
	public List<Map<String, Object>> findRepaymentList(String startdate, String enddate,String productno) {
		Map<String, String> map =new HashMap<>();
		if(!Util.isBlank(startdate)){
			map.put("startdate", startdate);
		}
		if(!Util.isBlank(enddate)){
			map.put("enddate", enddate);
		}
		if(!Util.isBlank(productno)){
			map.put("productno", productno);
		}
		
		List<Map<String, Object>> list = smsAlertsExMapper.findRepaymentList(map);
		
		return list;
	
	}

	@Override
	public List<Smsparam> findSmsparamForRepayment() {
		SmsparamExample example = new SmsparamExample();
		example.createCriteria().andSendtypeEqualTo("2").andSendflgEqualTo("Y");
		List<Smsparam> smsparams = smsparamMapper.selectByExample(example);
		
		return smsparams;
		
	}

	@Override
	public List<Smsparam> findSmsparamForOverdue() {
		SmsparamExample example = new SmsparamExample();
		example.createCriteria().andSendtypeEqualTo("3").andSendflgEqualTo("Y");
		List<Smsparam> smsparams = smsparamMapper.selectByExample(example);
		
		return smsparams;
	}
		

	@Override
	public Smsparam findSmsparamForCode() {
		SmsparamExample example = new SmsparamExample();
		example.createCriteria().andSendtypeEqualTo("1").andSendflgEqualTo("Y");
		List<Smsparam> smsparams = smsparamMapper.selectByExample(example);
		if(smsparams.size()>0){
			return smsparams.get(0);
		}
		return null;
	}

	@Override
	public List<Map<String, Object>> findOverdueList(String productno) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(productno)){
			map.put("productno", productno);
		}
		return smsAlertsExMapper.findOverdueList(map);
	}

	@Override
	public List<Map<String, Object>> findOverdueListInChannel(String productno) {
		Map<String, String> map = new HashMap<>();
		map.put("productno", productno);
		return smsAlertsExMapper.findOverdueListInChannel(map);
	}

	@Override
	public List<Smsparam> findSmsparamForOverdueForW() {
		SmsparamExample example = new SmsparamExample();
		example.createCriteria().andSendtypeEqualTo("4").andSendflgEqualTo("Y");
		List<Smsparam> smsparams = smsparamMapper.selectByExample(example);
		
		return smsparams;
	}

	@Override
	public List<Map<String, Object>> findOverdueListInTerrcae(String productno) {
		Map<String, String> map = new HashMap<>();
		map.put("productno", productno);
		return smsAlertsExMapper.findOverdueListInTerrcae(map);
	}

	@Override
	public List<Map<String, Object>> findOverdueListInAisle(String productno) {
		Map<String, String> map = new HashMap<>();
		map.put("productno", productno);
		return smsAlertsExMapper.findOverdueListInAisle(map);
	}

	@Override
	public List<Map<String, Object>> findOverdueListInFund(String productno) {
		Map<String, String> map = new HashMap<>();
		map.put("productno", productno);
		return smsAlertsExMapper.findOverdueListInFund(map);
	}

	@Override
	public List<Map<String, Object>> findOverdueListInUserid(String productno) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(productno)){
			map.put("productno", productno);
		}
		return smsAlertsExMapper.findOverdueListInUserid(map);
	}

	@Override
	public List<Person> findPersonInDaihou(String organizationid, String roleid) {
		Map<String, String> map = new HashMap<>();
		if(!Util.isBlank(organizationid)){
			map.put("organizationid", organizationid);
		}
		if(!Util.isBlank(roleid)){
			map.put("roleid", roleid);
		}
		return smsAlertsExMapper.findPersonInDaihou(map);
	}

	
	

}
