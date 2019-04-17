package com.grape.workflow.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.ChanapprovalformExample;
import com.grape.model.mapper.base.ChanapprovalformMapper;
import com.grape.model.mapper.external.PaymentapplyinfoExMapper;
import com.grape.workflow.service.ChanapprovalFormService;
@Service
public class ChanapprovalFormServiceImpl implements ChanapprovalFormService{
	@Autowired
	private ChanapprovalformMapper chanapprovalformMapper;
	@Autowired
	private PaymentapplyinfoExMapper paymentapplyinfoExMapper;
	@Override
	public List<Chanapprovalform> selectChanapproval(String workid) {
		ChanapprovalformExample example = new ChanapprovalformExample();
		example.createCriteria().andWorkidEqualTo(workid).andFacesignflgIsNotNull().andFacesignflgNotEqualTo("");
		return chanapprovalformMapper.selectByExample(example);
	}
	@Override
	public String selectOrgofUserid(String userid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userid", userid);
		return paymentapplyinfoExMapper.selectOrgByUserid(map);
		
	}

}
