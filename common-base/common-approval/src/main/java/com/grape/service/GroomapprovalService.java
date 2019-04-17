package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.GroomapprovalRequest;
import com.grape.model.db.Groomapproval;
import com.grape.model.db.Groommortgage;

public interface GroomapprovalService {

	void insertGroomApproval(GroomapprovalRequest req,FlowHandleResponse res);

	Groomapproval selectgroomapprovalByLogid(String id);

	List<Groommortgage> selectgroommortgageByLogid(String id);

}
