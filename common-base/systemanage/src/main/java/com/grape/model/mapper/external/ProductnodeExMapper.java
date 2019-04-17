package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Accessrule;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;

@Mapper
public interface ProductnodeExMapper {

	List<Productnode> selectByNodeInfo(Map<String, Object> map);

	List<Accessrule> selectAccessRule(Map<String, Object> map);

	List<Product> selectProductInfo(Map<String, Object> map);

	Integer selectByNodeInfoCount(Map<String, Object> map);

	Integer selectAccessRuleCount(Map<String, Object> map);

}
