package com.grape.controller;

import java.util.Date;
import java.util.List;

import com.grape.controller.request.SmsParamEditRequest;
import com.grape.util.ValidateCodeUtil;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.SmsparamResponse;
import com.grape.controller.reponse.SmsparamResponse1;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.SmsParamRequest;
import com.grape.controller.request.SmsparamOptionRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.Person;
import com.grape.model.db.Smsparam;
import com.grape.service.CodetableService;
import com.grape.service.PersonService;
import com.grape.service.SmsparamService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/smsparam")
public class SmsparamController {
    @Autowired
    private SmsparamService smsparamService ;
    
    @Autowired
    private CodetableService codetableService;
    
    @Autowired
    private PersonService personService;

    @RequestMapping("/selectAllSmsparam")
    @ApiOperation(value="查询所有短信模板",notes="短信模板接口1",httpMethod="POST",response= SmsparamResponse.class)
    public Response selectAllSmsparam() {
        List<Smsparam> smsparams = smsparamService.selectAllSmsparam();
        if(!CollectionUtils.isEmpty(smsparams)) {
            return new SmsparamResponse(smsparams,0,0) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }

    @RequestMapping("/selectByOption")
    @ApiOperation(value="按条件查询短信模板",notes="短信模板接口2",httpMethod="POST",response= SmsparamResponse.class)
    public Response selectByOption(@RequestBody SmsparamOptionRequest request) {
        List<Smsparam> smsparams = smsparamService.selectByOption(request);
        Integer count = smsparamService.selectByOptionCount(request);
        if(!CollectionUtils.isEmpty(smsparams)){
        	//将发送类型和最后修改人转码
        	for(Smsparam smsparam : smsparams){
        		Person person = personService.selectPersonByWorkerid(smsparam.getChgtl());
        		if(!StringUtils.isEmpty(person)){
        			smsparam.setChgtl(person.getWorkername());
        		}
        		Codetable codetable  = codetableService.selectCodetableByCodtypAndflg(smsparam.getSendtype(),"MSGTYPE");
        		if(!StringUtils.isEmpty(codetable)){
        			smsparam.setSendtype(codetable.getCoddes());
        		}
        	}
            return new SmsparamResponse(smsparams,request.getPagenum(),count) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }

    @RequestMapping("/selectById")
    @ApiOperation(value="根据主键查询短信模板",notes="短信模板接口3",httpMethod="POST",response= SmsparamResponse1.class)
    public Response selectSmsparamById(@RequestBody IdRequest request) {
        Smsparam smsparamS = smsparamService.selectById(request.getId());
        return new SmsparamResponse1(smsparamS) ;
    }

    @RequestMapping("/updateSmsparamById")
    @ApiOperation(value="根据主键更新短信模板",notes="短信模板接口4",httpMethod="POST")
    public Response updateSmsparamById(@RequestBody SmsParamRequest request) {
        Smsparam smsparam = new Smsparam() ;
        try {
            Util.transferFields(request,smsparam);
            smsparam.setChgdt(new Date());
            smsparam.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        smsparamService.updateSmsparamById(smsparam);
        return new RestfulResponse() ;
    }
    
    @RequestMapping("/insertSmsparam")
    @ApiOperation(value="新增短信模板",notes="短信模板接口5",httpMethod="POST")
    public Response insertSmsparam(@RequestBody SmsParamRequest request) {
        Smsparam smsparam = new Smsparam() ;
        try {
            Util.transferFields(request,smsparam);
            smsparam.setId(Util.getID());
            smsparam.setChgdt(new Date());
            smsparam.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        smsparamService.insertSmsparam(smsparam);
        return new RestfulResponse() ;
    }


    @RequestMapping("/deleteSmsparam")
    @ApiOperation(value="删除短信模板",notes="短信模板接口6",httpMethod="POST")
    public Response deleteSmsparam(@RequestBody IdRequest request)  {
        request.getId() ;
        smsparamService.deleteSmsparam(request.getId());
        return new RestfulResponse() ;
    }

  /*  @RequestMapping("/update")*/
    @RequestMapping("/editSmsparam")
    @ApiOperation(value="激活短信模板" , httpMethod="POST")
    public Response editSmsparam(@RequestBody SmsParamEditRequest request) {
        smsparamService.editSmsparam(request.getId() , request.getUseflg());
        return new RestfulResponse() ;
    }

}
