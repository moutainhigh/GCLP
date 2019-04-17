package com.grape.work.task;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Buildingproperty;
import com.grape.model.db.BuildingpropertyExample;
import com.grape.model.db.Mortgage;
import com.grape.model.db.MortgageExample;
import com.grape.model.mapper.base.BuildingpropertyMapper;
import com.grape.model.mapper.base.MortgageMapper;
import com.grape.workflow.Execution;


@Component
@Scope("prototype")
public class CheckDeliinfoTask implements WorkTask{
	private static final Logger log = LoggerFactory.getLogger(CheckDeliinfoTask.class);
	@Autowired
	private MortgageMapper mortgageMapper;
	@Autowired
	private BuildingpropertyMapper buildingpropertyMapper;

	@Override
	public TaskResult handle(Execution execution) {
		TaskResult task = new TaskResult();
		boolean isfinish = handleDeliInfo(execution);
		if(!isfinish){
			task.setResult(false);
			log.info("温馨提示：提交流水，快速成交价尚未填写");
			task.setDescription("温馨提示：请在手机端完善快速成交价和实地挂盘价，并提交流水！");
		}
		return task;
	}
	public boolean handleDeliInfo(Execution execution){
		boolean isfinish = true;
		String workid = execution.getWorkId();
		MortgageExample example = new MortgageExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Mortgage> mortgagelist = mortgageMapper.selectByExample(example);
		if(mortgagelist!=null && !mortgagelist.isEmpty()){
			for(int i=0;i<mortgagelist.size();i++){
				String mortgageid = mortgagelist.get(i).getId();
				if(mortgageid!=null){
					BuildingpropertyExample buildingexample = new BuildingpropertyExample();
					buildingexample.createCriteria().andMortgageidEqualTo(mortgageid);
					List<Buildingproperty> buildlist = buildingpropertyMapper.selectByExample(buildingexample);
					if(buildlist==null || buildlist.size()==0){
						isfinish=false;
					}
				}
			}
		}
		return isfinish;
	}
}