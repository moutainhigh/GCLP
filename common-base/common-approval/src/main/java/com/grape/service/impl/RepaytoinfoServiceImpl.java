package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.RepaytoInfoRequest;
import com.grape.controller.request.WorkidAndOrgRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.RepaytoinfoExample;
import com.grape.model.mapper.base.RepaytoinfoMapper;
import com.grape.model.mapper.external.RepaytoinfoExMapper;
import com.grape.service.ProductnodeService;
import com.grape.service.RepaytoinfoService;
import com.grape.util.Util;
@Service
public class RepaytoinfoServiceImpl implements RepaytoinfoService{
	private static final Logger log = LoggerFactory.getLogger(RepaytoinfoServiceImpl.class);
	@Autowired
	private RepaytoinfoMapper repaytoinfoMapper;
	@Autowired
	private RepaytoinfoExMapper repaytoinfoExMapper ;
	@Autowired
	private ProductnodeService productndodeService;
	
	@Override
	public List<Repaytoinfo> selectRepaytoinfoByWorkid(WorkidRequest req) {
		RepaytoinfoExample example = new RepaytoinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		return repaytoinfoMapper.selectByExample(example);
	}
	@Override
	public void insertRepaytoinfo(RepaytoInfoRequest req) {
		List<Productnode> productndode =productndodeService.selectByNodeid(req.getNodeid());
		String productno=null;
		if(!productndode.isEmpty()){
			productno=productndode.get(0).getProductno();
		}
		List<Product> product = productndodeService.selectRepayMethod(productno);
		String repaymethod = null;
		String ratetype=null;
		if(!product.isEmpty()){
			repaymethod=product.get(0).getRepaymethod();
			ratetype=product.get(0).getRatetype();
		}
		Repaytoinfo repaytoinfo = new Repaytoinfo();
		try {
			Util.transferFields(req, repaytoinfo);
			repaytoinfo.setRepaymethod(repaymethod);
			repaytoinfo.setInterestratetype(ratetype);
			repaytoinfo.setChgdt(new Date());
			repaytoinfo.setId(Util.getID());
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		repaytoinfoMapper.insertSelective(repaytoinfo);
		
	}
	@Override
	public Repaytoinfo selectFinalrepaytoinfo(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		Repaytoinfo repay = repaytoinfoExMapper.selectFinalRepaytoinfo(map);
		if(repay!=null){
			return repay;
		}
		return null;
	}
	@Override
	public void insertRepaytoinfo(Repaytoinfo repay) {
		if(repay!=null){
			repaytoinfoMapper.insertSelective(repay);
		}
	}
	@Override
	public Repaytoinfo selectRepaytoinfoByWorkidAndOrg(WorkidAndOrgRequest req) {
		RepaytoinfoExample example = new RepaytoinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andBatchorgEqualTo(req.getOrgid());
		example.setOrderByClause("id desc");
		List<Repaytoinfo> list =repaytoinfoMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	@Override
	public List<Repaytoinfo> selectRepaytoinfoOrderbytime(WorkidRequest req) {
		List<Repaytoinfo> list = new ArrayList<Repaytoinfo>() ;
		Repaytoinfo repaytoinfo = repaytoinfoExMapper.selecttwo(req);
		if(repaytoinfo!=null){
			list.add(repaytoinfo) ;
		}
		Repaytoinfo repaytoinfo2 = repaytoinfoExMapper.selectfour(req);
		if(repaytoinfo2!=null){
			list.add(repaytoinfo2) ;
		}
		return list;
	}
	@Override
	public List<Repaytoinfo> selectRepaytoinfoOrderbytime2(WorkidRequest req) {
		List<Repaytoinfo> list = new ArrayList<Repaytoinfo>() ;
		Repaytoinfo repaytoinfo= repaytoinfoExMapper.selectthree(req);
		if(repaytoinfo!=null){
			list.add(repaytoinfo) ;
		}
		Repaytoinfo repaytoinfo2 = repaytoinfoExMapper.selectSecondResult(req);
		if(repaytoinfo2!=null){
			list.add(repaytoinfo2) ;
		}
		return list;
	}
	@Override
	public Repaytoinfo selectById(String id) {		
		return repaytoinfoMapper.selectByPrimaryKey(id);
	}
	@Override
	public void updateRepaytoinfo(Repaytoinfo repay) {

		repaytoinfoMapper.updateByPrimaryKey(repay);
		
	}
	@Override
	public Repaytoinfo selectBaohanrepaytoinfo(String workid) {
		RepaytoinfoExample example = new RepaytoinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andIsfinilyflgEqualTo("2");
		return repaytoinfoMapper.selectByExample(example).get(0);
	}
	@Override
	public Repaytoinfo selectFourRepaytoinfo(RepaytoInfoRequest req) {
		WorkidRequest request = new WorkidRequest();
		request.setWorkid(req.getWorkid());
		return repaytoinfoExMapper.selectfour(request);
	}
	@Override
	public List<Repaytoinfo> selectisfinalRepayToInfo(String workid) {
		RepaytoinfoExample example = new RepaytoinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andIsfinilyflgEqualTo("1");
		List<Repaytoinfo> list = repaytoinfoMapper.selectByExample(example);
		if(list!=null && !list.isEmpty()){
			return list;
		}else{
			return null;
		}
	}
}
