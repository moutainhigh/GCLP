package com.grape.service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.RefundfinanceRequest;
import com.grape.controller.request.RefundmentRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Refundfinance;
import com.grape.model.db.Refundment;

public interface RefundmentService {

	Refundment selectRfundmentByWorkid(WorkidRequest req);

	void insertRfundment(RefundmentRequest req);

	Refundment selectRfundmentByWorkid(String workid);

	void updateRefundinfo(RefundmentRequest req);

	String selectNameByCode(String receivables, String string);

	void insertRefundfinance(RefundfinanceRequest refundfinance, FlowHandleResponse res);

	Refundfinance selectrefundfinance(String id);

}
