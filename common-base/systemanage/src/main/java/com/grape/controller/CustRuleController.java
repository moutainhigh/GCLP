package com.grape.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.CustruleResponse;
import com.grape.controller.reponse.CustruleResponse1;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.CustruleOptionRequest;
import com.grape.controller.request.CustruleRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Custrule;
import com.grape.model.db.Person;
import com.grape.service.CustruleService;
import com.grape.service.PersonService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/custrule")
public class CustRuleController {
    @Autowired
    private CustruleService custruleService ;
    
    @Autowired
    private PersonService personService;

    @RequestMapping("/selectAllCustrule")
    @ApiOperation(value="查询所有产品尽调配置",notes="产品尽调配置1",httpMethod="POST",response= CustruleResponse.class)
    public Response selectAllCustrule() {
        List<Custrule> custrules = custruleService.selectAllCustrule();
        if(!CollectionUtils.isEmpty(custrules)) {
            return new CustruleResponse(custrules,0,0) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }

    @RequestMapping("/selectByOption")
    @ApiOperation(value="按条件查询产品尽调配置",notes="产品尽调配置2",httpMethod="POST",response= CustruleResponse.class)
    public Response selectByOption(@RequestBody CustruleOptionRequest request) {
    	Integer pagenum = request.getPagenum();
    	Integer pagestart = (request.getPagenum()-1)*(request.getPagesize());
    	request.setPagenum(pagestart);
        List<Custrule> custrules = custruleService.selectByOption(request);
        Integer count = custruleService.selectByOptionCount(request);
        if(!CollectionUtils.isEmpty(custrules)) {
        	for(Custrule custrule : custrules){
        		String chgtl = custrule.getChgtl();
        		Person person = personService.selectPersonByWorkerid(chgtl);
        		if(person!=null){
        			custrule.setChgtl(person.getWorkername());
        		}
        	}
            return new CustruleResponse(custrules,pagenum,count) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }

    @RequestMapping("/selectById")
    @ApiOperation(value="根据主键查询产品尽调配置",notes="产品尽调配置3",httpMethod="POST",response= CustruleResponse1.class)
    public Response selectCustruleById(@RequestBody IdRequest request) {
        Custrule custrule = custruleService.selectById(request.getId());
        return new CustruleResponse1(custrule) ;
    }

    @RequestMapping("/updateCustruleById")
    @ApiOperation(value="根据主键更新产品尽调配置",notes="产品尽调配置4",httpMethod="POST")
    public Response updateSmsparamById(@RequestBody CustruleRequest request) {
        Custrule custrule = new Custrule() ;
        try {
            Util.transferFields(request,custrule);
        } catch (Exception e) {
            e.printStackTrace();
        }
        custrule.setChgtm(new Date());
        custrule.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        custruleService.updateCustruleById(custrule);
        return new RestfulResponse() ;
    }

    @RequestMapping("/insertCustrule")
    @ApiOperation(value="新增产品尽调配置",notes="产品尽调配置5",httpMethod="POST")
    public Response insertSmsparam(@RequestBody CustruleRequest request) {
        Custrule custrule = new Custrule() ;
        try {
            Util.transferFields(request,custrule);
        } catch (Exception e) {
            e.printStackTrace();
        }
        custrule.setChgtm(new Date());
        custrule.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        custruleService.insertCustrule(custrule);
        return new RestfulResponse() ;
    }

    @RequestMapping("/deleteCustrule")
    @ApiOperation(value="删除产品尽调配置",notes="产品尽调配置6",httpMethod="POST")
    public Response deleteCustrule(@RequestBody IdRequest request)  {
        request.getId() ;
        custruleService.deleteCustrule(request.getId());
        return new RestfulResponse() ;
    }
}
