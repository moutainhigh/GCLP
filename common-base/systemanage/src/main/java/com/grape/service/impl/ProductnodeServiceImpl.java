package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.NodeButtonBean;
import com.grape.controller.reponse.NodePageBean;
import com.grape.controller.reponse.NodePageBean1;
import com.grape.controller.reponse.NodeRoleBean;
import com.grape.controller.reponse.PathNodeBean;
import com.grape.controller.reponse.ProductnodeAndTaskInfo;
import com.grape.controller.reponse.ProductnodeBean;
import com.grape.controller.request.NoidRequest;
import com.grape.controller.request.PathNodeRequest;
import com.grape.controller.request.ProductFormRequest;
import com.grape.controller.request.ProductNoRequest;
import com.grape.controller.request.ProductNodeInfoRequest;
import com.grape.controller.request.ProductNodeRequest;
import com.grape.controller.request.ProductRequest;
import com.grape.controller.response.bean.NodeKeyinfoBean;
import com.grape.model.db.Codetask;
import com.grape.model.db.CodetaskExample;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.NodebuttonExample;
import com.grape.model.db.Nodepage;
import com.grape.model.db.NodepageExample;
import com.grape.model.db.Noderole;
import com.grape.model.db.NoderoleExample;
import com.grape.model.db.Page;
import com.grape.model.db.PageExample;
import com.grape.model.db.Procbranch;
import com.grape.model.db.ProcbranchExample;
import com.grape.model.db.Proccondition;
import com.grape.model.db.ProcconditionExample;
import com.grape.model.db.Proctask;
import com.grape.model.db.ProctaskExample;
import com.grape.model.db.Proctrans;
import com.grape.model.db.ProctransExample;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.model.db.ProductnodeExample;
import com.grape.model.mapper.base.CodetaskMapper;
import com.grape.model.mapper.base.NodebuttonMapper;
import com.grape.model.mapper.base.NodepageMapper;
import com.grape.model.mapper.base.NoderoleMapper;
import com.grape.model.mapper.base.PageMapper;
import com.grape.model.mapper.base.ProcbranchMapper;
import com.grape.model.mapper.base.ProcconditionMapper;
import com.grape.model.mapper.base.ProctaskMapper;
import com.grape.model.mapper.base.ProctransMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.model.mapper.external.ProductnodeExMapper;
import com.grape.service.ProductnodeService;
import com.grape.util.Util;

@Service
public class ProductnodeServiceImpl implements ProductnodeService{
	private static final Logger log = LoggerFactory.getLogger(ProductnodeServiceImpl.class);
	
	@Autowired
	private ProductnodeMapper productnodeMapper;
	
	@Autowired
	private ProcbranchMapper procbranchMapper;
	
	@Autowired
	private ProcconditionMapper procconditionMapper;
	
	@Autowired
	private ProductnodeExMapper productnodeExMapper;
	
	@Autowired
	private NodebuttonMapper nodebuttonMapper;
	
	@Autowired
	private ProctaskMapper proctaskMapper;
	
	@Autowired
	private CodetaskMapper codetaskMapper;
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private PageMapper PageMapper;
	
	@Autowired
	private NodepageMapper nodepageMapper;
	
	@Autowired
	private NoderoleMapper noderoleMapper;
	
	@Autowired
	private ProctransMapper proctransMapper;
	

	@Override
	public List<Productnode> selectProductNodeByProductno(ProductNodeInfoRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getNodeid()!=null && !"".equals(req.getNodeid())){
			map.put("nodeid", req.getNodeid());
		}
		if(req.getNodename()!=null && !"".equals(req.getNodename())){
			map.put("nodename", req.getNodename());
		}
		if(req.getType()!=null && !"".equals(req.getType())){
			map.put("type", req.getType());
		}
		map.put("productno", req.getProductno());
		map.put("pagenum", req.getPagenum());
		map.put("pagesize", req.getPagesize());
		List<Productnode> list = productnodeExMapper.selectByNodeInfo(map);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public void insertProductnode(ProductNodeRequest req) {
		String istruenode = req.getIstruenode();
		//如果该节点是真实节点，则只需要生成一条真实节点数据
		if(istruenode.equals("1")){
			Productnode productnode = new Productnode();
			try {
				Util.transferFields(req, productnode);
				
			} catch (Exception e) {
				log.info("新增节点时实体类转换出错");
			}
			productnode.setChgdt(new Date());
			productnode.setState("0");
			productnode.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
			productnodeMapper.insertSelective(productnode);
		}else{//如果该节点是虚拟节点，则需要生成一条fork虚拟数据，一条join虚拟数据
			for(int i=0;i<2;i++){
				Productnode node = new Productnode();
				try {
					Util.transferFields(req, node);
				} catch (Exception e) {
					log.info("新增节点时实体类转换出错");
				}
				if(i==0){
					node.setType("fork");
				}else{
					node.setType("join");
				}
				node.setChgdt(new Date());
				node.setState("0");
				node.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
				productnodeMapper.insertSelective(node);
			}
		}
			
	}

	@Override
	public void deleteProductNode(NoidRequest req) {
		Productnode productnode = new Productnode();
		productnode.setState("2");
		productnode.setNodeid(req.getNodeid());
		productnode.setType(req.getType());
		productnodeMapper.updateByPrimaryKeySelective(productnode);
		
	}

	@Override
	public ProductnodeAndTaskInfo selectProductnodeByNodeidAndType(NoidRequest req) {
		String nodeid = req.getNodeid();
		String type = req.getType();
		
		//查询节点任务信息
		ProctaskExample taskexample = new ProctaskExample();
		taskexample.createCriteria().andNodeidEqualTo(nodeid);
		List<Proctask> proctasks = proctaskMapper.selectByExample(taskexample);
		ProductnodeExample example = new ProductnodeExample();
		if(type!=null && !"".equals(type)){
			example.createCriteria().andNodeidEqualTo(nodeid).andTypeEqualTo(type);
		}else{
			example.createCriteria().andNodeidEqualTo(nodeid);
		}
		
		//节点路径信息
		PathNodeBean pathNodeBean = new PathNodeBean();
		//查询节点汇聚信息
		Proccondition proccondition = new Proccondition();
		ProcconditionExample conditionExample = new ProcconditionExample();
		example.createCriteria().andNodeidEqualTo(nodeid);
		List<Proccondition> procconditions = procconditionMapper.selectByExample(conditionExample);
		if(procconditions!=null && procconditions.size()>0){
			proccondition = procconditions.get(0);
			if(proccondition.getAppear() !=null){
				pathNodeBean.setAppear(proccondition.getAppear());
			}
			if(proccondition.getTonode()!=null){
				pathNodeBean.setBranchendtonode(proccondition.getTonode());
			}
			if(proccondition.getConds()!=null){
				pathNodeBean.setBranchendnode(proccondition.getConds());
			}
			if(proccondition.getNodeid()!=null){
				pathNodeBean.setNodeid(proccondition.getNodeid());
			}
			if(proccondition.getConditionid()!=null){
				pathNodeBean.setConditionid(proccondition.getConditionid());
			}
		}
		//查询节点分支信息
		List<Procbranch> branchList = new ArrayList<Procbranch>();
		ProcbranchExample branchExample = new ProcbranchExample();
		branchExample.createCriteria().andNodeidEqualTo(nodeid);
		branchList = procbranchMapper.selectByExample(branchExample);
		pathNodeBean.setProcbranchs(branchList);
		
		
		//查询节点按钮信息
		NodeButtonBean nodeButtonBean = new NodeButtonBean();
		NodebuttonExample buttonExample = new NodebuttonExample();
		buttonExample.createCriteria().andNodeidEqualTo(nodeid);
		List<Nodebutton> buttonList = new ArrayList<Nodebutton>();
		List<NodeKeyinfoBean> NodeKeyinfoBeans = new ArrayList<NodeKeyinfoBean>();
		buttonList = nodebuttonMapper.selectByExample(buttonExample);
		if(buttonList!=null && buttonList.size()>0){
			for(int i=0;i<buttonList.size();i++){
				NodeKeyinfoBean nodeKeyinfoBean = new NodeKeyinfoBean();
				try {
					Util.transferFields(buttonList.get(i), nodeKeyinfoBean);
				} catch (Exception e) {
					log.info("实体类转换出错");
				}
				String id = buttonList.get(i).getId();
				List<Proctrans> proctrans = new ArrayList<Proctrans>();
				ProctransExample proctransexample = new ProctransExample();
				proctransexample.createCriteria().andButtonidEqualTo(id);
				proctrans = proctransMapper.selectByExample(proctransexample);
				nodeKeyinfoBean.setProctransList(proctrans);
				NodeKeyinfoBeans.add(nodeKeyinfoBean);
			}
		}
		nodeButtonBean.setButtonList(NodeKeyinfoBeans);
		
		//节点页面信息
		NodePageBean nodepageBean = new NodePageBean();
		List<Nodepage> pageList = new ArrayList<Nodepage>();
		List<NodePageBean1> bean1List = new ArrayList<NodePageBean1>();
		NodepageExample pageexample = new NodepageExample();
		pageexample.createCriteria().andNodeidEqualTo(nodeid);
		pageList = nodepageMapper.selectByExample(pageexample);
		if(pageList!=null && pageList.size()>0){
			for(int i=0;i<pageList.size();i++){
				NodePageBean1 nodepageBean1 = new NodePageBean1();
				String pageid = pageList.get(i).getPageid();
				try {
					Util.transferFields(pageList.get(i), nodepageBean1);
				} catch (Exception e) {
					log.info("实体类转换出错");
				}
				Page page = PageMapper.selectByPrimaryKey(pageid);
				nodepageBean1.setPagename(page.getPagename());
				bean1List.add(nodepageBean1);
			}
			nodepageBean.setPageList(bean1List);
		}
		
		//查询节点角色信息
		NodeRoleBean nodeRoleBean = new NodeRoleBean();
		List<Noderole> roleList = new ArrayList<Noderole>();
		NoderoleExample roleexample = new NoderoleExample();
		roleexample.createCriteria().andNodeidEqualTo(nodeid);
		roleList = noderoleMapper.selectByExample(roleexample);
		nodeRoleBean.setRoleList(roleList);
		
		//查询节点基本信息
		List<Productnode> list = productnodeMapper.selectByExample(example);
		
		if(list!=null && list.size()>0){
			ProductnodeBean bean = new ProductnodeBean();
			try {
				Util.transferFields(list.get(0), bean);
			} catch (Exception e) {
				log.info("实体类转换出错");
			}
			bean.setProctasks(proctasks);
			ProductnodeAndTaskInfo info = new ProductnodeAndTaskInfo(bean,pathNodeBean,nodeButtonBean,nodepageBean,nodeRoleBean);
			return info; 
		}
		return null;
	}

	@Override
	public void updateProductnode(ProductNodeRequest req) {
		Productnode productnode = new Productnode();
		try {
			Util.transferFields(req, productnode);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		productnodeMapper.updateByPrimaryKeySelective(productnode);
		//将节点任务信息插入到任务信息表中
		List<Proctask> proctasks = req.getProctasks();
		ProctaskExample example = new ProctaskExample();
		example.createCriteria().andNodeidEqualTo(req.getNodeid());
		List<Proctask> list = proctaskMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			proctaskMapper.deleteByExample(example);
		}
		for(int j=0;j<proctasks.size();j++){
			Proctask proctask = new Proctask();
			proctask.setTaskid(proctasks.get(j).getTaskid());
			proctask.setNodeid(req.getNodeid());
			proctask.setProductno(req.getNodeid().substring(0, 6));
			proctask.setChgtm(new Date());
			proctask.setState(proctasks.get(j).getState());
			proctask.setRunflg(proctasks.get(j).getRunflg());
			proctask.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
			proctaskMapper.insertSelective(proctask);
		}
	}

	@Override
	public void insertPathNodeInfo(PathNodeRequest req) {
		String nodeid = req.getNodeid();
		//先把分支信息删除再新增一条新的数据
		ProcbranchExample branchexample = new ProcbranchExample();
		branchexample.createCriteria().andNodeidEqualTo(nodeid);
		procbranchMapper.deleteByExample(branchexample);
		List<Procbranch> procbranchs = req.getProcbranchs();
		//将分支信息新增进分支信息表中
		for(int i=0;i<procbranchs.size();i++){
			Procbranch procbranch = new Procbranch();
			procbranch.setBranchid(Util.getID());
			procbranch.setName(procbranchs.get(i).getName());
			procbranch.setNodeid(nodeid);
			procbranch.setTonode(procbranchs.get(i).getTonode());
			procbranchMapper.insertSelective(procbranch);
		}
		//先把汇聚信息删除再插入一条新的数据
		ProcconditionExample conditionExample = new ProcconditionExample();
		conditionExample.createCriteria().andNodeidEqualTo(nodeid);
		procconditionMapper.deleteByExample(conditionExample);
		//将虚拟节点的汇聚信息新增到节点汇聚表中
		String endnode = req.getBranchendnode();
		String endtonode = req.getBranchendtonode();
		Proccondition proccondition = new Proccondition();
		proccondition.setConditionid(Util.getID());
		proccondition.setAppear(procbranchs.size()+"");
		proccondition.setNodeid(nodeid);
		proccondition.setConds(endnode);
		proccondition.setTonode(endtonode);
		procconditionMapper.insertSelective(proccondition);
		
	}

	@Override
	public List<Codetask> selectAllTaskInfo() {
		CodetaskExample example = new CodetaskExample();
		example.createCriteria();
		List<Codetask> list = codetaskMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public void updateProductnodeByNodeInfo(ProductNodeRequest req) {
		Productnode productnode = new Productnode();
		
		try {
			Util.transferFields(req, productnode);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		productnodeMapper.updateByPrimaryKeySelective(productnode);
		
	}

	@Override
	public Productnode selectProductnodeByPrimartKey(NoidRequest request) {
		Productnode productnode = productnodeMapper.selectByPrimaryKey(request.getType(), request.getNodeid());
		return productnode;
	}

	@Override
	public List<Product> seleatProductInfo(ProductRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getProductname()!=null && !"".equals(req.getProductname())){
			map.put("productname", req.getProductname());
		}
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getProducttype()!=null && !"".equals(req.getProducttype())){
			map.put("producttype", req.getProducttype());
		}
		map.put("pagenum", Integer.parseInt(req.getPagenum()));
		map.put("pagesize", Integer.parseInt(req.getPagesize()));
		List<Product> list = productnodeExMapper.selectProductInfo(map);
		return list;
	}

	@Override
	public void updateProduct(ProductFormRequest req) {
		Product product = new Product();
		try {
			Util.transferFields(req, product);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		productMapper.updateByPrimaryKeySelective(product);
		
	}

	@Override
	public Product selectProductByProductno(String productno) {
		Product product = productMapper.selectByPrimaryKey(productno);
		return product;
	}

	@Override
	public void insertProduct(ProductFormRequest req) {
		Product product = new Product();
		try {
			Util.transferFields(req, product);
			product.setState("0");
			product.setChgdt(new Date());
			product.setChgtl(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		productMapper.insertSelective(product);
		
	}

	@Override
	public Product selectProductDetail(ProductRequest req) {
		Product product = new Product();
		product = productMapper.selectByPrimaryKey(req.getProductno());
		return product;
	}

	@Override
	public void deleteProduct(ProductFormRequest req) {
		productMapper.deleteByPrimaryKey(req.getProductno());
		
	}

	@Override
	public void publicProduct(ProductFormRequest req) {
		Product product = new Product();
		product.setProductno(req.getProductno());
		String state = req.getState();
		product.setState(state);
		productMapper.updateByPrimaryKeySelective(product);
		
	}

	@Override
	public List<Page> selectProductPage() {
		String id = "0";
		PageExample example = new PageExample();
		example.createCriteria().andPageidLike(id+"%");
		List<Page> pages = PageMapper.selectByExample(example);
		return pages;
	}

	@Override
	public Integer selectProductNodeCount(ProductNodeInfoRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getNodeid()!=null && !"".equals(req.getNodeid())){
			map.put("nodeid", req.getNodeid());
		}
		if(req.getNodename()!=null && !"".equals(req.getNodename())){
			map.put("nodename", req.getNodename());
		}
		if(req.getType()!=null && !"".equals(req.getType())){
			map.put("type", req.getType());
		}
		map.put("productno", req.getProductno());
		map.put("pagenum", req.getPagenum());
		map.put("pagesize", req.getPagesize());
		Integer count = productnodeExMapper.selectByNodeInfoCount(map);
		return count;
	}

	@Override
	public List<Productnode> selectProductnodeByType(ProductNoRequest req) {
		ProductnodeExample example = new ProductnodeExample();
		example.createCriteria().andProductnoEqualTo(req.getProductno()).andTypeEqualTo("task");
		List<Productnode> list = productnodeMapper.selectByExample(example);
		return list;
	}

	@Override
	public void activeProductNode(ProductNodeInfoRequest req) {
		Productnode productnode = new Productnode();
		productnode.setState(req.getState());
		productnode.setNodeid(req.getNodeid());
		productnode.setType(req.getType());
		productnodeMapper.updateByPrimaryKeySelective(productnode);
		
	}

}
