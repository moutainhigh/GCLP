package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.ProductInfo;
@Mapper
public interface ProductExMapper {
	
	List<ProductInfo> findProductInfoByParam(Map<String, String> param);
	List<ProductInfo> ProductUse(Map<String, String> param);
	Integer countProductAll(Map<String, String> param);
	Integer countProductList(Map<String, String> param);
}
