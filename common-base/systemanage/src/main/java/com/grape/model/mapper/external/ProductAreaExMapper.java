package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.response.bean.ProductAreaBean;

@Mapper
public interface ProductAreaExMapper {

	List<ProductAreaBean> selectProductAreaInfo(Map<String, Object> map);

	Integer selectProductAreaInfoCount(Map<String, Object> map);

}
