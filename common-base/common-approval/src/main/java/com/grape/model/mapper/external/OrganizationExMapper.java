package com.grape.model.mapper.external;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/** 
* @author cwc
* @version 创建时间：2018年12月12日 下午3:10:44  
*/
@Mapper
public interface OrganizationExMapper {

	String selectOrgnoByOrg(Map<String, Object> map);

}
