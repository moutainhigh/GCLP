package com.grape.service;

import java.util.List;

import com.grape.model.db.Houseassess;

public interface HouseAssessService {
	
	/**
	 * 查询抵押物评估信息列表
	 * @param workid 流水号
	 * @param mortgageno 抵押物编号
	 * @return
	 */
	List<Houseassess> findHouseAssessList(String workid,String mortgageno);
}
