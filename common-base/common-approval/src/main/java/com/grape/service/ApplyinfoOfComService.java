package com.grape.service;

import java.util.List;

import com.grape.controller.request.ApplyinfoOfComRequest;
import com.grape.controller.request.Codflg;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidAndComnoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.Industry;

public interface ApplyinfoOfComService {

	List<Applyinfoofcom> queryByWorkid(String workid);

	void saveApplyinfoOfCom(ApplyinfoOfComRequest req);
	
	void insertApplyinfoOfCom(ApplyinfoOfComRequest req);

	void deleteApplyinfoOfCom(WorkidAndComnoRequest req);

	Applyinfoofcom queryByWorkidAndCredid(WorkidAndComnoRequest req);

	List<Applyinfoofcom> selectApplyinfoByWorkid(WorkidRequest req);

	Industry selectIndustry(Codflg req);

}
