package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.ConstractBean;

@Mapper
public interface ContractExMapper {

	List<ConstractBean> selectContractInfo(Map<String, Object> map);

	Integer selectContractInfoCount(Map<String, Object> map);

}
