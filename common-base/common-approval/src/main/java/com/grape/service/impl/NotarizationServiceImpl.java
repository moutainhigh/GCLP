package com.grape.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.NotarizationRequest;
import com.grape.model.db.Notarization;
import com.grape.model.mapper.base.NotarizationMapper;
import com.grape.service.NotarizationService;
import com.grape.util.Util;

@Service
public class NotarizationServiceImpl implements NotarizationService{
	private static final Logger log = LoggerFactory.getLogger(DebtinfoServiceImpl.class);
	
	@Autowired
	NotarizationMapper notarizationMapper ;
	
	@Override
	public Notarization queryByWorkid(NotarizationRequest req) {
		Notarization notar = notarizationMapper.selectByPrimaryKey(req.getWorkid()) ;
		return notar;
	}

	@Override
	public void insertNotarize(NotarizationRequest req) {
		Notarization notar = new Notarization() ;
		try {
			Util.transferFields(req, notar);
		} catch(Exception e) {
			log.info("实体类转换出错" , e);
		}
		notar.setId(Util.getID());
		notar.setWorkid(req.getWorkid());
		notarizationMapper.insert(notar) ;
	}

}
