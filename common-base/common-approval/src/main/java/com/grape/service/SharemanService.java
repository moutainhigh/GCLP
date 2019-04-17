package com.grape.service;

import java.util.List;

import com.grape.controller.request.WorkidAndComnoRequest;
import com.grape.model.db.Shareman;

public interface SharemanService {

	List<Shareman> selectSharemanList(WorkidAndComnoRequest req);

	List<Shareman> selectSharemanList2(WorkidAndComnoRequest req);

}
