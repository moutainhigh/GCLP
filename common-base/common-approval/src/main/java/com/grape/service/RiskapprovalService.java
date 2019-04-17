package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.RiskapprovalRequest;
import com.grape.controller.request.RiskapprovalformRequest;
import com.grape.model.db.Mortgagestate;
import com.grape.model.db.Riskapproval;
import com.grape.model.db.Riskapprovalform;

public interface RiskapprovalService {

	void insertRiskApproval(RiskapprovalRequest req, FlowHandleResponse res);

	void insertRiskApprovalform(RiskapprovalformRequest req, FlowHandleResponse res);

	List<Riskapproval> selectRiskapproval(String id);

	Riskapprovalform selectRiskapprovalform(String id);

	List<Mortgagestate> selectMortgagestateByLogid(String id);

}
