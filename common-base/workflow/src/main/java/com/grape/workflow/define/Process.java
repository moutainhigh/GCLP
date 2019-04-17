package com.grape.workflow.define;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.WorkflowApplication;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.Nodepage;
import com.grape.model.db.Noderole;
import com.grape.model.db.Procbranch;
import com.grape.model.db.Proccondition;
import com.grape.model.db.Proctrans;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.service.ProductService;

@Component()
@Scope("prototype")
public final class Process{
	private String apRole;
	private String apDepartLv;
	private StartNode startNode;
	private String id;
	private String name;
	private Map<String, Node> nodes;
	private Map<String,JoinNode> joinNodes;
	private boolean assignFlag;
	
	@Autowired
	private ProductService productService;
	
	public void init(Map<String,Menu> menumap,Product product)throws Exception{
		
		List<Productnode> productnodes = productService.getProductnodeForProduct(product.getProductno());
		
		id = product.getProductno();
		name = product.getProductname();
		
		if(id==null){
			id = name;
		}
		
		try{
			
			nodes = new HashMap<String, Node>();
			joinNodes = new HashMap<String,JoinNode>();
					
			Node node = null;
			String type = null;
			Productnode productnode = null;
			for (int i = 0; i < productnodes.size(); i++) {
				node = null;
				productnode = productnodes.get(i);
				type = productnode.getType().toLowerCase();
				
				List<Procbranch> branches = productService.getBranches(productnode.getNodeid());
				List<Proccondition> procconds = productService.getProcconditions(productnode.getNodeid());
				
				//节点页面
				List<Nodepage> nodepages = productService.getNodepagesForProduct(product.getProductno(),productnode.getNodeid());
				
				//节点角色
				List<Noderole> noderoles = productService.getNoderolesForProduct(product.getProductno(),productnode.getNodeid());
				
				//节点按钮
				List<Nodebutton> nodebtns = productService.getNodeBtns(product.getProductno(),productnode.getNodeid());
				
				if("start".equals(type)){
					startNode = WorkflowApplication.instance.getBean(StartNode.class);
					node = startNode;
					startNode.init(menumap, productnode, nodepages, noderoles);
				}else if("task".equals(type)){
					node = WorkflowApplication.instance.getBean(TaskNode.class);
					((TaskNode)node).init(menumap, productnode, nodepages, noderoles, nodebtns);
				}else if("fork".equals(type)){
					node = WorkflowApplication.instance.getBean(ForkNode.class);
					((ForkNode)node).init(menumap, productnode, nodepages, branches);
				}else if("end".equals(type)){
					node = WorkflowApplication.instance.getBean(EndNode.class);
					((EndNode)node).init(menumap, productnode, nodepages);
				}else if("join".equals(type)){
					String forkid = productnode.getFork();
					if(null != forkid){
						ForkNode forkNode = (ForkNode) nodes.get(forkid);
						if(joinNodes.containsKey(forkid)){
							throw new Exception("无法两个合流节点指向同一个分支节点");
						}
						JoinNode join = WorkflowApplication.instance.getBean(JoinNode.class);
						join.init(menumap, productnode, forkNode, procconds);
						joinNodes.put(join.getFork().getId(), join);
					}else{
						throw new Exception("Join节点没有指向Fork节点");
					}
				}
				
				if(node!=null){
					checkNodeId(node.getId());
					nodes.put(node.getId(), node);
				}
			}
			
			// 检测Join节点的分支条件必须是结束节点
			if(!joinNodes.isEmpty()){
				for(JoinNode join:joinNodes.values()){
					if(null != join.getCondition()){
						for(Condition cond:join.getCondition()){
							for(String nodestat:cond.getConds()){
								if(!Workflow.isEnd(getNode(nodestat))){
									throw new Exception("分支条件必须是结束节点");
								}
							}
						}
					}
				}
			}
		}catch(Exception e){
			throw new Exception(this.getName()+"的"+e.getMessage(),e);
		}
	}

	private void checkNodeId(String nodeId) throws Exception{
		if(nodes.containsKey(nodeId)){
			throw new Exception("流程内节点必须使用唯一标识，标识重复："+nodeId);
		}
	}
	
	public String getApRole() {
		return apRole;
	}

	public String getApDepartLv() {
		return apDepartLv;
	}

	public void setApDepartLv(String apDepartLv) {
		this.apDepartLv = apDepartLv;
	}

	public StartNode getStartNode() {
		return startNode;
	}

	protected Map<String, Node> getNodes() {
		return nodes;
	}

	public Node getNode(String nodeId) {
		return nodes.get(nodeId);
	}

	public boolean isAssignFlag() {
		return assignFlag;
	}
	
	public Iterator<Entry<String, Node>> getNodeIterator(){
		return nodes.entrySet().iterator();
	}

	public JoinNode getJoinNode(String forkid){
		return joinNodes.get(forkid);
	}
	
	public Iterator<Entry<String, JoinNode>> getJoinNodeIterator(){
		return joinNodes.entrySet().iterator();
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
