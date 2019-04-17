package com.grape.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.BnkAccountRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Paymentapplyinfo;
import com.grape.model.mapper.base.BnkaccountMapper;
import com.grape.model.mapper.base.PaymentapplyinfoMapper;
import com.grape.service.BnkaccountService;
import com.grape.util.Util;
@Service
public class BnkaccountServiceImpl implements BnkaccountService{
	private static final Logger log = LoggerFactory.getLogger(BnkaccountServiceImpl.class);
	@Autowired
	private BnkaccountMapper banaccountMapper ;
	/*@Autowired
	private PaymentapplyinfoMapper paymentapplyinfoMapper;*/
	
	@Override
	public void insertBnkaccount(BnkAccountRequest req) {
		Bnkaccount bnk = new Bnkaccount() ;
		try {
			Util.transferFields(req, bnk);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		banaccountMapper.insertSelective(bnk) ;
		/*Paymentapplyinfo paymentapplyinfo = new Paymentapplyinfo();
		paymentapplyinfo.setWorkid(req.getWorkid());
		paymentapplyinfo.setAccount(req.getAccount());
		paymentapplyinfo.setAccountname(req.getAccountname());
		paymentapplyinfo.setBnk(req.getBnk());
		paymentapplyinfoMapper.insertSelective(paymentapplyinfo);*/
	}

	@Override
	public void updateBnkaccount(BnkAccountRequest req) {
		Bnkaccount bnk = new Bnkaccount() ;
		try {
			Util.transferFields(req, bnk);
		} catch (Exception e) {
			log.info("转换实体类出错");
		}
		bnk.setChgdt(new Date());
		banaccountMapper.updateByPrimaryKey(bnk)	 ;	
		/*Paymentapplyinfo paymentapplyinfo = new Paymentapplyinfo();
		paymentapplyinfo.setWorkid(req.getWorkid());
		paymentapplyinfo.setAccount(req.getAccount());
		paymentapplyinfo.setAccountname(req.getAccountname());
		paymentapplyinfo.setBnk(req.getBnk());
		paymentapplyinfoMapper.updateByPrimaryKeySelective(paymentapplyinfo);*/
	}

	@Override
	public Bnkaccount queryBnkaccountByWorkid(String workid) {
	
		return banaccountMapper.selectByPrimaryKey(workid);
	}

	@Override
	public void insertBnkaccounts(Bnkaccount bnk) {
		banaccountMapper.insertSelective(bnk) ;
	}

}
