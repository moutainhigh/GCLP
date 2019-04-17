package com.grape.workflow.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.workflow.Execution;
import com.grape.workflow.WorkService;
import com.grape.workflow.bean.Actor;
import com.grape.workflow.define.Branch;
import com.grape.workflow.define.Condition;
import com.grape.workflow.define.Decision;
import com.grape.workflow.define.EndNode;
import com.grape.workflow.define.Executable;
import com.grape.workflow.define.ForkNode;
import com.grape.workflow.define.JoinNode;
import com.grape.workflow.define.Node;
import com.grape.workflow.define.Process;
import com.grape.workflow.define.StartNode;
import com.grape.workflow.define.TaskNode;
import com.grape.workflow.define.Transition;
import com.grape.workflow.define.Workflow;
import com.grape.model.db.Doctask;
import com.grape.model.db.Doctasksign;
import com.grape.model.db.Productnode;
import com.grape.model.db.Workassign;
import com.grape.model.db.Workhistory;
import com.grape.model.db.Workitem;
import com.grape.model.db.Workproc;
import com.grape.service.DoctaskService;
import com.grape.service.ProductService;
import com.grape.util.Util;
import com.grape.workflow.service.DepartmentService;
import com.grape.workflow.service.DoctaskassignService;
import com.grape.workflow.service.RoleService;
import com.grape.workflow.service.WorkAssignService;
import com.grape.workflow.service.WorkFolwService;
import com.grape.workflow.service.WorkHisService;
import com.grape.workflow.service.WorkItemService;
import com.grape.workflow.util.WorkUtil;

@Service
public class WorkFlowServiceImpl implements WorkFolwService{
	
	private Logger logger = LoggerFactory.getLogger(WorkFlowServiceImpl.class);
	
	@Autowired
	private WorkAssignService workAssignService;
	
	@Autowired
	private WorkHisService workHisService;
	
	@Autowired
	private WorkItemService workItemService;
	
	@Autowired
	private DoctaskService doctaskService;
	
	@Autowired
	private DepartmentService departService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private DoctaskassignService doctaskassignService;
	
	public final boolean validate(Execution execution) throws Exception{
		boolean result = true;
		
		Node node = execution.node();
		
		if(!Workflow.isExecutable(node)){
			throw new Exception("当前节点不可以操作");
		}
		
		Executable exeNode = (Executable)node;
		
		String lane = exeNode.getLane();
		Actor actor = execution.getActor();
		Workitem workItem = execution.getWorkItem();
		Workproc workProc = workItem.getWorkproc();
//		String exeroleid = (null ==  exeNode.getRoles()? exeNode.getRoles(execution.getTransName()):exeNode.getRoles());
		
		String userid = actor.getUserid();
		List<String> roles = actor.getRoles();
		String departId = actor.getDepartment().getDepartId();
		String departLv = actor.getDepartment().getDepartLv();
		Process process = execution.process();
		
		if(Workflow.STATE_END.equals(workItem.getState())){
			throw new Exception("工作项已结束");
		}
		
		if (departId == null){
			throw new Exception("机构号不能为空");
		}
		
		if (Workflow.OPER_REASSIGN.equals(execution.getOperation())) {
			String apRole = process.getApRole();
			String apDepartLv = process.getApDepartLv();
			String ownDepartId = workProc.getDepartid();
			
			if (!roles.contains(apRole)) {
				throw new Exception("角色权限不足");
			}
		//  需要用执行者和流水机构级别和流水机构和节点的机构级别进行判断
			if (!departId.equals(this.getExeDepartId(ownDepartId, apDepartLv))) {
				throw new Exception("机构权限不足");
			}
		} else {
			/*if(!Workflow.ALL_OF_ROLE.equals(exeroleid)){
				if(!Arrays.asList(exeroleid.split("[,]")).contains(roleid)){
					throw new Exception("角色权限不足");
				}
			}*/
			
			//  需要用执行者和流水机构级别和流水机构和节点的机构级别进行判断
			if (Workflow.OPER_START.equals(execution.getOperation())) {
				//modify by wwx
				if(exeNode.getDepartLv() != null && !Arrays.asList(exeNode.getDepartLv().split("[,]")).contains(departLv)){
					throw new Exception("机构权限不足");
				}
			} else {
								
				//if (exeNode.getDepartLv() != null && !departId.equals(this.getExeDepartId(workItem, exeNode))) {
				//modify by wwx
				if(exeNode.getDepartLv() != null && !Arrays.asList(exeNode.getDepartLv().split("[,]")).contains(departLv)){
					throw new Exception("机构权限不足");
				}

				if (!Workflow.OPER_START.equals(execution.getOperation())) {

					if (Workflow.STATE_HANDLE.equals(workItem.getState()) && !userid.equals(workItem.getUserid())) {
						throw new Exception("工作项已被其他用户占用");
					}

					if (!workAssignService.checkAccess(workItem, lane, userid)) { 
						throw new Exception("权限不足");
					}
				}
			}
			
		}
		
		return result;
	}

	public Workitem createWorkProc(Actor actor,String workid,String processId,Doctask entity) throws Exception{
		String userid = actor.getUserid();
		
		Process process = Workflow.getProcess(processId);
		
		if(process==null){
			throw new Exception("找不到产品["+processId+"]流程");
		}
		
		Node startNode = process.getStartNode();
		
		Workproc workProc = new Workproc();
		workProc.setWorkid(workid);
		workProc.setProcess(processId);
		workProc.setDepartid(actor.getDepartment().getDepartId());
		workProc.setCreatedate(WorkUtil.getDate());
		workProc.setCreatetime(WorkUtil.getTime());
		workProc.setCreator(userid);
		
		Workitem workItem = createWorkItem(workProc,Workflow.DEFAULT_FORK,Workflow.DEFAULT_BRANCH,startNode);
		
		//创建doctask
		if(entity!=null){
			doctaskService.saveDoctask(entity);
		}
		
		return workItem;
	}
	
	public Workitem createWorkItem(Workproc workProc,String forkid,String branch,Node node) throws Exception{
	
		List<String> roleid = null;
		if(Workflow.isStart(node)){
			roleid = ((StartNode)node).getRoles();
		}else if(Workflow.isTask(node)){
			roleid = ((TaskNode)node).getRoles();
		}
		
		Workitem workItem = new Workitem();
		workItem.setWorkid(workProc.getWorkid());
		workItem.setFork(forkid);
		workItem.setBranch(branch);
		workItem.setStage(node.getStage());
		workItem.setNode(node.getId());
		workItem.setState(Workflow.STATE_READY);
//		workItem.setRoleid(roleid);//TODO 确认该笔流水的执行角色应该放到哪里
		workItem.setUserid(null);
		
		workItem.setWorkproc(workProc);
		
		return workItem;
	}
	
	public void startProcess(Execution execution) throws Exception{
		Workitem workItem = null;
		Actor actor = null;
		Actor toActor = null;
		try {
			workItem = execution.getWorkItem();
			actor = execution.getActor();
			toActor = execution.getToActor();
			Process process = execution.process();
			StartNode startNode = process.getStartNode();
			Node toNode = process.getNode((null == startNode.getTo()? startNode.getStartTo(execution.getTransName()).getTo():startNode.getTo()));
			
			transfer(execution,actor,toActor,workItem,toNode);
			
		} catch (Exception e) {
			throw e;
		}
	}

	public Workitem getWorkItem(String workid,String nodeid) throws Exception{
		return workItemService.findWorkItemByWorkidAndNodeid(workid, nodeid);
	}
	
	public Workitem getWorkItem(String workid) throws Exception{
		return workItemService.getWorkItem(workid, Workflow.DEFAULT_FORK,Workflow.DEFAULT_BRANCH);
		
	}
	
	public void checkout(Execution execution) throws Exception{
		Actor actor = execution.getActor();
		Workitem workItem = execution.getWorkItem();
		String userid = actor.getUserid();
		
		workItem.setState(Workflow.STATE_HANDLE);
		workItem.setUserid(userid);
		
		workItemService.update(workItem);
	}

	public void checkin(Execution execution) throws Exception {
		Workitem workItem = execution.getWorkItem();
				
		if(!Workflow.OPER_CHECKIN.equals(workItem.getState()) && !(workItem.getUserid() == null || "".equals(workItem.getUserid()))){
			workItem.setState(Workflow.STATE_READY);
			workItem.setUserid(null);
			workItemService.update(workItem);
		}
	}
	
	public void decide(Execution execution,String decisionName) throws Exception{
		try {		
			Actor actor = execution.getActor();
			Actor toActor = execution.getToActor();
			Workitem workItem = execution.getWorkItem();
						
			//TODO 明确是否需要检出工作项
//			if (!Workflow.STATE_HANDLE.equals(workItem.getState())) {
//				throw new Exception("没有检出工作项");
//			}
			
			TaskNode fromNode = (TaskNode)execution.node();
			String toNodeId = null;
			
			//将退回操作抽出,不再在节点上设置,全部节点都可以进行的操作
			if(Workflow.OPER_FLOWBACK.equals(decisionName)){//退回操作
				
				toNodeId = execution.getToNodeid();
				
			}else if(Workflow.OPER_RETURN.equals(decisionName)){//返回操作
				
				toNodeId = workItem.getRetscnode();
				
			}else{
				Decision decision = fromNode.getDecision(decisionName);
				if(decision==null){
					throw new Exception("找不到Decision："+decisionName);
				}
				String condition = decision.getCondition();
				//TODO 表达式
				if(condition!=null && !WorkUtil.executeExpression(execution.getContext().getVariables(),condition)){
					throw new Exception("不符合操作条件："+condition);
				}
				
				String to = decision.getTo();
				if(null == to || "".equals(to.trim())){
					String transName = execution.getTransName();
					Map<String,Transition> map = decision.getTransitions();
					Transition trans = map.get(transName);
					toNodeId = trans.getTo();
				}else{
					toNodeId = to;
				}
			}
			
			Node toNode = execution.process().getNode(toNodeId);
			if(toNode == null){
				throw new Exception("找不到流转节点:"+toNodeId);
			}
			
			//productnode流程中设置assign target node，如果有值，则将userid缓存
			if(fromNode.getAssignTargetNode()!=null&&!fromNode.getAssignTargetNode().trim().equals("")){
				Workassign workAssign = new Workassign();
				workAssign.setId(WorkUtil.getID());
				workAssign.setWorkid(workItem.getWorkid());
				workAssign.setNodeid(fromNode.getAssignTargetNode());
				workAssign.setUserid(toActor.getUserid());
				workAssignService.save(workAssign);
			}

			transfer(execution,actor,toActor,workItem,toNode);//转变到下一节点
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void transfer(Execution execution ,Actor actor,Actor toActor, Workitem workItem,Node toNode) throws Exception{
		Workproc workProc = workItem.getWorkproc();
		Process process = Workflow.getProcess(workProc.getProcess());
		//Node fromNode = Workflow.getNode(workItem);
		/* 不存在跨分支了，因为可以控制跳转到分支后所以不存在跨分支
		int dv = toNode.getLv() - fromNode.getLv();
		if(Math.abs(dv) >= 2){
			throw new Exception("节点转移时不允许跨越2级或以上分支，流水号："+workItem.getWorkid());
		}
		*/
		
		recordExecutor(actor,workItem);
		
		/* 不能由父级退回子级，也不能由子级退回父级，分支和合并后不再退回。
		if(dv == -1 && !Workflow.isJoin(toNode)){
			backParent(actor,workItem,toNode);//子级退回父级
		}else if(dv == 1 && !Workflow.isFork(toNode)){
			backChild(actor,workItem,toNode);//父级退回子级
		}else */
		
		if(Workflow.isFork(toNode)){                      //分支节点
			fork(execution,actor,toActor,workItem,(ForkNode)toNode);
		}else if(Workflow.isTask(toNode)){             //任务节点
			if(!Workflow.OPER_FLOWBACK.equals(execution.getOperation())
					&&!Workflow.OPER_RETURN.equals(execution.getOperation())){//修改分配条件,当退回或返回时,不在这里进行分配,由在flow方法中根据退回信息进行分配
				assign(actor,toActor,workItem, (TaskNode)toNode);
			}
			flow(execution ,actor,workItem,toNode);
		}else if(Workflow.isEnd(toNode)){             //结束节点，如果有汇合节点需要合并
			flow(execution ,actor,workItem,toNode);
			JoinNode join = process.getJoinNode(workItem.getFork());
			if(null != join){
				join(execution,actor,toActor, workItem, join); // 当节点是结束状态，和该节点是分支状态需要合流
			}
		}else if(Workflow.isStart(toNode)){
			throw new Exception("不可以转变到开始节点");
		}else{
			throw new Exception("未知错误");
		}
		
	}
	/**
	 * 
	 * 将流水分配给参与者
	 * lijl
	 * 1.0 - 2015年5月6日
	 * @param actor
	 * @param workItem
	 * @throws Exception
	 */
	private void recordExecutor(Actor actor, Workitem workItem) throws Exception{
		
		if(workItem.getRoles()!=null){
			String workid = workItem.getWorkid();
			String userid = actor.getUserid();
			List<String> roleid = actor.getRoles();
	
			Node temp = Workflow.getNode(workItem);//TODO 修改记录执行人条件判断
			if(temp instanceof  Executable){
				Executable node = (Executable)temp;
				String lane = node.getLane();
				
				if("0".equals(lane)){
					logger.info("流水号："+workItem.getWorkid()+"，节点："+node.getName()+"，不记录执行人");
				}else{
					
//					workAssignService.removeOtherActors(workid, roleid, lane, userid);
					if(workAssignService.get(workid, roleid ,lane, userid)==null){
						Workassign workassign = new Workassign();
						workassign.setId(WorkUtil.getID());
						workassign.setWorkid(workid);
//						workassign.setRoleid(roleid);//TODO 确认该笔流水的执行角色应该放到哪里
						workassign.setLane(lane);
						workassign.setUserid(userid);
						workAssignService.save(workassign);
					}
				}
			}
			
		}
		
		return;
	}
	
	private void fork(Execution execution,Actor actor,Actor toActor, Workitem workItem, ForkNode forkNode) throws Exception{
		Workproc workProc = workItem.getWorkproc();
		
		List<Branch> branches = forkNode.getBranches();
		
		Workitem brWorkItem = null;
		Branch branchNode = null;
		for(int i=0; i<branches.size(); i++){
			branchNode = branches.get(i);
			TaskNode taskNode = (TaskNode)Workflow.getNode(workProc.getProcess(), branchNode.getTo());
			brWorkItem = this.createWorkItem(workProc, forkNode.getId(), branchNode.getName(), taskNode);
//			brWorkItem.setDepartlv(String.valueOf(taskNode.getDepartLv())); // 设置分支的机构级别
			assign(actor,toActor,brWorkItem, taskNode);
			workItemService.insert(brWorkItem);
		}
		
		workItem.setUserid(null);
		workItem.setStage(forkNode.getStage());
//		workItem.setRoleid(null);
		workItem.setNode(forkNode.getId());
		workItem.setState(Workflow.STATE_READY);
		
		workItemService.update(workItem);
	}
	
	/**
	 * 汇合分支流水
	 * @param actor     参与值
	 * @param workItem  工作项
	 * @param join        汇合节点
	 * @throws Exception
	 */
	private void join(Execution execution,Actor actor,Actor toActor, Workitem workItem,JoinNode join) throws Exception{
		String workid = workItem.getWorkid();
		Workproc workProc = workItem.getWorkproc();
		Process process = Workflow.getProcess(workProc.getProcess());
		Node mainToNode = null;
		Workitem[] workitems = workItemService.getJoined(workid,join.getFork().getId());
		List<Condition> conds = join.getCondition();
		boolean complete = true;
		if(null != conds){ //存在结果判断
			int curAppear ;
			for(Condition cond:conds){
				curAppear = 0;
				for(Workitem workitem:workitems){
					if(cond.getConds().contains(workitem.getNode())){
						curAppear++;
					}
				}
				
				// 正常是不会出现大于的，避免人为的数据库操作，加上大于判断
				if(curAppear >= cond.getAppear()){ // 结果集符合该条件
					mainToNode = process.getNode(cond.getTo());
					break;
				}
			}
		}else{  // 不存在结果判断
			mainToNode = process.getNode(join.getTo());
			for(Workitem workitem:workitems){
				if(Workflow.getNode(process.getId(),workitem.getNode()) instanceof EndNode){
					complete &= true;
				}else{
					complete &= false;
				}
			}
		}
		
		if(complete && null != mainToNode){
			logger.info("流水号："+workid+"，进行汇合");
//			Workitem mainWorkItem = this.getWorkItem(workid);
			Workitem mainWorkItem = workItemService.getWorkItem(workid, join.getFork().getFork(), join.getFork().getBranch());
			this.transfer(execution,actor, toActor,mainWorkItem, mainToNode); // 主流水改变状态
		}else{
			logger.info("流水号："+workid+"，待符合条件的其他分支节汇合");
		}
	}
	
	/**
	 * 流程跳转（下一节点）
	 * @param actor      参与者
	 * @param workItem  工作项
	 * @param toNode     流程流转的节点
	 * @throws Exception
	 */
	private void flow(Execution execution ,Actor actor, Workitem workItem, Node toNode) throws Exception{
		Node formNode = Workflow.getNode(workItem);
			
		if(Workflow.OPER_FLOWBACK.equals(execution.getOperation())){//退回
			
			if(workItem.getRetscnode()!=null&&!"".equals(workItem.getRetscnode())){
				throw new Exception("其他分支流程正在进行贷款回退操作，待操作完成后才能进行退回");
			}
			
			Workhistory workhist = workHisService.getLastWorkhistory(workItem.getWorkid(), toNode.getId());
			if(workhist==null){
				throw new Exception("流水["+workItem.getWorkid()+"]不能退回节点["+toNode.getId()+"]");
			}
			if(Workflow.DEFAULT_FORK.equals(workhist.getFork())&&Workflow.DEFAULT_BRANCH.equals(workhist.getFork())){//退主流程
				
				if("1".equals(execution.getReturnflg())){//1.可直接返回源退回节点
					workItem.setReturnflg(execution.getReturnflg());//记录退回信息
					workItem.setRetscnode(formNode.getId());
					workItem.setRetscper(actor.getUserid());
					workItem.setAuthuserid(workhist.getUserid());
				}else{//2:逐级提交,需要删除全部分支流程
					Workitem mainWorkItem = workItemService.getWorkItem(workItem.getWorkid(), Workflow.DEFAULT_FORK, Workflow.DEFAULT_BRANCH);
					mainWorkItem.setAuthuserid(workhist.getUserid());
					workItemService.removeSubprocess(mainWorkItem.getWorkid());
					
					workItem = mainWorkItem;//更新主流程
				}
				
				
			}else if(workItem.getFork().equals(workhist.getFork())&&workItem.getBranch().equals(workhist.getBranch())){//退回本分支流程节点
				
				if("1".equals(execution.getReturnflg())){//1.可直接返回源退回节点
					workItem.setReturnflg(execution.getReturnflg());//记录退回信息
					workItem.setRetscnode(formNode.getId());
					workItem.setRetscper(actor.getUserid());
					workItem.setAuthuserid(workhist.getUserid());
				}else{
					workItem.setAuthuserid(workhist.getUserid());
				}
				
			}else{
				Productnode productnode = productService.getProductnodeByPrimarykey("fork", workItem.getFork());
				if(workhist.getBranch().equals(productnode.getBranch())){//退回上级流程
					
					if("1".equals(execution.getReturnflg())){//1.可直接返回源退回节点
						
						workItem.setReturnflg(execution.getReturnflg());//记录退回信息
						workItem.setRetscnode(formNode.getId());
						workItem.setRetscper(actor.getUserid());
						workItem.setAuthuserid(workhist.getUserid());
						
					}else{//2:逐级提交,需要删除本级分支流程
						Workitem supperWorkItem = workItemService.getWorkItem(workItem.getWorkid(), productnode.getFork(), workhist.getBranch());
						supperWorkItem.setAuthuserid(workhist.getUserid());
						workItemService.remove(workItem.getWorkid(), workItem.getFork());
						
						workItem = supperWorkItem;//更新上级流程
					}
					
				}else{
					throw new Exception("流水["+workItem.getWorkid()+"]不能退回节点["+toNode.getId()+"]");
				}
			}
		}else if(Workflow.OPER_RETURN.equals(execution.getOperation())){//返回
			
			if("1".equals(workItem.getReturnflg())){
				workItem.setAuthuserid(workItem.getRetscper());
				
				workItem.setReturnflg(null);//情况退回信息
				workItem.setRetscnode(null);
				workItem.setRetscper(null);
			}else{
				throw new Exception("流水["+workItem.getWorkid()+"]不能进行返回操作");
			}
			
		}else if(Workflow.OPER_REVIEW.equals(execution.getOperation())){//复议
			Doctask doctask = new Doctask();
			doctask = doctaskService.getDocktaskById(execution.getWorkId());
			if(doctask!=null){
				//更新复议状态标识，表示该流水已经复议过
				doctask.setState("1");
				doctaskService.updateDoctask(doctask);
			}
			Productnode riskAppNode = productService.getAppealToNode(workItem.getEntity().getProductno(), "风控审批");
			if(riskAppNode!=null){
				workItemService.remove(workItem.getWorkid(), riskAppNode.getNodeid());
			}
			
		}else{//正常流转
			
			if(workItem.getRetscnode()!=null&&!"".equals(workItem.getRetscnode())){//可原路退回，但是正常提交了
				throw new Exception("退回流水不能进行该操作,需要提交到原退回节点");
			}
			
		}
		
		if(toNode.getApprovenum()>0){//下一节点为会签节点
			//清除会签记录
			doctaskassignService.cleanDoctaskassign(workItem.getWorkid(),toNode.getId());
		}
		
		if(formNode.getApprovenum()>0&&"通过".equals(execution.getOperation())){//当前节点为会签节点,并且为通过
			//添加会签记录，流水不进行跳转
			Doctasksign doctasksign = new Doctasksign();
			doctasksign.setId(Util.getID());
			doctasksign.setWorkid(workItem.getWorkid());
			doctasksign.setNodeid(formNode.getId());
			doctasksign.setUserid(actor.getUserid());
			doctasksign.setChgdt(new Date());
			doctasksign.setChgtl(actor.getUserid());
			doctaskassignService.addDoctaskassign(doctasksign);
		}
		
		int count = doctaskassignService.countAssignNum(workItem.getWorkid(),formNode.getId());
		
		//不是会签节点，或者会签节点已达到指定人数，进行状态跳转
		if(formNode.getApprovenum()==0 //非会签节点
				|| (formNode.getApprovenum()>0 && count>=formNode.getApprovenum()) //会签节点达到指定人数
				||(formNode.getApprovenum()>0 && !"通过".equals(execution.getOperation())) //会签节点非“通过”操作，就是说通过节点不进行跳转，等待会签到达指定人数
				){
			workItem.setUserid(null);
			workItem.setStage(toNode.getStage());
			workItem.setNode(toNode.getId());
			workItem.setStarttime(new Date());
			
			if(Workflow.isEnd(toNode)){
				workItem.setState(Workflow.STATE_END);
			}else{
				workItem.setRoles(((TaskNode)toNode).getRoles());
				workItem.setState(Workflow.STATE_READY);
			}
			
			if(Workflow.isStart(formNode)){
				workItemService.create(workItem);
			}else{
				workItemService.update(workItem);
			}
		}
		
	}
	
	/*private void backParent(Actor actor, WorkItem workItem, Node toNode) throws Exception{
		IWorkItemDAO dao = workDAOFactory.getWorkItemDAO();
		
		String workid = workItem.getWorkid();
		Node formNode = Workflow.getNode(workItem);
		String forkid = formNode.getParent().getId();
		
		workItem.setRoleid(null);
		workItem.setUserid(null);
		workItem.setState(Workflow.STATE_END);
		workItem.setNode(toNode.getId());
		
		//清除同级分支
		dao.remove(workid, forkid);
		
		//父级转移到目标节点	
		WorkItem parentWorkItem = this.getWorkItem(workid);
		this.transfer(actor, parentWorkItem, toNode);
	}*/
	
/*	private void backChild(Actor actor, WorkItem workItem, Node toNode) throws Exception{
		IWorkItemDAO dao = workDAOFactory.getWorkItemDAO();
		
		//新增子级分支记录
		TaskNode taskNode = (TaskNode)toNode;
		WorkItem brWorkItem = this.createWorkItem(workItem.getWorkProc(), toNode.getParent().getId(), taskNode.getBranch(), toNode);
		dao.add(brWorkItem);
		
		//父级转移到分叉点					
		workItem.setUserid(null);
		workItem.setRoleid(null);
		workItem.setNode(toNode.getParent().getId());
		workItem.setState(Workflow.STATE_READY);
		dao.update(workItem);
	}*/
	
	/**
	 * 
	 * 将工作项派给参与者
	 * lijl
	 * 1.0 - 2015年5月6日
	 * @param workItem
	 * @param toNode
	 * @throws Exception
	 */
	private void assign(Actor actor,Actor toActor,Workitem workItem, TaskNode toNode) throws Exception{		
		
		String workid = workItem.getWorkid();		
		String assignMode = toNode.getAssignMode();
		List<String> toRoles = toNode.getRoles();//TODO 确认该笔流水的执行角色应该放到哪里
		String toLane = toNode.getLane();
		
		//获取当前工作项下一节点的角色是否已存在参与者
		Workassign workAssign = workAssignService.getOneByRoleId(workid, toRoles, toLane);
		
		if(workAssign!=null){
			logger.info("流水号："+workid+"，已有可分配的参与者：" + workAssign.getUserid());
		}else{
			if (Workflow.ASSIGN_PRE.equals(assignMode)) {
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，使用预分配方式");
				String toOrgno = this.getExeDepartId(workItem, toNode);
				List<Workassign> list = workAssignService.generateList(workid,toOrgno,toRoles,toLane);
				if(list!=null && !list.isEmpty()){
					workAssignService.save(list);
				}else{
					if(Workflow.getProcess(workItem).isAssignFlag()){
						logger.info("流水号："+workid+"，找不到可分配的参与者，默认分配到角色");
						
						workAssign = new Workassign();
						workAssign.setId(WorkUtil.getID());
						workAssign.setWorkid(workid);
//						workAssign.setRoles(toRoles);//TODO 确认该笔流水的执行角色应该放到哪里
						workAssign.setLane(toLane);
						workAssign.setUserid(Workflow.ALL_OF_ROLE);
						workAssignService.save(workAssign);
					}else{
						logger.info("流水号："+workid+"，找不到可分配的参与者");
					}
				}
			} else if (Workflow.ASSIGN_ONE.equals(assignMode)) {
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，分配给其中一个参与者");
				String toOrgno = this.getExeDepartId(workItem, toNode);
				workAssign = workAssignService.getBest(workid,toOrgno,toRoles,toLane);// 负载均衡
				if(workAssign!=null){
					workAssignService.save(workAssign);
					logger.info("流水号："+workid+"，分配给参与者："+workAssign.getUserid());
				}else{
					if(Workflow.getProcess(workItem).isAssignFlag()){
						logger.info("流水号："+workid+"，找不到可分配的参与者，默认分配到角色");
						workAssign = new Workassign();
						workAssign.setId(WorkUtil.getID());
						workAssign.setWorkid(workid);
//						workAssign.setRoleid(toRoleid);//TODO 确认该笔流水的执行角色应该放到哪里
						workAssign.setLane(toLane);
						workAssign.setUserid(Workflow.ALL_OF_ROLE);
						workAssignService.save(workAssign);
					}else{
						logger.info("流水号："+workid+"，找不到可分配的参与者");
					}
				}
			} else if(Workflow.ASSIGN_ROL.equals(assignMode)){
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，分配到角色");
				workAssign = new Workassign();
				workAssign.setId(WorkUtil.getID());
				workAssign.setWorkid(workid);
//				workAssign.setRoleid(toRoleid);//TODO 确认该笔流水的执行角色应该放到哪里
				workAssign.setLane(toLane);
				workAssign.setUserid(Workflow.ALL_OF_ROLE);
				workAssignService.save(workAssign);
			} else if(Workflow.ASSIGN_ROLES.equals(assignMode)){//角色共享
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，分配到角色");
				//贷眼项目分配继续记录由workassgin表改到workitem表中
				//通过authuserid进行判断，若authuserid为空则按角色可见，否则有权审批人为authuserid
				workItem.setAuthuserid(null);//清空有权审批人
			} else if(Workflow.ASSIGN_SELECT.equals(assignMode)){//前端选择
				
				if(toActor==null){
					throw new Exception("下一节点任务分配模式为[前端选择]，请填写下一任务审批人");
				}
				
				String userid = toActor.getUserid();
				
				if(userid!=null){
					String temp = roleService.getNodeFirstAuthuserid(userid, toNode.getRoles());
					
					if(temp!=null){
						userid = temp;
					}
				}
				
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，分配到用户["+userid+"]");
				
				workItem.setAuthuserid(userid);
				
			} else if(Workflow.ASSIGN_USERASSIGN.equals(assignMode)){//专员派单
				
				workAssign = workAssignService.findByWorkidAndNodeid(workid, toNode.getId());
				if(workAssign!=null){
					
					String userid = workAssign.getUserid();
					
					if(userid!=null){
						String temp = roleService.getNodeFirstAuthuserid(userid, toNode.getRoles());
						
						if(temp!=null){
							userid = temp;
						}
					}
					
					workItem.setAuthuserid(userid);
					
				}
				
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，分配到用户["+workAssign.getUserid()+"]");
				
			}else if(Workflow.ASSIGN_USERID.equals(assignMode)){//默认业务员
				
				Doctask doctask = doctaskService.getDocktaskById(workid);
				workItem.setAuthuserid(doctask.getUserid());
				
				logger.info("流水号："+workid+"，转变节点："+toNode.getId()+"，分配到用户["+doctask.getUserid()+"]");
				
			} else {
				throw new Exception("找不到分配模式：" + assignMode);
			}
		}
		
	}
	
	/**
	 * 
	 */
	public void reassign(Execution execution, Actor toActor)throws Exception{
		Workitem workItem = execution.getWorkItem();
		String workid = workItem.getWorkid();
		List<String> roles = workItem.getRoles();
		Node node = execution.node();
		String lane = ((TaskNode)node).getLane();
		String toUserId = toActor.getUserid();
			
		boolean exsitsRole = false;
		for (int i = 0; i < roles.size(); i++) {
			if(toActor.getRoles().contains(roles.get(i))){
				exsitsRole = true;
			}
		}
		if(exsitsRole){		

			String exeDepartId = this.getExeDepartId(workItem.getWorkproc().getDepartid(), ((Executable)node).getDepartLv());
			
			if(!exeDepartId.equals(toActor.getDepartment().getDepartId())){
				throw new Exception("流水号："+workid+"，不能指派给参与者：" + toUserId+"，因为该参与者不属于当前节点的执行机构：" + exeDepartId);
			}
			
			if(!workAssignService.checkAssignable(workid, toActor.getUserid())){
				throw new Exception("流水号："+workid+"，不能指派给参与者：" + toUserId);
			}
			
			workAssignService.delete(workid,roles,lane);
			Workassign workassign = new Workassign();
			workassign.setId(WorkUtil.getID());
			workassign.setWorkid(workid);
			workassign.setUserid(toUserId);
//			workassign.setRoleid(roleid);//TODO 确认该笔流水的执行角色应该放到哪里
			workassign.setLane(lane);
			workAssignService.save(workassign);
			
			workItem.setUserid(null);
			workItem.setState(Workflow.STATE_READY) ;
			
			workItemService.update(workItem);
			
			logger.info("流水号："+workid+"，重新分配给参与者："+ toUserId);
		}else{
			throw new Exception("当前节点要求角色："+roles+"，不能分配到角色："+toActor.getRoles());
		}
	}
	
	public String reassign(Execution execution)throws Exception{	
		Workitem workItem = execution.getWorkItem();
		String toUserid = null;
		String workid = workItem.getWorkid();
		List<String> roles = workItem.getRoles();
		Node node = execution.node();
		String lane = ((TaskNode)node).getLane();
		
		String toDepartId = this.getExeDepartId(workItem, (TaskNode)node);
		Workassign workAssign = workAssignService.getBest(workid,toDepartId,roles,lane);
		if(workAssign!=null){
			workAssignService.delete(workid,roles,lane);
			workAssignService.save(workAssign);
			toUserid = workAssign.getUserid();
		}else{
			throw new Exception("找不到可指派的参与者");
		}
		
		workItem.setUserid(null);
		workItem.setState(Workflow.STATE_READY);
		workItemService.update(workItem);
		
		return toUserid;
	}
	
	private String getExeDepartId(Workitem workItem, Executable node) throws Exception{
		String exeDepartLv = node.getDepartLv();	//  流程允许执行的机构级别
		String ownDepartId = workItem.getWorkproc().getDepartid();	//发起流水的机构
				
		return getExeDepartId(ownDepartId,exeDepartLv);
	}
	
	private String getExeDepartId(String ownDepartId,String exeDepartLv) throws Exception{
		String exeDepartId = null;
		String ownDepartLv =departService.get(ownDepartId).getDepartLv();  // 发起流水的机构级别
		int ownDepartLv_num = Integer.parseInt(ownDepartLv);
		int exeDepartLv_num = Integer.parseInt(exeDepartLv);
		if(ownDepartLv_num < exeDepartLv_num){  //   上级机构发起的流水不能让下级机构进行审批
			 //throw new Exception(ownDepartLv_num+"级机构发起的流水不能让"+exeDepartLv_num+"级机构的柜员进行流程审批");
			exeDepartId = ownDepartId;
		}else if(ownDepartLv_num == exeDepartLv_num){
			exeDepartId = ownDepartId;
		}else{  // 目前只存在1到3的机构，所以在发起机构的上级机构只能是1,2级机构
			departService.getHeadDepart(ownDepartId);
		}
		return exeDepartId;
	}

	@Override
	public void grant(Execution execution)throws Exception {
		Workitem workItem = execution.getWorkItem();
		workItem.setUserid(null);
		workItem.setAuthuserid(execution.getToActor().getUserid());
		workItem.setState(Workflow.STATE_READY);
		workItemService.update(workItem);
		
	}

	@Override
	public void transferto(Execution execution) throws Exception {
		Workitem workItem = execution.getWorkItem();
		workItem.setUserid(null);
		workItem.setReturnflg("1");
		workItem.setRetscnode(workItem.getNode());
		workItem.setRetscper(workItem.getAuthuserid());
		workItem.setAuthuserid(execution.getToActor().getUserid());
		workItem.setState(Workflow.STATE_READY);
		workItemService.update(workItem);
		
	}

	@Override
	public void appeal(Execution execution)throws Exception {
		Workitem workitem = execution.getWorkItem();
		Doctask doctask = workitem.getEntity();
		if("E7".equals(workitem.getStage())){
			
			Productnode node = productService.getAppealToNode(doctask.getProductno(), "渠道进件");
			workitem.setNode(node.getNodeid());
			workitem.setAuthuserid(doctask.getUserid());
			workitem.setState("1");
			workitem.setStage(node.getStage());
			workItemService.removeSubprocess(workitem.getWorkid());
			workItemService.update(workitem);
			
		}else{
			throw new Exception("流水["+execution.getWorkId()+"]不是拒绝状态，不能发起申诉");
		}
	}
	
}
