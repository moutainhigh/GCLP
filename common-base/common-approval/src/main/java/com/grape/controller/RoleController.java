package com.grape.controller;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RoleResponse;
import com.grape.controller.request.*;
import com.grape.model.db.*;
import com.grape.service.*;
import com.grape.service.impl.ApplyforexServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController{
	private final static Logger log = LoggerFactory.getLogger(ApplyforexServiceImpl.class);

	@Autowired
	private RoleService roleService ;
	@Autowired
	private ProductnodeService productnodeService ;
	@Autowired
	private DoctaskService doctaskService ;
	@Autowired
	private ExceptloaninfoService exceptloaninfoService ;
	@Autowired
	private WorkitemService workitemSerivce ;
	
/*	@ApiOperation(value="根据userid查询信息",notes="接口",response=RoleResponse.class,httpMethod="POST")
	@RequestMapping("selectByRoleid")
	public Response selectByRoleid(@RequestParam String roleid) {	
		List<RoleBean> list = roleService.selectByRoleid(roleid) ;
		if(list != null) {
			return new RoleResponse(list) ;
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}*/
	
	@ApiOperation(value="根据userid查询信息",notes="接口",response=RoleResponse.class,httpMethod="POST")
	@RequestMapping("selectByRoleid")
	public Response selectByRoleid(@RequestBody NodeidAndNameRequest req) {
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		
		Doctask doctask = doctaskService.queryByWorkid(req.getWorkid()) ;
		StringBuffer nextnodeid = new StringBuffer();
		List<Productnode> nodeid = productnodeService.selectByNodeid(req.getNodeid()) ;
		AuthorizationRequest authereq = new AuthorizationRequest() ;
		authereq.setUserid(userid);
		ForwardRequest foreq = new ForwardRequest() ;
		foreq.setUserid(userid);
		if(null != nodeid && nodeid.get(0).getAssigntagnode() != null) {
			nextnodeid.append(nodeid.get(0).getAssigntagnode()) ;
		}else {
			if("" != req.getName() ) {


//				if (null != req.getName() || req.getName().length() > 0) {
					if (req.getName().equals("授权")) {
						if (doctask != null) {
							authereq.setNodeid(req.getNodeid());
							authereq.setArerid(doctask.getAreaid());
							authereq.setProductno(doctask.getProductno());
							authereq.setChannelno(doctask.getChannelno());
							authereq.setUserid(userid);
							List<RoleBean> authorization = roleService.authorization(authereq);
							return new RoleResponse(authorization);
						}
					} else if (req.getName().equals("转办")) {
						if (doctask != null) {
							foreq.setNodeid(req.getNodeid());
						 	foreq.setArerid(doctask.getAreaid());
							foreq.setProductno(doctask.getProductno());
							foreq.setChannelno(doctask.getChannelno());
							foreq.setUserid(userid);
							List<RoleBean> forward = roleService.forward(foreq);
							/*forward.addAll(authorization) ;*/
							return new RoleResponse(forward);
						}
					} else if (req.getName().equals("退回")) {
							SendBackRequest sendReq = new SendBackRequest();
							sendReq.setNodeid(req.getNodeid());
							sendReq.setWorkid(req.getWorkid());
							sendReq.setProductno(doctask.getProductno());
							sendReq.setWorkid(req.getWorkid());
						List<RoleBean> sendback = roleService.sendback(sendReq);
						List<Productnode> productnodeList = productnodeService.selectByNodeid(req.getNodeid());
						if(productnodeList.get(0).getNodename().equals("资金方一级审批")) {
							sendback.add(new RoleBean("渠道进件", doctask.getProductno() + "07"));
						}
							return new RoleResponse(sendback);
					}
					List<Nodebutton> list = roleService.selectByNodeidAndName(req);
					if (list.size() > 0 && !list.isEmpty()) {
						nextnodeid.append(list.get(0).getNextnode());
					}
				} else {
					List<Nodebutton> list = roleService.selectByNodeid(req.getNodeid());
					if (list.size() > 0 && !list.isEmpty()) {
						for (Nodebutton nodebutton : list) {
							if (nodebutton.getName().equals("确定") || nodebutton.getName().equals("提交")) {
								nextnodeid.append(nodebutton.getNextnode());
								log.info("----------------------------------------------------------------");
							}
						}
					}
				}
			}


		
		Exceptloaninfo exceptloaninfo = exceptloaninfoService.querybyWorkid(req.getWorkid()) ;
		RoleBeanRequest request = new RoleBeanRequest() ;	
		NodeidRequest nodeReq = new NodeidRequest() ;
		nodeReq.setNodeid(req.getNodeid());

		log.info("************************************************************选人" + nextnodeid);
		String workerid ;
			if(doctask != null && exceptloaninfo != null) {
				request.setNodeid(nextnodeid.toString());
				request.setArerid(doctask.getAreaid());
				request.setProductno(doctask.getProductno());
				request.setChannelno(doctask.getChannelno());	
				request.setExpectapplyamount(exceptloaninfo.getExpectapplyamount()) ;
				List<RoleBean> list = roleService.selectByRoleid(request) ;
				Map<String , Object> map = new HashMap<>() ;

				if(!list.isEmpty() && list.size() > 0) {
					for (RoleBean roleBean : list) {
						workerid = roleBean.getWorkerid() ;
						int selectCount = roleService.selectCount(workerid) == null?0:roleService.selectCount(workerid);
						roleBean.setTotal(selectCount);
					}
					return new RoleResponse(list) ;
			}
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR) ;
	}
	
}
