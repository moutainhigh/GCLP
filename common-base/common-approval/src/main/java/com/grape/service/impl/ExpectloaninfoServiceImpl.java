package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ExpectloaninfoRequest;
import com.grape.controller.request.ProductnoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Product;
import com.grape.model.mapper.base.ExceptloaninfoMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.service.ExpectloaninfoService;
import com.grape.util.Util;
@Service
public class ExpectloaninfoServiceImpl implements ExpectloaninfoService{
	private static final Logger log = LoggerFactory.getLogger(DelimortgageServiceImpl.class);
	@Autowired
	private ExceptloaninfoMapper exceptloaninfoMapper;
	@Autowired
	private ProductMapper productMapper;
	@Override
	public Exceptloaninfo queryAssetByWorkid(WorkidRequest req) {
		Exceptloaninfo except = exceptloaninfoMapper.selectByPrimaryKey(req.getWorkid());
		return except;
	}

	@Override
	public void insertExpectloaninfo(ExpectloaninfoRequest req) {
		Exceptloaninfo exloan = new Exceptloaninfo();
		try {
			Util.transferFields(req, exloan);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		exceptloaninfoMapper.insertSelective(exloan);
	}

	@Override
	public void updateExpectloaninfo(ExpectloaninfoRequest req) {
		Exceptloaninfo exloan = new Exceptloaninfo();
		try {
			Util.transferFields(req, exloan);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		exceptloaninfoMapper.updateByPrimaryKeySelective(exloan);
		
	}

	@Override
	public void deleteExpectloaninfo(WorkidRequest req) {
		exceptloaninfoMapper.deleteByPrimaryKey(req.getWorkid());
	}

	@Override
	public Exceptloaninfo queryAssetByWorkid(String workid) {
		Exceptloaninfo except = exceptloaninfoMapper.selectByPrimaryKey(workid);
		return except;
	}

	@Override
	public Product selectRepayMethod(ProductnoRequest req) {
		return productMapper.selectByPrimaryKey(req.getProductno());
	}

}
