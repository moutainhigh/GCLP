package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.FalseResponse;
import com.grape.controller.reponse.MortgagefilingResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.request.MortgagefilingRequest;
import com.grape.controller.request.MortgagefilingidRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.Loaninfo;
import com.grape.model.db.Mortgagefiling;
import com.grape.service.LoaninfoService;
import com.grape.service.MortgagefilingService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/mortgagefiling")
public class MortgagefilingController {
	@Autowired
	private MortgagefilingService mortgagefilingService;
	@Autowired
	private LoaninfoService loaninfoService;
	@ApiOperation(value="插入抵押物查档信息",notes="抵押物查档信息的第一个接口",response=FalseResponse.class,httpMethod="POST")
	@RequestMapping("insertMortgagefiling")
	public Response insertMortgagefiling(@RequestBody MortgagefilingRequest req){
		List<Codetable> codetable = mortgagefilingService.selectCodeofCom();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<codetable.size();i++){
			list.add(codetable.get(i).getCoddes());
		}
		String mortgageofcom = req.getMortgagecomorbank();
		if(!Util.isBlank(mortgageofcom)){
			if(!mortgageofcom.contains("银行") && !list.contains(mortgageofcom)){
				return new FalseResponse(false);
			}
		}
		Mortgagefiling mortgagefiling=mortgagefilingService.selectMortgageById(req);
		if(mortgagefiling!=null){
			mortgagefilingService.updateMortgagefiling(req);
		}else{
			mortgagefilingService.insertMortgagefiling(req);
		}
		return new FalseResponse(true);
	}
	
	@ApiOperation(value="根据id查询抵押物查档信息",notes="抵押物查档信息的第二个接口",response=MortgagefilingResponse.class,httpMethod="POST")
	@RequestMapping("selectMortgagefiling")
	public Response selectMortgagefiling(@RequestBody MortgagefilingidRequest req){
		Mortgagefiling mort = mortgagefilingService.selectMortgagefiling(req);
		Loaninfo loaninfo = loaninfoService.selectLoaninfoByMortgageid(req);
		if(mort!=null){
			return new MortgagefilingResponse(mort,loaninfo);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
}
