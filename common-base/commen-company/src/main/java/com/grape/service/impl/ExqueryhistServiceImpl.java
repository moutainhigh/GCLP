package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.grape.controller.bean.MessageDetail;
import com.grape.model.db.Exqueryhist;
import com.grape.model.mapper.base.ExqueryhistMapper;
import com.grape.service.ExqueryhistService;
import org.springframework.stereotype.Service;
@Service
public class ExqueryhistServiceImpl implements ExqueryhistService {
	
	@Autowired
	ExqueryhistMapper exqueryhistMapper;
	@Override
	public void insertExqueryhist(Exqueryhist exqueryhist) throws Exception {
		try {
			if(exqueryhistMapper.insert(exqueryhist)<=0){
				throw new Exception(MessageDetail.INSERT_ERROR);
			}
		} catch (Exception e) {
			throw new Exception(MessageDetail.INSERT_ERROR+e.getMessage());
		}

	}

}
