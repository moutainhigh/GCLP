package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.BuildingpropertyBean;
import com.grape.controller.bean.ImageList;
import com.grape.controller.bean.ImageList2;
import com.grape.controller.bean.PictureBean;
import com.grape.controller.bean.RealpriceBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.BuildingpropertyResponse;
import com.grape.controller.reponse.BuildingpropertyResponse1;
import com.grape.controller.reponse.BuildingpropertyResponse2;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.BuildingpropertyRequest;
import com.grape.controller.request.MortgageidRequest;
import com.grape.model.db.Buildingproperty;
import com.grape.service.BuildingpropertyService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/buildingproperty")
public class BuildingpropertyController {
	@Autowired
	private BuildingpropertyService buildingpropertyService ;
	
	@RequestMapping("/queryByMortgageid")
	@ApiOperation(value="根据抵押物编号查询相关的",httpMethod="POST",notes="接口",response=BuildingpropertyResponse.class)
	public Response queryByMortgageid(@RequestBody MortgageidRequest req) {
		List<Buildingproperty> list = buildingpropertyService.queryByMortgageid(req) ;
		if(!list.isEmpty()) {
			return new BuildingpropertyResponse(list) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}
	
	@ApiOperation(value="插入中介信息",httpMethod="POST",notes="",response=BuildingpropertyResponse1.class)
	@RequestMapping("/insertBuildingproperty")
	public Response insertReservations(@RequestBody BuildingpropertyRequest req) {
		buildingpropertyService.insertBuildingproperty(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/queryByMortgageidforapp")
	@ApiOperation(value="根据抵押物编号查询相关的",httpMethod="POST",notes="接口",response=BuildingpropertyResponse2.class)
	public Response queryByMortgageidForApp(@RequestBody MortgageidRequest req) {
		List<Buildingproperty> list = buildingpropertyService.queryByMortgageid(req) ;
		List<BuildingpropertyBean> beans = new ArrayList<BuildingpropertyBean>() ;
		List<ImageList> imageList = new ArrayList<ImageList>() ;
		for (Buildingproperty buildingproperty : list) {
			BuildingpropertyBean bean = new BuildingpropertyBean() ;
			List<PictureBean> picture = new ArrayList<>() ;
			List<RealpriceBean> realPrice = new ArrayList<>() ;
			String[] splitPicture = buildingproperty.getPicture().split(",") ;
			ImageList image = new ImageList() ;
			image.setName(buildingproperty.getCard());
			if(splitPicture.length > 0 && buildingproperty.getPicture().length() > 0) {
				PictureBean picturebean = new PictureBean() ;
				List<ImageList2> imageList2 = new ArrayList<ImageList2>() ;
				for (String string : splitPicture) {
					ImageList2 list2 = new ImageList2() ;
					list2.setPicture(string);
					list2.setId(string.substring(0, 13));	
					imageList2.add(list2);
				}
				picturebean.setName("中介名片");
				picturebean.setImagelist(imageList2);	
				picture.add(picturebean) ;
			}

			String[] splitRealPrice1 = buildingproperty.getRealpriceprice().split(",") ;
			if(splitRealPrice1.length > 0 && buildingproperty.getRealpriceprice().length() > 0) {
				PictureBean picturebean = new PictureBean() ;
				List<ImageList2> imageList3 = new ArrayList<ImageList2>() ;
				for (String string : splitRealPrice1) {
					ImageList2 list2 = new ImageList2() ;
					list2.setPicture(string);
					list2.setId(string.substring(0, 13));	
					imageList3.add(list2);
				}
				picturebean.setName("挂盘价图片");
				picturebean.setImagelist(imageList3);	
				picture.add(picturebean) ;
			}
			try {
				Util.transferFields(buildingproperty, bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			bean.setListPicture(picture);
			bean.setRealprice(buildingproperty.getRealprice()) ;	
			/*
			beans.add(bean) ;*/
			beans.add(bean);
		}
		if(!list.isEmpty()) {
			return new BuildingpropertyResponse2(beans) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}

}
