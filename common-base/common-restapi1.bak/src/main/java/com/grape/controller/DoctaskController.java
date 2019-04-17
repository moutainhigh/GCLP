package com.grape.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.grape.controller.reponse.ReponseBean;
import com.grape.security.Util;
import com.grape.service.ConsultService;
import com.grape.service.DoctaskService;
import com.grape.service.RepayfollowService;
import com.grape.service.RepayinfoService;
import com.grape.service.RepayplanService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/doctask")
@Validated
public class DoctaskController {

	@Autowired
	private DoctaskService doctaskService;
	@Autowired
	private RepayplanService repayplanService;
	@Autowired
	private RepayinfoService repayinfoService;
	@Autowired
	private ConsultService consultService;
	@Autowired
	private RepayfollowService repayfollowService;

	@ApiOperation(value = "时间控件赋值",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/1timeassignment")
	public ReponseBean timeassignment() {
		String endDate=Util.getDate();
		String startDate=Util.addDays(endDate, -7);
		List<String> list = Lists.newArrayList(endDate,startDate); 
		return new ReponseBean(list);
	}

	
	
	@ApiOperation(value = "流水查询",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/2findBycondition")
	public ReponseBean findBycondition(@RequestParam("startDate") Date startDate,@RequestParam("endDate") Date endDate,
			String channo,String departmentno,String areaid,String userid,String productno) {
		return new ReponseBean(doctaskService.findBycondition(startDate, endDate, channo, departmentno, areaid, userid, productno, 0, 10));
	}

	
	
	@ApiOperation(value = "主键获取流水信息",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/3doctaskfindByworkid")
	public ReponseBean doctaskfindByworkid(@RequestParam("workid") String workid) {
		return new ReponseBean(doctaskService.findByworkid(workid));
	}
	@ApiOperation(value = "主键获取还款计划",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/4repayplanfindByworkid")
	public ReponseBean repayplanfindByworkid(@RequestParam("workid") String workid) {
		return new ReponseBean(repayplanService.findByworkid(workid, 0, 3));
	}
	@ApiOperation(value = "主键获取还款记录",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/5repayinfofindByworkid")
	public ReponseBean repayinfofindByworkid(@RequestParam("workid") String workid) {
		return new ReponseBean(repayinfoService.findByworkid(workid, 0, 3));
	}
	@ApiOperation(value = "主键获取查档记录",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/6consultfindByworkid")
	public ReponseBean consultfindByworkid(@RequestParam("workid") String workid) {
		return new ReponseBean(consultService.findByworkid(workid, 0, 3));
	}
	@ApiOperation(value = "主键获取跟进记录",httpMethod="POST",notes="测试用接口",response=ReponseBean.class)
	@RequestMapping("/7repayfollowfindByworkid")
	public ReponseBean repayfollowfindByworkid(@RequestParam("workid") String workid) {
		return new ReponseBean(repayfollowService.findByworkid(workid, 0, 3));
	}
	
	
	
}
