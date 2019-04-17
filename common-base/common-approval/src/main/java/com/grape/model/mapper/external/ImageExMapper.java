package com.grape.model.mapper.external;

import com.grape.controller.bean.ImageBean1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ImageExMapper {

	List<ImageBean1> selectByWorkid(Map<String, Object> map);

	List<ImageBean1> selectByWorkidAndNodeid(Map<String, Object> map);

	List<ImageBean1> selectByWorkidAndNodeid1(Map<String, Object> map);

	List<ImageBean1> selectChanapprove(Map<String , Object> map) ;

}
