package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.HaveBackProcRequest;
import com.grape.controller.request.PaymentapplyinfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.GroommortgageExample;
import com.grape.model.db.Paymentapplyinfo;
import com.grape.model.db.PaymentapplyinfoExample;
import com.grape.model.mapper.base.BnkaccountMapper;
import com.grape.model.mapper.base.GroommortgageMapper;
import com.grape.model.mapper.base.PaymentapplyinfoMapper;
import com.grape.service.PaymentapplyinfoService;
import com.grape.util.Util;
@Service
public class PaymentapplyinfoServiceImpl implements PaymentapplyinfoService{
	private static final Logger log = LoggerFactory.getLogger(DelimortgageServiceImpl.class);
	@Autowired
	private PaymentapplyinfoMapper paymentapplyinfoMapper;
	@Autowired
	private GroommortgageMapper groommortgageMapper;
	@Autowired
	private BnkaccountMapper bnkaccountMapper;
	@Override
	public void insertPaymentapplyinfo(PaymentapplyinfoRequest req, FlowHandleResponse res) {
		Bnkaccount bnk = bnkaccountMapper.selectByPrimaryKey(req.getWorkid());
		Bnkaccount bnkaccount = new Bnkaccount();
		bnkaccount.setWorkid(req.getWorkid());
		bnkaccount.setAccount(req.getAccount());
		bnkaccount.setAccountname(req.getAccountname());
		bnkaccount.setBnk(req.getBnk());
		bnkaccount.setChgdt(new Date());
		if(bnk!=null){
			bnkaccountMapper.updateByPrimaryKeySelective(bnkaccount);
		}else{
			bnkaccountMapper.insertSelective(bnkaccount);
		}
		Paymentapplyinfo payinfo = new Paymentapplyinfo();
		List<Groommortgage> mortgagelist = new ArrayList<Groommortgage>();
		mortgagelist=req.getGroommortgages();
		if(mortgagelist!=null){
			if(!mortgagelist.isEmpty()){
				for(Groommortgage mort:mortgagelist){
					if(res!=null){
						mort.setLogid(res.getLogid());
					}else{
						mort.setLogid(Util.getID());
					}
					mort.setId(Util.getID());
					mort.setChgdt(new Date());
					groommortgageMapper.insertSelective(mort);
				}
			}
		}
		try {
			Util.transferFields(req, payinfo);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		payinfo.setChgdt(new Date());
		payinfo.setSingledepositdate(new Date());
		paymentapplyinfoMapper.insertSelective(payinfo);
	}

	@Override
	public Paymentapplyinfo selectPaymentapplyinfo(String workid) {
		return paymentapplyinfoMapper.selectByPrimaryKey(workid);
	}

	@Override
	public void updatePaymentapplyinfo(PaymentapplyinfoRequest req, FlowHandleResponse res) {
		Bnkaccount bnk = bnkaccountMapper.selectByPrimaryKey(req.getWorkid());
		Paymentapplyinfo payinfo = new Paymentapplyinfo();
		Bnkaccount bnkaccount = new Bnkaccount();
		bnkaccount.setWorkid(req.getWorkid());
		bnkaccount.setAccount(req.getAccount());
		bnkaccount.setAccountname(req.getAccountname());
		bnkaccount.setBnk(req.getBnk());
		bnkaccount.setChgdt(new Date());
		if(bnk!=null){
			bnkaccountMapper.updateByPrimaryKeySelective(bnkaccount);
		}else{
			bnkaccountMapper.insertSelective(bnkaccount);
		}
		
		List<Groommortgage> mortgagelist = new ArrayList<Groommortgage>();
		mortgagelist=req.getGroommortgages();
		if(mortgagelist!=null && !mortgagelist.isEmpty()){
			GroommortgageExample example = new GroommortgageExample();
			example.createCriteria().andWorkidEqualTo(req.getWorkid());
			List<Groommortgage> list = groommortgageMapper.selectByExample(example);
			if(list!=null && !list.isEmpty()){
				groommortgageMapper.deleteByExample(example);
			}
			for(Groommortgage mort:mortgagelist){
				mort.setChgdt(new Date());
				if(res!=null){
					mort.setLogid(res.getLogid());
					mort.setId(Util.getID());
				}
				groommortgageMapper.insertSelective(mort);
			}
		}
		payinfo.setChgdt(new Date());
		try {
			Util.transferFields(req, payinfo);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		paymentapplyinfoMapper.updateByPrimaryKey(payinfo);	
	}

	@Override
	public List<Groommortgage> selectGroommortgage(WorkidRequest req) {
		GroommortgageExample example = new GroommortgageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		return groommortgageMapper.selectByExample(example);
	}

	@Override
	public void updatePayment(HaveBackProcRequest req) {
		Paymentapplyinfo paymentapplyinfo = new Paymentapplyinfo();
		paymentapplyinfo.setWorkid(req.getWorkid());
		paymentapplyinfo.setHavebackproc(req.getHavebackproc());
		paymentapplyinfoMapper.updateByPrimaryKey(paymentapplyinfo);
		
	}

}
