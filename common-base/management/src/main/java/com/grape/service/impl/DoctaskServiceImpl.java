package com.grape.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.DoctaskListBean;
import com.grape.controller.reponse.bean.UserOfOrgBean;
import com.grape.model.mapper.BaseMapper;
import com.grape.util.PageBean;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.DoctaskService;

@Service
public class DoctaskServiceImpl extends BaseMapper implements DoctaskService {

    @Autowired
    private DoctaskExMapper doctaskExMapper;

    @Override
    public PageBean doctaskListReponse(Date startDate, Date endDate, String nodeid, String productno, String workid,
                                       String custname, String cerdid, String houseno, PageBean pageBean, UserOfOrgBean userOfOrgBean) {
        HashMap<String, Object> paramMap1 = new HashMap<String, Object>();
        paramMap1.put("startDate", startDate);
        paramMap1.put("endDate", endDate);
        paramMap1.put("nodeid", nodeid);
        paramMap1.put("productno", productno);
        paramMap1.put("workid", workid);
        paramMap1.put("custname", custname);
        paramMap1.put("cerdid", cerdid);
        paramMap1.put("houseno", houseno);
        paramMap1.put("pagenum", pageBean.getCurrentPage());
        paramMap1.put("pagesize", pageBean.getPageSize());
        paramMap1.put("plevel", userOfOrgBean.getPlevel());
        paramMap1.put("workerid", userOfOrgBean.getWorkerid());
        paramMap1.put("dlevel", userOfOrgBean.getDlevel());
        paramMap1.put("departmentno", userOfOrgBean.getDepartmentno());
        paramMap1.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        paramMap1.put("organizationno", userOfOrgBean.getOrganizationno());
        List<DoctaskListBean> doctaskListBean = doctaskExMapper.doctaskList(paramMap1);
        for (DoctaskListBean doctask : doctaskListBean) {
            HashMap<String, Object> ParamMap2 = new HashMap<String, Object>();
            ParamMap2.put("workid", doctask.getWorkid());
            doctask.setCoborrower(doctaskExMapper.getcoborrower(ParamMap2));
            doctask.setGuarantor(doctaskExMapper.getguarantor(ParamMap2));
            doctask.setMortgagor(doctaskExMapper.getmortgagor(ParamMap2));
            doctask.setHouseid(doctaskExMapper.gethouseid(ParamMap2));
        }
        pageBean.setResultList(doctaskListBean);
        pageBean.setRecordCount(doctaskExMapper.doctaskCount(paramMap1));
        return pageBean;
    }

    @Override
    public PageBean backlogListReponse(Date startDate, Date endDate, String nodeid, String productno,
                                       String workid, String custname, String cerdid, String houseno, String processflg, PageBean pageBean) {
        HashMap<String, Object> ParamMap = new HashMap<String, Object>();
        ParamMap.put("startDate", startDate);
        ParamMap.put("endDate", endDate);
        ParamMap.put("nodeid", nodeid);
        ParamMap.put("productno", productno);
        ParamMap.put("workid", workid);
        ParamMap.put("custname", custname);
        ParamMap.put("cerdid", cerdid);
        ParamMap.put("houseno", houseno);
        ParamMap.put("processflg", processflg);
        ParamMap.put("pagenum", pageBean.getCurrentPage());
        ParamMap.put("pagesize", pageBean.getPageSize());
        ParamMap.put("userid", SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        List<DoctaskListBean> backlogListBean = doctaskExMapper.backlogList(ParamMap);
        for (DoctaskListBean backlog : backlogListBean) {
            HashMap<String, Object> ParamMap2 = new HashMap<String, Object>();
            ParamMap2.put("workid", backlog.getWorkid());
            backlog.setCoborrower(doctaskExMapper.getcoborrower(ParamMap2));
            backlog.setGuarantor(doctaskExMapper.getguarantor(ParamMap2));
            backlog.setMortgagor(doctaskExMapper.getmortgagor(ParamMap2));
            backlog.setHouseid(doctaskExMapper.gethouseid(ParamMap2));
        }
        pageBean.setResultList(backlogListBean);
        pageBean.setRecordCount(doctaskExMapper.backlogCount(ParamMap));
        return pageBean;
    }

    @Override
    public PageBean rolloverListReponse(Date startDate, Date endDate, String nodeid, String productno, String workid,
                                        String custname, String cerdid, String houseno, PageBean pageBean, UserOfOrgBean userOfOrgBean) {
        HashMap<String, Object> paramMap1 = new HashMap<String, Object>();
        paramMap1.put("startDate", startDate);
        paramMap1.put("endDate", endDate);
        paramMap1.put("nodeid", nodeid);
        paramMap1.put("productno", productno);
        paramMap1.put("workid", workid);
        paramMap1.put("custname", custname);
        paramMap1.put("cerdid", cerdid);
        paramMap1.put("houseno", houseno);
        paramMap1.put("pagenum", pageBean.getCurrentPage());
        paramMap1.put("pagesize", pageBean.getPageSize());
        paramMap1.put("plevel", userOfOrgBean.getPlevel());
        paramMap1.put("workerid", userOfOrgBean.getWorkerid());
        paramMap1.put("dlevel", userOfOrgBean.getDlevel());
        paramMap1.put("departmentno", userOfOrgBean.getDepartmentno());
        paramMap1.put("orgbelongsto", userOfOrgBean.getOrgbelongsto());
        paramMap1.put("organizationno", userOfOrgBean.getOrganizationno());
        List<DoctaskListBean> rolloverList = doctaskExMapper.rolloverList(paramMap1);
        for (DoctaskListBean rollover : rolloverList) {
            HashMap<String, Object> ParamMap2 = new HashMap<String, Object>();
            ParamMap2.put("workid", rollover.getWorkid());
            rollover.setCoborrower(doctaskExMapper.getcoborrower(ParamMap2));
            rollover.setGuarantor(doctaskExMapper.getguarantor(ParamMap2));
            rollover.setMortgagor(doctaskExMapper.getmortgagor(ParamMap2));
            rollover.setHouseid(doctaskExMapper.gethouseid(ParamMap2));
        }
        pageBean.setResultList(rolloverList);
        pageBean.setRecordCount(doctaskExMapper.rolloverCount(paramMap1));
        return pageBean;
    }

    @Override
    public UserOfOrgBean getUserOfOrg() {
        String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(2);
        paramMap.put("workerid", username);
        paramMap.put("mobilephone", username);
        return doctaskExMapper.getUserOfOrg(paramMap);
    }

}
