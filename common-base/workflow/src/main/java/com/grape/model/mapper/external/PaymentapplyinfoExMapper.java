package com.grape.model.mapper.external;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface PaymentapplyinfoExMapper {
	Integer findPaymentByDate(Map<String,Object> map);

	String selectOrgByUserid(Map<String, Object> map);
}
