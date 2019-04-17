package com.grape.work.task;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Accessrule;
import com.grape.model.db.AccessruleExample;
import com.grape.model.db.Mattersattention;
import com.grape.model.db.MattersattentionExample;
import com.grape.model.db.Product;
import com.grape.model.mapper.base.AccessruleMapper;
import com.grape.model.mapper.base.MattersattentionMapper;
import com.grape.security.Util;
import com.grape.service.ProductService;
import com.grape.service.RuleDataService;
import com.grape.workflow.Execution;
import com.grape.workflow.util.WorkUtil;

public abstract class AbstactRuleTask implements WorkTask{
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AccessruleMapper accessruleMapper;

	@Autowired
	private MattersattentionMapper mattersattentionMapper;
	
	@Autowired
	private RuleDataService ruleDataService;
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 
	 * @param execution
	 * @param type 1:准入审批规则 ,2:风控审批规则
	 * @return
	 */
	public TaskResult handle2(Execution execution,String type) {
		
		//当前贷款产品的审批规则
		TaskResult currentProductResult = handleProductRule(execution, execution.getWorkItem().getWorkproc().getProcess(), false,type);
		if(!currentProductResult.isResult()&&"1".equals(type)){
			boolean exsit = false;
			List<Product> products = productService.getAllProduct();
			if(products!=null){
				for (Product product : products) {
					//其他贷款产品的审批规则
					TaskResult otherProductResult = handleProductRule(execution, product.getProductno(), true,type);
					
					if(otherProductResult.isResult()){
						currentProductResult.addDescription("\n推荐选择产品["+product.getProductname()+"]");
						exsit = true;
					}
				}
			}
			if(!exsit){//如果不存在符合要求的贷款产品
				currentProductResult.addDescription("\n申请信息找不到符合审批要求的贷款产品");
			}else{
				currentProductResult.prependDescription("\n申请信息不符合当前产品审批要求");
			}
		}
		
		return currentProductResult;
	}
	
	/**
	 * 准入类型[admittancetype]
	 * 	1：命中准入
	 * 	2：不命中准入
	 * 	3：命中拒绝
	 * 	3：不命中拒绝
	 * 	5：只进行校验提示
	 * 
	 * 提示尽调类型[isattention]
	 * 	1.命中时提示尽调
	 * 	2.不命中时提示尽调
	 * 	3.不提示
	 * 
	 * 提示审批类型[isworkidtice]
	 * 	1.命中时提示尽调
	 * 	2.不命中时提示尽调
	 * 	3.不提示
	 * 
	 */
	public TaskResult handleProductRule(Execution execution,String productno,boolean other,String type) {
		AccessruleExample example = new AccessruleExample();
		example.createCriteria().andProductnoEqualTo(productno).andRulestypeEqualTo(type);
		List<Accessrule> list = accessruleMapper.selectByExample(example);
		TaskResult taskResult = new TaskResult();
		if(list!=null){
			//数据格式按规范装载：TABLENAME.COLNAME
			Map<Object, Object> data = execution.getContext().getVariables();
			StringBuilder attentMsg = new StringBuilder();//尽调注意事项
			StringBuilder approveMsg = new StringBuilder();//审批注意事项
			StringBuilder totaleMsg = new StringBuilder();//审批注意事项
			int dueAttentCount = 0;
			int appAttentCount = 0;
			
			StringBuilder refuseMsg = new StringBuilder();//拒绝信息
			for (Accessrule rule : list) {
				try{
					Set<String> groups = WorkUtil.getExpressionRuleGroup(rule.getExpression());
					List<Map<Object,Object>> localListMap = null;//只允许一个数据源存在多条记录，该变量进行缓存
					if(groups!=null){
						for (String group : groups) {
							if("Y".equals(data.get(group+"_data"))){
								continue;
							}
							if(data.get(group+"_cache_list")!=null){
								if(localListMap==null){
									localListMap = (List<Map<Object, Object>>) data.get(group+"_cache_list");
									continue;
								}else{
									throw new Exception("规则["+rule.getExpression()+"]加载数据错误，存在多个数据源查询结果集多条记录");
								}
							}
							List<Map<Object,Object>> result = ruleDataService.getDataBySql(group, data);
							if(result!=null){
								if(result.size()>1){//存在多条记录
									if(localListMap==null){
										localListMap = result;
										data.put(group+"_cache_list",result);//多条记录，缓存数据
									}else{
										throw new Exception("规则["+rule.getExpression()+"]加载数据错误，存在多个数据源查询结果集多条记录");
									}
								}else if(result.size()==1){
									
									data.put(group+"_data","Y");//单条记录，标记已加载
									
									data.putAll(result.get(0));
								}
								
							}
						}
					}
					
					if(localListMap!=null){//存在多条记录数据源
						
						for (Map<Object, Object> map : localListMap) {
							
							map.putAll(data);
							
							boolean success = WorkUtil.executeExpression(map, rule.getExpression());
							String prefix = success?"[命  中]":"[不命中]";
							totaleMsg.append(prefix+WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
							if("1".equals(rule.getAdmittancetype())){//1:命中准入
								if(success){//命中
									
									if("1".equals(rule.getIsattention())){//命中时提示尽调
										attentMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											dueAttentCount++;
										}
									}else if("2".equals(rule.getIsattention())){//不命中时提示尽调
										attentMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											dueAttentCount++;
										}
									}//其他不提示
									
									if("1".equals(rule.getIsworkidtice())){//命中时提示审批
										approveMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											appAttentCount++;
										}
									}else if("2".equals(rule.getIsworkidtice())){//不命中时提示审批
										approveMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											appAttentCount++;
										}
									}//其他不提示
									
								}else{//不命中
									refuseMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");//填写拒绝信息
								}
								
							}else if("2".equals(rule.getAdmittancetype())){//2:不命中准入
								if(success){//命中
									
									refuseMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");//填写拒绝信息
									
								}else{//不命中
									if("1".equals(rule.getIsattention())){//命中时提示尽调
										attentMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											dueAttentCount++;
										}
									}else if("2".equals(rule.getIsattention())){//不命中时提示尽调
										attentMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											dueAttentCount++;
										}
									}//其他不提示
									
									if("1".equals(rule.getIsworkidtice())){//命中时提示审批
										approveMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											appAttentCount++;
										}
									}else if("2".equals(rule.getIsworkidtice())){//不命中时提示审批
										approveMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
										if("1".equals(rule.getValidtype())){
											appAttentCount++;
										}
									}//其他不提示
								}
								
							}else if("3".equals(rule.getAdmittancetype())){//命中拒绝
								
								if(success){//命中
									refuseMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");//填写拒绝信息
								}
								
							}else if("4".equals(rule.getAdmittancetype())){//不命中拒绝
								
								if(!success){//不命中
									refuseMsg.append(WorkUtil.replaceWithParams(map, WorkUtil.replaceWithParams(map, rule.getRemark()))+"\n");//填写拒绝信息
								}
								
							}else if("5".equals(rule.getAdmittancetype())){//只作提示
								
								if("1".equals(rule.getIsattention())&&success){//命中时提示尽调
									attentMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										dueAttentCount++;
									}
								}else if("2".equals(rule.getIsattention())&&!success){//不命中时提示尽调
									attentMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										dueAttentCount++;
									}
								}//其他不提示
								
								if("1".equals(rule.getIsworkidtice())&&success){//命中时提示审批
									approveMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										appAttentCount++;
									}
								}else if("2".equals(rule.getIsworkidtice())&&!success){//不命中时提示审批
									approveMsg.append(WorkUtil.replaceWithParams(map, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										appAttentCount++;
									}
								}//其他不提示
								
							}else{
								logger.warn("无法识别的命中类型["+rule.getAdmittancetype()+"]");
							}
							
						}
						
					}else{//不存在多条记录数据源
						
						boolean success = WorkUtil.executeExpression(data, rule.getExpression());
						String prefix = success?"[命  中]":"[不命中]";
						totaleMsg.append(prefix+WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
						if("1".equals(rule.getAdmittancetype())){//1:命中准入
							if(success){//命中
								
								if("1".equals(rule.getIsattention())){//命中时提示尽调
									attentMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										dueAttentCount++;
									}
								}else if("2".equals(rule.getIsattention())){//不命中时提示尽调
									attentMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										dueAttentCount++;
									}
								}//其他不提示
								
								if("1".equals(rule.getIsworkidtice())){//命中时提示审批
									approveMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										appAttentCount++;
									}
								}else if("2".equals(rule.getIsworkidtice())){//不命中时提示审批
									approveMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										appAttentCount++;
									}
								}//其他不提示
								
							}else{//不命中
								refuseMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");//填写拒绝信息
							}
							
						}else if("2".equals(rule.getAdmittancetype())){//2:不命中准入
							if(success){//命中
								
								refuseMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");//填写拒绝信息
								
							}else{//不命中
								if("1".equals(rule.getIsattention())){//命中时提示尽调
									attentMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										dueAttentCount++;
									}
								}else if("2".equals(rule.getIsattention())){//不命中时提示尽调
									attentMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										dueAttentCount++;
									}
								}//其他不提示
								
								if("1".equals(rule.getIsworkidtice())){//命中时提示审批
									approveMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										appAttentCount++;
									}
								}else if("2".equals(rule.getIsworkidtice())){//不命中时提示审批
									approveMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
									if("1".equals(rule.getValidtype())){
										appAttentCount++;
									}
								}//其他不提示
							}
							
						}else if("3".equals(rule.getAdmittancetype())){//命中拒绝
							
							if(success){//命中
								refuseMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");//填写拒绝信息
							}
							
						}else if("4".equals(rule.getAdmittancetype())){//不命中拒绝
							
							if(!success){//不命中
								refuseMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");//填写拒绝信息
							}
							
						}else if("5".equals(rule.getAdmittancetype())){//只作提示
							
							if("1".equals(rule.getIsattention())&&success){//命中时提示尽调
								attentMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
								if("1".equals(rule.getValidtype())){
									dueAttentCount++;
								}
							}else if("2".equals(rule.getIsattention())&&!success){//不命中时提示尽调
								attentMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
								if("1".equals(rule.getValidtype())){
									dueAttentCount++;
								}
							}//其他不提示
							
							if("1".equals(rule.getIsworkidtice())&&success){//命中时提示审批
								approveMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
								if("1".equals(rule.getValidtype())){
									appAttentCount++;
								}
							}else if("2".equals(rule.getIsworkidtice())&&!success){//不命中时提示审批
								approveMsg.append(WorkUtil.replaceWithParams(data, rule.getRemark())+"\n");
								if("1".equals(rule.getValidtype())){
									appAttentCount++;
								}
							}//其他不提示
							
						}else{
							logger.warn("无法识别的命中类型["+rule.getAdmittancetype()+"]");
						}
					}
					
					
				}catch(Exception e){
					logger.warn("运行准入规则["+rule.getExpression()+"]错误");
				}
			}
			
			if(!other){
				if(refuseMsg.length()!=0){
					taskResult.setResult(false);
					taskResult.setDescription(refuseMsg.toString());
				}else{
					taskResult.setResult(true);
					
					if("2".equals(type)){
						
						MattersattentionExample exmaple = new MattersattentionExample();
						exmaple.createCriteria().andWorkidEqualTo(execution.getWorkId());
						exmaple.setOrderByClause(" id desc ");
						List<Mattersattention> list2 = mattersattentionMapper.selectByExample(exmaple);
						if(list2!=null && !list2.isEmpty()){
							Mattersattention mattersattention = list2.get(0);
							mattersattention.setNotice2(Util.outObj(mattersattention.getNotice2())+Util.outObj(approveMsg.toString()).replaceAll("[\n]", "<br/>"));
							mattersattention.setNoticecount2((long)appAttentCount);
							mattersattention.setNotice3(Util.outObj(mattersattention.getNotice3())+"\n"+Util.outObj(totaleMsg.toString()).replaceAll("[\n]", "<br/>"));
							mattersattentionMapper.updateByPrimaryKeySelective(mattersattention);
						}
						
					}else{
						
						Mattersattention mattersattention = new Mattersattention();
						mattersattention.setId(Util.getID());
						mattersattention.setNotice1(Util.outObj(attentMsg.toString()).replaceAll("[\n]", "<br/>"));
						mattersattention.setNoticecount1((long)dueAttentCount);
						mattersattention.setNotice2(Util.outObj(approveMsg.toString()).replaceAll("[\n]", "<br/>"));
						mattersattention.setNoticecount2((long)appAttentCount);
						mattersattention.setNotice3(Util.outObj(totaleMsg.toString()).replaceAll("[\n]", "<br/>"));
						mattersattention.setWorkid(execution.getWorkId());
						mattersattention.setNoticedate(new Date());
						
						mattersattentionMapper.insert(mattersattention);
						
					}
					
				}
			}else{
				if(refuseMsg.length()!=0){
					taskResult.setResult(false);
				}else{
					taskResult.setResult(true);
				}
			}
			
		}
		return taskResult;
	}

}
