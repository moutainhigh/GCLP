package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.RedemptiontypeRequest;
import com.grape.model.db.Bnkaccount;
import com.grape.model.db.Redemptiontype;
import com.grape.model.db.RedemptiontypeExample;
import com.grape.model.mapper.base.BnkaccountMapper;
import com.grape.model.mapper.base.RedemptiontypeMapper;
import com.grape.service.RedemptiontypeService;
import com.grape.util.Util;
@Service
public class RedemptiontypeServiceImpl implements RedemptiontypeService{
	private static final Logger log = LoggerFactory.getLogger(RedemptiontypeServiceImpl.class);
	
	@Autowired
	private RedemptiontypeMapper redemptiontypeMapper ;
	@Autowired
	private BnkaccountMapper bnkaccountMapper;
	
	@Override
	public void insertRedemptiontype(RedemptiontypeRequest req) {
		Redemptiontype red = new Redemptiontype() ;
		try {
			Util.transferFields(req, red);
		} catch(Exception e) {
			log.info("实体类转换出错" , e);
		}
		red.setId(Util.getID()) ;
		redemptiontypeMapper.insertSelective(red) ;
		//将赎楼方案的信息复制到银行账户信息中
		Bnkaccount bnk = bnkaccountMapper.selectByPrimaryKey(req.getWorkid());
		Bnkaccount bnkaccount = new Bnkaccount();
		bnkaccount.setWorkid(req.getWorkid());
		if(req.getRedemaccount()!=null){
			bnkaccount.setAccount(req.getRedemaccount());
		}
		if(req.getRedemaccountname()!=null){
			bnkaccount.setAccountname(req.getRedemaccountname());
		}
		if(req.getRedemccountbnk()!=null){
			bnkaccount.setBnk(req.getRedemccountbnk());
		}
		bnkaccount.setChgdt(new Date());
		if(bnk!=null){
			bnkaccountMapper.updateByPrimaryKeySelective(bnkaccount);
		}else{
			bnkaccountMapper.insertSelective(bnkaccount);
		}
	}

	@Override
	public Redemptiontype findRedemptiontypeByWorkid(String workid) {
		RedemptiontypeExample example = new RedemptiontypeExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Redemptiontype> redemptiontypes = redemptiontypeMapper.selectByExample(example);
		if(!redemptiontypes.isEmpty()){
			return redemptiontypes.get(0);
		}
		return null;
	}


	@Override
	public void updateRedmptiontype(RedemptiontypeRequest req) {
		Redemptiontype red = new Redemptiontype() ;
		try {
			Util.transferFields(req, red);
		} catch(Exception e) {
			log.info("实体类转换出错" , e);
		}
		RedemptiontypeExample example = new RedemptiontypeExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()) ;
		redemptiontypeMapper.updateByPrimaryKeySelective(red) ;
	}

	@Override
	public void insertRedemption(Redemptiontype redemptiontype) {
		redemptiontypeMapper.insertSelective(redemptiontype) ;
	}

}
