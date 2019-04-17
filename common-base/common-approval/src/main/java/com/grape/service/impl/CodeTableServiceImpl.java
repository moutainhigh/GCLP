package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.service.CodeTableService;

@Service
public class CodeTableServiceImpl implements CodeTableService{
	@Autowired
	private CodetableMapper codetableMapper;

	@Override
	public Map<String, String> getCodeMap(String type) {
		CodetableExample example = new CodetableExample();
		example.createCriteria().andCodtypEqualTo(type);
		List<Codetable> list = codetableMapper.selectByExample(example);
		Map<String, String> map = new HashMap<String, String>();
		if(list!=null && !list.isEmpty()){
			for (Codetable codetable : list) {
				map.put(codetable.getCodflg(), codetable.getCoddes());
			}
		}
		
		return map;
	}

	@Override
	public Codetable findByPrimarkey(String codtyp, String codflg) {
		
		return codetableMapper.selectByPrimaryKey(codtyp, codflg);
	}

}
