package com.grape.model.mapper.external;

import com.grape.controller.request.SmsparamOptionRequest;
import com.grape.controller.response.bean.SmsparamByOptionBean;
import com.grape.model.db.Smsparam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SmsparamExMapper {
   List<Smsparam> querySmsparamByOption(Map<String , Object> map) ;

Integer querySmsparamByOptionCount(Map<String, Object> map);
}
