package com.grape.work.task;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Custadjustlv;
import com.grape.model.db.CustadjustlvExample;
import com.grape.model.db.Custinfo;
import com.grape.model.db.CustinfoExample;
import com.grape.model.db.Custrule;
import com.grape.model.db.CustruleExample;
import com.grape.model.db.Custscore;
import com.grape.model.db.CustscoreExample;
import com.grape.model.db.Doctask;
import com.grape.model.db.Mortgage;
import com.grape.model.db.MortgageExample;
import com.grape.model.db.Mortrule;
import com.grape.model.db.MortruleExample;
import com.grape.model.mapper.base.CustruleMapper;
import com.grape.model.mapper.base.CustscoreMapper;
import com.grape.model.mapper.base.DoctaskMapper;
import com.grape.model.mapper.base.CustadjustlvMapper;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.MortgageMapper;
import com.grape.model.mapper.base.MortruleMapper;
import com.grape.service.RuleDataService;
import com.grape.workflow.Execution;
import com.grape.workflow.util.WorkUtil;

@Component
@Scope("prototype")
public class EvalCustLevelTask implements WorkTask{
	
	private Logger logger = LoggerFactory.getLogger(EvalCustLevelTask.class);
	
	@Autowired
	private CustruleMapper custruleMapper;
	
	@Autowired
	private CustinfoMapper custinfoMapper;
	
	@Autowired
	private MortruleMapper mortruleMapper;
	
	@Autowired
	private MortgageMapper mortgageMapper;
	
	@Autowired
	private CustscoreMapper custscoreMapper;
	
	@Autowired
	private RuleDataService ruleDataService;
	
	@Autowired
	private CustadjustlvMapper custadjustlvMapper;
	
	@Autowired
	private DoctaskMapper doctaskMapper;

	@Override
	public TaskResult handle(Execution execution) {
		
		//借款人资信评分
		double custScore = evalCustScore(execution);
		logger.info("final customer score : "+custScore);
		
		//抵押物评分
		double mortScore = evalmortScore(execution);
		
		//级别匹配
		String custlv = matchLevel(new BigDecimal(custScore),new BigDecimal(mortScore));
		
		//调级处理
		custlv = adjust(custlv,execution);
		
		//更新客户级别
		Doctask doctask = new Doctask();
		doctask.setWorkid(execution.getWorkId());
		doctask.setLevel(custlv);
		doctaskMapper.updateByPrimaryKeySelective(doctask);
		
		return new TaskResult();
	}

	private String adjust(String custlv,Execution execution) {
		
		if(!WorkUtil.isBlank(custlv)&&custlv.length()>0){
			char lv = custlv.charAt(0);
			
			List<Custadjustlv> list = custadjustlvMapper.selectByExample(new CustadjustlvExample());
			if(list!=null){
				Map<Object,Object> data = new HashMap<Object,Object>();
				
				data.putAll(execution.getContext().getVariables());
				
				for (Custadjustlv custadjustlv : list) {
					try{
						ruleDataService.loadExpressData(data, custadjustlv.getExpression());
						
						boolean success = WorkUtil.executeExpression(data, custadjustlv.getExpression());
						
						if(success){
							lv = (char) (lv - 1);
							break;
						}
					}catch(Exception e){
						logger.info("调级处理时运行规则["+custadjustlv.getExpression()+"]错误",e);
					}
				}
			}
			return String.valueOf(lv);
		}
		return custlv;//custlv参数错误，more返回D级
	}

	private String matchLevel(BigDecimal custScore, BigDecimal mortScore) {
		
		CustscoreExample example = new CustscoreExample();
		example.createCriteria().andStartcustgradeLessThanOrEqualTo(custScore).andEndcustgradeGreaterThan(custScore);
//			.andStartmortgradeLessThanOrEqualTo(mortScore).andEndmortgradeGreaterThan(mortScore);
		List<Custscore> list = custscoreMapper.selectByExample(example);
		if(list!=null&&!list.isEmpty()){
			return list.get(0).getCustleavel();
		}
		
		return "D";
	}

	private double evalmortScore(Execution execution) {
		BigDecimal score = new BigDecimal("0");
		
		MortgageExample example = new MortgageExample();
		example.createCriteria().andWorkidEqualTo(execution.getWorkId());
//		example.createCriteria().andWorkidEqualTo("0000000001");//测试使用
		List<Mortgage> list = mortgageMapper.selectByExample(example);
		
		List<Mortrule> rules = mortruleMapper.selectByExample(new MortruleExample());
		
		for (int i = 0; i < list.size(); i++) {
			
			Map<Object,Object> data = new HashMap<Object,Object>();
			
			data.putAll(execution.getContext().getVariables());
			
			Mortgage mort = list.get(i);
			
			data.putAll(WorkUtil.getDataFromBean("mortgage",mort));
			data.put("mortgage_data", "Y");
			
			//用于规则
			Map<Object, Object> mortgageMap = WorkUtil.getDataFromBean(mort);
			data.put("mortgage", mortgageMap);//用于Mybatis查询
			
			for (int j = 0; j < rules.size(); j++) {
				
				Mortrule rule = rules.get(j);
				try {
					
					ruleDataService.loadExpressData(data, rule.getExpression());
					
					boolean success = WorkUtil.executeExpression(data, rule.getExpression());
					
					if(success){
						score.add(rule.getScore1());
					}else{
						score.add(rule.getScore2());
					}
				
				} catch (Exception e) {
					logger.info("抵押物评分规则["+rule.getExpression()+"]运行失败",e);
					continue;
				}
			}
			
		}
		
		return score.doubleValue();
	}

	private double evalCustScore(Execution execution) {
		BigDecimal score = new BigDecimal("0");
		
		CustinfoExample example = new CustinfoExample();
		example.createCriteria().andWorkidEqualTo(execution.getWorkId()).andCusttypeLike("%1%");
//		example.createCriteria().andWorkidEqualTo("0000000001");//测试使用
		List<Custinfo> list = custinfoMapper.selectByExample(example);
		
		List<Custrule> rules = custruleMapper.selectByExample(new CustruleExample());
		
		for (int i = 0; i < list.size(); i++) {
			Map<Object,Object> data = new HashMap<Object,Object>();
			
			Custinfo custinfo = list.get(i);
			
			data.putAll(execution.getContext().getVariables());
			
			data.putAll(WorkUtil.getDataFromBean("custinfo",custinfo));//用于规则
			data.put("custinfo_data", "Y");
			
			Map<Object, Object> custinfoMap = WorkUtil.getDataFromBean(custinfo);
			data.put("custinfo", custinfoMap);//用于Mybatis查询
			
			for (int j = 0; j < rules.size(); j++) {
				Custrule rule = rules.get(j);
				try {
					
					ruleDataService.loadExpressData(data, rule.getExpression());
					
					boolean success = WorkUtil.executeExpression(data, rule.getExpression());
					
					if(success){
						score = score.add(rule.getScore1());
					}else{
						score = score.add(rule.getScore2());
					}
					logger.info("current score : "+score+" , "+rule.getDescription());
				} catch (Exception e) {
					logger.info("客户评分规则["+rule.getExpression()+"]运行失败",e);
					continue;
				}
			}
		}
		
		
		
		return score.doubleValue();
	}

}
