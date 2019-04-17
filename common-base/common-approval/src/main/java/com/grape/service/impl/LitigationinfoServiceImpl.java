package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.CustinfoForm;
import com.grape.controller.request.ImageRequest;
import com.grape.controller.request.LitigationinfoRequest;
import com.grape.controller.request.WorkidAndCerdidAndQuerytypeReq;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Image;
import com.grape.model.db.Litigationinfo;
import com.grape.model.db.LitigationinfoExample;
import com.grape.model.mapper.base.LitigationinfoMapper;
import com.grape.service.ImageService;
import com.grape.service.LitigationinfoService;
import com.grape.util.Util;
@Service
public class LitigationinfoServiceImpl implements LitigationinfoService{
	private static final Logger log = LoggerFactory.getLogger(LitigationinfoServiceImpl.class);
	@Autowired
	private LitigationinfoMapper litigationinfoMapper;
	@Autowired
	private ImageService imageService;
	@Override
	public void insertLitigationinfo(CustinfoForm req) {
		List<LitigationinfoRequest> litigationinfos = req.getLitigationinfos();
		String cerdid = req.getCerdid();
		String workid = req.getWorkid();
		if(!litigationinfos.isEmpty()) {
			for(LitigationinfoRequest litigationinfo:litigationinfos){
				String imagename = litigationinfo.getImagename();
				if(imagename!=null){
					String[] imagearr = imagename.split(",");
					if(imagearr.length>0){
						for(int i=0;i<imagearr.length;i++){
							String imagenameofliti = imagearr[i];
							if(imagenameofliti!=null){
								//将诉讼记录的截图保存到image表里面
								Image image = new Image();
								image.setImageid(Util.getID());
								image.setImagename(imagenameofliti);
								image.setChgdt(new Date());
								image.setNodeid(req.getNodeid());
								image.setImagetype("777");
								image.setWorkid(req.getWorkid());
								imageService.insertImage(image);
							}
						}
					}
				}
				Litigationinfo liti = new Litigationinfo();
				litigationinfo.setCerdid(cerdid);
				litigationinfo.setWorkid(workid);
				try {
					Util.transferFields(litigationinfo, liti);
				} catch (Exception e) {
					log.info("实体类转换出错"+e);
				}
				if(!Util.isBlank(req.getWorkid()) && !Util.isBlank(req.getCerdid()) && !Util.isBlank(liti.getQuerytype())){
					litigationinfoMapper.insertSelective(liti);
				}
			}
		}
	}
	@Override
	public void updateLitigationinfo(CustinfoForm req) {
		List<LitigationinfoRequest> litigationinfos = req.getLitigationinfos();
		String cerdid = req.getCerdid();
		String workid = req.getWorkid();
		if(!litigationinfos.isEmpty()) {
			ImageRequest imagereq = new ImageRequest();
			imagereq.setWorkid(req.getWorkid());
			imagereq.setSavetype("777");
			imageService.deleteImageByType(imagereq);
			for(LitigationinfoRequest litigationinfo:litigationinfos){
				String imagename = litigationinfo.getImagename();
				if(imagename!=null){
					String[] imagearr = imagename.split(",");
					if(imagearr.length>0){
						for(int i=0;i<imagearr.length;i++){
							String imagenameofliti = imagearr[i];
							if(imagenameofliti!=null){
								Image image = new Image();
								image.setImageid(Util.getID());
								image.setImagename(imagenameofliti);
								image.setChgdt(new Date());
								image.setNodeid(req.getNodeid());
								image.setImagetype("777");
								image.setWorkid(req.getWorkid());
								imageService.insertImage(image);
							}
						}
					}
				}
				Litigationinfo liti = new Litigationinfo();
				litigationinfo.setCerdid(cerdid);
				litigationinfo.setWorkid(workid);
				try {
					Util.transferFields(litigationinfo, liti);
				} catch (Exception e) {
					log.info("实体类转换出错"+e);
				}
				if(!Util.isBlank(req.getWorkid()) && !Util.isBlank(req.getCerdid()) && !Util.isBlank(liti.getQuerytype())){
					litigationinfoMapper.updateByPrimaryKey(liti);
				}
			}
		}
	}
	@Override
	public List<Litigationinfo> selectLitiByCerdidAndWorkid(WorkidAndCerdidRequest req) {
		LitigationinfoExample example = new LitigationinfoExample();
		example.createCriteria().andCerdidEqualTo(req.getCerdid()).andWorkidEqualTo(req.getWorkid());
		return litigationinfoMapper.selectByExample(example);
	}
	@Override
	public Litigationinfo selectByThreeid(WorkidAndCerdidAndQuerytypeReq req) {
		LitigationinfoExample example = new LitigationinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andCerdidEqualTo(req.getCerdid()).andQuerytypeEqualTo(req.getQuerytype()) ;
		List<Litigationinfo> list = new ArrayList<Litigationinfo>() ;
		list = litigationinfoMapper.selectByExample(example) ;
		if(list.size() != 0) {
			return list.get(0);
		}else {
			return null ;	
		}
	}

}
