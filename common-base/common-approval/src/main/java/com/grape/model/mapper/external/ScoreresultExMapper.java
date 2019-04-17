package com.grape.model.mapper.external;

import org.apache.ibatis.annotations.Mapper;

import com.grape.controller.reponse.ScoreresultResponse;
import com.grape.controller.request.ScoreresultRequest;

@Mapper
public interface ScoreresultExMapper {
	ScoreresultResponse selectMax(ScoreresultRequest req) ;
}
