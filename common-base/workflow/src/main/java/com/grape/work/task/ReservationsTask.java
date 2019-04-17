package com.grape.work.task;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.grape.model.db.Doctask;
import com.grape.model.db.Msgadditional;
import com.grape.model.db.Msgmaininfo;
import com.grape.model.mapper.base.MsgadditionalMapper;
import com.grape.model.mapper.base.MsgmaininfoMapper;
import com.grape.security.Util;
import com.grape.service.DoctaskService;
import com.grape.workflow.Execution;

@Component
@Scope("prototype")
public class ReservationsTask implements WorkTask{
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(ReservationsTask.class);
	@Autowired
	private MsgmaininfoMapper msgmaininfoMapper;
	@Autowired
	private MsgadditionalMapper msgadditionalMapper;
	@Autowired
	private DoctaskService doctaskService;
	@Override
	public TaskResult handle(Execution execution) {
		TaskResult task = new TaskResult();
		handleLowerHousehold(execution);
		task.setResult(true);
		return task;
	}
	public void handleLowerHousehold(Execution execution){
		String userid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		Msgmaininfo msg = new Msgmaininfo();
		Msgadditional msgadd = new Msgadditional();
		String nodeid = execution.getWorkItem().getNode();
		Doctask doc = doctaskService.getDocktaskById(execution.getWorkId());
		if(nodeid.contains("SLD")){
			nodeid=nodeid.substring(0,6)+"04";
		}else if(nodeid.contains("ZQ")){
			nodeid=nodeid.substring(0,5)+"28";
		}
		String id = Util.getID();
		msg.setId(id);
		msg.setChgdt(new Date());
		msg.setMsgtype("02");
		msg.setWorkid(execution.getWorkId());
		msg.setNode(nodeid);
		msg.setRecuser(doc.getUserid());
		msg.setSenduser(userid);
		msg.setContent("有一位客户需要您预约面签，请知悉。");
		msgadd.setId(Util.getID());
		msgadd.setRefid(id);
		msgadd.setState("0");
		msgadd.setEvaltime(doc.getUserid());
		msgadd.setChgdt(new Date());
		msgadditionalMapper.insert(msgadd);
		msgmaininfoMapper.insert(msg);
		log.info("新增预约面签通知成功");
	}

}