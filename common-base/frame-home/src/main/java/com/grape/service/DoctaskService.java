package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.bean.DoctaskUnfinish;
import com.grape.controller.reponse.bean.DoctaskUnfinish2;
import com.grape.model.db.Doctask;
import com.grape.model.mapper.PageBean;

public interface DoctaskService {
		
		Doctask findDoctaskByWorkid(String workid);
		
		boolean updateDoctask(Doctask doctask);
		
		boolean deleteDoctaskWith(Doctask doctask);
		
		DoctaskUnfinish2 findDoctaskUnfinish(String workid);
		
		List<DoctaskUnfinish> findDoctaskUnfinishAll(PageBean pageBean);
		
		List<DoctaskUnfinish> findDoctaskForLive(PageBean pageBean);
}
