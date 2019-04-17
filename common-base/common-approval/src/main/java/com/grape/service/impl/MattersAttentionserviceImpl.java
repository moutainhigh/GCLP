package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Mattersattention;
import com.grape.model.db.MattersattentionExample;
import com.grape.model.mapper.base.MattersattentionMapper;
import com.grape.service.MattersAttentionservice;

@Service
public class MattersAttentionserviceImpl implements MattersAttentionservice{
	@Autowired
	private MattersattentionMapper mattersattentionMapper;
	@Override
	public Mattersattention selectMattersattention(String workid) {
		MattersattentionExample example = new MattersattentionExample();
		example.createCriteria().andWorkidEqualTo(workid);
		return mattersattentionMapper.selectByExampleWithBLOBs(example).get(0);
	}

	@Override
	public void insertMattersattention(Mattersattention mattersAttention) {
		mattersattentionMapper.insertSelective(mattersAttention) ;
	}

}
