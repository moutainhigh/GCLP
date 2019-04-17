package com.grape.service.impl;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.mapper.BaseMapper;
import com.grape.util.PageBean;
import com.grape.model.mapper.external.LogQueryExMapper;
import com.grape.service.LogQueryService;

@Service
public class LogQueryServiceImpl extends BaseMapper implements LogQueryService {

    @Autowired
    private LogQueryExMapper logQueryExMapper;

    @Override
    public PageBean  logQueryListReponse(String checktl, String type, Date startDate, Date endDate, PageBean pagebean) {
        Map<String, Object> paramMap = Maps.newHashMapWithExpectedSize(6);
        paramMap.put("checktl", checktl);
        paramMap.put("type", type);
        paramMap.put("startDate", startDate);
        paramMap.put("endDate", endDate);
        paramMap.put("pagenum", pagebean.getCurrentPage());
        paramMap.put("pagesize", pagebean.getPageSize());
        pagebean.setResultList(logQueryExMapper.logQueryList(paramMap));
        pagebean.setRecordCount(logQueryExMapper.logQueryCount(paramMap));
        return pagebean;
    }
}
