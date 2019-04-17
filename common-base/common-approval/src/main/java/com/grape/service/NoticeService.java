package com.grape.service;

import java.util.List;

import com.grape.controller.request.NoticeRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Mattersattention;

public interface NoticeService {

	public List<Mattersattention> queryByWorkid(WorkidRequest req);

	void insertNotice(NoticeRequest req);

}
