package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.FinanceapprovalRequest;
import com.grape.model.db.Financeapproval;
import com.grape.model.db.FinanceapprovalExample;
import com.grape.model.mapper.base.FinanceapprovalMapper;
import com.grape.service.FinanceapprovalService;
import com.grape.util.Util;
@Service
public class FinanceapprovalServiceImpl implements FinanceapprovalService{
	private Logger log = LoggerFactory.getLogger(FinanceapprovalServiceImpl.class);
	@Autowired
	private FinanceapprovalMapper financeapprovalMapper;
	@Override
	public void insertFinanceapproval(FinanceapprovalRequest req, FlowHandleResponse res) {
		Financeapproval finance = new Financeapproval();
		try {
			Util.transferFields(req, finance);
			finance.setId(Util.getID());
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		finance.setChgdt(new Date());
		if(res!=null){
			finance.setLogid(res.getLogid());
		}
		financeapprovalMapper.insertSelective(finance);
	}
	@Override
	public Financeapproval selectFinanceapproval(String id) {
		FinanceapprovalExample example = new FinanceapprovalExample();
		example.createCriteria().andLogidEqualTo(id);
		List<Financeapproval> list= financeapprovalMapper.selectByExample(example);
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
	
}
