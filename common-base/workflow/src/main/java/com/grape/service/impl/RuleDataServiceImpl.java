package com.grape.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.external.RuleDataExMapper;
import com.grape.service.RuleDataService;
import com.grape.workflow.Execution;
import com.grape.workflow.util.WorkUtil;

@Service
public class RuleDataServiceImpl extends BaseMapper implements RuleDataService {
	
	@Override
	public List<Map<Object,Object>> getDataBySql(String sqlid, Map<Object, Object> params) throws Exception {
		List<Map<String,String>> list = queryList(RuleDataExMapper.class, sqlid, params);
		//转出带前缀格式数据map
		List<Map<Object,Object>> result = new ArrayList<Map<Object,Object>>();
		if(list!=null&&!list.isEmpty()){
			for (Map<String, String> map : list) {
				Map<Object,Object> temp = new HashMap<Object,Object>();
				result.add(temp);
				if(map!=null){
					Set<String> keys = map.keySet();
					for (String key : keys) {
						if(key!=null&&!key.contains(".")){
							temp.put(sqlid+"."+key, map.get(key));
						}else{
							temp.put(key, map.get(key));
						}
					}
				}
			}
		}
		return result;
	}

	@Override
	/**
	 * 该方法只用于加载查询结果为单条记录的数据源的数据，若存在多条记录，需要各自查询处理，可以参考PreproveTask.handle方法
	 */
	public void loadExpressData(Execution execution, String expression) throws Exception {
		
		Map<Object, Object> data = execution.getContext().getVariables();
		loadExpressData(data, expression);
		
	}

	@Override
	public void loadExpressData(Map<Object, Object> data, String expression) throws Exception {
		
		Set<String> groups = WorkUtil.getExpressionRuleGroup(expression);
		if(groups!=null){
			for (String group : groups) {
				if("Y".equals(data.get(group+"_data"))){
					continue;
				}
				List<Map<Object,Object>> result = getDataBySql(group, data);
				if(result!=null){
					if(result.size()>=1){//存在多条记录
						
						data.put(group+"_data","Y");//单条记录，标记已加载
						
						data.putAll(result.get(0));
						
					}
				}
			}
		}
		
	}

}
