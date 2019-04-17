package com.grape.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.NodeidAndProductnoRequest;
import com.grape.controller.request.NodepageBean;
import com.grape.controller.request.WorkidAndNodeidOperationRequest;
import com.grape.controller.request.WorkidAndNodeidRequest;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.NodebuttonExample;
import com.grape.model.db.Nodepage;
import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import com.grape.model.db.Rolemenu;
import com.grape.model.db.RolemenuExample;
import com.grape.model.db.Workitem;
import com.grape.model.db.WorkitemExample;
import com.grape.model.mapper.base.NodebuttonMapper;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.model.mapper.base.RolemenuMapper;
import com.grape.model.mapper.base.WorkitemMapper;
import com.grape.model.mapper.external.NodepageExMapper;
import com.grape.service.NodePageService;
@Service
public class NodePageServiceImpl implements NodePageService{
	@Autowired
	private NodepageExMapper nodepageExMapper;
	@Autowired
	private ProductnodeMapper productnodeMapper;
	@Autowired
	private NodebuttonMapper nodebuttonMapper;
	@Autowired
	private WorkitemMapper workitemMapper;
	@Autowired
	private RolemenuMapper rolemenuMapper;
	@Override
	public List<NodepageBean> selectNodepageByNode(NodeidAndProductnoRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("nodeid", req.getNodeid());
		map.put("productno", req.getProductno());
		return nodepageExMapper.selectNodePage(map);
	}
	@Override
	public List<Nodebutton> selectNodeButtonByNode(NodeidAndProductnoRequest req) {
		NodebuttonExample example = new NodebuttonExample();
		example.createCriteria().andNodeidEqualTo(req.getNodeid()).andProductnoEqualTo(req.getProductno());
		return nodebuttonMapper.selectByExample(example);
	}
	@Override
	public Boolean selectHaveChoose(WorkidAndNodeidOperationRequest req) {
		NodebuttonExample example = new NodebuttonExample();
		example.createCriteria().andNodeidEqualTo(req.getNodeid()).andProductnoEqualTo(req.getProductno()).andIdEqualTo(req.getOperation());
		String nextnodeid=nodebuttonMapper.selectByExample(example).get(0).getNextnode();
		ProductnodeExample nodeexample = new ProductnodeExample();
		nodeexample.createCriteria().andNodeidEqualTo(nextnodeid).andProductnoEqualTo(req.getProductno());
		String assignmode=productnodeMapper.selectByExample(nodeexample).get(0).getAssignmode();
		if("S".equals(assignmode)){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String selectReturnflg(NodeidAndProductnoRequest req) {
		WorkitemExample example = new WorkitemExample();
		example.createCriteria().andNodeEqualTo(req.getNodeid()).andWorkidEqualTo(req.getWorkid());
		List<Workitem> workitemlist = workitemMapper.selectByExample(example);
		String retscnode = "";
		if(!workitemlist.isEmpty()){
			retscnode=workitemMapper.selectByExample(example).get(0).getRetscnode();
		}
		return retscnode;
	}
	@Override
	public List<Rolemenu> selectRolemenu(List<String> role) {
		RolemenuExample example = new RolemenuExample();
		example.createCriteria().andRoleidIn(role).andMenutypeEqualTo("0");
		return rolemenuMapper.selectByExample(example);
	}
	@Override
	public boolean selectNextNodeByButton(NodeidAndProductnoRequest req) {
		ProductnodeExample nodeexample = new ProductnodeExample();
		nodeexample.createCriteria().andNodeidEqualTo(req.getNodeid());
		List<Productnode> nodelist = productnodeMapper.selectByExample(nodeexample);
		if(!nodelist.isEmpty()){
			String node = nodelist.get(0).getAssigntagnode();
			if(node!=null){
				return true;
			}
		}
		List<String> list = new ArrayList<String>();
		list.add("确定");
		list.add("提交");
		list.add("通过");
		NodebuttonExample example = new NodebuttonExample();
		example.createCriteria().andNodeidEqualTo(req.getNodeid()).andNameIn(list);
		List<Nodebutton> nodebuttonList=nodebuttonMapper.selectByExample(example);
		if(!nodebuttonList.isEmpty()){
			String nodeid = nodebuttonList.get(0).getNextnode();
			if(nodeid!=null){
				ProductnodeExample prdexample = new ProductnodeExample();
				prdexample.createCriteria().andNodeidEqualTo(nodeid);
				List<Productnode> prdlist = productnodeMapper.selectByExample(prdexample);
				if(!prdlist.isEmpty()){
					String checkperson = prdlist.get(0).getAssignmode();
					if("S".equals(checkperson)){
						return true;
					}else{
						return false;
					}
				}
			}
		}
		return false;
	}
	@Override
	public Productnode selectNodeinfo(String nodeid) {
		ProductnodeExample example = new ProductnodeExample();
		example.createCriteria().andNodeidEqualTo(nodeid);
		return productnodeMapper.selectByExample(example).get(0);
	}
}
