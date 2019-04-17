package com.grape.service.impl;


import com.grape.model.mapper.base.ShufflingfigureMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Shufflingfigure;
import com.grape.model.db.ShufflingfigureExample;
import com.grape.service.ShufflingfigureService;
@Service
public class ShufflingfigureServiceImpl implements ShufflingfigureService {
	@Autowired
	ShufflingfigureMapper shufflingfigureMapper;
	@Override
	public List<Shufflingfigure> findShufflingfigurePC() {
		ShufflingfigureExample example =new ShufflingfigureExample();
		example.createCriteria().andUseflgEqualTo("Y").andTypeEqualTo("PC");
		List<Shufflingfigure> shufflingfigures = shufflingfigureMapper.selectByExample(example);
		if(shufflingfigures.size()>0)
			return shufflingfigures;
		return null;
	}
	@Override
	public List<Shufflingfigure> findShufflingfigureAPP() {
		ShufflingfigureExample example =new ShufflingfigureExample();
		example.createCriteria().andUseflgEqualTo("Y").andTypeEqualTo("APP");
		List<Shufflingfigure> shufflingfigures = shufflingfigureMapper.selectByExample(example);
		if(shufflingfigures.size()>0)
			return shufflingfigures;
		return null;
	}

}
