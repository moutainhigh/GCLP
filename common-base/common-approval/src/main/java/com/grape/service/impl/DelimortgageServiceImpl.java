package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import com.grape.model.db.*;
import com.grape.model.mapper.base.DeliapplicateinfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.DelimortRequest;
import com.grape.controller.request.ImageBean;
import com.grape.model.mapper.base.DelimortgageMapper;
import com.grape.model.mapper.base.ImageMapper;
import com.grape.service.DelimortgageService;
import com.grape.util.Util;

@Service
public class DelimortgageServiceImpl implements DelimortgageService{
	@Autowired
	private DelimortgageMapper delimortgageMapper;
	@Autowired
	private ImageMapper imageMapper;
	@Autowired
	private DeliapplicateinfoMapper deliapplicateinfoMapper;
	private static final Logger log = LoggerFactory.getLogger(DelimortgageServiceImpl.class);
	@Override
	public Delimortgage queryDelimortgageById(String id) {
		Delimortgage deli = delimortgageMapper.selectByPrimaryKey(id);
		return deli;
	}
	@Override
	public void deleteDelimort(String id) {
		delimortgageMapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public List<Delimortgage> queryDelimortgageByWorkid(String workid) {
		DelimortgageExample example = new DelimortgageExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Delimortgage> list = delimortgageMapper.selectByExample(example);
		return list;
	}
	@Override
	public List<Delimortgage> queryAllDelimortgage(int pagenum, int pagesize) {
		DelimortgageExample example = new DelimortgageExample();
		List<Delimortgage> list = delimortgageMapper.selectByExample(example);
		return list;
	}
	@Override
	public void updateDelimort(DelimortRequest req) {
		ImageExample example = new ImageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeidEqualTo(req.getNodeid()).andSavetypeEqualTo(req.getId());
		List<Image> list = imageMapper.selectByExample(example);
		List<ImageBean> imagelist = req.getImagelist();
		boolean deleteimage = true;
		if(!list.isEmpty()){
			if(imagelist!=null && !imagelist.isEmpty()){
				for(int k=0;k<imagelist.size();k++){
					//如果图片不是在附件里上传的，则不需要替换
					if(imagelist.get(k).getFiletype()!=null){
						if(imagelist.get(k).getFiletype().equals("A009") || imagelist.get(k).getFiletype().equals("A010") || imagelist.get(k).getFiletype().equals("A011") || imagelist.get(k).getFiletype().equals("A012") || imagelist.get(k).getFiletype().equals("A013")){
							deleteimage=false;
							break;
						}
					}
				}
			}
			//如果没有上传图片，则不删除之前的图片
			if(imagelist!=null && !imagelist.isEmpty()){
				for(Image image:list){
					if(deleteimage){
						imageMapper.deleteByPrimaryKey(image.getImageid());
					}
				}
			}
		}
		if(imagelist!=null && !imagelist.isEmpty()){
			for(int i=0;i<imagelist.size();i++){
				Image image = new Image();
				image.setNodeid(req.getNodeid());
				image.setImagetype(imagelist.get(i).getFiletype());
				image.setImageid(Util.getID());
				image.setSavetype(req.getId());
				image.setImagename(imagelist.get(i).getFilename());
				image.setChgdt(new Date());
				image.setWorkid(req.getWorkid());
				imageMapper.insertSelective(image);
			}
		}
		Delimortgage deli = new Delimortgage();
		try {
			Util.transferFields(req, deli);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		delimortgageMapper.updateByPrimaryKeySelective(deli);
	}
	
	@Override
	public void insertDelimort(DelimortRequest req) {
		List<ImageBean> imagelist = req.getImagelist();
		if(null != imagelist){
			for(int i=0;i<imagelist.size();i++){
				Image image = new Image();
				image.setNodeid(req.getNodeid());
				image.setImagetype(imagelist.get(i).getFiletype());
				image.setImageid(Util.getID());
				image.setSavetype(req.getId());
				image.setImagename(imagelist.get(i).getFilename());
				image.setChgdt(new Date());
				image.setWorkid(req.getWorkid());
				imageMapper.insertSelective(image);
			}
		}
		Delimortgage deli = new Delimortgage();
		try {
			Util.transferFields(req, deli);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		delimortgageMapper.insert(deli) ;
	}

	@Override
	public void deleteDeliCustinfoByExample(String workid) {
		DeliapplicateinfoExample example = new DeliapplicateinfoExample();
		example.createCriteria().andWorkidEqualTo(workid);
		deliapplicateinfoMapper.deleteByExample(example);
	}

	@Override
	public void deleteByExample(String workid) {
		DelimortgageExample example = new DelimortgageExample();
		example.createCriteria().andWorkidEqualTo(workid);
		delimortgageMapper.deleteByExample(example);
	}

	@Override
	public void insertDelimort(Delimortgage mort) {
		delimortgageMapper.insertSelective(mort) ;
	}

}
