package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.ImageBean1;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.WorkflowForeign;
import com.grape.controller.reponse.DilimortgageResponse;
import com.grape.controller.reponse.DilimortgageResponse1;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.DelimortRequest;
import com.grape.controller.request.FlowHandleRequest;
import com.grape.controller.request.IdAndNodeidRequest;
import com.grape.controller.request.WorkidAndNodeRequest;
import com.grape.controller.request.WorkidAndNodeidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Delimortgage;
import com.grape.model.db.Doctask;
import com.grape.model.db.Workhistory;
import com.grape.model.db.Workitem;
import com.grape.service.DelimortgageService;
import com.grape.service.DoctaskService;
import com.grape.service.ImageService;
import com.grape.service.WorkitemService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/delimortgage")
public class DelimortgageController {
	@Autowired
	private DelimortgageService delimortgageService;
	@Autowired
	private ImageService imageService;
	@Autowired
	private DoctaskService doctaskService;
	@Autowired
	private WorkitemService workitemService;
	@Autowired
	private WorkflowForeign workflowfeign;

	@RequestMapping("/queryDelimortgageById")
	@ApiOperation(value="通过id查询尽职调查抵押物信息",httpMethod="POST",notes="抵押物查询第一个接口",response=DilimortgageResponse.class)
	public Response queryDelimortgageById(@RequestBody IdAndNodeidRequest req){
		Delimortgage deli = new Delimortgage();
		List<List<ImageBean1>> imagelist = new ArrayList<List<ImageBean1>>();
		deli = delimortgageService.queryDelimortgageById(req.getId());
		WorkidAndNodeidRequest request = new WorkidAndNodeidRequest();
		if(deli!=null){
			Doctask doctask = doctaskService.queryByWorkid(deli.getWorkid());
			String productno="";
			if(doctask.getProductno()!=null){
				productno=doctask.getProductno();
			}
			request.setProductno(productno);
			request.setWorkid(deli.getWorkid());
			request.setNodeid(req.getNodeid());
			List<ImageBean1> list = imageService.selectImageByWorkidAndNodeid1(request,req);
			if(list!=null){
				List<String> typrelist= new ArrayList<String>();
				for(int i=0;i<list.size();i++){
					if(!typrelist.contains(list.get(i).getImagetype())){
						typrelist.add(list.get(i).getImagetype());
					}
				}
				for(int j=0;j<typrelist.size();j++){
					List<ImageBean1> listbean = new ArrayList<ImageBean1>();
					for(int k=0;k<list.size();k++){
						if(list.get(k).getImagetype().equals(typrelist.get(j))){
							listbean.add(list.get(k));
						}
					}
					imagelist.add(listbean);
				}
			}
			return new DilimortgageResponse(deli,imagelist);
		}
		return new DilimortgageResponse(deli,imagelist);
	}

	@RequestMapping("/queryAllDelimortgage")
	@ApiOperation(value="查询所有尽职调查抵押物信息",httpMethod="POST",notes="抵押物查询第二个接口",response=DilimortgageResponse.class)
	public Response queryAllDelimortgage(){
		List<Delimortgage> list = delimortgageService.queryAllDelimortgage(0,10);
		if(!list.isEmpty()){
			return new DilimortgageResponse1(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}

	@RequestMapping("/queryDelimortgageByWorkid")
	@ApiOperation(value="通过申请编号查询尽职调查抵押物信息",httpMethod="POST",notes="抵押物查询第三个接口",response=DilimortgageResponse.class)
	public Response queryDelimortgageByWorkid(@RequestBody WorkidRequest req){
		List<Delimortgage> list = delimortgageService.queryDelimortgageByWorkid(req.getWorkid());
		if(!list.isEmpty()){
			return new DilimortgageResponse1(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}

	@RequestMapping("/insertDelimort")
	@ApiOperation(value="新增尽职调查抵押物信息",httpMethod="POST",notes="抵押物第四个接口",response=DilimortgageResponse.class)
	public Response insertDelimort(@Validated @RequestBody DelimortRequest req){
		/*FlowHandleRequest handlereq=workflowService.selectWorkflow(req.getWorkid(),req.getNodeid());
		handlereq.setHisttype("15");
		handlereq.setActor(req.getUserid());
		handlereq.setNotation("");
		handlereq.setNextActor("");
		handlereq.setOperation(req.getOperation());
		if(!req.getOperation().equals("保存")){
			workflowfeign.handle(handlereq);
		}*/
		Delimortgage deli = delimortgageService.queryDelimortgageById(req.getId());
		if(deli!=null){
			delimortgageService.updateDelimort(req);
		}else{
			delimortgageService.insertDelimort(req);
		}
		return new RestfulResponse();
	}
	
/*	@ApiOperation(value="查询下戶盡調节点附件",notes="查询下戶盡調的第二个接口",httpMethod="POST",response=ImageResponse.class)
	@RequestMapping("/selectImageByWorkidAndNodeid1")
	public Response selectImageByWorkidAndNodeid1(@RequestBody WorkidAndNodeidRequest req){
		Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
		String productno="";
		if(doctask.getProductno()!=null){
			productno=doctask.getProductno();
		}
		req.setProductno(productno);
		List<ImageBean1> list = imageService.selectImageByWorkidAndNodeid1(req);
		if(list!=null){
			List<List<ImageBean1>> imagelist = new ArrayList<List<ImageBean1>>();
			List<String> typrelist= new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				if(!typrelist.contains(list.get(i).getFiletype())){
					typrelist.add(list.get(i).getFiletype());
				}
			}
			for(int j=0;j<typrelist.size();j++){
				List<ImageBean1> listbean = new ArrayList<ImageBean1>();
				for(int k=0;k<list.size();k++){
					if(list.get(k).getFiletype().equals(typrelist.get(j))){
						listbean.add(list.get(k));
					}
				}
				imagelist.add(listbean);
			}
			return new ImageResponse(imagelist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}*/

	@RequestMapping("/updateDelimort")
	@ApiOperation(value="修改尽职调查抵押物信息",httpMethod="POST",notes="抵押物第五个接口",response=DilimortgageResponse.class)
	public Response updateDelimort(@Validated @RequestBody DelimortRequest req){
		delimortgageService.updateDelimort(req);
		return new RestfulResponse();
	}

	@RequestMapping("/deleteDelimort")
	@ApiOperation(value="删除改尽职调查抵押物信息",httpMethod="POST",notes="抵押物第六个接口",response=DilimortgageResponse.class)
	public Response deleteDelimort(@RequestParam("id") String id){
		delimortgageService.deleteDelimort(id);
		return new RestfulResponse();
	}

	@RequestMapping("/backDeli")
	@ApiOperation(value="质检不通过接口",httpMethod="POST",notes="质检所调接口",response=FlowHandleResponse.class)
	public Response backDeli(@Validated @RequestBody FlowHandleRequest request){
		String nodeid = request.getNodeid();
		String operation = request.getOperation();
		String fork = "";
		//如果质检不通过需要删除分支流程
		if(operation!=null && "质检不通过".equals(operation)){
			WorkidAndNodeRequest req = new WorkidAndNodeRequest();
			req.setNodeid(request.getNodeid());
			req.setWorkid(request.getWorkid());
			//获取分支流程的流程fork
			List<Workitem> workitems = workitemService.selectByNodeAndWorkid(req);
			if(workitems!=null && !workitems.isEmpty()){
				fork = workitems.get(0).getFork();
				//删除分支流程
				workitemService.deleteWorkitemByFromAndWorkid(fork,request.getWorkid());
				//删除尽调抵押物信息
                //delimortgageService.deleteByExample(request.getWorkid());
                //删除尽调申请人信息
                //delimortgageService.deleteDeliCustinfoByExample(request.getWorkid());
				WorkidAndNodeRequest req2 = new WorkidAndNodeRequest();
				req2.setNodeid(fork);
				req2.setWorkid(request.getWorkid());
				List<Workitem> workitemlist = workitemService.selectByNodeAndWorkid(req2);
				//查找出是由哪个节点引发的分支
				if(workitemlist!=null && !workitemlist.isEmpty()){
					Workitem workitem = workitemlist.get(0);
					Workhistory workhistory = workitemService.selectByNextNodeid(fork);
					if(workhistory!=null){
						String nodeid1 = workhistory.getNode();
						workitem.setNode(nodeid1);
						//将原生成分支的主干还原为预约面签或预约下户
						workitemService.updateWorkItemSelective(workitem);
					}
				}
			}
		}else{
			FlowHandleResponse res = new FlowHandleResponse();
			res = workflowfeign.handle(request);
			if (res.getCode() != 20000) {
				return res;
			}
		}
		return new RestfulResponse();
	}
}
