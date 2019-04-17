package com.grape.workflow.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Workitem;
import com.grape.model.db.WorkitemExample;
import com.grape.model.db.Workproc;
import com.grape.model.mapper.base.WorkitemMapper;
import com.grape.model.mapper.base.WorkprocMapper;
import com.grape.workflow.define.Workflow;
import com.grape.workflow.service.WorkItemService;

@Service
public class WorkItemServiceImpl implements WorkItemService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private WorkitemMapper workitemMapper;
	@Autowired
	private WorkprocMapper workprocMapper;

	public Workitem getWorkItem(String workid, String forkid, String branchid) {

		Workitem workItem = null;
		List<Workitem> workitems = new ArrayList<Workitem>();
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workid).andForkEqualTo(forkid).andBranchEqualTo(branchid);
		workitems = workitemMapper.selectByExample(example);
		if (workitems != null && workitems.size() > 0) {
			workItem = workitems.get(0);
		}

		Workproc workproc = workprocMapper.selectByPrimaryKey(workid);
		workItem.setWorkproc(workproc);

		return workItem;
	}

	public List<Workitem> findWorkItem(String workid, String forkid) {
		List<Workitem> workitems = new ArrayList<Workitem>();
		Workproc workProc = workprocMapper.selectByPrimaryKey(workid);
		try {
			workitems = this.findWorkItemByWorkidAndForkid(workid, forkid);
			for (Workitem workitem : workitems) {
				workitem.setWorkproc(workProc);
			}
		} catch (Exception e) {
			logger.info("查找工作分配失败", e);
		}
		return workitems;
	}

	public Workitem findWorkItemByWorkidAndNodeid(String workid, String nodeid) throws Exception {

		List<Workitem> workitems = new ArrayList<Workitem>();
		Workitem workitem = null;
		Workproc workproc = null;
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workid).andNodeEqualTo(nodeid);

		workitems = workitemMapper.selectByExample(example);
		if (workitems != null && workitems.size() > 0) {
			workitem = workitems.get(0);

			workproc = workprocMapper.selectByPrimaryKey(workid);
			workitem.setWorkproc(workproc);
		}
		return workitem;
	}

	public List<Workitem> findWorkItemByWorkidAndForkid(String workid, String forkid) throws Exception {
		List<Workitem> workitems = new ArrayList<Workitem>();
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workid).andForkEqualTo(forkid);
		workitems = workitemMapper.selectByExample(example);
		return workitems;
	}

	public void insert(Workitem workItem) throws Exception {
		workitemMapper.insert(workItem);

	}

	public void update(Workitem workItem) throws Exception {
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workItem.getWorkid()).andForkEqualTo(workItem.getFork())
				.andBranchEqualTo(workItem.getBranch());//TODO 删除 version条件
		workitemMapper.updateByExample(workItem, example);

	}

	public void delete(Workitem workItem) throws Exception {
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workItem.getWorkid()).andBranchEqualTo(workItem.getBranch())
				.andForkEqualTo(workItem.getFork());
		workitemMapper.deleteByExample(example);

	}

	public void remove(String workid, String forkid) throws Exception {
		List<Workitem> list = this.findWorkItemByWorkidAndForkid(workid, forkid);
		for (int i = 0; list != null && i < list.size(); i++) {
			this.delete(list.get(i));
		}

	}

	public void create(Workitem workItem) throws Exception {
		Workproc workproc = workItem.getWorkproc();
		workprocMapper.insert(workproc);
		workitemMapper.insert(workItem);
	}

	@Override
	public Workitem[] getJoined(String workid, String forkid) throws Exception {
		List<Workitem> workitems = this.findWorkItem(workid, forkid);
		return workitems.toArray(new Workitem[workitems.size()]);
	}

	@Override
	public List<Workitem> selectChkOutWork(String workerid) {
		WorkitemExample we = new WorkitemExample();
		WorkitemExample.Criteria wec = we.createCriteria();
		wec.andUseridEqualTo(workerid);
		return workitemMapper.selectByExample(we);
	}

	@Override
	public Workitem selectWorkitemByWorkid(String workid) {
		return workitemMapper.selectByPrimaryKey(workid, "0", "0");
	}

	@Override
	public void updateByIdSelective(Workitem work) {
		workitemMapper.updateByPrimaryKeySelective(work);

	}

	@Override
	public void removeSubprocess(String workid) {
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andWorkidEqualTo(workid).andForkNotEqualTo(Workflow.DEFAULT_FORK).andBranchNotEqualTo(Workflow.DEFAULT_BRANCH);
		workitemMapper.deleteByExample(example);
	}

}
