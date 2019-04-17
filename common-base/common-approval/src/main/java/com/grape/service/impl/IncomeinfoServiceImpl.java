package com.grape.service.impl;

import com.grape.controller.bean.Monthtotal;
import com.grape.controller.request.BnkIncomeRequest;
import com.grape.controller.request.IncomeinfoRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.*;
import com.grape.model.mapper.base.BnkincomeinfoMapper;
import com.grape.model.mapper.base.CustinfoMapper;
import com.grape.model.mapper.base.IncomeinfoMapper;
import com.grape.model.mapper.base.MortgagerentMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.service.IncomeinfoService;
import com.grape.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
@Service
public class IncomeinfoServiceImpl implements IncomeinfoService{
	private static Logger log = LoggerFactory.getLogger(IncomeinfoServiceImpl.class);
	@Autowired
	private BnkincomeinfoMapper bnkincomeinfoMapper;
	@Autowired
	private IncomeinfoMapper incomeinfoMapper;
	@Autowired
	private MortgagerentMapper mortgagerentMapper;
	@Autowired
	private CustinfoMapper custinfoMapper;
	@Autowired
	private DoctaskExMapper doctaskExMapper;
	@Override
	public Incomeinfo queryIncomeByWorkid(WorkidAndCerdidRequest req) {
		Incomeinfo page = incomeinfoMapper.selectByPrimaryKey(req.getWorkid(),req.getCerdid());
		return page;
	}

	@Override
	public void insertIncomeInfo(IncomeinfoRequest req) {
		Incomeinfo incomeinfo = new Incomeinfo();
		MortgagerentExample examples = new MortgagerentExample();
		examples.createCriteria().andCerdidEqualTo(req.getCerdid()).andWorkidEqualTo(req.getWorkid());
		List<Mortgagerent> mortrentlist=mortgagerentMapper.selectByExample(examples);
		if(!mortrentlist.isEmpty()){
			mortgagerentMapper.deleteByExample(examples);
		}
		List<Mortgagerent> mortlist = req.getMortgagelist();
		if(mortlist != null && !mortlist.isEmpty()) {
			for(Mortgagerent mort:mortlist){
				Mortgagerent mortgage = new Mortgagerent();
				mortgage.setId(Util.getID());
				mortgage.setCerdid(req.getCerdid());
				mortgage.setChgdt(new Date());
				mortgage.setMortgageid(mort.getMortgageid());
				mortgage.setMonthamount(mort.getMonthamount());
				mortgage.setWorkid(req.getWorkid());
				MortgagerentExample example = new MortgagerentExample();
				example.createCriteria().andCerdidEqualTo(req.getCerdid()).andWorkidEqualTo(req.getWorkid()).andMortgageidEqualTo(mort.getMortgageid());
				List<Mortgagerent> morts = mortgagerentMapper.selectByExample(example);
				if(!morts.isEmpty()){
					mortgagerentMapper.updateByPrimaryKeySelective(mortgage);
				}else{
					mortgagerentMapper.insertSelective(mortgage);
				}
		}		
		}
		BnkincomeinfoExample example = new BnkincomeinfoExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid()).andCerdidEqualTo(req.getCerdid());
		List<Bnkincomeinfo> lists = bnkincomeinfoMapper.selectByExample(example);
		if(lists != null && !lists.isEmpty()){
			bnkincomeinfoMapper.deleteByExample(example);
		}
		List<BnkIncomeRequest> list = req.getList();
		List<BigDecimal> totalamount = new ArrayList<BigDecimal>();
		if(list != null && !list.isEmpty()) {
			for(int j=0;j<list.size();j++){
				BigDecimal cardamount = new BigDecimal(0);
				BnkIncomeRequest bnk = list.get(j);
				String[] amounts = bnk.getAmount().split(",");
				Calendar cal = Calendar.getInstance();
				for(int i=0;i<amounts.length;i++){
					cal.add(cal.MONTH, -1);
					Bnkincomeinfo income = new Bnkincomeinfo();
					BigDecimal am = new BigDecimal(amounts[i]);
					cardamount=cardamount.add(am);
					/*bd+=Integer.parseInt(am.toString());*/
					//int idx = am.toString().lastIndexOf(".") ;
					//bd += Integer.parseInt(am.toString().substring(0 , idx)) ; 
					income.setAmount(am);
					income.setIncomedate(cal.getTime());
					income.setBnkname(bnk.getBnkname());
					income.setBanname2(bnk.getBanname2());
					income.setAmountsource(bnk.getAmountsource());
					income.setIncomeway(bnk.getIncomeway());
					income.setBnkaccount(bnk.getBnkaccount());
					income.setChgdt(new Date());
					income.setId(Util.getID());
					income.setCerdid(req.getCerdid());
					income.setWorkid(req.getWorkid());
					bnkincomeinfoMapper.insertSelective(income);
				}
				totalamount.add(cardamount);
			}
		}

		Incomeinfo info = incomeinfoMapper.selectByPrimaryKey(req.getWorkid(), req.getCerdid());
		if(info!=null){
			incomeinfoMapper.deleteByPrimaryKey(req.getWorkid(), req.getCerdid());
		}
		try {
			Util.transferFields(req, incomeinfo);
			incomeinfo.setChgdt(new Date());
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		BigDecimal maxamount = new BigDecimal(0);
		if(totalamount.size()>0){
			maxamount = Collections.max(totalamount);
		}
		Custinfo custinfo = new Custinfo();
		custinfo = custinfoMapper.selectByPrimaryKey(req.getWorkid(), req.getCerdid());
		String job = null;
		if(null != custinfo && !"".equals(custinfo)) {
			job = custinfo.getJob();
		}
		BigDecimal six = new BigDecimal(6);
		BigDecimal var2 = new BigDecimal(0.15);
		if("0".equals(job)){
			BigDecimal renttimeincome = maxamount.divide(six,2,BigDecimal.ROUND_HALF_UP);
			incomeinfo.setRentincome(renttimeincome);
		}else if("1".equals(job)){
			BigDecimal renttimeincome = maxamount.multiply(var2).divide(six,2,BigDecimal.ROUND_HALF_UP);
			incomeinfo.setRentincome(renttimeincome);
		}
		incomeinfoMapper.insertSelective(incomeinfo);
	}

	@Override
	public void updateincomeinfo(IncomeinfoRequest req) {
		Incomeinfo incomeinfo = new Incomeinfo();
		List<BnkIncomeRequest> list = req.getList();
		List<BigDecimal> totalamount = new ArrayList<BigDecimal>();
		for(int j=0;j<list.size();j++){
			BigDecimal cardamount = new BigDecimal(0);
			BnkIncomeRequest bnk = list.get(j);
			String[] amounts = bnk.getAmount().split(",");
			Calendar cal = Calendar.getInstance();
			for(int i=0;i<amounts.length;i++){
				cal.add(cal.MONTH, -1);
				Bnkincomeinfo income = new Bnkincomeinfo();
				BigDecimal am = new BigDecimal(amounts[i]);
				cardamount.add(am);
				income.setAmount(am);
				income.setIncomedate(cal.getTime());
				income.setBnkname(bnk.getBnkname());
				income.setBnkaccount(bnk.getBnkaccount());
				income.setChgdt(new Date());
				BnkincomeinfoExample example = new BnkincomeinfoExample();
				example.createCriteria().andWorkidEqualTo(req.getWorkid());
				List<Bnkincomeinfo> lists = bnkincomeinfoMapper.selectByExample(example);
				String id = lists.get(i).getId();
				income.setId(id);
				income.setWorkid(req.getWorkid());
				bnkincomeinfoMapper.updateByPrimaryKeySelective(income);
				
			}
		}
		try {
			Util.transferFields(req, incomeinfo);
		} catch (Exception e) {
			log.info("实体类转换出错",e);
		}
		incomeinfo.setChgdt(new Date());
		BigDecimal maxamount = new BigDecimal(0);
		if(totalamount.size()>0){
			maxamount = Collections.max(totalamount);
		}
		Custinfo custinfo = new Custinfo();
		custinfo = custinfoMapper.selectByPrimaryKey(req.getWorkid(), req.getCerdid());
		String job=custinfo.getJob();
		BigDecimal six = new BigDecimal(6);
		BigDecimal var2 = new BigDecimal(0.15);
		if("0".equals(job)){
			BigDecimal renttimeincome = maxamount.divide(six);
			incomeinfo.setRentincome(renttimeincome);
		}else if("1".equals(job)){
			BigDecimal renttimeincome = maxamount.multiply(var2).divide(six);
			incomeinfo.setRentincome(renttimeincome);
		}
		incomeinfoMapper.insertSelective(incomeinfo);
		incomeinfoMapper.updateByPrimaryKey(incomeinfo);
		
	}

	@Override
	public void deleteincomeinfo(WorkidAndCerdidRequest req) {
		incomeinfoMapper.deleteByPrimaryKey(req.getWorkid(),req.getCerdid());
	}

	@Override
	public List<Mortgagerent> selectMortRent(WorkidAndCerdidRequest req) {
		MortgagerentExample example = new MortgagerentExample();
		example.createCriteria().andCerdidEqualTo(req.getCerdid()).andWorkidEqualTo(req.getWorkid());
		return mortgagerentMapper.selectByExample(example);
	}

	@Override
	public List<Incomeinfo> queryInconeinfoByWorkid(String workid) {
		IncomeinfoExample example = new IncomeinfoExample() ;
		example.createCriteria().andWorkidEqualTo(workid) ;
		return incomeinfoMapper.selectByExample(example);
	}
	

	@Override
	public List<Mortgagerent> selectMortRentByWorkid(WorkidRequest req) {
		MortgagerentExample example = new MortgagerentExample();
		example.createCriteria().andWorkidEqualTo(req.getWorkid());
		List<Mortgagerent> list = mortgagerentMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Monthtotal> selectMonthtotal(String workid) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		List<Monthtotal> list = doctaskExMapper.selectIncomeinfo(map);
		return list;
	}

	@Override
	public Chanapprovalform selectIncomeNotation(String workid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workid", workid);
		return doctaskExMapper.selectIncomeNotation(map);
	}
}
