package com.grape.service;

import com.grape.model.db.Postloaninfo;

public interface PostoverdueService {

	Postloaninfo selectByWorkid(String workid);

}
