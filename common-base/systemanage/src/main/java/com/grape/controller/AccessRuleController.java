package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.AccessRuleResponse;
import com.grape.controller.reponse.AccessRuleResponse1;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.AccessRuleFormRequest;
import com.grape.controller.request.AccessRuleRequest;
import com.grape.controller.request.AccessRuleStateRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Accessrule;
import com.grape.model.db.Codetable;
import com.grape.model.db.Person;
import com.grape.service.AccessRuleService;
import com.grape.service.CodetableService;
import com.grape.service.PersonService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/accessRuleManage")
public class AccessRuleController {
	
	@Autowired
	private AccessRuleService accessRuleService;
	
	@Autowired
	private CodetableService codetableService;
	
	@Autowired
	private PersonService personService;

	@RequestMapping("/selectAccessRule")
	@ApiOperation(value="根据筛选条件查询产品规则",notes="查询产品规则的第一个接口",httpMethod="POST",response=AccessRuleResponse.class)
	public Response selectAccessRule(@RequestBody AccessRuleRequest req){
		Integer pagenum = req.getPagenum();
		Integer pagestart = (req.getPagenum()-1)*(req.getPagesize());
		req.setPagenum(pagestart);
		List<Accessrule> accessRules = new ArrayList<Accessrule>();
		accessRules = accessRuleService.selectAccessRule(req);
		Integer count = accessRuleService.selectAccessRuleCount(req);
		if(accessRules!=null && accessRules.size()>0){
			for(Accessrule accessrule : accessRules){
				String ruletypeflg = accessrule.getRulestype();
				String codtype = "RULETYPE";
				Codetable codetable1 = codetableService.selectCodetableByCodtypAndflg(ruletypeflg, codtype);
				if(codetable1!=null){
					accessrule.setRulestype(codetable1.getCoddes());
				}
				String code = "ADMITTANCETYPE";
				String chgtl = accessrule.getChgtl();
				Person person = personService.selectPersonByWorkerid(chgtl);
				if(person!=null){
					accessrule.setChgtl(person.getWorkername());
				}
				String type = accessrule.getAdmittancetype();
				Codetable codetable = codetableService.selectCodetableByCodtypAndflg(type, code);
				if(codetable!=null){
					accessrule.setAdmittancetype(codetable.getCoddes());
				}
			}
			return new AccessRuleResponse(accessRules,pagenum,count);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/insertRule")
	@ApiOperation(value="新增产品规则",notes="新增产品规则",httpMethod="POST",response=RestfulResponse.class)
	public Response insertRule(@RequestBody AccessRuleFormRequest req){
		accessRuleService.insertAccessRule(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/deleteAccessRule")
	@ApiOperation(value="删除产品规则的第一个接口",notes="删除产品规则接口",httpMethod="POST",response=RestfulResponse.class)
	public Response deleteAccessRule(@RequestBody IdRequest req){
		accessRuleService.deleteAccessRule(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectAccessRuleById")
	@ApiOperation(value="根据规则的id查询规则的详细信息",notes="查询规则详细信息的第二个接口",httpMethod="POST",response=AccessRuleResponse1.class)
	public Response selectAccessRuleById(@RequestBody IdRequest req){
		Accessrule accessrule = accessRuleService.selectAccessRuleById(req);
		if(accessrule!=null){
			return new AccessRuleResponse1(accessrule);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/updateAccessRuleById")
	@ApiOperation(value="根据规则主键更新规则信息",notes="更新规则信息",httpMethod="POST",response=RestfulResponse.class)
	public Response updateAccessRuleById(@RequestBody AccessRuleFormRequest req){
		accessRuleService.updateAccessRule(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("activeAccessRule")
	@ApiOperation(value="激活或去激活该条产品规则",notes="激活接口",httpMethod="POST",response=RestfulResponse.class)
	public Response activeAccessRule(@RequestBody AccessRuleStateRequest req){
		accessRuleService.activeAccessRule(req);
		return new RestfulResponse();
	}
	
}
