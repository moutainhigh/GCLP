package com.grape.service;

import com.grape.controller.reponse.ScoreresultResponse;
import com.grape.controller.request.ScoreresultRequest;
import com.grape.model.db.Scoreresult;

public interface ScoreresultService {
	ScoreresultResponse selectMax(ScoreresultRequest req) ;
}
