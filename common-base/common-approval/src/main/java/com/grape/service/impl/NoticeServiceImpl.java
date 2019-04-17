package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.NoticeRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Mattersattention;
import com.grape.model.db.MattersattentionExample;
import com.grape.model.mapper.base.MattersattentionMapper;
import com.grape.service.NoticeService;
import com.grape.util.Util;

@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private MattersattentionMapper mattersattentionMapper;
	@Override
	public List<Mattersattention> queryByWorkid(WorkidRequest req) {
		MattersattentionExample example = new MattersattentionExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		List<Mattersattention> list = mattersattentionMapper.selectByExampleWithBLOBs(example);
		return list;
	}
	@Override
	public void insertNotice(NoticeRequest req) {
		Mattersattention matter = new Mattersattention();
		matter.setId(Util.getID());
		if("01".equals(req.getNoticetype())){
			matter.setNotice1(req.getNotice1());
		}else{
			matter.setNotice2(req.getNotice2());
		}
		matter.setNoticedate(req.getNoticedate());
		matter.setWorkid(req.getWorkid());
		mattersattentionMapper.insertSelective(matter);
		
	}

}
