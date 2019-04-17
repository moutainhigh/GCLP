package com.grape.model.mapper.external;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Chanapprovalform;


@Mapper
public interface ChanapprovalformExMapper {
	
	/**
	 * 查询抵押物信息审查列表
	 * @param workid
	 * @return
	 */
	List<Chanapprovalform> findMortgagenoteByMap(String workid);
	
	/**
	 * 根据节点查询审查信息
	 * @param workid
	 * @return
	 */
	List<Chanapprovalform> findChanapprovalformByMap(Map<String, String> map);

	Chanapprovalform selectTempChanapprovalform(Map<String, String> map);
}
