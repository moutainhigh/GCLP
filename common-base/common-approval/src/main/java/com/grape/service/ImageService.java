package com.grape.service;

import com.grape.controller.bean.ImageBean1;
import com.grape.controller.request.IdAndNodeidRequest;
import com.grape.controller.request.ImageRequest;
import com.grape.controller.request.WorkidAndNodeidRequest;
import com.grape.controller.request.WorkidAndProductnoRequest;
import com.grape.model.db.Image;

import java.util.List;
import java.util.Map;

public interface ImageService {

	List<ImageBean1> selectImageByWorkid(WorkidAndProductnoRequest req);

	void insertImage(ImageRequest req);

	List<Image> selectImageByWorkid(ImageRequest req);

	void deleteImage(ImageRequest req);

	List<ImageBean1> selectImageByWorkidAndNodeid(WorkidAndNodeidRequest req);

	List<ImageBean1> selectImageByWorkidAndNodeid1(WorkidAndNodeidRequest req, IdAndNodeidRequest req2);
	
	List<Image> selectByWorkid(String workid) ;

	List<ImageBean1> selectByWorkid2(String workid) ;

	void insertImage(Image req) ;

	void updateImage(Image req) ;

	void deleteImageByType(ImageRequest imagereq);

	List<ImageBean1> selectChanapprove(Map<String , Object> map) ;
}
