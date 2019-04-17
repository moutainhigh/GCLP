package com.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.ExceptLoanResponse;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.ProductResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.ExceptHaveornotRequest;
import com.grape.controller.request.ExpectloaninfoRequest;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.ProductnoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Exceptloaninfo;
import com.grape.model.db.Product;
import com.grape.service.ExpectloaninfoService;
import com.grape.service.WorkflowService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/expectloaninfo")
public class ExceptLoanController {
	@Autowired
	private ExpectloaninfoService expectloaninfoService;
	@Autowired
	private WorkflowForeign workflowfeign;
	@Autowired
	private WorkflowService workflowService;
	
	@ApiOperation(value="根据申请编号查询期待贷款申请信息",notes="期待贷款申请信息接口一",httpMethod="POST",response=ExceptLoanResponse.class)
	@RequestMapping("queryExpectloanByWorkid")
	public Response queryExpectloanByWorkid(@RequestBody WorkidRequest req){
		Exceptloaninfo list = expectloaninfoService.queryAssetByWorkid(req);
		if(list!=null){
			return new ExceptLoanResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("insertExpectloaninfo")
	@ApiOperation(value="插入期待贷款申请信息",notes="期待贷款申请信息接口二",httpMethod="POST",response=ExceptLoanResponse.class)
	public Response insertExpectloaninfo(@RequestBody ExpectloaninfoRequest req){
		Exceptloaninfo list = expectloaninfoService.queryAssetByWorkid(req.getWorkid());
		if(list!=null){
			expectloaninfoService.updateExpectloaninfo(req);
		}else{
			expectloaninfoService.insertExpectloaninfo(req);
		}
		
		return new RestfulResponse();
	}
	
	@RequestMapping("updateExpectloaninfo")
	@ApiOperation(value="更新期待贷款申请信息",notes="期待贷款申请信息接口三",httpMethod="POST",response=ExceptLoanResponse.class)
	public Response updateExpectloaninfo(@RequestBody ExpectloaninfoRequest req){
		expectloaninfoService.updateExpectloaninfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("deleteExpectloaninfo")
	@ApiOperation(value="根据主键workid删除期待贷款申请信息",notes="期待贷款申请信息接口四",httpMethod="POST",response=ExceptLoanResponse.class)
	public Response deleteExpectloaninfo(@RequestBody WorkidRequest req){
		expectloaninfoService.deleteExpectloaninfo(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectRepayMethod")
	@ApiOperation(value="查询产品还款方式",notes="期待贷款申请信息接口三",httpMethod="POST",response=ProductResponse.class)
	public Response selectRepayMethod(@RequestBody ProductnoRequest req){
		Product product = expectloaninfoService.selectRepayMethod(req);
		if(product!=null){
			return new ProductResponse(product);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/selectExceptHaveornot")
	@ApiOperation(value="查询是否有期待贷款",notes="期待贷款申请信息接口四",httpMethod="POST",response=ExceptLoanResponse.class)
	public Response exceptHaveornot(@RequestBody ExceptHaveornotRequest req){
		Exceptloaninfo exceptloaninfo = expectloaninfoService.queryAssetByWorkid(req.getWorkid());
		if(exceptloaninfo!=null){
			String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid());
			FlowHandleResponse res = new FlowHandleResponse();
			handlereq.setHisttype("");
			handlereq.setActor(userid);
			handlereq.setNotation("");
			handlereq.setNextActor("");
			handlereq.setOperation(req.getOperation());
			if(!req.getOperation().equals("提交")){
				res=workflowfeign.handle(handlereq);
			}
			return new RestfulResponse();
		}
		return new ErrorEntity(StatusCode.NO_EXCEPTERROR);
	}
	
}
