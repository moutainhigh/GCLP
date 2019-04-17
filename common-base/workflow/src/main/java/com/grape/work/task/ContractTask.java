package com.grape.work.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Doctask;
import com.grape.model.db.Organization;
import com.grape.model.db.OrganizationExample;
import com.grape.model.mapper.base.AreaMapper;
import com.grape.model.mapper.base.DoctaskMapper;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.model.mapper.external.PaymentapplyinfoExMapper;
import com.grape.workflow.Execution;
/**
 * 生成合同编号
 * @author cwc
 *
 */
@Component
@Scope("prototype")
public class ContractTask implements WorkTask{
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(ContractTask.class);
	@Autowired
	private DoctaskMapper doctaskMapper;
	@Autowired
	private AreaMapper cityMapper;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private OrganizationMapper organizationMapper;
	@Autowired
	private PaymentapplyinfoExMapper paymentapplyinfoExMapper;
	@Override
	public TaskResult handle(Execution execution) {
		TaskResult task = new TaskResult();
		handleLowerHousehold(execution);
		task.setResult(true);
		return task;
	}
	public void handleLowerHousehold(Execution execution){
		Doctask doc = new Doctask();
		doc.setWorkid(execution.getWorkId());
		StringBuffer sb = new StringBuffer();
		Doctask doctask = doctaskMapper.selectByPrimaryKey(execution.getWorkId());
		//获取城市首字母缩写
		String area = cityMapper.selectByPrimaryKey(doctask.getAreaid()).getCityab();
		//获取渠道编号
		String chanorg = doctask.getChannelno();
		OrganizationExample example = new OrganizationExample();
		example.createCriteria().andOrganizationnoEqualTo(chanorg);
		Organization organization = organizationMapper.selectByExample(example).get(0);
		String chanofch = organization.getOrgofch();
		//获取资金方编号
		String fundorg = doctask.getFundno();
		OrganizationExample example1 = new OrganizationExample();
		example1.createCriteria().andOrganizationnoEqualTo(fundorg);
		Organization organization1 = organizationMapper.selectByExample(example1).get(0);
		String fundofch = organization1.getOrgofch();
		//获取产品类型
		String producttype = productMapper.selectByPrimaryKey(doctask.getProductno()).getProducttype();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		//获取当天日期
		String loandate=sdf.format(date);
		Date startDate = ContractTask.getStartTime();
		Date endDate = ContractTask.getEndTime();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		int count = paymentapplyinfoExMapper.findPaymentByDate(map);
		//获取当天方放款笔数+1
		String paymentcount="";
		if(count<9){
			paymentcount="00"+(count+1);
		}else if(count<99 && count>9){
			paymentcount="0"+(count+1);
		}else{
			paymentcount=""+(count+1);
		}
		sb.append(fundofch).append("-1");
		if(producttype.equals("1")){
			sb.append("F-").append(chanofch).append("(").append(area).append(")-").append(loandate).append(paymentcount);
		}else{
			sb.append("S-").append(chanofch).append("(").append(area).append(")-").append(loandate).append(paymentcount);;
		}
		doc.setContractno(sb.toString());
		doctaskMapper.updateByPrimaryKeySelective(doc);
		log.info("保存合同编号成功");
	}
	
	private static Date getStartTime() {
		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR, 0);
		todayStart.set(Calendar.MINUTE, 0);
		todayStart.set(Calendar.SECOND, 0);
		todayStart.set(Calendar.MILLISECOND, 0);
		return todayStart.getTime();
	}
 
	private static Date getEndTime() {
		Calendar todayEnd = Calendar.getInstance();
		todayEnd.set(Calendar.HOUR, 23);
		todayEnd.set(Calendar.MINUTE, 59);
		todayEnd.set(Calendar.SECOND, 59);
		todayEnd.set(Calendar.MILLISECOND, 999);
		return todayEnd.getTime();
	}


}
