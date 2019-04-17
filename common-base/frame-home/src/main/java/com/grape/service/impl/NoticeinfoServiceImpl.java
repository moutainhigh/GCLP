package com.grape.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Noticeinfo;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.PageBean;
import com.grape.model.mapper.base.NoticeinfoMapper;
import com.grape.model.mapper.external.NoticeinfoExMapper;
import com.grape.service.NoticeinfoService;

@Service
public class NoticeinfoServiceImpl extends BaseMapper implements NoticeinfoService {

	@Autowired
	NoticeinfoMapper noticeinfoMapper;
	
	@Autowired
	NoticeinfoExMapper noticeinfoExMapper;
	@Override
	public boolean NoticeinfoAdd(Noticeinfo noticeinfo) {
		int flag;
		flag = noticeinfoMapper.insert(noticeinfo);
		if(flag==1){
			return true;
		}
		return false;
	}


	@Override
	public List<Noticeinfo> findNoticeinfosByDate(PageBean pageBean) {
		
		List<Noticeinfo> noticeinfos = queryList(NoticeinfoExMapper.class,"findNoticeinfosByDate", pageBean);
		int count = noticeinfoExMapper.countNoticeinfosByDate();
		pageBean.setRecordCount(count);
		if(noticeinfos.size()>0){
			return noticeinfos;
		}
		return null;	}

	@Override
	public List<Noticeinfo> findNoticeinfoByDateOf(Date startdate, Date enddate, PageBean pageBean) {
		Map<String, Object> param = new HashMap<>();
		param.put("startdate", startdate);
		param.put("enddate", enddate);
		List<Noticeinfo> noticeinfos = queryList(NoticeinfoExMapper.class, "findNoticeinfosByDateOf", param, pageBean);
		int count = noticeinfoExMapper.countNoticeinfosByDateOf();
		pageBean.setRecordCount(count);
		if(noticeinfos.size()>0){
			return noticeinfos;
		}
		return null;
	}

	

}
