package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.CompanyResponse;
import com.grape.controller.reponse.CompanyResponse2;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.ComTypeRequest;
import com.grape.controller.request.ComnoRequest;
import com.grape.controller.request.CompanyRequest;
import com.grape.model.db.Organization;
import com.grape.model.db.Person;
import com.grape.service.CompanyService;
import com.grape.service.PersonService;

import StatusCode.MessageDetail;
import io.swagger.annotations.ApiOperation;

/** 
* @author cwc
* @version 创建时间：2019年3月11日 下午3:17:48  
*/
@RestController
@RequestMapping("CompanyManager")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/insertCompany")
	@ApiOperation(value="新增公司信息的接口",notes="新增公司接口一",httpMethod="POST",response=RestfulResponse.class)
	public Response insertCompany(@RequestBody CompanyRequest companyRequest){
		String organizationno = companyRequest.getOrganizationno();
		Organization org = companyService.selectCompanyByOrgno(organizationno);
		if(org==null){
			companyService.insertCompany(companyRequest);
		}else{
			return new ErrorEntity(StatusCode.UNKNOWED_ERROR);
		}
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectCompanyInfo")
	@ApiOperation(value="查询所有公司列表接口",notes="查询公司接口一",httpMethod="POST",response=CompanyResponse.class)
	public Response selectCompanyInfo(){
		List<Organization> orgs = new ArrayList<Organization>();
		orgs = companyService.selectAllOrganization();
		if(orgs!=null && !orgs.equals("")){
			return new CompanyResponse(orgs);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/selectCompanyInfoByComno")
	@ApiOperation(value="查询公司详细信息接口",notes="查询公司接口二",httpMethod="POST",response=CompanyResponse.class)
	public Response selectCompanyInfoByComno(@RequestBody ComnoRequest req){
		Organization org = new Organization();
		org = companyService.selectCompanyByOrgno(req.getOrganizationno());
		if(org!=null && !org.equals("")){
			return new CompanyResponse2(org);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/selectCompanyInfoByOrgtype")
	@ApiOperation(value="根據公司所属类型查询对应的公司列表",notes="查询公司接口一",httpMethod="POST",response=CompanyResponse.class)
	public Response selectCompanyInfoByOrgtype(@RequestBody ComTypeRequest req){
		List<Organization> orgs = new ArrayList<Organization>();
		orgs = companyService.selectOrganizationByType(req);
		if(orgs!=null && !orgs.equals("")){
			return new CompanyResponse(orgs);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/deleteCompany")
	@ApiOperation(value="删除公司接口",notes="删除公司接口一",httpMethod="POST",response=RestfulResponse.class)
	public Response deleteCompanyByComno(@RequestBody ComnoRequest req){
		String comno = req.getOrganizationno();
		List<Person> list = personService.selectPersonByComno(comno);
		//如果公司下还存在除系统管理员外的其他用户，不能删除公司信息
		if(list!=null && list.size()>1){
			new ErrorEntity(StatusCode.UNKNOWED_ERROR,MessageDetail.EXISTPERSONINORG);
		}
		companyService.deleteCompanyByComno(comno);
		return new RestfulResponse();
	}
	
	@RequestMapping("/updateCompany")
	@ApiOperation(value="更新公司接口",notes="更新公司接口一",httpMethod="POST",response=RestfulResponse.class)
	public Response updateCompany(@RequestBody CompanyRequest req){
		String organizationno = req.getOrganizationno();
		String telnum = req.getTelnumber();
		companyService.updateOrganication(req);
		Organization org = companyService.selectCompanyByOrgno(organizationno);
		//如果公司电话号码更改了需要更新管理员账号的电话号码
		if(org!=null && telnum!=null){
			String tel = org.getTelnumber();
			if(!tel.equals(telnum)){
				personService.updatePersonInfoByWorkeridAndComno(req);
			}
		}
		return new RestfulResponse();
	}
	
}
