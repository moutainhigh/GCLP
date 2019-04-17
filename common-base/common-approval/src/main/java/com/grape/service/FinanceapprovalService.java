package com.grape.service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.FinanceapprovalRequest;
import com.grape.model.db.Financeapproval;

public interface FinanceapprovalService {

	void insertFinanceapproval(FinanceapprovalRequest req, FlowHandleResponse res);

	Financeapproval selectFinanceapproval(String id);

}
