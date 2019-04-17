package com.grape.service.impl;

import com.grape.controller.bean.ImageBean1;
import com.grape.controller.request.*;
import com.grape.model.db.Image;
import com.grape.model.db.ImageExample;
import com.grape.model.mapper.base.ImageMapper;
import com.grape.model.mapper.external.ImageExMapper;
import com.grape.service.ImageService;
import com.grape.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ImageServiceImpl implements ImageService{
    private static final Logger log = LoggerFactory.getLogger(ImageServiceImpl.class);
	@Autowired
	private ImageMapper imageMapper;
	@Autowired
	private ImageExMapper imageExMapper;

	@Override
	public List<ImageBean1> selectImageByWorkid(WorkidAndProductnoRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", req.getWorkid());
		map.put("productno", req.getProductno());
		return imageExMapper.selectByWorkid(map);
	}

	@Override
	public void insertImage(ImageRequest req) {
		List<ImageBean> imagelist = req.getList();
		if(imagelist!=null && !imagelist.isEmpty()){
			for(ImageBean imagebean:imagelist){
				Image image = new Image();
				image.setImageid(Util.getID());
				image.setChgdt(new Date());
				image.setNodeid(req.getNodeid());
				image.setImagename(imagebean.getFilename());
				image.setImagetype(imagebean.getFiletype());
				image.setWorkid(req.getWorkid());
				imageMapper.insertSelective(image);
			}
		}
	}

	@Override
	public List<Image> selectImageByWorkid(ImageRequest req) {
		ImageExample example = new ImageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeidEqualTo(req.getNodeid());
		return imageMapper.selectByExample(example);
	}

	@Override
	public void deleteImage(ImageRequest req) {
		ImageExample example = new ImageExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andNodeidEqualTo(req.getNodeid());
		imageMapper.deleteByExample(example);
	}

	@Override
	public List<ImageBean1> selectImageByWorkidAndNodeid(WorkidAndNodeidRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", req.getWorkid());
		map.put("nodeid", req.getNodeid());
		map.put("productno", req.getProductno());
		return imageExMapper.selectByWorkidAndNodeid(map);
	}

	@Override
	public List<ImageBean1> selectImageByWorkidAndNodeid1(WorkidAndNodeidRequest req, IdAndNodeidRequest req2) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", req.getWorkid());
		map.put("productno", req.getProductno());
		map.put("id", req2.getId());
		map.put("nodeid", req.getNodeid());
		return imageExMapper.selectByWorkidAndNodeid1(map);
	}

	@Override
	public List<Image> selectByWorkid(String workid) {
		ImageExample example = new ImageExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		return imageMapper.selectByExample(example);
	}

	@Override
	public List<ImageBean1> selectByWorkid2(String workid) {
		ImageExample example = new ImageExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		List<Image> images = imageMapper.selectByExample(example);
		List<ImageBean1> imageBeans = new ArrayList<>() ;
		for (Image image : images) {
			ImageBean1 imageBean = new ImageBean1() ;
			try{
			    Util.transferFields(image ,imageBean ) ;
            }catch (Exception e) {
                log.info("转换实体类出错"+e);
            }
            imageBeans.add(imageBean) ;
		}
		return imageBeans;
	}


	@Override
	public void insertImage(Image req) {
		imageMapper.insertSelective(req) ;		
	}

	@Override
	public void updateImage(Image req) {
		imageMapper.updateByPrimaryKeySelective(req) ;
	}

	@Override
	public void deleteImageByType(ImageRequest imagereq) {
		ImageExample example = new ImageExample();
		example.createCriteria().andWorkidEqualTo(imagereq.getWorkid()).andImagetypeEqualTo(imagereq.getSavetype());
		imageMapper.deleteByExample(example);
		
	}

	@Override
	public List<ImageBean1> selectChanapprove(Map<String, Object> map) {

		return imageExMapper.selectChanapprove(map);
	}

}
