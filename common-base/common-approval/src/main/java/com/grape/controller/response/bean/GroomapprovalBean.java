package com.grape.controller.response.bean;

import java.util.List;

import com.grape.controller.bean.ImageBean1;
import com.grape.model.db.Groommortgage;
import com.grape.model.db.Paymentapplyinfo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GroomapprovalBean {
	private Paymentapplyinfo paymentapplyinfo;
	
	private List<Groommortgage> groommortgages;
	
	private List<ImageBean1> imagelist;
}
