package com.grape.work.task;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Chanapprovalform;
import com.grape.workflow.Execution;
import com.grape.workflow.service.ChanapprovalFormService;

@Component
@Scope("prototype")
//验证面签及面签质检时是否已经选择了是否需要面签质检
public class FacesignTask implements WorkTask{
	private static final Logger log = LoggerFactory.getLogger(WorkTask.class);
	@Autowired
	private ChanapprovalFormService chanapprovalFormService;
	@Override
	public TaskResult handle(Execution execution) {
		log.info("开始进行面签校验任务");
		TaskResult task = new TaskResult();
		String workid = execution.getWorkId();
		List<Chanapprovalform> chanapprovalform = chanapprovalFormService.selectChanapproval(workid);
		if(chanapprovalform.isEmpty()){
			task.setResult(false);
			log.info("面签不能提交");
			task.setDescription("提交流水失败，风控审批暂未选择是否需要面签质检");
		}else if(!chanapprovalform.isEmpty()){
			List<String> list = new ArrayList<String>();
			for(int i=0;i<chanapprovalform.size();i++){
				String userid = chanapprovalform.get(i).getUserid();
				String orgno=chanapprovalFormService.selectOrgofUserid(userid);
				if(orgno!=null){
					if(!list.contains(orgno)){
						list.add(orgno);
					}
				}
			}
			if(list.contains("02")){
				task.setResult(true);
			}else{
				task.setResult(false);
				log.info("面签不能提交");
				task.setDescription("提交流水失败，风控审批暂未选择是否需要面签质检");
			}
		}
		return task;
	}

}
