package com.grape.work.task;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.grape.model.db.Msgadditional;
import com.grape.model.db.Msgmaininfo;
import com.grape.model.db.Workitem;
import com.grape.model.db.WorkitemExample;
import com.grape.model.mapper.base.MsgadditionalMapper;
import com.grape.model.mapper.base.MsgmaininfoMapper;
import com.grape.model.mapper.base.WorkitemMapper;
import com.grape.security.Util;
import com.grape.workflow.Execution;

@Component
@Scope("prototype")
public class LowerHouseholdTask implements WorkTask{
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(LowerHouseholdTask.class);
	@Autowired
	private MsgmaininfoMapper msgmaininfoMapper;
	@Autowired
	private MsgadditionalMapper msgadditionalMapper;
	@Autowired
	private WorkitemMapper workitemMapper;
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
		String id = Util.getID();
		String nodeid = execution.getWorkItem().getNode();
		msg.setId(id);
		msg.setChgdt(new Date());
		msg.setMsgtype("01");
		msg.setWorkid(execution.getWorkId());
		if(nodeid.contains("PRD")){
			nodeid=nodeid.substring(0,6)+"05";
		}else if(nodeid.contains("ZQ")){
			nodeid=nodeid.substring(0,5)+"05";
		}
		msg.setNode(nodeid);
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(execution.getWorkId()).andNodeEqualTo(nodeid);
		Workitem workitem = workitemMapper.selectByExample(example).get(0);
		if(workitem!=null){
			msg.setRecuser(workitem.getAuthuserid());
		}
		msg.setSenduser(userid);
		msg.setContent("有一笔业务需要您下户尽调，请知悉。");
		msgadd.setId(Util.getID());
		msgadd.setRefid(id);
		msgadd.setState("0");
		if(workitem!=null){
			msgadd.setEvaltime(workitem.getAuthuserid());
		}
		msgadd.setChgdt(new Date());
		if(workitem.getAuthuserid()!=null){
			msgadditionalMapper.insert(msgadd);
			msgmaininfoMapper.insert(msg);
		}
		log.info("新增实况调查通知成功");
	}

}
