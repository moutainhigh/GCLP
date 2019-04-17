package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.feigncontroller.HomeFeign;
import com.grape.controller.reponse.DeliAndRefundResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.HaveRoleChooseResponse;
import com.grape.controller.reponse.NodeButtonResponse;
import com.grape.controller.reponse.NodePageResponse;
import com.grape.controller.reponse.PersonResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.NodeidAndProductnoRequest;
import com.grape.controller.request.NodepageBean;
import com.grape.controller.request.WorkidAndNodeidOperationRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.response.bean.Roleinfo;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Custinfo;
import com.grape.model.db.Doctask;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.Productnode;
import com.grape.model.db.Redemptiontype;
import com.grape.model.db.Rolemenu;
import com.grape.service.ApplyinfoOfComService;
import com.grape.service.CustinfoService;
import com.grape.service.DoctaskService;
import com.grape.service.NodePageService;
import com.grape.service.RedemptiontypeService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("nodepage")
public class NodePageController {
	@Autowired
	private NodePageService nodePageService;
	@Autowired
	private CustinfoService custinfoService;
	@Autowired
	private ApplyinfoOfComService applyinfoOfComService;
	@Autowired
	private RedemptiontypeService redemptiontypeService;
	@Autowired
	private DoctaskService doctaskService;
	@Autowired
	private HomeFeign homeFeign;
	@ApiOperation(value="根据节点查询节点所拥有的页面",notes="节点页面查询的第一个接口",response=NodePageResponse.class,httpMethod="POST")
	@RequestMapping("selectPageByNode")
	public Response selectPageByNode(@RequestBody NodeidAndProductnoRequest req){
		List<NodepageBean> list = nodePageService.selectNodepageByNode(req);
		Productnode productnode = nodePageService.selectNodeinfo(req.getNodeid());
		String stage = productnode.getStage();
		String state = req.getState();
		if("0".equals(state) || Util.isBlank(state)){//待办
			if(list!=null){
				return new NodePageResponse(list,stage);
			}
		}else if("1".equals(req.getState())){//流水
			List<NodepageBean> nodelist = new ArrayList<NodepageBean>();
			PersonResponse person=homeFeign.personinfo();
			List<Roleinfo> rolelist = person.getPersoninfo().getRoleinfos();
			List<String> roleidlist = new ArrayList<String>();
			List<String> pageidlist = new ArrayList<String>();
			List<String> rolepageidlist = new ArrayList<String>();
			//List<String> finallist = new ArrayList<String>();
			//取出该用户所拥有的角色
			for(int i=0;i<rolelist.size();i++){
				roleidlist.add(rolelist.get(i).getRoleid());
			}
			List<Rolemenu> pagelist = nodePageService.selectRolemenu(roleidlist);
			//取出节点所拥有的页面
			for(int j=0;j<list.size();j++){
				pageidlist.add(list.get(j).getPageid());
			}
			//重复的页面只保留一条，取出角色所能看到的页面
			for(int k=0;k<pagelist.size();k++){
				if(!rolepageidlist.contains(pagelist.get(k).getMenuid())){
					rolepageidlist.add(pagelist.get(k).getMenuid());
				}
			}
			/*//取出在该节点该用户能看到的页面
			for(int l=0;l<rolepageidlist.size();l++){
				if(pageidlist.contains(rolepageidlist.get(l))){
					finallist.add(rolepageidlist.get(l));
				}
			}*/
			//得到最终该用户在流水上能看到的页面实体
			for(int m=0;m<list.size();m++){
				for(int n=0;n<rolepageidlist.size();n++){
					if(list.get(m).getPageid().equals(rolepageidlist.get(n))){
						nodelist.add(list.get(m));
					}
				}
			}
			return new NodePageResponse(nodelist,stage);
		}
		
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="根据节点查询节点所拥有的操作按钮",notes="节点按钮接口",response=NodeButtonResponse.class,httpMethod="POST")
	@RequestMapping("selectPageByButton")
	public Response selectPageByButton(@RequestBody NodeidAndProductnoRequest req){
		List<Nodebutton> list = nodePageService.selectNodeButtonByNode(req);
		String returnflg = nodePageService.selectReturnflg(req);
		if(!list.isEmpty()){
			/*if(returnflg!=null){
				Nodebutton node = new Nodebutton();
				node.setId("RT001");
				node.setName("归还任务");
				list.add(node);
			}*/
			//复议需要判断是否需要将复议按钮显示，如果复议过就不显示了
			for(int i=0;i<list.size();i++){
				if(list.get(i).getName().equals("复议")){
					Doctask doc = new Doctask();
					doc= doctaskService.queryByWorkid(req.getWorkid());
					String state = doc.getState();
					if(state!=null && "1".equals(state)){
						//将复议按钮移除
						list.remove(list.get(i));
						break;
					}
				}
			}
			
			boolean checkpersonflg = nodePageService.selectNextNodeByButton(req);
			return new NodeButtonResponse(list,checkpersonflg);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="查询是否需要选人",notes="是否需要选人",httpMethod="POST",response=HaveRoleChooseResponse.class)
	@RequestMapping("/selectapprovalperson")
	public Response selectapprovalperson(@RequestBody WorkidAndNodeidOperationRequest req){
		Boolean chooseflg=true;
		chooseflg=nodePageService.selectHaveChoose(req);
		return new HaveRoleChooseResponse(chooseflg);
	}
	@ApiOperation(value="app端判断风控报告需要哪些page",httpMethod="POST",response=DeliAndRefundResponse.class,notes="APP端专用判断风控信息页面接口")
	@RequestMapping("/selectApppageByworkidAndNode")
	public Response selectApppageByworkidAndNode(@RequestBody WorkidRequest req){
		List<Custinfo> custlist = custinfoService.querybyworkid(req);
		List<Applyinfoofcom> applylist = applyinfoOfComService.queryByWorkid(req.getWorkid());
		boolean havediliperson = false;
		boolean haverefundflg = false;
		boolean phoneflg = false;
		Doctask doctask = doctaskService.queryByWorkid(req.getWorkid());
		if(doctask!=null && doctask.getProductno()!=null){
			if(doctask.getProductno().contains("SLD") || doctask.getProductno().equals("ZQ001")){
				haverefundflg=true;
				phoneflg=false;
			}else{
				phoneflg=true;
			}
		}
		//判断自然人是否有担保人信息
		if(custlist!=null && !custlist.isEmpty()){
			for(int i=0;i<custlist.size();i++){
				if(custlist.get(i).getCusttype().contains("3")){
					havediliperson=true;
					break;
				}
			}
		}
		//判断法人是否有担保人
		if(applylist!=null && !applylist.isEmpty()){
			for(int j=0;j<applylist.size();j++){
				if(applylist.get(j).getApplyertype().contains("3")){
					havediliperson=true;
					break;
				}
			}
		}
		/*Redemptiontype refund = redemptiontypeService.findRedemptiontypeByWorkid(req.getWorkid());
		if(refund!=null){
			haverefundflg=true;
		}*/
		return new DeliAndRefundResponse(havediliperson,haverefundflg,phoneflg);
	}
}
