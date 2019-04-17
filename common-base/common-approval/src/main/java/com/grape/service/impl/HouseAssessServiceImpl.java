package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Houseassess;
import com.grape.model.db.HouseassessExample;
import com.grape.model.mapper.base.HouseassessMapper;
import com.grape.service.HouseAssessService;
@Service
public class HouseAssessServiceImpl implements HouseAssessService {

	@Autowired
	HouseassessMapper houseAssessMapper;
	@Override
	public List<Houseassess> findHouseAssessList(String workid, String mortgageno) {
		HouseassessExample example = new HouseassessExample();
		example.createCriteria().andWorkidEqualTo(workid).andMortgagenoEqualTo(mortgageno);
		List<Houseassess> houseassesses =  houseAssessMapper.selectByExample(example);
		return houseassesses;
	}

}
