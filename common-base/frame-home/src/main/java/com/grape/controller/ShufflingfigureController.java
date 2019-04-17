package com.grape.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.ShufflingfigureResponse;
import com.grape.controller.reponse.bean.ShufflingfigureInfo;
import com.grape.model.db.Shufflingfigure;
import com.grape.service.ShufflingfigureService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/image")
@Validated
@Log4j
public class ShufflingfigureController {
		
	
	@Autowired
	ShufflingfigureService shufflingfigureService;
	
	@ApiOperation(value = "首页轮播图(pc)",httpMethod="POST",notes="返回首页轮播图的url",response=ShufflingfigureResponse.class)
    @RequestMapping("/figure")
    public Response figure() {
		try {
			List<Shufflingfigure> shufflingfigures = shufflingfigureService.findShufflingfigurePC();
			List<ShufflingfigureInfo> infos = new ArrayList<>();
			for (Shufflingfigure shufflingfigure : shufflingfigures) {
				ShufflingfigureInfo info = new ShufflingfigureInfo();
				info.setFilename(shufflingfigure.getFilename());
				info.setFileurl(shufflingfigure.getFileurl());
				info.setId(shufflingfigure.getId());
				info.setProductname(shufflingfigure.getProductname());
				info.setProductno(shufflingfigure.getProductno());
				infos.add(info);
			}
			return new ShufflingfigureResponse(infos);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	
	@ApiOperation(value = "首页轮播图(APP)",httpMethod="POST",notes="返回首页轮播图的url",response=ShufflingfigureResponse.class)
    @RequestMapping("/figure_app")
    public Response figure_app() {
		try {
			List<Shufflingfigure> shufflingfigures = shufflingfigureService.findShufflingfigureAPP();
			List<ShufflingfigureInfo> infos = new ArrayList<>();
			for (Shufflingfigure shufflingfigure : shufflingfigures) {
				ShufflingfigureInfo info = new ShufflingfigureInfo();
				info.setFilename(Util.outObj(shufflingfigure.getFilename()));
				info.setFileurl(Util.outObj(shufflingfigure.getFileurl()));
				info.setId(Util.outObj(shufflingfigure.getId()));
				info.setProductname(Util.outObj(shufflingfigure.getProductname()));
				info.setProductno(Util.outObj(shufflingfigure.getProductno()));
				infos.add(info);
			}
			return new ShufflingfigureResponse(infos);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
		
    }
	
}
