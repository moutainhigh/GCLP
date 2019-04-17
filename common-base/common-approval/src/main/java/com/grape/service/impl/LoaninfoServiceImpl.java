package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.AllLoaninfo;
import com.grape.controller.request.LoaninfoRequest;
import com.grape.controller.request.MortgagefilingidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Houseassess;
import com.grape.model.db.Loaninfo;
import com.grape.model.db.Product;
import com.grape.model.db.Redemptiontype;
import com.grape.model.db.RedemptiontypeExample;
import com.grape.model.mapper.base.LoaninfoMapper;
import com.grape.model.mapper.base.RedemptiontypeMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.LoaninfoService;

@Service
public class LoaninfoServiceImpl implements LoaninfoService{
	@Autowired
	private LoaninfoMapper loaninfoMapper;
	@Autowired
	private DoctaskExMapper doctaskExMapper;
	@Autowired
	private RedemptiontypeMapper redemptiontypeMapper ;

	/*@Autowired
	private OverdueService overdueService ;
*/

	@Override
	public Loaninfo queryLoaninfoByWorkid(LoaninfoRequest req) {
		return loaninfoMapper.selectByPrimaryKey(req.getWorkid());
	}
	@Override
	public AllLoaninfo queryAllLoaninfoByWorkid(WorkidRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", req.getWorkid());
		return doctaskExMapper.selectAllLoaninfo(map);
	}
	@Override
	public Loaninfo selectLoaninfoByMortgageid(MortgagefilingidRequest req) {
		
		return loaninfoMapper.selectByPrimaryKey(req.getMortgagefilingid());
	}
	
	@Override
	public List<Houseassess> selectHouseassess(WorkidRequest req) {
		
		return doctaskExMapper.selectHouseassess(req.getWorkid());
	}
	@Override
	public List<Redemptiontype> selectRedemptiontypebyWorkid(WorkidRequest req) {
		RedemptiontypeExample exam = new RedemptiontypeExample() ;
		exam.createCriteria().andWorkidEqualTo(req.getWorkid()) ;
		return redemptiontypeMapper.selectByExample(exam);
	}
	@Override
	public Product selectrepaymethodAndratetype(WorkidRequest req) {
		
		return doctaskExMapper.selectrepaymethodAndratetype(req);
	}

}