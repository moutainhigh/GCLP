package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.bean.WaihuCustinfo;
@Mapper
public interface CustinfoExMapper {
	public List<WaihuCustinfo> findMainborrower(Map<String, String> map);
	public List<WaihuCustinfo> findCoborrower(Map<String, String> map);
	public List<WaihuCustinfo> findGuarantor(Map<String, String> map);
	public List<WaihuCustinfo> findMortgagor(Map<String, String> map);
}
