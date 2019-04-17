package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.bean.ProductexBean;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.response.bean.ChanapprovalBean;
import com.grape.controller.response.bean.CreditreCard;
import com.grape.controller.response.bean.CreditreCardex;
import com.grape.controller.response.bean.CreditreCode;
import com.grape.controller.response.bean.CreditreCodeex;
import com.grape.controller.response.bean.CreditreNum;
import com.grape.controller.response.bean.MortAndCustBean;
import com.grape.model.db.Chanapprovalform;
import com.grape.model.db.Custinfo;
import com.grape.model.db.CustinfoExample;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.LitigationinfoMapper;
import com.grape.model.mapper.external.CreditrecodeExMapper;
import com.grape.model.mapper.external.ProductexMapper;
import com.grape.service.ProductexService;
@Service
public class ProductexServiceImpl implements ProductexService{

	@Autowired
	private	ProductexMapper productexmapper ;
	@Autowired
	private CustinfoMapper custinfoMapper ;
	@Autowired
	private LitigationinfoMapper litigationinfoMapper ;
	@Autowired
	private CreditrecodeExMapper creditrecodeExMapper ;

	@Override
	public ProductexBean selectProductex(String workid) {

		return productexmapper.selectProductex(workid);
	}

	@Override
	public List<Custinfo> queryByworkid(String workid) {
		CustinfoExample example = new CustinfoExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		return custinfoMapper.selectByExample(example);
	}

	@Override
	public CreditreCard selectCreditreCard1(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCard1(req);
	}

	@Override
	public CreditreCard selectCreditreCard2(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCard2(req);
	}

	@Override
	public CreditreCode selectCreditreCode1(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCode1(req);
	}

	@Override
	public CreditreCode selectCreditreCode2(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCode2(req);
	}

	@Override
	public CreditreNum selectCreditreNum1(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreNum1(req);
	}

	@Override
	public CreditreNum selectCreditreNum2(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreNum2(req);
	}

	@Override
	public ChanapprovalBean selectChanByWorkid(String workid) {

		return productexmapper.selectChanByWorkid(workid);
	}

	@Override
	public CreditreCardex selectCreditreCardex1(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCardex1(req);
	}

	@Override
	public CreditreCardex selectCreditreCardex2(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCardex2(req);
	}

	@Override
	public CreditreCodeex selectCreditreCodeex1(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCodeex1(req);
	}

	@Override
	public CreditreCodeex selectCreditreCodeex2(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return creditrecodeExMapper.selectCreditreCodeex2(req);
	}

	@Override
	public MortAndCustBean selectmortbycre(WorkidAndCerdidRequest req) {
		// TODO Auto-generated method stub
		return productexmapper.selectmortbycre(req);
	}

	@Override
	public Chanapprovalform selectChanappro(String workid) {
		// TODO Auto-generated method stub
		return productexmapper.selectChanappro(workid);
	}




}
