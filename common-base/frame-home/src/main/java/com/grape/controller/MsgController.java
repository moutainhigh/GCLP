package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.MsginfoResponse;
import com.grape.controller.reponse.NodeResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.bean.Msginfo;
import com.grape.controller.request.CommenPageRequest;
import com.grape.controller.request.MsgRequest;
import com.grape.controller.request.MsgUpdateRequest;
import com.grape.controller.request.MsgaddRequest;
import com.grape.model.db.Doctask;
import com.grape.model.db.Workitem;
import com.grape.model.mapper.PageBean;
import com.grape.service.DoctaskService;
import com.grape.service.MsginfoService;
import com.grape.service.WorkitemService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/msg")
@Validated
@Log4j
public class MsgController {

	@Autowired
	MsginfoService msginfoService;
	@Autowired
	WorkitemService workitemService;
	
	@Autowired
	DoctaskService doctaskService;

	@ApiOperation(value = "消息中心", httpMethod = "POST", notes = "指定页数和条数返回当前用户的消息", response = MsginfoResponse.class)
	@RequestMapping("/info")
	public Response info(@Validated @RequestBody CommenPageRequest req) {

		String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();

		PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
		List<Msginfo> msginfos = msginfoService.findMsginfoByWorkerid(workerid, pageBean);
		if (msginfos != null) {
			return new MsginfoResponse(msginfos, pageBean.getRecordCount().toString());
		}
		return new ErrorEntity(StatusCode.FAIL, MessageDetail.QUERY_ERROR);
	}

	@ApiOperation(value = "指定类型返回消息信息", httpMethod = "POST", notes = "根据消息类型返回用户消息信息", response = MsginfoResponse.class)
	@RequestMapping("/infoByType")
	public Response infoByType(@Validated @RequestBody MsgRequest req) {
		String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		;
		PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
		List<Msginfo> msginfos = msginfoService.findMsginfoByWorkeridAndMsgtype(workerid, req.getMsgtype(), pageBean);
		if (msginfos != null) {
			return new MsginfoResponse(msginfos, pageBean.getRecordCount().toString());
		}
		return new ErrorEntity(StatusCode.FAIL, MessageDetail.QUERY_ERROR);
	}

	@ApiOperation(value = "新消息", httpMethod = "POST", notes = "返回用户未读的所有消息", response = MsginfoResponse.class)
	@RequestMapping("/newInfo")
	public Response newInfo(@Validated @RequestBody CommenPageRequest req) {
		
		String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
		List<Msginfo> msginfos = msginfoService.findNewMsginfoByWorkerid(workerid, pageBean);
		if (msginfos != null) {
			return new MsginfoResponse(msginfos, pageBean.getRecordCount().toString());
		}
		return new ErrorEntity(StatusCode.FAIL, MessageDetail.QUERY_ERROR);
	}

	@ApiOperation(value = "消息状态更新", httpMethod = "POST", notes = "将未读消息状态更新为已读", response = NodeResponse.class)
	@RequestMapping("/updateState")
	public Response updateState(@Validated @RequestBody MsgUpdateRequest req) {

		try {

			if (msginfoService.updateState(req.getMsgid())) {
				NodeResponse nodeResponse = new NodeResponse();
				Doctask doctask = doctaskService.findDoctaskByWorkid(req.getWorkid());
				if(doctask!=null){
					nodeResponse.setOrganizationno(doctask.getChannelno());
				}
				Workitem workitem = workitemService.findWorkitemByWorkid(req.getWorkid(),req.getNodeid());
				if (workitem != null) {
					nodeResponse.setFlag(false);
				}else{
					nodeResponse.setFlag(true);
				}
				return nodeResponse;
			} else {
				log.info("更新消息状态出错");
			}
		} catch (Exception e) {
			log.error(MessageDetail.MSGSTATE_UPDATE_FAIL + e.getMessage());
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.MSGSTATE_UPDATE_FAIL);
		}
		return new ErrorEntity(StatusCode.FAIL, MessageDetail.MSGSTATE_UPDATE_FAIL);

	}

	@ApiOperation(value = "消息新增", httpMethod = "POST", notes = "新增消息", response = RestfulResponse.class)
	@RequestMapping("/add")
	public Response add(@Validated @RequestBody MsgaddRequest req) {

		if (msginfoService.insertMsg(req.getWorkid(), req.getContent(), req.getSenduser(), req.getRecuser(),
				req.getMsgtype())) {
			return new ErrorEntity(StatusCode.OK, MessageDetail.MSG_ADD_SUCCESS);
		}
		return new ErrorEntity(StatusCode.FAIL, MessageDetail.MSG_ADD_FAIL);
	}
}
