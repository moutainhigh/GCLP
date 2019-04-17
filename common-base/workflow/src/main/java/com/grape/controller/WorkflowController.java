package com.grape.controller;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.FlowCreateRequest;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.response.FlowCreateResponse;
import com.grape.controller.response.FlowHandleResponse;
import com.grape.model.db.Doctask;
import com.grape.model.db.Product;
import com.grape.model.db.Workitem;
import com.grape.service.DoctaskService;
import com.grape.service.PersonService;
import com.grape.service.ProductService;
import com.grape.service.SertalnoService;
import com.grape.workflow.ExecutionContext;
import com.grape.workflow.bean.Actor;
import com.grape.workflow.util.WorkUtil;
import com.grape.workflow.work.DocTaskWork;

@RestController
@RequestMapping("/workflow")
//@Validated
public class WorkflowController {
	
	private Logger logger = LoggerFactory.getLogger(WorkflowController.class);
	
	@Autowired
	private DocTaskWork docTaskWork;
	
	@Autowired
	private SertalnoService sertalnoService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private DoctaskService doctaskService;
	
	@Autowired
	private ProductService productService;
	
	@ApiOperation(value = "申请工作流水号",httpMethod="POST",notes="通过产品码申请工作流水号，申请成功后系统自动创建一笔空的新流程，流程进入第一个节点",response=FlowCreateResponse.class)
    @RequestMapping("/genWorkid")
    public RestfulResponse startProcess(@Validated @RequestBody FlowCreateRequest request) throws Exception{
		
		try{
			Actor actor = personService.getCurrentActor();
			
			Product product = productService.getProductById(request.getProductno());
			
			Doctask doctask = new Doctask();
			doctask.setWorkid(sertalnoService.genWorkid());
			doctask.setDepartmentno(actor.getDepartment().getDepartId());
			doctask.setAreaid(actor.getPerson().getCity());//产品所属区域(城市)
			doctask.setChannelno(actor.getPerson().getOrganizationid());//渠道机构编号
			doctask.setTerrcaeno("COM02");//平台机构编号 //TODO 需要从数据库或配置文件读取
			doctask.setFundno(product.getFundcomno());//资金方机构编号
			doctask.setAisleno(product.getAislecomno());//通道机构编号
			doctask.setSubsidycomno(product.getSubsidycomno());//兜底机构编号
			doctask.setUserid(actor.getUserid());
			doctask.setProductno(product.getProductno());
			doctask.setApplydate(new Date());
			doctask.setIntostate("1");
			doctask.setChgtl(actor.getUserid());
			doctask.setChgdt(new Date());
			
			ExecutionContext executionContext = new ExecutionContext(doctask);
			
			executionContext.setVariables(WorkUtil.getDataFromBean("doctask",doctask));
			executionContext.setVariable("doctask_data","Y");//标记已加载
			executionContext.setVariables(WorkUtil.getDataFromBean("product",product));
			executionContext.setVariable("product_data","Y");//标记已加载
			
			
			Workitem workitem = docTaskWork.startProcess(executionContext, product.getProductno(), actor,null);
			
			return new FlowCreateResponse(workitem.getWorkid(),workitem.getWorkproc().getProcess(),workitem.getNode(),executionContext.getLogid());
		}catch(Exception e){
			logger.info("流水操作失败", e);
			RestfulResponse response = new RestfulResponse();
			response.setCode(50001);
			response.setMessage(e.getMessage());
			return response;
		}
	}
	
	@ApiOperation(value = "流程处理",httpMethod="POST",notes="",response=FlowHandleResponse.class)
    @RequestMapping("/handle")
    public RestfulResponse flow(@Validated @RequestBody FlowHandleRequest request) throws Exception{
		
		try{
			Actor actor = personService.getCurrentActor();
			
			Actor nextActor = personService.getActor(request.getNextActor());
			
			Doctask doctask = doctaskService.getDocktaskById(request.getWorkid());
			Product product = productService.getProductById(request.getProcessid());//流程编号=产品编号
			ExecutionContext executionContext=null;
			if(doctask!=null){
				executionContext = new ExecutionContext(doctask);
			}
			executionContext.setNotation(request.getNotation());
			executionContext.setLogtype(request.getHisttype());
			
			executionContext.setVariables(WorkUtil.getDataFromBean("doctask",doctask));
			executionContext.setVariable("doctask_data","Y");//标记已加载
			executionContext.setVariables(WorkUtil.getDataFromBean("product",product));
			executionContext.setVariable("product_data","Y");//标记已加载
			
			Workitem workitem = docTaskWork.handle(executionContext, request.getNodeid(), request.getOperation(), actor,nextActor,request.getBackNodeid(),request.getBackflg());
			
			if("1".equals(doctask.getIntostate())){
				doctask.setIntostate(null);
				doctaskService.updateDoctask(doctask);
			}
			
			return new FlowHandleResponse(workitem.getWorkid(),workitem.getWorkproc().getProcess(),workitem.getNode(),executionContext.getLogid());
		}catch(Exception e){
			logger.info("流水操作失败", e);
			RestfulResponse response = new RestfulResponse();
			response.setCode(50001);
			response.setMessage(e.getMessage());
			return response;
		}
	}
	
}
