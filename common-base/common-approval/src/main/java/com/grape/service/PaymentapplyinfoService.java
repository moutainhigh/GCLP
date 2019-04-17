package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.HaveBackProcRequest;
import com.grape.controller.request.PaymentapplyinfoRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.Paymentapplyinfo;

public interface PaymentapplyinfoService {

	void insertPaymentapplyinfo(PaymentapplyinfoRequest req, FlowHandleResponse res);

	Paymentapplyinfo selectPaymentapplyinfo(String workid);

	void updatePaymentapplyinfo(PaymentapplyinfoRequest req, FlowHandleResponse res);

	List<Groommortgage> selectGroommortgage(WorkidRequest req);

	void updatePayment(HaveBackProcRequest req);

}
