package com.grape.workflow.work;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.WorkflowApplication;
import com.grape.model.db.Codetask;
import com.grape.model.db.Custinfo;
import com.grape.model.db.CustinfoExample;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.model.mapper.external.ProctaskExMapper;
import com.grape.security.Util;
import com.grape.service.RuleDataService;
import com.grape.work.task.TaskResult;
import com.grape.work.task.WorkTask;
import com.grape.workflow.BaseWorkService;
import com.grape.workflow.Execution;
import com.grape.workflow.define.Decision;
import com.grape.workflow.define.Node;
import com.grape.workflow.define.TaskNode;
import com.grape.workflow.define.Transition;
import com.grape.workflow.define.Workflow;
import com.grape.workflow.util.WorkUtil;

@Service
public class DocTaskWork extends BaseWorkService{
	
	private Logger logger = LoggerFactory.getLogger(DocTaskWork.class);
	
	@Autowired
	private ProctaskExMapper proctaskExMapper;
	
	@Autowired
	private CustinfoMapper custinfoMapper;
	
	@Autowired
	private RuleDataService ruleDataService;
	
	@Override
	protected void before(Execution execution) throws Exception {
		
		loadBaseData(execution);
		
		TaskResult result = proctasks(execution,"01");
		
		if(!result.isResult()){
			throw new Exception(result.getDescription());
		}
		
		Node node = Workflow.getNode(execution.getWorkItem());
		if(node instanceof TaskNode){
			TaskNode taskNode = (TaskNode)node;
			Decision decision = taskNode.getDecision(execution.getOperation());
			Map<Object, Object> data = execution.getContext().getVariables();
			
			if(decision!=null&&(decision.getTo()==null || "".equals(decision.getTo().trim()))){
				
				Map<String, Transition> trans = decision.getTransitions();
				Set<String> keys = trans.keySet();
				boolean flg = false;
				for (String key : keys) {
					Transition tran = trans.get(key);
					ruleDataService.loadExpressData(execution, tran.getExpression());
					flg = WorkUtil.executeExpression(data, tran.getExpression());
					if(flg){
						execution.getContext().setTranName(tran.getName());
						break;
					}
				}
				
				if(!flg){
					throw new Exception("流水["+execution.getWorkId()+"]在节点["+node.getName()+"]的操作["+decision.getName()+"]找不到下一操作节点");
				}
				
			}
		}
		
	}
	
	private void loadBaseData(Execution execution) {
		
		//主借款人信息
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andWorkidEqualTo(execution.getWorkId()).andCusttypeEqualTo("1");
		List<Custinfo> list = custinfoMapper.selectByExample(example);
		if(list!=null&&list.size()>=1){
			execution.getContext().loadVariables(WorkUtil.getDataFromBean("custinfo",list.get(0)));//主借款人信息
			execution.getContext().setVariable("custinfo_data","Y");//标记已加载
		}
		
	}

	@Override
	protected void after(Execution execution) throws Exception {
		
		//流程调整完成后的任务，运行完毕后不对结果进行处理
		proctasks(execution, "02");
		
		
	}
	
	private TaskResult proctasks(Execution execution,String runflg){
		String fromNodeId = Util.outObj(execution.getFromNodeId());
		List<Codetask> tasks = getProductCodetasks(execution.getWorkItem().getWorkproc().getProcess(), fromNodeId, runflg);
		TaskResult globleResult = new TaskResult();
		if(tasks!=null){
			for (Codetask codetask : tasks) {
				try{
					Class<?> clasz = Class.forName(codetask.getTaskclass());
					WorkTask task = (WorkTask) WorkflowApplication.instance.getBean(clasz);
					TaskResult result = task.handle(execution);
					if(!result.isResult()){
						globleResult.setResult(false);
						globleResult.addDescription(result.getDescription());
					}
				}catch(Exception e){
					logger.warn("任务["+codetask.getTaskname()+"]找不到对应的实现类["+codetask.getTaskclass()+"]",e);
				}
			}
		}
		return globleResult;
	}
	
	private List<Codetask> getProductCodetasks(String productno,String nodeid,String runflg){
		Map<String,String> map = new HashMap<String,String>();
		map.put("productno", productno);
		map.put("nodeid", nodeid);
		map.put("runflg", runflg);
		
		return proctaskExMapper.findTaskByNodeid(map);
	}
	
}
