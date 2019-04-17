package com.grape.model.mapper.external;

import com.grape.controller.response.bean.SmsparamByOptionBean;
import com.grape.model.db.Shufflingfigure;
import com.grape.model.db.Smsparam;
import com.grape.service.ShufflingService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShufflingExMapper {
    List<Shufflingfigure> queryShufflingByOption(Map<String, Object> map) ;

	Integer queryShufflingByOptionCount(Map<String, Object> map);
}
