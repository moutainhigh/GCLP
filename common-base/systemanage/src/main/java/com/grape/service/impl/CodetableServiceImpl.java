package com.grape.service.impl;

import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.service.CodetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class CodetableServiceImpl implements CodetableService {

    @Autowired
    private CodetableMapper codetableMapper ;

    @Override
    public List<Codetable> selectcoddesAndflg(String codtyp) {
        CodetableExample codetableExample = new CodetableExample();
        codetableExample.createCriteria().andCodtypEqualTo(codtyp) ;
        List<Codetable> codetableList = codetableMapper.selectByExample(codetableExample);
        if(!CollectionUtils.isEmpty(codetableList)) {
            return codetableList ;
        }
        return null;
    }

	@Override
	public Codetable selectCodetableByCodtypAndflg(String codflg, String codtyp) {
		CodetableExample codetableExample = new CodetableExample();
        codetableExample.createCriteria().andCodtypEqualTo(codtyp).andCodflgEqualTo(codflg) ;
        List<Codetable> codetableList = codetableMapper.selectByExample(codetableExample);
        if(!CollectionUtils.isEmpty(codetableList)) {
            return codetableList.get(0) ;
        }
        return null;
	}
}
