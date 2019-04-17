package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctaskExMapper {
	
		
		
		List<Map<String, Object>> findDoctaskUnfinishAll();
		
		Integer countDoctaskUnfinishAll(Map<String, String> map);
		
		List<String> findCoborrower(Map<String, String> map);
		
		List<String> findGuarantor(Map<String, String> map);
		
		List<String> findMortgagor(Map<String, String> map);
		
		List<String> findHouseno(Map<String, String> map);
		
		List<String> findCoborrower2(Map<String, String> map);
		
		List<String> findGuarantor2(Map<String, String> map);
		
		List<String> findMortgagor2(Map<String, String> map);

		List<Map<String, Object>> findDoctaskForLive();
		
		Integer countDoctaskForLive();
}
