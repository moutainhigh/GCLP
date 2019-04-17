package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.ImageBean;
import com.grape.controller.request.RefundfinanceRequest;
import com.grape.controller.request.RefundmentRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.db.Image;
import com.grape.model.db.ImageExample;
import com.grape.model.db.Refundfinance;
import com.grape.model.db.RefundfinanceExample;
import com.grape.model.db.Refundment;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.model.mapper.base.ImageMapper;
import com.grape.model.mapper.base.RefundfinanceMapper;
import com.grape.model.mapper.base.RefundmentMapper;
import com.grape.service.RefundmentService;
import com.grape.util.Util;
@Service
public class RefundmentServiceImpl implements RefundmentService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	@Autowired
	private RefundmentMapper refundmentMapper;
	@Autowired
	private CodetableMapper codetableMapper;
	@Autowired
	private ImageMapper imageMapper;
	@Autowired
	private RefundfinanceMapper refundfinanceMapper;
	@Override
	public Refundment selectRfundmentByWorkid(WorkidRequest req) {
		return refundmentMapper.selectByPrimaryKey(req.getWorkid());
	}
	@Override
	public void insertRfundment(RefundmentRequest req) {
		//将他项权证保存
		List<ImageBean> imagelist = req.getImagelist();
		if(imagelist!=null && !imagelist.isEmpty()){
			for(int k=0;k<imagelist.size();k++){
				Image image = new Image();
				image.setImagename(imagelist.get(k).getFilename());
				image.setImagetype(imagelist.get(k).getFiletype());
				image.setChgdt(new Date());
				image.setNodeid(req.getNodeid());
				image.setImageid(Util.getID());
				image.setWorkid(req.getWorkid());
				imageMapper.insertSelective(image);
			}
		}
		Refundment refund = new Refundment();
		List<String> list = new ArrayList<String>();
		list= req.getReceivablesList();
		List<String> refundlist = new ArrayList<String>();
		refundlist = req.getRefundtypeList();
		String refundtype = "";
		String receiveable ="";
		StringBuilder result = new StringBuilder();
		StringBuilder result1 = new StringBuilder();
	    boolean first = true;
	    boolean first1=true;
	    //第一个前面不拼接","
	    if(!list.isEmpty()){
	    	for(String string :list) {
	 	       if(first) {
	 	          first=false;
	 	       }else{
	 	          result.append(",");
	 	       }
	 	       result.append(string);
	 	    }
	    }
	    if(!refundlist.isEmpty()){
	    	for(String string :refundlist) {
	 	       if(first1) {
	 	    	  first1=false;
	 	       }else{
	 	          result1.append(",");
	 	       }
	 	       result1.append(string);
	 	    }
	    }
	    refundtype=result1.toString();
	    receiveable=result.toString();
		try {
			Util.transferFields(req, refund);
			refund.setRefundtype(refundtype);
			refund.setReceivables(receiveable);
			refund.setChgdt(new Date());
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		refundmentMapper.insertSelective(refund);
		
	}
	@Override
	public Refundment selectRfundmentByWorkid(String workid) {
		return refundmentMapper.selectByPrimaryKey(workid);
	}
	@Override
	public void updateRefundinfo(RefundmentRequest req) {
		ImageExample imageexample = new ImageExample();
		if(req.getWorkid()!=null && req.getNodeid()!=null){
			imageexample.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeidEqualTo(req.getNodeid());
			imageMapper.deleteByExample(imageexample);
		}
		//将他项权证保存
		List<ImageBean> imagelist = req.getImagelist();
		if(imagelist!=null && !imagelist.isEmpty()){
			for(int k=0;k<imagelist.size();k++){
				Image image = new Image();
				image.setImagename(imagelist.get(k).getFilename());
				image.setImagetype(imagelist.get(k).getFiletype());
				image.setChgdt(new Date());
				image.setNodeid(req.getNodeid());
				image.setImageid(Util.getID());
				image.setWorkid(req.getWorkid());
				imageMapper.insertSelective(image);
			}
		}
		Refundment refund = new Refundment();
		List<String> list = new ArrayList<String>();
		list= req.getReceivablesList();
		List<String> refundlist = new ArrayList<String>();
		refundlist = req.getRefundtypeList();
		String refundtype = "";
		String receiveable ="";
		StringBuilder result = new StringBuilder();
		StringBuilder result1 = new StringBuilder();
	    boolean first = true;
	    boolean first1 = true;
	    //第一个前面不拼接","
	    if(!list.isEmpty()){
	    	for(String string :list) {
	 	       if(first) {
	 	          first=false;
	 	       }else{
	 	          result.append(",");
	 	       }
	 	       result.append(string);
	 	    }
	    }
	    if(!refundlist.isEmpty()){
	    	for(String string :refundlist) {
	 	       if(first1) {
	 	    	  first1=false;
	 	       }else{
	 	          result1.append(",");
	 	       }
	 	       result1.append(string);
	 	    }
	    }
	    refundtype=result1.toString();
	    receiveable=result.toString();
		try {
			Util.transferFields(req, refund);
			refund.setRefundtype(refundtype);
			refund.setReceivables(receiveable);
			refund.setChgdt(new Date());
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		refundmentMapper.updateByPrimaryKey(refund);
	}
	@Override
	public String selectNameByCode(String receivables, String string) {
		CodetableExample example = new CodetableExample();
		example.createCriteria().andCodtypEqualTo(string).andCodflgEqualTo(receivables);
		List<Codetable> list = codetableMapper.selectByExample(example);
		if(!list.isEmpty()){
			return list.get(0).getCoddes();
		}
		return null;
	}
	@Override
	public void insertRefundfinance(RefundfinanceRequest refundfinancereq, FlowHandleResponse res) {
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		Refundfinance refundfinance = new Refundfinance();
		try {
			Util.transferFields(refundfinancereq, refundfinance);
			refundfinance.setId(Util.getID());
			refundfinance.setChgdt(new Date());
			refundfinance.setChgtl(userid);
			if(res!=null){
				refundfinance.setLogid(res.getLogid());
			}
		} catch (Exception e) {
			log.info("退款财务一级审批信息转换出错");
			e.printStackTrace();
		}
		refundfinanceMapper.insertSelective(refundfinance);
	}
	@Override
	public Refundfinance selectrefundfinance(String id) {
		RefundfinanceExample example = new RefundfinanceExample();
		example.createCriteria().andLogidEqualTo(id);
		List<Refundfinance> list = refundfinanceMapper.selectByExample(example);
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
