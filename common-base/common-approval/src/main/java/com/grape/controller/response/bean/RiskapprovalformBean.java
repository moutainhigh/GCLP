package com.grape.controller.response.bean;

import java.util.List;

import com.grape.controller.bean.MortgagestateBean;
import com.grape.model.db.Riskapproval;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RiskapprovalformBean {
	private Riskapproval riskapproval;
	
	private List<MortgagestateBean> mortgagestates;
}
