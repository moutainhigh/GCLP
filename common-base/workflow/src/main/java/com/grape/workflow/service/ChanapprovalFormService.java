package com.grape.workflow.service;

import java.util.List;

import com.grape.model.db.Chanapprovalform;

public interface ChanapprovalFormService {

	List<Chanapprovalform> selectChanapproval(String workid);

	String selectOrgofUserid(String userid);

}
