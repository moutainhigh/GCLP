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

import com.grape.controller.reponse.Custmarrow;
import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.CerdidRequest;
import com.grape.controller.request.CustinfoForm;
import com.grape.controller.request.CustinfoRequest2;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Custinfo;
import com.grape.model.db.CustinfoExample;
import com.grape.model.db.Image;
import com.grape.model.db.ImageExample;
import com.grape.model.db.Mortgage;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.ImageMapper;
import com.grape.model.mapper.external.CustinfoExMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.CustinfoService;
import com.grape.util.Util;

@Service
public class CustinfoServiceImpl implements CustinfoService{
	private static final Logger log = LoggerFactory.getLogger(CustinfoServiceImpl.class);
	@Autowired
	private CustinfoMapper custinfoMapper;
	@Autowired
	private ImageMapper imageMapper;
	@Autowired
	private CustinfoExMapper custinfoExMapper;
	@Autowired
	private DoctaskExMapper doctaskExMapper;
	@Override
	public List<Custinfo> querybyworkid(WorkidRequest req) {
		CustinfoExample cust = new CustinfoExample();
		cust.createCriteria().andWorkidEqualTo(req.getWorkid());
		List<Custinfo> custinfo = custinfoMapper.selectByExample(cust);
		return custinfo;
	}
	@Override
	public List<Custinfo> queryByCerdid(CerdidRequest req) {
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andCerdidEqualTo(req.getCerdid());
		List<Custinfo> list = custinfoMapper.selectByExample(example);
		return list;
	}
	@Override
	public Custinfo queryByCerdidAndWorkid(WorkidAndCerdidRequest req) {
		Custinfo custinfo = custinfoMapper.selectByPrimaryKey(req.getWorkid(), req.getCerdid());
		return custinfo;
	}
	@Override
	public void insertCustinfo(CustinfoForm req) {
		String crowncerdid = req.getRelationcerdid();
		if(crowncerdid!=null){
			CustinfoExample example = new CustinfoExample();
			example.createCriteria().andCerdidEqualTo(crowncerdid).andWorkidEqualTo(req.getWorkid());
			List<Custinfo> custinfos = custinfoMapper.selectByExample(example);
			if(!custinfos.isEmpty()){
				Custinfo cust = custinfos.get(0);
				if(req.getCerdid()!=null){
					cust.setRelationcerdid(req.getCerdid());
					custinfoMapper.updateByPrimaryKeySelective(cust);
				}
			}

		}
		Custinfo cust = new Custinfo();
		try {
			Util.transferFields(req, cust);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		Map<String,Object> map = new HashMap<String,Object>();
		String cerditimage = req.getCreditimage();
		String cerditimage2 = req.getCreditimage2();
		String busilicence = req.getBusilicence();
		if(null != busilicence && !"".equals(busilicence)) {
			String[] busilicencearr = busilicence.split(",");
			if(busilicencearr.length>0){
				for(int m=0;m<busilicencearr.length;m++){
					map.put("busilicence"+m, busilicencearr[m]);
				}
			}
		}
		map.put("cerditimage", cerditimage);
		map.put("cerditimage2", cerditimage2);
//		map.put("busilicence", busilicence);
		String workid = req.getWorkid();
		String imagename = null;
		for (String s:map.keySet()) {
			Image image = new Image();
			String id = Util.getID();
			image.setImageid(id);
			image.setNodeid(req.getNodeid());
			image.setChgdt(new Date());
			imagename=(String) map.get(s);
			if(s.equals("cerditimage")){
				image.setImagetype("1");
			}else if(s.contains("busilicence")){
				image.setImagetype("81");
			}else if(s.equals("cerditimage2")){
				image.setImagetype("1");
			}
			image.setImagename(imagename);
			image.setWorkid(workid);
			imageMapper.insertSelective(image);
		}
		
//		cust.setWorkid(Util.getID().substring(0,10));
		custinfoMapper.insertSelective(cust);
	}
	
	@Override
	public void updateCustinfo(CustinfoForm req) {
		String crowncerdid = req.getRelationcerdid();
		if(crowncerdid!=null){
			CustinfoExample example = new CustinfoExample();
			example.createCriteria().andCerdidEqualTo(crowncerdid).andWorkidEqualTo(req.getWorkid());
			List<Custinfo> custinfos = custinfoMapper.selectByExample(example);
			if(!custinfos.isEmpty()){
				Custinfo cust = custinfos.get(0);
				if(req.getCerdid()!=null){
					cust.setRelationcerdid(req.getCerdid());
					custinfoMapper.updateByPrimaryKey(cust);
				}
			}
		}
		Custinfo cust = new Custinfo();
		try {
			Util.transferFields(req, cust);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		ImageExample example = new ImageExample();
		List<String> imagelist = new ArrayList<String>();
		imagelist.add("1");
		imagelist.add("2");
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeidEqualTo(req.getNodeid()).andImagetypeIn(imagelist);
		imageMapper.deleteByExample(example);
		Map<String,Object> map = new HashMap<String,Object>(); 
		String cerditimage = req.getCreditimage();
		String cerditimage2 = req.getCreditimage2();
		String busilicence = req.getBusilicence();
		map.put("cerditimage", cerditimage);
		map.put("cerditimage2", cerditimage2);
		if(busilicence!=null){
			map.put("busilicence", busilicence);
		}
		String workid = req.getWorkid();
		String imagename = null;
		for (String s:map.keySet()) {
			Image image = new Image();
			String id = Util.getID();
			image.setImageid(id);
			image.setNodeid(req.getNodeid());
			image.setChgdt(new Date());
			imagename=(String) map.get(s);
			if(s.equals("cerditimage")){
				image.setImagetype("1");
			}else if(s.equals("busilicence")){
				image.setImagetype("2");
			}else{
				image.setImagetype("1");
			}
			image.setImagename(imagename);
			image.setWorkid(workid);
			imageMapper.insertSelective(image);
		}
		custinfoMapper.updateByPrimaryKey(cust);
	}
	@Override
	public void deleteCustinfo(WorkidAndCerdidRequest req) {
		custinfoMapper.deleteByPrimaryKey(req.getWorkid(), req.getCerdid());
	}
	@Override
	public void completeCustinfo(CustinfoRequest2 req) {
		Custinfo cust = new Custinfo();
		try {
			Util.transferFields(req, cust);
		} catch (Exception e) {
			log.info("实体类转换出错");
			
		}
		custinfoMapper.updateByPrimaryKeySelective(cust);
		
	}
	@Override
	public Custmarrow selectCustmarrow(WorkidAndCerdidRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", req.getWorkid());
		map.put("cerdid", req.getCerdid());
		return custinfoExMapper.selectCustmarrowinfo(map);
	}
	@Override
	public Custinfo queryByCerdidAndWorkid(String workid, String cerdid) {
		Custinfo custinfo = custinfoMapper.selectByPrimaryKey(workid,cerdid);
		return custinfo;
	}
	@Override
	public List<Custinfo> selectMarrowinfo(WorkidAndCerdidRequest req) {
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andRelationcerdidEqualTo(req.getCerdid()).andIsmarrowEqualTo("1");
		return custinfoMapper.selectByExample(example);
	}
	@Override
	public List<Custinfo> selectByCerdid(WorkidAndCerdidRequest req) {
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andWorkidNotEqualTo(req.getWorkid()).andCerdidEqualTo(req.getCerdid());
		return custinfoMapper.selectByExample(example);
	}
	@Override
	public AllLoaninfo selectDoctaskinfo(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid",workid);
		return doctaskExMapper.selectAllLoaninfo(map);
	}
	@Override
	public List<Custinfo> selectByCerdid(String cerdid,String workid) {
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andCerdidEqualTo(cerdid).andWorkidEqualTo(workid);
		return custinfoMapper.selectByExample(example);
	}
	@Override
	public List<Custinfo> selectBymarriedAndCerdid(String ismarried, String relationcerdid,String workid) {
		CustinfoExample example = new CustinfoExample();
		if(ismarried!=null && relationcerdid!=null){
			example.createCriteria().andIsmarrowEqualTo(ismarried).andRelationcerdidEqualTo(relationcerdid).andWorkidEqualTo(workid);
		}
		return custinfoMapper.selectByExample(example);
	}
	@Override
	public void deleteCustinfo(Custinfo custinfo) {
		custinfoMapper.deleteByPrimaryKey(custinfo.getWorkid(), custinfo.getCerdid());
		
	}
	@Override
	public List<Custinfo> selectByCerdid1(String cerdid, String workid) {
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andCerdidEqualTo(cerdid).andWorkidEqualTo(workid).andCusttypeNotEqualTo("4");
		return custinfoMapper.selectByExample(example);
	}
	@Override
	public List<Custinfo> selectCustinfoByWorkid(String workid) {
		
		return custinfoExMapper.selectCustinfoByWorkid(workid) ;
	}

	@Override
	public void insertComcust(Custinfo custinfo) {
		custinfoMapper.insertSelective(custinfo) ;
	}

}
