package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.AreaResponse;
import com.grape.controller.reponse.ConstractBean;
import com.grape.controller.reponse.ConstractFormResponse;
import com.grape.controller.reponse.ConstractResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.ContractFormRequest;
import com.grape.controller.request.ContractRequest;
import com.grape.controller.request.ContractStateRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Area;
import com.grape.model.db.City;
import com.grape.model.db.Contract;
import com.grape.model.db.Organization;
import com.grape.model.db.Person;
import com.grape.service.CompanyService;
import com.grape.service.ContractService;
import com.grape.service.PersonService;
import com.grape.service.ProductAreaService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/constractManage")
public class ConstractController {
	@Autowired
	private ContractService contractService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private ProductAreaService productAreaService;
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("selectConstractList")
	@ApiOperation(value="查询合同列表信息",notes="查询合同信息接口",httpMethod="POST",response=ConstractResponse.class)
	public Response selectContractList(@RequestBody ContractRequest req){
		Integer pagenum = req.getPagenum();
		Integer pagestart = (req.getPagenum()-1)*(req.getPagesize()); 
		req.setPagenum(pagestart);
		List<ConstractBean> list = new ArrayList<ConstractBean>();
		list = contractService.selectContractInfo(req);
		Integer count = contractService.selectContractInfoCount(req);
		if(list!=null && list.size()>0){
			for(ConstractBean contract : list){
				String areaid = contract.getAera();
				String comno = contract.getChannelno();
				String chgtl = contract.getChgtl();
				Person person = personService.selectPersonByWorkerid(chgtl);
				Organization org = companyService.selectCompanyByOrgno(comno);
				City city = productAreaService.selectAreaNameById(areaid);
				if(org!=null){
					contract.setChanname(org.getOrganizationname());
				}
				if(city!=null){
					contract.setAera(city.getCityname());
				}
				if(person!=null){
					contract.setChgtl(person.getWorkername());
				}
			}
			return new ConstractResponse(list,pagenum,count);
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
		}
		
	}
	
	@RequestMapping("selectAreaInfo")
	@ApiOperation(value="查询所有存在的区域",notes="查询接口",httpMethod="POST",response=AreaResponse.class)
	private Response selectAreaInfo(){
		List<Area> list = contractService.selectAreaInfo();
		if(list!=null && list.size()>0){
			return new AreaResponse(list);
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
		}
		
		
	}
	
	@RequestMapping("insertContract")
	@ApiOperation(value="新增产品合同文书信息",notes="新增产品合同文书",httpMethod="POST",response=RestfulResponse.class)
	public Response insertContract(@RequestBody ContractFormRequest req){
		contractService.insertContract(req);
		
		return new RestfulResponse();
	}
	
	@RequestMapping("selectContractDetail")
	@ApiOperation(value="查询合同详细信息",notes="查询合同详细信息接口",httpMethod="POST",response=ConstractFormResponse.class)
	public Response selectContractDetail(@RequestBody IdRequest req){
		Contract contract = new Contract();
		contract = contractService.selectContractDetai(req);
		return new ConstractFormResponse(contract);
	}
	
	@RequestMapping("updateContract")
	@ApiOperation(value="更新产品合同文书信息",notes="更新产品合同文书",httpMethod="POST",response=RestfulResponse.class)
	public Response updateContract(@RequestBody ContractFormRequest req){
		contractService.updateContract(req);
		
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteContract")
	@ApiOperation(value="删除产品合同文书信息",notes="删除产品合同文书",httpMethod="POST",response=RestfulResponse.class)
	public Response deleteContract(@RequestBody IdRequest req){
		contractService.deleteContract(req);
		
		return new RestfulResponse();
	}
	
	@RequestMapping("updateContractState")
	@ApiOperation(value="激活产品合同文书信息状态",notes="激活产品合同文书信息状态",httpMethod="POST",response=RestfulResponse.class)
	public Response updateContractState(@RequestBody ContractStateRequest req){
		contractService.activeContract(req);
		
		return new RestfulResponse();
	}

}
