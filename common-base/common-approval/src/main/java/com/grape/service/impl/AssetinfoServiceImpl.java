package com.grape.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.AssetinfoRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Assetinfo;
import com.grape.model.db.AssetinfoExample;
import com.grape.model.mapper.base.AssetinfoMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.AssetinfoService;
import com.grape.util.Util;
@Service
public class AssetinfoServiceImpl implements AssetinfoService{
	private final static Logger log = LoggerFactory.getLogger(AssetinfoServiceImpl.class);
	@Autowired
	private AssetinfoMapper assetinfoMapper;
	@Autowired
	private DoctaskExMapper doctaskExMapper;
	
	@Override
	public List<Assetinfo> queryAssetByWorkid(WorkidAndCerdidRequest req) {
		AssetinfoExample example = new AssetinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andCerdidEqualTo(req.getCerdid());
		List<Assetinfo> assetinfo = assetinfoMapper.selectByExample(example);
		return assetinfo;
	}
	@Override
	public void insertAssetinfo(AssetinfoRequest req) {
		String workid = req.getWorkid();
		String cerdid = req.getCerdid();
		if(workid!=null && cerdid!=null){
			AssetinfoExample example = new AssetinfoExample();
			example.createCriteria().andWorkidEqualTo(workid).andCerdidEqualTo(cerdid);
			List<Assetinfo> assetinfolist = assetinfoMapper.selectByExample(example);
			if(assetinfolist != null && !assetinfolist.isEmpty() && assetinfolist!=null){
				assetinfoMapper.deleteByExample(example);
			}
		}
		List<Assetinfo> list = req.getList();
		if(list!=null && list.size()>0){
			AssetinfoExample example = new AssetinfoExample();
			example.createCriteria().andWorkidEqualTo(list.get(0).getWorkid()).andCerdidEqualTo(list.get(0).getCerdid());
			List<Assetinfo> assetinfolist = assetinfoMapper.selectByExample(example);
			if(assetinfolist != null && !assetinfolist.isEmpty()){
				assetinfoMapper.deleteByExample(example);
			}
			for(int i=0;i<list.size();i++){
				Assetinfo assetinfo = new Assetinfo();
				try {
					Util.transferFields(list.get(i), assetinfo);
				} catch (Exception e) {
					log.info("实体类转换出错"+e);
				}
				assetinfo.setChgdt(new Date());
				assetinfo.setId(Util.getID());
				assetinfoMapper.insertSelective(assetinfo);
			}
		}
	}
	@Override
	public void updateAssetinfo(AssetinfoRequest req) {
		List<Assetinfo> list = req.getList();
		for(int i=0;i<list.size();i++){
			Assetinfo assetinfo = new Assetinfo();
			try {
				Util.transferFields(list.get(i), assetinfo);
			} catch (Exception e) {
				log.info("实体类转换出错"+e);
			}
			assetinfo.setChgdt(new Date());
			assetinfoMapper.updateByPrimaryKeySelective(assetinfo);
		}
	}
	@Override
	public void deleteAssetinfo(IdRequest req) {
		assetinfoMapper.deleteByPrimaryKey(req.getId());
	}
	@Override
	public List<Assetinfo> queryAssetinfoByWorkid(String workid) {
		AssetinfoExample example = new AssetinfoExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		return assetinfoMapper.selectByExample(example) ;
	}
	@Override
	public String selectAssessNotation(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		return doctaskExMapper.selectAssessnotation(map);
	}
	@Override
	public String selectAssessNotation2(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		return doctaskExMapper.selectAssessnotation2(map);
	}
	@Override
	public void insertAsset(Assetinfo info) {
		assetinfoMapper.insertSelective(info);
		
	}
}
