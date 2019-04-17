package com.grape.controller;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.*;
import com.grape.controller.request.*;
import com.grape.model.db.Person;
import com.grape.model.db.Shufflingfigure;
import com.grape.service.PersonService;
import com.grape.service.ShufflingService;
import com.grape.util.Util;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/shuffling")
public class ShufflingController {
    @Autowired
    private ShufflingService shufflingService ;
    
    @Autowired
    private PersonService personService;

    @RequestMapping("/selectAllShuffling")
    @ApiOperation(value="查询所有轮播图",notes="轮播图接口1",httpMethod="POST",response= ShufflingfigureResponse.class)
    public Response selectAllShuffling( ) {
        List<Shufflingfigure> shufflingfigures = shufflingService.selectAllShuffling();
        if(!CollectionUtils.isEmpty(shufflingfigures)) {
            return new ShufflingfigureResponse(shufflingfigures,0,0) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }

    @RequestMapping("/selectByOption")
    @ApiOperation(value="条件查询轮播图",notes="轮播图接口2",httpMethod="POST",response= ShufflingfigureResponse.class)
    public Response selectByOption(@RequestBody ShufflingOptionRequest request) {
        List<Shufflingfigure> shufflingfigures = new ArrayList<>() ;
        Integer count = shufflingService.selectByOptionCount(request) ;
        if(StringUtils.isEmpty(request.getFilename())&&StringUtils.isEmpty(request.getUseflg())&&StringUtils.isEmpty(request.getProductno())) {
            shufflingfigures = shufflingService.selectAllShuffling() ;
        }else{
            shufflingfigures = shufflingService.selectByOption(request) ;
        }
        if(!CollectionUtils.isEmpty(shufflingfigures)) {
        	for(Shufflingfigure Shufflingfigure : shufflingfigures){
        		Person person = personService.selectPersonByWorkerid(Shufflingfigure.getChgtl());
        		if(!StringUtils.isEmpty(person)){
        			Shufflingfigure.setChgtl(person.getWorkername());
        		}
        	}
            return new ShufflingfigureResponse(shufflingfigures,request.getPagenum(),count) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }

    @RequestMapping("/selectById")
    @ApiOperation(value="根据主键查询轮播图",notes="轮播图接口3",httpMethod="POST",response= Shufflingfigure1Response.class)
    public Response selectShufflingById(@RequestBody IdRequest request) {
        Shufflingfigure shufflingfigure = shufflingService.selectById(request.getId());
        return new Shufflingfigure1Response(shufflingfigure) ;
    }

    @RequestMapping("/updateShufflingById")
    @ApiOperation(value="根据主键更新轮播图",notes="轮播图接口4",httpMethod="POST")
    public Response updateShufflingById(@RequestBody ShufflingfigureRequest1 request) throws Exception {
        Shufflingfigure shufflingfigure = new Shufflingfigure() ;
        Util.transferFields(request,shufflingfigure);
        shufflingfigure.setChgdt(new Date());
        shufflingfigure.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        shufflingService.updateShufflingById(shufflingfigure);
        return new RestfulResponse() ;
    }

    @RequestMapping("/insertShuffing")
    @ApiOperation(value="新增轮播图",notes="轮播图接口5",httpMethod="POST")
    public Response insertShuffing(@RequestBody ShufflingfigureRequest1 request) throws Exception {
        request.setId(Util.getID());
        Shufflingfigure shufflingfigure = new Shufflingfigure() ;
        Util.transferFields(request,shufflingfigure);
        shufflingfigure.setChgdt(new Date());
        shufflingfigure.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        shufflingService.insertShuffing(shufflingfigure);
        return new RestfulResponse() ;
    }

    @RequestMapping("/deleteShuffing")
    @ApiOperation(value="删除轮播图",notes="轮播图接口6",httpMethod="POST")
    public Response deleteShuffing(@RequestBody IdRequest request)  {
        request.getId() ;
        shufflingService.deleteShuffling(request.getId());
        return new RestfulResponse() ;
    }

    @RequestMapping("/editShuffing")
    @ApiOperation(value="启用停用轮播图",notes="轮播图接口7",httpMethod="POST")
    public Response editShuffing(@RequestBody ShufflingStatuReq req) {
        shufflingService.editShufflingStatu(req.getId() , req.getUseflg());
        return new RestfulResponse() ;
    }

}