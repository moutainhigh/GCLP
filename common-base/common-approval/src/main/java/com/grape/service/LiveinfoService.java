package com.grape.service;

import java.util.List;

import com.grape.model.db.Liveinfo;

public interface LiveinfoService {
	void insertLiveinfo(Liveinfo liveinfo) ;
	
	List<Liveinfo> selectByWorkid(String workid) ;
}
