package com.grape.model.mapper.external;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.bean.ProductexBean;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.response.bean.ChanapprovalBean;
import com.grape.controller.response.bean.MortAndCustBean;
import com.grape.model.db.Chanapprovalform;

@Mapper
public interface ProductexMapper {
	ProductexBean selectProductex(String workid) ;
	
	ChanapprovalBean selectChanByWorkid(String workid) ;
	
	MortAndCustBean selectmortbycre(WorkidAndCerdidRequest req) ;
	
	Chanapprovalform selectChanappro(String workid) ;
}
