package com.grape.service.impl;

import java.util.List;

import com.grape.controller.request.IdRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ProcnodefileRequest;
import com.grape.model.db.Procnodefile;
import com.grape.model.db.ProcnodefileExample;
import com.grape.model.mapper.base.ProcnodefileMapper;
import com.grape.service.ProcnodefileService;

@Service
public class ProcnodefileServiceImpl implements ProcnodefileService{

	@Autowired
	private ProcnodefileMapper procnodefileMapper ;
	
	@Override
	public List<Procnodefile> queryByNodeidAndProno(ProcnodefileRequest req) {
		ProcnodefileExample example = new ProcnodefileExample() ;
		example.createCriteria().andNodeidEqualTo(req.getNodeid()).andPriductnoEqualTo(req.getPriductno()) ;
		return procnodefileMapper.selectByExample(example);
	}

	@Override
	public List<Procnodefile> queryByFiletype(IdRequest req) {
		ProcnodefileExample example = new ProcnodefileExample() ;
		example.createCriteria().andFiletypeEqualTo(req.getId()) ;
		return procnodefileMapper.selectByExample(example);
	}

}
